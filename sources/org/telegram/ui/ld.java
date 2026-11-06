package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ld implements RequestDelegate {
    public final int f47514a;
    public final Object f47515b;
    public final Object f47516c;

    public ld(int i7, Object obj, Object obj2) {
        this.f47514a = i7;
        this.f47515b = obj;
        this.f47516c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f47514a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((zd) this.f47515b, tLObject, (Context) this.f47516c, 13));
                return;
            case 1:
                an anVar = (an) this.f47515b;
                TLObject tLObject2 = (TLObject) this.f47516c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.g0.h3(new qe(anVar, i7, 6));
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new o1((an) this.f47515b, tLObject, (TLRPC.User) this.f47516c, 21));
                return;
            case 3:
                an anVar2 = (an) this.f47515b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f47516c;
                if (tL_error == null) {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new qf(9, anVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new qf(10, anVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.messenger.g0.h3(new m6((an) this.f47515b, tLObject, tL_error, (org.telegram.messenger.yr) this.f47516c, 8));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new o1((dl) this.f47515b, tLObject, (org.telegram.messenger.ij) this.f47516c, 23));
                return;
            case 6:
                pn pnVar = (pn) this.f47515b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f47516c;
                TLRPC.UserFull userFull = pnVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    pnVar.getMessagesStorage().j2(pnVar.D0, false);
                }
                org.telegram.messenger.g0.h3(new ln(pnVar, 2));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new qf(22, (so) this.f47515b, (org.telegram.ui.ActionBar.u1[]) this.f47516c));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new m6((kp) this.f47515b, tL_error, tLObject, (TwoStepVerificationActivity) this.f47516c, 11));
                return;
            case 9:
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) this.f47515b;
                org.telegram.messenger.qs.f(e5Var.f33170e).d(new org.telegram.ui.Components.d5(e5Var, (ArrayList) this.f47516c, tLObject, 0));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.Components.b8) this.f47515b, (org.telegram.ui.ActionBar.u1) this.f47516c, tLObject, 26));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(15, (org.telegram.ui.Components.di) this.f47515b, (TLRPC.TL_attachMenuBot) this.f47516c));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(14, (org.telegram.ui.Components.di) this.f47515b, (org.telegram.ui.Components.wh) this.f47516c));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng((org.telegram.ui.Components.to) this.f47515b, tLObject, (org.telegram.ui.ActionBar.j6) this.f47516c, 2));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.fq(18, (org.telegram.ui.Components.vz) this.f47515b, (Pair) this.f47516c));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.vz) this.f47515b, tL_error, tLObject, (org.telegram.messenger.c20) this.f47516c, 21));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.h20) this.f47515b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f47516c, 23));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.q70) this.f47515b, (TLRPC.TL_chatInviteExported) this.f47516c, tL_error, tLObject, 25));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng((org.telegram.ui.Components.qe0) this.f47515b, (org.telegram.ui.Components.pe0) this.f47516c, tLObject, 16));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v80((org.telegram.ui.Components.mo0) this.f47515b, tLObject, (Context) this.f47516c, 12));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.yv0) this.f47515b, tL_error, tLObject, (org.telegram.messenger.ui) this.f47516c, 1));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((po0) this.f47515b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f47516c, 2));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.ly0) this.f47515b, (org.telegram.ui.ActionBar.u1) this.f47516c, tLObject, tL_error, 3));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.k21) this.f47515b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f47516c, 5));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new rp((ix) this.f47515b, tLObject, (org.telegram.messenger.ij) this.f47516c, 4));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(20, (ey) this.f47515b, (org.telegram.ui.ActionBar.u1) this.f47516c));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(24, (gz) this.f47515b, (org.telegram.ui.ActionBar.u1) this.f47516c));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new rp((az) this.f47515b, tL_error, (zy) this.f47516c, 8));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(26, (FiltersSetupActivity) this.f47515b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f47516c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((l30) this.f47515b, tL_error, tLObject, (String) this.f47516c, 9));
                return;
        }
    }
}
