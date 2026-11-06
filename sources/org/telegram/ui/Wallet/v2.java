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
import org.telegram.messenger.ee;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.d10;
public abstract class v2 {
    public static final ArrayList f43206a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.r(user);
        l9Var.e(user, w8Var);
        linearLayout.addView(l9Var, c8.ha.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = f2.v(20, context, charSequence, f6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, c8.ha.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n10 = t10.n(user);
        if (!TextUtils.isEmpty(n10)) {
            linearLayout.addView(f2.h(context, "@" + n10, f6Var), c8.ha.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), c8.ha.o(-1, 12));
    }

    public static void b(z2 z2Var, u2 u2Var) {
        z2Var.f28619c0 = false;
        z2Var.f28653y0 = new org.telegram.ui.h0(u2Var, 3);
        z2Var.setOnDismissListener(new m2(u2Var, 0));
        z2Var.show();
        org.telegram.messenger.g0.i3(new n(6, u2Var, z2Var), 700L);
    }

    public static void c(Context context, final int i7, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.f6 f6Var, s2 s2Var) {
        int i10;
        int i11;
        float f10;
        String M0;
        int i12;
        final n0 x10 = n0.x(i7);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final z2 z2Var = new z2(context, f6Var, new View[0]);
        z2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, hd.V(null, null, 2131743197, t10.p(user)), f6Var);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        f11.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f27848d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        f11.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f11, d02, N, null, f6Var);
        if (equals) {
            i10 = 2131743011;
        } else {
            i10 = 2131743185;
        }
        TextView v = f2.v(14, context, hd.M0(i10, null), f6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        if (equals) {
            i11 = org.telegram.ui.ActionBar.k6.L6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28089q7;
        }
        org.telegram.ui.ActionBar.r6.V(v, i11, f6Var);
        if (equals) {
            f10 = 12.0f;
        } else {
            f10 = 4.0f;
        }
        f11.addView(v, c8.ha.k(0.0f, 0.0f, 0.0f, f10, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
        } else {
            M0 = hd.M0(2131743184, null);
        }
        if (equals) {
            i12 = 14;
        } else {
            i12 = 16;
        }
        TextView v10 = f2.v(i12, context, M0, f6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f11.addView(v10, c8.ha.o(-1, -2));
        r2 r2Var = new r2(context, 320);
        r2Var.addView(f11);
        linearLayout.addView(r2Var, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        y2 y2Var = new y2(context);
        y2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
        z2Var.I0(y2Var);
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        if (equals) {
            TextView v11 = f2.v(14, context, hd.M0(2131743030, null), f6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.r6.V(v11, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
            f12.addView(v11, c8.ha.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(hd.M0(2131752589, null));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(hd.M0(2131743013, null));
        linearLayout2.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        f12.addView(linearLayout2);
        z2Var.K0(f12);
        final u2 u2Var = new u2(z2Var, s2Var);
        final g gVar = new g(u2Var, h, dVar, 9);
        u2Var.f43175g = gVar;
        dVar.setOnClickListener(new i2(u2Var, 1));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final u2 u2Var2 = u2Var;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = true;
                    final fi.d dVar2 = h;
                    dVar2.setLoading(true);
                    final g gVar2 = gVar;
                    gVar2.run();
                    final int i14 = i7;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    final n0 n0Var = x10;
                    final z2 z2Var2 = z2Var;
                    final byte[] bArr2 = bArr;
                    n0Var.z(new v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            u2 u2Var3 = u2Var2;
                            fi.d dVar3 = dVar2;
                            z2 z2Var3 = z2Var2;
                            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                            g gVar3 = gVar2;
                            n0 n0Var2 = n0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i15 = i14;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            k0 k0Var = (k0) obj;
                            String str4 = (String) obj2;
                            if (!u2Var3.f43173e) {
                                if (k0Var != null && str4 == null) {
                                    if (str3.equals(n0Var2.t()) && Arrays.equals(bArr3, n0Var2.y())) {
                                        k0 b10 = k0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                                        Utilities.f21333e.c(new ee(b10, str3, bArr3, jSONObject3, "bot" + user3.f27101id, currentTime, u2Var3, n0Var2));
                                        return;
                                    }
                                    hc.b0(hd.M0(2131742960, null));
                                    u2Var3.d = false;
                                    if (!u2Var3.f43174f) {
                                        u2Var3.f43174f = true;
                                        u2Var3.f43171b.a();
                                    }
                                    if (!u2Var3.f43173e) {
                                        u2Var3.f43170a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                u2Var3.d = false;
                                dVar3.setLoading(false);
                                if (str4 != null) {
                                    hc.c0(str4, z2Var3.E, f6Var3);
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

    public static void d(Context context, final int i7, final TLRPC.User user, final e2 e2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.f6 f6Var, s2 s2Var) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        final n0 x10 = n0.x(i7);
        char c10 = 0;
        final z2 z2Var = new z2(context, f6Var2, new View[0]);
        z2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, f6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, hd.V(null, null, 2131743196, t10.p(user)), f6Var2);
        h6 h6Var = new h6(context, 2131232809, 24);
        h6Var.getCardHolderView().setMaxLines(2);
        h6Var.getCardHolderView().setSingleLine(false);
        List<d2> list = e2Var.f42391b;
        h6Var.setCardHolder(f8.c0(((d2) list.get(0)).f42301a));
        org.telegram.ui.Components.j6 balanceView = h6Var.getBalanceView();
        long j3 = e2Var.f42392c;
        balanceView.setText(f2.k(j3));
        h6Var.getUsdBalanceView().setText(x10.m(j3, false));
        linearLayout.addView(h6Var, c8.ha.o(-1, -2));
        LinearLayout F = f2.F(context, hd.M0(2131743208, null), f6Var2);
        for (d2 d2Var : list) {
            if (d2Var.f42302b != null && d2Var.d == null) {
                i10 = 2131743154;
            } else {
                i10 = 2131742982;
            }
            String M0 = hd.M0(i10, null);
            Object[] objArr = new Object[1];
            objArr[c10] = f2.C(d2Var.f42301a);
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(f2.c(context, M0, hd.V(null, null, 2131742977, objArr), f2.b(-d2Var.f42304e), d2Var.d, f6Var3), c8.ha.o(-1, -2));
            F = linearLayout2;
            f6Var2 = f6Var3;
            c10 = 0;
        }
        final org.telegram.ui.ActionBar.f6 f6Var4 = f6Var2;
        LinearLayout linearLayout3 = F;
        r2 r2Var = new r2(context, 240);
        r2Var.addView(linearLayout3);
        linearLayout.addView(r2Var, c8.ha.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        y2 y2Var = new y2(context);
        y2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
        z2Var.I0(y2Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView v = f2.v(14, context, null, f6Var4);
        org.telegram.ui.ActionBar.r6.V(v, org.telegram.ui.ActionBar.k6.f28258z6, f6Var4);
        f10.addView(v, c8.ha.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fi.d dVar = new fi.d(context, f6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(hd.M0(2131743144, null));
        linearLayout4.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var4, true);
        h.setText(hd.M0(2131743169, null));
        linearLayout4.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout4);
        z2Var.K0(f10);
        final u2 u2Var = new u2(z2Var, s2Var);
        final int[] iArr = {0};
        final g7 g7Var = new g7(u2Var, h, iArr, dVar, 10);
        final Runnable[] runnableArr = {new bi.a3(u2Var, iArr, v, g7Var, x10, e2Var, 23)};
        ?? r02 = new ls() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr2) {
                if (iArr[0] == 2 && x10.v() >= e2Var.f42392c) {
                    runnableArr[0].run();
                }
            }
        };
        qs.f(i7).b(r02, qs.f24954a4);
        u2Var.h = new h2(i7, r02);
        u2Var.f43175g = g7Var;
        dVar.setOnClickListener(new i2(u2Var, 0));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final u2 u2Var2 = u2.this;
                if (!u2Var2.a() && !u2Var2.d) {
                    int i11 = iArr[0];
                    final int i12 = i7;
                    final n0 n0Var = x10;
                    if (i11 == 2) {
                        n0Var.v();
                        di.e eVar = new di.e(25);
                        n0 x11 = n0.x(i12);
                        x11.m0(new d10(i12, eVar, x11));
                    } else if (i11 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        final e2 e2Var2 = e2Var;
                        long j10 = e2Var2.f42390a;
                        if (j10 != 0 && j10 <= connectionsManager.getCurrentTime()) {
                            hc.b0(hd.M0(2131742959, null));
                            u2Var2.d = false;
                            if (!u2Var2.f43174f) {
                                u2Var2.f43174f = true;
                                u2Var2.f43171b.a();
                            }
                            if (!u2Var2.f43173e) {
                                u2Var2.f43170a.dismiss();
                                return;
                            }
                            return;
                        }
                        u2Var2.d = true;
                        fi.d dVar2 = h;
                        dVar2.setLoading(true);
                        g7 g7Var2 = g7Var;
                        g7Var2.run();
                        final z2 z2Var2 = z2Var;
                        final org.telegram.ui.ActionBar.f6 f6Var5 = f6Var4;
                        final bi.z2 z2Var3 = new bi.z2(u2Var2, dVar2, z2Var2, f6Var5, g7Var2, 6);
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        n0Var.z(new v10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final u2 u2Var3 = u2.this;
                                bi.z2 z2Var4 = z2Var3;
                                final n0 n0Var2 = n0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final e2 e2Var3 = e2Var2;
                                final TLRPC.User user3 = user2;
                                final int i13 = i12;
                                final z2 z2Var5 = z2Var2;
                                final org.telegram.ui.ActionBar.f6 f6Var6 = f6Var5;
                                k0 k0Var = (k0) obj;
                                String str4 = (String) obj2;
                                if (!u2Var3.f43173e) {
                                    if (k0Var != null && str4 == null) {
                                        if (str3.equals(n0Var2.t()) && Arrays.equals(bArr3, n0Var2.y())) {
                                            final WalletEngine2 walletEngine2 = n0Var2.f42769b;
                                            if (walletEngine2 == null) {
                                                z2Var4.a(hd.M0(2131742960, null));
                                                return;
                                            }
                                            final k0 b10 = k0Var.b();
                                            Utilities.f21333e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final k0 k0Var2 = k0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f11 = v2.f(k0Var2, str5, bArr4);
                                                    final u2 u2Var4 = u2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final e2 e2Var4 = e2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i14 = i13;
                                                    final n0 n0Var3 = n0Var2;
                                                    final z2 z2Var6 = z2Var5;
                                                    final org.telegram.ui.ActionBar.f6 f6Var7 = f6Var6;
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            final u2 u2Var5 = u2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            k0 k0Var3 = k0Var2;
                                                            e2 e2Var5 = e2Var4;
                                                            TLRPC.User user5 = user4;
                                                            final int i15 = i14;
                                                            final n0 n0Var4 = n0Var3;
                                                            final z2 z2Var7 = z2Var6;
                                                            final String str6 = str5;
                                                            final byte[] bArr5 = bArr4;
                                                            final byte[] bArr6 = f11;
                                                            final org.telegram.ui.ActionBar.f6 f6Var8 = f6Var7;
                                                            try {
                                                                if (u2Var5.f43173e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(k0Var3, e2Var5, "widget:" + user5.f27101id + ":" + Utilities.f21331b.nextLong(), new v10(i15, n0Var4, z2Var7, u2Var5, str6, bArr5, bArr6, f6Var8) {
                                                                    public final int f42951a;
                                                                    public final n0 f42952b;
                                                                    public final u2 f42953c;
                                                                    public final String d;
                                                                    public final byte[] f42954e;
                                                                    public final byte[] f42955f;

                                                                    {
                                                                        this.f42953c = u2Var5;
                                                                        this.d = str6;
                                                                        this.f42954e = bArr5;
                                                                        this.f42955f = bArr6;
                                                                    }

                                                                    @Override
                                                                    public final void a(Object obj3, Object obj4) {
                                                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                                        String str7 = (String) obj4;
                                                                        u2 u2Var6 = this.f42953c;
                                                                        if (!u2Var6.f43173e || u2Var6.d) {
                                                                            if (sendtransfer == null) {
                                                                                if (str7 == null) {
                                                                                    str7 = hd.M0(2131742987, null);
                                                                                }
                                                                                hc.b0(str7);
                                                                                u2Var6.d = false;
                                                                                if (!u2Var6.f43174f) {
                                                                                    u2Var6.f43174f = true;
                                                                                    u2Var6.f43171b.a();
                                                                                }
                                                                                if (!u2Var6.f43173e) {
                                                                                    u2Var6.f43170a.dismiss();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            int i16 = this.f42951a;
                                                                            ConnectionsManager.getInstance(i16).sendRequestTyped(sendtransfer, new d3.b(1), new org.telegram.messenger.f9(i16, this.f42952b, this.d, this.f42954e, this.f42955f, sendtransfer, u2Var6));
                                                                        }
                                                                    }
                                                                });
                                                            } finally {
                                                                k0Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        hc.b0(hd.M0(2131742960, null));
                                        u2Var3.d = false;
                                        if (!u2Var3.f43174f) {
                                            u2Var3.f43174f = true;
                                            u2Var3.f43171b.a();
                                        }
                                        if (!u2Var3.f43173e) {
                                            u2Var3.f43170a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    z2Var4.a(str4);
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
        SecureRandom secureRandom = Utilities.f21331b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(k0 k0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(k0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
