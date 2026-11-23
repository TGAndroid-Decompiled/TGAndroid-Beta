package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class gu extends org.telegram.ui.ActionBar.w2 {
    public static gu S1;
    public au A1;
    public final int B1;
    public final int C1;
    public final String D1;
    public final boolean E1;
    public final String F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public final int L1;
    public final bu M1;
    public wi.n N1;
    public View O1;
    public int P1;
    public int Q1;
    public final org.telegram.ui.Cells.aa R1;
    public final cu f35536m1;
    public final a81 n1;
    public View f35537o1;
    public final FrameLayout f35538p1;
    public WebChromeClient.CustomViewCallback f35539q1;
    public final View f35540r1;
    public final RadialProgressView f35541s1;
    public final Activity f35542t1;
    public final LinearLayout f35543u1;
    public final TextView f35544v1;
    public final bi.g3 f35545w1;
    public final ImageView f35546x1;
    public boolean f35547y1;
    public final int[] f35548z1;

    public gu(Activity activity, String str, String str2, String str3, String str4, int i7, int i10, int i11) {
        super(activity, false);
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z11;
        int i16;
        int i17;
        this.f35548z1 = new int[2];
        this.G1 = -2;
        this.M1 = new bu(this);
        this.R1 = new org.telegram.ui.Cells.aa(this, 4);
        this.V = true;
        this.f30262v0 = false;
        this.f30264w0 = false;
        this.L1 = i11;
        if (com.google.android.gms.internal.vision.e2.s(activity)) {
            this.f35542t1 = activity;
        }
        this.F1 = str4;
        if (str2 != null && str2.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E1 = z10;
        this.D1 = str3;
        this.B1 = i7;
        this.C1 = i10;
        if (i7 == 0 || i10 == 0) {
            Point point = org.telegram.messenger.g0.f24226q;
            this.B1 = point.x;
            this.C1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f35538p1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new gi.a(18));
        this.f30229c.addView(frameLayout, c8.na.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bi.g3 g3Var = new bi.g3(18, activity, this);
        this.f35545w1 = g3Var;
        g3Var.setOnTouchListener(new gi.a(18));
        this.O = g3Var;
        cu cuVar = new cu(this, activity, activity, 0);
        this.f35536m1 = cuVar;
        cuVar.getSettings().setJavaScriptEnabled(true);
        cuVar.getSettings().setDomStorageEnabled(true);
        cuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        cuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(cuVar, true);
        cuVar.setWebChromeClient(new org.telegram.ui.m1(this, 1));
        cuVar.setWebViewClient(new org.telegram.ui.n1(this, 1));
        if (z10) {
            i12 = 22;
        } else {
            i12 = 0;
        }
        g3Var.addView(cuVar, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 + 84));
        a81 a81Var = new a81(activity, true, new du(this));
        this.n1 = a81Var;
        a81Var.setVisibility(4);
        if (z10) {
            i13 = 22;
        } else {
            i13 = 0;
        }
        g3Var.addView(a81Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 + 74));
        View view = new View(activity);
        this.f35540r1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        if (z10) {
            i14 = 22;
        } else {
            i14 = 0;
        }
        g3Var.addView(view, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.f35541s1 = radialProgressView;
        radialProgressView.setVisibility(4);
        if (z10) {
            i15 = 22;
        } else {
            i15 = 0;
        }
        g3Var.addView(radialProgressView, c8.na.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, (i15 + 84) / 2));
        if (z10) {
            TextView textView = new TextView(activity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            g3Var.addView(textView, c8.na.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29670p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        g3Var.addView(textView2, c8.na.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.K5, view2, null);
        g3Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, frameLayout2, null);
        g3Var.addView(frameLayout2, c8.na.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, c8.na.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i18 = org.telegram.ui.ActionBar.n6.f29650o5;
        org.telegram.ui.ActionBar.u6.U(textView3, i18, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i19 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i19);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(textView3, h02, null, M, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.gd.N0(2131752029, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, c8.na.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gu f42561b;

            {
                this.f42561b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f42561b.dismiss();
                        return;
                    case 1:
                        gu guVar = this.f42561b;
                        cu cuVar2 = guVar.f35536m1;
                        wi.n c10 = l2.j.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new zt(0, view3), 300L);
                            return;
                        } else if (guVar.f35541s1.getVisibility() != 0) {
                            guVar.P0(cuVar2, guVar.B1, guVar.C1);
                            if (guVar.f35547y1) {
                                cuVar2.evaluateJavascript("hideControls();", null);
                            }
                            guVar.f30226b.setTranslationY(0.0f);
                            guVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        gu guVar2 = this.f42561b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = guVar2.f35542t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(22));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f42561b;
                        vf.c.t(guVar3.f35542t1, guVar3.D1);
                        guVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.f35543u1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, c8.na.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.f35546x1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231277);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754807, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i18, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i19);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(imageView, h03, null, M2, null);
        linearLayout2.addView(imageView, c8.na.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final gu f42561b;

            {
                this.f42561b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f42561b.dismiss();
                        return;
                    case 1:
                        gu guVar = this.f42561b;
                        cu cuVar2 = guVar.f35536m1;
                        wi.n c10 = l2.j.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new zt(0, view3), 300L);
                            return;
                        } else if (guVar.f35541s1.getVisibility() != 0) {
                            guVar.P0(cuVar2, guVar.B1, guVar.C1);
                            if (guVar.f35547y1) {
                                cuVar2.evaluateJavascript("hideControls();", null);
                            }
                            guVar.f30226b.setTranslationY(0.0f);
                            guVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        gu guVar2 = this.f42561b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = guVar2.f35542t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(22));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f42561b;
                        vf.c.t(guVar3.f35542t1, guVar3.D1);
                        guVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final gu f42561b;

            {
                this.f42561b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f42561b.dismiss();
                        return;
                    case 1:
                        gu guVar = this.f42561b;
                        cu cuVar2 = guVar.f35536m1;
                        wi.n c10 = l2.j.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new zt(0, view3), 300L);
                            return;
                        } else if (guVar.f35541s1.getVisibility() != 0) {
                            guVar.P0(cuVar2, guVar.B1, guVar.C1);
                            if (guVar.f35547y1) {
                                cuVar2.evaluateJavascript("hideControls();", null);
                            }
                            guVar.f30226b.setTranslationY(0.0f);
                            guVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        gu guVar2 = this.f42561b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = guVar2.f35542t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(22));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f42561b;
                        vf.c.t(guVar3.f35542t1, guVar3.D1);
                        guVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232108);
        imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131751750, null));
        org.telegram.ui.ActionBar.u6.s(imageView2, i18, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i19);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.u6.j(imageView2, h04, null, M3, null);
        linearLayout2.addView(imageView2, c8.na.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.f35544v1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView4, i18, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i19);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(textView4, h05, null, M4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.gd.N0(2131751755, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, c8.na.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView5, i18, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i19);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(textView5, h06, null, M5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.gd.N0(2131747604, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, c8.na.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final gu f42561b;

            {
                this.f42561b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f42561b.dismiss();
                        return;
                    case 1:
                        gu guVar = this.f42561b;
                        cu cuVar2 = guVar.f35536m1;
                        wi.n c10 = l2.j.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new zt(0, view3), 300L);
                            return;
                        } else if (guVar.f35541s1.getVisibility() != 0) {
                            guVar.P0(cuVar2, guVar.B1, guVar.C1);
                            if (guVar.f35547y1) {
                                cuVar2.evaluateJavascript("hideControls();", null);
                            }
                            guVar.f30226b.setTranslationY(0.0f);
                            guVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        gu guVar2 = this.f42561b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = guVar2.f35542t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(22));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f42561b;
                        vf.c.t(guVar3.f35542t1, guVar3.D1);
                        guVar3.dismiss();
                        return;
                }
            }
        });
        if (!a81.a(str4) && !a81.a(str3)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i16 = 0;
        } else {
            i16 = 4;
        }
        a81Var.setVisibility(i16);
        if (z11) {
            w71 w71Var = a81Var.f33408g0;
            w71Var.setVisibility(4);
            i17 = 0;
            w71Var.d(false, false);
            a81Var.j(true, false);
        } else {
            i17 = 0;
        }
        this.f30269z0 = new eu(this, z11);
        this.A1 = new au(i17, org.telegram.messenger.t0.f27013b, this);
        String e10 = a81.e(str4);
        if (e10 != null || !z11) {
            radialProgressView.setVisibility(i17);
            cuVar.setVisibility(i17);
            linearLayout2.setVisibility(i17);
            if (e10 != null) {
                view.setVisibility(i17);
            }
            textView4.setVisibility(4);
            cuVar.setKeepScreenOn(true);
            a81Var.setVisibility(4);
            a81Var.getControlsView().setVisibility(4);
            a81Var.getTextureView().setVisibility(4);
            if (a81Var.getTextureImageView() != null) {
                a81Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.mp.u1(this.f30223a).D3)) {
                imageView.setVisibility(8);
            }
        }
        if (this.A1.canDetectOrientation()) {
            this.A1.enable();
        } else {
            this.A1.disable();
            this.A1 = null;
        }
        S1 = this;
    }

    public static aj0 J0(gu guVar, boolean z10, float f10) {
        wi.n nVar;
        wi.h hVar;
        RectF rectF = new RectF();
        if (!z10 && (nVar = guVar.N1) != null && (hVar = nVar.f60118e) != null) {
            hVar.g(rectF);
        } else {
            wi.h.j(rectF, 1000, Math.round(1000.0f / f10));
        }
        ?? obj = new Object();
        obj.f33482a = rectF.left;
        obj.f33483b = rectF.top;
        obj.f33484c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public static void O0(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.fj fjVar, org.telegram.ui.oq0 oq0Var, String str, String str2, String str3, String str4, int i7, int i10, int i11, boolean z10) {
        String str5;
        TLRPC.MessageMedia messageMedia;
        gu guVar = S1;
        if (guVar != null) {
            guVar.L0();
        }
        if (fjVar != null && (messageMedia = fjVar.f24073k.media) != null && messageMedia.webpage != null) {
            str5 = a81.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.p1().J2(null, g2Var, null);
            PhotoViewer.p1().e2(fjVar, null, null, null, null, null, null, 0, oq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        gu guVar2 = new gu(g2Var.getParentActivity(), str, str2, str3, str4, i7, i10, i11);
        guVar2.f30244i0 = z10;
        guVar2.f30251n = z10;
        guVar2.show();
    }

    @Override
    public final boolean F() {
        a81 a81Var = this.n1;
        if (a81Var.getVisibility() == 0 && a81Var.U) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean H() {
        if (this.f35538p1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void K0() {
        wi.n nVar = this.N1;
        if (nVar != null) {
            this.N1 = null;
            nVar.a(new fi.e(12));
            nVar.f();
        }
    }

    @Override
    public final void L() {
        super.L();
        au auVar = this.A1;
        if (auVar != null) {
            auVar.disable();
            this.A1 = null;
        }
    }

    public final void L0() {
        cu cuVar = this.f35536m1;
        if (cuVar != null && cuVar.getVisibility() == 0) {
            this.f35545w1.removeView(cuVar);
            cuVar.stopLoading();
            cuVar.loadUrl("about:blank");
            cuVar.destroy();
        }
        wi.n nVar = this.N1;
        if (nVar != null) {
            this.N1 = null;
            nVar.b();
        }
        a81 a81Var = this.n1;
        if (a81Var != null) {
            a81Var.b();
        }
        S1 = null;
        L();
    }

    public final void M0() {
        int i7;
        ImageView imageView;
        if (this.f35536m1 != null && N0()) {
            if (this.O1 != this.f35536m1) {
                a81 a81Var = this.n1;
                if (a81Var.V && (imageView = a81Var.f33405e0) != null) {
                    imageView.callOnClick();
                    return;
                }
                return;
            }
            if (org.telegram.messenger.t0.f27021x) {
                try {
                    this.f35542t1.startService(new Intent(org.telegram.messenger.t0.f27013b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (this.f35547y1) {
                this.f35536m1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f35536m1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f35536m1);
            }
            bi.g3 g3Var = this.f35545w1;
            cu cuVar = this.f35536m1;
            if (this.E1) {
                i7 = 22;
            } else {
                i7 = 0;
            }
            g3Var.addView(cuVar, 0, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i7 + 84));
            this.f30238f0 = true;
            show();
            K0();
        }
    }

    public final boolean N0() {
        wi.n nVar = this.N1;
        if (nVar != null && nVar.e()) {
            return true;
        }
        return false;
    }

    public final void P0(View view, int i7, int i10) {
        wi.n c10 = l2.j.d().c();
        if (c10 != null) {
            c10.b();
        }
        this.O1 = view;
        this.P1 = i7;
        this.Q1 = i10;
        wi.n j3 = l2.j.d().j(this.R1);
        this.N1 = j3;
        j3.g(this.f35542t1, null, true);
    }

    public final void Q0() {
        a81 a81Var = this.n1;
        View aspectRatioView = a81Var.getAspectRatioView();
        int[] iArr = this.f35548z1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - T();
        if (!a81Var.f() && !this.J1) {
            TextureView textureView = a81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = a81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = a81Var.getControlsView();
        if (controlsView.getParent() == this.f30229c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void c0(Configuration configuration) {
        a81 a81Var = this.n1;
        if (a81Var.getVisibility() == 0 && a81Var.f33418x && !a81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = a81Var.U;
                if (!z10 && !z10) {
                    a81Var.U = true;
                    a81Var.m();
                    a81Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = a81Var.U;
            if (z11 && z11) {
                a81Var.U = false;
                a81Var.m();
                a81Var.l(false);
            }
        }
    }

    @Override
    public final void d0() {
        int i7 = this.K1;
        if (i7 != 0) {
            int i10 = i7 - 1;
            this.K1 = i10;
            if (i10 == 0) {
                a81 a81Var = this.n1;
                TextureView textureView = a81Var.d;
                ImageView imageView = a81Var.f33404e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.vr.c(width, height);
                        a81Var.h = c10;
                        a81Var.f33414n.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap = a81Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            a81Var.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (a81Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(a81Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                K0();
                return;
            }
            this.f30229c.invalidate();
        }
    }

    @Override
    public final void g0(float f10) {
        Q0();
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        if (view == this.n1.getControlsView()) {
            Q0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        int L;
        a81 a81Var = this.n1;
        if (view == a81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = a81Var.getMeasuredWidth();
            int measuredHeight = a81Var.getAspectRatioView().getMeasuredHeight();
            if (a81Var.U) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
