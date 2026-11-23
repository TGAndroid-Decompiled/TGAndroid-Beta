package org.telegram.ui.Wallet;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class y0 {
    public static final long[] f45404o = {500, 1000, 3000, 5000, 10000};
    public final int f45405a;
    public final String f45406b;
    public final String f45407c;
    public final l d;
    public final l f45408e;
    public boolean f45409f;
    public int f45410g;
    public int h;
    public int f45412j;
    public int f45411i = -1;
    public int f45413k = -1;
    public final w0 f45414l = new Runnable(this) {
        public final y0 f45328b;

        {
            this.f45328b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    y0 y0Var = this.f45328b;
                    int i7 = y0Var.f45405a;
                    if (y0Var.f45409f) {
                        org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i7 + " msg_hash=" + y0Var.f45406b + " no answer in 45000 ms");
                        y0Var.f45410g = y0Var.f45410g + 1;
                        if (y0Var.f45411i >= 0) {
                            ConnectionsManager.getInstance(i7).cancelRequest(y0Var.f45411i, true);
                            y0Var.f45411i = -1;
                        }
                        y0Var.b();
                        return;
                    }
                    return;
                case 1:
                    final y0 y0Var2 = this.f45328b;
                    int i10 = y0Var2.f45405a;
                    if (y0Var2.f45409f && y0Var2.f45413k < 0) {
                        final int i11 = y0Var2.f45412j + 1;
                        y0Var2.f45412j = i11;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(y0Var2.f45406b) + "&include_actions=false";
                        y0Var2.f45413k = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new p10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x0.a(java.lang.Object, java.lang.Object):void");
                            }
                        }, mp.u1(i10).Q3, 0);
                        return;
                    }
                    return;
                default:
                    final y0 y0Var3 = this.f45328b;
                    if (y0Var3.f45409f) {
                        final int i12 = y0Var3.f45410g + 1;
                        y0Var3.f45410g = i12;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(y0Var3.f45406b);
                        org.telegram.messenger.g0.h3(y0Var3.f45414l, 45000L);
                        y0Var3.f45411i = ConnectionsManager.getInstance(y0Var3.f45405a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new p10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x0.a(java.lang.Object, java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };
    public final w0 f45415m = new Runnable(this) {
        public final y0 f45328b;

        {
            this.f45328b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    y0 y0Var = this.f45328b;
                    int i7 = y0Var.f45405a;
                    if (y0Var.f45409f) {
                        org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i7 + " msg_hash=" + y0Var.f45406b + " no answer in 45000 ms");
                        y0Var.f45410g = y0Var.f45410g + 1;
                        if (y0Var.f45411i >= 0) {
                            ConnectionsManager.getInstance(i7).cancelRequest(y0Var.f45411i, true);
                            y0Var.f45411i = -1;
                        }
                        y0Var.b();
                        return;
                    }
                    return;
                case 1:
                    final y0 y0Var2 = this.f45328b;
                    int i10 = y0Var2.f45405a;
                    if (y0Var2.f45409f && y0Var2.f45413k < 0) {
                        final int i11 = y0Var2.f45412j + 1;
                        y0Var2.f45412j = i11;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(y0Var2.f45406b) + "&include_actions=false";
                        y0Var2.f45413k = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new p10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x0.a(java.lang.Object, java.lang.Object):void");
                            }
                        }, mp.u1(i10).Q3, 0);
                        return;
                    }
                    return;
                default:
                    final y0 y0Var3 = this.f45328b;
                    if (y0Var3.f45409f) {
                        final int i12 = y0Var3.f45410g + 1;
                        y0Var3.f45410g = i12;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(y0Var3.f45406b);
                        org.telegram.messenger.g0.h3(y0Var3.f45414l, 45000L);
                        y0Var3.f45411i = ConnectionsManager.getInstance(y0Var3.f45405a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new p10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x0.a(java.lang.Object, java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };
    public final w0 f45416n = new Runnable(this) {
        public final y0 f45328b;

        {
            this.f45328b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    y0 y0Var = this.f45328b;
                    int i7 = y0Var.f45405a;
                    if (y0Var.f45409f) {
                        org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i7 + " msg_hash=" + y0Var.f45406b + " no answer in 45000 ms");
                        y0Var.f45410g = y0Var.f45410g + 1;
                        if (y0Var.f45411i >= 0) {
                            ConnectionsManager.getInstance(i7).cancelRequest(y0Var.f45411i, true);
                            y0Var.f45411i = -1;
                        }
                        y0Var.b();
                        return;
                    }
                    return;
                case 1:
                    final y0 y0Var2 = this.f45328b;
                    int i10 = y0Var2.f45405a;
                    if (y0Var2.f45409f && y0Var2.f45413k < 0) {
                        final int i11 = y0Var2.f45412j + 1;
                        y0Var2.f45412j = i11;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(y0Var2.f45406b) + "&include_actions=false";
                        y0Var2.f45413k = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new p10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x0.a(java.lang.Object, java.lang.Object):void");
                            }
                        }, mp.u1(i10).Q3, 0);
                        return;
                    }
                    return;
                default:
                    final y0 y0Var3 = this.f45328b;
                    if (y0Var3.f45409f) {
                        final int i12 = y0Var3.f45410g + 1;
                        y0Var3.f45410g = i12;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(y0Var3.f45406b);
                        org.telegram.messenger.g0.h3(y0Var3.f45414l, 45000L);
                        y0Var3.f45411i = ConnectionsManager.getInstance(y0Var3.f45405a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new p10() {
                            @Override
                            public final void a(java.lang.Object r8, java.lang.Object r9) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x0.a(java.lang.Object, java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };

    public y0(int i7, String str, String str2, l lVar, l lVar2) {
        this.f45405a = i7;
        this.f45406b = str;
        this.f45407c = str2;
        this.d = lVar;
        this.f45408e = lVar2;
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        boolean z10;
        JSONObject jSONObject2;
        JSONObject optJSONObject2;
        boolean z11;
        String optString2;
        m0 m0Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("traces");
        JSONObject jSONObject3 = null;
        if (optJSONArray == null) {
            optJSONObject = null;
        } else {
            optJSONObject = optJSONArray.optJSONObject(0);
        }
        String str = this.f45406b;
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
                if (optJSONObject5 != null && v0.c(optJSONObject5.optString("account"), this.f45407c)) {
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
        l lVar = this.f45408e;
        v0 v0Var = lVar.f44598a;
        TL_wallet.walletTransaction wallettransaction = lVar.f44599b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("send completed by the chain: msg_hash=");
        com.google.android.gms.internal.vision.e2.r(sb2, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb2.append(z11);
        v0.P(sb2.toString());
        wallettransaction.f28755id = str2;
        v0Var.h(wallettransaction, z11, optString3);
        if (wallettransaction.nft != null && (m0Var = v0Var.f45267o) != null) {
            m0.a(m0Var, wallettransaction);
            v0Var.f45267o.e();
        }
        v0Var.K();
        return true;
    }

    public final void b() {
        if (!this.f45409f) {
            return;
        }
        int i7 = this.h;
        long j3 = f45404o[i7];
        if (i7 < 4) {
            this.h = i7 + 1;
        }
        org.telegram.messenger.g0.h3(this.f45416n, j3);
    }

    public final void c() {
        this.f45409f = false;
        this.f45410g++;
        this.f45412j++;
        org.telegram.messenger.g0.r(this.f45416n);
        org.telegram.messenger.g0.r(this.f45414l);
        org.telegram.messenger.g0.r(this.f45415m);
        int i7 = this.f45411i;
        int i10 = this.f45405a;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f45411i, true);
            this.f45411i = -1;
        }
        if (this.f45413k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f45413k, true);
            this.f45413k = -1;
        }
    }
}
