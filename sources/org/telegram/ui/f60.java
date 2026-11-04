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
public final class f60 implements org.telegram.messenger.n10 {
    public final int f45163a = 2;
    public final int f45164b;
    public final Object f45165c;
    public final Object d;
    public final Object f45166e;
    public final Object f45167f;

    public f60(Context context, int i3, org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.f45165c = context;
        this.f45164b = i3;
        this.d = k0Var;
        this.f45166e = e6Var;
        this.f45167f = runnable;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.d2 T;
        org.telegram.ui.Wallet.y1 y1Var;
        org.telegram.ui.Wallet.c2 c2Var;
        boolean z10;
        int i3;
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
        int i18 = this.f45163a;
        int i19 = this.f45164b;
        Object obj3 = this.f45167f;
        Object obj4 = this.f45166e;
        Object obj5 = this.d;
        Object obj6 = this.f45165c;
        switch (i18) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                sf.b bVar = (sf.b) obj5;
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str2 = LaunchActivity.E1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    hpVar.X3(user2, false, false);
                    hpVar.W2(user2, 0, true, null);
                }
                launchActivity.m0(i19, user.f27150id, tL_error);
                return;
            case 1:
                m90 m90Var = (m90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = m90Var.f47566a;
                m90Var.h = -1;
                if (!m90Var.f47573j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        m90Var.c();
                        if (m90Var.a()) {
                            m90.d().f0(tL_error2, false);
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
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f27264id && tonconnectrequest2.expires > ConnectionsManager.getInstance(m90Var.f47567b).getCurrentTime()) {
                                        if (m90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            m90Var.c();
                                            org.telegram.ui.Wallet.c2.q(m90Var.f47566a, m90Var.f47567b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new i90(m90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.f45164b;
                        if (i21 < 10) {
                            ai.p1 p1Var = new ai.p1(m90Var, str3, str4, str5, i21, 23);
                            m90Var.f47572i = p1Var;
                            org.telegram.messenger.g0.i3(p1Var, 500L);
                            return;
                        }
                        m90Var.c();
                        if (m90Var.a()) {
                            org.telegram.ui.Components.fc.b0(org.telegram.messenger.bd.M0(2131743003, null));
                            return;
                        }
                        return;
                    }
                    return;
                }
                m90Var.c();
                return;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) obj;
                String str6 = (String) obj2;
                if (y1Var2 != null) {
                    int i22 = y1Var2.f43458c;
                    TL_wallet.tonConnectSession tonconnectsession2 = y1Var2.f43456a;
                    String str7 = y1Var2.f43459e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.I1 || org.telegram.messenger.az.f21675x || org.telegram.messenger.az.C || org.telegram.messenger.h10.f22829t0 != i19) {
                            k0Var.f42723g.u(y1Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str7)) {
                        final org.telegram.ui.Wallet.c2 c2Var2 = org.telegram.ui.Wallet.k0.x(i19).f42723g;
                        try {
                            JSONObject jSONObject = new JSONObject(y1Var2.f43464k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context, e6Var, new View[0]);
                            x2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231241);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.G6, e6Var, PorterDuff.Mode.SRC_IN);
                            int i23 = org.telegram.ui.ActionBar.k6.f27972i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i23, e6Var), 1, -1);
                            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i23);
                            e10.setBackground(h02);
                            org.telegram.ui.ActionBar.r6.k(e10, h02, null, N, e6Var);
                            e10.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
                            e10.setOnClickListener(new hb0(22, y1Var2, x2Var));
                            linearLayout2.addView(e10, b8.mf.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                            k9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                k9Var.p(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(k9Var, b8.mf.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.c2.v(18, context, org.telegram.messenger.bd.M0(2131743021, null), e6Var);
                            v.setTypeface(org.telegram.messenger.g0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, b8.mf.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), e6Var);
                            int i24 = org.telegram.ui.ActionBar.k6.f28290z6;
                            org.telegram.ui.ActionBar.r6.V(v10, i24, e6Var);
                            v10.setGravity(3);
                            v10.setSingleLine(true);
                            v10.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v10, b8.mf.o(-1, -2));
                            linearLayout2.addView(linearLayout3, b8.mf.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, b8.mf.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i25 = org.telegram.ui.ActionBar.k6.f27878d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i25, e6Var));
                            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i25);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.r6.k(linearLayout4, d02, N2, null, e6Var);
                            if (equals) {
                                M0 = jSONObject.optString("text");
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131743193, null);
                            }
                            if (equals) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            TextView v11 = org.telegram.ui.Wallet.c2.v(i15, context, M0, e6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.bd.M0(2131743020, null), e6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.r6.V(v12, org.telegram.ui.ActionBar.k6.L6, e6Var);
                                linearLayout4.addView(v12, b8.mf.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i16 = -1;
                                i17 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.c2.v(12, context, "!", e6Var);
                                v13.setTypeface(org.telegram.messenger.g0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i26 = org.telegram.ui.ActionBar.k6.f28122q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i26, e6Var));
                                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i26);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.r6.k(v13, d03, N3, null, e6Var);
                                linearLayout5.addView(v13, b8.mf.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.bd.M0(2131743194, null), e6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                i16 = -1;
                                i17 = -2;
                                linearLayout5.addView(v14, b8.mf.o(-1, -2));
                                linearLayout4.addView(linearLayout5, b8.mf.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, b8.mf.o(i16, i17));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.h1(jSONObject, x2Var, e6Var, 0));
                            }
                            ai.l4 l4Var = new ai.l4(context, 4);
                            l4Var.addView(linearLayout4);
                            linearLayout.addView(l4Var, b8.mf.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(context);
                            w2Var.getContent().addView(linearLayout, b8.mf.c(-2.0f, -1));
                            x2Var.I0(w2Var);
                            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.bd.M0(2131743039, null), e6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.r6.V(v15, i24, e6Var);
                                f10.addView(v15, b8.mf.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            gi.d dVar = new gi.d(context, e6Var, true);
                            dVar.setRoundRadius(24);
                            dVar.e();
                            dVar.setText(org.telegram.messenger.bd.M0(2131752589, null));
                            gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
                            h.setText(org.telegram.messenger.bd.M0(2131743022, null));
                            h.setEnabled(false);
                            linearLayout6.addView(dVar, b8.mf.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(h, b8.mf.m(1.0f, 0, 44, 6, 0, 0));
                            f10.addView(linearLayout6);
                            x2Var.K0(f10);
                            x2Var.f28626z0 = new i0(y1Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(l4Var, y1Var2, h, 3);
                            l4Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.i1(gVar, 0));
                            l4Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.j1(gVar, 0));
                            final org.telegram.ui.Wallet.k1 k1Var = new org.telegram.ui.Wallet.k1(h, dVar, c2Var2, y1Var2, x2Var, e6Var, gVar);
                            h.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            k1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            k1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            dVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            k1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            k1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final org.telegram.ui.Wallet.w1 w1Var = new org.telegram.ui.Wallet.w1(zArr, y1Var2, x2Var, 0);
                            y1Var2.f43471r = new org.telegram.ui.Wallet.l(x2Var, 5);
                            x2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r6) {
                                        case 0:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((w1) w1Var);
                                            c2Var2.u(y1Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr[0] = true;
                                            org.telegram.messenger.g0.r((w1) w1Var);
                                            c2Var2.u(y1Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            x2Var.show();
                            org.telegram.messenger.g0.i3(w1Var, Math.max(0L, i22 - c2Var2.f42381f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e11) {
                            c2Var2.u(y1Var2);
                            org.telegram.ui.Components.fc.b0(org.telegram.ui.Wallet.c2.i("display signing data", e11));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i19);
                    org.telegram.ui.Wallet.c2 c2Var3 = x10.f42723g;
                    org.telegram.ui.Wallet.b2 b2Var = y1Var2.f43460f;
                    boolean equals2 = "signMessage".equals(str7);
                    final org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context, e6Var, new View[0]);
                    x2Var2.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                    k9Var2.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        y1Var = y1Var2;
                        c2Var = c2Var3;
                        z10 = equals2;
                        k9Var2.p(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        y1Var = y1Var2;
                        c2Var = c2Var3;
                        z10 = equals2;
                    }
                    linearLayout7.addView(k9Var2, b8.mf.t(76, 76, 1, 0, 24, 0, 0));
                    if (z10) {
                        i3 = 2131743206;
                    } else {
                        i3 = 2131743205;
                    }
                    TextView v16 = org.telegram.ui.Wallet.c2.v(20, context, org.telegram.messenger.bd.V(null, null, i3, tonconnectsession2.manifest.name), e6Var);
                    v16.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout7.addView(v16, b8.mf.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.c2.h(context, K0, e6Var), b8.mf.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.f6 f6Var = new org.telegram.ui.Wallet.f6(context, 2131232807, 24);
                    f6Var.getCardHolderView().setMaxLines(2);
                    f6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.a2> list = b2Var.f42223b;
                    long j10 = b2Var.f42224c;
                    f6Var.setCardHolder(org.telegram.ui.Wallet.e8.c0(((org.telegram.ui.Wallet.a2) list.get(0)).f42124a));
                    f6Var.getBalanceView().setText(org.telegram.ui.Wallet.c2.k(j10));
                    f6Var.getUsdBalanceView().setText(x10.m(j10, false));
                    linearLayout7.addView(f6Var, b8.mf.o(-1, -2));
                    f6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    x2 x2Var3 = x2Var2;
                                    gi.g1 g1Var = x2Var3.f43389j1;
                                    if (1 < x2Var3.k1.size() && 1 != g1Var.getCurrentPosition()) {
                                        for (View view2 : g1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        g1Var.D(1);
                                        return;
                                    }
                                    return;
                                default:
                                    x2 x2Var4 = x2Var2;
                                    gi.g1 g1Var2 = x2Var4.f43389j1;
                                    if (x2Var4.k1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : g1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        g1Var2.D(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Wallet.w2 w2Var2 = new org.telegram.ui.Wallet.w2(context);
                    w2Var2.getContent().addView(linearLayout7, b8.mf.c(-2.0f, -1));
                    x2Var2.I0(w2Var2);
                    LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                    f11.addView(f12, b8.mf.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231240);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i27 = org.telegram.ui.ActionBar.k6.f27972i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i27, e6Var), 1, -1);
                    org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i27);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.r6.k(imageView, h03, null, N4, e6Var);
                    int i28 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.t(imageView, i28, e6Var, PorterDuff.Mode.SRC_IN);
                    b8.pf.a(imageView);
                    f12.addView(imageView, b8.mf.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.k9 k9Var3 = new org.telegram.ui.Components.k9(context);
                    k9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        i10 = i22;
                        k9Var3.p(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        i10 = i22;
                    }
                    f12.addView(k9Var3, b8.mf.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    f12.addView(linearLayout8, b8.mf.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.r6.V(textView, i28, e6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, b8.mf.o(-1, -2));
                    textView.setText(org.telegram.messenger.bd.M0(2131743177, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
                        i11 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, b8.mf.o(-1, -2));
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
                                    x2 x2Var3 = x2Var2;
                                    gi.g1 g1Var = x2Var3.f43389j1;
                                    if (1 < x2Var3.k1.size() && 1 != g1Var.getCurrentPosition()) {
                                        for (View view2 : g1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        g1Var.D(1);
                                        return;
                                    }
                                    return;
                                default:
                                    x2 x2Var4 = x2Var2;
                                    gi.g1 g1Var2 = x2Var4.f43389j1;
                                    if (x2Var4.k1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : g1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        g1Var2.D(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i11);
                    LinearLayout F = org.telegram.ui.Wallet.c2.F(context, org.telegram.messenger.bd.M0(2131743061, null), e6Var);
                    String C = org.telegram.ui.Wallet.c2.C(((org.telegram.ui.Wallet.a2) list.get(0)).f42124a);
                    SpannableStringBuilder s6 = org.telegram.ui.Wallet.k0.s(j10, i11);
                    if (list.size() > i11) {
                        Integer valueOf = Integer.valueOf(list.size() - i11);
                        Object[] objArr = new Object[2];
                        objArr[0] = C;
                        objArr[i11] = valueOf;
                        V = org.telegram.messenger.bd.V(null, null, 2131742985, objArr);
                    } else {
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = C;
                        V = org.telegram.messenger.bd.V(null, null, 2131742986, objArr2);
                    }
                    F.addView(org.telegram.ui.Wallet.c2.c(context, s6, V, null, null, e6Var), b8.mf.o(-1, -2));
                    linearLayout9.addView(F, b8.mf.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.c2.F(context, org.telegram.messenger.bd.M0(2131743217, null), e6Var);
                    for (org.telegram.ui.Wallet.a2 a2Var : list) {
                        if (a2Var.f42125b == null || a2Var.d != null) {
                            str = null;
                            i14 = 2131742991;
                        } else {
                            i14 = 2131743163;
                            str = null;
                        }
                        F2.addView(org.telegram.ui.Wallet.c2.c(context, org.telegram.messenger.bd.M0(i14, str), org.telegram.messenger.bd.V(str, str, 2131742986, org.telegram.ui.Wallet.c2.C(a2Var.f42124a)), org.telegram.ui.Wallet.c2.b(-a2Var.f42127e), a2Var.d, e6Var), b8.mf.o(-1, -2));
                    }
                    linearLayout9.addView(F2, b8.mf.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    ai.l4 l4Var2 = new ai.l4(context, 5);
                    l4Var2.setFillViewport(false);
                    l4Var2.addView(linearLayout9);
                    f11.addView(l4Var2, b8.mf.o(-1, -2));
                    org.telegram.ui.Wallet.w2 w2Var3 = new org.telegram.ui.Wallet.w2(context);
                    w2Var3.getContent().addView(f11, b8.mf.c(-2.0f, -1));
                    x2Var2.I0(w2Var3);
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.c2.v(14, context, null, e6Var);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x70(org.telegram.messenger.g0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.bd.V(null, null, 2131743130, spannableStringBuilder));
                    if (z10) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    v17.setVisibility(i12);
                    org.telegram.ui.ActionBar.r6.V(v17, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
                    f13.addView(v17, b8.mf.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                    gi.d dVar2 = new gi.d(context, e6Var, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.setText(org.telegram.messenger.bd.M0(2131743153, null));
                    linearLayout10.addView(dVar2, b8.mf.m(1.0f, 0, 44, 0, 6, 0));
                    gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, true);
                    if (z10) {
                        i13 = 2131743022;
                    } else {
                        i13 = 2131743178;
                    }
                    h7.setText(org.telegram.messenger.bd.M0(i13, null));
                    h7.setEnabled(false);
                    linearLayout10.addView(h7, b8.mf.m(1.0f, 0, 44, 6, 0, 0));
                    f13.addView(linearLayout10);
                    x2Var2.K0(f13);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.y1 y1Var3 = y1Var;
                    final org.telegram.ui.Wallet.c2 c2Var4 = c2Var;
                    final org.telegram.ui.Wallet.e1 e1Var = new org.telegram.ui.Wallet.e1(y1Var3, zArr3, h7, dVar2, c2Var4, x2Var2, zArr2, e6Var);
                    h7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    e1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    e1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    dVar2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    e1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    e1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.w1 w1Var2 = new org.telegram.ui.Wallet.w1(zArr2, y1Var3, x2Var2, 1);
                    long j11 = i10;
                    long j12 = b2Var.f42222a;
                    if (j12 == 0) {
                        j12 = Long.MAX_VALUE;
                    }
                    y1Var3.f43471r = new org.telegram.ui.Wallet.l(x2Var2, 5);
                    x2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (r6) {
                                case 0:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((w1) w1Var2);
                                    c2Var4.u(y1Var3);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr2[0] = true;
                                    org.telegram.messenger.g0.r((w1) w1Var2);
                                    c2Var4.u(y1Var3);
                                    Runnable runnable3 = runnable;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    x2Var2.show();
                    org.telegram.messenger.g0.i3(w1Var2, Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i19).getCurrentTime()) * 1000);
                    mi.c cVar = new mi.c(zArr2, y1Var3, zArr3, h7, z10, x10, v17, x2Var2, e6Var);
                    WalletEngine2 walletEngine2 = c2Var4.f42378b.f42719b;
                    if (!y1Var3.f43467n && !c2Var4.j(y1Var3) && c2Var4.A(y1Var3) && walletEngine2 != null) {
                        if ("signMessage".equals(str7)) {
                            walletEngine2.previewSignMessage(b2Var, new org.telegram.ui.Wallet.m(c2Var4, y1Var3, cVar, 1));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(b2Var, new org.telegram.ui.Wallet.j(c2Var4, y1Var3, cVar, 9));
                            return;
                        }
                    }
                    cVar.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str6 != null) {
                    org.telegram.ui.Components.fc.b0(str6);
                    return;
                } else {
                    return;
                }
            default:
                gi.d dVar3 = (gi.d) obj6;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                View view = (View) obj4;
                b8.ke keVar = (b8.ke) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i19).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m("wear-auth: sending /token account=", i19, " dcId=", currentDatacenterId, " isTest=");
                    m10.append(isTestBackend);
                    org.telegram.messenger.a8.b(m10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c2 = qc1.c(keVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.n0 n0Var = new a9.j0(applicationContext, com.google.android.gms.common.api.i.f6594c).f6778i;
                        a9.g0 g0Var = new a9.g0(n0Var, (String) keVar.d, "/tg-wear-auth/token", c2);
                        n0Var.f6724b.d(0, g0Var);
                        p6.m.m(g0Var, a9.i0.f205a).addOnSuccessListener(new na1(6, keVar, dVar3)).addOnFailureListener(new oc1(dVar3, 1));
                        t2Var.dismiss();
                        return;
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0(e12.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.v(t2Var.F, t2Var.J0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public f60(gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, int i3, View view, b8.ke keVar) {
        this.f45165c = dVar;
        this.d = t2Var;
        this.f45164b = i3;
        this.f45166e = view;
        this.f45167f = keVar;
    }

    public f60(LaunchActivity launchActivity, sf.b bVar, org.telegram.messenger.hp hpVar, int i3, TLRPC.User user) {
        this.f45165c = launchActivity;
        this.d = bVar;
        this.f45166e = hpVar;
        this.f45164b = i3;
        this.f45167f = user;
    }

    public f60(m90 m90Var, String str, String str2, String str3, int i3) {
        this.f45165c = m90Var;
        this.d = str;
        this.f45166e = str2;
        this.f45167f = str3;
        this.f45164b = i3;
    }
}
