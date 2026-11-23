package org.telegram.ui;

import android.graphics.RectF;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
public final class no0 implements RequestDelegate {
    public final int f50238a;
    public final Object f50239b;
    public final Object f50240c;
    public final Object d;

    public no0(Object obj, Object obj2, Object obj3, int i7) {
        this.f50238a = i7;
        this.f50239b = obj;
        this.f50240c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50238a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg0((so0) this.f50239b, tLObject, (org.telegram.messenger.k10) this.f50240c, (TLRPC.Photo) this.d, 7));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ip((Object) ((lt0) this.f50239b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f50240c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new kg0((PrivacySettingsActivity) this.f50239b, (org.telegram.ui.ActionBar.t1) this.f50240c, tLObject, (TL_account.setAccountTTL) this.d, 10));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f50239b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f50240c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new gu0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 2));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f50239b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f50240c;
                lv0 lv0Var = (lv0) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new gu0(profileActivity2, tLObject, tL_username, lv0Var, tL_error, 0));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f50239b;
                String str = (String) this.f50240c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new gu0(profileActivity3, tLObject, str, user, tL_error, 1));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new kg0((sv0) this.f50239b, tLObject, (org.telegram.messenger.k10) this.f50240c, (TLRPC.Photo) this.d, 16));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new gu0((b21) this.f50239b, tL_error, tLObject, (TwoStepVerificationActivity) this.f50240c, (TLRPC.User) this.d));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new kg0((SessionsActivity) this.f50239b, (org.telegram.ui.ActionBar.t1) this.f50240c, tL_error, (TLRPC.TL_authorization) this.d, 19));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new kg0((SessionsActivity) this.f50239b, (org.telegram.ui.ActionBar.t1) this.f50240c, tL_error, (TLRPC.TL_webAuthorization) this.d, 18));
                return;
            case 10:
                n41 n41Var = (n41) this.f50239b;
                String str2 = (String) this.f50240c;
                b51 b51Var = (b51) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        o41 o41Var = n41Var.f49733r;
                        int i7 = o41Var.f50467i;
                        if (o41Var != n41Var.f50075x.f46446x) {
                            z10 = false;
                        }
                        bVar = c51.h0(jSONObject, i7, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(n41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.g3(new kg0(n41Var, bVar, str2, b51Var, 22));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new kg0((s81) this.f50239b, tLObject, (String) this.f50240c, (org.telegram.ui.ActionBar.t1) this.d, 24));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f50239b;
                byte[] bArr = (byte[]) this.f50240c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f22774e.c(new kg0(twoStepVerificationActivity, bArr, tLObject, bArr2, 25));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new b31(16, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
