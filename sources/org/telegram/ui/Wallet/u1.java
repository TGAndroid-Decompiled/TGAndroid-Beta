package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.d01;
public final class u1 implements r20 {
    public final int f35266a = 0;
    public final boolean f35267b;
    public final Object f35268c;
    public final Object d;
    public final Object e;
    public final Object f35269f;

    public u1(e2 e2Var, a2 a2Var, d01 d01Var, boolean z10, h0 h0Var) {
        this.f35268c = e2Var;
        this.d = a2Var;
        this.e = d01Var;
        this.f35267b = z10;
        this.f35269f = h0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35266a) {
            case 0:
                e2 e2Var = (e2) this.f35268c;
                a2 a2Var = (a2) this.d;
                d01 d01Var = (d01) this.e;
                h0 h0Var = (h0) this.f35269f;
                byte[] bArr = (byte[]) obj;
                if (!e2Var.j(a2Var) && e2Var.A(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.f34169a.f20056id;
                    tonconnectclaimrequest.msg_id = a2Var.f34170b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    boolean z10 = this.f35267b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f34453f.sendRequestTyped(tonconnectclaimrequest, new a3.b(1), new v1(e2Var, bArr, a2Var, d01Var, z10, h0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                d01Var.a("Request expired or wallet changed");
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f35268c;
                gf.e eVar = (gf.e) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f35269f;
                if (((Boolean) obj).booleanValue()) {
                    e20 i10 = e20.i(e4Var.f21584a);
                    i10.f15534y = null;
                    i10.v(false);
                    e4Var.V1(this.f35267b, eVar, runnable);
                    return;
                }
                eVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
        }
    }

    public u1(rh.e4 e4Var, boolean z10, gf.e eVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f35268c = e4Var;
        this.f35267b = z10;
        this.d = eVar;
        this.e = runnable;
        this.f35269f = dialogInterface;
    }
}
