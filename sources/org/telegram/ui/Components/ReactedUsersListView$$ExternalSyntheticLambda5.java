package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.util.LongSparseArray;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class ReactedUsersListView$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ReactedUsersListView f$0;
    public final TLObject f$1;

    public ReactedUsersListView$$ExternalSyntheticLambda5(ReactedUsersListView reactedUsersListView, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = reactedUsersListView;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        TLObject tLObject = this.f$1;
        ReactedUsersListView reactedUsersListView = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                NotificationCenter.getInstance(reactedUsersListView.currentAccount).doOnIdle(new ReactedUsersListView$$ExternalSyntheticLambda5(reactedUsersListView, tLObject, i));
                break;
            default:
                reactedUsersListView.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
                    reactedUsersListView.isLoading = false;
                } else {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i2 = reactedUsersListView.currentAccount;
                    MessagesController.getInstance(i2).putUsers(tL_messages_messageReactionsList.users, false);
                    MessagesController.getInstance(i2).putChats(tL_messages_messageReactionsList.chats, false);
                    HashSet hashSet = new HashSet();
                    int i3 = 0;
                    while (true) {
                        int size = tL_messages_messageReactionsList.reactions.size();
                        ArrayList arrayList = reactedUsersListView.userReactions;
                        if (i3 >= size) {
                            if (reactedUsersListView.filter == null) {
                                ArrayList arrayList2 = reactedUsersListView.customReactionsEmoji;
                                arrayList2.clear();
                                arrayList2.addAll(hashSet);
                                reactedUsersListView.updateCustomReactionsButton();
                            }
                            Collections.sort(arrayList, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(10)));
                            reactedUsersListView.adapter.mObservable.notifyChanged();
                            if (!reactedUsersListView.isLoaded) {
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                duration.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(reactedUsersListView, 4));
                                duration.addListener(new ItemOptions.AnonymousClass3(reactedUsersListView, 22));
                                duration.start();
                                reactedUsersListView.updateHeight();
                                reactedUsersListView.isLoaded = true;
                            }
                            String str = tL_messages_messageReactionsList.next_offset;
                            reactedUsersListView.offset = str;
                            if (str == null) {
                                reactedUsersListView.canLoadMore = false;
                            }
                            reactedUsersListView.isLoading = false;
                        } else {
                            arrayList.add(tL_messages_messageReactionsList.reactions.get(i3));
                            long peerId = MessageObject.getPeerId(tL_messages_messageReactionsList.reactions.get(i3).peer_id);
                            LongSparseArray longSparseArray = reactedUsersListView.peerReactionMap;
                            ArrayList arrayList3 = (ArrayList) longSparseArray.get(peerId);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            int i4 = 0;
                            while (i4 < arrayList3.size()) {
                                if (((TLRPC.MessagePeerReaction) arrayList3.get(i4)).reaction == null) {
                                    arrayList3.remove(i4);
                                    i4--;
                                }
                                i4++;
                            }
                            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_messages_messageReactionsList.reactions.get(i3).reaction);
                            if (visibleReactionFromTL.documentId != 0) {
                                hashSet.add(visibleReactionFromTL);
                            }
                            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i3));
                            longSparseArray.put(peerId, arrayList3);
                            i3++;
                        }
                    }
                }
                break;
        }
    }
}
