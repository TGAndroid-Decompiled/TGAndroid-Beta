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
public final class o60 implements org.telegram.messenger.v10 {
    public final int f48442a = 2;
    public final int f48443b;
    public final Object f48444c;
    public final Object d;
    public final Object f48445e;
    public final Object f48446f;

    public o60(Context context, int i7, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        this.f48444c = context;
        this.f48443b = i7;
        this.d = l0Var;
        this.f48445e = h6Var;
        this.f48446f = runnable;
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
        int i18 = this.f48442a;
        int i19 = this.f48443b;
        Object obj3 = this.f48446f;
        Object obj4 = this.f48445e;
        Object obj5 = this.d;
        Object obj6 = this.f48444c;
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
                launchActivity.m0(i19, user.f27109id, tL_error);
                return;
            case 1:
                s90 s90Var = (s90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = s90Var.f49756a;
                s90Var.h = -1;
                if (!s90Var.f49763j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        s90Var.c();
                        if (s90Var.a()) {
                            s90.d().f0(tL_error2, false);
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
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.f27222id && tonconnectrequest2.expires > ConnectionsManager.getInstance(s90Var.f49757b).getCurrentTime()) {
                                        if (s90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            s90Var.c();
                                            org.telegram.ui.Wallet.d2.q(s90Var.f49756a, s90Var.f49757b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new o90(s90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i21 = this.f48443b;
                        if (i21 < 10) {
                            bi.ub ubVar = new bi.ub((Object) s90Var, str3, str4, str5, i21, 21);
                            s90Var.f49762i = ubVar;
                            org.telegram.messenger.g0.i3(ubVar, 500L);
                            return;
                        }
                        s90Var.c();
                        if (s90Var.a()) {
                            org.telegram.ui.Components.gc.b0(org.telegram.messenger.id.M0(2131742993, null));
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
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                String str6 = (String) obj2;
                if (z1Var2 != null) {
                    int i22 = z1Var2.f43414c;
                    TL_wallet.tonConnectSession tonconnectsession2 = z1Var2.f43412a;
                    String str7 = z1Var2.f43415e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.F1 || org.telegram.messenger.iz.f23452x || org.telegram.messenger.iz.C || org.telegram.messenger.p10.f24474s0 != i19) {
                            l0Var.f42754g.u(z1Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str7)) {
                        final org.telegram.ui.Wallet.d2 d2Var2 = org.telegram.ui.Wallet.l0.x(i19).f42754g;
                        try {
                            JSONObject jSONObject = new JSONObject(z1Var2.f43420k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context, h6Var, new View[0]);
                            x2Var.J0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, h6Var));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231241);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.G6, h6Var, PorterDuff.Mode.SRC_IN);
                            int i23 = org.telegram.ui.ActionBar.m6.f27982i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i23, h6Var), 1, -1);
                            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i23);
                            e10.setBackground(h02);
                            org.telegram.ui.ActionBar.t6.j(e10, h02, null, M, h6Var);
                            e10.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
                            e10.setOnClickListener(new ik0(16, z1Var2, x2Var));
                            linearLayout2.addView(e10, c8.ha.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                            k9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                k9Var.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(k9Var, c8.ha.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = org.telegram.ui.Wallet.d2.v(18, context, org.telegram.messenger.id.M0(2131743011, null), h6Var);
                            v.setTypeface(org.telegram.messenger.g0.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, c8.ha.o(-1, -2));
                            TextView v10 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), h6Var);
                            int i24 = org.telegram.ui.ActionBar.m6.f28300z6;
                            org.telegram.ui.ActionBar.t6.U(v10, i24, h6Var);
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
                            int i25 = org.telegram.ui.ActionBar.m6.f27890d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i25, h6Var));
                            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i25);
                            linearLayout4.setBackground(d02);
                            org.telegram.ui.ActionBar.t6.j(linearLayout4, d02, M2, null, h6Var);
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
                            TextView v11 = org.telegram.ui.Wallet.d2.v(i15, context, M0, h6Var);
                            v11.setGravity(3);
                            v11.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v12 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.id.M0(2131743010, null), h6Var);
                                v12.setGravity(3);
                                v12.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.t6.U(v12, org.telegram.ui.ActionBar.m6.L6, h6Var);
                                linearLayout4.addView(v12, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v11.setTypeface(Typeface.MONOSPACE);
                                i16 = -1;
                                i17 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v13 = org.telegram.ui.Wallet.d2.v(12, context, "!", h6Var);
                                v13.setTypeface(org.telegram.messenger.g0.o());
                                v13.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i26 = org.telegram.ui.ActionBar.m6.f28131q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i26, h6Var));
                                org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i26);
                                v13.setBackground(d03);
                                org.telegram.ui.ActionBar.t6.j(v13, d03, M3, null, h6Var);
                                linearLayout5.addView(v13, c8.ha.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v14 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.id.M0(2131743184, null), h6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                i16 = -1;
                                i17 = -2;
                                linearLayout5.addView(v14, c8.ha.o(-1, -2));
                                linearLayout4.addView(linearLayout5, c8.ha.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v11, c8.ha.o(i16, i17));
                            if (equals) {
                                v11.setOnClickListener(new org.telegram.ui.Wallet.i1(jSONObject, x2Var, h6Var, 0));
                            }
                            org.telegram.ui.Components.h60 h60Var = new org.telegram.ui.Components.h60(context, 3);
                            h60Var.addView(linearLayout4);
                            linearLayout.addView(h60Var, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(context);
                            w2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
                            x2Var.I0(w2Var);
                            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                            if (equals) {
                                TextView v15 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.id.M0(2131743029, null), h6Var);
                                v15.setGravity(3);
                                org.telegram.ui.ActionBar.t6.U(v15, i24, h6Var);
                                f10.addView(v15, c8.ha.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            fi.d dVar = new fi.d(context, h6Var, true);
                            dVar.setRoundRadius(24);
                            dVar.e();
                            dVar.setText(org.telegram.messenger.id.M0(2131752589, null));
                            fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
                            h.setText(org.telegram.messenger.id.M0(2131743012, null));
                            h.setEnabled(false);
                            linearLayout6.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                            f10.addView(linearLayout6);
                            x2Var.K0(f10);
                            x2Var.f28713y0 = new h0(z1Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(h60Var, z1Var2, h, 3);
                            h60Var.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.j1(gVar, 0));
                            h60Var.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.k1(gVar, 0));
                            final org.telegram.ui.Wallet.l1 l1Var = new org.telegram.ui.Wallet.l1(h, dVar, d2Var2, z1Var2, x2Var, h6Var, gVar);
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
                            z1Var2.f43427r = new org.telegram.ui.Wallet.l(x2Var, 5);
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
                            org.telegram.messenger.g0.i3(x1Var, Math.max(0L, i22 - d2Var2.f42290f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e11) {
                            d2Var2.u(z1Var2);
                            org.telegram.ui.Components.gc.b0(org.telegram.ui.Wallet.d2.i("display signing data", e11));
                            return;
                        }
                    }
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i19);
                    org.telegram.ui.Wallet.d2 d2Var3 = x10.f42754g;
                    org.telegram.ui.Wallet.c2 c2Var = z1Var2.f43416f;
                    boolean equals2 = "signMessage".equals(str7);
                    final org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context, h6Var, new View[0]);
                    x2Var2.J0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, h6Var));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                    k9Var2.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z9 = equals2;
                        k9Var2.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        z1Var = z1Var2;
                        d2Var = d2Var3;
                        z9 = equals2;
                    }
                    linearLayout7.addView(k9Var2, c8.ha.t(76, 76, 1, 0, 24, 0, 0));
                    if (z9) {
                        i7 = 2131743196;
                    } else {
                        i7 = 2131743195;
                    }
                    TextView v16 = org.telegram.ui.Wallet.d2.v(20, context, org.telegram.messenger.id.V(null, null, i7, tonconnectsession2.manifest.name), h6Var);
                    v16.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout7.addView(v16, c8.ha.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(K0)) {
                        linearLayout7.addView(org.telegram.ui.Wallet.d2.h(context, K0, h6Var), c8.ha.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    org.telegram.ui.Wallet.i6 i6Var = new org.telegram.ui.Wallet.i6(context, 2131232809, 24);
                    i6Var.getCardHolderView().setMaxLines(2);
                    i6Var.getCardHolderView().setSingleLine(false);
                    List<org.telegram.ui.Wallet.b2> list = c2Var.f42210b;
                    long j3 = c2Var.f42211c;
                    i6Var.setCardHolder(org.telegram.ui.Wallet.g8.c0(((org.telegram.ui.Wallet.b2) list.get(0)).f42167a));
                    i6Var.getBalanceView().setText(org.telegram.ui.Wallet.d2.k(j3));
                    i6Var.getUsdBalanceView().setText(x10.m(j3, false));
                    linearLayout7.addView(i6Var, c8.ha.o(-1, -2));
                    i6Var.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            switch (r2) {
                                case 0:
                                    x2 x2Var3 = x2Var2;
                                    fi.g1 g1Var = x2Var3.l1;
                                    if (1 < x2Var3.f43321m1.size() && 1 != g1Var.getCurrentPosition()) {
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
                                    fi.g1 g1Var2 = x2Var4.l1;
                                    if (x2Var4.f43321m1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
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
                    int i27 = org.telegram.ui.ActionBar.m6.f27982i6;
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i27, h6Var), 1, -1);
                    org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i27);
                    imageView.setBackground(h03);
                    org.telegram.ui.ActionBar.t6.j(imageView, h03, null, M4, h6Var);
                    int i28 = org.telegram.ui.ActionBar.m6.G6;
                    org.telegram.ui.ActionBar.t6.s(imageView, i28, h6Var, PorterDuff.Mode.SRC_IN);
                    c8.ka.a(imageView);
                    f12.addView(imageView, c8.ha.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    org.telegram.ui.Components.k9 k9Var3 = new org.telegram.ui.Components.k9(context);
                    k9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        i10 = i22;
                        k9Var3.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        i10 = i22;
                    }
                    f12.addView(k9Var3, c8.ha.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    f12.addView(linearLayout8, c8.ha.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.t6.U(textView, i28, h6Var);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, c8.ha.o(-1, -2));
                    textView.setText(org.telegram.messenger.id.M0(2131743167, null));
                    if (!TextUtils.isEmpty(K0)) {
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
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
                                    fi.g1 g1Var = x2Var3.l1;
                                    if (1 < x2Var3.f43321m1.size() && 1 != g1Var.getCurrentPosition()) {
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
                                    fi.g1 g1Var2 = x2Var4.l1;
                                    if (x2Var4.f43321m1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
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
                    LinearLayout F = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.id.M0(2131743051, null), h6Var);
                    String C = org.telegram.ui.Wallet.d2.C(((org.telegram.ui.Wallet.b2) list.get(0)).f42167a);
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
                    F.addView(org.telegram.ui.Wallet.d2.c(context, s5, V, null, null, h6Var), c8.ha.o(-1, -2));
                    linearLayout9.addView(F, c8.ha.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.id.M0(2131743207, null), h6Var);
                    for (org.telegram.ui.Wallet.b2 b2Var : list) {
                        if (b2Var.f42168b == null || b2Var.d != null) {
                            str = null;
                            i14 = 2131742981;
                        } else {
                            i14 = 2131743153;
                            str = null;
                        }
                        F2.addView(org.telegram.ui.Wallet.d2.c(context, org.telegram.messenger.id.M0(i14, str), org.telegram.messenger.id.V(str, str, 2131742976, org.telegram.ui.Wallet.d2.C(b2Var.f42167a)), org.telegram.ui.Wallet.d2.b(-b2Var.f42170e), b2Var.d, h6Var), c8.ha.o(-1, -2));
                    }
                    linearLayout9.addView(F2, c8.ha.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    org.telegram.ui.Components.h60 h60Var2 = new org.telegram.ui.Components.h60(context, 4);
                    h60Var2.setFillViewport(false);
                    h60Var2.addView(linearLayout9);
                    f11.addView(h60Var2, c8.ha.o(-1, -2));
                    org.telegram.ui.Wallet.w2 w2Var3 = new org.telegram.ui.Wallet.w2(context);
                    w2Var3.getContent().addView(f11, c8.ha.c(-2.0f, -1));
                    x2Var2.I0(w2Var3);
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                    TextView v17 = org.telegram.ui.Wallet.d2.v(14, context, null, h6Var);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.b80(org.telegram.messenger.g0.L(80.0f), v17), 0, spannableStringBuilder.length(), 33);
                    v17.setText(org.telegram.messenger.id.V(null, null, 2131743120, spannableStringBuilder));
                    if (z9) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    v17.setVisibility(i12);
                    org.telegram.ui.ActionBar.t6.U(v17, org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
                    f13.addView(v17, c8.ha.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                    fi.d dVar2 = new fi.d(context, h6Var, true);
                    dVar2.setRoundRadius(24);
                    dVar2.e();
                    dVar2.setText(org.telegram.messenger.id.M0(2131743143, null));
                    linearLayout10.addView(dVar2, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                    fi.d h7 = org.telegram.messenger.k5.h(24, context, h6Var, true);
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
                    final org.telegram.ui.Wallet.f1 f1Var = new org.telegram.ui.Wallet.f1(z1Var3, zArr3, h7, dVar2, d2Var4, x2Var2, zArr2, h6Var);
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
                    long j11 = c2Var.f42209a;
                    if (j11 == 0) {
                        j11 = Long.MAX_VALUE;
                    }
                    z1Var3.f43427r = new org.telegram.ui.Wallet.l(x2Var2, 5);
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
                    li.c cVar = new li.c(zArr2, z1Var3, zArr3, h7, z9, x10, v17, x2Var2, h6Var);
                    WalletEngine2 walletEngine2 = d2Var4.f42287b.f42750b;
                    if (!z1Var3.f43423n && !d2Var4.j(z1Var3) && d2Var4.A(z1Var3) && walletEngine2 != null) {
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
                    org.telegram.ui.Components.gc.b0(str6);
                    return;
                } else {
                    return;
                }
            default:
                fi.d dVar3 = (fi.d) obj6;
                org.telegram.ui.ActionBar.w2 w2Var4 = (org.telegram.ui.ActionBar.w2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.gc(w2Var4.E, w2Var4.I0).e0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i19).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    StringBuilder o4 = jg.g.o("wear-auth: sending /token account=", i19, " dcId=", currentDatacenterId, " isTest=");
                    o4.append(isTestBackend);
                    org.telegram.messenger.a8.b(o4.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = zc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.n0 n0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.f6545c).f6724i;
                        b9.g0 g0Var = new b9.g0(n0Var, (String) r7Var.d, "/tg-wear-auth/token", c10);
                        n0Var.f6672b.d(0, g0Var);
                        q6.m.m(g0Var, b9.i0.f3058a).addOnSuccessListener(new ok0(28, r7Var, dVar3)).addOnFailureListener(new xc1(dVar3, 1));
                        w2Var4.dismiss();
                        return;
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        new org.telegram.ui.Components.gc(w2Var4.E, w2Var4.I0).e0(e12.getMessage(), false);
                        return;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.r(w2Var4.E, w2Var4.I0, tL_error3, false);
                    return;
                } else {
                    new org.telegram.ui.Components.gc(w2Var4.E, w2Var4.I0).e0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public o60(fi.d dVar, org.telegram.ui.ActionBar.w2 w2Var, int i7, View view, a8.r7 r7Var) {
        this.f48444c = dVar;
        this.d = w2Var;
        this.f48443b = i7;
        this.f48445e = view;
        this.f48446f = r7Var;
    }

    public o60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.qp qpVar, int i7, TLRPC.User user) {
        this.f48444c = launchActivity;
        this.d = bVar;
        this.f48445e = qpVar;
        this.f48443b = i7;
        this.f48446f = user;
    }

    public o60(s90 s90Var, String str, String str2, String str3, int i7) {
        this.f48444c = s90Var;
        this.d = str;
        this.f48445e = str2;
        this.f48446f = str3;
        this.f48443b = i7;
    }
}
