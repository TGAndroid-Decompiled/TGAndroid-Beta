package org.telegram.ui.Components;

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
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda246;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda247;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda50;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class ReactedUsersListView extends FrameLayout {
    public final AnonymousClass2 adapter;
    public boolean canLoadMore;
    public final int currentAccount;
    public final ArrayList customEmojiStickerSets;
    public final ArrayList customReactionsEmoji;
    public final TLRPC.Reaction filter;
    public boolean isLoaded;
    public boolean isLoading;
    public final AnonymousClass1 listView;
    public final AnonymousClass4 loadingView;
    public final MessageObject message;
    public MessageContainsEmojiButton messageContainsEmojiButton;
    public String offset;
    public OnCustomEmojiSelectedListener onCustomEmojiSelectedListener;
    public OnHeightChangedListener onHeightChangedListener;
    public OnProfileSelectedListener onProfileSelectedListener;
    public OnProfileSelectedListener onProfileSelectedLongListener;
    public final LongSparseArray peerReactionMap;
    public int predictiveCount;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList userReactions;

    public final class AnonymousClass2 extends RecyclerView.Adapter {
        public final Context val$context;
        public final int val$currentAccount;
        public final Theme.ResourcesProvider val$resourcesProvider;
        public final boolean val$showReactionPreview;

        public AnonymousClass2(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            this.val$currentAccount = i;
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
            this.val$showReactionPreview = z;
        }

        @Override
        public final int getItemCount() {
            ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
            return reactedUsersListView.userReactions.size() + ((reactedUsersListView.customReactionsEmoji.isEmpty() || MessagesController.getInstance(this.val$currentAccount).premiumFeaturesBlocked()) ? 0 : 1);
        }

        @Override
        public final int getItemViewType(int i) {
            return i < ReactedUsersListView.this.userReactions.size() ? 0 : 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 0) {
                ((ReactedUserHolderView) viewHolder.itemView).setUserReaction((TLRPC.MessagePeerReaction) ReactedUsersListView.this.userReactions.get(i));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout reactedUserHolderView;
            if (i != 0) {
                ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                MessageContainsEmojiButton messageContainsEmojiButton = reactedUsersListView.messageContainsEmojiButton;
                if (messageContainsEmojiButton == null) {
                    reactedUsersListView.updateCustomReactionsButton();
                } else if (messageContainsEmojiButton.getParent() != null) {
                    ((ViewGroup) reactedUsersListView.messageContainsEmojiButton.getParent()).removeView(reactedUsersListView.messageContainsEmojiButton);
                }
                Context context = this.val$context;
                reactedUserHolderView = new FrameLayout(context);
                View view = new View(context);
                view.setBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.val$resourcesProvider)));
                reactedUserHolderView.addView(view, LayoutHelper.createFrame(8.0f, -1));
                reactedUserHolderView.addView(reactedUsersListView.messageContainsEmojiButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
            } else {
                reactedUserHolderView = new ReactedUserHolderView(0, this.val$currentAccount, this.val$context, this.val$resourcesProvider, true, this.val$showReactionPreview);
            }
            return new RecyclerListView.Holder(reactedUserHolderView);
        }
    }

    public final class ContainerLinerLayout extends LinearLayout {
        public boolean hasHeader;

        public ContainerLinerLayout(Context context) {
            super(context);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp;
            AnonymousClass1 anonymousClass1 = null;
            if (this.hasHeader) {
                iDp = 0;
            } else {
                iDp = 0;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    if (getChildAt(i3) instanceof ReactedUsersListView) {
                        anonymousClass1 = ((ReactedUsersListView) getChildAt(i3)).listView;
                        if (anonymousClass1.getAdapter().getItemCount() == anonymousClass1.getChildCount()) {
                            int childCount = anonymousClass1.getChildCount();
                            for (int i4 = 0; i4 < childCount; i4++) {
                                anonymousClass1.getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i2);
                                if (anonymousClass1.getChildAt(i4).getMeasuredWidth() > iDp) {
                                    iDp = anonymousClass1.getChildAt(i4).getMeasuredWidth();
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
            if (anonymousClass1 != null) {
                for (int i5 = 0; i5 < anonymousClass1.getChildCount(); i5++) {
                    anonymousClass1.getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), i2);
                }
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), i2);
        }
    }

    public interface OnCustomEmojiSelectedListener {
        void showCustomEmojiAlert(ArrayList arrayList);
    }

    public interface OnHeightChangedListener {
        void onHeightChanged(ReactedUsersListView reactedUsersListView, int i);
    }

    public interface OnProfileSelectedListener {
        void onProfileSelected(long j, TLRPC.MessagePeerReaction messagePeerReaction);
    }

    public ReactedUsersListView(Context context, Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z) {
        super(context);
        this.userReactions = new ArrayList();
        this.peerReactionMap = new LongSparseArray();
        this.canLoadMore = true;
        ArrayList arrayList = new ArrayList();
        this.customReactionsEmoji = arrayList;
        this.customEmojiStickerSets = new ArrayList();
        this.currentAccount = i;
        this.message = messageObject;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.filter = reaction;
        this.resourcesProvider = resourcesProvider;
        this.predictiveCount = reactionCount == null ? 6 : reactionCount.count;
        ?? r0 = new RecyclerListView(context, resourcesProvider) {
            @Override
            public final void onMeasure(int i2, int i3) {
                ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                MessageContainsEmojiButton messageContainsEmojiButton = reactedUsersListView.messageContainsEmojiButton;
                if (messageContainsEmojiButton != null) {
                    messageContainsEmojiButton.measure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0));
                }
                super.onMeasure(i2, i3);
                reactedUsersListView.updateHeight();
            }
        };
        this.listView = r0;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        r0.setLayoutManager(linearLayoutManager);
        if (Build.VERSION.SDK_INT >= 29) {
            r0.setVerticalScrollbarThumbDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_listSelector, false)));
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(i, context, resourcesProvider, z);
        this.adapter = anonymousClass2;
        r0.setAdapter(anonymousClass2);
        r0.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 24));
        r0.setOnItemLongClickListener(new ProfileGooeyView$$ExternalSyntheticLambda0(this, 20));
        r0.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                if (!reactedUsersListView.isLoaded || !reactedUsersListView.canLoadMore || reactedUsersListView.isLoading || linearLayoutManager.findLastVisibleItemPosition() < (reactedUsersListView.adapter.getItemCount() - 1) - reactedUsersListView.getLoadCount()) {
                    return;
                }
                reactedUsersListView.load();
            }
        });
        r0.setVerticalScrollBarEnabled(true);
        r0.setAlpha(0.0f);
        addView((View) r0, LayoutHelper.createFrame(-1.0f, -1));
        ?? r1 = new FlickerLoadingView(context, resourcesProvider) {
            @Override
            public final int getAdditionalHeight() {
                MessageContainsEmojiButton messageContainsEmojiButton;
                ReactedUsersListView reactedUsersListView = ReactedUsersListView.this;
                if (reactedUsersListView.customReactionsEmoji.isEmpty() || (messageContainsEmojiButton = reactedUsersListView.messageContainsEmojiButton) == null) {
                    return 0;
                }
                return AndroidUtilities.dp(8.0f) + messageContainsEmojiButton.getMeasuredHeight();
            }
        };
        this.loadingView = r1;
        int i2 = Theme.key_actionBarDefaultSubmenuBackground;
        int i3 = Theme.key_listSelector;
        r1.colorKey1 = i2;
        r1.colorKey2 = i3;
        r1.colorKey3 = -1;
        r1.invalidate();
        r1.setIsSingleCell(true);
        r1.setItemsCount(this.predictiveCount);
        addView((View) r1, LayoutHelper.createFrame(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
            updateCustomReactionsButton();
        }
        r1.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public int getLoadCount() {
        return this.filter == null ? 100 : 50;
    }

    public final void load() {
        this.isLoading = true;
        int i = this.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.message;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.id = messageObject.getId();
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
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new LinkManager$$ExternalSyntheticLambda3(this, 1), 64);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLoaded || this.isLoading) {
            return;
        }
        load();
    }

    public final void setOnCustomEmojiSelectedListener(ChatActivity$$ExternalSyntheticLambda50 chatActivity$$ExternalSyntheticLambda50) {
        this.onCustomEmojiSelectedListener = chatActivity$$ExternalSyntheticLambda50;
    }

    public final void setOnHeightChangedListener(ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda248) {
        this.onHeightChangedListener = chatActivity$$ExternalSyntheticLambda248;
    }

    public final void setOnProfileLongSelectedListener(ChatActivity$$ExternalSyntheticLambda247 chatActivity$$ExternalSyntheticLambda247) {
        this.onProfileSelectedLongListener = chatActivity$$ExternalSyntheticLambda247;
    }

    public final void setOnProfileSelectedListener(ChatActivity$$ExternalSyntheticLambda246 chatActivity$$ExternalSyntheticLambda246) {
        this.onProfileSelectedListener = chatActivity$$ExternalSyntheticLambda246;
    }

    public void setPredictiveCount(int i) {
        this.predictiveCount = i;
        setItemsCount(i);
    }

    public final void setSeenUsers(List list) {
        ArrayList arrayList = this.userReactions;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReactedHeaderView.UserSeen userSeen = (ReactedHeaderView.UserSeen) it.next();
                TLObject tLObject = userSeen.user;
                if (userSeen.date > 0) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i);
                        if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == userSeen.dialogId) {
                            messagePeerReaction.date = userSeen.date;
                            messagePeerReaction.dateIsSeen = true;
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ReactedHeaderView.UserSeen userSeen2 = (ReactedHeaderView.UserSeen) it2.next();
            LongSparseArray longSparseArray = this.peerReactionMap;
            if (((ArrayList) longSparseArray.get(userSeen2.dialogId)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                TLObject tLObject2 = userSeen2.user;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).id;
                }
                tL_messagePeerReaction.date = userSeen2.date;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(9)));
        this.adapter.mObservable.notifyChanged();
        updateHeight();
    }

    public final void updateCustomReactionsButton() {
        int i;
        ArrayList arrayList = this.customEmojiStickerSets;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.customReactionsEmoji;
            int size = arrayList3.size();
            i = this.currentAccount;
            if (i2 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(AnimatedEmojiDrawable.findDocument(i, ((ReactionsLayoutInBubble.VisibleReaction) arrayList3.get(i2)).documentId));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.id));
            }
            i2++;
        }
        if (MessagesController.getInstance(i).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(this.currentAccount, getContext(), this.resourcesProvider, arrayList2, 1);
        this.messageContainsEmojiButton = messageContainsEmojiButton;
        messageContainsEmojiButton.checkWidth = false;
    }

    public final void updateHeight() {
        if (this.onHeightChangedListener != null) {
            int size = this.userReactions.size();
            if (size == 0) {
                size = this.predictiveCount;
            }
            int iDp = AndroidUtilities.dp(size * 50);
            MessageContainsEmojiButton messageContainsEmojiButton = this.messageContainsEmojiButton;
            if (messageContainsEmojiButton != null) {
                iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(messageContainsEmojiButton.getMeasuredHeight(), 8.0f, iDp);
            }
            AnonymousClass1 anonymousClass1 = this.listView;
            if (anonymousClass1.getMeasuredHeight() != 0) {
                iDp = Math.min(anonymousClass1.getMeasuredHeight(), iDp);
            }
            this.onHeightChangedListener.onHeightChanged(this, iDp);
        }
    }
}
