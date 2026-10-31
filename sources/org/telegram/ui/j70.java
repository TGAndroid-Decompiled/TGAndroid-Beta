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
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.hk;
public final class j70 implements org.telegram.messenger.j20 {
    public final int f38445a = 2;
    public final int f38446b;
    public final Object f38447c;
    public final Object d;
    public final Object e;
    public final Object f38448f;

    public j70(Context context, int i10, org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.f38447c = context;
        this.f38446b = i10;
        this.d = k0Var;
        this.e = p6Var;
        this.f38448f = runnable;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.k2 T;
        org.telegram.ui.Wallet.a2 a2Var;
        org.telegram.ui.Wallet.e2 e2Var;
        boolean z10;
        int i10;
        String str;
        final int i11;
        CharSequence V;
        int i12;
        int i13;
        String str2;
        int i14;
        String L0;
        int i15;
        int i16;
        int i17;
        int i18 = this.f38445a;
        int i19 = this.f38446b;
        Object obj3 = this.f38448f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f38447c;
        switch (i18) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                gf.e eVar = (gf.e) obj5;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                if (eVar != null) {
                    eVar.b();
                }
                if (user2 != null) {
                    vpVar.U3(user2, false, false);
                    vpVar.U2(user2, 0, true, null);
                }
                launchActivity.m0(i19, user.f19942id, tL_error);
                return;
            case 1:
                ua0 ua0Var = (ua0) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = ua0Var.f42100a;
                ua0Var.h = -1;
                if (!ua0Var.f42106j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        ua0Var.c();
                        if (ua0Var.a()) {
                            ua0.d().f0(tL_error2, false);
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
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f20055id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ua0Var.f42101b).getCurrentTime()) {
                                        if (ua0Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            ua0Var.c();
                                            org.telegram.ui.Wallet.e2.q(ua0Var.f42100a, ua0Var.f42101b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new qa0(ua0Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.f38446b;
                        if (i21 < 10) {
                            i2.g1 g1Var = new i2.g1(ua0Var, str3, str4, str5, i21, 17);
                            ua0Var.f42105i = g1Var;
                            org.telegram.messenger.i0.h3(g1Var, 500L);
                            return;
                        }
                        ua0Var.c();
                        if (ua0Var.a()) {
                            org.telegram.ui.Components.cc.b0(org.telegram.messenger.cd.L0(2131743019, null));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ua0Var.c();
                return;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                String str6 = (String) obj2;
                if (a2Var2 != null) {
                    int i22 = a2Var2.f34164c;
                    TL_wallet.tonConnectSession tonconnectsession2 = a2Var2.f34162a;
                    String str7 = a2Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.tz.f18194x || org.telegram.messenger.tz.C || org.telegram.messenger.d20.f15147s0 != i19) {
                            k0Var.f34780g.u(a2Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str7)) {
                        final org.telegram.ui.Wallet.e2 e2Var2 = org.telegram.ui.Wallet.k0.x(i19).f34780g;
                        try {
                            JSONObject jSONObject = new JSONObject(a2Var2.f34169k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.y2 y2Var = new org.telegram.ui.Wallet.y2(context, p6Var, new View[0]);
                            y2Var.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, p6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e = org.telegram.messenger.z20.e(context, 2131231242);
                            e.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.G6, p6Var, PorterDuff.Mode.SRC_IN);
                            int i23 = org.telegram.ui.ActionBar.t6.f21020i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i23, p6Var), 1, -1);
                            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i23);
                            e.setBackground(h02);
                            org.telegram.ui.ActionBar.a7.k(e, h02, null, N, p6Var);
                            e.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
                            e.setOnClickListener(new rv0(10, a2Var2, y2Var));
                            linearLayout2.addView(e, w7.b6.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                            g9Var.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                g9Var.p(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(g9Var, w7.b6.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.e2.v(18, context, org.telegram.messenger.cd.L0(2131743037, null), p6Var);
                            v.setTypeface(org.telegram.messenger.i0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, w7.b6.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.i0.K0(tonconnectsession2.manifest.url, false), p6Var);
                            int i24 = org.telegram.ui.ActionBar.t6.f21330z6;
                            org.telegram.ui.ActionBar.a7.V(v10, i24, p6Var);
                            v10.setGravity(3);
                            v10.setSingleLine(true);
                            v10.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v10, w7.b6.o(-1, -2));
                            linearLayout2.addView(linearLayout3, w7.b6.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, w7.b6.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f));
                            int L = org.telegram.messenger.i0.L(16.0f);
                            int i25 = org.telegram.ui.ActionBar.t6.f20929d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i25, p6Var));
                            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i25);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.a7.k(linearLayout4, d02, N2, null, p6Var);
                            if (equals) {
                                L0 = jSONObject.optString("text");
                            } else {
                                L0 = org.telegram.messenger.cd.L0(2131743209, null);
                            }
                            if (equals) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            TextView v11 = org.telegram.ui.Wallet.e2.v(i15, context, L0, p6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.cd.L0(2131743036, null), p6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.i0.o());
                                org.telegram.ui.ActionBar.a7.V(v12, org.telegram.ui.ActionBar.t6.L6, p6Var);
                                linearLayout4.addView(v12, w7.b6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i16 = -1;
                                i17 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.e2.v(12, context, "!", p6Var);
                                v13.setTypeface(org.telegram.messenger.i0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.i0.L(8.0f);
                                int i26 = org.telegram.ui.ActionBar.t6.f21170q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i26, p6Var));
                                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i26);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.a7.k(v13, d03, N3, null, p6Var);
                                linearLayout5.addView(v13, w7.b6.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.cd.L0(2131743210, null), p6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.i0.o());
                                i16 = -1;
                                i17 = -2;
                                linearLayout5.addView(v14, w7.b6.o(-1, -2));
                                linearLayout4.addView(linearLayout5, w7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, w7.b6.o(i16, i17));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.j1(jSONObject, y2Var, p6Var, 0));
                            }
                            org.telegram.ui.Components.w60 w60Var = new org.telegram.ui.Components.w60(context, 3);
                            w60Var.addView(linearLayout4);
                            linearLayout.addView(w60Var, w7.b6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context);
                            x2Var.getContent().addView(linearLayout, w7.b6.c(-2.0f, -1));
                            y2Var.I0(x2Var);
                            LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.cd.L0(2131743055, null), p6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.a7.V(v15, i24, p6Var);
                                f7.addView(v15, w7.b6.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                            vh.d dVar = new vh.d(context, p6Var, true);
                            dVar.setRoundRadius(24);
                            dVar.e();
                            dVar.setText(org.telegram.messenger.cd.L0(2131752589, null));
                            vh.d i27 = org.telegram.messenger.z20.i(24, context, p6Var, true);
                            i27.setText(org.telegram.messenger.cd.L0(2131743038, null));
                            i27.setEnabled(false);
                            linearLayout6.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(i27, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
                            f7.addView(linearLayout6);
                            y2Var.K0(f7);
                            y2Var.f21623y0 = new i0(a2Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(w60Var, a2Var2, i27, 3);
                            w60Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.k1(gVar, 0));
                            w60Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.l1(gVar, 0));
                            final org.telegram.ui.Wallet.m1 m1Var = new org.telegram.ui.Wallet.m1(i27, dVar, e2Var2, a2Var2, y2Var, p6Var, gVar);
                            i27.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            m1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            m1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            dVar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            m1Var.a(Boolean.FALSE);
                                            return;
                                        default:
                                            m1Var.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var2, y2Var, 0);
                            a2Var2.f34176r = new org.telegram.ui.Wallet.l(y2Var, 5);
                            y2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r6) {
                                        case 0:
                                            zArr[0] = true;
                                            org.telegram.messenger.i0.r((y1) y1Var);
                                            e2Var2.u(a2Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr[0] = true;
                                            org.telegram.messenger.i0.r((y1) y1Var);
                                            e2Var2.u(a2Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            y2Var.show();
                            org.telegram.messenger.i0.h3(y1Var, Math.max(0L, i22 - e2Var2.f34448f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e7) {
                            e2Var2.u(a2Var2);
                            org.telegram.ui.Components.cc.b0(org.telegram.ui.Wallet.e2.i("display signing data", e7));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i19);
                    org.telegram.ui.Wallet.e2 e2Var3 = x10.f34780g;
                    org.telegram.ui.Wallet.d2 d2Var = a2Var2.f34165f;
                    boolean equals2 = "signMessage".equals(str7);
                    final org.telegram.ui.Wallet.y2 y2Var2 = new org.telegram.ui.Wallet.y2(context, p6Var, new View[0]);
                    y2Var2.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, p6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
                    g9Var2.setRoundRadius(org.telegram.messenger.i0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        a2Var = a2Var2;
                        e2Var = e2Var3;
                        z10 = equals2;
                        g9Var2.p(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        a2Var = a2Var2;
                        e2Var = e2Var3;
                        z10 = equals2;
                    }
                    linearLayout7.addView(g9Var2, w7.b6.t(76, 76, 1, 0, 24, 0, 0));
                    if (z10) {
                        i10 = 2131743222;
                    } else {
                        i10 = 2131743221;
                    }
                    TextView v16 = org.telegram.ui.Wallet.e2.v(20, context, org.telegram.messenger.cd.V(null, null, i10, tonconnectsession2.manifest.name), p6Var);
                    v16.setTypeface(org.telegram.messenger.i0.o());
                    linearLayout7.addView(v16, w7.b6.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.i0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.e2.h(context, K0, p6Var), w7.b6.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.l6 l6Var = new org.telegram.ui.Wallet.l6(context, 2131232807, 24);
                    l6Var.getCardHolderView().setMaxLines(2);
                    l6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.c2> list = d2Var.f34373b;
                    long j10 = d2Var.f34374c;
                    l6Var.setCardHolder(org.telegram.ui.Wallet.k8.b0(((org.telegram.ui.Wallet.c2) list.get(0)).f34309a));
                    l6Var.getBalanceView().setText(org.telegram.ui.Wallet.e2.k(j10));
                    l6Var.getUsdBalanceView().setText(x10.m(j10, false));
                    linearLayout7.addView(l6Var, w7.b6.o(-1, -2));
                    l6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    y2 y2Var3 = y2Var2;
                                    hk hkVar = y2Var3.f35407i1;
                                    if (1 < y2Var3.f35408j1.size() && 1 != hkVar.getCurrentPosition()) {
                                        for (View view2 : hkVar.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.i0.v1(view2);
                                            }
                                        }
                                        hkVar.E(1);
                                        return;
                                    }
                                    return;
                                default:
                                    y2 y2Var4 = y2Var2;
                                    hk hkVar2 = y2Var4.f35407i1;
                                    if (y2Var4.f35408j1.size() > 0 && hkVar2.getCurrentPosition() != 0) {
                                        for (View view3 : hkVar2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.i0.v1(view3);
                                            }
                                        }
                                        hkVar2.E(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context);
                    x2Var2.getContent().addView(linearLayout7, w7.b6.c(-2.0f, -1));
                    y2Var2.I0(x2Var2);
                    LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
                    LinearLayout f11 = org.telegram.messenger.m5.f(context, 0);
                    f10.addView(f11, w7.b6.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231241);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i28 = org.telegram.ui.ActionBar.t6.f21020i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i28, p6Var), 1, -1);
                    org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i28);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.a7.k(imageView, h03, null, N4, p6Var);
                    int i29 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.t(imageView, i29, p6Var, PorterDuff.Mode.SRC_IN);
                    w7.e6.a(imageView);
                    f11.addView(imageView, w7.b6.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.g9 g9Var3 = new org.telegram.ui.Components.g9(context);
                    g9Var3.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        str = "signMessage";
                        g9Var3.p(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        str = "signMessage";
                    }
                    f11.addView(g9Var3, w7.b6.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    f11.addView(linearLayout8, w7.b6.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    org.telegram.ui.ActionBar.a7.V(textView, i29, p6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, w7.b6.o(-1, -2));
                    textView.setText(org.telegram.messenger.cd.L0(2131743193, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
                        i11 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, w7.b6.o(-1, -2));
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
                                    y2 y2Var3 = y2Var2;
                                    hk hkVar = y2Var3.f35407i1;
                                    if (1 < y2Var3.f35408j1.size() && 1 != hkVar.getCurrentPosition()) {
                                        for (View view2 : hkVar.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.i0.v1(view2);
                                            }
                                        }
                                        hkVar.E(1);
                                        return;
                                    }
                                    return;
                                default:
                                    y2 y2Var4 = y2Var2;
                                    hk hkVar2 = y2Var4.f35407i1;
                                    if (y2Var4.f35408j1.size() > 0 && hkVar2.getCurrentPosition() != 0) {
                                        for (View view3 : hkVar2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.i0.v1(view3);
                                            }
                                        }
                                        hkVar2.E(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i11);
                    LinearLayout F = org.telegram.ui.Wallet.e2.F(context, org.telegram.messenger.cd.L0(2131743077, null), p6Var);
                    String C = org.telegram.ui.Wallet.e2.C(((org.telegram.ui.Wallet.c2) list.get(0)).f34309a);
                    SpannableStringBuilder s10 = org.telegram.ui.Wallet.k0.s(j10, i11);
                    if (list.size() > i11) {
                        Integer valueOf = Integer.valueOf(list.size() - i11);
                        Object[] objArr = new Object[2];
                        objArr[0] = C;
                        objArr[i11] = valueOf;
                        V = org.telegram.messenger.cd.V(null, null, 2131743001, objArr);
                    } else {
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = C;
                        V = org.telegram.messenger.cd.V(null, null, 2131743002, objArr2);
                    }
                    F.addView(org.telegram.ui.Wallet.e2.c(context, s10, V, null, null, p6Var), w7.b6.o(-1, -2));
                    linearLayout9.addView(F, w7.b6.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.e2.F(context, org.telegram.messenger.cd.L0(2131743233, null), p6Var);
                    for (org.telegram.ui.Wallet.c2 c2Var : list) {
                        if (c2Var.f34310b == null || c2Var.d != null) {
                            str2 = null;
                            i14 = 2131743007;
                        } else {
                            i14 = 2131743179;
                            str2 = null;
                        }
                        F2.addView(org.telegram.ui.Wallet.e2.c(context, org.telegram.messenger.cd.L0(i14, str2), org.telegram.messenger.cd.V(str2, str2, 2131743002, org.telegram.ui.Wallet.e2.C(c2Var.f34309a)), org.telegram.ui.Wallet.e2.b(-c2Var.e), c2Var.d, p6Var), w7.b6.o(-1, -2));
                    }
                    linearLayout9.addView(F2, w7.b6.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    org.telegram.ui.Components.w60 w60Var2 = new org.telegram.ui.Components.w60(context, 4);
                    w60Var2.setFillViewport(false);
                    w60Var2.addView(linearLayout9);
                    f10.addView(w60Var2, w7.b6.o(-1, -2));
                    org.telegram.ui.Wallet.x2 x2Var3 = new org.telegram.ui.Wallet.x2(context);
                    x2Var3.getContent().addView(f10, w7.b6.c(-2.0f, -1));
                    y2Var2.I0(x2Var3);
                    LinearLayout f12 = org.telegram.messenger.m5.f(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.e2.v(14, context, null, p6Var);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u80(org.telegram.messenger.i0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.cd.V(null, null, 2131743146, spannableStringBuilder));
                    if (z10) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    v17.setVisibility(i12);
                    org.telegram.ui.ActionBar.a7.V(v17, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
                    f12.addView(v17, w7.b6.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                    vh.d dVar2 = new vh.d(context, p6Var, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.setText(org.telegram.messenger.cd.L0(2131743169, null));
                    linearLayout10.addView(dVar2, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
                    vh.d i30 = org.telegram.messenger.z20.i(24, context, p6Var, true);
                    if (z10) {
                        i13 = 2131743038;
                    } else {
                        i13 = 2131743194;
                    }
                    i30.setText(org.telegram.messenger.cd.L0(i13, null));
                    i30.setEnabled(false);
                    linearLayout10.addView(i30, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
                    f12.addView(linearLayout10);
                    y2Var2.K0(f12);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.a2 a2Var3 = a2Var;
                    final org.telegram.ui.Wallet.e2 e2Var4 = e2Var;
                    final org.telegram.ui.Wallet.g1 g1Var2 = new org.telegram.ui.Wallet.g1(a2Var3, zArr3, i30, dVar2, e2Var4, y2Var2, zArr2, p6Var);
                    i30.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    g1Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    g1Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    dVar2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    g1Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    g1Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr2, a2Var3, y2Var2, 1);
                    long j11 = i22;
                    long j12 = d2Var.f34372a;
                    if (j12 == 0) {
                        j12 = Long.MAX_VALUE;
                    }
                    a2Var3.f34176r = new org.telegram.ui.Wallet.l(y2Var2, 5);
                    y2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (r6) {
                                case 0:
                                    zArr2[0] = true;
                                    org.telegram.messenger.i0.r((y1) y1Var2);
                                    e2Var4.u(a2Var3);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr2[0] = true;
                                    org.telegram.messenger.i0.r((y1) y1Var2);
                                    e2Var4.u(a2Var3);
                                    Runnable runnable3 = runnable;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    y2Var2.show();
                    org.telegram.messenger.i0.h3(y1Var2, Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i19).getCurrentTime()) * 1000);
                    bi.d dVar3 = new bi.d(zArr2, a2Var3, zArr3, i30, z10, x10, v17, y2Var2, p6Var);
                    WalletEngine2 walletEngine2 = e2Var4.f34446b.f34777b;
                    if (!a2Var3.f34172n && !e2Var4.j(a2Var3) && e2Var4.A(a2Var3) && walletEngine2 != null) {
                        if (str.equals(str7)) {
                            walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.m(e2Var4, a2Var3, dVar3, 1));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var4, a2Var3, dVar3, 9));
                            return;
                        }
                    }
                    dVar3.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str6 != null) {
                    org.telegram.ui.Components.cc.b0(str6);
                    return;
                } else {
                    return;
                }
            default:
                vh.d dVar4 = (vh.d) obj6;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                View view = (View) obj4;
                bh.d dVar5 = (bh.d) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i19).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    StringBuilder m10 = i0.a.m("wear-auth: sending /token account=", i19, " dcId=", currentDatacenterId, " isTest=");
                    m10.append(isTestBackend);
                    org.telegram.messenger.f8.b(m10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = se1.c(dVar5, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.u0 u0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f4346c).h;
                        b8.e eVar2 = new b8.e(u0Var, (String) dVar5.f2779c, "/tg-wear-auth/token", c10);
                        u0Var.f4493b.d(0, eVar2);
                        n6.l.m(eVar2, y8.h0.f54230a).addOnSuccessListener(new ep0(27, dVar5, dVar4)).addOnFailureListener(new qe1(dVar4, 1));
                        z2Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                        new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0(e10.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.s(z2Var.E, z2Var.I0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public j70(LaunchActivity launchActivity, gf.e eVar, org.telegram.messenger.vp vpVar, int i10, TLRPC.User user) {
        this.f38447c = launchActivity;
        this.d = eVar;
        this.e = vpVar;
        this.f38446b = i10;
        this.f38448f = user;
    }

    public j70(ua0 ua0Var, String str, String str2, String str3, int i10) {
        this.f38447c = ua0Var;
        this.d = str;
        this.e = str2;
        this.f38448f = str3;
        this.f38446b = i10;
    }

    public j70(vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, int i10, View view, bh.d dVar2) {
        this.f38447c = dVar;
        this.d = z2Var;
        this.f38446b = i10;
        this.e = view;
        this.f38448f = dVar2;
    }
}
