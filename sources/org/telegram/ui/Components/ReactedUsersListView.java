package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public class ReactedUsersListView extends FrameLayout {
    private static final int CUSTOM_EMOJI_VIEW_TYPE = 1;
    public static final int ITEM_HEIGHT_DP = 50;
    private static final int USER_VIEW_TYPE = 0;
    public static final int VISIBLE_ITEMS = 6;
    private RecyclerView.Adapter adapter;
    public boolean canLoadMore;
    private int currentAccount;
    ArrayList<TLRPC.InputStickerSet> customEmojiStickerSets;
    ArrayList<ReactionsLayoutInBubble.VisibleReaction> customReactionsEmoji;
    private TLRPC.Reaction filter;
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
    private OnProfileSelectedListener onProfileSelectedLongListener;
    private boolean onlySeenNow;
    private LongSparseArray<ArrayList<TLRPC.MessagePeerReaction>> peerReactionMap;
    private int predictiveCount;
    Theme.ResourcesProvider resourcesProvider;
    private boolean showReactionPreview;
    private List<TLRPC.MessagePeerReaction> userReactions;

    public static class ContainerLinerLayout extends LinearLayout {
        public boolean hasHeader;

        public ContainerLinerLayout(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iDp;
            RecyclerListView recyclerListView = null;
            if (this.hasHeader) {
                iDp = 0;
            } else {
                iDp = 0;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    if (getChildAt(i3) instanceof ReactedUsersListView) {
                        recyclerListView = ((ReactedUsersListView) getChildAt(i3)).listView;
                        if (recyclerListView.getAdapter().getItemCount() == recyclerListView.getChildCount()) {
                            int childCount = recyclerListView.getChildCount();
                            for (int i4 = 0; i4 < childCount; i4++) {
                                recyclerListView.getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i2);
                                if (recyclerListView.getChildAt(i4).getMeasuredWidth() > iDp) {
                                    iDp = recyclerListView.getChildAt(i4).getMeasuredWidth();
                                }
                            }
                            iDp += AndroidUtilities.dp(16.0f);
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
            if (iDp == 0 || iDp >= size) {
                iDp = size;
            }
            if (recyclerListView != null) {
                for (int i5 = 0; i5 < recyclerListView.getChildCount(); i5++) {
                    recyclerListView.getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), i2);
                }
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), i2);
        }
    }

    public interface OnCustomEmojiSelectedListener {
        void showCustomEmojiAlert(ReactedUsersListView reactedUsersListView, ArrayList<TLRPC.InputStickerSet> arrayList);
    }

    public interface OnHeightChangedListener {
        void onHeightChanged(ReactedUsersListView reactedUsersListView, int i);
    }

    public interface OnProfileSelectedListener {
        void onProfileSelected(ReactedUsersListView reactedUsersListView, long j, TLRPC.MessagePeerReaction messagePeerReaction);
    }

    public ReactedUsersListView(final Context context, final Theme.ResourcesProvider resourcesProvider, final int i, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z, final boolean z2) {
        TLRPC.Reaction reaction;
        super(context);
        this.userReactions = new ArrayList();
        this.peerReactionMap = new LongSparseArray<>();
        this.canLoadMore = true;
        this.customReactionsEmoji = new ArrayList<>();
        this.customEmojiStickerSets = new ArrayList<>();
        this.currentAccount = i;
        this.message = messageObject;
        this.filter = reactionCount == null ? null : reactionCount.reaction;
        this.resourcesProvider = resourcesProvider;
        this.showReactionPreview = z2;
        this.predictiveCount = reactionCount == null ? 6 : reactionCount.count;
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
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.listView.setLayoutManager(linearLayoutManager);
        if (z) {
            this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            this.listView.setClipToPadding(false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.listView.setVerticalScrollbarThumbDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_listSelector, false)));
        }
        RecyclerListView recyclerListView = this.listView;
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public int getItemCount() {
                return ReactedUsersListView.this.userReactions.size() + ((ReactedUsersListView.this.customReactionsEmoji.isEmpty() || MessagesController.getInstance(i).premiumFeaturesBlocked()) ? 0 : 1);
            }

            @Override
            public int getItemViewType(int i2) {
                return i2 < ReactedUsersListView.this.userReactions.size() ? 0 : 1;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                if (viewHolder.getItemViewType() == 0) {
                    ((ReactedUserHolderView) viewHolder.itemView).setUserReaction((TLRPC.MessagePeerReaction) ReactedUsersListView.this.userReactions.get(i2));
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                FrameLayout reactedUserHolderView;
                if (i2 != 0) {
                    ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                    MessageContainsEmojiButton messageContainsEmojiButton = reactedUsersListView.messageContainsEmojiButton;
                    if (messageContainsEmojiButton == null) {
                        reactedUsersListView.updateCustomReactionsButton();
                    } else if (messageContainsEmojiButton.getParent() != null) {
                        ((ViewGroup) ReactedUsersListView.this.messageContainsEmojiButton.getParent()).removeView(ReactedUsersListView.this.messageContainsEmojiButton);
                    }
                    reactedUserHolderView = new FrameLayout(context);
                    View view = new View(context);
                    view.setBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider)));
                    reactedUserHolderView.addView(view, LayoutHelper.createFrame(-1, 8.0f));
                    reactedUserHolderView.addView(ReactedUsersListView.this.messageContainsEmojiButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
                } else {
                    reactedUserHolderView = new ReactedUserHolderView(0, i, context, resourcesProvider, true, z2);
                }
                return new RecyclerListView.Holder(reactedUserHolderView);
            }
        };
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.listView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 11));
        this.listView.setOnItemLongClickListener(new ColorPicker$$ExternalSyntheticLambda5(this, 12));
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
                return AndroidUtilities.dp(8.0f) + messageContainsEmojiButton.getMeasuredHeight();
            }
        };
        this.loadingView = flickerLoadingView;
        flickerLoadingView.setColors(Theme.key_actionBarDefaultSubmenuBackground, Theme.key_listSelector, -1);
        this.loadingView.setIsSingleCell(true);
        this.loadingView.setItemsCount(this.predictiveCount);
        addView(this.loadingView, LayoutHelper.createFrame(-1, -1.0f));
        if (!z && (reaction = this.filter) != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i).premiumFeaturesBlocked()) {
            this.customReactionsEmoji.clear();
            this.customReactionsEmoji.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(this.filter));
            updateCustomReactionsButton();
        }
        this.loadingView.setViewType(this.customReactionsEmoji.isEmpty() ? 16 : 23);
    }

    public int getLoadCount() {
        return this.filter == null ? 100 : 50;
    }

    public static int lambda$load$3(TLRPC.MessagePeerReaction messagePeerReaction) {
        int i = messagePeerReaction.date;
        if (i <= 0 || messagePeerReaction.reaction != null) {
            return Integer.MIN_VALUE;
        }
        return -i;
    }

    public void lambda$load$4(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.listView.setAlpha(fFloatValue);
        this.loadingView.setAlpha(1.0f - fFloatValue);
    }

    public void lambda$load$5(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            this.isLoading = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_messageReactionsList.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i = 0; i < tL_messages_messageReactionsList.reactions.size(); i++) {
            this.userReactions.add(tL_messages_messageReactionsList.reactions.get(i));
            long peerId = MessageObject.getPeerId(tL_messages_messageReactionsList.reactions.get(i).peer_id);
            ArrayList<TLRPC.MessagePeerReaction> arrayList = this.peerReactionMap.get(peerId);
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
            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_messages_messageReactionsList.reactions.get(i).reaction);
            if (visibleReactionFromTL.documentId != 0) {
                hashSet.add(visibleReactionFromTL);
            }
            arrayList.add(tL_messages_messageReactionsList.reactions.get(i));
            this.peerReactionMap.put(peerId, arrayList);
        }
        if (this.filter == null) {
            this.customReactionsEmoji.clear();
            this.customReactionsEmoji.addAll(hashSet);
            updateCustomReactionsButton();
        }
        Collections.sort(this.userReactions, Comparator$CC.comparingInt(new MarkdownParser$$ExternalSyntheticLambda0(4)));
        this.adapter.notifyDataSetChanged();
        if (!this.isLoaded) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 17));
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
        String str = tL_messages_messageReactionsList.next_offset;
        this.offset = str;
        if (str == null) {
            this.canLoadMore = false;
        }
        this.isLoading = false;
    }

    public void lambda$load$6(TLObject tLObject) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ReactedUsersListView$$ExternalSyntheticLambda1(this, tLObject, 1));
    }

    public void lambda$load$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ReactedUsersListView$$ExternalSyntheticLambda1(this, tLObject, 0));
    }

    public void lambda$new$0(View view, int i) {
        OnCustomEmojiSelectedListener onCustomEmojiSelectedListener;
        int itemViewType = this.adapter.getItemViewType(i);
        if (itemViewType == 0) {
            OnProfileSelectedListener onProfileSelectedListener = this.onProfileSelectedListener;
            if (onProfileSelectedListener != null) {
                onProfileSelectedListener.onProfileSelected(this, MessageObject.getPeerId(this.userReactions.get(i).peer_id), this.userReactions.get(i));
                return;
            }
            return;
        }
        if (itemViewType != 1 || (onCustomEmojiSelectedListener = this.onCustomEmojiSelectedListener) == null) {
            return;
        }
        onCustomEmojiSelectedListener.showCustomEmojiAlert(this, this.customEmojiStickerSets);
    }

    public boolean lambda$new$1(View view, int i) {
        OnProfileSelectedListener onProfileSelectedListener;
        if (this.adapter.getItemViewType(i) != 0 || (onProfileSelectedListener = this.onProfileSelectedLongListener) == null) {
            return true;
        }
        onProfileSelectedListener.onProfileSelected(this, MessageObject.getPeerId(this.userReactions.get(i).peer_id), this.userReactions.get(i));
        return true;
    }

    public static int lambda$setSeenUsers$2(TLRPC.MessagePeerReaction messagePeerReaction) {
        int i = messagePeerReaction.date;
        if (i <= 0 || messagePeerReaction.reaction != null) {
            return Integer.MIN_VALUE;
        }
        return -i;
    }

    public void load() {
        this.isLoading = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(this.message.getDialogId());
        tL_messages_getMessageReactionsList.id = this.message.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.filter;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.offset;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessageReactionsList, new UndoView$$ExternalSyntheticLambda0(this, 14), 64);
    }

    public void updateCustomReactionsButton() {
        this.customEmojiStickerSets.clear();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.customReactionsEmoji.size(); i++) {
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(AnimatedEmojiDrawable.findDocument(this.currentAccount, this.customReactionsEmoji.get(i).documentId));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                arrayList.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.id));
            }
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
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
            int iDp = AndroidUtilities.dp(size * 50);
            MessageContainsEmojiButton messageContainsEmojiButton = this.messageContainsEmojiButton;
            if (messageContainsEmojiButton != null) {
                iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, messageContainsEmojiButton.getMeasuredHeight(), iDp);
            }
            if (this.listView.getMeasuredHeight() != 0) {
                iDp = Math.min(this.listView.getMeasuredHeight(), iDp);
            }
            this.onHeightChangedListener.onHeightChanged(this, iDp);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLoaded || this.isLoading) {
            return;
        }
        load();
    }

    public ReactedUsersListView setOnCustomEmojiSelectedListener(OnCustomEmojiSelectedListener onCustomEmojiSelectedListener) {
        this.onCustomEmojiSelectedListener = onCustomEmojiSelectedListener;
        return this;
    }

    public ReactedUsersListView setOnHeightChangedListener(OnHeightChangedListener onHeightChangedListener) {
        this.onHeightChangedListener = onHeightChangedListener;
        return this;
    }

    public ReactedUsersListView setOnProfileLongSelectedListener(OnProfileSelectedListener onProfileSelectedListener) {
        this.onProfileSelectedLongListener = onProfileSelectedListener;
        return this;
    }

    public ReactedUsersListView setOnProfileSelectedListener(OnProfileSelectedListener onProfileSelectedListener) {
        this.onProfileSelectedListener = onProfileSelectedListener;
        return this;
    }

    public void setPredictiveCount(int i) {
        this.predictiveCount = i;
        this.loadingView.setItemsCount(i);
    }

    public ReactedUsersListView setSeenUsers(List<ReactedHeaderView.UserSeen> list) {
        List<TLRPC.MessagePeerReaction> list2 = this.userReactions;
        if (list2 != null && !list2.isEmpty()) {
            for (ReactedHeaderView.UserSeen userSeen : list) {
                if (userSeen.user != null && userSeen.date > 0) {
                    for (int i = 0; i < this.userReactions.size(); i++) {
                        TLRPC.MessagePeerReaction messagePeerReaction = this.userReactions.get(i);
                        if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == userSeen.dialogId) {
                            messagePeerReaction.date = userSeen.date;
                            messagePeerReaction.dateIsSeen = true;
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ReactedHeaderView.UserSeen userSeen2 : list) {
            if (this.peerReactionMap.get(userSeen2.dialogId) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                TLObject tLObject = userSeen2.user;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) userSeen2.user).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) userSeen2.user).id;
                }
                tL_messagePeerReaction.date = userSeen2.date;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList<TLRPC.MessagePeerReaction> arrayList2 = new ArrayList<>();
                arrayList2.add(tL_messagePeerReaction);
                this.peerReactionMap.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList2);
                arrayList.add(tL_messagePeerReaction);
            }
        }
        if (this.userReactions.isEmpty()) {
            this.onlySeenNow = true;
        }
        this.userReactions.addAll(arrayList);
        Collections.sort(this.userReactions, Comparator$CC.comparingInt(new MarkdownParser$$ExternalSyntheticLambda0(3)));
        this.adapter.notifyDataSetChanged();
        updateHeight();
        return this;
    }
}
