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
public final class ms0 implements RequestDelegate {
    public final int f40104a;
    public final Object f40105b;
    public final Object f40106c;
    public final Object d;

    public ms0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40104a = i10;
        this.f40105b = obj;
        this.f40106c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40104a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ds0((rs0) this.f40105b, tLObject, (UserConfig) this.f40106c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f90((Object) ((xx0) this.f40105b), tLObject, (Object) ((TLRPC.UserFull) this.f40106c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ds0((PrivacySettingsActivity) this.f40105b, (org.telegram.ui.ActionBar.a2) this.f40106c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ProfileActivity) this.f40105b), tLObject, (Object) ((TLRPC.UserFull) this.f40106c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ProfileActivity) this.f40105b), tLObject, (Object) ((TLRPC.TL_username) this.f40106c), (Object) ((xz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ProfileActivity) this.f40105b), tLObject, (Object) ((String) this.f40106c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ds0((f01) this.f40105b, tLObject, (UserConfig) this.f40106c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new f90((Object) ((t71) this.f40105b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f40106c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ds0((SessionsActivity) this.f40105b, (org.telegram.ui.ActionBar.a2) this.f40106c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ds0((SessionsActivity) this.f40105b, (org.telegram.ui.ActionBar.a2) this.f40106c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                la1 la1Var = (la1) this.f40105b;
                String str = (String) this.f40106c;
                za1 za1Var = (za1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ma1 ma1Var = la1Var.f39288r;
                        int i10 = ma1Var.f39921i;
                        if (ma1Var != la1Var.f39609w.f36024w) {
                            z10 = false;
                        }
                        bVar = ab1.e0(jSONObject, i10, z10);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(la1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ds0(la1Var, bVar, str, za1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ds0((we1) this.f40105b, tLObject, (String) this.f40106c, (org.telegram.ui.ActionBar.a2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40105b;
                byte[] bArr = (byte[]) this.f40106c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new ds0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new m31(24, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
