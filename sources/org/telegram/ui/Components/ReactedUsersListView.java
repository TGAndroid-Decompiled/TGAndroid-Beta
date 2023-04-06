package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messagePeerReaction;
import org.telegram.tgnet.TLRPC$TL_messages_getMessageReactionsList;
import org.telegram.tgnet.TLRPC$TL_messages_messageReactionsList;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.ReactedHeaderView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
public class ReactedUsersListView extends FrameLayout {
    private RecyclerView.Adapter adapter;
    public boolean canLoadMore;
    private int currentAccount;
    ArrayList<TLRPC$InputStickerSet> customEmojiStickerSets;
    ArrayList<ReactionsLayoutInBubble.VisibleReaction> customReactionsEmoji;
    private TLRPC$Reaction filter;
    public boolean isLoaded;
    public boolean isLoading;
    public RecyclerListView listView;
    private FlickerLoadingView loadingView;
    private MessageObject message;
    MessageContainsEmojiButton messageContainsEmojiButton;
    private String offset;
    private OnCustomEmojiSelectedListener onCustomEmojiSelectedListener;
    private OnHeightChangedListener onHeightChangedListener;
    private OnProfileSelectedListener onProfileSelectedListener;
    private LongSparseArray<ArrayList<TLRPC$MessagePeerReaction>> peerReactionMap;
    private int predictiveCount;
    Theme.ResourcesProvider resourcesProvider;
    private List<TLRPC$MessagePeerReaction> userReactions;

    public interface OnCustomEmojiSelectedListener {
        void showCustomEmojiAlert(ReactedUsersListView reactedUsersListView, ArrayList<TLRPC$InputStickerSet> arrayList);
    }

    public interface OnHeightChangedListener {
        void onHeightChanged(ReactedUsersListView reactedUsersListView, int i);
    }

    public interface OnProfileSelectedListener {
        void onProfileSelected(ReactedUsersListView reactedUsersListView, long j, TLRPC$MessagePeerReaction tLRPC$MessagePeerReaction);
    }

