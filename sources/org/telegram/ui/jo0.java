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
public final class jo0 implements RequestDelegate {
    public final int f48438a;
    public final Object f48439b;
    public final Object f48440c;
    public final Object d;

    public jo0(Object obj, Object obj2, Object obj3, int i7) {
        this.f48438a = i7;
        this.f48439b = obj;
        this.f48440c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48438a) {
            case 0:
                org.telegram.messenger.g0.h3(new hn0((oo0) this.f48439b, tLObject, (org.telegram.messenger.m10) this.f48440c, (TLRPC.Photo) this.d, 3));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new hp((Object) ((ht0) this.f48439b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f48440c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new hn0((PrivacySettingsActivity) this.f48439b, (org.telegram.ui.ActionBar.t1) this.f48440c, tLObject, (TL_account.setAccountTTL) this.d, 6));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f48439b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f48440c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 2));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f48439b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f48440c;
                iv0 iv0Var = (iv0) this.d;
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity2, tLObject, tL_username, iv0Var, tL_error, 0));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f48439b;
                String str = (String) this.f48440c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity3, tLObject, str, user, tL_error, 1));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new hn0((pv0) this.f48439b, tLObject, (org.telegram.messenger.m10) this.f48440c, (TLRPC.Photo) this.d, 12));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new cu0((x11) this.f48439b, tL_error, tLObject, (TwoStepVerificationActivity) this.f48440c, (TLRPC.User) this.d));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new hn0((SessionsActivity) this.f48439b, (org.telegram.ui.ActionBar.t1) this.f48440c, tL_error, (TLRPC.TL_authorization) this.d, 15));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new hn0((SessionsActivity) this.f48439b, (org.telegram.ui.ActionBar.t1) this.f48440c, tL_error, (TLRPC.TL_webAuthorization) this.d, 14));
                return;
            case 10:
                k41 k41Var = (k41) this.f48439b;
                String str2 = (String) this.f48440c;
                y41 y41Var = (y41) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        l41 l41Var = k41Var.f48221r;
                        int i7 = l41Var.f48836i;
                        if (l41Var != k41Var.f48584x.f53873x) {
                            z10 = false;
                        }
                        bVar = z41.h0(jSONObject, i7, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(k41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new hn0(18, k41Var, bVar, y41Var, str2));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new hn0(20, (o81) this.f48439b, tLObject, (org.telegram.ui.ActionBar.t1) this.d, (String) this.f48440c));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f48439b;
                byte[] bArr = (byte[]) this.f48440c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f22416e.c(new hn0(twoStepVerificationActivity, bArr, tLObject, bArr2, 21));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new fy0(21, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
