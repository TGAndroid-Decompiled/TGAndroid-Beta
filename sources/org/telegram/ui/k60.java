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
public final class k60 implements org.telegram.messenger.s10 {
    public final int f48596a = 2;
    public final int f48597b;
    public final Object f48598c;
    public final Object d;
    public final Object f48599e;
    public final Object f48600f;

    public k60(Context context, int i7, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.f48598c = context;
        this.f48597b = i7;
        this.d = l0Var;
        this.f48599e = e6Var;
        this.f48600f = runnable;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.e2 T;
        org.telegram.ui.Wallet.z1 z1Var;
        org.telegram.ui.Wallet.d2 d2Var;
        boolean z10;
        int i7;
        int i10;
        final int i11;
        CharSequence V;
        int i12;
        int i13;
        String str;
        int i14;
        String M0;
        int i15;
        int i16;
        int i17;
        int i18 = this.f48596a;
        int i19 = this.f48597b;
        Object obj3 = this.f48600f;
        Object obj4 = this.f48599e;
        Object obj5 = this.d;
        Object obj6 = this.f48598c;
        switch (i18) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str2 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    npVar.X3(user2, false, false);
                    npVar.W2(user2, 0, true, null);
                }
                launchActivity.m0(i19, user.f28200id, tL_error);
                return;
            case 1:
                q90 q90Var = (q90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = q90Var.f50510a;
                q90Var.h = -1;
                if (!q90Var.f50517j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        q90Var.c();
                        if (q90Var.a()) {
                            q90.d().f0(tL_error2, false);
                        }
                    } else {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str3.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i20);
                                    i20++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f28313id && tonconnectrequest2.expires > ConnectionsManager.getInstance(q90Var.f50511b).getCurrentTime()) {
                                        if (q90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            q90Var.c();
                                            org.telegram.ui.Wallet.d2.q(q90Var.f50510a, q90Var.f50511b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new m90(q90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.f48597b;
                        if (i21 < 10) {
                            ai.f1 f1Var = new ai.f1(q90Var, str3, str4, str5, i21, 23);
                            q90Var.f50516i = f1Var;
                            org.telegram.messenger.g0.i3(f1Var, 500L);
                            return;
                        }
                        q90Var.c();
                        if (q90Var.a()) {
                            org.telegram.ui.Components.cc.b0(org.telegram.messenger.hd.M0(2131742993, null));
                            return;
                        }
                        return;
                    }
                    return;
                }
                q90Var.c();
                return;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                String str6 = (String) obj2;
                if (z1Var2 != null) {
                    int i22 = z1Var2.f44778c;
                    TL_wallet.tonConnectSession tonconnectsession2 = z1Var2.f44776a;
                    String str7 = z1Var2.f44779e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.gz.f23992x || org.telegram.messenger.gz.C || org.telegram.messenger.m10.f24934t0 != i19) {
                            l0Var.f44083g.u(z1Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str7)) {
                        final org.telegram.ui.Wallet.d2 d2Var2 = org.telegram.ui.Wallet.l0.x(i19).f44083g;
                        try {
                            JSONObject jSONObject = new JSONObject(z1Var2.f44784k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(context, e6Var, new View[0]);
                            w2Var.J0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e10 = org.telegram.messenger.i20.e(context, 2131231241);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.G6, e6Var, PorterDuff.Mode.SRC_IN);
                            int i23 = org.telegram.ui.ActionBar.j6.f28941i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i23, e6Var), 1, -1);
                            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i23);
                            e10.setBackground(h02);
                            org.telegram.ui.ActionBar.q6.j(e10, h02, null, M, e6Var);
                            e10.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
                            e10.setOnClickListener(new a90(24, z1Var2, w2Var));
                            linearLayout2.addView(e10, c8.ja.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                            i9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                i9Var.p(org.telegram.messenger.gc.p(org.telegram.messenger.k20.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(i9Var, c8.ja.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.d2.v(18, context, org.telegram.messenger.hd.M0(2131743011, null), e6Var);
                            v.setTypeface(org.telegram.messenger.g0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, c8.ja.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), e6Var);
                            int i24 = org.telegram.ui.ActionBar.j6.f29260z6;
                            org.telegram.ui.ActionBar.q6.U(v10, i24, e6Var);
                            v10.setGravity(3);
                            v10.setSingleLine(true);
                            v10.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v10, c8.ja.o(-1, -2));
                            linearLayout2.addView(linearLayout3, c8.ja.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, c8.ja.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i25 = org.telegram.ui.ActionBar.j6.f28849d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i25, e6Var));
                            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i25);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.q6.j(linearLayout4, d02, M2, null, e6Var);
                            if (equals) {
                                M0 = jSONObject.optString("text");
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131743183, null);
                            }
                            if (equals) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            TextView v11 = org.telegram.ui.Wallet.d2.v(i15, context, M0, e6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.hd.M0(2131743010, null), e6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.q6.U(v12, org.telegram.ui.ActionBar.j6.L6, e6Var);
                                linearLayout4.addView(v12, c8.ja.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i16 = -1;
                                i17 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.d2.v(12, context, "!", e6Var);
                                v13.setTypeface(org.telegram.messenger.g0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i26 = org.telegram.ui.ActionBar.j6.f29090q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i26, e6Var));
                                org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i26);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.q6.j(v13, d03, M3, null, e6Var);
                                linearLayout5.addView(v13, c8.ja.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.hd.M0(2131743184, null), e6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                i16 = -1;
                                i17 = -2;
                                linearLayout5.addView(v14, c8.ja.o(-1, -2));
                                linearLayout4.addView(linearLayout5, c8.ja.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, c8.ja.o(i16, i17));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.i1(jSONObject, w2Var, e6Var, 0));
                            }
                            bi.z3 z3Var = new bi.z3(context, 4);
                            z3Var.addView(linearLayout4);
                            linearLayout.addView(z3Var, c8.ja.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.v2 v2Var = new org.telegram.ui.Wallet.v2(context);
                            v2Var.getContent().addView(linearLayout, c8.ja.c(-2.0f, -1));
                            w2Var.I0(v2Var);
                            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.hd.M0(2131743029, null), e6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.q6.U(v15, i24, e6Var);
                                f10.addView(v15, c8.ja.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            hi.d dVar = new hi.d(context, e6Var, true);
                            dVar.setRoundRadius(24);
                            dVar.e();
                            dVar.setText(org.telegram.messenger.hd.M0(2131752589, null));
                            hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
                            g10.setText(org.telegram.messenger.hd.M0(2131743012, null));
                            g10.setEnabled(false);
                            linearLayout6.addView(dVar, c8.ja.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(g10, c8.ja.m(1.0f, 0, 44, 6, 0, 0));
                            f10.addView(linearLayout6);
                            w2Var.K0(f10);
                            w2Var.f29725z0 = new h0(z1Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(z3Var, z1Var2, g10, 3);
                            z3Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.j1(gVar, 0));
                            z3Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.k1(gVar, 0));
                            final org.telegram.ui.Wallet.l1 l1Var = new org.telegram.ui.Wallet.l1(g10, dVar, d2Var2, z1Var2, w2Var, e6Var, gVar);
                            g10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            l1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            l1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            dVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            l1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            l1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final org.telegram.ui.Wallet.x1 x1Var = new org.telegram.ui.Wallet.x1(zArr, z1Var2, w2Var, 0);
                            z1Var2.f44791r = new org.telegram.ui.Wallet.l(w2Var, 5);
                            w2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r6) {
                                        case 0:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((x1) x1Var);
                                            d2Var2.u(z1Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((x1) x1Var);
                                            d2Var2.u(z1Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            w2Var.show();
                            org.telegram.messenger.g0.i3(x1Var, Math.max(0L, i22 - d2Var2.f43733f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e11) {
                            d2Var2.u(z1Var2);
                            org.telegram.ui.Components.cc.b0(org.telegram.ui.Wallet.d2.i("display signing data", e11));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i19);
                    org.telegram.ui.Wallet.d2 d2Var3 = x10.f44083g;
                    org.telegram.ui.Wallet.c2 c2Var = z1Var2.f44780f;
                    boolean equals2 = "signMessage".equals(str7);
                    final org.telegram.ui.Wallet.w2 w2Var2 = new org.telegram.ui.Wallet.w2(context, e6Var, new View[0]);
                    w2Var2.J0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
                    i9Var2.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z10 = equals2;
                        i9Var2.p(org.telegram.messenger.gc.p(org.telegram.messenger.k20.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z10 = equals2;
                    }
                    linearLayout7.addView(i9Var2, c8.ja.t(76, 76, 1, 0, 24, 0, 0));
                    if (z10) {
                        i7 = 2131743196;
                    } else {
                        i7 = 2131743195;
                    }
                    TextView v16 = org.telegram.ui.Wallet.d2.v(20, context, org.telegram.messenger.hd.V(null, null, i7, tonconnectsession2.manifest.name), e6Var);
                    v16.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout7.addView(v16, c8.ja.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.d2.h(context, K0, e6Var), c8.ja.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.h6 h6Var = new org.telegram.ui.Wallet.h6(context, 2131232810, 24);
                    h6Var.getCardHolderView().setMaxLines(2);
                    h6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.b2> list = c2Var.f43559b;
                    long j3 = c2Var.f43560c;
                    h6Var.setCardHolder(org.telegram.ui.Wallet.f8.c0(((org.telegram.ui.Wallet.b2) list.get(0)).f43499a));
                    h6Var.getBalanceView().setText(org.telegram.ui.Wallet.d2.k(j3));
                    h6Var.getUsdBalanceView().setText(x10.m(j3, false));
                    linearLayout7.addView(h6Var, c8.ja.o(-1, -2));
                    h6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    w2 w2Var3 = w2Var2;
                                    hi.i1 i1Var = w2Var3.f44619m1;
                                    if (1 < w2Var3.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                        for (View view2 : i1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        i1Var.C(1);
                                        return;
                                    }
                                    return;
                                default:
                                    w2 w2Var4 = w2Var2;
                                    hi.i1 i1Var2 = w2Var4.f44619m1;
                                    if (w2Var4.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : i1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        i1Var2.C(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Wallet.v2 v2Var2 = new org.telegram.ui.Wallet.v2(context);
                    v2Var2.getContent().addView(linearLayout7, c8.ja.c(-2.0f, -1));
                    w2Var2.I0(v2Var2);
                    LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                    f11.addView(f12, c8.ja.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231240);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i27 = org.telegram.ui.ActionBar.j6.f28941i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i27, e6Var), 1, -1);
                    org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i27);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.q6.j(imageView, h03, null, M4, e6Var);
                    int i28 = org.telegram.ui.ActionBar.j6.G6;
                    org.telegram.ui.ActionBar.q6.s(imageView, i28, e6Var, PorterDuff.Mode.SRC_IN);
                    c8.na.a(imageView);
                    f12.addView(imageView, c8.ja.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.i9 i9Var3 = new org.telegram.ui.Components.i9(context);
                    i9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        i10 = i22;
                        i9Var3.p(org.telegram.messenger.gc.p(org.telegram.messenger.k20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        i10 = i22;
                    }
                    f12.addView(i9Var3, c8.ja.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    f12.addView(linearLayout8, c8.ja.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.q6.U(textView, i28, e6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, c8.ja.o(-1, -2));
                    textView.setText(org.telegram.messenger.hd.M0(2131743167, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
                        i11 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, c8.ja.o(-1, -2));
                        textView2.setText(K0);
                    } else {
                        i11 = 1;
                    }
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (i11) {
                                case 0:
                                    w2 w2Var3 = w2Var2;
                                    hi.i1 i1Var = w2Var3.f44619m1;
                                    if (1 < w2Var3.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                        for (View view2 : i1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        i1Var.C(1);
                                        return;
                                    }
                                    return;
                                default:
                                    w2 w2Var4 = w2Var2;
                                    hi.i1 i1Var2 = w2Var4.f44619m1;
                                    if (w2Var4.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : i1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        i1Var2.C(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i11);
                    LinearLayout F = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.hd.M0(2131743051, null), e6Var);
                    String C = org.telegram.ui.Wallet.d2.C(((org.telegram.ui.Wallet.b2) list.get(0)).f43499a);
                    SpannableStringBuilder s5 = org.telegram.ui.Wallet.l0.s(j3, i11);
                    if (list.size() > i11) {
                        Integer valueOf = Integer.valueOf(list.size() - i11);
                        Object[] objArr = new Object[2];
                        objArr[0] = C;
                        objArr[i11] = valueOf;
                        V = org.telegram.messenger.hd.V(null, null, 2131742975, objArr);
                    } else {
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = C;
                        V = org.telegram.messenger.hd.V(null, null, 2131742976, objArr2);
                    }
                    F.addView(org.telegram.ui.Wallet.d2.c(context, s5, V, null, null, e6Var), c8.ja.o(-1, -2));
                    linearLayout9.addView(F, c8.ja.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.hd.M0(2131743207, null), e6Var);
                    for (org.telegram.ui.Wallet.b2 b2Var : list) {
                        if (b2Var.f43500b == null || b2Var.d != null) {
                            str = null;
                            i14 = 2131742981;
                        } else {
                            i14 = 2131743153;
                            str = null;
                        }
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        F2.addView(org.telegram.ui.Wallet.d2.c(context, org.telegram.messenger.hd.M0(i14, str), org.telegram.messenger.hd.V(str, str, 2131742976, org.telegram.ui.Wallet.d2.C(b2Var.f43499a)), org.telegram.ui.Wallet.d2.b(-b2Var.f43502e), b2Var.d, e6Var2), c8.ja.o(-1, -2));
                        e6Var = e6Var2;
                    }
                    org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
                    linearLayout9.addView(F2, c8.ja.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    bi.z3 z3Var2 = new bi.z3(context, 5);
                    z3Var2.setFillViewport(false);
                    z3Var2.addView(linearLayout9);
                    f11.addView(z3Var2, c8.ja.o(-1, -2));
                    org.telegram.ui.Wallet.v2 v2Var3 = new org.telegram.ui.Wallet.v2(context);
                    v2Var3.getContent().addView(f11, c8.ja.c(-2.0f, -1));
                    w2Var2.I0(v2Var3);
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.d2.v(14, context, null, e6Var3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e80(org.telegram.messenger.g0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.hd.V(null, null, 2131743120, spannableStringBuilder));
                    if (z10) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    v17.setVisibility(i12);
                    org.telegram.ui.ActionBar.q6.U(v17, org.telegram.ui.ActionBar.j6.f29260z6, e6Var3);
                    f13.addView(v17, c8.ja.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                    hi.d dVar2 = new hi.d(context, e6Var3, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.setText(org.telegram.messenger.hd.M0(2131743143, null));
                    linearLayout10.addView(dVar2, c8.ja.m(1.0f, 0, 44, 0, 6, 0));
                    hi.d g11 = org.telegram.messenger.i20.g(24, context, e6Var3, true);
                    if (z10) {
                        i13 = 2131743012;
                    } else {
                        i13 = 2131743168;
                    }
                    g11.setText(org.telegram.messenger.hd.M0(i13, null));
                    g11.setEnabled(false);
                    linearLayout10.addView(g11, c8.ja.m(1.0f, 0, 44, 6, 0, 0));
                    f13.addView(linearLayout10);
                    w2Var2.K0(f13);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.z1 z1Var3 = z1Var;
                    final org.telegram.ui.Wallet.d2 d2Var4 = d2Var;
                    final org.telegram.ui.Wallet.f1 f1Var2 = new org.telegram.ui.Wallet.f1(z1Var3, zArr3, g11, dVar2, d2Var4, w2Var2, zArr2, e6Var3);
                    g11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    f1Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    f1Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    dVar2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    f1Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    f1Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.x1 x1Var2 = new org.telegram.ui.Wallet.x1(zArr2, z1Var3, w2Var2, 1);
                    long j10 = i10;
                    long j11 = c2Var.f43558a;
                    if (j11 == 0) {
                        j11 = Long.MAX_VALUE;
                    }
                    z1Var3.f44791r = new org.telegram.ui.Wallet.l(w2Var2, 5);
                    w2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (r6) {
                                case 0:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((x1) x1Var2);
                                    d2Var4.u(z1Var3);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((x1) x1Var2);
                                    d2Var4.u(z1Var3);
                                    Runnable runnable3 = runnable;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    w2Var2.show();
                    org.telegram.messenger.g0.i3(x1Var2, Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i19).getCurrentTime()) * 1000);
                    oi.c cVar = new oi.c(zArr2, z1Var3, zArr3, g11, z10, x10, v17, w2Var2, e6Var3);
                    WalletEngine2 walletEngine2 = d2Var4.f43730b.f44079b;
                    if (!z1Var3.f44787n && !d2Var4.j(z1Var3) && d2Var4.A(z1Var3) && walletEngine2 != null) {
                        if ("signMessage".equals(str7)) {
                            walletEngine2.previewSignMessage(c2Var, new org.telegram.ui.Wallet.m(d2Var4, z1Var3, cVar, 1));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.j(d2Var4, z1Var3, cVar, 9));
                            return;
                        }
                    }
                    cVar.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str6 != null) {
                    org.telegram.ui.Components.cc.b0(str6);
                    return;
                } else {
                    return;
                }
            default:
                hi.d dVar3 = (hi.d) obj6;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i19).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    StringBuilder n10 = i5.c.n("wear-auth: sending /token account=", i19, " dcId=", currentDatacenterId, " isTest=");
                    n10.append(isTestBackend);
                    org.telegram.messenger.a8.b(n10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = vc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.p0 p0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.f5924c).f6108i;
                        b9.h0 h0Var = new b9.h0(p0Var, (String) r7Var.d, "/tg-wear-auth/token", c10);
                        p0Var.f6063b.d(0, h0Var);
                        q6.m.m(h0Var, b9.j0.f3020a).addOnSuccessListener(new org.telegram.ui.Wallet.k8(2, r7Var, dVar3)).addOnFailureListener(new tc1(dVar3, 1));
                        u2Var.dismiss();
                        return;
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0(e12.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.y0.q(u2Var.F, u2Var.J0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public k60(hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, int i7, View view, a8.r7 r7Var) {
        this.f48598c = dVar;
        this.d = u2Var;
        this.f48597b = i7;
        this.f48599e = view;
        this.f48600f = r7Var;
    }

    public k60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.np npVar, int i7, TLRPC.User user) {
        this.f48598c = launchActivity;
        this.d = bVar;
        this.f48599e = npVar;
        this.f48597b = i7;
        this.f48600f = user;
    }

    public k60(q90 q90Var, String str, String str2, String str3, int i7) {
        this.f48598c = q90Var;
        this.d = str;
        this.f48599e = str2;
        this.f48600f = str3;
        this.f48597b = i7;
    }
}
