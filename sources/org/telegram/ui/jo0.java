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
    public final int f48392a;
    public final Object f48393b;
    public final Object f48394c;
    public final Object d;

    public jo0(Object obj, Object obj2, Object obj3, int i7) {
        this.f48392a = i7;
        this.f48393b = obj;
        this.f48394c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48392a) {
            case 0:
                org.telegram.messenger.g0.h3(new ok0((oo0) this.f48393b, tLObject, (org.telegram.messenger.m10) this.f48394c, (TLRPC.Photo) this.d, 4));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new hp((Object) ((ht0) this.f48393b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f48394c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) ((PrivacySettingsActivity) this.f48393b), (Object) ((org.telegram.ui.ActionBar.t1) this.f48394c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 7));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f48393b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f48394c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 2));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f48393b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f48394c;
                iv0 iv0Var = (iv0) this.d;
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity2, tLObject, tL_username, iv0Var, tL_error, 0));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f48393b;
                String str = (String) this.f48394c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity3, tLObject, str, user, tL_error, 1));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ok0((pv0) this.f48393b, tLObject, (org.telegram.messenger.m10) this.f48394c, (TLRPC.Photo) this.d, 13));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new cu0((x11) this.f48393b, tL_error, tLObject, (TwoStepVerificationActivity) this.f48394c, (TLRPC.User) this.d));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new ok0((Object) ((SessionsActivity) this.f48393b), (Object) ((org.telegram.ui.ActionBar.t1) this.f48394c), (Object) tL_error, (Object) ((TLRPC.TL_authorization) this.d), 16));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new ok0((Object) ((SessionsActivity) this.f48393b), (Object) ((org.telegram.ui.ActionBar.t1) this.f48394c), (Object) tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 15));
                return;
            case 10:
                k41 k41Var = (k41) this.f48393b;
                String str2 = (String) this.f48394c;
                y41 y41Var = (y41) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        l41 l41Var = k41Var.f48206r;
                        int i7 = l41Var.f48832i;
                        if (l41Var != k41Var.f48538x.f53838x) {
                            z10 = false;
                        }
                        bVar = z41.h0(jSONObject, i7, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(k41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new ok0(k41Var, bVar, str2, y41Var, 19));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new ok0((o81) this.f48393b, tLObject, (String) this.f48394c, (org.telegram.ui.ActionBar.t1) this.d, 21));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f48393b;
                byte[] bArr = (byte[]) this.f48394c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f22416e.c(new ok0((org.telegram.ui.ActionBar.e2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 22));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new fy0(21, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
