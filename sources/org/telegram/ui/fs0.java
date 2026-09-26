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
public final class fs0 implements RequestDelegate {
    public final int f33752a;
    public final Object f33753b;
    public final Object f33754c;
    public final Object d;

    public fs0(Object obj, Object obj2, Object obj3, int i10) {
        this.f33752a = i10;
        this.f33753b = obj;
        this.f33754c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33752a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jr0((ks0) this.f33753b, tLObject, (UserConfig) this.f33754c, (TLRPC.Photo) this.d, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c90((Object) ((qx0) this.f33753b), tLObject, (Object) ((TLRPC.UserFull) this.f33754c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jr0((PrivacySettingsActivity) this.f33753b, (org.telegram.ui.ActionBar.a2) this.f33754c, tLObject, (TL_account.setAccountTTL) this.d, 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c90((Object) ((ProfileActivity) this.f33753b), tLObject, (Object) ((TLRPC.UserFull) this.f33754c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c90((Object) ((ProfileActivity) this.f33753b), tLObject, (Object) ((TLRPC.TL_username) this.f33754c), (Object) ((pz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new c90((Object) ((ProfileActivity) this.f33753b), tLObject, (Object) ((String) this.f33754c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new jr0((yz0) this.f33753b, tLObject, (UserConfig) this.f33754c, (TLRPC.Photo) this.d, 11));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c90((Object) ((k71) this.f33753b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f33754c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jr0((SessionsActivity) this.f33753b, (org.telegram.ui.ActionBar.a2) this.f33754c, tL_error, (TLRPC.TL_authorization) this.d, 14));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new jr0((SessionsActivity) this.f33753b, (org.telegram.ui.ActionBar.a2) this.f33754c, tL_error, (TLRPC.TL_webAuthorization) this.d, 13));
                return;
            case 10:
                da1 da1Var = (da1) this.f33753b;
                String str = (String) this.f33754c;
                ra1 ra1Var = (ra1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ea1 ea1Var = da1Var.f32616r;
                        int i10 = ea1Var.f33348i;
                        if (ea1Var != da1Var.f33069w.f37694w) {
                            z10 = false;
                        }
                        bVar = sa1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(da1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new jr0(da1Var, bVar, str, ra1Var, 17));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new jr0((oe1) this.f33753b, tLObject, (String) this.f33754c, (org.telegram.ui.ActionBar.a2) this.d, 19));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f33753b;
                byte[] bArr = (byte[]) this.f33754c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new jr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 20));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new p81(16, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
