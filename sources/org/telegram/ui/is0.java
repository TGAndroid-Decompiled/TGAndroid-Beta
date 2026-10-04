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
public final class is0 implements RequestDelegate {
    public final int f37494a;
    public final Object f37495b;
    public final Object f37496c;
    public final Object d;

    public is0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37494a = i10;
        this.f37495b = obj;
        this.f37496c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37494a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zr0((ns0) this.f37495b, tLObject, (UserConfig) this.f37496c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f90((Object) ((sx0) this.f37495b), tLObject, (Object) ((TLRPC.UserFull) this.f37496c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zr0((PrivacySettingsActivity) this.f37495b, (org.telegram.ui.ActionBar.b2) this.f37496c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ProfileActivity) this.f37495b), tLObject, (Object) ((TLRPC.UserFull) this.f37496c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ProfileActivity) this.f37495b), tLObject, (Object) ((TLRPC.TL_username) this.f37496c), (Object) ((sz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ProfileActivity) this.f37495b), tLObject, (Object) ((String) this.f37496c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zr0((a01) this.f37495b, tLObject, (UserConfig) this.f37496c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new f90((Object) ((m71) this.f37495b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f37496c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new zr0((SessionsActivity) this.f37495b, (org.telegram.ui.ActionBar.b2) this.f37496c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new zr0((SessionsActivity) this.f37495b, (org.telegram.ui.ActionBar.b2) this.f37496c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                ga1 ga1Var = (ga1) this.f37495b;
                String str = (String) this.f37496c;
                ua1 ua1Var = (ua1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ha1 ha1Var = ga1Var.f36235r;
                        int i10 = ha1Var.f37021i;
                        if (ha1Var != ga1Var.f36545w.f41666w) {
                            z10 = false;
                        }
                        bVar = va1.c0(jSONObject, i10, z10);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ga1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new zr0(ga1Var, bVar, str, ua1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new zr0((qe1) this.f37495b, tLObject, (String) this.f37496c, (org.telegram.ui.ActionBar.b2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37495b;
                byte[] bArr = (byte[]) this.f37496c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new zr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new g91(14, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
