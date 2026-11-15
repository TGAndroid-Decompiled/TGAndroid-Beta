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
import org.telegram.messenger.de;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u11;
import org.telegram.ui.nb1;
public abstract class s2 {
    public static final ArrayList f44479a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.r(user);
        i9Var.f(user, t8Var);
        linearLayout.addView(i9Var, c8.ja.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = d2.v(20, context, charSequence, e6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, c8.ja.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n10 = q10.n(user);
        if (!TextUtils.isEmpty(n10)) {
            linearLayout.addView(d2.h(context, "@" + n10, e6Var), c8.ja.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), c8.ja.o(-1, 12));
    }

    public static void b(w2 w2Var, r2 r2Var) {
        w2Var.f29688d0 = false;
        w2Var.f29725z0 = new org.telegram.ui.h0(r2Var, 3);
        w2Var.setOnDismissListener(new j2(r2Var, 0));
        w2Var.show();
        org.telegram.messenger.g0.i3(new r(3, r2Var, w2Var), 700L);
    }

    public static void c(Context context, final int i7, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.e6 e6Var, p2 p2Var) {
        int i10;
        int i11;
        float f10;
        String M0;
        int i12;
        final l0 x10 = l0.x(i7);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final w2 w2Var = new w2(context, e6Var, new View[0]);
        w2Var.J0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, hd.V(null, null, 2131743196, q10.p(user)), e6Var);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        f11.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f28849d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        f11.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(f11, d02, M, null, e6Var);
        if (equals) {
            i10 = 2131743010;
        } else {
            i10 = 2131743184;
        }
        TextView v = d2.v(14, context, hd.M0(i10, null), e6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        if (equals) {
            i11 = org.telegram.ui.ActionBar.j6.L6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f29090q7;
        }
        org.telegram.ui.ActionBar.q6.U(v, i11, e6Var);
        if (equals) {
            f10 = 12.0f;
        } else {
            f10 = 4.0f;
        }
        f11.addView(v, c8.ja.k(0.0f, 0.0f, 0.0f, f10, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
        } else {
            M0 = hd.M0(2131743183, null);
        }
        if (equals) {
            i12 = 14;
        } else {
            i12 = 16;
        }
        TextView v10 = d2.v(i12, context, M0, e6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f11.addView(v10, c8.ja.o(-1, -2));
        o2 o2Var = new o2(context, 320);
        o2Var.addView(f11);
        linearLayout.addView(o2Var, c8.ja.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        v2 v2Var = new v2(context);
        v2Var.getContent().addView(linearLayout, c8.ja.c(-2.0f, -1));
        w2Var.I0(v2Var);
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        if (equals) {
            TextView v11 = d2.v(14, context, hd.M0(2131743029, null), e6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.q6.U(v11, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
            f12.addView(v11, c8.ja.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(hd.M0(2131752589, null));
        final hi.d g10 = i20.g(24, context, e6Var, true);
        g10.setText(hd.M0(2131743012, null));
        linearLayout2.addView(dVar, c8.ja.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(g10, c8.ja.m(1.0f, 0, 44, 6, 0, 0));
        f12.addView(linearLayout2);
        w2Var.K0(f12);
        final r2 r2Var = new r2(w2Var, p2Var);
        final g gVar = new g(r2Var, g10, dVar, 9);
        r2Var.f44434g = gVar;
        dVar.setOnClickListener(new f2(r2Var, 1));
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final r2 r2Var2 = r2Var;
                if (!r2Var2.a() && !r2Var2.d) {
                    r2Var2.d = true;
                    final hi.d dVar2 = g10;
                    dVar2.setLoading(true);
                    final g gVar2 = gVar;
                    gVar2.run();
                    final int i14 = i7;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    final l0 l0Var = x10;
                    final w2 w2Var2 = w2Var;
                    final byte[] bArr2 = bArr;
                    l0Var.z(new s10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            r2 r2Var3 = r2Var2;
                            hi.d dVar3 = dVar2;
                            w2 w2Var3 = w2Var2;
                            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                            g gVar3 = gVar2;
                            l0 l0Var2 = l0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i15 = i14;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            i0 i0Var = (i0) obj;
                            String str4 = (String) obj2;
                            if (!r2Var3.f44432e) {
                                if (i0Var != null && str4 == null) {
                                    if (str3.equals(l0Var2.t()) && Arrays.equals(bArr3, l0Var2.y())) {
                                        i0 b10 = i0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                                        Utilities.f22416e.c(new de(b10, str3, bArr3, jSONObject3, "bot" + user3.f28200id, currentTime, r2Var3, l0Var2));
                                        return;
                                    }
                                    cc.b0(hd.M0(2131742959, null));
                                    r2Var3.d = false;
                                    if (!r2Var3.f44433f) {
                                        r2Var3.f44433f = true;
                                        r2Var3.f44430b.a();
                                    }
                                    if (!r2Var3.f44432e) {
                                        r2Var3.f44429a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                r2Var3.d = false;
                                dVar3.setLoading(false);
                                if (str4 != null) {
                                    cc.c0(str4, w2Var3.F, e6Var3);
                                }
                                gVar3.run();
                            }
                        }
                    }, true, false);
                }
            }
        });
        b(w2Var, r2Var);
        gVar.run();
    }

    public static void d(Context context, final int i7, final TLRPC.User user, final c2 c2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.e6 e6Var, p2 p2Var) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        final l0 x10 = l0.x(i7);
        char c10 = 0;
        final w2 w2Var = new w2(context, e6Var2, new View[0]);
        w2Var.J0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, hd.V(null, null, 2131743195, q10.p(user)), e6Var2);
        h6 h6Var = new h6(context, 2131232810, 24);
        h6Var.getCardHolderView().setMaxLines(2);
        h6Var.getCardHolderView().setSingleLine(false);
        List<b2> list = c2Var.f43559b;
        h6Var.setCardHolder(f8.c0(((b2) list.get(0)).f43499a));
        org.telegram.ui.Components.h6 balanceView = h6Var.getBalanceView();
        long j3 = c2Var.f43560c;
        balanceView.setText(d2.k(j3));
        h6Var.getUsdBalanceView().setText(x10.m(j3, false));
        linearLayout.addView(h6Var, c8.ja.o(-1, -2));
        LinearLayout F = d2.F(context, hd.M0(2131743207, null), e6Var2);
        for (b2 b2Var : list) {
            if (b2Var.f43500b != null && b2Var.d == null) {
                i10 = 2131743153;
            } else {
                i10 = 2131742981;
            }
            String M0 = hd.M0(i10, null);
            Object[] objArr = new Object[1];
            objArr[c10] = d2.C(b2Var.f43499a);
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(d2.c(context, M0, hd.V(null, null, 2131742976, objArr), d2.b(-b2Var.f43502e), b2Var.d, e6Var3), c8.ja.o(-1, -2));
            F = linearLayout2;
            e6Var2 = e6Var3;
            c10 = 0;
        }
        final org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
        LinearLayout linearLayout3 = F;
        o2 o2Var = new o2(context, 240);
        o2Var.addView(linearLayout3);
        linearLayout.addView(o2Var, c8.ja.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        v2 v2Var = new v2(context);
        v2Var.getContent().addView(linearLayout, c8.ja.c(-2.0f, -1));
        w2Var.I0(v2Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView v = d2.v(14, context, null, e6Var4);
        org.telegram.ui.ActionBar.q6.U(v, org.telegram.ui.ActionBar.j6.f29260z6, e6Var4);
        f10.addView(v, c8.ja.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hi.d dVar = new hi.d(context, e6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(hd.M0(2131743143, null));
        linearLayout4.addView(dVar, c8.ja.m(1.0f, 0, 44, 0, 6, 0));
        final hi.d g10 = i20.g(24, context, e6Var4, true);
        g10.setText(hd.M0(2131743168, null));
        linearLayout4.addView(g10, c8.ja.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout4);
        w2Var.K0(f10);
        final r2 r2Var = new r2(w2Var, p2Var);
        final int[] iArr = {0};
        final g7 g7Var = new g7(r2Var, g10, iArr, dVar, 10);
        final Runnable[] runnableArr = {new bi.p1(r2Var, iArr, v, g7Var, x10, c2Var, 25)};
        is isVar = new is() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr2) {
                if (iArr[0] == 2 && x10.v() >= c2Var.f43560c) {
                    runnableArr[0].run();
                }
            }
        };
        ns.f(i7).b(isVar, ns.f25467a4);
        r2Var.h = new nb1(i7, isVar, 3);
        r2Var.f44434g = g7Var;
        dVar.setOnClickListener(new f2(r2Var, 0));
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final r2 r2Var2 = r2.this;
                if (!r2Var2.a() && !r2Var2.d) {
                    int i11 = iArr[0];
                    final int i12 = i7;
                    final l0 l0Var = x10;
                    if (i11 == 2) {
                        l0Var.v();
                        fi.e eVar = new fi.e(25);
                        l0 x11 = l0.x(i12);
                        x11.m0(new u11(i12, eVar, x11));
                    } else if (i11 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        final c2 c2Var2 = c2Var;
                        long j10 = c2Var2.f43558a;
                        if (j10 != 0 && j10 <= connectionsManager.getCurrentTime()) {
                            cc.b0(hd.M0(2131742958, null));
                            r2Var2.d = false;
                            if (!r2Var2.f44433f) {
                                r2Var2.f44433f = true;
                                r2Var2.f44430b.a();
                            }
                            if (!r2Var2.f44432e) {
                                r2Var2.f44429a.dismiss();
                                return;
                            }
                            return;
                        }
                        r2Var2.d = true;
                        hi.d dVar2 = g10;
                        dVar2.setLoading(true);
                        g7 g7Var2 = g7Var;
                        g7Var2.run();
                        final w2 w2Var2 = w2Var;
                        final org.telegram.ui.ActionBar.e6 e6Var5 = e6Var4;
                        final di.i2 i2Var = new di.i2(r2Var2, dVar2, w2Var2, e6Var5, g7Var2, 6);
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        l0Var.z(new s10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final r2 r2Var3 = r2.this;
                                di.i2 i2Var2 = i2Var;
                                final l0 l0Var2 = l0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final c2 c2Var3 = c2Var2;
                                final TLRPC.User user3 = user2;
                                final int i13 = i12;
                                final w2 w2Var3 = w2Var2;
                                final org.telegram.ui.ActionBar.e6 e6Var6 = e6Var5;
                                i0 i0Var = (i0) obj;
                                String str4 = (String) obj2;
                                if (!r2Var3.f44432e) {
                                    if (i0Var != null && str4 == null) {
                                        if (str3.equals(l0Var2.t()) && Arrays.equals(bArr3, l0Var2.y())) {
                                            final WalletEngine2 walletEngine2 = l0Var2.f44079b;
                                            if (walletEngine2 == null) {
                                                i2Var2.a(hd.M0(2131742959, null));
                                                return;
                                            }
                                            final i0 b10 = i0Var.b();
                                            Utilities.f22416e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final i0 i0Var2 = i0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f11 = s2.f(i0Var2, str5, bArr4);
                                                    final r2 r2Var4 = r2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final c2 c2Var4 = c2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i14 = i13;
                                                    final l0 l0Var3 = l0Var2;
                                                    final w2 w2Var4 = w2Var3;
                                                    final org.telegram.ui.ActionBar.e6 e6Var7 = e6Var6;
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            final r2 r2Var5 = r2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            i0 i0Var3 = i0Var2;
                                                            c2 c2Var5 = c2Var4;
                                                            TLRPC.User user5 = user4;
                                                            final int i15 = i14;
                                                            final l0 l0Var4 = l0Var3;
                                                            final w2 w2Var5 = w2Var4;
                                                            final String str6 = str5;
                                                            final byte[] bArr5 = bArr4;
                                                            final byte[] bArr6 = f11;
                                                            final org.telegram.ui.ActionBar.e6 e6Var8 = e6Var7;
                                                            try {
                                                                if (r2Var5.f44432e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(i0Var3, c2Var5, "widget:" + user5.f28200id + ":" + Utilities.f22414b.nextLong(), new s10(i15, l0Var4, w2Var5, r2Var5, str6, bArr5, bArr6, e6Var8) {
                                                                    public final int f44146a;
                                                                    public final l0 f44147b;
                                                                    public final r2 f44148c;
                                                                    public final String d;
                                                                    public final byte[] f44149e;
                                                                    public final byte[] f44150f;

                                                                    {
                                                                        this.f44148c = r2Var5;
                                                                        this.d = str6;
                                                                        this.f44149e = bArr5;
                                                                        this.f44150f = bArr6;
                                                                    }

                                                                    @Override
                                                                    public final void a(Object obj3, Object obj4) {
                                                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                                        String str7 = (String) obj4;
                                                                        r2 r2Var6 = this.f44148c;
                                                                        if (!r2Var6.f44432e || r2Var6.d) {
                                                                            if (sendtransfer == null) {
                                                                                if (str7 == null) {
                                                                                    str7 = hd.M0(2131742986, null);
                                                                                }
                                                                                cc.b0(str7);
                                                                                r2Var6.d = false;
                                                                                if (!r2Var6.f44433f) {
                                                                                    r2Var6.f44433f = true;
                                                                                    r2Var6.f44430b.a();
                                                                                }
                                                                                if (!r2Var6.f44432e) {
                                                                                    r2Var6.f44429a.dismiss();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            int i16 = this.f44146a;
                                                                            ConnectionsManager.getInstance(i16).sendRequestTyped(sendtransfer, new d3.b(1), new org.telegram.messenger.e9(i16, this.f44147b, this.d, this.f44149e, this.f44150f, sendtransfer, r2Var6));
                                                                        }
                                                                    }
                                                                });
                                                            } finally {
                                                                i0Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        cc.b0(hd.M0(2131742959, null));
                                        r2Var3.d = false;
                                        if (!r2Var3.f44433f) {
                                            r2Var3.f44433f = true;
                                            r2Var3.f44430b.a();
                                        }
                                        if (!r2Var3.f44432e) {
                                            r2Var3.f44429a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    i2Var2.a(str4);
                                }
                            }
                        }, true, false);
                    }
                }
            }
        });
        b(w2Var, r2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.f22414b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(i0 i0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(i0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
