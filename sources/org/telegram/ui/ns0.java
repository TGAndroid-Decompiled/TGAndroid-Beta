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
    public final int f40403a;
    public final Object f40404b;
    public final Object f40405c;
    public final Object d;

    public ns0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40403a = i10;
        this.f40404b = obj;
        this.f40405c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40403a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rr0((ss0) this.f40404b, tLObject, (UserConfig) this.f40405c, (TLRPC.Photo) this.d, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g90((Object) ((yx0) this.f40404b), tLObject, (Object) ((TLRPC.UserFull) this.f40405c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new rr0((PrivacySettingsActivity) this.f40404b, (org.telegram.ui.ActionBar.b2) this.f40405c, tLObject, (TL_account.setAccountTTL) this.d, 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g90((Object) ((ProfileActivity) this.f40404b), tLObject, (Object) ((TLRPC.UserFull) this.f40405c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new g90((Object) ((ProfileActivity) this.f40404b), tLObject, (Object) ((TLRPC.TL_username) this.f40405c), (Object) ((yz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new g90((Object) ((ProfileActivity) this.f40404b), tLObject, (Object) ((String) this.f40405c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rr0((g01) this.f40404b, tLObject, (UserConfig) this.f40405c, (TLRPC.Photo) this.d, 11));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new g90((Object) ((u71) this.f40404b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f40405c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new rr0((SessionsActivity) this.f40404b, (org.telegram.ui.ActionBar.b2) this.f40405c, tL_error, (TLRPC.TL_authorization) this.d, 14));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new rr0((SessionsActivity) this.f40404b, (org.telegram.ui.ActionBar.b2) this.f40405c, tL_error, (TLRPC.TL_webAuthorization) this.d, 13));
                return;
            case 10:
                ma1 ma1Var = (ma1) this.f40404b;
                String str = (String) this.f40405c;
                ab1 ab1Var = (ab1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        na1 na1Var = ma1Var.f39538r;
                        int i10 = na1Var.f40198i;
                        if (na1Var != ma1Var.f39865w.f36277w) {
                            z10 = false;
                        }
                        bVar = bb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ma1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new rr0(ma1Var, bVar, str, ab1Var, 17));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new rr0((xe1) this.f40404b, tLObject, (String) this.f40405c, (org.telegram.ui.ActionBar.b2) this.d, 19));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40404b;
                byte[] bArr = (byte[]) this.f40405c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new rr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 20));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new n31(25, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
