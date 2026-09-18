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
    public final int f36045a;
    public final Object f36046b;
    public final Object f36047c;
    public final Object d;

    public ns0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36045a = i10;
        this.f36046b = obj;
        this.f36047c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36045a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fs0((ss0) this.f36046b, tLObject, (UserConfig) this.f36047c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h90((Object) ((yx0) this.f36046b), tLObject, (Object) ((TLRPC.UserFull) this.f36047c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fs0((PrivacySettingsActivity) this.f36046b, (org.telegram.ui.ActionBar.b2) this.f36047c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ProfileActivity) this.f36046b), tLObject, (Object) ((TLRPC.UserFull) this.f36047c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ProfileActivity) this.f36046b), tLObject, (Object) ((TLRPC.TL_username) this.f36047c), (Object) ((yz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ProfileActivity) this.f36046b), tLObject, (Object) ((String) this.f36047c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new fs0((h01) this.f36046b, tLObject, (UserConfig) this.f36047c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new h90((Object) ((q71) this.f36046b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f36047c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fs0((SessionsActivity) this.f36046b, (org.telegram.ui.ActionBar.b2) this.f36047c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fs0((SessionsActivity) this.f36046b, (org.telegram.ui.ActionBar.b2) this.f36047c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                ka1 ka1Var = (ka1) this.f36046b;
                String str = (String) this.f36047c;
                ya1 ya1Var = (ya1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        la1 la1Var = ka1Var.f34775r;
                        int i10 = la1Var.f35327i;
                        if (la1Var != ka1Var.f35029w.f40060w) {
                            z10 = false;
                        }
                        bVar = za1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ka1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new fs0(ka1Var, bVar, str, ya1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new fs0((ve1) this.f36046b, tLObject, (String) this.f36047c, (org.telegram.ui.ActionBar.b2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36046b;
                byte[] bArr = (byte[]) this.f36047c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new fs0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new x81(15, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
