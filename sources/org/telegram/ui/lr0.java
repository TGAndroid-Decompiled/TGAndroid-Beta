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

public final class lr0 implements RequestDelegate {

    public final int f40240a;

    public final Object f40241b;

    public final Object f40242c;
    public final Object d;

    public lr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40240a = i10;
        this.f40241b = obj;
        this.f40242c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40240a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((qr0) this.f40241b, tLObject, (UserConfig) this.f40242c, (TLRPC.Photo) this.d, 26));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((uw0) this.f40241b, tLObject, (TLRPC.UserFull) this.f40242c, (TL_account.TL_birthday) this.d, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((PrivacySettingsActivity) this.f40241b, (org.telegram.ui.ActionBar.b2) this.f40242c, tLObject, (TL_account.setAccountTTL) this.d, 29));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ProfileActivity) this.f40241b, tLObject, (TLRPC.UserFull) this.f40242c, (TL_account.TL_birthday) this.d, tL_error, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ProfileActivity) this.f40241b, tLObject, (TLRPC.TL_username) this.f40242c, (vy0) this.d, tL_error, 27));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ProfileActivity) this.f40241b, tLObject, (String) this.f40242c, (TLRPC.User) this.d, tL_error, 28));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ex0((dz0) this.f40241b, tLObject, (UserConfig) this.f40242c, (TLRPC.Photo) this.d, 5));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a01((k61) this.f40241b, tL_error, tLObject, (TwoStepVerificationActivity) this.f40242c, (TLRPC.User) this.d, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ex0((SessionsActivity) this.f40241b, (org.telegram.ui.ActionBar.b2) this.f40242c, tL_error, (TLObject) this.d, 8));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ex0((SessionsActivity) this.f40241b, (org.telegram.ui.ActionBar.b2) this.f40242c, tL_error, (TLObject) this.d, 7));
                break;
            case 10:
                b91 b91Var = (b91) this.f40241b;
                String str = (String) this.f40242c;
                p91 p91Var = (p91) this.d;
                boolean z10 = true;
                sf.b bVarE0 = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        c91 c91Var = b91Var.f36469r;
                        int i10 = c91Var.f37027i;
                        if (c91Var != b91Var.f36728w.f41578w) {
                            z10 = false;
                        }
                        bVarE0 = q91.e0(jSONObject, i10, z10);
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(b91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ex0(b91Var, bVarE0, str, p91Var, 11));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ex0((od1) this.f40241b, tLObject, (String) this.f40242c, (org.telegram.ui.ActionBar.b2) this.d));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40241b;
                byte[] bArr = (byte[]) this.f40242c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new m21(23, twoStepVerificationActivity, tL_error));
                } else {
                    Utilities.globalQueue.postRunnable(new ex0(twoStepVerificationActivity, bArr, tLObject, bArr2, 14));
                }
                break;
        }
    }
}
