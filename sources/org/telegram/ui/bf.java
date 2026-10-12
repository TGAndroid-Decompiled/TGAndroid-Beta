package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f34526a;
    public final fo f34527b;
    public final MessageObject f34528c;

    public bf(fo foVar, MessageObject messageObject, int i10) {
        this.f34526a = i10;
        this.f34527b = foVar;
        this.f34528c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f34526a) {
            case 0:
                MessageObject messageObject = this.f34528c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f34527b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fo foVar = this.f34527b;
                foVar.getClass();
                MessageObject messageObject2 = this.f34528c;
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
                message.destroyTime = foVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = foVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (foVar.h != null) {
                    foVar.getMessagesController().markMessageAsRead(foVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    foVar.getMessagesController().markMessageAsRead2(foVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                fo foVar2 = this.f34527b;
                foVar2.getClass();
                MessageObject messageObject3 = this.f34528c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f19237id;
                if (messageObject3.getDialogId() == foVar2.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                foVar2.bb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                fo foVar3 = this.f34527b;
                foVar3.getClass();
                MessageObject messageObject4 = this.f34528c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f19237id;
                if (messageObject4.getDialogId() == foVar3.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                foVar3.bb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                fo foVar4 = this.f34527b;
                foVar4.getClass();
                MessageObject messageObject5 = this.f34528c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f19237id;
                if (messageObject5.getDialogId() == foVar4.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                foVar4.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 5:
                int id2 = this.f34528c.getId();
                fo foVar5 = this.f34527b;
                foVar5.bb(id2, 0, true, 0, true, 0, null, null, new wf(foVar5, 23));
                if (foVar5.f35966h6.isEmpty()) {
                    foVar5.Pb(false);
                    return;
                }
                return;
            case 6:
                fo foVar6 = this.f34527b;
                foVar6.getClass();
                MessageObject messageObject6 = this.f34528c;
                if (messageObject6.isVideo()) {
                    foVar6.ma(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                fo foVar7 = this.f34527b;
                foVar7.getMessagesController().pinMessage(foVar7.e, foVar7.f35935f, this.f34528c.getId(), true, false, false);
                foVar7.A3 = null;
                return;
            default:
                fo foVar8 = this.f34527b;
                org.telegram.ui.Components.zc.a0(foVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f34528c;
                foVar8.Ja(messageObject7);
                foVar8.La(messageObject7);
                return;
        }
    }
}
