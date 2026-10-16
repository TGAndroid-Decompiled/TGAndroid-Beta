package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;
public final class t1 implements Utilities.Callback {
    public final e2 f33449a;
    public final a2 f33450b;
    public final mt f33451c;
    public final boolean d;
    public final h0 e;

    public t1(e2 e2Var, a2 a2Var, mt mtVar, boolean z10, h0 h0Var) {
        this.f33449a = e2Var;
        this.f33450b = a2Var;
        this.f33451c = mtVar;
        this.d = z10;
        this.e = h0Var;
    }

    @Override
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final e2 e2Var = this.f33449a;
        final a2 a2Var = this.f33450b;
        boolean i10 = e2Var.i(a2Var);
        final mt mtVar = this.f33451c;
        if (!i10 && e2Var.y(a2Var)) {
            TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
            tonconnectclaimrequest.session_id = a2Var.f32617a.f19175id;
            tonconnectclaimrequest.msg_id = a2Var.f32618b;
            tonconnectclaimrequest.app_request_id = a2Var.d;
            final boolean z10 = this.d;
            tonconnectclaimrequest.declined = z10;
            tonconnectclaimrequest.challenge_answer = bArr;
            ConnectionsManager connectionsManager = e2Var.f32820f;
            ?? obj2 = new Object();
            final h0 h0Var = this.e;
            connectionsManager.sendRequestTyped(tonconnectclaimrequest, obj2, new Utilities.Callback2() {
                @Override
                public final void run(Object obj3, Object obj4) {
                    int i11;
                    String str;
                    e2 e2Var2 = e2.this;
                    byte[] bArr2 = bArr;
                    a2 a2Var2 = a2Var;
                    mt mtVar2 = mtVar;
                    boolean z11 = z10;
                    h0 h0Var2 = h0Var;
                    TLRPC.Bool bool = (TLRPC.Bool) obj3;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                    if (bArr2 != null) {
                        Arrays.fill(bArr2, (byte) 0);
                    }
                    if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                        a2Var2.f32628o = true;
                        if (!z11 && a2Var2.f32625l < 0) {
                            if ("disconnect".equals(a2Var2.e)) {
                                e2Var2.w(a2Var2, h0Var2, new JSONObject(), -1, null, mtVar2);
                                return;
                            } else if ("signData".equals(a2Var2.e)) {
                                if (e2Var2.y(a2Var2) && !e2Var2.i(a2Var2)) {
                                    Utilities.globalQueue.postRunnable(new m6(e2Var2, h0Var2, a2Var2, mtVar2, 8));
                                    return;
                                } else {
                                    e2Var2.w(a2Var2, h0Var2, null, 0, "Request expired or wallet changed", mtVar2);
                                    return;
                                }
                            } else if ("signMessage".equals(a2Var2.e)) {
                                WalletEngine2 walletEngine2 = e2Var2.f32818b.f33093b;
                                if (walletEngine2 != null && e2Var2.y(a2Var2) && !e2Var2.i(a2Var2)) {
                                    d2 d2Var = a2Var2.f32620f;
                                    walletEngine2.signMessage(h0Var2, d2Var, "ton-connect:" + a2Var2.f32617a.f19175id + ":" + a2Var2.f32618b, new o(e2Var2, a2Var2, h0Var2, mtVar2, 8));
                                    return;
                                }
                                e2Var2.w(a2Var2, h0Var2, null, 0, "Wallet unavailable or request expired", mtVar2);
                                return;
                            } else {
                                e2Var2.z(a2Var2, h0Var2, mtVar2);
                                return;
                            }
                        }
                        if (z11) {
                            i11 = 300;
                        } else {
                            i11 = a2Var2.f32625l;
                        }
                        int i12 = i11;
                        if (z11) {
                            str = "User declined the request";
                        } else {
                            str = a2Var2.f32623j;
                        }
                        e2Var2.w(a2Var2, h0Var2, null, i12, str, mtVar2);
                        return;
                    }
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        a2Var2.f32627n = true;
                    }
                    mtVar2.run(e2.x(tL_error, "claimRequest"));
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
