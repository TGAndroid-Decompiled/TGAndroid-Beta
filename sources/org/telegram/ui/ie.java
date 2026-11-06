package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ie implements Runnable {
    public final int f46655a;
    public final an f46656b;
    public final org.telegram.messenger.ij f46657c;

    public ie(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f46655a = i7;
        this.f46656b = anVar;
        this.f46657c = ijVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z9;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f46655a;
        an anVar = this.f46656b;
        org.telegram.messenger.ij ijVar = this.f46657c;
        switch (i13) {
            case 0:
                TLRPC.MessageMedia messageMedia = ijVar.f23244k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                        anVar.createArticleViewer(false).L(ijVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                anVar.getClass();
                TLRPC.Message message = ijVar.f23244k;
                int i14 = message.ttl;
                if (i14 != Integer.MAX_VALUE) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i14 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i14;
                }
                message.destroyTime = anVar.getConnectionsManager().getCurrentTime() + i7;
                ijVar.f23244k.destroyTimeMillis = anVar.getConnectionsManager().getCurrentTimeMillis() + (i7 * 1000);
                if (anVar.h != null) {
                    anVar.getMessagesController().p3(anVar.f43842j6, i7, ijVar.f23244k.random_id);
                    return;
                } else {
                    anVar.getMessagesController().q3(anVar.f43842j6, ijVar.f1(), null, i7, 0L, z9);
                    return;
                }
            case 2:
                int f12 = ijVar.f1();
                an anVar2 = this.f46656b;
                anVar2.xb(f12, 0, true, 0, true, 0, null, null, new xf(anVar2, 13));
                if (anVar2.f44018x6.isEmpty()) {
                    anVar2.oc(false);
                    return;
                }
                return;
            case 3:
                an anVar3 = this.f46656b;
                anVar3.getClass();
                int O1 = ijVar.O1();
                TLRPC.Message message2 = ijVar.f23244k;
                int i15 = message2.f26974id;
                if (org.telegram.messenger.ij.B0(message2) == anVar3.f43738b7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                anVar3.xb(O1, i15, true, i10, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) ijVar.f23244k.action).answer.option, null);
                return;
            case 4:
                an anVar4 = this.f46656b;
                anVar4.getClass();
                int O12 = ijVar.O1();
                TLRPC.Message message3 = ijVar.f23244k;
                int i16 = message3.f26974id;
                if (org.telegram.messenger.ij.B0(message3) == anVar4.f43738b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                anVar4.xb(O12, i16, true, i11, false, 0, null, null, null);
                return;
            case 5:
                an anVar5 = this.f46656b;
                anVar5.getClass();
                int O13 = ijVar.O1();
                TLRPC.Message message4 = ijVar.f23244k;
                int i17 = message4.f26974id;
                if (org.telegram.messenger.ij.B0(message4) == anVar5.f43738b7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                anVar5.l(O13, i17, true, i12, false, 0);
                return;
            case 6:
                if (org.telegram.messenger.ij.M4(ijVar.f23244k)) {
                    anVar.Ha(null, ijVar);
                    return;
                } else {
                    MediaController.B().S(ijVar);
                    return;
                }
            case 7:
                anVar.getMessagesController().C3(anVar.f43771e, anVar.f43785f, ijVar.f1(), true, false, false);
                anVar.O3 = null;
                return;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                return;
        }
    }
}
