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
public final class m60 implements org.telegram.messenger.q10 {
    public final int f49725a = 2;
    public final int f49726b;
    public final Object f49727c;
    public final Object d;
    public final Object f49728e;
    public final Object f49729f;

    public m60(Context context, int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.f49727c = context;
        this.f49726b = i7;
        this.d = u0Var;
        this.f49728e = i6Var;
        this.f49729f = runnable;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.h2 T;
        org.telegram.ui.Wallet.h2 h2Var;
        org.telegram.ui.Wallet.l2 l2Var;
        boolean z10;
        int i7;
        String str;
        final int i10;
        CharSequence V;
        int i11;
        int i12;
        String str2;
        int i13;
        String M0;
        int i14;
        int i15;
        int i16;
        int i17 = this.f49725a;
        int i18 = this.f49726b;
        Object obj3 = this.f49729f;
        Object obj4 = this.f49728e;
        Object obj5 = this.d;
        Object obj6 = this.f49727c;
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
                launchActivity.m0(i18, user.f28552id, tL_error);
                return;
            case 1:
                s90 s90Var = (s90) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = s90Var.f51934a;
                s90Var.h = -1;
                if (!s90Var.f51941j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        s90Var.c();
                        if (s90Var.a()) {
                            s90.d().g0(tL_error2, false);
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
                                    if (str5.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f28665id && tonconnectrequest2.expires > ConnectionsManager.getInstance(s90Var.f51935b).getCurrentTime()) {
                                        if (s90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            s90Var.c();
                                            org.telegram.ui.Wallet.l2.q(s90Var.f51934a, s90Var.f51935b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new l90(s90Var, str6, 3));
                                        }
                                    }
                                }
                            }
                        }
                        int i20 = this.f49726b;
                        if (i20 < 10) {
                            ai.g1 g1Var = new ai.g1(s90Var, str4, str5, str6, i20, 23);
                            s90Var.f51940i = g1Var;
                            org.telegram.messenger.g0.h3(g1Var, 500L);
                            return;
                        }
                        s90Var.c();
                        if (s90Var.a()) {
                            org.telegram.ui.Components.lc.c0(org.telegram.messenger.gd.M0(2131742735, null));
                            return;
                        }
                        return;
                    }
                    return;
                }
                s90Var.c();
                return;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) obj;
                String str7 = (String) obj2;
                if (h2Var2 != null) {
                    int i21 = h2Var2.f44291c;
                    TL_wallet.tonConnectSession tonconnectsession2 = h2Var2.f44289a;
                    String str8 = h2Var2.f44292e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.bz.f23208x || org.telegram.messenger.bz.C || org.telegram.messenger.j10.f24770t0 != i18) {
                            u0Var.f45088g.u(h2Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str8)) {
                        final org.telegram.ui.Wallet.l2 l2Var2 = org.telegram.ui.Wallet.u0.D(i18).f45088g;
                        try {
                            JSONObject jSONObject = new JSONObject(h2Var2.f44297k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.d3 d3Var = new org.telegram.ui.Wallet.d3(context, i6Var, new View[0]);
                            d3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29337a7, i6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e10 = org.telegram.messenger.n10.e(context, 2131231241);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.G6, i6Var, PorterDuff.Mode.SRC_IN);
                            int i22 = org.telegram.ui.ActionBar.n6.f29486i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i22, i6Var), 1, -1);
                            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i22);
                            e10.setBackground(h02);
                            org.telegram.ui.ActionBar.u6.j(e10, h02, null, M, i6Var);
                            e10.setContentDescription(org.telegram.messenger.gd.M0(2131752030, null));
                            e10.setOnClickListener(new cd0(20, h2Var2, d3Var));
                            linearLayout2.addView(e10, c8.ma.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                            q9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                q9Var.p(org.telegram.messenger.fc.p(org.telegram.messenger.h20.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(q9Var, c8.ma.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.l2.v(18, context, org.telegram.messenger.gd.M0(2131742753, null), i6Var);
                            v.setTypeface(org.telegram.messenger.g0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, c8.ma.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.l2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), i6Var);
                            int i23 = org.telegram.ui.ActionBar.n6.f29805z6;
                            org.telegram.ui.ActionBar.u6.U(v10, i23, i6Var);
                            v10.setGravity(3);
                            v10.setSingleLine(true);
                            v10.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v10, c8.ma.o(-1, -2));
                            linearLayout2.addView(linearLayout3, c8.ma.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, c8.ma.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i24 = org.telegram.ui.ActionBar.n6.f29394d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i24, i6Var));
                            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i24);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.u6.j(linearLayout4, d02, M2, null, i6Var);
                            if (equals) {
                                M0 = jSONObject.optString("text");
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131742945, null);
                            }
                            if (equals) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            TextView v11 = org.telegram.ui.Wallet.l2.v(i14, context, M0, i6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.l2.v(14, context, org.telegram.messenger.gd.M0(2131742752, null), i6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.u6.U(v12, org.telegram.ui.ActionBar.n6.L6, i6Var);
                                linearLayout4.addView(v12, c8.ma.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i15 = -1;
                                i16 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.l2.v(12, context, "!", i6Var);
                                v13.setTypeface(org.telegram.messenger.g0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i25 = org.telegram.ui.ActionBar.n6.f29635q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i25, i6Var));
                                org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i25);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.u6.j(v13, d03, M3, null, i6Var);
                                linearLayout5.addView(v13, c8.ma.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.l2.v(14, context, org.telegram.messenger.gd.M0(2131742946, null), i6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                i15 = -1;
                                i16 = -2;
                                linearLayout5.addView(v14, c8.ma.o(-1, -2));
                                linearLayout4.addView(linearLayout5, c8.ma.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, c8.ma.o(i15, i16));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.r1(jSONObject, d3Var, i6Var, 0));
                            }
                            bi.g6 g6Var = new bi.g6(context, 4);
                            g6Var.addView(linearLayout4);
                            linearLayout.addView(g6Var, c8.ma.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(context);
                            c3Var.getContent().addView(linearLayout, c8.ma.c(-2.0f, -1));
                            d3Var.J0(c3Var);
                            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.l2.v(14, context, org.telegram.messenger.gd.M0(2131742771, null), i6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.u6.U(v15, i23, i6Var);
                                g10.addView(v15, c8.ma.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            hi.d dVar = new hi.d(context, i6Var, true);
                            dVar.setRoundRadius(24);
                            dVar.e();
                            dVar.setText(org.telegram.messenger.gd.M0(2131752578, null));
                            hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
                            g11.setText(org.telegram.messenger.gd.M0(2131742754, null));
                            g11.setEnabled(false);
                            linearLayout6.addView(dVar, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(g11, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
                            g10.addView(linearLayout6);
                            d3Var.L0(g10);
                            d3Var.f30233z0 = new h0(h2Var2, 2);
                            org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(g6Var, h2Var2, g11, 4);
                            g6Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.s1(pVar, 0));
                            g6Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.t1(pVar, 0));
                            final org.telegram.ui.Wallet.u1 u1Var = new org.telegram.ui.Wallet.u1(g11, dVar, l2Var2, h2Var2, d3Var, i6Var, pVar);
                            g11.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            u1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            u1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            dVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            u1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            u1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final org.telegram.ui.Wallet.f2 f2Var = new org.telegram.ui.Wallet.f2(zArr, h2Var2, d3Var, 0);
                            h2Var2.f44304r = new org.telegram.ui.Wallet.m(d3Var, 4);
                            d3Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r6) {
                                        case 0:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((f2) f2Var);
                                            l2Var2.u(h2Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((f2) f2Var);
                                            l2Var2.u(h2Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            d3Var.show();
                            org.telegram.messenger.g0.h3(f2Var, Math.max(0L, i21 - l2Var2.f44483f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e11) {
                            l2Var2.u(h2Var2);
                            org.telegram.ui.Components.lc.c0(org.telegram.ui.Wallet.l2.i("display signing data", e11));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i18);
                    org.telegram.ui.Wallet.l2 l2Var3 = D.f45088g;
                    org.telegram.ui.Wallet.k2 k2Var = h2Var2.f44293f;
                    boolean equals2 = "signMessage".equals(str8);
                    final org.telegram.ui.Wallet.d3 d3Var2 = new org.telegram.ui.Wallet.d3(context, i6Var, new View[0]);
                    d3Var2.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29337a7, i6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
                    q9Var2.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        h2Var = h2Var2;
                        l2Var = l2Var3;
                        z10 = equals2;
                        q9Var2.p(org.telegram.messenger.fc.p(org.telegram.messenger.h20.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        h2Var = h2Var2;
                        l2Var = l2Var3;
                        z10 = equals2;
                    }
                    linearLayout7.addView(q9Var2, c8.ma.t(76, 76, 1, 0, 24, 0, 0));
                    if (z10) {
                        i7 = 2131742958;
                    } else {
                        i7 = 2131742957;
                    }
                    TextView v16 = org.telegram.ui.Wallet.l2.v(20, context, org.telegram.messenger.gd.V(null, null, i7, tonconnectsession2.manifest.name), i6Var);
                    v16.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout7.addView(v16, c8.ma.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.l2.h(context, K0, i6Var), c8.ma.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.x6 x6Var = new org.telegram.ui.Wallet.x6(context, 2131232812, 24);
                    x6Var.getCardHolderView().setMaxLines(2);
                    x6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.j2> list = k2Var.f44436b;
                    long j3 = k2Var.f44437c;
                    x6Var.setCardHolder(org.telegram.ui.Wallet.u8.c0(((org.telegram.ui.Wallet.j2) list.get(0)).f44385a));
                    x6Var.getBalanceView().setText(org.telegram.ui.Wallet.l2.k(j3));
                    x6Var.getUsdBalanceView().setText(D.r(j3, false));
                    linearLayout7.addView(x6Var, c8.ma.o(-1, -2));
                    x6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    d3 d3Var3 = d3Var2;
                                    hi.i1 i1Var = d3Var3.f44029m1;
                                    if (1 < d3Var3.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                        for (View view2 : i1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        i1Var.A(1);
                                        return;
                                    }
                                    return;
                                default:
                                    d3 d3Var4 = d3Var2;
                                    hi.i1 i1Var2 = d3Var4.f44029m1;
                                    if (d3Var4.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : i1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        i1Var2.A(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Wallet.c3 c3Var2 = new org.telegram.ui.Wallet.c3(context);
                    c3Var2.getContent().addView(linearLayout7, c8.ma.c(-2.0f, -1));
                    d3Var2.J0(c3Var2);
                    LinearLayout g12 = org.telegram.messenger.f3.g(context, 1);
                    LinearLayout g13 = org.telegram.messenger.f3.g(context, 0);
                    g12.addView(g13, c8.ma.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231240);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i26 = org.telegram.ui.ActionBar.n6.f29486i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i26, i6Var), 1, -1);
                    org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i26);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.u6.j(imageView, h03, null, M4, i6Var);
                    int i27 = org.telegram.ui.ActionBar.n6.G6;
                    org.telegram.ui.ActionBar.u6.s(imageView, i27, i6Var, PorterDuff.Mode.SRC_IN);
                    c8.ra.a(imageView);
                    g13.addView(imageView, c8.ma.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.q9 q9Var3 = new org.telegram.ui.Components.q9(context);
                    q9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        str = "signMessage";
                        q9Var3.p(org.telegram.messenger.fc.p(org.telegram.messenger.h20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        str = "signMessage";
                    }
                    g13.addView(q9Var3, c8.ma.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    g13.addView(linearLayout8, c8.ma.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView, i27, i6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, c8.ma.o(-1, -2));
                    textView.setText(org.telegram.messenger.gd.M0(2131742929, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
                        i10 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, c8.ma.o(-1, -2));
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
                                    d3 d3Var3 = d3Var2;
                                    hi.i1 i1Var = d3Var3.f44029m1;
                                    if (1 < d3Var3.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                        for (View view2 : i1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        i1Var.A(1);
                                        return;
                                    }
                                    return;
                                default:
                                    d3 d3Var4 = d3Var2;
                                    hi.i1 i1Var2 = d3Var4.f44029m1;
                                    if (d3Var4.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : i1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        i1Var2.A(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i10);
                    LinearLayout F = org.telegram.ui.Wallet.l2.F(context, org.telegram.messenger.gd.M0(2131742793, null), i6Var);
                    String C = org.telegram.ui.Wallet.l2.C(((org.telegram.ui.Wallet.j2) list.get(0)).f44385a);
                    SpannableStringBuilder x10 = org.telegram.ui.Wallet.u0.x(j3, i10);
                    if (list.size() > i10) {
                        Integer valueOf = Integer.valueOf(list.size() - i10);
                        Object[] objArr = new Object[2];
                        objArr[0] = C;
                        objArr[i10] = valueOf;
                        V = org.telegram.messenger.gd.V(null, null, 2131742717, objArr);
                    } else {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = C;
                        V = org.telegram.messenger.gd.V(null, null, 2131742718, objArr2);
                    }
                    F.addView(org.telegram.ui.Wallet.l2.c(context, x10, V, null, null, i6Var), c8.ma.o(-1, -2));
                    linearLayout9.addView(F, c8.ma.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.l2.F(context, org.telegram.messenger.gd.M0(2131742969, null), i6Var);
                    for (org.telegram.ui.Wallet.j2 j2Var : list) {
                        if (j2Var.f44386b == null || j2Var.d != null) {
                            str2 = null;
                            i13 = 2131742723;
                        } else {
                            i13 = 2131742915;
                            str2 = null;
                        }
                        F2.addView(org.telegram.ui.Wallet.l2.c(context, org.telegram.messenger.gd.M0(i13, str2), org.telegram.messenger.gd.V(str2, str2, 2131742718, org.telegram.ui.Wallet.l2.C(j2Var.f44385a)), org.telegram.ui.Wallet.l2.b(-j2Var.f44388e), j2Var.d, i6Var), c8.ma.o(-1, -2));
                    }
                    linearLayout9.addView(F2, c8.ma.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    bi.g6 g6Var2 = new bi.g6(context, 5);
                    g6Var2.setFillViewport(false);
                    g6Var2.addView(linearLayout9);
                    g12.addView(g6Var2, c8.ma.o(-1, -2));
                    org.telegram.ui.Wallet.c3 c3Var3 = new org.telegram.ui.Wallet.c3(context);
                    c3Var3.getContent().addView(g12, c8.ma.c(-2.0f, -1));
                    d3Var2.J0(c3Var3);
                    LinearLayout g14 = org.telegram.messenger.f3.g(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.l2.v(14, context, null, i6Var);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p80(org.telegram.messenger.g0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.gd.V(null, null, 2131742881, spannableStringBuilder));
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    v17.setVisibility(i11);
                    org.telegram.ui.ActionBar.u6.U(v17, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
                    g14.addView(v17, c8.ma.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                    hi.d dVar2 = new hi.d(context, i6Var, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.setText(org.telegram.messenger.gd.M0(2131742905, null));
                    linearLayout10.addView(dVar2, c8.ma.m(1.0f, 0, 44, 0, 6, 0));
                    hi.d g15 = org.telegram.messenger.n10.g(24, context, i6Var, true);
                    if (z10) {
                        i12 = 2131742754;
                    } else {
                        i12 = 2131742930;
                    }
                    g15.setText(org.telegram.messenger.gd.M0(i12, null));
                    g15.setEnabled(false);
                    linearLayout10.addView(g15, c8.ma.m(1.0f, 0, 44, 6, 0, 0));
                    g14.addView(linearLayout10);
                    d3Var2.L0(g14);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.h2 h2Var3 = h2Var;
                    final org.telegram.ui.Wallet.l2 l2Var4 = l2Var;
                    final org.telegram.ui.Wallet.o1 o1Var = new org.telegram.ui.Wallet.o1(h2Var3, zArr3, g15, dVar2, l2Var4, d3Var2, zArr2, i6Var);
                    g15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    o1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    o1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    dVar2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    o1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    o1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.f2 f2Var2 = new org.telegram.ui.Wallet.f2(zArr2, h2Var3, d3Var2, 1);
                    long j10 = i21;
                    long j11 = k2Var.f44435a;
                    if (j11 == 0) {
                        j11 = Long.MAX_VALUE;
                    }
                    h2Var3.f44304r = new org.telegram.ui.Wallet.m(d3Var2, 4);
                    d3Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (r6) {
                                case 0:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((f2) f2Var2);
                                    l2Var4.u(h2Var3);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((f2) f2Var2);
                                    l2Var4.u(h2Var3);
                                    Runnable runnable3 = runnable;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    d3Var2.show();
                    org.telegram.messenger.g0.h3(f2Var2, Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i18).getCurrentTime()) * 1000);
                    oi.c cVar = new oi.c(zArr2, h2Var3, zArr3, g15, z10, D, v17, d3Var2, i6Var);
                    WalletEngine2 walletEngine2 = l2Var4.f44480b.f45084b;
                    if (!h2Var3.f44300n && !l2Var4.j(h2Var3) && l2Var4.A(h2Var3) && walletEngine2 != null) {
                        if (str.equals(str8)) {
                            walletEngine2.previewSignMessage(k2Var, new org.telegram.ui.Wallet.o(l2Var4, h2Var3, cVar, 2));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(k2Var, new org.telegram.ui.Wallet.j(l2Var4, h2Var3, cVar, 9));
                            return;
                        }
                    }
                    cVar.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str7 != null) {
                    org.telegram.ui.Components.lc.c0(str7);
                    return;
                } else {
                    return;
                }
            default:
                hi.d dVar3 = (hi.d) obj6;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.lc(x2Var.F, x2Var.J0).f0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i18).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i18).isTestBackend();
                    StringBuilder n10 = i5.c.n("wear-auth: sending /token account=", i18, " dcId=", currentDatacenterId, " isTest=");
                    n10.append(isTestBackend);
                    org.telegram.messenger.a8.b(n10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = yc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.p0 p0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.f6207c).f6391i;
                        b9.h0 h0Var = new b9.h0(p0Var, (String) r7Var.d, "/tg-wear-auth/token", c10);
                        p0Var.f6346b.d(0, h0Var);
                        q6.m.n(h0Var, b9.j0.f3018a).addOnSuccessListener(new wc1(0, r7Var, dVar3)).addOnFailureListener(new vc1(dVar3, 1));
                        x2Var.dismiss();
                        return;
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        new org.telegram.ui.Components.lc(x2Var.F, x2Var.J0).f0(e12.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.c0.t(x2Var.F, x2Var.J0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.lc(x2Var.F, x2Var.J0).f0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public m60(hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, int i7, View view, a8.r7 r7Var) {
        this.f49727c = dVar;
        this.d = x2Var;
        this.f49726b = i7;
        this.f49728e = view;
        this.f49729f = r7Var;
    }

    public m60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.mp mpVar, int i7, TLRPC.User user) {
        this.f49727c = launchActivity;
        this.d = bVar;
        this.f49728e = mpVar;
        this.f49726b = i7;
        this.f49729f = user;
    }

    public m60(s90 s90Var, String str, String str2, String str3, int i7) {
        this.f49727c = s90Var;
        this.d = str;
        this.f49728e = str2;
        this.f49729f = str3;
        this.f49726b = i7;
    }
}
