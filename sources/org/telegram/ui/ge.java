package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f45642a;
    public final wm f45643b;
    public final org.telegram.messenger.zi f45644c;

    public ge(wm wmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.f45642a = i3;
        this.f45643b = wmVar;
        this.f45644c = ziVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.f45642a;
        wm wmVar = this.f45643b;
        org.telegram.messenger.zi ziVar = this.f45644c;
        switch (i13) {
            case 0:
                TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                        wmVar.createArticleViewer(false).L(ziVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wmVar.getClass();
                TLRPC.Message message = ziVar.f26868k;
                int i14 = message.ttl;
                if (i14 != Integer.MAX_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 == Integer.MAX_VALUE) {
                    i3 = 0;
                } else {
                    i3 = i14;
                }
                message.destroyTime = wmVar.getConnectionsManager().getCurrentTime() + i3;
                ziVar.f26868k.destroyTimeMillis = wmVar.getConnectionsManager().getCurrentTimeMillis() + (i3 * 1000);
                if (wmVar.h != null) {
                    wmVar.getMessagesController().p3(wmVar.f51376k6, i3, ziVar.f26868k.random_id);
                    return;
                } else {
                    wmVar.getMessagesController().q3(wmVar.f51376k6, ziVar.f1(), null, i3, 0L, z10);
                    return;
                }
            case 2:
                int f12 = ziVar.f1();
                wm wmVar2 = this.f45643b;
                wmVar2.xb(f12, 0, true, 0, true, 0, null, null, new tf(wmVar2, 13));
                if (wmVar2.f51554y6.isEmpty()) {
                    wmVar2.oc(false);
                    return;
                }
                return;
            case 3:
                wm wmVar3 = this.f45643b;
                wmVar3.getClass();
                int O1 = ziVar.O1();
                TLRPC.Message message2 = ziVar.f26868k;
                int i15 = message2.f27022id;
                if (org.telegram.messenger.zi.B0(message2) == wmVar3.f51272c7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                wmVar3.xb(O1, i15, true, i10, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) ziVar.f26868k.action).answer.option, null);
                return;
            case 4:
                wm wmVar4 = this.f45643b;
                wmVar4.getClass();
                int O12 = ziVar.O1();
                TLRPC.Message message3 = ziVar.f26868k;
                int i16 = message3.f27022id;
                if (org.telegram.messenger.zi.B0(message3) == wmVar4.f51272c7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                wmVar4.xb(O12, i16, true, i11, false, 0, null, null, null);
                return;
            case 5:
                wm wmVar5 = this.f45643b;
                wmVar5.getClass();
                int O13 = ziVar.O1();
                TLRPC.Message message4 = ziVar.f26868k;
                int i17 = message4.f27022id;
                if (org.telegram.messenger.zi.B0(message4) == wmVar5.f51272c7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                wmVar5.l(O13, i17, true, i12, false, 0);
                return;
            case 6:
                if (org.telegram.messenger.zi.M4(ziVar.f26868k)) {
                    wmVar.Ha(null, ziVar);
                    return;
                } else {
                    MediaController.B().S(ziVar);
                    return;
                }
            case 7:
                wmVar.getMessagesController().C3(wmVar.f51292e, wmVar.f51306f, ziVar.f1(), true, false, false);
                wmVar.P3 = null;
                return;
            default:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                return;
        }
    }
}
