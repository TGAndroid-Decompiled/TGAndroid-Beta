package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ce;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.ao0;
public abstract class a3 {
    public static final ArrayList f44044a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(user);
        p9Var.f(user, a9Var);
        linearLayout.addView(p9Var, c8.na.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = m2.v(20, context, charSequence, i6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, c8.na.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String o4 = n10.o(user);
        if (!TextUtils.isEmpty(o4)) {
            linearLayout.addView(m2.h(context, "@" + o4, i6Var), c8.na.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), c8.na.o(-1, 12));
    }

    public static void b(e3 e3Var, z2 z2Var) {
        e3Var.f30232d0 = false;
        e3Var.f30269z0 = new org.telegram.ui.h0(z2Var, 3);
        e3Var.setOnDismissListener(new r2(z2Var, 0));
        e3Var.show();
        org.telegram.messenger.g0.h3(new r(3, z2Var, e3Var), 700L);
    }

    public static void c(Context context, final int i7, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.i6 i6Var, x2 x2Var) {
        int i10;
        int i11;
        float f10;
        String N0;
        int i12;
        final v0 D = v0.D(i7);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final e3 e3Var = new e3(context, i6Var, new View[0]);
        e3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, gd.V(null, null, 2131742945, n10.q(user)), i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.n6.f29451d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        if (equals) {
            i10 = 2131742739;
        } else {
            i10 = 2131742933;
        }
        TextView v = m2.v(14, context, gd.N0(i10, null), i6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        if (equals) {
            i11 = org.telegram.ui.ActionBar.n6.L6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29692q7;
        }
        org.telegram.ui.ActionBar.u6.U(v, i11, i6Var);
        if (equals) {
            f10 = 12.0f;
        } else {
            f10 = 4.0f;
        }
        g10.addView(v, c8.na.k(0.0f, 0.0f, 0.0f, f10, -1, -2));
        if (equals) {
            N0 = jSONObject.optString("text");
        } else {
            N0 = gd.N0(2131742932, null);
        }
        if (equals) {
            i12 = 14;
        } else {
            i12 = 16;
        }
        TextView v10 = m2.v(i12, context, N0, i6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        g10.addView(v10, c8.na.o(-1, -2));
        w2 w2Var = new w2(context, 320);
        w2Var.addView(g10);
        linearLayout.addView(w2Var, c8.na.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        d3 d3Var = new d3(context);
        d3Var.getContent().addView(linearLayout, c8.na.c(-2.0f, -1));
        e3Var.J0(d3Var);
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
        if (equals) {
            TextView v11 = m2.v(14, context, gd.N0(2131742758, null), i6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.u6.U(v11, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
            g11.addView(v11, c8.na.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.setRoundRadius(24);
        eVar.e();
        eVar.setText(gd.N0(2131752577, null));
        final hi.e g12 = m10.g(24, context, i6Var, true);
        g12.setText(gd.N0(2131742741, null));
        linearLayout2.addView(eVar, c8.na.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(g12, c8.na.m(1.0f, 0, 44, 6, 0, 0));
        g11.addView(linearLayout2);
        e3Var.L0(g11);
        final z2 z2Var = new z2(e3Var, x2Var);
        final p pVar = new p(z2Var, g12, eVar, 9);
        z2Var.f45476g = pVar;
        eVar.setOnClickListener(new o2(z2Var, 1));
        g12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final z2 z2Var2 = z2Var;
                if (!z2Var2.a() && !z2Var2.d) {
                    z2Var2.d = true;
                    final hi.e eVar2 = g12;
                    eVar2.setLoading(true);
                    final p pVar2 = pVar;
                    pVar2.run();
                    final int i14 = i7;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    final v0 v0Var = D;
                    final e3 e3Var2 = e3Var;
                    final byte[] bArr2 = bArr;
                    v0Var.F(true, false, false, new p10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            z2 z2Var3 = z2Var2;
                            hi.e eVar3 = eVar2;
                            e3 e3Var3 = e3Var2;
                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                            p pVar3 = pVar2;
                            v0 v0Var2 = v0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i15 = i14;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            s0 s0Var = (s0) obj;
                            String str4 = (String) obj2;
                            if (!z2Var3.f45474e) {
                                if (s0Var != null && str4 == null) {
                                    if (str3.equals(v0Var2.y()) && Arrays.equals(bArr3, v0Var2.E())) {
                                        s0 b10 = s0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                                        Utilities.f22877e.c(new ce(b10, str3, bArr3, jSONObject3, "bot" + user3.f28641id, currentTime, z2Var3, v0Var2));
                                        return;
                                    }
                                    kc.c0(gd.N0(2131742688, null));
                                    z2Var3.d = false;
                                    if (!z2Var3.f45475f) {
                                        z2Var3.f45475f = true;
                                        z2Var3.f45472b.a();
                                    }
                                    if (!z2Var3.f45474e) {
                                        z2Var3.f45471a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                z2Var3.d = false;
                                eVar3.setLoading(false);
                                if (str4 != null) {
                                    kc.d0(str4, e3Var3.F, i6Var3);
                                }
                                pVar3.run();
                            }
                        }
                    });
                }
            }
        });
        b(e3Var, z2Var);
        pVar.run();
    }

    public static void d(final Context context, final int i7, final TLRPC.User user, final l2 l2Var, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.i6 i6Var, x2 x2Var) {
        int i10;
        final v0 D = v0.D(i7);
        char c10 = 0;
        final e3 e3Var = new e3(context, i6Var, new View[0]);
        e3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, gd.V(null, null, 2131742944, n10.q(user)), i6Var);
        y6 y6Var = new y6(context, 2131232815, 24);
        y6Var.getCardHolderView().setMaxLines(2);
        y6Var.getCardHolderView().setSingleLine(false);
        List<k2> list = l2Var.f44607b;
        y6Var.setCardHolder(v8.c0(((k2) list.get(0)).f44556a));
        org.telegram.ui.Components.n6 balanceView = y6Var.getBalanceView();
        long j3 = l2Var.f44608c;
        balanceView.setText(m2.k(j3));
        y6Var.getUsdBalanceView().setText(D.r(j3, false));
        linearLayout.addView(y6Var, c8.na.o(-1, -2));
        LinearLayout F = m2.F(context, gd.N0(2131742956, null), i6Var);
        for (k2 k2Var : list) {
            if (k2Var.f44557b != null && k2Var.d == null) {
                i10 = 2131742902;
            } else {
                i10 = 2131742710;
            }
            String N0 = gd.N0(i10, null);
            Object[] objArr = new Object[1];
            objArr[c10] = m2.C(k2Var.f44556a);
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(m2.c(context, N0, gd.V(null, null, 2131742705, objArr), m2.b(-k2Var.f44559e), k2Var.d, i6Var), c8.na.o(-1, -2));
            F = linearLayout2;
            c10 = 0;
        }
        LinearLayout linearLayout3 = F;
        w2 w2Var = new w2(context, 240);
        w2Var.addView(linearLayout3);
        linearLayout.addView(w2Var, c8.na.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        d3 d3Var = new d3(context);
        d3Var.getContent().addView(linearLayout, c8.na.c(-2.0f, -1));
        e3Var.J0(d3Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView v = m2.v(14, context, null, i6Var);
        org.telegram.ui.ActionBar.u6.U(v, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        g10.addView(v, c8.na.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.setRoundRadius(24);
        eVar.e();
        eVar.setText(gd.N0(2131742892, null));
        linearLayout4.addView(eVar, c8.na.m(1.0f, 0, 44, 0, 6, 0));
        final hi.e g11 = m10.g(24, context, i6Var, true);
        g11.setText(gd.N0(2131742917, null));
        linearLayout4.addView(g11, c8.na.m(1.0f, 0, 44, 6, 0, 0));
        g10.addView(linearLayout4);
        e3Var.L0(g10);
        final z2 z2Var = new z2(e3Var, x2Var);
        final int[] iArr = {0};
        final w7 w7Var = new w7(z2Var, g11, iArr, eVar, 9);
        final Runnable[] runnableArr = {new bi.n2(z2Var, iArr, v, w7Var, D, l2Var, 25)};
        fs fsVar = new fs() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr2) {
                if (iArr[0] == 2 && D.A() >= l2Var.f44608c) {
                    runnableArr[0].run();
                }
            }
        };
        ks.f(i7).b(fsVar, ks.f25201d4);
        z2Var.h = new ao0(i7, fsVar, 8);
        z2Var.f45476g = w7Var;
        eVar.setOnClickListener(new o2(z2Var, 0));
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final z2 z2Var2 = z2.this;
                if (!z2Var2.a() && !z2Var2.d) {
                    int i11 = iArr[0];
                    final int i12 = i7;
                    final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    if (i11 == 2) {
                        o6.N0(i12, context, i6Var2);
                    } else if (i11 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        final l2 l2Var2 = l2Var;
                        long j10 = l2Var2.f44606a;
                        if (j10 != 0 && j10 <= connectionsManager.getCurrentTime()) {
                            kc.c0(gd.N0(2131742687, null));
                            z2Var2.d = false;
                            if (!z2Var2.f45475f) {
                                z2Var2.f45475f = true;
                                z2Var2.f45472b.a();
                            }
                            if (!z2Var2.f45474e) {
                                z2Var2.f45471a.dismiss();
                                return;
                            }
                            return;
                        }
                        z2Var2.d = true;
                        hi.e eVar2 = g11;
                        eVar2.setLoading(true);
                        w7 w7Var2 = w7Var;
                        w7Var2.run();
                        final e3 e3Var2 = e3Var;
                        final di.n2 n2Var = new di.n2(z2Var2, eVar2, e3Var2, i6Var2, w7Var2, 6);
                        final v0 v0Var = D;
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        v0Var.F(true, false, false, new p10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final z2 z2Var3 = z2.this;
                                di.n2 n2Var2 = n2Var;
                                final v0 v0Var2 = v0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final l2 l2Var3 = l2Var2;
                                final TLRPC.User user3 = user2;
                                final int i13 = i12;
                                final e3 e3Var3 = e3Var2;
                                final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                s0 s0Var = (s0) obj;
                                String str4 = (String) obj2;
                                if (!z2Var3.f45474e) {
                                    if (s0Var != null && str4 == null) {
                                        if (str3.equals(v0Var2.y()) && Arrays.equals(bArr3, v0Var2.E())) {
                                            final WalletEngine2 walletEngine2 = v0Var2.f45256b;
                                            if (walletEngine2 == null) {
                                                n2Var2.a(gd.N0(2131742688, null));
                                                return;
                                            }
                                            final s0 b10 = s0Var.b();
                                            Utilities.f22877e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final s0 s0Var2 = s0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f10 = a3.f(s0Var2, str5, bArr4);
                                                    final z2 z2Var4 = z2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final l2 l2Var4 = l2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i14 = i13;
                                                    final v0 v0Var3 = v0Var2;
                                                    final e3 e3Var4 = e3Var3;
                                                    final org.telegram.ui.ActionBar.i6 i6Var4 = i6Var3;
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            z2 z2Var5 = z2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            s0 s0Var3 = s0Var2;
                                                            l2 l2Var5 = l2Var4;
                                                            TLRPC.User user5 = user4;
                                                            int i15 = i14;
                                                            v0 v0Var4 = v0Var3;
                                                            e3 e3Var5 = e3Var4;
                                                            String str6 = str5;
                                                            byte[] bArr5 = bArr4;
                                                            byte[] bArr6 = f10;
                                                            org.telegram.ui.ActionBar.i6 i6Var5 = i6Var4;
                                                            try {
                                                                if (z2Var5.f45474e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(s0Var3, l2Var5, "widget:" + user5.f28641id + ":" + Utilities.f22875b.nextLong(), new bi.z3(i15, v0Var4, e3Var5, z2Var5, str6, bArr5, bArr6, i6Var5));
                                                            } finally {
                                                                s0Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        kc.c0(gd.N0(2131742688, null));
                                        z2Var3.d = false;
                                        if (!z2Var3.f45475f) {
                                            z2Var3.f45475f = true;
                                            z2Var3.f45472b.a();
                                        }
                                        if (!z2Var3.f45474e) {
                                            z2Var3.f45471a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    n2Var2.a(str4);
                                }
                            }
                        });
                    }
                }
            }
        });
        b(e3Var, z2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.f22875b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(s0 s0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(s0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
