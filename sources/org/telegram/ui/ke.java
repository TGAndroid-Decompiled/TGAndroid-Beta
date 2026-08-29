package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ke implements Runnable {
    public final int f39841a;
    public final tn f39842b;
    public final MessageObject f39843c;

    public ke(tn tnVar, MessageObject messageObject, int i10) {
        this.f39841a = i10;
        this.f39842b = tnVar;
        this.f39843c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f39841a) {
            case 0:
                MessageObject messageObject = this.f39843c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                        this.f39842b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                tn tnVar = this.f39842b;
                tnVar.getClass();
                MessageObject messageObject2 = this.f39843c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i14 = message.ttl;
                if (i14 != Integer.MAX_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 == Integer.MAX_VALUE) {
                    i10 = 0;
                } else {
                    i10 = i14;
                }
                message.destroyTime = tnVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = tnVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (tnVar.h != null) {
                    tnVar.getMessagesController().markMessageAsRead(tnVar.P5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    tnVar.getMessagesController().markMessageAsRead2(tnVar.P5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f39843c.getId();
                tn tnVar2 = this.f39842b;
                tnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ig(tnVar2, 13));
                if (tnVar2.f42781d6.isEmpty()) {
                    tnVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                tn tnVar3 = this.f39842b;
                tnVar3.getClass();
                MessageObject messageObject3 = this.f39843c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f22413id;
                if (messageObject3.getDialogId() == tnVar3.H6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                tnVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                tn tnVar4 = this.f39842b;
                tnVar4.getClass();
                MessageObject messageObject4 = this.f39843c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f22413id;
                if (messageObject4.getDialogId() == tnVar4.H6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                tnVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                tn tnVar5 = this.f39842b;
                tnVar5.getClass();
                MessageObject messageObject5 = this.f39843c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f22413id;
                if (messageObject5.getDialogId() == tnVar5.H6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                tnVar5.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 6:
                tn tnVar6 = this.f39842b;
                tnVar6.getClass();
                MessageObject messageObject6 = this.f39843c;
                if (messageObject6.isVideo()) {
                    tnVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                tn tnVar7 = this.f39842b;
                tnVar7.getMessagesController().pinMessage(tnVar7.f42787e, tnVar7.f42801f, this.f39843c.getId(), true, false, false);
                tnVar7.f43016w3 = null;
                return;
            default:
                tn tnVar8 = this.f39842b;
                org.telegram.ui.Components.tc.a0(tnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f39843c;
                tnVar8.Fa(messageObject7);
                tnVar8.Ha(messageObject7);
                return;
        }
    }
}
