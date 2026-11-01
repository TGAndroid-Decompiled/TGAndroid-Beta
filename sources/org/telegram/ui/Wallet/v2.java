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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.de;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.vs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.qq;
public abstract class v2 {
    public static final ArrayList f35308a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(38.0f));
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(user);
        g9Var.e(user, r8Var);
        linearLayout.addView(g9Var, w7.b6.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = e2.v(20, context, charSequence, p6Var);
        v.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(v, w7.b6.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n10 = i20.n(user);
        if (!TextUtils.isEmpty(n10)) {
            linearLayout.addView(e2.h(context, "@" + n10, p6Var), w7.b6.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), w7.b6.o(-1, 12));
    }

    public static void b(z2 z2Var, u2 u2Var) {
        z2Var.f21591c0 = false;
        z2Var.f21624y0 = new org.telegram.ui.i0(u2Var, 3);
        z2Var.setOnDismissListener(new l2(u2Var, 0));
        z2Var.show();
        org.telegram.messenger.i0.h3(new m2(0, u2Var, z2Var), 700L);
    }

    public static void c(Context context, final int i10, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.p6 p6Var, s2 s2Var) {
        int i11;
        int i12;
        float f7;
        String L0;
        int i13;
        final k0 x10 = k0.x(i10);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final z2 z2Var = new z2(context, p6Var, new View[0]);
        z2Var.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, p6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, dd.V(null, null, 2131743222, i20.p(user)), p6Var);
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
        f10.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f));
        int L = org.telegram.messenger.i0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i14, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f10, d02, N, null, p6Var);
        if (equals) {
            i11 = 2131743036;
        } else {
            i11 = 2131743210;
        }
        TextView v = e2.v(14, context, dd.L0(i11, null), p6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.i0.o());
        if (equals) {
            i12 = org.telegram.ui.ActionBar.t6.L6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.f21171q7;
        }
        org.telegram.ui.ActionBar.a7.V(v, i12, p6Var);
        if (equals) {
            f7 = 12.0f;
        } else {
            f7 = 4.0f;
        }
        f10.addView(v, w7.b6.k(0.0f, 0.0f, 0.0f, f7, -1, -2));
        if (equals) {
            L0 = jSONObject.optString("text");
        } else {
            L0 = dd.L0(2131743209, null);
        }
        if (equals) {
            i13 = 14;
        } else {
            i13 = 16;
        }
        TextView v10 = e2.v(i13, context, L0, p6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f10.addView(v10, w7.b6.o(-1, -2));
        r2 r2Var = new r2(context, 320);
        r2Var.addView(f10);
        linearLayout.addView(r2Var, w7.b6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        y2 y2Var = new y2(context);
        y2Var.getContent().addView(linearLayout, w7.b6.c(-2.0f, -1));
        z2Var.I0(y2Var);
        LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
        if (equals) {
            TextView v11 = e2.v(14, context, dd.L0(2131743055, null), p6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.a7.V(v11, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
            f11.addView(v11, w7.b6.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(dd.L0(2131752589, null));
        final vh.d i15 = a30.i(24, context, p6Var, true);
        i15.setText(dd.L0(2131743038, null));
        linearLayout2.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(i15, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
        f11.addView(linearLayout2);
        z2Var.K0(f11);
        final u2 u2Var = new u2(z2Var, s2Var);
        final g gVar = new g(u2Var, i15, dVar, 9);
        u2Var.f35274g = gVar;
        dVar.setOnClickListener(new h2(u2Var, 1));
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final u2 u2Var2 = u2Var;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = true;
                    final vh.d dVar2 = i15;
                    dVar2.setLoading(true);
                    final g gVar2 = gVar;
                    gVar2.run();
                    final int i16 = i10;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                    final k0 k0Var = x10;
                    final z2 z2Var2 = z2Var;
                    final byte[] bArr2 = bArr;
                    k0Var.z(new k20() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            u2 u2Var3 = u2Var2;
                            vh.d dVar3 = dVar2;
                            z2 z2Var3 = z2Var2;
                            org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                            g gVar3 = gVar2;
                            k0 k0Var2 = k0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i17 = i16;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            h0 h0Var = (h0) obj;
                            String str4 = (String) obj2;
                            if (!u2Var3.e) {
                                if (h0Var != null && str4 == null) {
                                    if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                                        h0 b10 = h0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                                        Utilities.e.c(new de(b10, str3, bArr3, jSONObject3, "bot" + user3.f19943id, currentTime, u2Var3, k0Var2));
                                        return;
                                    }
                                    cc.b0(dd.L0(2131742985, null));
                                    u2Var3.d = false;
                                    if (!u2Var3.f35273f) {
                                        u2Var3.f35273f = true;
                                        u2Var3.f35271b.a();
                                    }
                                    if (!u2Var3.e) {
                                        u2Var3.f35270a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                u2Var3.d = false;
                                dVar3.setLoading(false);
                                if (str4 != null) {
                                    cc.c0(str4, z2Var3.E, p6Var3);
                                }
                                gVar3.run();
                            }
                        }
                    }, true, false);
                }
            }
        });
        b(z2Var, u2Var);
        gVar.run();
    }

    public static void d(Context context, final int i10, final TLRPC.User user, final d2 d2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.p6 p6Var, s2 s2Var) {
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        final k0 x10 = k0.x(i10);
        char c10 = 0;
        final z2 z2Var = new z2(context, p6Var2, new View[0]);
        z2Var.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, p6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, dd.V(null, null, 2131743221, i20.p(user)), p6Var2);
        l6 l6Var = new l6(context, 2131232807, 24);
        l6Var.getCardHolderView().setMaxLines(2);
        l6Var.getCardHolderView().setSingleLine(false);
        List<c2> list = d2Var.f34374b;
        l6Var.setCardHolder(k8.c0(((c2) list.get(0)).f34311a));
        org.telegram.ui.Components.f6 balanceView = l6Var.getBalanceView();
        long j10 = d2Var.f34375c;
        balanceView.setText(e2.k(j10));
        l6Var.getUsdBalanceView().setText(x10.m(j10, false));
        linearLayout.addView(l6Var, w7.b6.o(-1, -2));
        LinearLayout F = e2.F(context, dd.L0(2131743233, null), p6Var2);
        for (c2 c2Var : list) {
            if (c2Var.f34312b != null && c2Var.d == null) {
                i11 = 2131743179;
            } else {
                i11 = 2131743007;
            }
            String L0 = dd.L0(i11, null);
            Object[] objArr = new Object[1];
            objArr[c10] = e2.C(c2Var.f34311a);
            org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(e2.c(context, L0, dd.V(null, null, 2131743002, objArr), e2.b(-c2Var.e), c2Var.d, p6Var3), w7.b6.o(-1, -2));
            F = linearLayout2;
            p6Var2 = p6Var3;
            c10 = 0;
        }
        final org.telegram.ui.ActionBar.p6 p6Var4 = p6Var2;
        LinearLayout linearLayout3 = F;
        r2 r2Var = new r2(context, 240);
        r2Var.addView(linearLayout3);
        linearLayout.addView(r2Var, w7.b6.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        y2 y2Var = new y2(context);
        y2Var.getContent().addView(linearLayout, w7.b6.c(-2.0f, -1));
        z2Var.I0(y2Var);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView v = e2.v(14, context, null, p6Var4);
        org.telegram.ui.ActionBar.a7.V(v, org.telegram.ui.ActionBar.t6.f21331z6, p6Var4);
        f7.addView(v, w7.b6.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        vh.d dVar = new vh.d(context, p6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(dd.L0(2131743169, null));
        linearLayout4.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
        final vh.d i12 = a30.i(24, context, p6Var4, true);
        i12.setText(dd.L0(2131743194, null));
        linearLayout4.addView(i12, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
        f7.addView(linearLayout4);
        z2Var.K0(f7);
        final u2 u2Var = new u2(z2Var, s2Var);
        final int[] iArr = {0};
        final k7 k7Var = new k7(u2Var, i12, iArr, dVar, 10);
        final Runnable[] runnableArr = {new org.telegram.ui.v8(u2Var, iArr, v, k7Var, x10, d2Var, 13)};
        vs vsVar = new vs() {
            @Override
            public final void didReceivedNotification(int i13, int i14, Object[] objArr2) {
                if (iArr[0] == 2 && x10.v() >= d2Var.f34375c) {
                    runnableArr[0].run();
                }
            }
        };
        at.f(i10).b(vsVar, at.f14678a4);
        u2Var.h = new qq(i10, vsVar, 25);
        u2Var.f35274g = k7Var;
        dVar.setOnClickListener(new h2(u2Var, 0));
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final u2 u2Var2 = u2.this;
                if (!u2Var2.a() && !u2Var2.d) {
                    int i13 = iArr[0];
                    final int i14 = i10;
                    final k0 k0Var = x10;
                    if (i13 == 2) {
                        k0Var.v();
                        ag.z0 z0Var = new ag.z0(21);
                        k0 x11 = k0.x(i14);
                        x11.m0(new x0(i14, z0Var, x11));
                    } else if (i13 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                        final d2 d2Var2 = d2Var;
                        long j11 = d2Var2.f34373a;
                        if (j11 != 0 && j11 <= connectionsManager.getCurrentTime()) {
                            cc.b0(dd.L0(2131742984, null));
                            u2Var2.d = false;
                            if (!u2Var2.f35273f) {
                                u2Var2.f35273f = true;
                                u2Var2.f35271b.a();
                            }
                            if (!u2Var2.e) {
                                u2Var2.f35270a.dismiss();
                                return;
                            }
                            return;
                        }
                        u2Var2.d = true;
                        vh.d dVar2 = i12;
                        dVar2.setLoading(true);
                        k7 k7Var2 = k7Var;
                        k7Var2.run();
                        final z2 z2Var2 = z2Var;
                        final org.telegram.ui.ActionBar.p6 p6Var5 = p6Var4;
                        final org.telegram.ui.pa paVar = new org.telegram.ui.pa(u2Var2, dVar2, z2Var2, p6Var5, k7Var2, 5);
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        k0Var.z(new k20() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final u2 u2Var3 = u2.this;
                                org.telegram.ui.pa paVar2 = paVar;
                                final k0 k0Var2 = k0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final d2 d2Var3 = d2Var2;
                                final TLRPC.User user3 = user2;
                                final int i15 = i14;
                                final z2 z2Var3 = z2Var2;
                                final org.telegram.ui.ActionBar.p6 p6Var6 = p6Var5;
                                h0 h0Var = (h0) obj;
                                String str4 = (String) obj2;
                                if (!u2Var3.e) {
                                    if (h0Var != null && str4 == null) {
                                        if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                                            final WalletEngine2 walletEngine2 = k0Var2.f34782b;
                                            if (walletEngine2 == null) {
                                                paVar2.a(dd.L0(2131742985, null));
                                                return;
                                            }
                                            final h0 b10 = h0Var.b();
                                            Utilities.e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final h0 h0Var2 = h0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f10 = v2.f(h0Var2, str5, bArr4);
                                                    final u2 u2Var4 = u2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final d2 d2Var4 = d2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i16 = i15;
                                                    final k0 k0Var3 = k0Var2;
                                                    final z2 z2Var4 = z2Var3;
                                                    final org.telegram.ui.ActionBar.p6 p6Var7 = p6Var6;
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            final u2 u2Var5 = u2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            h0 h0Var3 = h0Var2;
                                                            d2 d2Var5 = d2Var4;
                                                            TLRPC.User user5 = user4;
                                                            final int i17 = i16;
                                                            final k0 k0Var4 = k0Var3;
                                                            final z2 z2Var5 = z2Var4;
                                                            final String str6 = str5;
                                                            final byte[] bArr5 = bArr4;
                                                            final byte[] bArr6 = f10;
                                                            final org.telegram.ui.ActionBar.p6 p6Var8 = p6Var7;
                                                            try {
                                                                if (u2Var5.e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(h0Var3, d2Var5, "widget:" + user5.f19943id + ":" + Utilities.f14520b.nextLong(), new k20(i17, k0Var4, z2Var5, u2Var5, str6, bArr5, bArr6, p6Var8) {
                                                                    public final int f35012a;
                                                                    public final k0 f35013b;
                                                                    public final u2 f35014c;
                                                                    public final String d;
                                                                    public final byte[] e;
                                                                    public final byte[] f35015f;

                                                                    {
                                                                        this.f35014c = u2Var5;
                                                                        this.d = str6;
                                                                        this.e = bArr5;
                                                                        this.f35015f = bArr6;
                                                                    }

                                                                    @Override
                                                                    public final void a(Object obj3, Object obj4) {
                                                                        final TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                                        String str7 = (String) obj4;
                                                                        final u2 u2Var6 = this.f35014c;
                                                                        if (!u2Var6.e || u2Var6.d) {
                                                                            if (sendtransfer == null) {
                                                                                if (str7 == null) {
                                                                                    str7 = dd.L0(2131743012, null);
                                                                                }
                                                                                cc.b0(str7);
                                                                                u2Var6.d = false;
                                                                                if (!u2Var6.f35273f) {
                                                                                    u2Var6.f35273f = true;
                                                                                    u2Var6.f35271b.a();
                                                                                }
                                                                                if (!u2Var6.e) {
                                                                                    u2Var6.f35270a.dismiss();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            final int i18 = this.f35012a;
                                                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i18);
                                                                            a3.b bVar = new a3.b(1);
                                                                            final k0 k0Var5 = this.f35013b;
                                                                            final String str8 = this.d;
                                                                            final byte[] bArr7 = this.e;
                                                                            final byte[] bArr8 = this.f35015f;
                                                                            connectionsManager2.sendRequestTyped(sendtransfer, bVar, new k20() {
                                                                                @Override
                                                                                public final void a(java.lang.Object r22, java.lang.Object r23) {
                                                                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.f2.a(java.lang.Object, java.lang.Object):void");
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
                                        cc.b0(dd.L0(2131742985, null));
                                        u2Var3.d = false;
                                        if (!u2Var3.f35273f) {
                                            u2Var3.f35273f = true;
                                            u2Var3.f35271b.a();
                                        }
                                        if (!u2Var3.e) {
                                            u2Var3.f35270a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    paVar2.a(str4);
                                }
                            }
                        }, true, false);
                    }
                }
            }
        });
        b(z2Var, u2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.f14520b;
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }
}
