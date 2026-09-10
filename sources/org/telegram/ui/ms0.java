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
    public final int f35055a;
    public final Object f35056b;
    public final Object f35057c;
    public final Object d;

    public ms0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35055a = i10;
        this.f35056b = obj;
        this.f35057c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35055a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01((Object) ((rs0) this.f35056b), tLObject, (Object) ((UserConfig) this.f35057c), (TLObject) ((TLRPC.Photo) this.d), 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((ay0) this.f35056b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f35057c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 13));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fy0((PrivacySettingsActivity) this.f35056b, (org.telegram.ui.ActionBar.d2) this.f35057c, tLObject, (TL_account.setAccountTTL) this.d, 0));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((ProfileActivity) this.f35056b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f35057c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((ProfileActivity) this.f35056b), (Object) tLObject, (Object) ((TLRPC.TL_username) this.f35057c), (Object) ((c01) this.d), tL_error, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ac0((ProfileActivity) this.f35056b, tLObject, (String) this.f35057c, (TLRPC.User) this.d, tL_error));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new fy0((Object) ((n01) this.f35056b), tLObject, (Object) ((UserConfig) this.f35057c), (Object) ((TLRPC.Photo) this.d), 6));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ac0((v71) this.f35056b, tL_error, tLObject, (TwoStepVerificationActivity) this.f35057c, (TLRPC.User) this.d, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fy0((SessionsActivity) this.f35056b, (org.telegram.ui.ActionBar.d2) this.f35057c, tL_error, (TLRPC.TL_authorization) this.d, 9));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fy0((SessionsActivity) this.f35056b, (org.telegram.ui.ActionBar.d2) this.f35057c, tL_error, (TLRPC.TL_webAuthorization) this.d, 8));
                return;
            case 10:
                qa1 qa1Var = (qa1) this.f35056b;
                String str = (String) this.f35057c;
                eb1 eb1Var = (eb1) this.d;
                boolean z10 = true;
                ig.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ra1 ra1Var = qa1Var.f35757r;
                        int i10 = ra1Var.f36317i;
                        if (ra1Var != qa1Var.f36007w.f32768w) {
                            z10 = false;
                        }
                        bVar = fb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(qa1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new fy0(qa1Var, bVar, str, eb1Var, 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new fy0((Object) ((af1) this.f35056b), tLObject, (Object) ((String) this.f35057c), (org.telegram.ui.ActionBar.d2) this.d, 14));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35056b;
                byte[] bArr = (byte[]) this.f35057c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new fy0(twoStepVerificationActivity, bArr, tLObject, bArr2, 15));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new r91(14, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
