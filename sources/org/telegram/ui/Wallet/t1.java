package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ft;
public final class t1 implements Utilities.Callback {
    public final e2 f35566a;
    public final a2 f35567b;
    public final ft f35568c;
    public final boolean d;
    public final h0 f35569e;

    public t1(e2 e2Var, a2 a2Var, ft ftVar, boolean z10, h0 h0Var) {
        this.f35566a = e2Var;
        this.f35567b = a2Var;
        this.f35568c = ftVar;
        this.d = z10;
        this.f35569e = h0Var;
    }

    @Override
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final e2 e2Var = this.f35566a;
        final a2 a2Var = this.f35567b;
        boolean i10 = e2Var.i(a2Var);
        final ft ftVar = this.f35568c;
        if (!i10 && e2Var.y(a2Var)) {
            TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
            tonconnectclaimrequest.session_id = a2Var.f34648a.f20303id;
            tonconnectclaimrequest.msg_id = a2Var.f34649b;
            tonconnectclaimrequest.app_request_id = a2Var.d;
            final boolean z10 = this.d;
            tonconnectclaimrequest.declined = z10;
            tonconnectclaimrequest.challenge_answer = bArr;
            ConnectionsManager connectionsManager = e2Var.f34862f;
            ?? obj2 = new Object();
            final h0 h0Var = this.f35569e;
            connectionsManager.sendRequestTyped(tonconnectclaimrequest, obj2, new Utilities.Callback2() {
                @Override
                public final void run(Object obj3, Object obj4) {
                    int i11;
                    String str;
                    e2 e2Var2 = e2.this;
                    byte[] bArr2 = bArr;
                    a2 a2Var2 = a2Var;
                    ft ftVar2 = ftVar;
                    boolean z11 = z10;
                    h0 h0Var2 = h0Var;
                    TLRPC.Bool bool = (TLRPC.Bool) obj3;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                    if (bArr2 != null) {
                        Arrays.fill(bArr2, (byte) 0);
                    }
                    if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                        a2Var2.f34660o = true;
                        if (!z11 && a2Var2.f34657l < 0) {
                            if ("disconnect".equals(a2Var2.f34651e)) {
                                e2Var2.w(a2Var2, h0Var2, new JSONObject(), -1, null, ftVar2);
                                return;
                            } else if ("signData".equals(a2Var2.f34651e)) {
                                if (e2Var2.y(a2Var2) && !e2Var2.i(a2Var2)) {
                                    Utilities.globalQueue.postRunnable(new n6(e2Var2, h0Var2, a2Var2, ftVar2, 8));
                                    return;
                                } else {
                                    e2Var2.w(a2Var2, h0Var2, null, 0, "Request expired or wallet changed", ftVar2);
                                    return;
                                }
                            } else if ("signMessage".equals(a2Var2.f34651e)) {
                                WalletEngine2 walletEngine2 = e2Var2.f34859b.f35156b;
                                if (walletEngine2 != null && e2Var2.y(a2Var2) && !e2Var2.i(a2Var2)) {
                                    d2 d2Var = a2Var2.f34652f;
                                    walletEngine2.signMessage(h0Var2, d2Var, "ton-connect:" + a2Var2.f34648a.f20303id + ":" + a2Var2.f34649b, new o(e2Var2, a2Var2, h0Var2, ftVar2, 8));
                                    return;
                                }
                                e2Var2.w(a2Var2, h0Var2, null, 0, "Wallet unavailable or request expired", ftVar2);
                                return;
                            } else {
                                e2Var2.z(a2Var2, h0Var2, ftVar2);
                                return;
                            }
                        }
                        if (z11) {
                            i11 = 300;
                        } else {
                            i11 = a2Var2.f34657l;
                        }
                        int i12 = i11;
                        if (z11) {
                            str = "User declined the request";
                        } else {
                            str = a2Var2.f34655j;
                        }
                        e2Var2.w(a2Var2, h0Var2, null, i12, str, ftVar2);
                        return;
                    }
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        a2Var2.f34659n = true;
                    }
                    ftVar2.run(e2.x(tL_error, "claimRequest"));
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
