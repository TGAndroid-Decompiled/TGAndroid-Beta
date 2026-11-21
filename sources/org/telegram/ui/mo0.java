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
    public final int f49948a;
    public final Object f49949b;
    public final Object f49950c;
    public final Object d;

    public mo0(Object obj, Object obj2, Object obj3, int i7) {
        this.f49948a = i7;
        this.f49949b = obj;
        this.f49950c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49948a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg0((ro0) this.f49949b, tLObject, (org.telegram.messenger.j10) this.f49950c, (TLRPC.Photo) this.d, 7));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new wn((Object) ((kt0) this.f49949b), tLObject, (Object) ((TLRPC.UserFull) this.f49950c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 29));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new kg0((PrivacySettingsActivity) this.f49949b, (org.telegram.ui.ActionBar.t1) this.f49950c, tLObject, (TL_account.setAccountTTL) this.d, 10));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f49949b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f49950c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new wt0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 3));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f49949b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f49950c;
                kv0 kv0Var = (kv0) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new wt0(profileActivity2, tLObject, tL_username, kv0Var, tL_error, 1));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f49949b;
                String str = (String) this.f49950c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new wt0(profileActivity3, tLObject, str, user, tL_error, 2));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new kg0((rv0) this.f49949b, tLObject, (org.telegram.messenger.j10) this.f49950c, (TLRPC.Photo) this.d, 16));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new wt0((c21) this.f49949b, tL_error, tLObject, (TwoStepVerificationActivity) this.f49950c, (TLRPC.User) this.d));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new kg0((SessionsActivity) this.f49949b, (org.telegram.ui.ActionBar.t1) this.f49950c, tL_error, (TLRPC.TL_authorization) this.d, 19));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new kg0((SessionsActivity) this.f49949b, (org.telegram.ui.ActionBar.t1) this.f49950c, tL_error, (TLRPC.TL_webAuthorization) this.d, 18));
                return;
            case 10:
                n41 n41Var = (n41) this.f49949b;
                String str2 = (String) this.f49950c;
                b51 b51Var = (b51) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        o41 o41Var = n41Var.f49760r;
                        int i7 = o41Var.f50474i;
                        if (o41Var != n41Var.f50085x.f46459x) {
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
                org.telegram.messenger.g0.g3(new kg0((s81) this.f49949b, tLObject, (String) this.f49950c, (org.telegram.ui.ActionBar.t1) this.d, 24));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f49949b;
                byte[] bArr = (byte[]) this.f49950c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f22807e.c(new kg0(twoStepVerificationActivity, bArr, tLObject, bArr2, 25));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new mz0(18, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
