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
public final class is0 implements RequestDelegate {
    public final int f34528a;
    public final Object f34529b;
    public final Object f34530c;
    public final Object d;

    public is0(Object obj, Object obj2, Object obj3, int i10) {
        this.f34528a = i10;
        this.f34529b = obj;
        this.f34530c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34528a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zr0((ns0) this.f34529b, tLObject, (UserConfig) this.f34530c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new e90((Object) ((sx0) this.f34529b), tLObject, (Object) ((TLRPC.UserFull) this.f34530c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zr0((PrivacySettingsActivity) this.f34529b, (org.telegram.ui.ActionBar.c2) this.f34530c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new e90((Object) ((ProfileActivity) this.f34529b), tLObject, (Object) ((TLRPC.UserFull) this.f34530c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new e90((Object) ((ProfileActivity) this.f34529b), tLObject, (Object) ((TLRPC.TL_username) this.f34530c), (Object) ((rz0) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new e90((Object) ((ProfileActivity) this.f34529b), tLObject, (Object) ((String) this.f34530c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zr0((a01) this.f34529b, tLObject, (UserConfig) this.f34530c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new e90((Object) ((m71) this.f34529b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f34530c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new zr0((SessionsActivity) this.f34529b, (org.telegram.ui.ActionBar.c2) this.f34530c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new zr0((SessionsActivity) this.f34529b, (org.telegram.ui.ActionBar.c2) this.f34530c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                ca1 ca1Var = (ca1) this.f34529b;
                String str = (String) this.f34530c;
                qa1 qa1Var = (qa1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        da1 da1Var = ca1Var.f32306r;
                        int i10 = da1Var.f32911i;
                        if (da1Var != ca1Var.f32647w.f37082w) {
                            z10 = false;
                        }
                        bVar = ra1.c0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ca1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new zr0(ca1Var, bVar, str, qa1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new zr0((oe1) this.f34529b, tLObject, (String) this.f34530c, (org.telegram.ui.ActionBar.c2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34529b;
                byte[] bArr = (byte[]) this.f34530c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new zr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new fb1(12, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
