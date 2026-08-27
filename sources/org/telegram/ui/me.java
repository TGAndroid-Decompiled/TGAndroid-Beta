package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class me implements Runnable {

    public final int f40451a;

    public final rn f40452b;

    public final MessageObject f40453c;

    public me(rn rnVar, MessageObject messageObject, int i10) {
        this.f40451a = i10;
        this.f40452b = rnVar;
        this.f40453c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        switch (this.f40451a) {
            case 0:
                MessageObject messageObject = this.f40453c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                        this.f40452b.createArticleViewer(false).N(messageObject, null, null, null);
                    }
                    break;
                }
                break;
            case 1:
                rn rnVar = this.f40452b;
                rnVar.getClass();
                MessageObject messageObject2 = this.f40453c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = rnVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = rnVar.getConnectionsManager().getCurrentTimeMillis() + (((long) i11) * 1000);
                if (rnVar.h == null) {
                    rnVar.getMessagesController().markMessageAsRead2(rnVar.P5, messageObject2.getId(), null, i11, 0L, z10);
                } else {
                    rnVar.getMessagesController().markMessageAsRead(rnVar.P5, messageObject2.messageOwner.random_id, i11);
                }
                break;
            case 2:
                int id2 = this.f40453c.getId();
                rn rnVar2 = this.f40452b;
                rnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new lg(rnVar2, 13));
                if (rnVar2.f42019d6.isEmpty()) {
                    rnVar2.Lb(false);
                }
                break;
            case 3:
                rn rnVar3 = this.f40452b;
                rnVar3.getClass();
                MessageObject messageObject3 = this.f40453c;
                rnVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.f22401id, true, messageObject3.getDialogId() == rnVar3.H6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                rn rnVar4 = this.f40452b;
                rnVar4.getClass();
                MessageObject messageObject4 = this.f40453c;
                rnVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.f22401id, true, messageObject4.getDialogId() == rnVar4.H6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                rn rnVar5 = this.f40452b;
                rnVar5.getClass();
                MessageObject messageObject5 = this.f40453c;
                rnVar5.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.f22401id, true, messageObject5.getDialogId() == rnVar5.H6 ? 1 : 0, false, 0);
                break;
            case 6:
                rn rnVar6 = this.f40452b;
                rnVar6.getClass();
                MessageObject messageObject6 = this.f40453c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                } else {
                    rnVar6.ha(null, messageObject6);
                }
                break;
            case 7:
                rn rnVar7 = this.f40452b;
                rnVar7.getMessagesController().pinMessage(rnVar7.f42026e, rnVar7.f42039f, this.f40453c.getId(), true, false, false);
                rnVar7.f42255w3 = null;
                break;
            default:
                rn rnVar8 = this.f40452b;
                org.telegram.ui.Components.mc.a0(rnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f40453c;
                rnVar8.Fa(messageObject7);
                rnVar8.Ha(messageObject7);
                break;
        }
    }
}
