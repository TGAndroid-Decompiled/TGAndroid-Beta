package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.yd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ma1;
import org.telegram.ui.rw;
public abstract class t2 {
    public static final ArrayList f43197a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(user);
        k9Var.e(user, u8Var);
        linearLayout.addView(k9Var, mf.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = c2.v(20, context, charSequence, e6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, mf.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n4 = l10.n(user);
        if (!TextUtils.isEmpty(n4)) {
            linearLayout.addView(c2.h(context, "@" + n4, e6Var), mf.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), mf.o(-1, 12));
    }

    public static void b(x2 x2Var, s2 s2Var) {
        x2Var.f28592d0 = false;
        x2Var.f28626z0 = new org.telegram.ui.i0(s2Var, 3);
        x2Var.setOnDismissListener(new k2(s2Var, 0));
        x2Var.show();
        org.telegram.messenger.g0.i3(new ma1(11, s2Var, x2Var), 700L);
    }

    public static void c(Context context, final int i3, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.e6 e6Var, q2 q2Var) {
        int i10;
        int i11;
        float f10;
        String M0;
        int i12;
        final k0 x10 = k0.x(i3);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final x2 x2Var = new x2(context, e6Var, new View[0]);
        x2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, bd.V(null, null, 2131743206, l10.p(user)), e6Var);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        f11.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f27878d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        f11.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f11, d02, N, null, e6Var);
        if (equals) {
            i10 = 2131743020;
        } else {
            i10 = 2131743194;
        }
        TextView v = c2.v(14, context, bd.M0(i10, null), e6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        if (equals) {
            i11 = org.telegram.ui.ActionBar.k6.L6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28122q7;
        }
        org.telegram.ui.ActionBar.r6.V(v, i11, e6Var);
        if (equals) {
            f10 = 12.0f;
        } else {
            f10 = 4.0f;
        }
        f11.addView(v, mf.k(0.0f, 0.0f, 0.0f, f10, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
        } else {
            M0 = bd.M0(2131743193, null);
        }
        if (equals) {
            i12 = 14;
        } else {
            i12 = 16;
        }
        TextView v10 = c2.v(i12, context, M0, e6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f11.addView(v10, mf.o(-1, -2));
        p2 p2Var = new p2(context, 320);
        p2Var.addView(f11);
        linearLayout.addView(p2Var, mf.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        w2 w2Var = new w2(context);
        w2Var.getContent().addView(linearLayout, mf.c(-2.0f, -1));
        x2Var.I0(w2Var);
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        if (equals) {
            TextView v11 = c2.v(14, context, bd.M0(2131743039, null), e6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.r6.V(v11, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
            f12.addView(v11, mf.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(bd.M0(2131752589, null));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(bd.M0(2131743022, null));
        linearLayout2.addView(dVar, mf.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(h, mf.m(1.0f, 0, 44, 6, 0, 0));
        f12.addView(linearLayout2);
        x2Var.K0(f12);
        final s2 s2Var = new s2(x2Var, q2Var);
        final g gVar = new g(s2Var, h, dVar, 9);
        s2Var.f43149g = gVar;
        dVar.setOnClickListener(new g2(s2Var, 1));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final s2 s2Var2 = s2Var;
                if (!s2Var2.a() && !s2Var2.d) {
                    s2Var2.d = true;
                    final gi.d dVar2 = h;
                    dVar2.setLoading(true);
                    final g gVar2 = gVar;
                    gVar2.run();
                    final int i14 = i3;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    final k0 k0Var = x10;
                    final x2 x2Var2 = x2Var;
                    final byte[] bArr2 = bArr;
                    k0Var.z(new n10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            s2 s2Var3 = s2Var2;
                            gi.d dVar3 = dVar2;
                            x2 x2Var3 = x2Var2;
                            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                            g gVar3 = gVar2;
                            k0 k0Var2 = k0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i15 = i14;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            h0 h0Var = (h0) obj;
                            String str4 = (String) obj2;
                            if (!s2Var3.f43147e) {
                                if (h0Var != null && str4 == null) {
                                    if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                                        h0 b10 = h0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                                        Utilities.f21387e.c(new yd(b10, str3, bArr3, jSONObject3, "bot" + user3.f27150id, currentTime, s2Var3, k0Var2));
                                        return;
                                    }
                                    fc.b0(bd.M0(2131742969, null));
                                    s2Var3.d = false;
                                    if (!s2Var3.f43148f) {
                                        s2Var3.f43148f = true;
                                        s2Var3.f43145b.a();
                                    }
                                    if (!s2Var3.f43147e) {
                                        s2Var3.f43144a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                s2Var3.d = false;
                                dVar3.setLoading(false);
                                if (str4 != null) {
                                    fc.c0(str4, x2Var3.F, e6Var3);
                                }
                                gVar3.run();
                            }
                        }
                    }, true, false);
                }
            }
        });
        b(x2Var, s2Var);
        gVar.run();
    }

    public static void d(Context context, final int i3, final TLRPC.User user, final b2 b2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.e6 e6Var, q2 q2Var) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        final k0 x10 = k0.x(i3);
        char c2 = 0;
        final x2 x2Var = new x2(context, e6Var2, new View[0]);
        x2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, bd.V(null, null, 2131743205, l10.p(user)), e6Var2);
        f6 f6Var = new f6(context, 2131232807, 24);
        f6Var.getCardHolderView().setMaxLines(2);
        f6Var.getCardHolderView().setSingleLine(false);
        List<a2> list = b2Var.f42223b;
        f6Var.setCardHolder(e8.c0(((a2) list.get(0)).f42124a));
        org.telegram.ui.Components.h6 balanceView = f6Var.getBalanceView();
        long j10 = b2Var.f42224c;
        balanceView.setText(c2.k(j10));
        f6Var.getUsdBalanceView().setText(x10.m(j10, false));
        linearLayout.addView(f6Var, mf.o(-1, -2));
        LinearLayout F = c2.F(context, bd.M0(2131743217, null), e6Var2);
        for (a2 a2Var : list) {
            if (a2Var.f42125b != null && a2Var.d == null) {
                i10 = 2131743163;
            } else {
                i10 = 2131742991;
            }
            String M0 = bd.M0(i10, null);
            Object[] objArr = new Object[1];
            objArr[c2] = c2.C(a2Var.f42124a);
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(c2.c(context, M0, bd.V(null, null, 2131742986, objArr), c2.b(-a2Var.f42127e), a2Var.d, e6Var3), mf.o(-1, -2));
            F = linearLayout2;
            e6Var2 = e6Var3;
            c2 = 0;
        }
        final org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
        LinearLayout linearLayout3 = F;
        p2 p2Var = new p2(context, 240);
        p2Var.addView(linearLayout3);
        linearLayout.addView(p2Var, mf.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        w2 w2Var = new w2(context);
        w2Var.getContent().addView(linearLayout, mf.c(-2.0f, -1));
        x2Var.I0(w2Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView v = c2.v(14, context, null, e6Var4);
        org.telegram.ui.ActionBar.r6.V(v, org.telegram.ui.ActionBar.k6.f28290z6, e6Var4);
        f10.addView(v, mf.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gi.d dVar = new gi.d(context, e6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(bd.M0(2131743153, null));
        linearLayout4.addView(dVar, mf.m(1.0f, 0, 44, 0, 6, 0));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var4, true);
        h.setText(bd.M0(2131743178, null));
        linearLayout4.addView(h, mf.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout4);
        x2Var.K0(f10);
        final s2 s2Var = new s2(x2Var, q2Var);
        final int[] iArr = {0};
        final e7 e7Var = new e7(s2Var, h, iArr, dVar, 10);
        final Runnable[] runnableArr = {new ai.w1(s2Var, iArr, v, e7Var, x10, b2Var, 24)};
        ?? r02 = new cs() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr2) {
                if (iArr[0] == 2 && x10.v() >= b2Var.f42224c) {
                    runnableArr[0].run();
                }
            }
        };
        hs.f(i3).b(r02, hs.f23200a4);
        s2Var.h = new f2(i3, r02);
        s2Var.f43149g = e7Var;
        dVar.setOnClickListener(new g2(s2Var, 0));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final s2 s2Var2 = s2.this;
                if (!s2Var2.a() && !s2Var2.d) {
                    int i11 = iArr[0];
                    final int i12 = i3;
                    final k0 k0Var = x10;
                    if (i11 == 2) {
                        k0Var.v();
                        ei.e eVar = new ei.e(22);
                        k0 x11 = k0.x(i12);
                        x11.m0(new rw(i12, eVar, x11));
                    } else if (i11 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        final b2 b2Var2 = b2Var;
                        long j11 = b2Var2.f42222a;
                        if (j11 != 0 && j11 <= connectionsManager.getCurrentTime()) {
                            fc.b0(bd.M0(2131742968, null));
                            s2Var2.d = false;
                            if (!s2Var2.f43148f) {
                                s2Var2.f43148f = true;
                                s2Var2.f43145b.a();
                            }
                            if (!s2Var2.f43147e) {
                                s2Var2.f43144a.dismiss();
                                return;
                            }
                            return;
                        }
                        s2Var2.d = true;
                        gi.d dVar2 = h;
                        dVar2.setLoading(true);
                        e7 e7Var2 = e7Var;
                        e7Var2.run();
                        final x2 x2Var2 = x2Var;
                        final org.telegram.ui.ActionBar.e6 e6Var5 = e6Var4;
                        final ci.o2 o2Var = new ci.o2(s2Var2, dVar2, x2Var2, e6Var5, e7Var2, 6);
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        k0Var.z(new n10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final s2 s2Var3 = s2.this;
                                ci.o2 o2Var2 = o2Var;
                                final k0 k0Var2 = k0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final b2 b2Var3 = b2Var2;
                                final TLRPC.User user3 = user2;
                                final int i13 = i12;
                                final x2 x2Var3 = x2Var2;
                                final org.telegram.ui.ActionBar.e6 e6Var6 = e6Var5;
                                h0 h0Var = (h0) obj;
                                String str4 = (String) obj2;
                                if (!s2Var3.f43147e) {
                                    if (h0Var != null && str4 == null) {
                                        if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                                            final WalletEngine2 walletEngine2 = k0Var2.f42719b;
                                            if (walletEngine2 == null) {
                                                o2Var2.a(bd.M0(2131742969, null));
                                                return;
                                            }
                                            final h0 b10 = h0Var.b();
                                            Utilities.f21387e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final h0 h0Var2 = h0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f11 = t2.f(h0Var2, str5, bArr4);
                                                    final s2 s2Var4 = s2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final b2 b2Var4 = b2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i14 = i13;
                                                    final k0 k0Var3 = k0Var2;
                                                    final x2 x2Var4 = x2Var3;
                                                    final org.telegram.ui.ActionBar.e6 e6Var7 = e6Var6;
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            final s2 s2Var5 = s2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            h0 h0Var3 = h0Var2;
                                                            b2 b2Var5 = b2Var4;
                                                            TLRPC.User user5 = user4;
                                                            final int i15 = i14;
                                                            final k0 k0Var4 = k0Var3;
                                                            final x2 x2Var5 = x2Var4;
                                                            final String str6 = str5;
                                                            final byte[] bArr5 = bArr4;
                                                            final byte[] bArr6 = f11;
                                                            final org.telegram.ui.ActionBar.e6 e6Var8 = e6Var7;
                                                            try {
                                                                if (s2Var5.f43147e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(h0Var3, b2Var5, "widget:" + user5.f27150id + ":" + Utilities.f21385b.nextLong(), new n10(i15, k0Var4, x2Var5, s2Var5, str6, bArr5, bArr6, e6Var8) {
                                                                    public final int f42908a;
                                                                    public final k0 f42909b;
                                                                    public final s2 f42910c;
                                                                    public final String d;
                                                                    public final byte[] f42911e;
                                                                    public final byte[] f42912f;

                                                                    {
                                                                        this.f42910c = s2Var5;
                                                                        this.d = str6;
                                                                        this.f42911e = bArr5;
                                                                        this.f42912f = bArr6;
                                                                    }

                                                                    @Override
                                                                    public final void a(Object obj3, Object obj4) {
                                                                        final TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                                        String str7 = (String) obj4;
                                                                        final s2 s2Var6 = this.f42910c;
                                                                        if (!s2Var6.f43147e || s2Var6.d) {
                                                                            if (sendtransfer == null) {
                                                                                if (str7 == null) {
                                                                                    str7 = bd.M0(2131742996, null);
                                                                                }
                                                                                fc.b0(str7);
                                                                                s2Var6.d = false;
                                                                                if (!s2Var6.f43148f) {
                                                                                    s2Var6.f43148f = true;
                                                                                    s2Var6.f43145b.a();
                                                                                }
                                                                                if (!s2Var6.f43147e) {
                                                                                    s2Var6.f43144a.dismiss();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            final int i16 = this.f42908a;
                                                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i16);
                                                                            c3.b bVar = new c3.b(1);
                                                                            final k0 k0Var5 = this.f42909b;
                                                                            final String str8 = this.d;
                                                                            final byte[] bArr7 = this.f42911e;
                                                                            final byte[] bArr8 = this.f42912f;
                                                                            connectionsManager2.sendRequestTyped(sendtransfer, bVar, new n10() {
                                                                                @Override
                                                                                public final void a(java.lang.Object r22, java.lang.Object r23) {
                                                                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d2.a(java.lang.Object, java.lang.Object):void");
                                                                                }
                                                                            });
                                                                        }
                                                                    }
                                                                });
                                                            } finally {
                                                                h0Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        fc.b0(bd.M0(2131742969, null));
                                        s2Var3.d = false;
                                        if (!s2Var3.f43148f) {
                                            s2Var3.f43148f = true;
                                            s2Var3.f43145b.a();
                                        }
                                        if (!s2Var3.f43147e) {
                                            s2Var3.f43144a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    o2Var2.a(str4);
                                }
                            }
                        }, true, false);
                    }
                }
            }
        });
        b(x2Var, s2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.f21385b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(h0 h0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(h0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
