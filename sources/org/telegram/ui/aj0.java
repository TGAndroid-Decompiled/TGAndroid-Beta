package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;
public final class aj0 implements DialogInterface.OnDismissListener {
    public final int f35661a;
    public final boolean[] f35662b;
    public final Object f35663c;
    public final Object d;
    public final Object e;

    public aj0(org.telegram.ui.web.z0 z0Var, boolean[] zArr, org.telegram.ui.web.x0 x0Var, String str) {
        this.f35661a = 1;
        this.f35663c = z0Var;
        this.f35662b = zArr;
        this.d = x0Var;
        this.e = str;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35661a) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f35663c;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.d;
                org.telegram.ui.ActionBar.z2[] z2VarArr2 = (org.telegram.ui.ActionBar.z2[]) this.e;
                this.f35662b[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                }
                jj0.f38536a = null;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2VarArr2[0];
                if (z2Var2 != null) {
                    z2Var2.dismiss();
                    z2VarArr2[0] = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f35663c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                String str = (String) this.e;
                z0Var.getClass();
                boolean[] zArr = this.f35662b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str, "req_id"));
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f35663c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) this.e;
                if (q20Var != null && !this.f35662b[0]) {
                    q20Var.a(Boolean.FALSE);
                    if (!zArr2[0]) {
                        j20Var.a("cancelled", 0L);
                        zArr2[0] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) this.f35663c;
                boolean[] zArr3 = (boolean[]) this.d;
                org.telegram.messenger.q20 q20Var3 = (org.telegram.messenger.q20) this.e;
                if (q20Var2 != null && !this.f35662b[0]) {
                    q20Var2.a(Boolean.FALSE);
                    if (!zArr3[0] && q20Var3 != null) {
                        q20Var3.a("cancelled");
                        zArr3[0] = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public aj0(rh.e6 e6Var, org.telegram.messenger.q20 q20Var, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.f35661a = i10;
        this.f35663c = q20Var;
        this.f35662b = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    public aj0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.ui.ActionBar.z2[] z2VarArr2) {
        this.f35661a = 0;
        this.f35662b = zArr;
        this.f35663c = inputtonconnectoauthsessionArr;
        this.d = z2VarArr;
        this.e = z2VarArr2;
    }
}
