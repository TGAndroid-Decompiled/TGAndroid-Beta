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
public final class b00 implements RequestDelegate {
    public final int f45547a;
    public final Object f45548b;
    public final Object f45549c;

    public b00(int i7, Object obj, Object obj2) {
        this.f45547a = i7;
        this.f45548b = obj;
        this.f45549c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f45547a;
        Object obj = this.f45549c;
        Object obj2 = this.f45548b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(22, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((l30) obj2, tL_error, tLObject, (String) obj, 13));
                return;
            case 2:
                h50 h50Var = (h50) obj2;
                if (Objects.equals(h50Var.f47603a.f47898e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new g50(0, h50Var, tLObject));
                    return;
                }
                return;
            case 3:
                t50 t50Var = (t50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new tp(t50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new tp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 18));
                return;
            case 5:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((org.telegram.ui.ActionBar.t1) obj2, tLObject, (g) obj, tL_error, 17));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new tp((q90) obj2, tLObject, (String) obj, 21));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new tp((n90) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((n90) obj2, tLObject, (HashSet) obj, tL_error, 19));
                return;
            case 9:
                ce0 ce0Var = (ce0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new tp(ce0Var, bundle, tLObject, 27));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new qa0(ce0Var, 2));
                    return;
                }
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((gc0) obj2, tLObject, (String) obj, tL_error, 22));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new lc0((ed0) obj2, tL_error, (TL_account.confirmPhone) obj, 1));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new lc0((be0) obj2, tLObject, (HashMap) obj, 6));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((be0) obj2, tL_error, tLObject, (String) obj, 26));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new lc0((bh0) obj2, tLObject, (org.telegram.ui.Components.gh) obj, 9));
                return;
            case 15:
                ij0 ij0Var = (ij0) obj2;
                ij0Var.getClass();
                ij0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 16:
                org.telegram.messenger.g0.h3(new lc0((ak0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                return;
            case 17:
                kl0 kl0Var = (kl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new jd0(21, kl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new nk0(kl0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 18:
                kl0 kl0Var2 = (kl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        org.telegram.messenger.z10 z10Var = kl0Var2.f48684d1;
                        if (z10Var != null) {
                            z10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
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
                        kl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new jd0(22, kl0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new ik0(kl0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                l00 l00Var = kl0Var2.f48690f1;
                if (l00Var == null || !((Boolean) l00Var.a(tL_error)).booleanValue()) {
                    org.telegram.messenger.g0.h3(new lc0(kl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.g0.h3(new ok0((Object) ((kl0) obj2), (Object) tLObject, (Object) tL_error, (Object) ((TL_account.getTmpPassword) obj), 0));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) ((es0) obj2), (Object) tL_error, tLObject, (Object) ((TL_stars.updatePaidMessagesPrice) obj), 5));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) ((PrivacyControlActivity) obj2), (Object) tL_error, tLObject, (Object) ((boolean[]) obj), 6));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new mp0(9, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.q8) obj));
                return;
            case 23:
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) ((ProfileActivity) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 10));
                return;
            case 24:
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new ok0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) tL_error, (Object) ((int[]) obj), 9));
                return;
            case 25:
                RectF rectF3 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new ok0((Object) ((ProfileActivity) obj2), tLObject, (Object) ((TLRPC.TL_username) obj), tL_error, 12));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new ok0((Object) ((bw0) obj2), tLObject, (Object) ((TLRPC.TL_username) obj), tL_error, 14));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new q21((r21) obj2, tL_error, (TLRPC.TL_authorization) obj, 0));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new q21((s21) obj2, tL_error, (TLRPC.TL_authorization) obj, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new ok0((u21) obj2, tLObject, tL_error, (j9) obj, 17));
                return;
        }
    }
}
