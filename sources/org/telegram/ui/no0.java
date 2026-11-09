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
    public final int f48214a;
    public final Object f48215b;
    public final Object f48216c;
    public final Object d;

    public no0(Object obj, Object obj2, Object obj3, int i7) {
        this.f48214a = i7;
        this.f48215b = obj;
        this.f48216c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48214a) {
            case 0:
                org.telegram.messenger.g0.h3(new lo0((so0) this.f48215b, tLObject, (org.telegram.messenger.p10) this.f48216c, (TLRPC.Photo) this.d, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o10((lt0) this.f48215b, tLObject, (TLRPC.UserFull) this.f48216c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) ((PrivacySettingsActivity) this.f48215b), (Object) ((org.telegram.ui.ActionBar.u1) this.f48216c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 3));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f48215b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f48216c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o10(profileActivity, tLObject, userFull, tL_birthday, tL_error, 29));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f48215b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f48216c;
                mv0 mv0Var = (mv0) this.d;
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o10(profileActivity2, tLObject, tL_username, mv0Var, tL_error, 27));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f48215b;
                String str = (String) this.f48216c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o10(profileActivity3, tLObject, str, user, tL_error, 28));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new lo0((tv0) this.f48215b, tLObject, (org.telegram.messenger.p10) this.f48216c, (TLRPC.Photo) this.d, 9));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new qw0((c21) this.f48215b, tL_error, tLObject, (TwoStepVerificationActivity) this.f48216c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new lo0((Object) ((SessionsActivity) this.f48215b), (Object) ((org.telegram.ui.ActionBar.u1) this.f48216c), (Object) tL_error, (Object) ((TLRPC.TL_authorization) this.d), 12));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new lo0((Object) ((SessionsActivity) this.f48215b), (Object) ((org.telegram.ui.ActionBar.u1) this.f48216c), (Object) tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 11));
                return;
            case 10:
                n41 n41Var = (n41) this.f48215b;
                String str2 = (String) this.f48216c;
                c51 c51Var = (c51) this.d;
                boolean z9 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        p41 p41Var = n41Var.f47749r;
                        int i7 = p41Var.f48626i;
                        if (p41Var != n41Var.f48094x.f44856x) {
                            z9 = false;
                        }
                        bVar = d51.h0(jSONObject, i7, z9);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(n41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new lo0(n41Var, bVar, str2, c51Var, 15));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new lo0((r81) this.f48215b, tLObject, (String) this.f48216c, (org.telegram.ui.ActionBar.u1) this.d, 17));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f48215b;
                byte[] bArr = (byte[]) this.f48216c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.f21336e.c(new lo0((org.telegram.ui.ActionBar.f2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new ax0(25, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
