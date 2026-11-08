package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class h50 implements RequestDelegate {
    public final int f46222a;
    public final Object f46223b;
    public final Object f46224c;

    public h50(int i7, Object obj, Object obj2) {
        this.f46222a = i7;
        this.f46224c = obj;
        this.f46223b = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f46222a;
        Object obj = this.f46223b;
        Object obj2 = this.f46224c;
        switch (i7) {
            case 0:
                i50 i50Var = (i50) obj2;
                if (Objects.equals(i50Var.f46573a.f46848e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new q10(4, i50Var, tLObject));
                    return;
                }
                return;
            case 1:
                u50 u50Var = (u50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new rp(u50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new rp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 18));
                return;
            case 3:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.ActionBar.u1) obj2, tLObject, (g) obj, tL_error, 13));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new rp((p90) obj2, tLObject, (String) obj, 21));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new rp((m90) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((m90) obj2, tLObject, (HashSet) obj, tL_error, 15));
                return;
            case 7:
                ce0 ce0Var = (ce0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new rp(ce0Var, bundle, tLObject, 27));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new qa0(ce0Var, 2));
                    return;
                }
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((hc0) obj2, tLObject, (String) obj, tL_error, 18));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new mc0((gd0) obj2, tL_error, (TL_account.confirmPhone) obj, 1));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new mc0((be0) obj2, tLObject, (HashMap) obj, 6));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((be0) obj2, tL_error, tLObject, (String) obj, 22));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new mc0((ah0) obj2, tLObject, (org.telegram.ui.Components.fx) obj, 9));
                return;
            case 13:
                fj0 fj0Var = (fj0) obj2;
                fj0Var.getClass();
                fj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 14:
                org.telegram.messenger.g0.h3(new mc0((xj0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                return;
            case 15:
                hl0 hl0Var = (hl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new zc0(25, hl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new kk0(hl0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 16:
                hl0 hl0Var2 = (hl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        org.telegram.messenger.c20 c20Var = hl0Var2.f46413c1;
                        if (c20Var != null) {
                            c20Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                            return;
                        }
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.Update update = updates.updates.get(i10);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        hl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new zc0(26, hl0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new gk0(hl0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                j00 j00Var = hl0Var2.f46418e1;
                if (j00Var == null || !((Boolean) j00Var.a(tL_error)).booleanValue()) {
                    org.telegram.messenger.g0.h3(new mc0(hl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                    return;
                }
                return;
            case 17:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((hl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 26));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new jo0((org.telegram.ui.ActionBar.f2) ((hs0) obj2), (Object) tL_error, tLObject, (Object) ((TL_stars.updatePaidMessagesPrice) obj), 1));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new jo0((org.telegram.ui.ActionBar.f2) ((PrivacyControlActivity) obj2), (Object) tL_error, tLObject, (Object) ((boolean[]) obj), 2));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new qn0(13, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.r8) obj));
                return;
            case 21:
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new jo0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) tL_error, (Object) ((int[]) obj), 5));
                return;
            case 22:
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new jo0((org.telegram.ui.ActionBar.f2) ((ProfileActivity) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 8));
                return;
            case 23:
                RectF rectF3 = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new jo0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) ((TLRPC.TL_username) obj), (Object) tL_error, 7));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new jo0((cw0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 10));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new t21((u21) obj2, tL_error, (TLRPC.TL_authorization) obj, 0));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new t21((v21) obj2, tL_error, (TLRPC.TL_authorization) obj, 1));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new jo0((x21) obj2, tLObject, tL_error, (j9) obj, 13));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new by0(9, (m31) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            default:
                org.telegram.messenger.g0.h3(new jo0((org.telegram.ui.ActionBar.f2) ((m31) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 14));
                return;
        }
    }
}
