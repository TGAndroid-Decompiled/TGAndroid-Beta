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
    public final int f36728a;
    public final Object f36729b;
    public final Object f36730c;
    public final Object d;

    public ps0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36728a = i10;
        this.f36729b = obj;
        this.f36730c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36728a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hs0((us0) this.f36729b, tLObject, (UserConfig) this.f36730c, (TLRPC.Photo) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ay0) this.f36729b), tLObject, (Object) ((TLRPC.UserFull) this.f36730c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hs0((PrivacySettingsActivity) this.f36729b, (org.telegram.ui.ActionBar.c2) this.f36730c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ProfileActivity) this.f36729b), tLObject, (Object) ((TLRPC.UserFull) this.f36730c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ProfileActivity) this.f36729b), tLObject, (Object) ((TLRPC.TL_username) this.f36730c), (Object) ((a01) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new i90((Object) ((ProfileActivity) this.f36729b), tLObject, (Object) ((String) this.f36730c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hs0((j01) this.f36729b, tLObject, (UserConfig) this.f36730c, (TLRPC.Photo) this.d, 10));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new i90((Object) ((s71) this.f36729b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f36730c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hs0((SessionsActivity) this.f36729b, (org.telegram.ui.ActionBar.c2) this.f36730c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new hs0((SessionsActivity) this.f36729b, (org.telegram.ui.ActionBar.c2) this.f36730c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                return;
            case 10:
                la1 la1Var = (la1) this.f36729b;
                String str = (String) this.f36730c;
                za1 za1Var = (za1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ma1 ma1Var = la1Var.f35183r;
                        int i10 = ma1Var.f35751i;
                        if (ma1Var != la1Var.f35496w.f31814w) {
                            z10 = false;
                        }
                        bVar = ab1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(la1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new hs0(la1Var, bVar, str, za1Var, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hs0((xe1) this.f36729b, tLObject, (String) this.f36730c, (org.telegram.ui.ActionBar.c2) this.d, 18));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36729b;
                byte[] bArr = (byte[]) this.f36730c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new hs0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new qb1(11, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
