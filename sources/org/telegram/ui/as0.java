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
public final class as0 implements RequestDelegate {
    public final int f37891a;
    public final Object f37892b;
    public final Object f37893c;
    public final Object d;

    public as0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37891a = i10;
        this.f37892b = obj;
        this.f37893c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37891a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag0((fs0) this.f37892b, tLObject, (UserConfig) this.f37893c, (TLRPC.Photo) this.d, false, 8));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((kx0) this.f37892b, tLObject, (TLRPC.UserFull) this.f37893c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ag0((PrivacySettingsActivity) this.f37892b, (org.telegram.ui.ActionBar.e2) this.f37893c, tLObject, (TL_account.setAccountTTL) this.d, 11));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f37892b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f37893c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                int i10 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity, tLObject, userFull, tL_birthday, tL_error, 29));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f37892b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f37893c;
                iz0 iz0Var = (iz0) this.d;
                int i11 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity2, tLObject, tL_username, iz0Var, tL_error, 27));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f37892b;
                String str = (String) this.f37893c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity3, tLObject, str, user, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ag0((rz0) this.f37892b, tLObject, (UserConfig) this.f37893c, (TLRPC.Photo) this.d, false, 17));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new o01((m61) this.f37892b, tL_error, tLObject, (TwoStepVerificationActivity) this.f37893c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ag0((SessionsActivity) this.f37892b, (org.telegram.ui.ActionBar.e2) this.f37893c, tL_error, (TLRPC.TL_authorization) this.d, false, 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ag0((SessionsActivity) this.f37892b, (org.telegram.ui.ActionBar.e2) this.f37893c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 19));
                return;
            case 10:
                h91 h91Var = (h91) this.f37892b;
                String str2 = (String) this.f37893c;
                v91 v91Var = (v91) this.d;
                boolean z10 = true;
                lg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        i91 i91Var = h91Var.f39573r;
                        int i13 = i91Var.f40188i;
                        if (i91Var != h91Var.f39961w.f45045w) {
                            z10 = false;
                        }
                        bVar = w91.d0(jSONObject, i13, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(h91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ag0((Object) h91Var, (Object) bVar, str2, (Object) v91Var, 23));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ag0((Object) ((sd1) this.f37892b), tLObject, (Object) ((String) this.f37893c), (Object) ((org.telegram.ui.ActionBar.e2) this.d), 25));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37892b;
                byte[] bArr = (byte[]) this.f37893c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new ag0(twoStepVerificationActivity, bArr, tLObject, bArr2, 26));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new zc1(7, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
