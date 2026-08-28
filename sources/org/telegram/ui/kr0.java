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
public final class kr0 implements RequestDelegate {
    public final int f39911a;
    public final Object f39912b;
    public final Object f39913c;
    public final Object d;

    public kr0(Object obj, Object obj2, Object obj3, int i9) {
        this.f39911a = i9;
        this.f39912b = obj;
        this.f39913c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39911a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ir0((pr0) this.f39912b, tLObject, (UserConfig) this.f39913c, (TLRPC.Photo) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hr((uw0) this.f39912b, tLObject, (TLRPC.UserFull) this.f39913c, (TL_account.TL_birthday) this.d, tL_error, 26));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) ((PrivacySettingsActivity) this.f39912b), (Object) ((org.telegram.ui.ActionBar.c2) this.f39913c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new rx0((ProfileActivity) this.f39912b, tLObject, (TLRPC.UserFull) this.f39913c, (TL_account.TL_birthday) this.d, tL_error, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new hr((ProfileActivity) this.f39912b, tLObject, (TLRPC.TL_username) this.f39913c, (vy0) this.d, tL_error, 28));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new hr((ProfileActivity) this.f39912b, tLObject, (String) this.f39913c, (TLRPC.User) this.d, tL_error, 29));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ir0((dz0) this.f39912b, tLObject, (UserConfig) this.f39913c, (TLRPC.Photo) this.d, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new rx0((l61) this.f39912b, tL_error, tLObject, (TwoStepVerificationActivity) this.f39913c, (TLRPC.User) this.d));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ir0((Object) ((SessionsActivity) this.f39912b), (Object) ((org.telegram.ui.ActionBar.c2) this.f39913c), (Object) tL_error, (Object) ((TLRPC.TL_authorization) this.d), 12));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ir0((Object) ((SessionsActivity) this.f39912b), (Object) ((org.telegram.ui.ActionBar.c2) this.f39913c), (Object) tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 11));
                return;
            case 10:
                d91 d91Var = (d91) this.f39912b;
                String str = (String) this.f39913c;
                r91 r91Var = (r91) this.d;
                boolean z10 = true;
                rf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        e91 e91Var = d91Var.f37133r;
                        int i9 = e91Var.f37875i;
                        if (e91Var != d91Var.f37484w.f42635w) {
                            z10 = false;
                        }
                        bVar = s91.d0(jSONObject, i9, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(d91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ir0(d91Var, bVar, str, r91Var, 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ir0((nd1) this.f39912b, tLObject, (String) this.f39913c, (org.telegram.ui.ActionBar.c2) this.d, 17));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39912b;
                byte[] bArr = (byte[]) this.f39913c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new ir0((org.telegram.ui.ActionBar.o2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new n21(23, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
