package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ie implements Runnable {
    public final int f46653a;
    public final cn f46654b;
    public final org.telegram.messenger.ij f46655c;

    public ie(cn cnVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f46653a = i7;
        this.f46654b = cnVar;
        this.f46655c = ijVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z9;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f46653a;
        cn cnVar = this.f46654b;
        org.telegram.messenger.ij ijVar = this.f46655c;
        switch (i13) {
            case 0:
                TLRPC.MessageMedia messageMedia = ijVar.f23262k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                        cnVar.createArticleViewer(false).L(ijVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cnVar.getClass();
                TLRPC.Message message = ijVar.f23262k;
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
                message.destroyTime = cnVar.getConnectionsManager().getCurrentTime() + i7;
                ijVar.f23262k.destroyTimeMillis = cnVar.getConnectionsManager().getCurrentTimeMillis() + (i7 * 1000);
                if (cnVar.h != null) {
                    cnVar.getMessagesController().p3(cnVar.f44504j6, i7, ijVar.f23262k.random_id);
                    return;
                } else {
                    cnVar.getMessagesController().q3(cnVar.f44504j6, ijVar.e1(), null, i7, 0L, z9);
                    return;
                }
            case 2:
                int e12 = ijVar.e1();
                cn cnVar2 = this.f46654b;
                cnVar2.Ab(e12, 0, true, 0, true, 0, null, null, new xf(cnVar2, 12));
                if (cnVar2.f44681x6.isEmpty()) {
                    cnVar2.rc(false);
                    return;
                }
                return;
            case 3:
                cn cnVar3 = this.f46654b;
                cnVar3.getClass();
                int N1 = ijVar.N1();
                TLRPC.Message message2 = ijVar.f23262k;
                int i15 = message2.f26977id;
                if (org.telegram.messenger.ij.B0(message2) == cnVar3.f44399b7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                cnVar3.Ab(N1, i15, true, i10, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) ijVar.f23262k.action).answer.option, null);
                return;
            case 4:
                cn cnVar4 = this.f46654b;
                cnVar4.getClass();
                int N12 = ijVar.N1();
                TLRPC.Message message3 = ijVar.f23262k;
                int i16 = message3.f26977id;
                if (org.telegram.messenger.ij.B0(message3) == cnVar4.f44399b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                cnVar4.Ab(N12, i16, true, i11, false, 0, null, null, null);
                return;
            case 5:
                cn cnVar5 = this.f46654b;
                cnVar5.getClass();
                int N13 = ijVar.N1();
                TLRPC.Message message4 = ijVar.f23262k;
                int i17 = message4.f26977id;
                if (org.telegram.messenger.ij.B0(message4) == cnVar5.f44399b7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                cnVar5.l(N13, i17, true, i12, false, 0);
                return;
            case 6:
                if (org.telegram.messenger.ij.L4(ijVar.f23262k)) {
                    cnVar.Ja(null, ijVar);
                    return;
                } else {
                    MediaController.B().S(ijVar);
                    return;
                }
            case 7:
                cnVar.getMessagesController().C3(cnVar.f44432e, cnVar.f44446f, ijVar.e1(), true, false, false);
                cnVar.O3 = null;
                return;
            default:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
        }
    }
}
