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
public final class e00 implements RequestDelegate {
    public final int f47021a;
    public final Object f47022b;
    public final Object f47023c;

    public e00(int i7, Object obj, Object obj2) {
        this.f47021a = i7;
        this.f47022b = obj;
        this.f47023c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f47021a;
        Object obj = this.f47023c;
        Object obj2 = this.f47022b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new vs(17, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((o30) obj2, tL_error, tLObject, (String) obj, 16));
                return;
            case 2:
                j50 j50Var = (j50) obj2;
                if (Objects.equals(j50Var.f48882a.f49158e, (String) obj)) {
                    org.telegram.messenger.g0.g3(new vs(25, j50Var, tLObject));
                    return;
                }
                return;
            case 3:
                v50 v50Var = (v50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.g3(new up(v50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new up((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.m6) obj, 18));
                return;
            case 5:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((Object) ((org.telegram.ui.ActionBar.u1) obj2), tLObject, (Object) ((g) obj), tL_error, 20));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new up((s90) obj2, tLObject, (String) obj, 21));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new up((p90) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((Object) ((p90) obj2), tLObject, (Object) ((HashSet) obj), tL_error, 22));
                return;
            case 9:
                ee0 ee0Var = (ee0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.g3(new up(ee0Var, bundle, tLObject, 27));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new ra0(ee0Var, 2));
                    return;
                }
            case 10:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((Object) ((hc0) obj2), tLObject, (Object) ((String) obj), tL_error, 25));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new mc0((hd0) obj2, tL_error, (TL_account.confirmPhone) obj, 1));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new mc0((de0) obj2, tLObject, (HashMap) obj, 6));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((de0) obj2, tL_error, tLObject, (String) obj, 29));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new mc0((fh0) obj2, tLObject, (org.telegram.ui.Components.ph) obj, 9));
                return;
            case 15:
                lj0 lj0Var = (lj0) obj2;
                lj0Var.getClass();
                lj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 16:
                org.telegram.messenger.g0.g3(new mc0((dk0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                return;
            case 17:
                ml0 ml0Var = (ml0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.g3(new we0(16, ml0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new qk0(ml0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 18:
                ml0 ml0Var2 = (ml0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        org.telegram.messenger.x10 x10Var = ml0Var2.f49863d1;
                        if (x10Var != null) {
                            x10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
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
                        ml0Var2.getMessagesController().V3(updates, false);
                        org.telegram.messenger.g0.g3(new we0(17, ml0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.g3(new lk0(ml0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                o00 o00Var = ml0Var2.f49869f1;
                if (o00Var == null || !((Boolean) o00Var.a(tL_error)).booleanValue()) {
                    org.telegram.messenger.g0.g3(new mc0(ml0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.g0.g3(new kg0((ml0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 3));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new kg0((is0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 8));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new kg0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 9));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new tr0(4, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.s8) obj));
                return;
            case 23:
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new kg0((org.telegram.messenger.fs) ((ProfileActivity) obj2), (Object) tL_error, (Object) tLObject, (String) obj, 13));
                return;
            case 24:
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new kg0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 12));
                return;
            case 25:
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new kg0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 15));
                return;
            case 26:
                org.telegram.messenger.g0.g3(new kg0((dw0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 17));
                return;
            case 27:
                org.telegram.messenger.g0.g3(new u21((v21) obj2, tL_error, (TLRPC.TL_authorization) obj, 0));
                return;
            case 28:
                org.telegram.messenger.g0.g3(new u21((w21) obj2, tL_error, (TLRPC.TL_authorization) obj, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new kg0((y21) obj2, tLObject, tL_error, (j9) obj, 20));
                return;
        }
    }
}
