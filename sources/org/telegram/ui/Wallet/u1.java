package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;
public final class u1 implements q20 {
    public final int f35264a = 0;
    public final boolean f35265b;
    public final Object f35266c;
    public final Object d;
    public final Object e;
    public final Object f35267f;

    public u1(e2 e2Var, a2 a2Var, f11 f11Var, boolean z10, h0 h0Var) {
        this.f35266c = e2Var;
        this.d = a2Var;
        this.e = f11Var;
        this.f35265b = z10;
        this.f35267f = h0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35264a) {
            case 0:
                e2 e2Var = (e2) this.f35266c;
                a2 a2Var = (a2) this.d;
                f11 f11Var = (f11) this.e;
                h0 h0Var = (h0) this.f35267f;
                byte[] bArr = (byte[]) obj;
                if (!e2Var.j(a2Var) && e2Var.A(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.f34162a.f20055id;
                    tonconnectclaimrequest.msg_id = a2Var.f34163b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    boolean z10 = this.f35265b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f34448f.sendRequestTyped(tonconnectclaimrequest, new a3.b(1), new v1(e2Var, bArr, a2Var, f11Var, z10, h0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                f11Var.a("Request expired or wallet changed");
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f35266c;
                gf.e eVar = (gf.e) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f35267f;
                if (((Boolean) obj).booleanValue()) {
                    d20 i10 = d20.i(e4Var.f21583a);
                    i10.f15175y = null;
                    i10.v(false);
                    e4Var.V1(this.f35265b, eVar, runnable);
                    return;
                }
                eVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
        }
    }

    public u1(rh.e4 e4Var, boolean z10, gf.e eVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f35266c = e4Var;
        this.f35265b = z10;
        this.d = eVar;
        this.e = runnable;
        this.f35267f = dialogInterface;
    }
}
