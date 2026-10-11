package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class bl0 implements DialogInterface.OnDismissListener {
    public final int f36446a;
    public final boolean[] f36447b;
    public final Object f36448c;
    public final Object d;
    public final Object f36449e;

    public bl0(org.telegram.ui.web.b1 b1Var, boolean[] zArr, ai.ea eaVar, String str) {
        this.f36446a = 1;
        this.f36448c = b1Var;
        this.f36447b = zArr;
        this.d = eaVar;
        this.f36449e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36446a) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f36448c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) this.f36449e;
                this.f36447b[0] = true;
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
                ll0.f39731a = null;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr2[0];
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    e3VarArr2[0] = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f36448c;
                ai.ea eaVar = (ai.ea) this.d;
                String str = (String) this.f36449e;
                b1Var.getClass();
                boolean[] zArr = this.f36447b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b1Var.x(eaVar, "requested_chat_failed", org.telegram.ui.web.b1.A(str, "req_id"));
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f36448c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f36449e;
                if (callback != null && !this.f36447b[0]) {
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
                Utilities.Callback callback3 = (Utilities.Callback) this.f36448c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.f36449e;
                if (callback3 != null && !this.f36447b[0]) {
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

    public bl0(yh.n5 n5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f36446a = i10;
        this.f36448c = callback;
        this.f36447b = zArr;
        this.d = zArr2;
        this.f36449e = obj;
    }

    public bl0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.e3[] e3VarArr2) {
        this.f36446a = 0;
        this.f36447b = zArr;
        this.f36448c = inputtonconnectoauthsessionArr;
        this.d = e3VarArr;
        this.f36449e = e3VarArr2;
    }
}
