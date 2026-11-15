package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class fe implements Runnable {
    public final int f47110a;
    public final an f47111b;
    public final org.telegram.messenger.gj f47112c;

    public fe(an anVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f47110a = i7;
        this.f47111b = anVar;
        this.f47112c = gjVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f47110a;
        an anVar = this.f47111b;
        org.telegram.messenger.gj gjVar = this.f47112c;
        switch (i13) {
            case 0:
                TLRPC.MessageMedia messageMedia = gjVar.f23819k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                        anVar.createArticleViewer(false).L(gjVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                anVar.getClass();
                TLRPC.Message message = gjVar.f23819k;
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
                message.destroyTime = anVar.getConnectionsManager().getCurrentTime() + i7;
                gjVar.f23819k.destroyTimeMillis = anVar.getConnectionsManager().getCurrentTimeMillis() + (i7 * 1000);
                if (anVar.h != null) {
                    anVar.getMessagesController().p3(anVar.f45258k6, i7, gjVar.f23819k.random_id);
                    return;
                } else {
                    anVar.getMessagesController().q3(anVar.f45258k6, gjVar.e1(), null, i7, 0L, z10);
                    return;
                }
            case 2:
                int e12 = gjVar.e1();
                an anVar2 = this.f47111b;
                anVar2.Bb(e12, 0, true, 0, true, 0, null, null, new uf(anVar2, 12));
                if (anVar2.f45435y6.isEmpty()) {
                    anVar2.sc(false);
                    return;
                }
                return;
            case 3:
                an anVar3 = this.f47111b;
                anVar3.getClass();
                int N1 = gjVar.N1();
                TLRPC.Message message2 = gjVar.f23819k;
                int i15 = message2.f28072id;
                if (org.telegram.messenger.gj.B0(message2) == anVar3.f45153c7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                anVar3.Bb(N1, i15, true, i10, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) gjVar.f23819k.action).answer.option, null);
                return;
            case 4:
                an anVar4 = this.f47111b;
                anVar4.getClass();
                int N12 = gjVar.N1();
                TLRPC.Message message3 = gjVar.f23819k;
                int i16 = message3.f28072id;
                if (org.telegram.messenger.gj.B0(message3) == anVar4.f45153c7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                anVar4.Bb(N12, i16, true, i11, false, 0, null, null, null);
                return;
            case 5:
                an anVar5 = this.f47111b;
                anVar5.getClass();
                int N13 = gjVar.N1();
                TLRPC.Message message4 = gjVar.f23819k;
                int i17 = message4.f28072id;
                if (org.telegram.messenger.gj.B0(message4) == anVar5.f45153c7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                anVar5.l(N13, i17, true, i12, false, 0);
                return;
            case 6:
                anVar.getMessagesController().C3(anVar.f45172e, anVar.f45186f, gjVar.e1(), true, false, false);
                anVar.P3 = null;
                return;
            case 7:
                if (org.telegram.messenger.gj.L4(gjVar.f23819k)) {
                    anVar.Ka(null, gjVar);
                    return;
                } else {
                    MediaController.B().S(gjVar);
                    return;
                }
            default:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                return;
        }
    }
}
