package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f48347a;
    public final bn f48348b;
    public final org.telegram.messenger.gj f48349c;

    public he(bn bnVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f48347a = i7;
        this.f48348b = bnVar;
        this.f48349c = gjVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f48347a;
        bn bnVar = this.f48348b;
        org.telegram.messenger.gj gjVar = this.f48349c;
        switch (i13) {
            case 0:
                TLRPC.MessageMedia messageMedia = gjVar.f24177k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                        bnVar.createArticleViewer(false).L(gjVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                bnVar.getClass();
                TLRPC.Message message = gjVar.f24177k;
                int i14 = message.ttl;
                if (i14 != Integer.MAX_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i14;
                }
                message.destroyTime = bnVar.getConnectionsManager().getCurrentTime() + i7;
                gjVar.f24177k.destroyTimeMillis = bnVar.getConnectionsManager().getCurrentTimeMillis() + (i7 * 1000);
                if (bnVar.h != null) {
                    bnVar.getMessagesController().w3(bnVar.f46056l6, i7, gjVar.f24177k.random_id);
                    return;
                } else {
                    bnVar.getMessagesController().x3(bnVar.f46056l6, gjVar.e1(), null, i7, 0L, z10);
                    return;
                }
            case 2:
                int e12 = gjVar.e1();
                bn bnVar2 = this.f48348b;
                bnVar2.Bb(e12, 0, true, 0, true, 0, null, null, new vf(bnVar2, 11));
                if (bnVar2.f46234z6.isEmpty()) {
                    bnVar2.sc(false);
                    return;
                }
                return;
            case 3:
                bn bnVar3 = this.f48348b;
                bnVar3.getClass();
                int N1 = gjVar.N1();
                TLRPC.Message message2 = gjVar.f24177k;
                int i15 = message2.f28419id;
                if (org.telegram.messenger.gj.B0(message2) == bnVar3.f45952d7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                bnVar3.Bb(N1, i15, true, i10, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) gjVar.f24177k.action).answer.option, null);
                return;
            case 4:
                bn bnVar4 = this.f48348b;
                bnVar4.getClass();
                int N12 = gjVar.N1();
                TLRPC.Message message3 = gjVar.f24177k;
                int i16 = message3.f28419id;
                if (org.telegram.messenger.gj.B0(message3) == bnVar4.f45952d7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                bnVar4.Bb(N12, i16, true, i11, false, 0, null, null, null);
                return;
            case 5:
                bn bnVar5 = this.f48348b;
                bnVar5.getClass();
                int N13 = gjVar.N1();
                TLRPC.Message message4 = gjVar.f24177k;
                int i17 = message4.f28419id;
                if (org.telegram.messenger.gj.B0(message4) == bnVar5.f45952d7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                bnVar5.l(N13, i17, true, i12, false, 0);
                return;
            case 6:
                bnVar.getMessagesController().J3(bnVar.f45958e, bnVar.f45972f, gjVar.e1(), true, false, false);
                bnVar.P3 = null;
                return;
            case 7:
                if (org.telegram.messenger.gj.L4(gjVar.f24177k)) {
                    bnVar.Ka(null, gjVar);
                    return;
                } else {
                    MediaController.B().S(gjVar);
                    return;
                }
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                return;
        }
    }
}
