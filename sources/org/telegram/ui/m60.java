package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class m60 implements org.telegram.messenger.p10 {
    public final int f49965a = 2;
    public final int f49966b;
    public final Object f49967c;
    public final Object d;
    public final Object f49968e;
    public final Object f49969f;

    public m60(Context context, int i7, org.telegram.ui.Wallet.v0 v0Var, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.f49967c = context;
        this.f49966b = i7;
        this.d = v0Var;
        this.f49968e = i6Var;
        this.f49969f = runnable;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.g2 T;
        org.telegram.ui.Wallet.i2 i2Var;
        org.telegram.ui.Wallet.m2 m2Var;
        boolean z10;
        int i7;
        String str;
        final int i10;
        CharSequence V;
        int i11;
        int i12;
        String str2;
        int i13;
        String N0;
        int i14;
        int i15;
        int i16;
        int i17 = this.f49965a;
        int i18 = this.f49966b;
        Object obj3 = this.f49969f;
        Object obj4 = this.f49968e;
        Object obj5 = this.d;
        Object obj6 = this.f49967c;
        switch (i17) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str3 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    mpVar.e4(user2, false, false);
                    mpVar.c3(user2, 0, true, null);
                }
                launchActivity.m0(i18, user.f28641id, tL_error);
                return;
            case 1:
                r90 r90Var = (r90) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = r90Var.f51667a;
                r90Var.h = -1;
                if (!r90Var.f51674j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        r90Var.c();
                        if (r90Var.a()) {
                            r90.d().g0(tL_error2, false);
                        }
                    } else {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str4.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i19);
                                    i19++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str5.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f28754id && tonconnectrequest2.expires > ConnectionsManager.getInstance(r90Var.f51668b).getCurrentTime()) {
                                        if (r90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            r90Var.c();
                                            org.telegram.ui.Wallet.m2.q(r90Var.f51667a, r90Var.f51668b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new k90(r90Var, str6, 3));
                                        }
                                    }
                                }
                            }
                        }
                        int i20 = this.f49966b;
                        if (i20 < 10) {
                            ai.d1 d1Var = new ai.d1(r90Var, str4, str5, str6, i20, 23);
                            r90Var.f51673i = d1Var;
                            org.telegram.messenger.g0.h3(d1Var, 500L);
                            return;
                        }
                        r90Var.c();
                        if (r90Var.a()) {
                            org.telegram.ui.Components.kc.c0(org.telegram.messenger.gd.N0(2131742722, null));
                            return;
                        }
                        return;
                    }
                    return;
                }
                r90Var.c();
                return;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.i2 i2Var2 = (org.telegram.ui.Wallet.i2) obj;
                String str7 = (String) obj2;
                if (i2Var2 != null) {
                    int i21 = i2Var2.f44463c;
                    TL_wallet.tonConnectSession tonconnectsession2 = i2Var2.f44461a;
                    String str8 = i2Var2.f44464e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.bz.f23333x || org.telegram.messenger.bz.C || org.telegram.messenger.i10.f24637t0 != i18) {
                            v0Var.f45260g.u(i2Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str8)) {
                        final org.telegram.ui.Wallet.m2 m2Var2 = org.telegram.ui.Wallet.v0.D(i18).f45260g;
                        try {
                            JSONObject jSONObject = new JSONObject(i2Var2.f44469k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.e3 e3Var = new org.telegram.ui.Wallet.e3(context, i6Var, new View[0]);
                            e3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, i6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e10 = org.telegram.messenger.m10.e(context, 2131231244);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.G6, i6Var, PorterDuff.Mode.SRC_IN);
                            int i22 = org.telegram.ui.ActionBar.n6.f29543i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i22, i6Var), 1, -1);
                            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i22);
                            e10.setBackground(h02);
                            org.telegram.ui.ActionBar.u6.j(e10, h02, null, M, i6Var);
                            e10.setContentDescription(org.telegram.messenger.gd.N0(2131752029, null));
                            e10.setOnClickListener(new ig0(18, i2Var2, e3Var));
                            linearLayout2.addView(e10, c8.na.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                            p9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                p9Var.p(org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(p9Var, c8.na.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.m2.v(18, context, org.telegram.messenger.gd.N0(2131742740, null), i6Var);
                            v.setTypeface(org.telegram.messenger.g0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, c8.na.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), i6Var);
                            int i23 = org.telegram.ui.ActionBar.n6.f29862z6;
                            org.telegram.ui.ActionBar.u6.U(v10, i23, i6Var);
                            v10.setGravity(3);
                            v10.setSingleLine(true);
                            v10.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v10, c8.na.o(-1, -2));
                            linearLayout2.addView(linearLayout3, c8.na.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, c8.na.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i24 = org.telegram.ui.ActionBar.n6.f29451d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i24, i6Var));
                            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i24);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.u6.j(linearLayout4, d02, M2, null, i6Var);
                            if (equals) {
                                N0 = jSONObject.optString("text");
                            } else {
                                N0 = org.telegram.messenger.gd.N0(2131742932, null);
                            }
                            if (equals) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            TextView v11 = org.telegram.ui.Wallet.m2.v(i14, context, N0, i6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.gd.N0(2131742739, null), i6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.u6.U(v12, org.telegram.ui.ActionBar.n6.L6, i6Var);
                                linearLayout4.addView(v12, c8.na.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i15 = -1;
                                i16 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.m2.v(12, context, "!", i6Var);
                                v13.setTypeface(org.telegram.messenger.g0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i25 = org.telegram.ui.ActionBar.n6.f29692q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i25, i6Var));
                                org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i25);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.u6.j(v13, d03, M3, null, i6Var);
                                linearLayout5.addView(v13, c8.na.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.gd.N0(2131742933, null), i6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                i15 = -1;
                                i16 = -2;
                                linearLayout5.addView(v14, c8.na.o(-1, -2));
                                linearLayout4.addView(linearLayout5, c8.na.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, c8.na.o(i15, i16));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.s1(jSONObject, e3Var, i6Var, 0));
                            }
                            bi.m6 m6Var = new bi.m6(context, 4);
                            m6Var.addView(linearLayout4);
                            linearLayout.addView(m6Var, c8.na.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.d3 d3Var = new org.telegram.ui.Wallet.d3(context);
                            d3Var.getContent().addView(linearLayout, c8.na.c(-2.0f, -1));
                            e3Var.J0(d3Var);
                            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.gd.N0(2131742758, null), i6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.u6.U(v15, i23, i6Var);
                                g10.addView(v15, c8.na.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            hi.e eVar = new hi.e(context, i6Var, true);
                            eVar.setRoundRadius(24);
                            eVar.e();
                            eVar.setText(org.telegram.messenger.gd.N0(2131752577, null));
                            hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
                            g11.setText(org.telegram.messenger.gd.N0(2131742741, null));
                            g11.setEnabled(false);
                            linearLayout6.addView(eVar, c8.na.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(g11, c8.na.m(1.0f, 0, 44, 6, 0, 0));
                            g10.addView(linearLayout6);
                            e3Var.L0(g10);
                            e3Var.f30269z0 = new h0(i2Var2, 2);
                            org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(m6Var, i2Var2, g11, 4);
                            m6Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.t1(pVar, 0));
                            m6Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.u1(pVar, 0));
                            final org.telegram.ui.Wallet.v1 v1Var = new org.telegram.ui.Wallet.v1(g11, eVar, m2Var2, i2Var2, e3Var, i6Var, pVar);
                            g11.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            v1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            v1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            eVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            v1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            v1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final org.telegram.ui.Wallet.g2 g2Var = new org.telegram.ui.Wallet.g2(zArr, i2Var2, e3Var, 0);
                            i2Var2.f44476r = new org.telegram.ui.Wallet.m(e3Var, 4);
                            e3Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r6) {
                                        case 0:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((g2) g2Var);
                                            m2Var2.u(i2Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((g2) g2Var);
                                            m2Var2.u(i2Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            e3Var.show();
                            org.telegram.messenger.g0.h3(g2Var, Math.max(0L, i21 - m2Var2.f44652f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e11) {
                            m2Var2.u(i2Var2);
                            org.telegram.ui.Components.kc.c0(org.telegram.ui.Wallet.m2.i("display signing data", e11));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i18);
                    org.telegram.ui.Wallet.m2 m2Var3 = D.f45260g;
                    org.telegram.ui.Wallet.l2 l2Var = i2Var2.f44465f;
                    boolean equals2 = "signMessage".equals(str8);
                    final org.telegram.ui.Wallet.e3 e3Var2 = new org.telegram.ui.Wallet.e3(context, i6Var, new View[0]);
                    e3Var2.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, i6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
                    p9Var2.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        i2Var = i2Var2;
                        m2Var = m2Var3;
                        z10 = equals2;
                        p9Var2.p(org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        i2Var = i2Var2;
                        m2Var = m2Var3;
                        z10 = equals2;
                    }
                    linearLayout7.addView(p9Var2, c8.na.t(76, 76, 1, 0, 24, 0, 0));
                    if (z10) {
                        i7 = 2131742945;
                    } else {
                        i7 = 2131742944;
                    }
                    TextView v16 = org.telegram.ui.Wallet.m2.v(20, context, org.telegram.messenger.gd.V(null, null, i7, tonconnectsession2.manifest.name), i6Var);
                    v16.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout7.addView(v16, c8.na.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.m2.h(context, K0, i6Var), c8.na.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.y6 y6Var = new org.telegram.ui.Wallet.y6(context, 2131232815, 24);
                    y6Var.getCardHolderView().setMaxLines(2);
                    y6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.k2> list = l2Var.f44607b;
                    long j3 = l2Var.f44608c;
                    y6Var.setCardHolder(org.telegram.ui.Wallet.v8.c0(((org.telegram.ui.Wallet.k2) list.get(0)).f44556a));
                    y6Var.getBalanceView().setText(org.telegram.ui.Wallet.m2.k(j3));
                    y6Var.getUsdBalanceView().setText(D.r(j3, false));
                    linearLayout7.addView(y6Var, c8.na.o(-1, -2));
                    y6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    e3 e3Var3 = e3Var2;
                                    hi.q1 q1Var = e3Var3.f44200m1;
                                    if (1 < e3Var3.n1.size() && 1 != q1Var.getCurrentPosition()) {
                                        for (View view2 : q1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        q1Var.C(1);
                                        return;
                                    }
                                    return;
                                default:
                                    e3 e3Var4 = e3Var2;
                                    hi.q1 q1Var2 = e3Var4.f44200m1;
                                    if (e3Var4.n1.size() > 0 && q1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : q1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        q1Var2.C(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Wallet.d3 d3Var2 = new org.telegram.ui.Wallet.d3(context);
                    d3Var2.getContent().addView(linearLayout7, c8.na.c(-2.0f, -1));
                    e3Var2.J0(d3Var2);
                    LinearLayout g12 = org.telegram.messenger.f3.g(context, 1);
                    LinearLayout g13 = org.telegram.messenger.f3.g(context, 0);
                    g12.addView(g13, c8.na.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231243);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i26 = org.telegram.ui.ActionBar.n6.f29543i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i26, i6Var), 1, -1);
                    org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i26);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.u6.j(imageView, h03, null, M4, i6Var);
                    int i27 = org.telegram.ui.ActionBar.n6.G6;
                    org.telegram.ui.ActionBar.u6.s(imageView, i27, i6Var, PorterDuff.Mode.SRC_IN);
                    c8.sa.a(imageView);
                    g13.addView(imageView, c8.na.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.p9 p9Var3 = new org.telegram.ui.Components.p9(context);
                    p9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        str = "signMessage";
                        p9Var3.p(org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        str = "signMessage";
                    }
                    g13.addView(p9Var3, c8.na.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    g13.addView(linearLayout8, c8.na.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView, i27, i6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, c8.na.o(-1, -2));
                    textView.setText(org.telegram.messenger.gd.N0(2131742916, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
                        i10 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, c8.na.o(-1, -2));
                        textView2.setText(K0);
                    } else {
                        i10 = 1;
                    }
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (i10) {
                                case 0:
                                    e3 e3Var3 = e3Var2;
                                    hi.q1 q1Var = e3Var3.f44200m1;
                                    if (1 < e3Var3.n1.size() && 1 != q1Var.getCurrentPosition()) {
                                        for (View view2 : q1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        q1Var.C(1);
                                        return;
                                    }
                                    return;
                                default:
                                    e3 e3Var4 = e3Var2;
                                    hi.q1 q1Var2 = e3Var4.f44200m1;
                                    if (e3Var4.n1.size() > 0 && q1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : q1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        q1Var2.C(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i10);
                    LinearLayout F = org.telegram.ui.Wallet.m2.F(context, org.telegram.messenger.gd.N0(2131742780, null), i6Var);
                    String C = org.telegram.ui.Wallet.m2.C(((org.telegram.ui.Wallet.k2) list.get(0)).f44556a);
                    SpannableStringBuilder x10 = org.telegram.ui.Wallet.v0.x(j3, i10);
                    if (list.size() > i10) {
                        Integer valueOf = Integer.valueOf(list.size() - i10);
                        Object[] objArr = new Object[2];
                        objArr[0] = C;
                        objArr[i10] = valueOf;
                        V = org.telegram.messenger.gd.V(null, null, 2131742704, objArr);
                    } else {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = C;
                        V = org.telegram.messenger.gd.V(null, null, 2131742705, objArr2);
                    }
                    F.addView(org.telegram.ui.Wallet.m2.c(context, x10, V, null, null, i6Var), c8.na.o(-1, -2));
                    linearLayout9.addView(F, c8.na.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.m2.F(context, org.telegram.messenger.gd.N0(2131742956, null), i6Var);
                    for (org.telegram.ui.Wallet.k2 k2Var : list) {
                        if (k2Var.f44557b == null || k2Var.d != null) {
                            str2 = null;
                            i13 = 2131742710;
                        } else {
                            i13 = 2131742902;
                            str2 = null;
                        }
                        F2.addView(org.telegram.ui.Wallet.m2.c(context, org.telegram.messenger.gd.N0(i13, str2), org.telegram.messenger.gd.V(str2, str2, 2131742705, org.telegram.ui.Wallet.m2.C(k2Var.f44556a)), org.telegram.ui.Wallet.m2.b(-k2Var.f44559e), k2Var.d, i6Var), c8.na.o(-1, -2));
                    }
                    linearLayout9.addView(F2, c8.na.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    bi.m6 m6Var2 = new bi.m6(context, 5);
                    m6Var2.setFillViewport(false);
                    m6Var2.addView(linearLayout9);
                    g12.addView(m6Var2, c8.na.o(-1, -2));
                    org.telegram.ui.Wallet.d3 d3Var3 = new org.telegram.ui.Wallet.d3(context);
                    d3Var3.getContent().addView(g12, c8.na.c(-2.0f, -1));
                    e3Var2.J0(d3Var3);
                    LinearLayout g14 = org.telegram.messenger.f3.g(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.m2.v(14, context, null, i6Var);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o80(org.telegram.messenger.g0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.gd.V(null, null, 2131742868, spannableStringBuilder));
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    v17.setVisibility(i11);
                    org.telegram.ui.ActionBar.u6.U(v17, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
                    g14.addView(v17, c8.na.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                    hi.e eVar2 = new hi.e(context, i6Var, true);
                    eVar2.setRoundRadius(24);
                    eVar2.e();
                    eVar2.setText(org.telegram.messenger.gd.N0(2131742892, null));
                    linearLayout10.addView(eVar2, c8.na.m(1.0f, 0, 44, 0, 6, 0));
                    hi.e g15 = org.telegram.messenger.m10.g(24, context, i6Var, true);
                    if (z10) {
                        i12 = 2131742741;
                    } else {
                        i12 = 2131742917;
                    }
                    g15.setText(org.telegram.messenger.gd.N0(i12, null));
                    g15.setEnabled(false);
                    linearLayout10.addView(g15, c8.na.m(1.0f, 0, 44, 6, 0, 0));
                    g14.addView(linearLayout10);
                    e3Var2.L0(g14);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.i2 i2Var3 = i2Var;
                    final org.telegram.ui.Wallet.m2 m2Var4 = m2Var;
                    final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(i2Var3, zArr3, g15, eVar2, m2Var4, e3Var2, zArr2, i6Var);
                    g15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    p1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    p1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    eVar2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    p1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    p1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.g2 g2Var2 = new org.telegram.ui.Wallet.g2(zArr2, i2Var3, e3Var2, 1);
                    long j10 = i21;
                    long j11 = l2Var.f44606a;
                    if (j11 == 0) {
                        j11 = Long.MAX_VALUE;
                    }
                    i2Var3.f44476r = new org.telegram.ui.Wallet.m(e3Var2, 4);
                    e3Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (r6) {
                                case 0:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((g2) g2Var2);
                                    m2Var4.u(i2Var3);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((g2) g2Var2);
                                    m2Var4.u(i2Var3);
                                    Runnable runnable3 = runnable;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    e3Var2.show();
                    org.telegram.messenger.g0.h3(g2Var2, Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i18).getCurrentTime()) * 1000);
                    oi.c cVar = new oi.c(zArr2, i2Var3, zArr3, g15, z10, D, v17, e3Var2, i6Var);
                    WalletEngine2 walletEngine2 = m2Var4.f44649b.f45256b;
                    if (!i2Var3.f44472n && !m2Var4.j(i2Var3) && m2Var4.A(i2Var3) && walletEngine2 != null) {
                        if (str.equals(str8)) {
                            walletEngine2.previewSignMessage(l2Var, new org.telegram.ui.Wallet.o(m2Var4, i2Var3, cVar, 2));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(l2Var, new org.telegram.ui.Wallet.j(m2Var4, i2Var3, cVar, 9));
                            return;
                        }
                    }
                    cVar.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str7 != null) {
                    org.telegram.ui.Components.kc.c0(str7);
                    return;
                } else {
                    return;
                }
            default:
                hi.e eVar3 = (hi.e) obj6;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                eVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i18).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i18).isTestBackend();
                    StringBuilder n10 = i5.c.n("wear-auth: sending /token account=", i18, " dcId=", currentDatacenterId, " isTest=");
                    n10.append(isTestBackend);
                    org.telegram.messenger.a8.b(n10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = wc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.o0 o0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.f6202c).f6385i;
                        b9.g0 g0Var = new b9.g0(o0Var, (String) r7Var.d, "/tg-wear-auth/token", c10);
                        o0Var.f6332b.d(0, g0Var);
                        q6.m.n(g0Var, b9.i0.f2981a).addOnSuccessListener(new uc1(0, r7Var, eVar3)).addOnFailureListener(new tc1(eVar3, 1));
                        w2Var.dismiss();
                        return;
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0(e12.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.c0.t(w2Var.F, w2Var.J0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public m60(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, int i7, View view, a8.r7 r7Var) {
        this.f49967c = eVar;
        this.d = w2Var;
        this.f49966b = i7;
        this.f49968e = view;
        this.f49969f = r7Var;
    }

    public m60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.mp mpVar, int i7, TLRPC.User user) {
        this.f49967c = launchActivity;
        this.d = bVar;
        this.f49968e = mpVar;
        this.f49966b = i7;
        this.f49969f = user;
    }

    public m60(r90 r90Var, String str, String str2, String str3, int i7) {
        this.f49967c = r90Var;
        this.d = str;
        this.f49968e = str2;
        this.f49969f = str3;
        this.f49966b = i7;
    }
}
