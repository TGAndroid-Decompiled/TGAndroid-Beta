package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f11 implements org.telegram.messenger.q20 {
    public final int f37150a;
    public final Object f37151b;
    public final Object f37152c;

    public f11(int i10, Object obj, Object obj2) {
        this.f37150a = i10;
        this.f37151b = obj;
        this.f37152c = obj2;
    }

    @Override
    public final void a(Object obj) {
        float f7;
        float f10;
        s4.c1 K;
        int i10 = this.f37150a;
        Object obj2 = this.f37152c;
        Object obj3 = this.f37151b;
        switch (i10) {
            case 0:
                i11 i11Var = (i11) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    i11Var.getClass();
                    view.setVisibility(0);
                }
                i11Var.f38090f = bitmap;
                Paint paint = new Paint(1);
                i11Var.f38091n = paint;
                Bitmap bitmap2 = i11Var.f38090f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                i11Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                org.telegram.messenger.i0.i(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f10);
                i11Var.f38091n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                i11Var.f38092r = new Matrix();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                e51.b0((e51) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 2:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.tz.f18187u0 = false;
                    org.telegram.messenger.tz.y();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.tk0 tk0Var = themeActivity.f34089b;
                    if (tk0Var != null && tk0Var.G && (K = tk0Var.K(themeActivity.M)) != null) {
                        themeActivity.f34087a.t(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                t11 t11Var = (t11) obj2;
                if (((Boolean) obj).booleanValue()) {
                    t11Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.cc.a0(themeActivity2).I(2131624011, org.telegram.messenger.cd.L0(2131754311, null), org.telegram.messenger.cd.L0(2131754312, null)).j();
                    return;
                }
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj3;
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj2;
                String str = (String) obj;
                if (str != null) {
                    org.telegram.ui.Wallet.k0.j("disableBackupWithoutUpdatingPhrase: ".concat(str));
                    p8Var.a(str);
                    return;
                }
                org.telegram.ui.Wallet.k0.H("sending disableBackup to server");
                org.telegram.ui.Wallet.h3.a(k0Var.f34776a, new zh(8), null, null, null, new jo(3, k0Var, p8Var), true, true, new aa0((Object) null, 1));
                return;
            case 5:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj3;
                try {
                    ((org.telegram.messenger.q20) obj2).a((String) obj);
                    if (h0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (h0Var != null) {
                        h0Var.close();
                    }
                }
            case 6:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.l8) obj2).a((String) obj);
                return;
            case 7:
                ((org.telegram.ui.Wallet.k0) obj3).f34789q.put((TL_wallet.walletTransaction) obj, (org.telegram.ui.Components.zb) obj2);
                return;
            case 8:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) obj3;
                org.telegram.ui.Wallet.m8 m8Var = (org.telegram.ui.Wallet.m8) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    f0Var.close();
                    org.telegram.ui.Wallet.k0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str2));
                    m8Var.a(null, str2);
                    return;
                }
                org.telegram.ui.Wallet.k0.H("prepare disable backup: done!");
                m8Var.a(f0Var, null);
                return;
            case 9:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((f11) obj2).a((String) obj);
                return;
            case 10:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g((org.telegram.ui.Wallet.z1) obj3, (org.telegram.ui.Wallet.k) obj2, (String) obj, 2));
                return;
            case 11:
                ((org.telegram.ui.Wallet.e2) obj3).h = false;
                ((j70) obj2).a(null, (String) obj);
                return;
            case 12:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.m) obj2).a((String) obj);
                return;
            case 13:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.m) obj2).a((String) obj);
                return;
            case 14:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj3;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                String str3 = (String) obj;
                b6Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str3)) {
                    org.telegram.ui.Wallet.k8 k8Var = new org.telegram.ui.Wallet.k8();
                    k8Var.f34822s = k0Var2.y();
                    b6Var.presentFragment(k8Var);
                    return;
                } else if (str3 != null) {
                    org.telegram.ui.Components.cc.a0(b6Var).e0(str3, false);
                    return;
                } else {
                    b6Var.presentFragment(new org.telegram.ui.Wallet.ba());
                    return;
                }
            case 15:
                org.telegram.ui.Wallet.k8 k8Var2 = (org.telegram.ui.Wallet.k8) obj3;
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) obj2;
                String str4 = (String) obj;
                k8Var2.d.setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.cc.a0(k8Var2).e0(str4, false);
                    return;
                }
                k8Var2.finishFragment();
                k0Var3.L();
                return;
            case 16:
                org.telegram.ui.Wallet.t8 t8Var = (org.telegram.ui.Wallet.t8) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Components.cc.a0(t8Var).e0(str5, false);
                    return;
                }
                t8Var.finishFragment();
                if (k2Var instanceof org.telegram.ui.Wallet.b6) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.Wallet.j3(2, k2Var), 300L);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Wallet.ba baVar = (org.telegram.ui.Wallet.ba) obj3;
                String str6 = (String) obj;
                ((org.telegram.messenger.q20) obj2).a(str6);
                if (str6 == null && !baVar.f34285r) {
                    if (baVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.k2 k2Var2 : baVar.getParentLayout().getFragmentStack()) {
                            if (k2Var2 instanceof org.telegram.ui.Wallet.b6) {
                                ((org.telegram.ui.Wallet.b6) k2Var2).N0();
                            }
                        }
                    }
                    baVar.finishFragment();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Wallet.ma.c0((org.telegram.ui.Wallet.ma) obj3, (TL_wallet.tonConnectSession) obj2, (org.telegram.messenger.q20) obj);
                return;
            case 19:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) obj3;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                p1Var.getClass();
                ((org.telegram.ui.web.b1[]) obj2)[0].finishFragment();
                org.telegram.messenger.q20 q20Var = p1Var.f43162f;
                if (q20Var != null) {
                    p1Var.finishFragment();
                    q20Var.a(a1Var);
                    return;
                }
                gf.f.r(p1Var.getParentActivity(), a1Var.f42984c);
                return;
            case 20:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj3;
                y1Var.getClass();
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.u41(y1Var, (org.telegram.ui.web.x1) obj2, (Bitmap) obj, 9));
                return;
            case 21:
                ph.l1 l1Var = (ph.l1) obj3;
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) obj2;
                Boolean bool2 = (Boolean) obj;
                l1Var.getClass();
                if (q20Var2 != null) {
                    q20Var2.a(bool2);
                }
                if (bool2.booleanValue()) {
                    l1Var.N0 = true;
                }
                l1Var.dismiss();
                return;
            case 22:
                org.telegram.messenger.voip.g gVar = (org.telegram.messenger.voip.g) obj2;
                if (((Object[]) obj)[1] == ((rh.v5) obj3)) {
                    gVar.run();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.vq0 vq0Var = (org.telegram.ui.Components.vq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str7 = (String) obj;
                rh.u5 u5Var = vq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                u5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i12 = u5Var.f47545a;
                updatestargiftcollection.peer = org.telegram.messenger.vp.r1(i12).i1(u5Var.f47546b);
                updatestargiftcollection.collection_id = i11;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                vq0Var.f(true);
                return;
            case 24:
                ph.g4 g4Var = (ph.g4) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                Void r02 = (Void) obj;
                long j10 = g4Var.R1;
                Runnable runnable = g4Var.Y1;
                if (runnable != null) {
                    runnable.run();
                }
                g4Var.dismiss();
                org.telegram.messenger.zs.f(org.telegram.messenger.d20.f15147s0).k(188, new Object[0]);
                org.telegram.messenger.i0.h3(new ph.x3(0, user), 250L);
                org.telegram.messenger.vp.r1(g4Var.Q1).f7.edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            case 25:
                qh.x0 x0Var = (qh.x0) obj3;
                qh.u0 u0Var = (qh.u0) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (!u0Var.G && u0Var.e == null) {
                    x0Var.E0(u0Var, bitmap3);
                    return;
                }
                return;
            case 26:
                rh.e4 e4Var = (rh.e4) obj3;
                mg.i2[] i2VarArr = (mg.i2[]) obj2;
                Long l4 = (Long) obj;
                if (l4.longValue() == -97) {
                    mg.i2 i2Var = i2VarArr[0];
                    TL_stars.TL_starGiftUnique H1 = e4Var.H1();
                    if (e4Var.X2 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
                        long e = org.telegram.messenger.d20.i(e4Var.f21583a).e();
                        TextView textView = new TextView(e4Var.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i13 = org.telegram.ui.ActionBar.t6.f21185r5;
                        org.telegram.ui.ActionBar.a7.V(textView, i13, e4Var.I0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u80(org.telegram.messenger.i0.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = org.telegram.messenger.vp.r1(e4Var.f21583a).i1(e);
                        depositstargift.slug = H1.slug;
                        ConnectionsManager.getInstance(e4Var.f21583a).sendRequestTyped(depositstargift, new a3.b(1), new af(e4Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 7));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                        String L0 = org.telegram.messenger.cd.L0(2131750116, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131750114, null);
                        TLRPC.User f11 = org.telegram.messenger.d20.i(e4Var.f21583a).f();
                        LinearLayout linearLayout = new LinearLayout(e4Var.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(e4Var.getContext());
                        int L = org.telegram.messenger.i0.L(20.0f);
                        int i14 = org.telegram.ui.ActionBar.t6.f21037j5;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.045f, org.telegram.ui.ActionBar.t6.w0(i14, e4Var.I0)));
                        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.045f, i14);
                        org.telegram.ui.ActionBar.p6 p6Var = e4Var.I0;
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, L2, null, p6Var);
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(e4Var.getContext());
                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
                        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                        r8Var.r(f11);
                        g9Var.e(f11, r8Var);
                        frameLayout.addView(g9Var, w7.b6.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(e4Var.getContext());
                        sc.e.t(textView2, 1, 16.0f);
                        org.telegram.ui.ActionBar.a7.V(textView2, i14, e4Var.I0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(org.telegram.messenger.k6.m(org.telegram.messenger.h20.p(f11), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(e4Var.getContext());
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.a7.V(textView3, i13, e4Var.I0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f11 != null && !TextUtils.isEmpty(f11.phone)) {
                            textView3.setText(af.b.c().b("+" + f11.phone));
                        } else if (f11 != null && org.telegram.messenger.h20.n(f11) != null) {
                            textView3.setText("@" + org.telegram.messenger.h20.n(f11));
                        }
                        frameLayout.addView(textView3, w7.b6.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, w7.b6.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(e4Var.getContext());
                        textView4.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.a7.V(textView4, i14, e4Var.I0);
                        org.telegram.messenger.m5.l(textView4, 17, null, 2131750117);
                        linearLayout.addView(textView4, w7.b6.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(e4Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        e4Var.l1(linearLayout2, 2131232265, 14, i13, org.telegram.messenger.cd.L0(2131748317, null), true);
                        e4Var.l1(linearLayout2, 2131231826, 14, i13, org.telegram.messenger.cd.L0(2131746691, null), false);
                        linearLayout.addView(linearLayout2, w7.b6.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, w7.b6.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.o(linearLayout);
                        x1Var.G = 20;
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131750118, null), new vg(e4Var, e, stargiftdepositpayloadArr, i2Var, 5));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        x1Var.setOnDismissListener(new mg.g(14, zArr, runnableArr));
                        x1Var.show();
                        return;
                    }
                    return;
                } else if (l4.longValue() != -99 && l4.longValue() != -98) {
                    e4Var.X1(l4.longValue(), 0L, false, new rh.m1(e4Var, l4, i2VarArr, 1));
                    return;
                } else {
                    return;
                }
            case 27:
                rh.e4.f1((rh.e4) obj3, (org.telegram.ui.ActionBar.x1) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 28:
                rh.e4 e4Var2 = (rh.e4) obj3;
                String str8 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                rh.y3 y3Var = e4Var2.X1;
                xh.h[] hVarArr = e4Var2.f46819l2;
                vh.d dVar = e4Var2.f46801c2;
                if (stargiftupgradepreview != null) {
                    y3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    e4Var2.s2(1, false, null);
                    y3Var.i(1, org.telegram.messenger.cd.L0(2131750145, null), org.telegram.messenger.cd.a0(null, null, 2131750146, str8), null);
                    hVarArr[0].setText(org.telegram.messenger.cd.L0(2131749875, null));
                    hVarArr[1].setText(org.telegram.messenger.cd.L0(2131749872, null));
                    hVarArr[2].setText(org.telegram.messenger.cd.L0(2131749869, null));
                    e4Var2.f46823n2.setVisibility(8);
                    e4Var2.f46821m2.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(org.telegram.messenger.cd.L0(2131747847, null), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new rh.v0(e4Var2, 9));
                    e4Var2.show();
                    return;
                }
                return;
            default:
                rh.a3 a3Var = (rh.a3) obj3;
                a3Var.getClass();
                ((rh.y2) obj2).a((TL_stars.StarGift) obj, true);
                a3Var.d(true);
                return;
        }
    }

    public f11(org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.Wallet.f0 f0Var, org.telegram.ui.Wallet.m8 m8Var) {
        this.f37150a = 8;
        this.f37151b = f0Var;
        this.f37152c = m8Var;
    }
}
