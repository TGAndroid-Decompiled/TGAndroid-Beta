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
public final class cs0 implements RequestDelegate {
    public final int f38451a;
    public final Object f38452b;
    public final Object f38453c;
    public final Object d;

    public cs0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38451a = i10;
        this.f38452b = obj;
        this.f38453c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38451a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg0((hs0) this.f38452b, tLObject, (UserConfig) this.f38453c, (TLRPC.Photo) this.d, false, 8));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((mx0) this.f38452b, tLObject, (TLRPC.UserFull) this.f38453c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cg0((PrivacySettingsActivity) this.f38452b, (org.telegram.ui.ActionBar.e2) this.f38453c, tLObject, (TL_account.setAccountTTL) this.d, 11));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f38452b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f38453c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                int i10 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity, tLObject, userFull, tL_birthday, tL_error, 29));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f38452b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f38453c;
                kz0 kz0Var = (kz0) this.d;
                int i11 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity2, tLObject, tL_username, kz0Var, tL_error, 27));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f38452b;
                String str = (String) this.f38453c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity3, tLObject, str, user, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new cg0((tz0) this.f38452b, tLObject, (UserConfig) this.f38453c, (TLRPC.Photo) this.d, false, 17));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new q01((p61) this.f38452b, tL_error, tLObject, (TwoStepVerificationActivity) this.f38453c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new cg0((SessionsActivity) this.f38452b, (org.telegram.ui.ActionBar.e2) this.f38453c, tL_error, (TLRPC.TL_authorization) this.d, false, 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new cg0((SessionsActivity) this.f38452b, (org.telegram.ui.ActionBar.e2) this.f38453c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 19));
                return;
            case 10:
                j91 j91Var = (j91) this.f38452b;
                String str2 = (String) this.f38453c;
                x91 x91Var = (x91) this.d;
                boolean z10 = true;
                lg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        k91 k91Var = j91Var.f40076r;
                        int i13 = k91Var.f40709i;
                        if (k91Var != j91Var.f40496w.f45936w) {
                            z10 = false;
                        }
                        bVar = y91.d0(jSONObject, i13, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(j91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new cg0((Object) j91Var, (Object) bVar, str2, (Object) x91Var, 23));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new cg0((Object) ((ud1) this.f38452b), tLObject, (Object) ((String) this.f38453c), (Object) ((org.telegram.ui.ActionBar.e2) this.d), 25));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38452b;
                byte[] bArr = (byte[]) this.f38453c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new cg0(twoStepVerificationActivity, bArr, tLObject, bArr2, 26));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new yc1(8, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
