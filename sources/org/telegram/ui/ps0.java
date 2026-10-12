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
public final class ps0 implements RequestDelegate {
    public final int f41090a;
    public final Object f41091b;
    public final Object f41092c;
    public final Object d;

    public ps0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41090a = i10;
        this.f41091b = obj;
        this.f41092c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41090a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gs0((us0) this.f41091b, tLObject, (UserConfig) this.f41092c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ay0) this.f41091b), tLObject, (Object) ((TLRPC.UserFull) this.f41092c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gs0((PrivacySettingsActivity) this.f41091b, (org.telegram.ui.ActionBar.a2) this.f41092c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ProfileActivity) this.f41091b), tLObject, (Object) ((TLRPC.UserFull) this.f41092c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ProfileActivity) this.f41091b), tLObject, (Object) ((TLRPC.TL_username) this.f41092c), (Object) ((a01) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ProfileActivity) this.f41091b), tLObject, (Object) ((String) this.f41092c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gs0((i01) this.f41091b, tLObject, (UserConfig) this.f41092c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new i90((Object) ((x71) this.f41091b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f41092c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gs0((SessionsActivity) this.f41091b, (org.telegram.ui.ActionBar.a2) this.f41092c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gs0((SessionsActivity) this.f41091b, (org.telegram.ui.ActionBar.a2) this.f41092c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                oa1 oa1Var = (oa1) this.f41091b;
                String str = (String) this.f41092c;
                cb1 cb1Var = (cb1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        pa1 pa1Var = oa1Var.f40345r;
                        int i10 = pa1Var.f40898i;
                        if (pa1Var != oa1Var.f40641w.f36753w) {
                            z10 = false;
                        }
                        bVar = db1.e0(jSONObject, i10, z10);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(oa1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new gs0(oa1Var, bVar, str, cb1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gs0((ze1) this.f41091b, tLObject, (String) this.f41092c, (org.telegram.ui.ActionBar.a2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41091b;
                byte[] bArr = (byte[]) this.f41092c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new gs0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new u31(23, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
