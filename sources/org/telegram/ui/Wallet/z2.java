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
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.b31;
import org.telegram.ui.jw0;
public abstract class z2 {
    public static final ArrayList f45342a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.r(user);
        q9Var.f(user, b9Var);
        linearLayout.addView(q9Var, c8.ma.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = l2.v(20, context, charSequence, i6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, c8.ma.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String o4 = o10.o(user);
        if (!TextUtils.isEmpty(o4)) {
            linearLayout.addView(l2.h(context, "@" + o4, i6Var), c8.ma.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), c8.ma.o(-1, 12));
    }

    public static void b(d3 d3Var, y2 y2Var) {
        d3Var.f30198d0 = false;
        d3Var.f30235z0 = new org.telegram.ui.h0(y2Var, 3);
        d3Var.setOnDismissListener(new q2(y2Var, 0));
        d3Var.show();
        org.telegram.messenger.g0.h3(new b31(27, y2Var, d3Var), 700L);
    }

    public static void c(Context context, final int i7, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.i6 i6Var, w2 w2Var) {
        int i10;
        int i11;
        float f10;
        String M0;
        int i12;
        final u0 D = u0.D(i7);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final d3 d3Var = new d3(context, i6Var, new View[0]);
        d3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, gd.V(null, null, 2131742958, o10.q(user)), i6Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.n6.f29396d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        if (equals) {
            i10 = 2131742752;
        } else {
            i10 = 2131742946;
        }
        TextView v = l2.v(14, context, gd.M0(i10, null), i6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        if (equals) {
            i11 = org.telegram.ui.ActionBar.n6.L6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29637q7;
        }
        org.telegram.ui.ActionBar.u6.U(v, i11, i6Var);
        if (equals) {
            f10 = 12.0f;
        } else {
            f10 = 4.0f;
        }
        g10.addView(v, c8.ma.k(0.0f, 0.0f, 0.0f, f10, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
        } else {
            M0 = gd.M0(2131742945, null);
        }
        if (equals) {
            i12 = 14;
        } else {
            i12 = 16;
        }
        TextView v10 = l2.v(i12, context, M0, i6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        g10.addView(v10, c8.ma.o(-1, -2));
        v2 v2Var = new v2(context, 320);
        v2Var.addView(g10);
        linearLayout.addView(v2Var, c8.ma.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        c3 c3Var = new c3(context);
        c3Var.getContent().addView(linearLayout, c8.ma.c(-2.0f, -1));
        d3Var.J0(c3Var);
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
        if (equals) {
            TextView v11 = l2.v(14, context, gd.M0(2131742771, null), i6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.u6.U(v11, org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
            g11.addView(v11, c8.ma.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(gd.M0(2131752578, null));
        final hi.d g12 = n10.g(24, context, i6Var, true);
        g12.setText(gd.M0(2131742754, null));
        linearLayout2.addView(dVar, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(g12, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
        g11.addView(linearLayout2);
        d3Var.L0(g11);
        final y2 y2Var = new y2(d3Var, w2Var);
        final p pVar = new p(y2Var, g12, dVar, 9);
        y2Var.f45304g = pVar;
        dVar.setOnClickListener(new n2(y2Var, 1));
        g12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final y2 y2Var2 = y2Var;
                if (!y2Var2.a() && !y2Var2.d) {
                    y2Var2.d = true;
                    final hi.d dVar2 = g12;
                    dVar2.setLoading(true);
                    final p pVar2 = pVar;
                    pVar2.run();
                    final int i14 = i7;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    final u0 u0Var = D;
                    final d3 d3Var2 = d3Var;
                    final byte[] bArr2 = bArr;
                    u0Var.F(true, false, false, new q10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            y2 y2Var3 = y2Var2;
                            hi.d dVar3 = dVar2;
                            d3 d3Var3 = d3Var2;
                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                            p pVar3 = pVar2;
                            u0 u0Var2 = u0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i15 = i14;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            r0 r0Var = (r0) obj;
                            String str4 = (String) obj2;
                            if (!y2Var3.f45302e) {
                                if (r0Var != null && str4 == null) {
                                    if (str3.equals(u0Var2.y()) && Arrays.equals(bArr3, u0Var2.E())) {
                                        r0 b10 = r0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                                        Utilities.f22782e.c(new ce(b10, str3, bArr3, jSONObject3, "bot" + user3.f28554id, currentTime, y2Var3, u0Var2));
                                        return;
                                    }
                                    lc.c0(gd.M0(2131742701, null));
                                    y2Var3.d = false;
                                    if (!y2Var3.f45303f) {
                                        y2Var3.f45303f = true;
                                        y2Var3.f45300b.a();
                                    }
                                    if (!y2Var3.f45302e) {
                                        y2Var3.f45299a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                y2Var3.d = false;
                                dVar3.setLoading(false);
                                if (str4 != null) {
                                    lc.d0(str4, d3Var3.F, i6Var3);
                                }
                                pVar3.run();
                            }
                        }
                    });
                }
            }
        });
        b(d3Var, y2Var);
        pVar.run();
    }

    public static void d(final Context context, final int i7, final TLRPC.User user, final k2 k2Var, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.i6 i6Var, w2 w2Var) {
        int i10;
        final u0 D = u0.D(i7);
        char c10 = 0;
        final d3 d3Var = new d3(context, i6Var, new View[0]);
        d3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, gd.V(null, null, 2131742957, o10.q(user)), i6Var);
        x6 x6Var = new x6(context, 2131232812, 24);
        x6Var.getCardHolderView().setMaxLines(2);
        x6Var.getCardHolderView().setSingleLine(false);
        List<j2> list = k2Var.f44436b;
        x6Var.setCardHolder(u8.c0(((j2) list.get(0)).f44385a));
        org.telegram.ui.Components.n6 balanceView = x6Var.getBalanceView();
        long j3 = k2Var.f44437c;
        balanceView.setText(l2.k(j3));
        x6Var.getUsdBalanceView().setText(D.r(j3, false));
        linearLayout.addView(x6Var, c8.ma.o(-1, -2));
        LinearLayout F = l2.F(context, gd.M0(2131742969, null), i6Var);
        for (j2 j2Var : list) {
            if (j2Var.f44386b != null && j2Var.d == null) {
                i10 = 2131742915;
            } else {
                i10 = 2131742723;
            }
            String M0 = gd.M0(i10, null);
            Object[] objArr = new Object[1];
            objArr[c10] = l2.C(j2Var.f44385a);
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(l2.c(context, M0, gd.V(null, null, 2131742718, objArr), l2.b(-j2Var.f44388e), j2Var.d, i6Var), c8.ma.o(-1, -2));
            F = linearLayout2;
            c10 = 0;
        }
        LinearLayout linearLayout3 = F;
        v2 v2Var = new v2(context, 240);
        v2Var.addView(linearLayout3);
        linearLayout.addView(v2Var, c8.ma.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        c3 c3Var = new c3(context);
        c3Var.getContent().addView(linearLayout, c8.ma.c(-2.0f, -1));
        d3Var.J0(c3Var);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView v = l2.v(14, context, null, i6Var);
        org.telegram.ui.ActionBar.u6.U(v, org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
        g10.addView(v, c8.ma.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(gd.M0(2131742905, null));
        linearLayout4.addView(dVar, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
        final hi.d g11 = n10.g(24, context, i6Var, true);
        g11.setText(gd.M0(2131742930, null));
        linearLayout4.addView(g11, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
        g10.addView(linearLayout4);
        d3Var.L0(g10);
        final y2 y2Var = new y2(d3Var, w2Var);
        final int[] iArr = {0};
        final v7 v7Var = new v7(y2Var, g11, iArr, dVar, 9);
        final Runnable[] runnableArr = {new bi.h2(y2Var, iArr, v, v7Var, D, k2Var, 25)};
        fs fsVar = new fs() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr2) {
                if (iArr[0] == 2 && D.A() >= k2Var.f44437c) {
                    runnableArr[0].run();
                }
            }
        };
        ks.f(i7).b(fsVar, ks.f25099c4);
        y2Var.h = new jw0(i7, fsVar, 6);
        y2Var.f45304g = v7Var;
        dVar.setOnClickListener(new n2(y2Var, 0));
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final y2 y2Var2 = y2.this;
                if (!y2Var2.a() && !y2Var2.d) {
                    int i11 = iArr[0];
                    final int i12 = i7;
                    final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    if (i11 == 2) {
                        n6.N0(i12, context, i6Var2);
                    } else if (i11 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        final k2 k2Var2 = k2Var;
                        long j10 = k2Var2.f44435a;
                        if (j10 != 0 && j10 <= connectionsManager.getCurrentTime()) {
                            lc.c0(gd.M0(2131742700, null));
                            y2Var2.d = false;
                            if (!y2Var2.f45303f) {
                                y2Var2.f45303f = true;
                                y2Var2.f45300b.a();
                            }
                            if (!y2Var2.f45302e) {
                                y2Var2.f45299a.dismiss();
                                return;
                            }
                            return;
                        }
                        y2Var2.d = true;
                        hi.d dVar2 = g11;
                        dVar2.setLoading(true);
                        v7 v7Var2 = v7Var;
                        v7Var2.run();
                        final d3 d3Var2 = d3Var;
                        final di.m2 m2Var = new di.m2(y2Var2, dVar2, d3Var2, i6Var2, v7Var2, 6);
                        final u0 u0Var = D;
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        u0Var.F(true, false, false, new q10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final y2 y2Var3 = y2.this;
                                di.m2 m2Var2 = m2Var;
                                final u0 u0Var2 = u0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final k2 k2Var3 = k2Var2;
                                final TLRPC.User user3 = user2;
                                final int i13 = i12;
                                final d3 d3Var3 = d3Var2;
                                final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                r0 r0Var = (r0) obj;
                                String str4 = (String) obj2;
                                if (!y2Var3.f45302e) {
                                    if (r0Var != null && str4 == null) {
                                        if (str3.equals(u0Var2.y()) && Arrays.equals(bArr3, u0Var2.E())) {
                                            final WalletEngine2 walletEngine2 = u0Var2.f45084b;
                                            if (walletEngine2 == null) {
                                                m2Var2.a(gd.M0(2131742701, null));
                                                return;
                                            }
                                            final r0 b10 = r0Var.b();
                                            Utilities.f22782e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final r0 r0Var2 = r0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f10 = z2.f(r0Var2, str5, bArr4);
                                                    final y2 y2Var4 = y2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final k2 k2Var4 = k2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i14 = i13;
                                                    final u0 u0Var3 = u0Var2;
                                                    final d3 d3Var4 = d3Var3;
                                                    final org.telegram.ui.ActionBar.i6 i6Var4 = i6Var3;
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            y2 y2Var5 = y2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            r0 r0Var3 = r0Var2;
                                                            k2 k2Var5 = k2Var4;
                                                            TLRPC.User user5 = user4;
                                                            int i15 = i14;
                                                            u0 u0Var4 = u0Var3;
                                                            d3 d3Var5 = d3Var4;
                                                            String str6 = str5;
                                                            byte[] bArr5 = bArr4;
                                                            byte[] bArr6 = f10;
                                                            org.telegram.ui.ActionBar.i6 i6Var5 = i6Var4;
                                                            try {
                                                                if (y2Var5.f45302e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(r0Var3, k2Var5, "widget:" + user5.f28554id + ":" + Utilities.f22780b.nextLong(), new bi.s4(i15, u0Var4, d3Var5, y2Var5, str6, bArr5, bArr6, i6Var5));
                                                            } finally {
                                                                r0Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        lc.c0(gd.M0(2131742701, null));
                                        y2Var3.d = false;
                                        if (!y2Var3.f45303f) {
                                            y2Var3.f45303f = true;
                                            y2Var3.f45300b.a();
                                        }
                                        if (!y2Var3.f45302e) {
                                            y2Var3.f45299a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    m2Var2.a(str4);
                                }
                            }
                        });
                    }
                }
            }
        });
        b(d3Var, y2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.f22780b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(r0 r0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(r0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
