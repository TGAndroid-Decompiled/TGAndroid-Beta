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
public final class lo0 implements RequestDelegate {
    public final int f47564a;
    public final Object f47565b;
    public final Object f47566c;
    public final Object d;

    public lo0(Object obj, Object obj2, Object obj3, int i7) {
        this.f47564a = i7;
        this.f47565b = obj;
        this.f47566c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47564a) {
            case 0:
                org.telegram.messenger.g0.h3(new jo0((qo0) this.f47565b, tLObject, (org.telegram.messenger.p10) this.f47566c, (TLRPC.Photo) this.d, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((jt0) this.f47565b), (Object) ((TLRPC.UserFull) this.f47566c), tL_error, tLObject, (Object) ((TL_account.TL_birthday) this.d), 24));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new jo0((org.telegram.ui.ActionBar.f2) ((PrivacySettingsActivity) this.f47565b), (Object) ((org.telegram.ui.ActionBar.u1) this.f47566c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 3));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f47565b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f47566c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) profileActivity, (Object) userFull, tL_error, tLObject, (Object) tL_birthday, 28));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f47565b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f47566c;
                kv0 kv0Var = (kv0) this.d;
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) profileActivity2, (Object) tL_username, tL_error, tLObject, (Object) kv0Var, 26));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f47565b;
                String str = (String) this.f47566c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) profileActivity3, (Object) str, tL_error, tLObject, (Object) user, 27));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new jo0((rv0) this.f47565b, tLObject, (org.telegram.messenger.p10) this.f47566c, (TLRPC.Photo) this.d, 9));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new c01((a21) this.f47565b, tL_error, tLObject, (TwoStepVerificationActivity) this.f47566c, (TLRPC.User) this.d, 1));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new jo0((Object) ((SessionsActivity) this.f47565b), (Object) ((org.telegram.ui.ActionBar.u1) this.f47566c), (Object) tL_error, (Object) ((TLRPC.TL_authorization) this.d), 12));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new jo0((Object) ((SessionsActivity) this.f47565b), (Object) ((org.telegram.ui.ActionBar.u1) this.f47566c), (Object) tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 11));
                return;
            case 10:
                m41 m41Var = (m41) this.f47565b;
                String str2 = (String) this.f47566c;
                b51 b51Var = (b51) this.d;
                boolean z9 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        o41 o41Var = m41Var.f47419r;
                        int i7 = o41Var.f48259i;
                        if (o41Var != m41Var.f47660x.f44697x) {
                            z9 = false;
                        }
                        bVar = c51.h0(jSONObject, i7, z9);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(m41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new jo0(m41Var, bVar, str2, b51Var, 15));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new jo0((q81) this.f47565b, tLObject, (String) this.f47566c, (org.telegram.ui.ActionBar.u1) this.d, 17));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f47565b;
                byte[] bArr = (byte[]) this.f47566c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f21336e.c(new jo0((org.telegram.ui.ActionBar.f2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new by0(24, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
