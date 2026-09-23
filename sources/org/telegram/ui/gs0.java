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
public final class gs0 implements RequestDelegate {
    public final int f33647a;
    public final Object f33648b;
    public final Object f33649c;
    public final Object d;

    public gs0(Object obj, Object obj2, Object obj3, int i10) {
        this.f33647a = i10;
        this.f33648b = obj;
        this.f33649c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33647a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yr0((ls0) this.f33648b, tLObject, (UserConfig) this.f33649c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d90((Object) ((rx0) this.f33648b), tLObject, (Object) ((TLRPC.UserFull) this.f33649c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yr0((PrivacySettingsActivity) this.f33648b, (org.telegram.ui.ActionBar.b2) this.f33649c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new d90((Object) ((ProfileActivity) this.f33648b), tLObject, (Object) ((TLRPC.UserFull) this.f33649c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new d90((Object) ((ProfileActivity) this.f33648b), tLObject, (Object) ((TLRPC.TL_username) this.f33649c), (Object) ((rz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new d90((Object) ((ProfileActivity) this.f33648b), tLObject, (Object) ((String) this.f33649c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yr0((a01) this.f33648b, tLObject, (UserConfig) this.f33649c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new d90((Object) ((j71) this.f33648b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f33649c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yr0((SessionsActivity) this.f33648b, (org.telegram.ui.ActionBar.b2) this.f33649c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yr0((SessionsActivity) this.f33648b, (org.telegram.ui.ActionBar.b2) this.f33649c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                ca1 ca1Var = (ca1) this.f33648b;
                String str = (String) this.f33649c;
                qa1 qa1Var = (qa1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        da1 da1Var = ca1Var.f32039r;
                        int i10 = da1Var.f32556i;
                        if (da1Var != ca1Var.f32300w.f36780w) {
                            z10 = false;
                        }
                        bVar = ra1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ca1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new yr0(ca1Var, bVar, str, qa1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new yr0((oe1) this.f33648b, tLObject, (String) this.f33649c, (org.telegram.ui.ActionBar.b2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f33648b;
                byte[] bArr = (byte[]) this.f33649c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new yr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new hb1(11, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
