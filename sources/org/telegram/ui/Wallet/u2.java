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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.d10;
public abstract class u2 {
    public static final ArrayList f43196a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.r(user);
        l9Var.e(user, w8Var);
        linearLayout.addView(l9Var, c8.ha.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = e2.v(20, context, charSequence, f6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, c8.ha.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n10 = t10.n(user);
        if (!TextUtils.isEmpty(n10)) {
            linearLayout.addView(e2.h(context, "@" + n10, f6Var), c8.ha.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), c8.ha.o(-1, 12));
    }

    public static void b(y2 y2Var, t2 t2Var) {
        y2Var.f28623c0 = false;
        y2Var.f28657y0 = new org.telegram.ui.h0(t2Var, 3);
        y2Var.setOnDismissListener(new l2(t2Var, 0));
        y2Var.show();
        org.telegram.messenger.g0.i3(new n(6, t2Var, y2Var), 700L);
    }

    public static void c(Context context, final int i7, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.f6 f6Var, r2 r2Var) {
        int i10;
        int i11;
        float f10;
        String M0;
        int i12;
        final m0 x10 = m0.x(i7);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final y2 y2Var = new y2(context, f6Var, new View[0]);
        y2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, id.V(null, null, 2131743199, t10.p(user)), f6Var);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        f11.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f27852d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        f11.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f11, d02, N, null, f6Var);
        if (equals) {
            i10 = 2131743013;
        } else {
            i10 = 2131743187;
        }
        TextView v = e2.v(14, context, id.M0(i10, null), f6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        if (equals) {
            i11 = org.telegram.ui.ActionBar.k6.L6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28093q7;
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
            M0 = id.M0(2131743186, null);
        }
        if (equals) {
            i12 = 14;
        } else {
            i12 = 16;
        }
        TextView v10 = e2.v(i12, context, M0, f6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f11.addView(v10, c8.ha.o(-1, -2));
        q2 q2Var = new q2(context, 320);
        q2Var.addView(f11);
        linearLayout.addView(q2Var, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        x2 x2Var = new x2(context);
        x2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
        y2Var.I0(x2Var);
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        if (equals) {
            TextView v11 = e2.v(14, context, id.M0(2131743032, null), f6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.r6.V(v11, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
            f12.addView(v11, c8.ha.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(id.M0(2131752589, null));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(id.M0(2131743015, null));
        linearLayout2.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        f12.addView(linearLayout2);
        y2Var.K0(f12);
        final t2 t2Var = new t2(y2Var, r2Var);
        final g gVar = new g(t2Var, h, dVar, 9);
        t2Var.f43168g = gVar;
        dVar.setOnClickListener(new h2(t2Var, 1));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final t2 t2Var2 = t2Var;
                if (!t2Var2.a() && !t2Var2.d) {
                    t2Var2.d = true;
                    final fi.d dVar2 = h;
                    dVar2.setLoading(true);
                    final g gVar2 = gVar;
                    gVar2.run();
                    final int i14 = i7;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    final m0 m0Var = x10;
                    final y2 y2Var2 = y2Var;
                    final byte[] bArr2 = bArr;
                    m0Var.z(new v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            t2 t2Var3 = t2Var2;
                            fi.d dVar3 = dVar2;
                            y2 y2Var3 = y2Var2;
                            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                            g gVar3 = gVar2;
                            m0 m0Var2 = m0Var;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i15 = i14;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            j0 j0Var = (j0) obj;
                            String str4 = (String) obj2;
                            if (!t2Var3.f43166e) {
                                if (j0Var != null && str4 == null) {
                                    if (str3.equals(m0Var2.t()) && Arrays.equals(bArr3, m0Var2.y())) {
                                        j0 b10 = j0Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                                        Utilities.f21336e.c(new ee(b10, str3, bArr3, jSONObject3, "bot" + user3.f27105id, currentTime, t2Var3, m0Var2));
                                        return;
                                    }
                                    hc.b0(id.M0(2131742962, null));
                                    t2Var3.d = false;
                                    if (!t2Var3.f43167f) {
                                        t2Var3.f43167f = true;
                                        t2Var3.f43164b.a();
                                    }
                                    if (!t2Var3.f43166e) {
                                        t2Var3.f43163a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                t2Var3.d = false;
                                dVar3.setLoading(false);
                                if (str4 != null) {
                                    hc.c0(str4, y2Var3.E, f6Var3);
                                }
                                gVar3.run();
                            }
                        }
                    }, true, false);
                }
            }
        });
        b(y2Var, t2Var);
        gVar.run();
    }

    public static void d(Context context, final int i7, final TLRPC.User user, final d2 d2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.f6 f6Var, r2 r2Var) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        final m0 x10 = m0.x(i7);
        char c10 = 0;
        final y2 y2Var = new y2(context, f6Var2, new View[0]);
        y2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, f6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, id.V(null, null, 2131743198, t10.p(user)), f6Var2);
        g6 g6Var = new g6(context, 2131232809, 24);
        g6Var.getCardHolderView().setMaxLines(2);
        g6Var.getCardHolderView().setSingleLine(false);
        List<c2> list = d2Var.f42385b;
        g6Var.setCardHolder(e8.c0(((c2) list.get(0)).f42296a));
        org.telegram.ui.Components.j6 balanceView = g6Var.getBalanceView();
        long j3 = d2Var.f42386c;
        balanceView.setText(e2.k(j3));
        g6Var.getUsdBalanceView().setText(x10.m(j3, false));
        linearLayout.addView(g6Var, c8.ha.o(-1, -2));
        LinearLayout F = e2.F(context, id.M0(2131743210, null), f6Var2);
        for (c2 c2Var : list) {
            if (c2Var.f42297b != null && c2Var.d == null) {
                i10 = 2131743156;
            } else {
                i10 = 2131742984;
            }
            String M0 = id.M0(i10, null);
            Object[] objArr = new Object[1];
            objArr[c10] = e2.C(c2Var.f42296a);
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(e2.c(context, M0, id.V(null, null, 2131742979, objArr), e2.b(-c2Var.f42299e), c2Var.d, f6Var3), c8.ha.o(-1, -2));
            F = linearLayout2;
            f6Var2 = f6Var3;
            c10 = 0;
        }
        final org.telegram.ui.ActionBar.f6 f6Var4 = f6Var2;
        LinearLayout linearLayout3 = F;
        q2 q2Var = new q2(context, 240);
        q2Var.addView(linearLayout3);
        linearLayout.addView(q2Var, c8.ha.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        x2 x2Var = new x2(context);
        x2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
        y2Var.I0(x2Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView v = e2.v(14, context, null, f6Var4);
        org.telegram.ui.ActionBar.r6.V(v, org.telegram.ui.ActionBar.k6.f28262z6, f6Var4);
        f10.addView(v, c8.ha.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fi.d dVar = new fi.d(context, f6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(id.M0(2131743146, null));
        linearLayout4.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var4, true);
        h.setText(id.M0(2131743171, null));
        linearLayout4.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout4);
        y2Var.K0(f10);
        final t2 t2Var = new t2(y2Var, r2Var);
        final int[] iArr = {0};
        final f7 f7Var = new f7(t2Var, h, iArr, dVar, 10);
        final Runnable[] runnableArr = {new bi.a3(t2Var, iArr, v, f7Var, x10, d2Var, 23)};
        ?? r02 = new ls() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr2) {
                if (iArr[0] == 2 && x10.v() >= d2Var.f42386c) {
                    runnableArr[0].run();
                }
            }
        };
        qs.f(i7).b(r02, qs.f24971a4);
        t2Var.h = new g2(i7, r02);
        t2Var.f43168g = f7Var;
        dVar.setOnClickListener(new h2(t2Var, 0));
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final t2 t2Var2 = t2.this;
                if (!t2Var2.a() && !t2Var2.d) {
                    int i11 = iArr[0];
                    final int i12 = i7;
                    final m0 m0Var = x10;
                    if (i11 == 2) {
                        m0Var.v();
                        di.e eVar = new di.e(25);
                        m0 x11 = m0.x(i12);
                        x11.m0(new d10(i12, eVar, x11));
                    } else if (i11 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        final d2 d2Var2 = d2Var;
                        long j10 = d2Var2.f42384a;
                        if (j10 != 0 && j10 <= connectionsManager.getCurrentTime()) {
                            hc.b0(id.M0(2131742961, null));
                            t2Var2.d = false;
                            if (!t2Var2.f43167f) {
                                t2Var2.f43167f = true;
                                t2Var2.f43164b.a();
                            }
                            if (!t2Var2.f43166e) {
                                t2Var2.f43163a.dismiss();
                                return;
                            }
                            return;
                        }
                        t2Var2.d = true;
                        fi.d dVar2 = h;
                        dVar2.setLoading(true);
                        f7 f7Var2 = f7Var;
                        f7Var2.run();
                        final y2 y2Var2 = y2Var;
                        final org.telegram.ui.ActionBar.f6 f6Var5 = f6Var4;
                        final bi.z2 z2Var = new bi.z2(t2Var2, dVar2, y2Var2, f6Var5, f7Var2, 6);
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        m0Var.z(new v10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final t2 t2Var3 = t2.this;
                                bi.z2 z2Var2 = z2Var;
                                final m0 m0Var2 = m0Var;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final d2 d2Var3 = d2Var2;
                                final TLRPC.User user3 = user2;
                                final int i13 = i12;
                                final y2 y2Var3 = y2Var2;
                                final org.telegram.ui.ActionBar.f6 f6Var6 = f6Var5;
                                j0 j0Var = (j0) obj;
                                String str4 = (String) obj2;
                                if (!t2Var3.f43166e) {
                                    if (j0Var != null && str4 == null) {
                                        if (str3.equals(m0Var2.t()) && Arrays.equals(bArr3, m0Var2.y())) {
                                            final WalletEngine2 walletEngine2 = m0Var2.f42763b;
                                            if (walletEngine2 == null) {
                                                z2Var2.a(id.M0(2131742962, null));
                                                return;
                                            }
                                            final j0 b10 = j0Var.b();
                                            Utilities.f21336e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final j0 j0Var2 = j0.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f11 = u2.f(j0Var2, str5, bArr4);
                                                    final t2 t2Var4 = t2Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final d2 d2Var4 = d2Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i14 = i13;
                                                    final m0 m0Var3 = m0Var2;
                                                    final y2 y2Var4 = y2Var3;
                                                    final org.telegram.ui.ActionBar.f6 f6Var7 = f6Var6;
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            final t2 t2Var5 = t2.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            j0 j0Var3 = j0Var2;
                                                            d2 d2Var5 = d2Var4;
                                                            TLRPC.User user5 = user4;
                                                            final int i15 = i14;
                                                            final m0 m0Var4 = m0Var3;
                                                            final y2 y2Var5 = y2Var4;
                                                            final String str6 = str5;
                                                            final byte[] bArr5 = bArr4;
                                                            final byte[] bArr6 = f11;
                                                            final org.telegram.ui.ActionBar.f6 f6Var8 = f6Var7;
                                                            try {
                                                                if (t2Var5.f43166e) {
                                                                    return;
                                                                }
                                                                walletEngine23.prepareTonConnectTransfer(j0Var3, d2Var5, "widget:" + user5.f27105id + ":" + Utilities.f21334b.nextLong(), new v10(i15, m0Var4, y2Var5, t2Var5, str6, bArr5, bArr6, f6Var8) {
                                                                    public final int f42937a;
                                                                    public final m0 f42938b;
                                                                    public final t2 f42939c;
                                                                    public final String d;
                                                                    public final byte[] f42940e;
                                                                    public final byte[] f42941f;

                                                                    {
                                                                        this.f42939c = t2Var5;
                                                                        this.d = str6;
                                                                        this.f42940e = bArr5;
                                                                        this.f42941f = bArr6;
                                                                    }

                                                                    @Override
                                                                    public final void a(Object obj3, Object obj4) {
                                                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                                        String str7 = (String) obj4;
                                                                        t2 t2Var6 = this.f42939c;
                                                                        if (!t2Var6.f43166e || t2Var6.d) {
                                                                            if (sendtransfer == null) {
                                                                                if (str7 == null) {
                                                                                    str7 = id.M0(2131742989, null);
                                                                                }
                                                                                hc.b0(str7);
                                                                                t2Var6.d = false;
                                                                                if (!t2Var6.f43167f) {
                                                                                    t2Var6.f43167f = true;
                                                                                    t2Var6.f43164b.a();
                                                                                }
                                                                                if (!t2Var6.f43166e) {
                                                                                    t2Var6.f43163a.dismiss();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            int i16 = this.f42937a;
                                                                            ConnectionsManager.getInstance(i16).sendRequestTyped(sendtransfer, new d3.b(1), new org.telegram.messenger.f9(i16, this.f42938b, this.d, this.f42940e, this.f42941f, sendtransfer, t2Var6));
                                                                        }
                                                                    }
                                                                });
                                                            } finally {
                                                                j0Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        hc.b0(id.M0(2131742962, null));
                                        t2Var3.d = false;
                                        if (!t2Var3.f43167f) {
                                            t2Var3.f43167f = true;
                                            t2Var3.f43164b.a();
                                        }
                                        if (!t2Var3.f43166e) {
                                            t2Var3.f43163a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    z2Var2.a(str4);
                                }
                            }
                        }, true, false);
                    }
                }
            }
        });
        b(y2Var, t2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.f21334b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(j0 j0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(j0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
