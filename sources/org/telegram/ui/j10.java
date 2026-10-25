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
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class j10 implements RequestDelegate {
    public final int f40386a;
    public final Object f40387b;
    public final Object f40388c;

    public j10(int i10, Object obj, Object obj2) {
        this.f40386a = i10;
        this.f40387b = obj;
        this.f40388c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40386a;
        Object obj = this.f40388c;
        Object obj2 = this.f40387b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new sz(5, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((c50) obj2, tL_error, tLObject, (String) obj, 17));
                return;
            case 2:
                b70 b70Var = (b70) obj2;
                if (Objects.equals(b70Var.f37988a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new sz(13, b70Var, tLObject));
                    return;
                }
                return;
            case 3:
                p70 p70Var = (p70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new nq(p70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new nq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.x6) obj, 18));
                return;
            case 5:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.ActionBar.e2) obj2, tLObject, (g) obj, tL_error, 21));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new nq((lb0) obj2, tLObject, (String) obj, 21));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new nq((ib0) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((ib0) obj2, tLObject, (HashSet) obj, tL_error, 23));
                return;
            case 9:
                gg0 gg0Var = (gg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new nq(gg0Var, bundle, tLObject, 26));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new qc0(gg0Var, 2));
                    return;
                }
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((je0) obj2, tLObject, (String) obj, tL_error, 26));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new oe0((jf0) obj2, tL_error, (TL_account.confirmPhone) obj, 1));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new oe0((fg0) obj2, tLObject, (HashMap) obj, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ag0((Object) ((fg0) obj2), (Object) tL_error, (Object) tLObject, (Object) ((String) obj), 0));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new oe0((oj0) obj2, tLObject, (org.telegram.ui.Components.oy) obj, 9));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new oe0((xj0) obj2, tLObject, (TL_feed.TL_feed_setInterestCategories) obj, 10));
                return;
            case 16:
                km0 km0Var = (km0) obj2;
                km0Var.getClass();
                km0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new oe0((en0) obj2, tL_error, (TL_account.verifyPhone) obj, 16));
                return;
            case 18:
                po0 po0Var = (po0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new yl0(5, po0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new pn0(po0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 19:
                po0 po0Var2 = (po0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        Utilities.Callback callback = po0Var2.f42591c1;
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
                        po0Var2.getMessagesController().lambda$processUpdates$379(updates, false);
                        AndroidUtilities.runOnUIThread(new yl0(6, po0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new jn0(po0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                x10 x10Var = po0Var2.f42595e1;
                if (x10Var == null || !((Boolean) x10Var.run(tL_error)).booleanValue()) {
                    AndroidUtilities.runOnUIThread(new oe0(po0Var2, tL_error, tL_payments_sendPaymentForm, 18));
                    return;
                }
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ag0((po0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, false, 4));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new ag0((Object) ((fw0) obj2), (Object) tL_error, (Object) tLObject, (Object) ((TL_stars.updatePaidMessagesPrice) obj), 9));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new ag0((Object) ((PrivacyControlActivity) obj2), (Object) tL_error, (Object) tLObject, (Object) ((boolean[]) obj), 10));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new yl0(24, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.a9) obj));
                return;
            case 24:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new ag0((Object) ((ProfileActivity) obj2), (Object) tL_error, (Object) tLObject, (Object) ((String) obj), 15));
                return;
            case 25:
                int i13 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new ag0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, false, 13));
                return;
            case 26:
                int i14 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new ag0((Object) ((ProfileActivity) obj2), tLObject, (Object) ((TLRPC.TL_username) obj), (Object) tL_error, 14));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ag0((Object) ((c01) obj2), tLObject, (Object) ((TLRPC.TL_username) obj), (Object) tL_error, 18));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new h71((i71) obj2, tL_error, (TLRPC.TL_authorization) obj, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h71((j71) obj2, tL_error, (TLRPC.TL_authorization) obj, 1));
                return;
        }
    }
}
