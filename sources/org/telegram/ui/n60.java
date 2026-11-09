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
public final class n60 implements org.telegram.messenger.v10 {
    public final int f48106a = 2;
    public final int f48107b;
    public final Object f48108c;
    public final Object d;
    public final Object f48109e;
    public final Object f48110f;

    public n60(Context context, int i7, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        this.f48108c = context;
        this.f48107b = i7;
        this.d = l0Var;
        this.f48109e = g6Var;
        this.f48110f = runnable;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.f2 T;
        org.telegram.ui.Wallet.z1 z1Var;
        org.telegram.ui.Wallet.d2 d2Var;
        boolean z9;
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
        int i18 = this.f48106a;
        int i19 = this.f48107b;
        Object obj3 = this.f48110f;
        Object obj4 = this.f48109e;
        Object obj5 = this.d;
        Object obj6 = this.f48108c;
        switch (i18) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str2 = LaunchActivity.B1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    qpVar.X3(user2, false, false);
                    qpVar.W2(user2, 0, true, null);
                }
                launchActivity.m0(i19, user.f27105id, tL_error);
                return;
            case 1:
                r90 r90Var = (r90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = r90Var.f49347a;
                r90Var.h = -1;
                if (!r90Var.f49354j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        r90Var.c();
                        if (r90Var.a()) {
                            r90.d().f0(tL_error2, false);
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
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f27218id && tonconnectrequest2.expires > ConnectionsManager.getInstance(r90Var.f49348b).getCurrentTime()) {
                                        if (r90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            r90Var.c();
                                            org.telegram.ui.Wallet.d2.q(r90Var.f49347a, r90Var.f49348b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new n90(r90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.f48107b;
                        if (i21 < 10) {
                            bi.ub ubVar = new bi.ub((Object) r90Var, str3, str4, str5, i21, 21);
                            r90Var.f49353i = ubVar;
                            org.telegram.messenger.g0.i3(ubVar, 500L);
                            return;
                        }
                        r90Var.c();
                        if (r90Var.a()) {
                            org.telegram.ui.Components.hc.b0(org.telegram.messenger.id.M0(2131742993, null));
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
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                String str6 = (String) obj2;
                if (z1Var2 != null) {
                    int i22 = z1Var2.f43407c;
                    TL_wallet.tonConnectSession tonconnectsession2 = z1Var2.f43405a;
                    String str7 = z1Var2.f43408e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.F1 || org.telegram.messenger.iz.f23448x || org.telegram.messenger.iz.C || org.telegram.messenger.p10.f24470s0 != i19) {
                            l0Var.f42685g.u(z1Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str7)) {
                        final org.telegram.ui.Wallet.d2 d2Var2 = org.telegram.ui.Wallet.l0.x(i19).f42685g;
                        try {
                            JSONObject jSONObject = new JSONObject(z1Var2.f43413k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context, g6Var, new View[0]);
                            x2Var.J0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, g6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231241);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.s6.s(e10, org.telegram.ui.ActionBar.l6.G6, g6Var, PorterDuff.Mode.SRC_IN);
                            int i23 = org.telegram.ui.ActionBar.l6.f27957i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i23, g6Var), 1, -1);
                            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i23);
                            e10.setBackground(h02);
                            org.telegram.ui.ActionBar.s6.j(e10, h02, null, M, g6Var);
                            e10.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
                            e10.setOnClickListener(new hk0(16, z1Var2, x2Var));
                            linearLayout2.addView(e10, c8.ha.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                            l9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                l9Var.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(l9Var, c8.ha.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.d2.v(18, context, org.telegram.messenger.id.M0(2131743011, null), g6Var);
                            v.setTypeface(org.telegram.messenger.g0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, c8.ha.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), g6Var);
                            int i24 = org.telegram.ui.ActionBar.l6.f28275z6;
                            org.telegram.ui.ActionBar.s6.U(v10, i24, g6Var);
                            v10.setGravity(3);
                            v10.setSingleLine(true);
                            v10.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v10, c8.ha.o(-1, -2));
                            linearLayout2.addView(linearLayout3, c8.ha.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, c8.ha.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i25 = org.telegram.ui.ActionBar.l6.f27865d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i25, g6Var));
                            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i25);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.s6.j(linearLayout4, d02, M2, null, g6Var);
                            if (equals) {
                                M0 = jSONObject.optString("text");
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131743183, null);
                            }
                            if (equals) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            TextView v11 = org.telegram.ui.Wallet.d2.v(i15, context, M0, g6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.id.M0(2131743010, null), g6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.s6.U(v12, org.telegram.ui.ActionBar.l6.L6, g6Var);
                                linearLayout4.addView(v12, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i16 = -1;
                                i17 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.d2.v(12, context, "!", g6Var);
                                v13.setTypeface(org.telegram.messenger.g0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i26 = org.telegram.ui.ActionBar.l6.f28106q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(L2, org.telegram.ui.ActionBar.l6.w0(i26, g6Var));
                                org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i26);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.s6.j(v13, d03, M3, null, g6Var);
                                linearLayout5.addView(v13, c8.ha.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.id.M0(2131743184, null), g6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                i16 = -1;
                                i17 = -2;
                                linearLayout5.addView(v14, c8.ha.o(-1, -2));
                                linearLayout4.addView(linearLayout5, c8.ha.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, c8.ha.o(i16, i17));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.i1(jSONObject, x2Var, g6Var, 0));
                            }
                            org.telegram.ui.Components.i60 i60Var = new org.telegram.ui.Components.i60(context, 3);
                            i60Var.addView(linearLayout4);
                            linearLayout.addView(i60Var, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(context);
                            w2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
                            x2Var.I0(w2Var);
                            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.id.M0(2131743029, null), g6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.s6.U(v15, i24, g6Var);
                                f10.addView(v15, c8.ha.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            fi.d dVar = new fi.d(context, g6Var, true);
                            dVar.setRoundRadius(24);
                            dVar.e();
                            dVar.setText(org.telegram.messenger.id.M0(2131752589, null));
                            fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
                            h.setText(org.telegram.messenger.id.M0(2131743012, null));
                            h.setEnabled(false);
                            linearLayout6.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                            f10.addView(linearLayout6);
                            x2Var.K0(f10);
                            x2Var.f28662y0 = new h0(z1Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(i60Var, z1Var2, h, 3);
                            i60Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.j1(gVar, 0));
                            i60Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.k1(gVar, 0));
                            final org.telegram.ui.Wallet.l1 l1Var = new org.telegram.ui.Wallet.l1(h, dVar, d2Var2, z1Var2, x2Var, g6Var, gVar);
                            h.setOnClickListener(new View.OnClickListener() {
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
                            final org.telegram.ui.Wallet.x1 x1Var = new org.telegram.ui.Wallet.x1(zArr, z1Var2, x2Var, 0);
                            z1Var2.f43420r = new org.telegram.ui.Wallet.l(x2Var, 5);
                            x2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
                            x2Var.show();
                            org.telegram.messenger.g0.i3(x1Var, Math.max(0L, i22 - d2Var2.f42349f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e11) {
                            d2Var2.u(z1Var2);
                            org.telegram.ui.Components.hc.b0(org.telegram.ui.Wallet.d2.i("display signing data", e11));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i19);
                    org.telegram.ui.Wallet.d2 d2Var3 = x10.f42685g;
                    org.telegram.ui.Wallet.c2 c2Var = z1Var2.f43409f;
                    boolean equals2 = "signMessage".equals(str7);
                    final org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context, g6Var, new View[0]);
                    x2Var2.J0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, g6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                    l9Var2.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z9 = equals2;
                        l9Var2.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z9 = equals2;
                    }
                    linearLayout7.addView(l9Var2, c8.ha.t(76, 76, 1, 0, 24, 0, 0));
                    if (z9) {
                        i7 = 2131743196;
                    } else {
                        i7 = 2131743195;
                    }
                    TextView v16 = org.telegram.ui.Wallet.d2.v(20, context, org.telegram.messenger.id.V(null, null, i7, tonconnectsession2.manifest.name), g6Var);
                    v16.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout7.addView(v16, c8.ha.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.d2.h(context, K0, g6Var), c8.ha.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.f6 f6Var = new org.telegram.ui.Wallet.f6(context, 2131232809, 24);
                    f6Var.getCardHolderView().setMaxLines(2);
                    f6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.b2> list = c2Var.f42304b;
                    long j3 = c2Var.f42305c;
                    f6Var.setCardHolder(org.telegram.ui.Wallet.d8.c0(((org.telegram.ui.Wallet.b2) list.get(0)).f42210a));
                    f6Var.getBalanceView().setText(org.telegram.ui.Wallet.d2.k(j3));
                    f6Var.getUsdBalanceView().setText(x10.m(j3, false));
                    linearLayout7.addView(f6Var, c8.ha.o(-1, -2));
                    f6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    x2 x2Var3 = x2Var2;
                                    fi.g1 g1Var = x2Var3.f43303i1;
                                    if (1 < x2Var3.f43304j1.size() && 1 != g1Var.getCurrentPosition()) {
                                        for (View view2 : g1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        g1Var.E(1);
                                        return;
                                    }
                                    return;
                                default:
                                    x2 x2Var4 = x2Var2;
                                    fi.g1 g1Var2 = x2Var4.f43303i1;
                                    if (x2Var4.f43304j1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : g1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        g1Var2.E(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Wallet.w2 w2Var2 = new org.telegram.ui.Wallet.w2(context);
                    w2Var2.getContent().addView(linearLayout7, c8.ha.c(-2.0f, -1));
                    x2Var2.I0(w2Var2);
                    LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                    f11.addView(f12, c8.ha.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231240);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i27 = org.telegram.ui.ActionBar.l6.f27957i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i27, g6Var), 1, -1);
                    org.telegram.ui.ActionBar.o6 M4 = org.telegram.ui.ActionBar.s6.M(i27);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.s6.j(imageView, h03, null, M4, g6Var);
                    int i28 = org.telegram.ui.ActionBar.l6.G6;
                    org.telegram.ui.ActionBar.s6.s(imageView, i28, g6Var, PorterDuff.Mode.SRC_IN);
                    c8.ka.a(imageView);
                    f12.addView(imageView, c8.ha.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.l9 l9Var3 = new org.telegram.ui.Components.l9(context);
                    l9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        i10 = i22;
                        l9Var3.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        i10 = i22;
                    }
                    f12.addView(l9Var3, c8.ha.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    f12.addView(linearLayout8, c8.ha.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.s6.U(textView, i28, g6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, c8.ha.o(-1, -2));
                    textView.setText(org.telegram.messenger.id.M0(2131743167, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
                        i11 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, c8.ha.o(-1, -2));
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
                                    fi.g1 g1Var = x2Var3.f43303i1;
                                    if (1 < x2Var3.f43304j1.size() && 1 != g1Var.getCurrentPosition()) {
                                        for (View view2 : g1Var.getViewPages()) {
                                            if (view2 != null) {
                                                org.telegram.messenger.g0.v1(view2);
                                            }
                                        }
                                        g1Var.E(1);
                                        return;
                                    }
                                    return;
                                default:
                                    x2 x2Var4 = x2Var2;
                                    fi.g1 g1Var2 = x2Var4.f43303i1;
                                    if (x2Var4.f43304j1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : g1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                org.telegram.messenger.g0.v1(view3);
                                            }
                                        }
                                        g1Var2.E(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i11);
                    LinearLayout F = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.id.M0(2131743051, null), g6Var);
                    String C = org.telegram.ui.Wallet.d2.C(((org.telegram.ui.Wallet.b2) list.get(0)).f42210a);
                    SpannableStringBuilder s5 = org.telegram.ui.Wallet.l0.s(j3, i11);
                    if (list.size() > i11) {
                        Integer valueOf = Integer.valueOf(list.size() - i11);
                        Object[] objArr = new Object[2];
                        objArr[0] = C;
                        objArr[i11] = valueOf;
                        V = org.telegram.messenger.id.V(null, null, 2131742975, objArr);
                    } else {
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = C;
                        V = org.telegram.messenger.id.V(null, null, 2131742976, objArr2);
                    }
                    F.addView(org.telegram.ui.Wallet.d2.c(context, s5, V, null, null, g6Var), c8.ha.o(-1, -2));
                    linearLayout9.addView(F, c8.ha.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.id.M0(2131743207, null), g6Var);
                    for (org.telegram.ui.Wallet.b2 b2Var : list) {
                        if (b2Var.f42211b == null || b2Var.d != null) {
                            str = null;
                            i14 = 2131742981;
                        } else {
                            i14 = 2131743153;
                            str = null;
                        }
                        F2.addView(org.telegram.ui.Wallet.d2.c(context, org.telegram.messenger.id.M0(i14, str), org.telegram.messenger.id.V(str, str, 2131742976, org.telegram.ui.Wallet.d2.C(b2Var.f42210a)), org.telegram.ui.Wallet.d2.b(-b2Var.f42213e), b2Var.d, g6Var), c8.ha.o(-1, -2));
                    }
                    linearLayout9.addView(F2, c8.ha.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    org.telegram.ui.Components.i60 i60Var2 = new org.telegram.ui.Components.i60(context, 4);
                    i60Var2.setFillViewport(false);
                    i60Var2.addView(linearLayout9);
                    f11.addView(i60Var2, c8.ha.o(-1, -2));
                    org.telegram.ui.Wallet.w2 w2Var3 = new org.telegram.ui.Wallet.w2(context);
                    w2Var3.getContent().addView(f11, c8.ha.c(-2.0f, -1));
                    x2Var2.I0(w2Var3);
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.d2.v(14, context, null, g6Var);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.c80(org.telegram.messenger.g0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.id.V(null, null, 2131743120, spannableStringBuilder));
                    if (z9) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    v17.setVisibility(i12);
                    org.telegram.ui.ActionBar.s6.U(v17, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
                    f13.addView(v17, c8.ha.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                    fi.d dVar2 = new fi.d(context, g6Var, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.setText(org.telegram.messenger.id.M0(2131743143, null));
                    linearLayout10.addView(dVar2, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                    fi.d h7 = org.telegram.messenger.k5.h(24, context, g6Var, true);
                    if (z9) {
                        i13 = 2131743012;
                    } else {
                        i13 = 2131743168;
                    }
                    h7.setText(org.telegram.messenger.id.M0(i13, null));
                    h7.setEnabled(false);
                    linearLayout10.addView(h7, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                    f13.addView(linearLayout10);
                    x2Var2.K0(f13);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final org.telegram.ui.Wallet.z1 z1Var3 = z1Var;
                    final org.telegram.ui.Wallet.d2 d2Var4 = d2Var;
                    final org.telegram.ui.Wallet.f1 f1Var = new org.telegram.ui.Wallet.f1(z1Var3, zArr3, h7, dVar2, d2Var4, x2Var2, zArr2, g6Var);
                    h7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    f1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    f1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    dVar2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    f1Var.a(Boolean.FALSE);
                                    return;
                                default:
                                    f1Var.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final org.telegram.ui.Wallet.x1 x1Var2 = new org.telegram.ui.Wallet.x1(zArr2, z1Var3, x2Var2, 1);
                    long j10 = i10;
                    long j11 = c2Var.f42303a;
                    if (j11 == 0) {
                        j11 = Long.MAX_VALUE;
                    }
                    z1Var3.f43420r = new org.telegram.ui.Wallet.l(x2Var2, 5);
                    x2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
                    x2Var2.show();
                    org.telegram.messenger.g0.i3(x1Var2, Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i19).getCurrentTime()) * 1000);
                    li.c cVar = new li.c(zArr2, z1Var3, zArr3, h7, z9, x10, v17, x2Var2, g6Var);
                    WalletEngine2 walletEngine2 = d2Var4.f42346b.f42681b;
                    if (!z1Var3.f43416n && !d2Var4.j(z1Var3) && d2Var4.A(z1Var3) && walletEngine2 != null) {
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
                    org.telegram.ui.Components.hc.b0(str6);
                    return;
                } else {
                    return;
                }
            default:
                fi.d dVar3 = (fi.d) obj6;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i19).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    StringBuilder o4 = jg.g.o("wear-auth: sending /token account=", i19, " dcId=", currentDatacenterId, " isTest=");
                    o4.append(isTestBackend);
                    org.telegram.messenger.a8.b(o4.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = yc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.n0 n0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.f6540c).f6719i;
                        b9.g0 g0Var = new b9.g0(n0Var, (String) r7Var.d, "/tg-wear-auth/token", c10);
                        n0Var.f6667b.d(0, g0Var);
                        q6.m.m(g0Var, b9.i0.f3058a).addOnSuccessListener(new nk0(28, r7Var, dVar3)).addOnFailureListener(new wc1(dVar3, 1));
                        v2Var.dismiss();
                        return;
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0(e12.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.r(v2Var.E, v2Var.I0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public n60(fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, int i7, View view, a8.r7 r7Var) {
        this.f48108c = dVar;
        this.d = v2Var;
        this.f48107b = i7;
        this.f48109e = view;
        this.f48110f = r7Var;
    }

    public n60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.qp qpVar, int i7, TLRPC.User user) {
        this.f48108c = launchActivity;
        this.d = bVar;
        this.f48109e = qpVar;
        this.f48107b = i7;
        this.f48110f = user;
    }

    public n60(r90 r90Var, String str, String str2, String str3, int i7) {
        this.f48108c = r90Var;
        this.d = str;
        this.f48109e = str2;
        this.f48110f = str3;
        this.f48107b = i7;
    }
}
