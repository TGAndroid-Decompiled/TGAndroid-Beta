package org.telegram.ui;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
public final class ns0 implements RequestDelegate {
    public final int f36036a;
    public final Object f36037b;
    public final Object f36038c;
    public final Object d;

    public ns0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36036a = i10;
        this.f36037b = obj;
        this.f36038c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36036a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fs0((ss0) this.f36037b, tLObject, (UserConfig) this.f36038c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g90((Object) ((yx0) this.f36037b), tLObject, (Object) ((TLRPC.UserFull) this.f36038c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fs0((PrivacySettingsActivity) this.f36037b, (org.telegram.ui.ActionBar.b2) this.f36038c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g90((Object) ((ProfileActivity) this.f36037b), tLObject, (Object) ((TLRPC.UserFull) this.f36038c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new g90((Object) ((ProfileActivity) this.f36037b), tLObject, (Object) ((TLRPC.TL_username) this.f36038c), (Object) ((yz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new g90((Object) ((ProfileActivity) this.f36037b), tLObject, (Object) ((String) this.f36038c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new fs0((h01) this.f36037b, tLObject, (UserConfig) this.f36038c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new g90((Object) ((q71) this.f36037b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f36038c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fs0((SessionsActivity) this.f36037b, (org.telegram.ui.ActionBar.b2) this.f36038c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fs0((SessionsActivity) this.f36037b, (org.telegram.ui.ActionBar.b2) this.f36038c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                ja1 ja1Var = (ja1) this.f36037b;
                String str = (String) this.f36038c;
                xa1 xa1Var = (xa1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ka1 ka1Var = ja1Var.f34576r;
                        int i10 = ka1Var.f35098i;
                        if (ka1Var != ja1Var.f34846w.f39823w) {
                            z10 = false;
                        }
                        bVar = ya1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ja1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new fs0(ja1Var, bVar, str, xa1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new fs0((ve1) this.f36037b, tLObject, (String) this.f36038c, (org.telegram.ui.ActionBar.b2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36037b;
                byte[] bArr = (byte[]) this.f36038c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new fs0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new nb1(11, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
