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
public final class jr0 implements RequestDelegate {
    public final int f39679a;
    public final Object f39680b;
    public final Object f39681c;
    public final Object d;

    public jr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f39679a = i10;
        this.f39680b = obj;
        this.f39681c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39679a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n20((or0) this.f39680b, tLObject, (UserConfig) this.f39681c, (TLRPC.Photo) this.d, 24));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((tw0) this.f39680b, tLObject, (TLRPC.UserFull) this.f39681c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new n20((PrivacySettingsActivity) this.f39680b, (org.telegram.ui.ActionBar.c2) this.f39681c, tLObject, (TL_account.setAccountTTL) this.d, 27));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ProfileActivity) this.f39680b, tLObject, (TLRPC.UserFull) this.f39681c, (TL_account.TL_birthday) this.d, tL_error, 29));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ProfileActivity) this.f39680b, tLObject, (TLRPC.TL_username) this.f39681c, (vy0) this.d, tL_error, 27));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ProfileActivity) this.f39680b, tLObject, (String) this.f39681c, (TLRPC.User) this.d, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new lx0((dz0) this.f39680b, tLObject, (UserConfig) this.f39681c, (TLRPC.Photo) this.d, 3));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a01((n61) this.f39680b, tL_error, tLObject, (TwoStepVerificationActivity) this.f39681c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new lx0((Object) ((SessionsActivity) this.f39680b), (Object) ((org.telegram.ui.ActionBar.c2) this.f39681c), tL_error, (Object) ((TLRPC.TL_authorization) this.d), 6));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new lx0((Object) ((SessionsActivity) this.f39680b), (Object) ((org.telegram.ui.ActionBar.c2) this.f39681c), tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 5));
                return;
            case 10:
                e91 e91Var = (e91) this.f39680b;
                String str = (String) this.f39681c;
                s91 s91Var = (s91) this.d;
                boolean z10 = true;
                uf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        f91 f91Var = e91Var.f37430r;
                        int i10 = f91Var.f38075i;
                        if (f91Var != e91Var.f37766w.f42617w) {
                            z10 = false;
                        }
                        bVar = t91.e0(jSONObject, i10, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(e91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new lx0(e91Var, bVar, str, s91Var, 9));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new lx0((pd1) this.f39680b, tLObject, (String) this.f39681c, (org.telegram.ui.ActionBar.c2) this.d, 11));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39680b;
                byte[] bArr = (byte[]) this.f39681c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new lx0(twoStepVerificationActivity, bArr, tLObject, bArr2));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new t31(20, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
