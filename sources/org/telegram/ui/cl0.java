package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class cl0 implements DialogInterface.OnDismissListener {
    public final int f36744a;
    public final boolean[] f36745b;
    public final Object f36746c;
    public final Object d;
    public final Object f36747e;

    public cl0(org.telegram.ui.web.b1 b1Var, boolean[] zArr, ai.ea eaVar, String str) {
        this.f36744a = 1;
        this.f36746c = b1Var;
        this.f36745b = zArr;
        this.d = eaVar;
        this.f36747e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36744a) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f36746c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) this.f36747e;
                this.f36745b[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                ml0.f39982a = null;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr2[0];
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    f3VarArr2[0] = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f36746c;
                ai.ea eaVar = (ai.ea) this.d;
                String str = (String) this.f36747e;
                b1Var.getClass();
                boolean[] zArr = this.f36745b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b1Var.x(eaVar, "requested_chat_failed", org.telegram.ui.web.b1.A(str, "req_id"));
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f36746c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f36747e;
                if (callback != null && !this.f36745b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f36746c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.f36747e;
                if (callback3 != null && !this.f36745b[0]) {
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

    public cl0(yh.m5 m5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f36744a = i10;
        this.f36746c = callback;
        this.f36745b = zArr;
        this.d = zArr2;
        this.f36747e = obj;
    }

    public cl0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.f3[] f3VarArr2) {
        this.f36744a = 0;
        this.f36745b = zArr;
        this.f36746c = inputtonconnectoauthsessionArr;
        this.d = f3VarArr;
        this.f36747e = f3VarArr2;
    }
}
