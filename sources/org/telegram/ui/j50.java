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
public final class j50 implements RequestDelegate {
    public final int f46838a;
    public final Object f46839b;
    public final Object f46840c;

    public j50(int i7, Object obj, Object obj2) {
        this.f46838a = i7;
        this.f46840c = obj;
        this.f46839b = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f46838a;
        Object obj = this.f46839b;
        Object obj2 = this.f46840c;
        switch (i7) {
            case 0:
                k50 k50Var = (k50) obj2;
                if (Objects.equals(k50Var.f47197a.f47468e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new s10(4, k50Var, tLObject));
                    return;
                }
                return;
            case 1:
                w50 w50Var = (w50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new tp(w50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new tp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.k6) obj, 18));
                return;
            case 3:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((org.telegram.ui.ActionBar.u1) obj2, tLObject, (g) obj, tL_error, 13));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new tp((r90) obj2, tLObject, (String) obj, 21));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new tp((o90) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((o90) obj2, tLObject, (HashSet) obj, tL_error, 15));
                return;
            case 7:
                ee0 ee0Var = (ee0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new tp(ee0Var, bundle, tLObject, 27));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new sa0(ee0Var, 2));
                    return;
                }
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((jc0) obj2, tLObject, (String) obj, tL_error, 18));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new oc0((id0) obj2, tL_error, (TL_account.confirmPhone) obj, 1));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new oc0((de0) obj2, tLObject, (HashMap) obj, 6));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((de0) obj2, tL_error, tLObject, (String) obj, 22));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new oc0((ch0) obj2, tLObject, (org.telegram.ui.Components.fx) obj, 9));
                return;
            case 13:
                hj0 hj0Var = (hj0) obj2;
                hj0Var.getClass();
                hj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 14:
                org.telegram.messenger.g0.h3(new oc0((zj0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                return;
            case 15:
                jl0 jl0Var = (jl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new bd0(25, jl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new mk0(jl0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 16:
                jl0 jl0Var2 = (jl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        org.telegram.messenger.c20 c20Var = jl0Var2.f47001c1;
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
                        jl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new bd0(26, jl0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new ik0(jl0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                l00 l00Var = jl0Var2.f47006e1;
                if (l00Var == null || !((Boolean) l00Var.a(tL_error)).booleanValue()) {
                    org.telegram.messenger.g0.h3(new oc0(jl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                    return;
                }
                return;
            case 17:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((jl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 26));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) ((js0) obj2), (Object) tL_error, tLObject, (Object) ((TL_stars.updatePaidMessagesPrice) obj), 1));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) ((PrivacyControlActivity) obj2), (Object) tL_error, tLObject, (Object) ((boolean[]) obj), 2));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new sn0(13, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.r8) obj));
                return;
            case 21:
                RectF rectF = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) ((ProfileActivity) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 6));
                return;
            case 22:
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new lo0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) tL_error, (Object) ((int[]) obj), 5));
                return;
            case 23:
                RectF rectF3 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new lo0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) ((TLRPC.TL_username) obj), (Object) tL_error, 8));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new lo0((ew0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 10));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new v21((w21) obj2, tL_error, (TLRPC.TL_authorization) obj, 0));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new v21((x21) obj2, tL_error, (TLRPC.TL_authorization) obj, 1));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new lo0((z21) obj2, tLObject, tL_error, (j9) obj, 13));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new ax0(10, (n31) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            default:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) ((n31) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 14));
                return;
        }
    }
}
