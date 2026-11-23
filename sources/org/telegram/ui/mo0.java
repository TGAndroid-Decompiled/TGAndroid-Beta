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
public final class mo0 implements RequestDelegate {
    public final int f50089a;
    public final Object f50090b;
    public final Object f50091c;
    public final Object d;

    public mo0(Object obj, Object obj2, Object obj3, int i7) {
        this.f50089a = i7;
        this.f50090b = obj;
        this.f50091c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50089a) {
            case 0:
                org.telegram.messenger.g0.g3(new yd0((ro0) this.f50090b, tLObject, (org.telegram.messenger.i10) this.f50091c, (TLRPC.Photo) this.d, false, 8));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ip((Object) ((jt0) this.f50090b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f50091c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new yd0((PrivacySettingsActivity) this.f50090b, (org.telegram.ui.ActionBar.t1) this.f50091c, tLObject, (TL_account.setAccountTTL) this.d, 11));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f50090b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f50091c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new eu0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 2));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f50090b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f50091c;
                jv0 jv0Var = (jv0) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new eu0(profileActivity2, tLObject, tL_username, jv0Var, tL_error, 0));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f50090b;
                String str = (String) this.f50091c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new eu0(profileActivity3, tLObject, str, user, tL_error, 1));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new yd0((qv0) this.f50090b, tLObject, (org.telegram.messenger.i10) this.f50091c, (TLRPC.Photo) this.d, false, 17));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new eu0((a21) this.f50090b, tL_error, tLObject, (TwoStepVerificationActivity) this.f50091c, (TLRPC.User) this.d));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new yd0((SessionsActivity) this.f50090b, (org.telegram.ui.ActionBar.t1) this.f50091c, tL_error, (TLRPC.TL_authorization) this.d, false, 20));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new yd0((SessionsActivity) this.f50090b, (org.telegram.ui.ActionBar.t1) this.f50091c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 19));
                return;
            case 10:
                m41 m41Var = (m41) this.f50090b;
                String str2 = (String) this.f50091c;
                a51 a51Var = (a51) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        n41 n41Var = m41Var.f49590r;
                        int i7 = n41Var.f50214i;
                        if (n41Var != m41Var.f49954x.f45955x) {
                            z10 = false;
                        }
                        bVar = b51.h0(jSONObject, i7, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(m41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.g3(new yd0((Object) m41Var, (Object) bVar, str2, (Object) a51Var, 23));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new yd0((Object) ((q81) this.f50090b), tLObject, (Object) ((String) this.f50091c), (Object) ((org.telegram.ui.ActionBar.t1) this.d), 25));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f50090b;
                byte[] bArr = (byte[]) this.f50091c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f22877e.c(new yd0(twoStepVerificationActivity, bArr, tLObject, bArr2, 26));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new iy0(22, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
