package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ld implements RequestDelegate {
    public final int f47576a;
    public final Object f47577b;
    public final Object f47578c;

    public ld(int i7, Object obj, Object obj2) {
        this.f47576a = i7;
        this.f47577b = obj;
        this.f47578c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f47576a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((zd) this.f47577b, tLObject, (Context) this.f47578c, 13));
                return;
            case 1:
                cn cnVar = (cn) this.f47577b;
                TLObject tLObject2 = (TLObject) this.f47578c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.g0.h3(new qe(cnVar, i7, 6));
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new o1((cn) this.f47577b, tLObject, (TLRPC.User) this.f47578c, 21));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new m6((cn) this.f47577b, tLObject, tL_error, (org.telegram.messenger.yr) this.f47578c, 8));
                return;
            case 4:
                cn cnVar2 = (cn) this.f47577b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f47578c;
                if (tL_error == null) {
                    cnVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new rf(9, cnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new rf(10, cnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.messenger.g0.h3(new o1((fl) this.f47577b, tLObject, (org.telegram.messenger.ij) this.f47578c, 23));
                return;
            case 6:
                rn rnVar = (rn) this.f47577b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f47578c;
                TLRPC.UserFull userFull = rnVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    rnVar.getMessagesStorage().j2(rnVar.D0, false);
                }
                org.telegram.messenger.g0.h3(new nn(rnVar, 2));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new rf(22, (uo) this.f47577b, (org.telegram.ui.ActionBar.u1[]) this.f47578c));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new m6((mp) this.f47577b, tL_error, tLObject, (TwoStepVerificationActivity) this.f47578c, 11));
                return;
            case 9:
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) this.f47577b;
                org.telegram.messenger.qs.f(e5Var.f33295e).d(new org.telegram.ui.Components.d5(e5Var, (ArrayList) this.f47578c, tLObject, 0));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.Components.b8) this.f47577b, (org.telegram.ui.ActionBar.u1) this.f47578c, tLObject, 26));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(15, (org.telegram.ui.Components.di) this.f47577b, (TLRPC.TL_attachMenuBot) this.f47578c));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(14, (org.telegram.ui.Components.di) this.f47577b, (org.telegram.ui.Components.wh) this.f47578c));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng((org.telegram.ui.Components.to) this.f47577b, tLObject, (org.telegram.ui.ActionBar.k6) this.f47578c, 2));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.fq(18, (org.telegram.ui.Components.wz) this.f47577b, (Pair) this.f47578c));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.wz) this.f47577b, tL_error, tLObject, (org.telegram.messenger.c20) this.f47578c, 21));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.i20) this.f47577b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f47578c, 23));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.r70) this.f47577b, (TLRPC.TL_chatInviteExported) this.f47578c, tL_error, tLObject, 25));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng((org.telegram.ui.Components.re0) this.f47577b, (org.telegram.ui.Components.qe0) this.f47578c, tLObject, 16));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.w80((org.telegram.ui.Components.no0) this.f47577b, tLObject, (Context) this.f47578c, 12));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((org.telegram.ui.Components.zv0) this.f47577b, tL_error, tLObject, (org.telegram.messenger.ui) this.f47578c, 1));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((ro0) this.f47577b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f47578c, 2));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((org.telegram.ui.Components.my0) this.f47577b, (org.telegram.ui.ActionBar.u1) this.f47578c, tLObject, tL_error, 3));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((org.telegram.ui.Components.l21) this.f47577b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f47578c, 5));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new tp((kx) this.f47577b, tLObject, (org.telegram.messenger.ij) this.f47578c, 4));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.m51(20, (gy) this.f47577b, (org.telegram.ui.ActionBar.u1) this.f47578c));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.m51(24, (iz) this.f47577b, (org.telegram.ui.ActionBar.u1) this.f47578c));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new tp((cz) this.f47577b, tL_error, (bz) this.f47578c, 8));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.m51(26, (FiltersSetupActivity) this.f47577b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f47578c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((n30) this.f47577b, tL_error, tLObject, (String) this.f47578c, 9));
                return;
        }
    }
}
