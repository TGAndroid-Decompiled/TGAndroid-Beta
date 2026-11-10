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
public final class oo0 implements RequestDelegate {
    public final int f48557a;
    public final Object f48558b;
    public final Object f48559c;
    public final Object d;

    public oo0(Object obj, Object obj2, Object obj3, int i7) {
        this.f48557a = i7;
        this.f48558b = obj;
        this.f48559c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48557a) {
            case 0:
                org.telegram.messenger.g0.h3(new mo0((to0) this.f48558b, tLObject, (org.telegram.messenger.p10) this.f48559c, (TLRPC.Photo) this.d, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((mt0) this.f48558b, tLObject, (TLRPC.UserFull) this.f48559c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new mo0((org.telegram.ui.ActionBar.f2) ((PrivacySettingsActivity) this.f48558b), (Object) ((org.telegram.ui.ActionBar.u1) this.f48559c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 3));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f48558b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f48559c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10(profileActivity, tLObject, userFull, tL_birthday, tL_error, 29));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f48558b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f48559c;
                nv0 nv0Var = (nv0) this.d;
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10(profileActivity2, tLObject, tL_username, nv0Var, tL_error, 27));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f48558b;
                String str = (String) this.f48559c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10(profileActivity3, tLObject, str, user, tL_error, 28));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new mo0((uv0) this.f48558b, tLObject, (org.telegram.messenger.p10) this.f48559c, (TLRPC.Photo) this.d, 9));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new sw0((d21) this.f48558b, tL_error, tLObject, (TwoStepVerificationActivity) this.f48559c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new mo0((Object) ((SessionsActivity) this.f48558b), (Object) ((org.telegram.ui.ActionBar.u1) this.f48559c), (Object) tL_error, (Object) ((TLRPC.TL_authorization) this.d), 12));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new mo0((Object) ((SessionsActivity) this.f48558b), (Object) ((org.telegram.ui.ActionBar.u1) this.f48559c), (Object) tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 11));
                return;
            case 10:
                o41 o41Var = (o41) this.f48558b;
                String str2 = (String) this.f48559c;
                d51 d51Var = (d51) this.d;
                boolean z9 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        q41 q41Var = o41Var.f48119r;
                        int i7 = q41Var.f48954i;
                        if (q41Var != o41Var.f48429x.f45169x) {
                            z9 = false;
                        }
                        bVar = e51.h0(jSONObject, i7, z9);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(o41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new mo0(o41Var, bVar, str2, d51Var, 15));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new mo0((s81) this.f48558b, tLObject, (String) this.f48559c, (org.telegram.ui.ActionBar.u1) this.d, 17));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f48558b;
                byte[] bArr = (byte[]) this.f48559c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f21341e.c(new mo0((org.telegram.ui.ActionBar.f2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new rw0(26, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
