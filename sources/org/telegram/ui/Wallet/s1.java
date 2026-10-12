package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;
public final class s1 implements Utilities.Callback {
    public final d2 f33675a;
    public final z1 f33676b;
    public final mt f33677c;
    public final boolean d;
    public final g0 e;

    public s1(d2 d2Var, z1 z1Var, mt mtVar, boolean z10, g0 g0Var) {
        this.f33675a = d2Var;
        this.f33676b = z1Var;
        this.f33677c = mtVar;
        this.d = z10;
        this.e = g0Var;
    }

    @Override
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final d2 d2Var = this.f33675a;
        final z1 z1Var = this.f33676b;
        boolean i10 = d2Var.i(z1Var);
        final mt mtVar = this.f33677c;
        if (!i10 && d2Var.y(z1Var)) {
            TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
            tonconnectclaimrequest.session_id = z1Var.f33900a.f19475id;
            tonconnectclaimrequest.msg_id = z1Var.f33901b;
            tonconnectclaimrequest.app_request_id = z1Var.d;
            final boolean z10 = this.d;
            tonconnectclaimrequest.declined = z10;
            tonconnectclaimrequest.challenge_answer = bArr;
            ConnectionsManager connectionsManager = d2Var.f33043f;
            ?? obj2 = new Object();
            final g0 g0Var = this.e;
            connectionsManager.sendRequestTyped(tonconnectclaimrequest, obj2, new Utilities.Callback2() {
                @Override
                public final void run(Object obj3, Object obj4) {
                    int i11;
                    String str;
                    d2 d2Var2 = d2.this;
                    byte[] bArr2 = bArr;
                    z1 z1Var2 = z1Var;
                    mt mtVar2 = mtVar;
                    boolean z11 = z10;
                    g0 g0Var2 = g0Var;
                    TLRPC.Bool bool = (TLRPC.Bool) obj3;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                    if (bArr2 != null) {
                        Arrays.fill(bArr2, (byte) 0);
                    }
                    if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                        z1Var2.f33911o = true;
                        if (!z11 && z1Var2.f33908l < 0) {
                            if ("disconnect".equals(z1Var2.e)) {
                                d2Var2.w(z1Var2, g0Var2, new JSONObject(), -1, null, mtVar2);
                                return;
                            } else if ("signData".equals(z1Var2.e)) {
                                if (d2Var2.y(z1Var2) && !d2Var2.i(z1Var2)) {
                                    Utilities.globalQueue.postRunnable(new l6(d2Var2, g0Var2, z1Var2, mtVar2, 8));
                                    return;
                                } else {
                                    d2Var2.w(z1Var2, g0Var2, null, 0, "Request expired or wallet changed", mtVar2);
                                    return;
                                }
                            } else if ("signMessage".equals(z1Var2.e)) {
                                WalletEngine2 walletEngine2 = d2Var2.f33041b.f33320b;
                                if (walletEngine2 != null && d2Var2.y(z1Var2) && !d2Var2.i(z1Var2)) {
                                    c2 c2Var = z1Var2.f33903f;
                                    walletEngine2.signMessage(g0Var2, c2Var, "ton-connect:" + z1Var2.f33900a.f19475id + ":" + z1Var2.f33901b, new n(d2Var2, z1Var2, g0Var2, mtVar2, 8));
                                    return;
                                }
                                d2Var2.w(z1Var2, g0Var2, null, 0, "Wallet unavailable or request expired", mtVar2);
                                return;
                            } else {
                                d2Var2.z(z1Var2, g0Var2, mtVar2);
                                return;
                            }
                        }
                        if (z11) {
                            i11 = 300;
                        } else {
                            i11 = z1Var2.f33908l;
                        }
                        int i12 = i11;
                        if (z11) {
                            str = "User declined the request";
                        } else {
                            str = z1Var2.f33906j;
                        }
                        d2Var2.w(z1Var2, g0Var2, null, i12, str, mtVar2);
                        return;
                    }
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        z1Var2.f33910n = true;
                    }
                    mtVar2.run(d2.x(tL_error, "claimRequest"));
                }
            });
            return;
        }
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        mtVar.run("Request expired or wallet changed");
    }
}