    public ReactedUsersListView(final Context context, final Theme.ResourcesProvider resourcesProvider, final int i, MessageObject messageObject, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z) {
        super(context);
        TLRPC$Reaction tLRPC$Reaction;
        this.userReactions = new ArrayList();
        this.peerReactionMap = new LongSparseArray<>();
        this.canLoadMore = true;
        this.customReactionsEmoji = new ArrayList<>();
        this.customEmojiStickerSets = new ArrayList<>();
        this.currentAccount = i;
        this.message = messageObject;
        this.filter = tLRPC$ReactionCount == null ? null : tLRPC$ReactionCount.reaction;
        this.resourcesProvider = resourcesProvider;
        this.predictiveCount = tLRPC$ReactionCount == null ? 6 : tLRPC$ReactionCount.count;
        this.listView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public void onMeasure(int i2, int i3) {
                MessageContainsEmojiButton messageContainsEmojiButton = ReactedUsersListView.this.messageContainsEmojiButton;
                if (messageContainsEmojiButton != null) {
                    messageContainsEmojiButton.measure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0));
                }
                super.onMeasure(i2, i3);
                ReactedUsersListView.this.updateHeight();
            }
        };
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.listView.setLayoutManager(linearLayoutManager);
        if (z) {
            this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            this.listView.setClipToPadding(false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.listView.setVerticalScrollbarThumbDrawable(new ColorDrawable(Theme.getColor("listSelectorSDK21")));
        }
        RecyclerListView recyclerListView = this.listView;
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                FrameLayout reactedUserHolderView;
                if (i2 == 0) {
                    reactedUserHolderView = new ReactedUserHolderView(i, context);
                } else {
                    ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                    MessageContainsEmojiButton messageContainsEmojiButton = reactedUsersListView.messageContainsEmojiButton;
                    if (messageContainsEmojiButton == null) {
                        reactedUsersListView.updateCustomReactionsButton();
                    } else if (messageContainsEmojiButton.getParent() != null) {
                        ((ViewGroup) ReactedUsersListView.this.messageContainsEmojiButton.getParent()).removeView(ReactedUsersListView.this.messageContainsEmojiButton);
                    }
                    reactedUserHolderView = new FrameLayout(context);
                    View view = new View(context);
                    view.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuSeparator", resourcesProvider));
                    reactedUserHolderView.addView(view, LayoutHelper.createFrame(-1, 8.0f));
                    reactedUserHolderView.addView(ReactedUsersListView.this.messageContainsEmojiButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
                }
                return new RecyclerListView.Holder(reactedUserHolderView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                if (viewHolder.getItemViewType() == 0) {
                    ((ReactedUserHolderView) viewHolder.itemView).setUserReaction((TLRPC$MessagePeerReaction) ReactedUsersListView.this.userReactions.get(i2));
                }
            }

            @Override
            public int getItemCount() {
                return ReactedUsersListView.this.userReactions.size() + ((ReactedUsersListView.this.customReactionsEmoji.isEmpty() || MessagesController.getInstance(i).premiumLocked) ? 0 : 1);
            }

            @Override
            public int getItemViewType(int i2) {
                return i2 < ReactedUsersListView.this.userReactions.size() ? 0 : 1;
            }
        };
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ReactedUsersListView.this.lambda$new$0(view, i2);
            }
        });
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                if (!reactedUsersListView.isLoaded || !reactedUsersListView.canLoadMore || reactedUsersListView.isLoading || linearLayoutManager.findLastVisibleItemPosition() < (ReactedUsersListView.this.adapter.getItemCount() - 1) - ReactedUsersListView.this.getLoadCount()) {
                    return;
                }
                ReactedUsersListView.this.load();
            }
        });
        this.listView.setVerticalScrollBarEnabled(true);
        this.listView.setAlpha(0.0f);
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider) {
            @Override
            public int getAdditionalHeight() {
                MessageContainsEmojiButton messageContainsEmojiButton;
                if (ReactedUsersListView.this.customReactionsEmoji.isEmpty() || (messageContainsEmojiButton = ReactedUsersListView.this.messageContainsEmojiButton) == null) {
                    return 0;
                }
                return messageContainsEmojiButton.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            }
        };
        this.loadingView = flickerLoadingView;
        flickerLoadingView.setColors("actionBarDefaultSubmenuBackground", "listSelectorSDK21", null);
        this.loadingView.setIsSingleCell(true);
        this.loadingView.setItemsCount(this.predictiveCount);
        addView(this.loadingView, LayoutHelper.createFrame(-1, -1.0f));
        if (!z && (tLRPC$Reaction = this.filter) != null && (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && !MessagesController.getInstance(i).premiumLocked) {
            this.customReactionsEmoji.clear();
            this.customReactionsEmoji.add(ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(this.filter));
            updateCustomReactionsButton();
        }
        this.loadingView.setViewType(this.customReactionsEmoji.isEmpty() ? 16 : 23);
    }

    public void lambda$new$0(View view, int i) {
        OnCustomEmojiSelectedListener onCustomEmojiSelectedListener;
        int itemViewType = this.adapter.getItemViewType(i);
        if (itemViewType == 0) {
            OnProfileSelectedListener onProfileSelectedListener = this.onProfileSelectedListener;
            if (onProfileSelectedListener != null) {
                onProfileSelectedListener.onProfileSelected(this, MessageObject.getPeerId(this.userReactions.get(i).peer_id), this.userReactions.get(i));
            }
        } else if (itemViewType != 1 || (onCustomEmojiSelectedListener = this.onCustomEmojiSelectedListener) == null) {
        } else {
            onCustomEmojiSelectedListener.showCustomEmojiAlert(this, this.customEmojiStickerSets);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public ReactedUsersListView setSeenUsers(List<ReactedHeaderView.UserSeen> list) {
        List<TLRPC$MessagePeerReaction> list2 = this.userReactions;
        if (list2 != null && !list2.isEmpty()) {
            for (ReactedHeaderView.UserSeen userSeen : list) {
                TLRPC$User tLRPC$User = userSeen.user;
                if (tLRPC$User != null && userSeen.date > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= this.userReactions.size()) {
                            break;
                        }
                        TLRPC$MessagePeerReaction tLRPC$MessagePeerReaction = this.userReactions.get(i);
                        if (tLRPC$MessagePeerReaction != null && tLRPC$MessagePeerReaction.date <= 0 && tLRPC$MessagePeerReaction.peer_id.user_id == tLRPC$User.id) {
                            tLRPC$MessagePeerReaction.date = userSeen.date;
                            tLRPC$MessagePeerReaction.dateIsSeen = true;
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ReactedHeaderView.UserSeen userSeen2 : list) {
            if (this.peerReactionMap.get(userSeen2.user.id) == null) {
                TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction = new TLRPC$TL_messagePeerReaction();
                tLRPC$TL_messagePeerReaction.reaction = null;
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_messagePeerReaction.peer_id = tLRPC$TL_peerUser;
                tLRPC$TL_peerUser.user_id = userSeen2.user.id;
                tLRPC$TL_messagePeerReaction.date = userSeen2.date;
                tLRPC$TL_messagePeerReaction.dateIsSeen = true;
                ArrayList<TLRPC$MessagePeerReaction> arrayList2 = new ArrayList<>();
                arrayList2.add(tLRPC$TL_messagePeerReaction);
                this.peerReactionMap.put(MessageObject.getPeerId(tLRPC$TL_messagePeerReaction.peer_id), arrayList2);
                arrayList.add(tLRPC$TL_messagePeerReaction);
            }
        }
        this.userReactions.isEmpty();
        this.userReactions.addAll(arrayList);
        Collections.sort(this.userReactions, Comparator$CC.comparingInt(ReactedUsersListView$$ExternalSyntheticLambda3.INSTANCE));
        this.adapter.notifyDataSetChanged();
        updateHeight();
        return this;
    }

    public static int lambda$setSeenUsers$1(TLRPC$MessagePeerReaction tLRPC$MessagePeerReaction) {
        int i = tLRPC$MessagePeerReaction.date;
        if (i <= 0 || tLRPC$MessagePeerReaction.reaction != null) {
            return Integer.MIN_VALUE;
        }
        return -i;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLoaded || this.isLoading) {
            return;
        }
        load();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void load() {
        this.isLoading = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC$TL_messages_getMessageReactionsList tLRPC$TL_messages_getMessageReactionsList = new TLRPC$TL_messages_getMessageReactionsList();
        tLRPC$TL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(this.message.getDialogId());
        tLRPC$TL_messages_getMessageReactionsList.id = this.message.getId();
        tLRPC$TL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC$Reaction tLRPC$Reaction = this.filter;
        tLRPC$TL_messages_getMessageReactionsList.reaction = tLRPC$Reaction;
        String str = this.offset;
        tLRPC$TL_messages_getMessageReactionsList.offset = str;
        if (tLRPC$Reaction != null) {
            tLRPC$TL_messages_getMessageReactionsList.flags = 1 | tLRPC$TL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tLRPC$TL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getMessageReactionsList, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ReactedUsersListView.this.lambda$load$6(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$load$5(final TLObject tLObject) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                ReactedUsersListView.this.lambda$load$4(tLObject);
            }
        });
    }

    public void lambda$load$6(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ReactedUsersListView.this.lambda$load$5(tLObject);
            }
        });
    }

    public void lambda$load$4(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_messages_messageReactionsList) {
            TLRPC$TL_messages_messageReactionsList tLRPC$TL_messages_messageReactionsList = (TLRPC$TL_messages_messageReactionsList) tLObject;
            Iterator<TLRPC$User> it = tLRPC$TL_messages_messageReactionsList.users.iterator();
            while (it.hasNext()) {
                MessagesController.getInstance(this.currentAccount).putUser(it.next(), false);
            }
            HashSet hashSet = new HashSet();
            for (int i = 0; i < tLRPC$TL_messages_messageReactionsList.reactions.size(); i++) {
                this.userReactions.add(tLRPC$TL_messages_messageReactionsList.reactions.get(i));
                long peerId = MessageObject.getPeerId(tLRPC$TL_messages_messageReactionsList.reactions.get(i).peer_id);
                ArrayList<TLRPC$MessagePeerReaction> arrayList = this.peerReactionMap.get(peerId);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    if (arrayList.get(i2).reaction == null) {
                        arrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                ReactionsLayoutInBubble.VisibleReaction fromTLReaction = ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(tLRPC$TL_messages_messageReactionsList.reactions.get(i).reaction);
                if (fromTLReaction.documentId != 0) {
                    hashSet.add(fromTLReaction);
                }
                arrayList.add(tLRPC$TL_messages_messageReactionsList.reactions.get(i));
                this.peerReactionMap.put(peerId, arrayList);
            }
            if (this.filter == null) {
                this.customReactionsEmoji.clear();
                this.customReactionsEmoji.addAll(hashSet);
                updateCustomReactionsButton();
            }
            Collections.sort(this.userReactions, Comparator$CC.comparingInt(ReactedUsersListView$$ExternalSyntheticLambda4.INSTANCE));
            this.adapter.notifyDataSetChanged();
            if (!this.isLoaded) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ReactedUsersListView.this.lambda$load$3(valueAnimator);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ReactedUsersListView.this.loadingView.setVisibility(8);
                    }
                });
                duration.start();
                updateHeight();
                this.isLoaded = true;
            }
            String str = tLRPC$TL_messages_messageReactionsList.next_offset;
            this.offset = str;
            if (str == null) {
                this.canLoadMore = false;
            }
            this.isLoading = false;
            return;
        }
        this.isLoading = false;
    }

    public static int lambda$load$2(TLRPC$MessagePeerReaction tLRPC$MessagePeerReaction) {
        int i = tLRPC$MessagePeerReaction.date;
        if (i <= 0 || tLRPC$MessagePeerReaction.reaction != null) {
            return Integer.MIN_VALUE;
        }
        return -i;
    }

    public void lambda$load$3(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.listView.setAlpha(floatValue);
        this.loadingView.setAlpha(1.0f - floatValue);
    }

    public void updateCustomReactionsButton() {
        this.customEmojiStickerSets.clear();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.customReactionsEmoji.size(); i++) {
            TLRPC$InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(AnimatedEmojiDrawable.findDocument(this.currentAccount, this.customReactionsEmoji.get(i).documentId));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                arrayList.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.id));
            }
        }
        if (MessagesController.getInstance(this.currentAccount).premiumLocked) {
            return;
        }
        this.customEmojiStickerSets.addAll(arrayList);
        MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(this.currentAccount, getContext(), this.resourcesProvider, arrayList, 1);
        this.messageContainsEmojiButton = messageContainsEmojiButton;
        messageContainsEmojiButton.checkWidth = false;
    }

    public void updateHeight() {
        if (this.onHeightChangedListener != null) {
            int size = this.userReactions.size();
            if (size == 0) {
                size = this.predictiveCount;
            }
            int dp = AndroidUtilities.dp(size * 50);
            MessageContainsEmojiButton messageContainsEmojiButton = this.messageContainsEmojiButton;
            if (messageContainsEmojiButton != null) {
                dp += messageContainsEmojiButton.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            }
            if (this.listView.getMeasuredHeight() != 0) {
                dp = Math.min(this.listView.getMeasuredHeight(), dp);
            }
            this.onHeightChangedListener.onHeightChanged(this, dp);
        }
    }

    public int getLoadCount() {
        return this.filter == null ? 100 : 50;
    }

    private static final class ReactedUserHolderView extends FrameLayout {
        AvatarDrawable avatarDrawable;
        BackupImageView avatarView;
        int currentAccount;
        View overlaySelectorView;
        BackupImageView reactView;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable rightDrawable;
        SimpleTextView subtitleView;
        SimpleTextView titleView;
        private static final MessageSeenCheckDrawable seenDrawable = new MessageSeenCheckDrawable(R.drawable.msg_mini_checks, "windowBackgroundWhiteGrayText");
        private static final MessageSeenCheckDrawable reactDrawable = new MessageSeenCheckDrawable(R.drawable.msg_reactions, "windowBackgroundWhiteGrayText", 16, 16, 5.66f);

        ReactedUserHolderView(int i, Context context) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.currentAccount = i;
            setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(50.0f)));
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(34.0f));
            addView(this.avatarView, LayoutHelper.createFrameRelatively(34.0f, 34.0f, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(this, context) {
                @Override
                public boolean setText(CharSequence charSequence) {
                    return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(14.0f), false));
                }
            };
            this.titleView = simpleTextView;
            NotificationCenter.listenEmojiLoading(simpleTextView);
            this.titleView.setTextSize(16);
            this.titleView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            this.titleView.setEllipsizeByGradient(true);
            this.titleView.setImportantForAccessibility(2);
            this.titleView.setRightPadding(AndroidUtilities.dp(30.0f));
            this.titleView.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
            this.titleView.setRightDrawableOutside(true);
            addView(this.titleView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 55, 55.0f, 5.33f, 12.0f, 0.0f));
            this.rightDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(18.0f));
            this.titleView.setDrawablePadding(AndroidUtilities.dp(3.0f));
            this.titleView.setRightDrawable(this.rightDrawable);
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.subtitleView = simpleTextView2;
            simpleTextView2.setTextSize(13);
            this.subtitleView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            this.subtitleView.setEllipsizeByGradient(true);
            this.subtitleView.setImportantForAccessibility(2);
            this.subtitleView.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
            addView(this.subtitleView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 55, 55.0f, 19.0f, 20.0f, 0.0f));
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.reactView = backupImageView2;
            addView(backupImageView2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            this.overlaySelectorView = view;
            view.setBackground(Theme.getSelectorDrawable(false));
            addView(this.overlaySelectorView, LayoutHelper.createFrame(-1, -1.0f));
        }

        void setUserReaction(org.telegram.tgnet.TLRPC$MessagePeerReaction r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ReactedUsersListView.ReactedUserHolderView.setUserReaction(org.telegram.tgnet.TLRPC$MessagePeerReaction):void");
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.rightDrawable;
            if (swapAnimatedEmojiDrawable != null) {
                swapAnimatedEmojiDrawable.attach();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.rightDrawable;
            if (swapAnimatedEmojiDrawable != null) {
                swapAnimatedEmojiDrawable.detach();
            }
        }
    }

    public ReactedUsersListView setOnProfileSelectedListener(OnProfileSelectedListener onProfileSelectedListener) {
        this.onProfileSelectedListener = onProfileSelectedListener;
        return this;
    }

    public ReactedUsersListView setOnHeightChangedListener(OnHeightChangedListener onHeightChangedListener) {
        this.onHeightChangedListener = onHeightChangedListener;
        return this;
    }

    public void setPredictiveCount(int i) {
        this.predictiveCount = i;
        this.loadingView.setItemsCount(i);
    }

    public static class ContainerLinerLayout extends LinearLayout {
        public boolean hasHeader;

        public ContainerLinerLayout(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            RecyclerListView recyclerListView = null;
            if (this.hasHeader) {
                i3 = 0;
            } else {
                i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    if (getChildAt(i4) instanceof ReactedUsersListView) {
                        recyclerListView = ((ReactedUsersListView) getChildAt(i4)).listView;
                        if (recyclerListView.getAdapter().getItemCount() == recyclerListView.getChildCount()) {
                            int childCount = recyclerListView.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                recyclerListView.getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i2);
                                if (recyclerListView.getChildAt(i5).getMeasuredWidth() > i3) {
                                    i3 = recyclerListView.getChildAt(i5).getMeasuredWidth();
                                }
                            }
                            i3 += AndroidUtilities.dp(16.0f);
                        }
                    }
                }
            }
            int size = View.MeasureSpec.getSize(i);
            if (size < AndroidUtilities.dp(240.0f)) {
                size = AndroidUtilities.dp(240.0f);
            }
            if (size > AndroidUtilities.dp(280.0f)) {
                size = AndroidUtilities.dp(280.0f);
            }
            if (size < 0) {
                size = 0;
            }
            if (i3 == 0 || i3 >= size) {
                i3 = size;
            }
            if (recyclerListView != null) {
                for (int i6 = 0; i6 < recyclerListView.getChildCount(); i6++) {
                    recyclerListView.getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public ReactedUsersListView setOnCustomEmojiSelectedListener(OnCustomEmojiSelectedListener onCustomEmojiSelectedListener) {
        this.onCustomEmojiSelectedListener = onCustomEmojiSelectedListener;
        return this;
    }
}
