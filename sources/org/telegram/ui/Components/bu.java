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
public final class bu extends org.telegram.ui.ActionBar.u2 {
    public static bu S1;
    public vt A1;
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
    public final wt M1;
    public wi.n N1;
    public View O1;
    public int P1;
    public int Q1;
    public final ff R1;
    public final xt f33376m1;
    public final m71 n1;
    public View f33377o1;
    public final FrameLayout f33378p1;
    public WebChromeClient.CustomViewCallback f33379q1;
    public final View f33380r1;
    public final RadialProgressView f33381s1;
    public final Activity f33382t1;
    public final LinearLayout f33383u1;
    public final TextView f33384v1;
    public final bi.g2 f33385w1;
    public final ImageView f33386x1;
    public boolean f33387y1;
    public final int[] f33388z1;

    public bu(Activity activity, String str, String str2, String str3, String str4, int i7, int i10, int i11) {
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
        this.f33388z1 = new int[2];
        this.G1 = -2;
        this.M1 = new wt(this);
        this.R1 = new ff(this, 2);
        this.V = true;
        this.f29718v0 = false;
        this.f29720w0 = false;
        this.L1 = i11;
        if (com.google.android.gms.internal.vision.e2.s(activity)) {
            this.f33382t1 = activity;
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
            Point point = org.telegram.messenger.g0.f23609q;
            this.B1 = point.x;
            this.C1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f33378p1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new gi.a(18));
        this.f29685c.addView(frameLayout, c8.ja.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bi.g2 g2Var = new bi.g2(18, activity, this);
        this.f33385w1 = g2Var;
        g2Var.setOnTouchListener(new gi.a(18));
        this.O = g2Var;
        xt xtVar = new xt(this, activity, activity, 0);
        this.f33376m1 = xtVar;
        xtVar.getSettings().setJavaScriptEnabled(true);
        xtVar.getSettings().setDomStorageEnabled(true);
        xtVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        xtVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(xtVar, true);
        xtVar.setWebChromeClient(new org.telegram.ui.m1(this, 1));
        xtVar.setWebViewClient(new org.telegram.ui.n1(this, 1));
        if (z10) {
            i12 = 22;
        } else {
            i12 = 0;
        }
        g2Var.addView(xtVar, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 + 84));
        m71 m71Var = new m71(activity, true, new yt(this));
        this.n1 = m71Var;
        m71Var.setVisibility(4);
        if (z10) {
            i13 = 22;
        } else {
            i13 = 0;
        }
        g2Var.addView(m71Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 + 74));
        View view = new View(activity);
        this.f33380r1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        if (z10) {
            i14 = 22;
        } else {
            i14 = 0;
        }
        g2Var.addView(view, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.f33381s1 = radialProgressView;
        radialProgressView.setVisibility(4);
        if (z10) {
            i15 = 22;
        } else {
            i15 = 0;
        }
        g2Var.addView(radialProgressView, c8.ja.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, (i15 + 84) / 2));
        if (z10) {
            TextView textView = new TextView(activity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            g2Var.addView(textView, c8.ja.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29068p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        g2Var.addView(textView2, c8.ja.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.K5, view2, null);
        g2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, frameLayout2, null);
        g2Var.addView(frameLayout2, c8.ja.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, c8.ja.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i18 = org.telegram.ui.ActionBar.j6.f29048o5;
        org.telegram.ui.ActionBar.q6.U(textView3, i18, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i19 = org.telegram.ui.ActionBar.j6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i19);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(textView3, h02, null, M, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.hd.M0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, c8.ja.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final bu f39806b;

            {
                this.f39806b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f39806b.dismiss();
                        return;
                    case 1:
                        bu buVar = this.f39806b;
                        xt xtVar2 = buVar.f33376m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ut(0, view3), 300L);
                            return;
                        } else if (buVar.f33381s1.getVisibility() != 0) {
                            buVar.O0(xtVar2, buVar.B1, buVar.C1);
                            if (buVar.f33387y1) {
                                xtVar2.evaluateJavascript("hideControls();", null);
                            }
                            buVar.f29682b.setTranslationY(0.0f);
                            buVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        bu buVar2 = this.f39806b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", buVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = buVar2.f33382t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new e2(21));
                        }
                        buVar2.dismiss();
                        return;
                    default:
                        bu buVar3 = this.f39806b;
                        vf.c.t(buVar3.f33382t1, buVar3.D1);
                        buVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.f33383u1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, c8.ja.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.f33386x1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i18, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i19);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(imageView, h03, null, M2, null);
        linearLayout2.addView(imageView, c8.ja.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final bu f39806b;

            {
                this.f39806b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f39806b.dismiss();
                        return;
                    case 1:
                        bu buVar = this.f39806b;
                        xt xtVar2 = buVar.f33376m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ut(0, view3), 300L);
                            return;
                        } else if (buVar.f33381s1.getVisibility() != 0) {
                            buVar.O0(xtVar2, buVar.B1, buVar.C1);
                            if (buVar.f33387y1) {
                                xtVar2.evaluateJavascript("hideControls();", null);
                            }
                            buVar.f29682b.setTranslationY(0.0f);
                            buVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        bu buVar2 = this.f39806b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", buVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = buVar2.f33382t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new e2(21));
                        }
                        buVar2.dismiss();
                        return;
                    default:
                        bu buVar3 = this.f39806b;
                        vf.c.t(buVar3.f33382t1, buVar3.D1);
                        buVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final bu f39806b;

            {
                this.f39806b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f39806b.dismiss();
                        return;
                    case 1:
                        bu buVar = this.f39806b;
                        xt xtVar2 = buVar.f33376m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ut(0, view3), 300L);
                            return;
                        } else if (buVar.f33381s1.getVisibility() != 0) {
                            buVar.O0(xtVar2, buVar.B1, buVar.C1);
                            if (buVar.f33387y1) {
                                xtVar2.evaluateJavascript("hideControls();", null);
                            }
                            buVar.f29682b.setTranslationY(0.0f);
                            buVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        bu buVar2 = this.f39806b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", buVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = buVar2.f33382t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new e2(21));
                        }
                        buVar2.dismiss();
                        return;
                    default:
                        bu buVar3 = this.f39806b;
                        vf.c.t(buVar3.f33382t1, buVar3.D1);
                        buVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232104);
        imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131751762, null));
        org.telegram.ui.ActionBar.q6.s(imageView2, i18, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i19);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.q6.j(imageView2, h04, null, M3, null);
        linearLayout2.addView(imageView2, c8.ja.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.f33384v1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView4, i18, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i19);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(textView4, h05, null, M4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.hd.M0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, c8.ja.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView5, i18, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i19);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(textView5, h06, null, M5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.hd.M0(2131747798, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, c8.ja.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final bu f39806b;

            {
                this.f39806b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f39806b.dismiss();
                        return;
                    case 1:
                        bu buVar = this.f39806b;
                        xt xtVar2 = buVar.f33376m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ut(0, view3), 300L);
                            return;
                        } else if (buVar.f33381s1.getVisibility() != 0) {
                            buVar.O0(xtVar2, buVar.B1, buVar.C1);
                            if (buVar.f33387y1) {
                                xtVar2.evaluateJavascript("hideControls();", null);
                            }
                            buVar.f29682b.setTranslationY(0.0f);
                            buVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        bu buVar2 = this.f39806b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", buVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = buVar2.f33382t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new e2(21));
                        }
                        buVar2.dismiss();
                        return;
                    default:
                        bu buVar3 = this.f39806b;
                        vf.c.t(buVar3.f33382t1, buVar3.D1);
                        buVar3.dismiss();
                        return;
                }
            }
        });
        if (!m71.a(str4) && !m71.a(str3)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i16 = 0;
        } else {
            i16 = 4;
        }
        m71Var.setVisibility(i16);
        if (z11) {
            i71 i71Var = m71Var.f37149g0;
            i71Var.setVisibility(4);
            i17 = 0;
            i71Var.d(false, false);
            m71Var.j(true, false);
        } else {
            i17 = 0;
        }
        this.f29725z0 = new zt(this, z11);
        this.A1 = new vt(i17, org.telegram.messenger.t0.f26600b, this);
        String e10 = m71.e(str4);
        if (e10 != null || !z11) {
            radialProgressView.setVisibility(i17);
            xtVar.setVisibility(i17);
            linearLayout2.setVisibility(i17);
            if (e10 != null) {
                view.setVisibility(i17);
            }
            textView4.setVisibility(4);
            xtVar.setKeepScreenOn(true);
            m71Var.setVisibility(4);
            m71Var.getControlsView().setVisibility(4);
            m71Var.getTextureView().setVisibility(4);
            if (m71Var.getTextureImageView() != null) {
                m71Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.np.s1(this.f29679a).B3)) {
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

    public static pi0 I0(bu buVar, boolean z10, float f10) {
        wi.n nVar;
        wi.h hVar;
        RectF rectF = new RectF();
        if (!z10 && (nVar = buVar.N1) != null && (hVar = nVar.f59425e) != null) {
            hVar.g(rectF);
        } else {
            wi.h.j(rectF, 1000, Math.round(1000.0f / f10));
        }
        ?? obj = new Object();
        obj.f38312a = rectF.left;
        obj.f38313b = rectF.top;
        obj.f38314c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public static void N0(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.gj gjVar, org.telegram.ui.mq0 mq0Var, String str, String str2, String str3, String str4, int i7, int i10, int i11, boolean z10) {
        String str5;
        TLRPC.MessageMedia messageMedia;
        bu buVar = S1;
        if (buVar != null) {
            buVar.K0();
        }
        if (gjVar != null && (messageMedia = gjVar.f23817k.media) != null && messageMedia.webpage != null) {
            str5 = m71.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.p1().I2(null, e2Var, null);
            PhotoViewer.p1().d2(gjVar, null, null, null, null, null, null, 0, mq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        bu buVar2 = new bu(e2Var.getParentActivity(), str, str2, str3, str4, i7, i10, i11);
        buVar2.f29700i0 = z10;
        buVar2.f29707n = z10;
        buVar2.show();
    }

    @Override
    public final boolean H() {
        m71 m71Var = this.n1;
        if (m71Var.getVisibility() == 0 && m71Var.U) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean I() {
        if (this.f33378p1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void J0() {
        wi.n nVar = this.N1;
        if (nVar != null) {
            this.N1 = null;
            nVar.a(new fi.e(12));
            nVar.f();
        }
    }

    public final void K0() {
        xt xtVar = this.f33376m1;
        if (xtVar != null && xtVar.getVisibility() == 0) {
            this.f33385w1.removeView(xtVar);
            xtVar.stopLoading();
            xtVar.loadUrl("about:blank");
            xtVar.destroy();
        }
        wi.n nVar = this.N1;
        if (nVar != null) {
            this.N1 = null;
            nVar.b();
        }
        m71 m71Var = this.n1;
        if (m71Var != null) {
            m71Var.b();
        }
        S1 = null;
        L();
    }

    @Override
    public final void L() {
        super.L();
        vt vtVar = this.A1;
        if (vtVar != null) {
            vtVar.disable();
            this.A1 = null;
        }
    }

    public final void L0() {
        int i7;
        ImageView imageView;
        if (this.f33376m1 != null && M0()) {
            if (this.O1 != this.f33376m1) {
                m71 m71Var = this.n1;
                if (m71Var.V && (imageView = m71Var.f37146e0) != null) {
                    imageView.callOnClick();
                    return;
                }
                return;
            }
            if (org.telegram.messenger.t0.f26608x) {
                try {
                    this.f33382t1.startService(new Intent(org.telegram.messenger.t0.f26600b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (this.f33387y1) {
                this.f33376m1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f33376m1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f33376m1);
            }
            bi.g2 g2Var = this.f33385w1;
            xt xtVar = this.f33376m1;
            if (this.E1) {
                i7 = 22;
            } else {
                i7 = 0;
            }
            g2Var.addView(xtVar, 0, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i7 + 84));
            this.f29694f0 = true;
            show();
            J0();
        }
    }

    public final boolean M0() {
        wi.n nVar = this.N1;
        if (nVar != null && nVar.e()) {
            return true;
        }
        return false;
    }

    public final void O0(View view, int i7, int i10) {
        wi.n c10 = l2.i.d().c();
        if (c10 != null) {
            c10.b();
        }
        this.O1 = view;
        this.P1 = i7;
        this.Q1 = i10;
        wi.n k10 = l2.i.d().k(this.R1);
        this.N1 = k10;
        k10.g(this.f33382t1, null, true);
    }

    public final void P0() {
        m71 m71Var = this.n1;
        View aspectRatioView = m71Var.getAspectRatioView();
        int[] iArr = this.f33388z1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - T();
        if (!m71Var.f() && !this.J1) {
            TextureView textureView = m71Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = m71Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = m71Var.getControlsView();
        if (controlsView.getParent() == this.f29685c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void c0(Configuration configuration) {
        m71 m71Var = this.n1;
        if (m71Var.getVisibility() == 0 && m71Var.f37159x && !m71Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = m71Var.U;
                if (!z10 && !z10) {
                    m71Var.U = true;
                    m71Var.m();
                    m71Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = m71Var.U;
            if (z11 && z11) {
                m71Var.U = false;
                m71Var.m();
                m71Var.l(false);
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
                m71 m71Var = this.n1;
                TextureView textureView = m71Var.d;
                ImageView imageView = m71Var.f37145e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.xr.c(width, height);
                        m71Var.h = c10;
                        m71Var.f37155n.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap = m71Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            m71Var.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (m71Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(m71Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                J0();
                return;
            }
            this.f29685c.invalidate();
        }
    }

    @Override
    public final void g0(float f10) {
        P0();
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        if (view == this.n1.getControlsView()) {
            P0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        int L;
        m71 m71Var = this.n1;
        if (view == m71Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = m71Var.getMeasuredWidth();
            int measuredHeight = m71Var.getAspectRatioView().getMeasuredHeight();
            if (m71Var.U) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
