package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ld implements RequestDelegate {
    public final int f47586a;
    public final Object f47587b;
    public final Object f47588c;

    public ld(int i7, Object obj, Object obj2) {
        this.f47586a = i7;
        this.f47587b = obj;
        this.f47588c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f47586a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((zd) this.f47587b, tLObject, (Context) this.f47588c, 13));
                return;
            case 1:
                cn cnVar = (cn) this.f47587b;
                TLObject tLObject2 = (TLObject) this.f47588c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.g0.h3(new re(cnVar, i7, 6));
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new o1((cn) this.f47587b, tLObject, (TLRPC.User) this.f47588c, 21));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new m6((cn) this.f47587b, tLObject, tL_error, (org.telegram.messenger.yr) this.f47588c, 8));
                return;
            case 4:
                cn cnVar2 = (cn) this.f47587b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f47588c;
                if (tL_error == null) {
                    cnVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new oe(10, cnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new oe(11, cnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.messenger.g0.h3(new o1((fl) this.f47587b, tLObject, (org.telegram.messenger.ij) this.f47588c, 23));
                return;
            case 6:
                rn rnVar = (rn) this.f47587b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f47588c;
                TLRPC.UserFull userFull = rnVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    rnVar.getMessagesStorage().j2(rnVar.D0, false);
                }
                org.telegram.messenger.g0.h3(new nn(rnVar, 2));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new oe(23, (uo) this.f47587b, (org.telegram.ui.ActionBar.u1[]) this.f47588c));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new m6((mp) this.f47587b, tL_error, tLObject, (TwoStepVerificationActivity) this.f47588c, 11));
                return;
            case 9:
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.f47587b;
                org.telegram.messenger.qs.f(d5Var.f32890e).d(new org.telegram.ui.Components.c5(d5Var, (ArrayList) this.f47588c, tLObject, 0));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.Components.a8) this.f47587b, (org.telegram.ui.ActionBar.u1) this.f47588c, tLObject, 26));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new fq(16, (org.telegram.ui.Components.ci) this.f47587b, (TLRPC.TL_attachMenuBot) this.f47588c));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new fq(15, (org.telegram.ui.Components.ci) this.f47587b, (org.telegram.ui.Components.vh) this.f47588c));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.mg((org.telegram.ui.Components.to) this.f47587b, tLObject, (org.telegram.ui.ActionBar.l6) this.f47588c, 2));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ro(19, (org.telegram.ui.Components.vz) this.f47587b, (Pair) this.f47588c));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.vz) this.f47587b, tL_error, tLObject, (org.telegram.messenger.c20) this.f47588c, 21));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.h20) this.f47587b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f47588c, 23));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.q70) this.f47587b, (TLRPC.TL_chatInviteExported) this.f47588c, tL_error, tLObject, 25));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.mg((org.telegram.ui.Components.qe0) this.f47587b, (org.telegram.ui.Components.pe0) this.f47588c, tLObject, 16));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r80((org.telegram.ui.Components.mo0) this.f47587b, tLObject, (Context) this.f47588c, 13));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.yv0) this.f47587b, tL_error, tLObject, (org.telegram.messenger.ui) this.f47588c, 1));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((so0) this.f47587b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f47588c, 2));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.ly0) this.f47587b, (org.telegram.ui.ActionBar.u1) this.f47588c, tLObject, tL_error, 3));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.k21) this.f47587b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f47588c, 5));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new tp((lx) this.f47587b, tLObject, (org.telegram.messenger.ij) this.f47588c, 4));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(21, (hy) this.f47587b, (org.telegram.ui.ActionBar.u1) this.f47588c));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(25, (jz) this.f47587b, (org.telegram.ui.ActionBar.u1) this.f47588c));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new tp((dz) this.f47587b, tL_error, (cz) this.f47588c, 8));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(27, (FiltersSetupActivity) this.f47587b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f47588c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((o30) this.f47587b, tL_error, tLObject, (String) this.f47588c, 9));
                return;
        }
    }
}
