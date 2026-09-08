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
    public final int f38782a;
    public final Object f38783b;
    public final Object f38784c;
    public final Object d;

    public ms0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38782a = i10;
        this.f38783b = obj;
        this.f38784c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38782a) {
            case 0:
                AndroidUtilities.runOnUIThread(new es0((rs0) this.f38783b, tLObject, (UserConfig) this.f38784c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h90((Object) ((zx0) this.f38783b), tLObject, (Object) ((TLRPC.UserFull) this.f38784c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new es0((PrivacySettingsActivity) this.f38783b, (org.telegram.ui.ActionBar.b2) this.f38784c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ProfileActivity) this.f38783b), tLObject, (Object) ((TLRPC.UserFull) this.f38784c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ProfileActivity) this.f38783b), tLObject, (Object) ((TLRPC.TL_username) this.f38784c), (Object) ((zz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ProfileActivity) this.f38783b), tLObject, (Object) ((String) this.f38784c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new es0((i01) this.f38783b, tLObject, (UserConfig) this.f38784c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new h90((Object) ((t71) this.f38783b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f38784c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new es0((SessionsActivity) this.f38783b, (org.telegram.ui.ActionBar.b2) this.f38784c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new es0((SessionsActivity) this.f38783b, (org.telegram.ui.ActionBar.b2) this.f38784c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                ma1 ma1Var = (ma1) this.f38783b;
                String str = (String) this.f38784c;
                ab1 ab1Var = (ab1) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        na1 na1Var = ma1Var.f38284r;
                        int i10 = na1Var.f38927i;
                        if (na1Var != ma1Var.f38632w.f34746w) {
                            z10 = false;
                        }
                        bVar = bb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ma1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new es0(ma1Var, bVar, str, ab1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new es0((we1) this.f38783b, tLObject, (String) this.f38784c, (org.telegram.ui.ActionBar.b2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38783b;
                byte[] bArr = (byte[]) this.f38784c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new es0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new w81(17, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
