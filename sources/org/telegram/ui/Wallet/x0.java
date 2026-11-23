package org.telegram.ui.Wallet;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class x0 {
    public static final long[] f45242o = {500, 1000, 3000, 5000, 10000};
    public final int f45243a;
    public final String f45244b;
    public final String f45245c;
    public final l d;
    public final l f45246e;
    public boolean f45247f;
    public int f45248g;
    public int h;
    public int f45250j;
    public int f45249i = -1;
    public int f45251k = -1;
    public final v0 f45252l = new Runnable(this) {
        public final x0 f45166b;

        {
            this.f45166b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    x0 x0Var = this.f45166b;
                    int i7 = x0Var.f45243a;
                    if (x0Var.f45247f) {
                        org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i7 + " msg_hash=" + x0Var.f45244b + " no answer in 45000 ms");
                        x0Var.f45248g = x0Var.f45248g + 1;
                        if (x0Var.f45249i >= 0) {
                            ConnectionsManager.getInstance(i7).cancelRequest(x0Var.f45249i, true);
                            x0Var.f45249i = -1;
                        }
                        x0Var.b();
                        return;
                    }
                    return;
                case 1:
                    final x0 x0Var2 = this.f45166b;
                    int i10 = x0Var2.f45243a;
                    if (x0Var2.f45247f && x0Var2.f45251k < 0) {
                        final int i11 = x0Var2.f45250j + 1;
                        x0Var2.f45250j = i11;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(x0Var2.f45244b) + "&include_actions=false";
                        x0Var2.f45251k = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new r10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w0.a(java.lang.Object, java.lang.Object):void");
                            }
                        }, np.u1(i10).Q3, 0);
                        return;
                    }
                    return;
                default:
                    final x0 x0Var3 = this.f45166b;
                    if (x0Var3.f45247f) {
                        final int i12 = x0Var3.f45248g + 1;
                        x0Var3.f45248g = i12;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(x0Var3.f45244b);
                        org.telegram.messenger.g0.h3(x0Var3.f45252l, 45000L);
                        x0Var3.f45249i = ConnectionsManager.getInstance(x0Var3.f45243a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new r10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w0.a(java.lang.Object, java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };
    public final v0 f45253m = new Runnable(this) {
        public final x0 f45166b;

        {
            this.f45166b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    x0 x0Var = this.f45166b;
                    int i7 = x0Var.f45243a;
                    if (x0Var.f45247f) {
                        org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i7 + " msg_hash=" + x0Var.f45244b + " no answer in 45000 ms");
                        x0Var.f45248g = x0Var.f45248g + 1;
                        if (x0Var.f45249i >= 0) {
                            ConnectionsManager.getInstance(i7).cancelRequest(x0Var.f45249i, true);
                            x0Var.f45249i = -1;
                        }
                        x0Var.b();
                        return;
                    }
                    return;
                case 1:
                    final x0 x0Var2 = this.f45166b;
                    int i10 = x0Var2.f45243a;
                    if (x0Var2.f45247f && x0Var2.f45251k < 0) {
                        final int i11 = x0Var2.f45250j + 1;
                        x0Var2.f45250j = i11;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(x0Var2.f45244b) + "&include_actions=false";
                        x0Var2.f45251k = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new r10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w0.a(java.lang.Object, java.lang.Object):void");
                            }
                        }, np.u1(i10).Q3, 0);
                        return;
                    }
                    return;
                default:
                    final x0 x0Var3 = this.f45166b;
                    if (x0Var3.f45247f) {
                        final int i12 = x0Var3.f45248g + 1;
                        x0Var3.f45248g = i12;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(x0Var3.f45244b);
                        org.telegram.messenger.g0.h3(x0Var3.f45252l, 45000L);
                        x0Var3.f45249i = ConnectionsManager.getInstance(x0Var3.f45243a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new r10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w0.a(java.lang.Object, java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };
    public final v0 f45254n = new Runnable(this) {
        public final x0 f45166b;

        {
            this.f45166b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    x0 x0Var = this.f45166b;
                    int i7 = x0Var.f45243a;
                    if (x0Var.f45247f) {
                        org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i7 + " msg_hash=" + x0Var.f45244b + " no answer in 45000 ms");
                        x0Var.f45248g = x0Var.f45248g + 1;
                        if (x0Var.f45249i >= 0) {
                            ConnectionsManager.getInstance(i7).cancelRequest(x0Var.f45249i, true);
                            x0Var.f45249i = -1;
                        }
                        x0Var.b();
                        return;
                    }
                    return;
                case 1:
                    final x0 x0Var2 = this.f45166b;
                    int i10 = x0Var2.f45243a;
                    if (x0Var2.f45247f && x0Var2.f45251k < 0) {
                        final int i11 = x0Var2.f45250j + 1;
                        x0Var2.f45250j = i11;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(x0Var2.f45244b) + "&include_actions=false";
                        x0Var2.f45251k = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new r10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w0.a(java.lang.Object, java.lang.Object):void");
                            }
                        }, np.u1(i10).Q3, 0);
                        return;
                    }
                    return;
                default:
                    final x0 x0Var3 = this.f45166b;
                    if (x0Var3.f45247f) {
                        final int i12 = x0Var3.f45248g + 1;
                        x0Var3.f45248g = i12;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(x0Var3.f45244b);
                        org.telegram.messenger.g0.h3(x0Var3.f45252l, 45000L);
                        x0Var3.f45249i = ConnectionsManager.getInstance(x0Var3.f45243a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new r10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w0.a(java.lang.Object, java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };

    public x0(int i7, String str, String str2, l lVar, l lVar2) {
        this.f45243a = i7;
        this.f45244b = str;
        this.f45245c = str2;
        this.d = lVar;
        this.f45246e = lVar2;
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        boolean z10;
        JSONObject jSONObject2;
        JSONObject optJSONObject2;
        boolean z11;
        String optString2;
        l0 l0Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("traces");
        JSONObject jSONObject3 = null;
        if (optJSONArray == null) {
            optJSONObject = null;
        } else {
            optJSONObject = optJSONArray.optJSONObject(0);
        }
        String str = this.f45244b;
        if (optJSONObject == null) {
            org.telegram.messenger.a8.b("[gram-wallet-polling] chain: msg_hash=" + str + " not on chain yet");
            return false;
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("trace_info");
        if (optJSONObject3 == null) {
            optString = "";
        } else {
            optString = optJSONObject3.optString("trace_state");
        }
        if (!optJSONObject.optBoolean("is_incomplete", true) && "complete".equals(optString) && (optJSONObject3 == null || optJSONObject3.optInt("pending_messages", 0) == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject optJSONObject4 = optJSONObject.optJSONObject("transactions");
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("transactions_order");
        if (optJSONObject4 != null && optJSONArray2 != null) {
            jSONObject2 = null;
            for (int i7 = 0; i7 < optJSONArray2.length() && jSONObject2 == null; i7++) {
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject(optJSONArray2.optString(i7));
                if (optJSONObject5 != null && u0.c(optJSONObject5.optString("account"), this.f45245c)) {
                    jSONObject2 = optJSONObject5;
                }
            }
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str, " trace=");
            u10.append(optJSONObject.optString("trace_id"));
            u10.append(" state=");
            u10.append(optString);
            p5.c.s(", no transaction of the wallet yet", u10);
            return false;
        }
        JSONObject optJSONObject6 = jSONObject2.optJSONObject("description");
        if (optJSONObject6 == null) {
            optJSONObject2 = null;
        } else {
            optJSONObject2 = optJSONObject6.optJSONObject("compute_ph");
        }
        if (optJSONObject6 != null) {
            jSONObject3 = optJSONObject6.optJSONObject("action");
        }
        if (optJSONObject6 != null && !optJSONObject6.optBoolean("aborted", false) && ((optJSONObject2 == null || optJSONObject2.optBoolean("success", true)) && (jSONObject3 == null || jSONObject3.optBoolean("success", true)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        JSONObject optJSONObject7 = jSONObject2.optJSONObject("in_msg");
        String optString3 = jSONObject2.optString("hash");
        String str2 = jSONObject2.optString("lt") + ":" + optString3;
        StringBuilder u11 = a8.p0.u("[gram-wallet-polling] chain: expected msg_hash=", str, ", trace=");
        u11.append(optJSONObject.optString("trace_id"));
        u11.append(" (external ");
        u11.append(optJSONObject.optString("external_hash"));
        u11.append(") state=");
        u11.append(optString);
        u11.append(" complete=");
        u11.append(z10);
        u11.append(", wallet tx id=");
        u11.append(str2);
        u11.append(" in_msg=");
        if (optJSONObject7 == null) {
            optString2 = "none";
        } else {
            optString2 = optJSONObject7.optString("hash");
        }
        u11.append(optString2);
        u11.append(" success=");
        u11.append(z11);
        org.telegram.messenger.a8.b(u11.toString());
        if (!z10 || TextUtils.isEmpty(optString3)) {
            return false;
        }
        l lVar = this.f45246e;
        u0 u0Var = lVar.f44468a;
        TL_wallet.walletTransaction wallettransaction = lVar.f44469b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("send completed by the chain: msg_hash=");
        com.google.android.gms.internal.vision.e2.r(sb2, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb2.append(z11);
        u0.P(sb2.toString());
        wallettransaction.f28661id = str2;
        u0Var.h(wallettransaction, z11, optString3);
        if (wallettransaction.nft != null && (l0Var = u0Var.f45105o) != null) {
            l0.a(l0Var, wallettransaction);
            u0Var.f45105o.e();
        }
        u0Var.K();
        return true;
    }

    public final void b() {
        if (!this.f45247f) {
            return;
        }
        int i7 = this.h;
        long j3 = f45242o[i7];
        if (i7 < 4) {
            this.h = i7 + 1;
        }
        org.telegram.messenger.g0.h3(this.f45254n, j3);
    }

    public final void c() {
        this.f45247f = false;
        this.f45248g++;
        this.f45250j++;
        org.telegram.messenger.g0.r(this.f45254n);
        org.telegram.messenger.g0.r(this.f45252l);
        org.telegram.messenger.g0.r(this.f45253m);
        int i7 = this.f45249i;
        int i10 = this.f45243a;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f45249i, true);
            this.f45249i = -1;
        }
        if (this.f45251k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f45251k, true);
            this.f45251k = -1;
        }
    }
}
