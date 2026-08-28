package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class me implements Runnable {
    public final int f40400a;
    public final qn f40401b;
    public final MessageObject f40402c;

    public me(qn qnVar, MessageObject messageObject, int i9) {
        this.f40400a = i9;
        this.f40401b = qnVar;
        this.f40402c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        switch (this.f40400a) {
            case 0:
                MessageObject messageObject = this.f40402c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                        this.f40401b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qn qnVar = this.f40401b;
                qnVar.getClass();
                MessageObject messageObject2 = this.f40402c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i13 = message.ttl;
                if (i13 != Integer.MAX_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 == Integer.MAX_VALUE) {
                    i9 = 0;
                } else {
                    i9 = i13;
                }
                message.destroyTime = qnVar.getConnectionsManager().getCurrentTime() + i9;
                messageObject2.messageOwner.destroyTimeMillis = qnVar.getConnectionsManager().getCurrentTimeMillis() + (i9 * 1000);
                if (qnVar.h != null) {
                    qnVar.getMessagesController().markMessageAsRead(qnVar.P5, messageObject2.messageOwner.random_id, i9);
                    return;
                } else {
                    qnVar.getMessagesController().markMessageAsRead2(qnVar.P5, messageObject2.getId(), null, i9, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f40402c.getId();
                qn qnVar2 = this.f40401b;
                qnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new jg(qnVar2, 13));
                if (qnVar2.f41884d6.isEmpty()) {
                    qnVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                qn qnVar3 = this.f40401b;
                qnVar3.getClass();
                MessageObject messageObject3 = this.f40402c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i14 = messageObject3.messageOwner.f22401id;
                if (messageObject3.getDialogId() == qnVar3.H6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                qnVar3.Xa(replyMsgId, i14, true, i10, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                qn qnVar4 = this.f40401b;
                qnVar4.getClass();
                MessageObject messageObject4 = this.f40402c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i15 = messageObject4.messageOwner.f22401id;
                if (messageObject4.getDialogId() == qnVar4.H6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                qnVar4.Xa(replyMsgId2, i15, true, i11, false, 0, null, null, null);
                return;
            case 5:
                qn qnVar5 = this.f40401b;
                qnVar5.getClass();
                MessageObject messageObject5 = this.f40402c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i16 = messageObject5.messageOwner.f22401id;
                if (messageObject5.getDialogId() == qnVar5.H6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                qnVar5.j(replyMsgId3, i16, true, i12, false, 0);
                return;
            case 6:
                qn qnVar6 = this.f40401b;
                qnVar6.getClass();
                MessageObject messageObject6 = this.f40402c;
                if (messageObject6.isVideo()) {
                    qnVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                qn qnVar7 = this.f40401b;
                qnVar7.getMessagesController().pinMessage(qnVar7.f41890e, qnVar7.f41903f, this.f40402c.getId(), true, false, false);
                qnVar7.f42117w3 = null;
                return;
            default:
                qn qnVar8 = this.f40401b;
                org.telegram.ui.Components.oc.a0(qnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f40402c;
                qnVar8.Fa(messageObject7);
                qnVar8.Ha(messageObject7);
                return;
        }
    }
}
