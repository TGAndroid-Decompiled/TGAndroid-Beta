package org.telegram.ui.ActionBar;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.e7;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.z7;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ez;
import org.telegram.ui.fx;
import org.telegram.ui.go0;
import org.telegram.ui.hn;
import org.telegram.ui.i8;
import org.telegram.ui.ip;
import org.telegram.ui.ln;
import org.telegram.ui.lo;
import org.telegram.ui.nc;
import org.telegram.ui.ne;
import org.telegram.ui.pp;
import org.telegram.ui.qo;
import org.telegram.ui.sc;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
import org.telegram.ui.zk;
import org.telegram.ui.zx;
public final class h6 implements RequestDelegate {
    public final int f27583a;
    public final Object f27584b;
    public final Object f27585c;

    public h6(int i3, Object obj, Object obj2) {
        this.f27583a = i3;
        this.f27584b = obj;
        this.f27585c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        switch (this.f27583a) {
            case 0:
                org.telegram.messenger.g0.h3(new lg.y((j6) this.f27584b, tLObject, (j6) this.f27585c, 25));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o4.b1((i8) this.f27584b, tL_error, tLObject, (Calendar) this.f27585c, 8));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((nc) this.f27585c, tLObject, (j6) this.f27584b, 10));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((xd) this.f27584b, tLObject, (Context) this.f27585c, 13));
                return;
            case 4:
                wm wmVar = (wm) this.f27584b;
                TLObject tLObject2 = (TLObject) this.f27585c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i3 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i3 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.g0.h3(new ne(wmVar, i3, 6));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((wm) this.f27584b, tLObject, (TLRPC.User) this.f27585c, 21));
                return;
            case 6:
                wm wmVar2 = (wm) this.f27584b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f27585c;
                if (tL_error == null) {
                    wmVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new sc(14, wmVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new sc(15, wmVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.messenger.g0.h3(new o4.b1((wm) this.f27584b, tLObject, tL_error, (qr) this.f27585c, 14));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((zk) this.f27584b, tLObject, (zi) this.f27585c, 23));
                return;
            case 9:
                ln lnVar = (ln) this.f27584b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f27585c;
                TLRPC.UserFull userFull = lnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    lnVar.getMessagesStorage().j2(lnVar.E0, false);
                }
                org.telegram.messenger.g0.h3(new hn(lnVar, 2));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new sc(27, (qo) this.f27584b, (s1[]) this.f27585c));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new o4.b1((ip) this.f27584b, tL_error, tLObject, (TwoStepVerificationActivity) this.f27585c, 17));
                return;
            case 12:
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) this.f27584b;
                hs.f(c5Var.f32564e).d(new org.telegram.ui.Components.b5(c5Var, (ArrayList) this.f27585c, tLObject, 0));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new e7((z7) this.f27584b, (s1) this.f27585c, tLObject, 0));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new lo(20, (bi) this.f27584b, (TLRPC.TL_attachMenuBot) this.f27585c));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new lo(19, (bi) this.f27584b, (uh) this.f27585c));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new e7((Object) ((to) this.f27585c), tLObject, (Object) ((j6) this.f27584b), 6));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new cl(23, (rz) this.f27584b, (Pair) this.f27585c));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new o4.b1((rz) this.f27584b, tL_error, tLObject, (u10) this.f27585c, 27));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new o4.b1((d20) this.f27584b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f27585c, 29));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new v60((m70) this.f27584b, (TLRPC.TL_chatInviteExported) this.f27585c, tL_error, tLObject));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new e7((se0) this.f27584b, (re0) this.f27585c, tLObject, 20));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new j50((oo0) this.f27584b, tLObject, (Context) this.f27585c, 17));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new v60((xv0) this.f27584b, tL_error, tLObject, (li) this.f27585c, 7));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new v60((go0) this.f27584b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f27585c, 8));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new v60((Object) ((ky0) this.f27584b), (Object) ((s1) this.f27585c), (Object) tLObject, tL_error, 9));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new v60((f21) this.f27584b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f27585c, 11));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new pp((fx) this.f27584b, tLObject, (zi) this.f27585c, 4));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new p11(25, (zx) this.f27584b, (s1) this.f27585c));
                return;
            default:
                org.telegram.messenger.g0.h3(new p11(29, (ez) this.f27584b, (s1) this.f27585c));
                return;
        }
    }

    public h6(Object obj, j6 j6Var, int i3) {
        this.f27583a = i3;
        this.f27585c = obj;
        this.f27584b = j6Var;
    }
}
