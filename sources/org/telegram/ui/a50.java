package org.telegram.ui;

import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class a50 implements RequestDelegate {
    public final int f35572a;
    public final Object f35573b;
    public final Object f35574c;

    public a50(int i10, Object obj, Object obj2) {
        this.f35572a = i10;
        this.f35574c = obj;
        this.f35573b = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35572a;
        Object obj = this.f35573b;
        Object obj2 = this.f35574c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((b50) obj2), tL_error, tLObject, (Object) ((String) obj), 14));
                return;
            case 1:
                a70 a70Var = (a70) obj2;
                if (Objects.equals(a70Var.f35583a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new ot(26, a70Var, tLObject));
                    return;
                }
                return;
            case 2:
                n70 n70Var = (n70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(n70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 18));
                return;
            case 4:
                Pattern pattern2 = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((org.telegram.ui.ActionBar.c2) obj2), tLObject, (Object) ((g) obj), tL_error, 18));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new lq((ob0) obj2, tLObject, (String) obj, 21));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new lq((lb0) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((lb0) obj2), tLObject, (Object) ((HashSet) obj), tL_error, 20));
                return;
            case 8:
                ig0 ig0Var = (ig0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new lq(ig0Var, bundle, tLObject, 26));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new tc0(ig0Var, 2));
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((me0) obj2), tLObject, (Object) ((String) obj), tL_error, 23));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new re0((mf0) obj2, tL_error, (TL_account.confirmPhone) obj, 1));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new re0((hg0) obj2, tLObject, (HashMap) obj, 6));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((hg0) obj2), tL_error, tLObject, (Object) ((String) obj), 27));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new re0((rj0) obj2, tLObject, (org.telegram.ui.Components.qy) obj, 9));
                return;
            case 14:
                cm0 cm0Var = (cm0) obj2;
                cm0Var.getClass();
                cm0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new re0((wm0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                return;
            case 16:
                io0 io0Var = (io0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new bh0(16, io0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new hn0(io0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 17:
                io0 io0Var2 = (io0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        Utilities.Callback callback = io0Var2.f38295c1;
                        if (callback != null) {
                            callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                            return;
                        }
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.Update update = updates.updates.get(i11);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        io0Var2.getMessagesController().lambda$processUpdates$377(updates, false);
                        AndroidUtilities.runOnUIThread(new bh0(17, io0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new bn0(io0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                x10 x10Var = io0Var2.f38299e1;
                if (x10Var == null || !((Boolean) x10Var.run(tL_error)).booleanValue()) {
                    AndroidUtilities.runOnUIThread(new re0(io0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                    return;
                }
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new jn0((io0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 1));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new jn0((bw0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 6));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new jn0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 7));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new mv0(5, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.w8) obj));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new jn0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 13));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new jn0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new jn0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new jn0((yz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 15));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new re0((g71) obj2, tL_error, (TLRPC.TL_authorization) obj, 29));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new h71((i71) obj2, tL_error, (TLRPC.TL_authorization) obj, 0));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new jn0((k71) obj2, tLObject, tL_error, (n9) obj, 18));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jn0((c81) obj2, tL_error, tLObject, (String) obj, 19));
                return;
        }
    }
}
