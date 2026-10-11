package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.et;
public final class u1 implements Utilities.Callback {
    public final f2 f35630a;
    public final b2 f35631b;
    public final et f35632c;
    public final boolean d;
    public final i0 f35633e;

    public u1(f2 f2Var, b2 b2Var, et etVar, boolean z10, i0 i0Var) {
        this.f35630a = f2Var;
        this.f35631b = b2Var;
        this.f35632c = etVar;
        this.d = z10;
        this.f35633e = i0Var;
    }

    @Override
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final f2 f2Var = this.f35630a;
        final b2 b2Var = this.f35631b;
        boolean i10 = f2Var.i(b2Var);
        final et etVar = this.f35632c;
        if (!i10 && f2Var.y(b2Var)) {
            TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
            tonconnectclaimrequest.session_id = b2Var.f34710a.f20329id;
            tonconnectclaimrequest.msg_id = b2Var.f34711b;
            tonconnectclaimrequest.app_request_id = b2Var.d;
            final boolean z10 = this.d;
            tonconnectclaimrequest.declined = z10;
            tonconnectclaimrequest.challenge_answer = bArr;
            ConnectionsManager connectionsManager = f2Var.f34928f;
            ?? obj2 = new Object();
            final i0 i0Var = this.f35633e;
            connectionsManager.sendRequestTyped(tonconnectclaimrequest, obj2, new Utilities.Callback2() {
                @Override
                public final void run(Object obj3, Object obj4) {
                    int i11;
                    String str;
                    f2 f2Var2 = f2.this;
                    byte[] bArr2 = bArr;
                    b2 b2Var2 = b2Var;
                    et etVar2 = etVar;
                    boolean z11 = z10;
                    i0 i0Var2 = i0Var;
                    TLRPC.Bool bool = (TLRPC.Bool) obj3;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                    if (bArr2 != null) {
                        Arrays.fill(bArr2, (byte) 0);
                    }
                    if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                        b2Var2.f34722o = true;
                        if (!z11 && b2Var2.f34719l < 0) {
                            if ("disconnect".equals(b2Var2.f34713e)) {
                                f2Var2.w(b2Var2, i0Var2, new JSONObject(), -1, null, etVar2);
                                return;
                            } else if ("signData".equals(b2Var2.f34713e)) {
                                if (f2Var2.y(b2Var2) && !f2Var2.i(b2Var2)) {
                                    Utilities.globalQueue.postRunnable(new o6(f2Var2, i0Var2, b2Var2, etVar2, 8));
                                    return;
                                } else {
                                    f2Var2.w(b2Var2, i0Var2, null, 0, "Request expired or wallet changed", etVar2);
                                    return;
                                }
                            } else if ("signMessage".equals(b2Var2.f34713e)) {
                                WalletEngine2 walletEngine2 = f2Var2.f34925b.f35220b;
                                if (walletEngine2 != null && f2Var2.y(b2Var2) && !f2Var2.i(b2Var2)) {
                                    e2 e2Var = b2Var2.f34714f;
                                    walletEngine2.signMessage(i0Var2, e2Var, "ton-connect:" + b2Var2.f34710a.f20329id + ":" + b2Var2.f34711b, new p(f2Var2, b2Var2, i0Var2, etVar2, 8));
                                    return;
                                }
                                f2Var2.w(b2Var2, i0Var2, null, 0, "Wallet unavailable or request expired", etVar2);
                                return;
                            } else {
                                f2Var2.z(b2Var2, i0Var2, etVar2);
                                return;
                            }
                        }
                        if (z11) {
                            i11 = 300;
                        } else {
                            i11 = b2Var2.f34719l;
                        }
                        int i12 = i11;
                        if (z11) {
                            str = "User declined the request";
                        } else {
                            str = b2Var2.f34717j;
                        }
                        f2Var2.w(b2Var2, i0Var2, null, i12, str, etVar2);
                        return;
                    }
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        b2Var2.f34721n = true;
                    }
                    etVar2.run(f2.x(tL_error, "claimRequest"));
                }
            });
            return;
        }
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        etVar.run("Request expired or wallet changed");
    }
}
