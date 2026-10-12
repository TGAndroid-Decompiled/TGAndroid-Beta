package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class hl0 implements DialogInterface.OnDismissListener {
    public final int f36879a;
    public final boolean[] f36880b;
    public final Object f36881c;
    public final Object d;
    public final Object e;

    public hl0(org.telegram.ui.web.b1 b1Var, boolean[] zArr, bi.n9 n9Var, String str) {
        this.f36879a = 1;
        this.f36881c = b1Var;
        this.f36880b = zArr;
        this.d = n9Var;
        this.e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36879a) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f36881c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) this.e;
                this.f36880b[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                rl0.f39819a = null;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr2[0];
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    e3VarArr2[0] = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f36881c;
                bi.n9 n9Var = (bi.n9) this.d;
                String str = (String) this.e;
                b1Var.getClass();
                boolean[] zArr = this.f36880b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b1Var.x(n9Var, "requested_chat_failed", org.telegram.ui.web.b1.A(str, "req_id"));
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f36881c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.f36880b[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr2[0]) {
                        callback2.run("cancelled", 0L);
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback3 = (Utilities.Callback) this.f36881c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.f36880b[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr3[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr3[0] = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public hl0(zh.n5 n5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f36879a = i10;
        this.f36881c = callback;
        this.f36880b = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    public hl0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.e3[] e3VarArr2) {
        this.f36879a = 0;
        this.f36880b = zArr;
        this.f36881c = inputtonconnectoauthsessionArr;
        this.d = e3VarArr;
        this.e = e3VarArr2;
    }
}
