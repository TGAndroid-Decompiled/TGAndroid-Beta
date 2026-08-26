package org.telegram.ui.Components.poll;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda1;

public final class RecentVotersCell$$ExternalSyntheticLambda2 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final RecentVotersCell.VotesList f$0;

    public RecentVotersCell$$ExternalSyntheticLambda2(RecentVotersCell.VotesList votesList, int i) {
        this.$r8$classId = i;
        this.f$0 = votesList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i = 0;
        RecentVotersCell.VotesList votesList = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = votesList.votes;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(votesList.currentAccount).getUserOrChat(peerDialogId);
                    int i2 = messagePeerVote.date;
                    GiftSheet$$ExternalSyntheticLambda1 giftSheet$$ExternalSyntheticLambda1 = new GiftSheet$$ExternalSyntheticLambda1(votesList, peerDialogId, 2);
                    int i3 = RecentVotersCell.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(RecentVotersCell.Factory.class);
                    uItemOfFactory.object = userOrChat;
                    uItemOfFactory.longValue = peerDialogId;
                    uItemOfFactory.intValue = i2;
                    uItemOfFactory.clickCallback = giftSheet$$ExternalSyntheticLambda1;
                    arrayList.add(uItemOfFactory);
                }
                if (!votesList.completed) {
                    if (!arrayList2.isEmpty()) {
                        int i4 = RecentVotersCell.FlickerFactory.$r8$clinit;
                        arrayList.add(UItem.ofFactory(RecentVotersCell.FlickerFactory.class));
                    } else {
                        int i5 = RecentVotersCell.FlickerFactory2.$r8$clinit;
                        arrayList.add(UItem.ofFactory(RecentVotersCell.FlickerFactory2.class));
                        arrayList.add(UItem.ofFactory(RecentVotersCell.FlickerFactory2.class));
                        arrayList.add(UItem.ofFactory(RecentVotersCell.FlickerFactory2.class));
                        arrayList.add(UItem.ofFactory(RecentVotersCell.FlickerFactory2.class));
                        arrayList.add(UItem.ofFactory(RecentVotersCell.FlickerFactory2.class));
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                votesList.loading = false;
                if (tL_messages_votesList == null) {
                    votesList.nextOffset = null;
                    votesList.completed = true;
                } else {
                    int i6 = votesList.currentAccount;
                    MessagesController.getInstance(i6).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i6).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    votesList.nextOffset = str;
                    votesList.completed = str == null;
                    votesList.votes.addAll(tL_messages_votesList.votes);
                    Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = votesList.onUpdate;
                    if (tooltip$$ExternalSyntheticLambda0 != null) {
                        tooltip$$ExternalSyntheticLambda0.run();
                    }
                }
                break;
        }
    }
}
