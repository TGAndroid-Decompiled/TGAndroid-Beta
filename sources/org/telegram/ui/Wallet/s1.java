package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ft;
public final class s1 implements Utilities.Callback {
    public final d2 f35473a;
    public final z1 f35474b;
    public final ft f35475c;
    public final boolean d;
    public final h0 f35476e;

    public s1(d2 d2Var, z1 z1Var, ft ftVar, boolean z10, h0 h0Var) {
        this.f35473a = d2Var;
        this.f35474b = z1Var;
        this.f35475c = ftVar;
        this.d = z10;
        this.f35476e = h0Var;
    }

    @Override
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final d2 d2Var = this.f35473a;
        final z1 z1Var = this.f35474b;
        boolean i10 = d2Var.i(z1Var);
        final ft ftVar = this.f35475c;
        if (!i10 && d2Var.y(z1Var)) {
            TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
            tonconnectclaimrequest.session_id = z1Var.f35720a.f20299id;
            tonconnectclaimrequest.msg_id = z1Var.f35721b;
            tonconnectclaimrequest.app_request_id = z1Var.d;
            final boolean z10 = this.d;
            tonconnectclaimrequest.declined = z10;
            tonconnectclaimrequest.challenge_answer = bArr;
            ConnectionsManager connectionsManager = d2Var.f34771f;
            ?? obj2 = new Object();
            final h0 h0Var = this.f35476e;
            connectionsManager.sendRequestTyped(tonconnectclaimrequest, obj2, new Utilities.Callback2() {
                @Override
                public final void run(Object obj3, Object obj4) {
                    int i11;
                    String str;
                    d2 d2Var2 = d2.this;
                    byte[] bArr2 = bArr;
                    z1 z1Var2 = z1Var;
                    ft ftVar2 = ftVar;
                    boolean z11 = z10;
                    h0 h0Var2 = h0Var;
                    TLRPC.Bool bool = (TLRPC.Bool) obj3;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                    if (bArr2 != null) {
                        Arrays.fill(bArr2, (byte) 0);
                    }
                    if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                        z1Var2.f35732o = true;
                        if (!z11 && z1Var2.f35729l < 0) {
                            if ("disconnect".equals(z1Var2.f35723e)) {
                                d2Var2.w(z1Var2, h0Var2, new JSONObject(), -1, null, ftVar2);
                                return;
                            } else if ("signData".equals(z1Var2.f35723e)) {
                                if (d2Var2.y(z1Var2) && !d2Var2.i(z1Var2)) {
                                    Utilities.globalQueue.postRunnable(new m6(d2Var2, h0Var2, z1Var2, ftVar2, 8));
                                    return;
                                } else {
                                    d2Var2.w(z1Var2, h0Var2, null, 0, "Request expired or wallet changed", ftVar2);
                                    return;
                                }
                            } else if ("signMessage".equals(z1Var2.f35723e)) {
                                WalletEngine2 walletEngine2 = d2Var2.f34768b.f35118b;
                                if (walletEngine2 != null && d2Var2.y(z1Var2) && !d2Var2.i(z1Var2)) {
                                    c2 c2Var = z1Var2.f35724f;
                                    walletEngine2.signMessage(h0Var2, c2Var, "ton-connect:" + z1Var2.f35720a.f20299id + ":" + z1Var2.f35721b, new n(d2Var2, z1Var2, h0Var2, ftVar2, 8));
                                    return;
                                }
                                d2Var2.w(z1Var2, h0Var2, null, 0, "Wallet unavailable or request expired", ftVar2);
                                return;
                            } else {
                                d2Var2.z(z1Var2, h0Var2, ftVar2);
                                return;
                            }
                        }
                        if (z11) {
                            i11 = 300;
                        } else {
                            i11 = z1Var2.f35729l;
                        }
                        int i12 = i11;
                        if (z11) {
                            str = "User declined the request";
                        } else {
                            str = z1Var2.f35727j;
                        }
                        d2Var2.w(z1Var2, h0Var2, null, i12, str, ftVar2);
                        return;
                    }
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        z1Var2.f35731n = true;
                    }
                    ftVar2.run(d2.x(tL_error, "claimRequest"));
                }
            });
            return;
        }
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        ftVar.run("Request expired or wallet changed");
    }
}
