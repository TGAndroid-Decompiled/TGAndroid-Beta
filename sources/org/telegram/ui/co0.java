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
public final class co0 implements RequestDelegate {
    public final int f44412a;
    public final Object f44413b;
    public final Object f44414c;
    public final Object d;

    public co0(Object obj, Object obj2, Object obj3, int i3) {
        this.f44412a = i3;
        this.f44413b = obj;
        this.f44414c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44412a) {
            case 0:
                org.telegram.messenger.g0.h3(new ih0((ho0) this.f44413b, tLObject, (org.telegram.messenger.h10) this.f44414c, (TLRPC.Photo) this.d, 6));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new lq((at0) this.f44413b, tLObject, (TLRPC.UserFull) this.f44414c, (TL_account.TL_birthday) this.d, tL_error, 26));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ih0((PrivacySettingsActivity) this.f44413b, (org.telegram.ui.ActionBar.s1) this.f44414c, tLObject, (TL_account.setAccountTTL) this.d, 9));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f44413b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f44414c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new xt0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 0));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f44413b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f44414c;
                bv0 bv0Var = (bv0) this.d;
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new lq(profileActivity2, tLObject, tL_username, bv0Var, tL_error, 28));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f44413b;
                String str = (String) this.f44414c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new lq(profileActivity3, tLObject, str, user, tL_error, 29));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ih0((iv0) this.f44413b, tLObject, (org.telegram.messenger.h10) this.f44414c, (TLRPC.Photo) this.d, 15));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new xt0((q11) this.f44413b, tL_error, tLObject, (TwoStepVerificationActivity) this.f44414c, (TLRPC.User) this.d));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new ih0((SessionsActivity) this.f44413b, (org.telegram.ui.ActionBar.s1) this.f44414c, tL_error, (TLRPC.TL_authorization) this.d, 18));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new ih0((SessionsActivity) this.f44413b, (org.telegram.ui.ActionBar.s1) this.f44414c, tL_error, (TLRPC.TL_webAuthorization) this.d, 17));
                return;
            case 10:
                c41 c41Var = (c41) this.f44413b;
                String str2 = (String) this.f44414c;
                q41 q41Var = (q41) this.d;
                boolean z10 = true;
                ng.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        d41 d41Var = c41Var.f43923r;
                        int i3 = d41Var.f44544i;
                        if (d41Var != c41Var.f44235x.f49094x) {
                            z10 = false;
                        }
                        bVar = r41.h0(jSONObject, i3, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(c41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new ih0(c41Var, bVar, str2, q41Var, 21));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new ih0((g81) this.f44413b, tLObject, (String) this.f44414c, (org.telegram.ui.ActionBar.s1) this.d, 23));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f44413b;
                byte[] bArr = (byte[]) this.f44414c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f21387e.c(new ih0(twoStepVerificationActivity, bArr, tLObject, bArr2, 24));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new qv0(29, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
