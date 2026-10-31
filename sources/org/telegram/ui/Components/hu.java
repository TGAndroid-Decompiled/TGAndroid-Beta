package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.provider.Settings;
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
public final class hu extends org.telegram.ui.ActionBar.z2 {
    public static hu J1;
    public boolean A1;
    public String B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public int H1;
    public bu I1;
    public cu f26811i1;
    public m81 f26812j1;
    public View f26813k1;
    public FrameLayout l1;
    public WebChromeClient.CustomViewCallback f26814m1;
    public View f26815n1;
    public RadialProgressView f26816o1;
    public Activity f26817p1;
    public LinearLayout f26818q1;
    public TextView f26819r1;
    public jg.l0 f26820s1;
    public ImageView f26821t1;
    public boolean f26822u1;
    public int[] f26823v1;
    public fu f26824w1;
    public int f26825x1;
    public int f26826y1;
    public String f26827z1;

    public static void K0(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.jj jjVar, org.telegram.ui.yr0 yr0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        String str5;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        boolean z12;
        int i17;
        int i18;
        TLRPC.MessageMedia messageMedia;
        hu huVar = J1;
        if (huVar != null) {
            huVar.I0();
        }
        if (jjVar != null && (messageMedia = jjVar.f16337k.media) != null && messageMedia.webpage != null) {
            str5 = m81.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.v1().N2(null, k2Var, null);
            PhotoViewer.v1().h2(jjVar, null, null, null, null, null, null, 0, yr0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        final ?? z2Var = new org.telegram.ui.ActionBar.z2(parentActivity, false);
        z2Var.f26823v1 = new int[2];
        z2Var.C1 = -2;
        z2Var.I1 = new bu(z2Var);
        z2Var.U = true;
        z2Var.f21616u0 = false;
        z2Var.f21617v0 = false;
        z2Var.H1 = i12;
        if (parentActivity != null) {
            z2Var.f26817p1 = parentActivity;
        }
        z2Var.B1 = str4;
        if (str2 != null && str2.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        z2Var.A1 = z11;
        z2Var.f26827z1 = str3;
        z2Var.f26825x1 = i10;
        z2Var.f26826y1 = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = org.telegram.messenger.i0.f16026q;
            z2Var.f26825x1 = point.x;
            z2Var.f26826y1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        z2Var.l1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new org.telegram.ui.ActionBar.n2(16));
        z2Var.f21589c.addView(frameLayout, w7.b6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        jg.l0 l0Var = new jg.l0(z2Var, parentActivity, 16);
        z2Var.f26820s1 = l0Var;
        l0Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(16));
        z2Var.N = l0Var;
        cu cuVar = new cu(z2Var, parentActivity, parentActivity, 0);
        z2Var.f26811i1 = cuVar;
        cuVar.getSettings().setJavaScriptEnabled(true);
        cuVar.getSettings().setDomStorageEnabled(true);
        cuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        cuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(cuVar, true);
        cuVar.setWebChromeClient(new org.telegram.ui.o1(z2Var, 1));
        cuVar.setWebViewClient(new ji.i(z2Var, 2));
        if (z11) {
            i13 = 22;
        } else {
            i13 = 0;
        }
        l0Var.addView(cuVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 + 84));
        m81 m81Var = new m81(parentActivity, true, new du(z2Var));
        z2Var.f26812j1 = m81Var;
        m81Var.setVisibility(4);
        if (z11) {
            i14 = 22;
        } else {
            i14 = 0;
        }
        l0Var.addView(m81Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 + 74));
        View view = new View(parentActivity);
        z2Var.f26815n1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        if (z11) {
            i15 = 22;
        } else {
            i15 = 0;
        }
        l0Var.addView(view, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i15 + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        z2Var.f26816o1 = radialProgressView;
        radialProgressView.setVisibility(4);
        if (z11) {
            i16 = 22;
        } else {
            i16 = 0;
        }
        l0Var.addView(radialProgressView, w7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, (i16 + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            l0Var.addView(textView, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        l0Var.addView(textView2, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.K5, view2, null);
        l0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, frameLayout2, null);
        l0Var.addView(frameLayout2, w7.b6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.b6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i19 = org.telegram.ui.ActionBar.t6.f21133o5;
        org.telegram.ui.ActionBar.a7.V(textView3, i19, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i20 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i20);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(textView3, h02, null, N, null);
        textView3.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        textView3.setText(org.telegram.messenger.cd.L0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.i0.o());
        frameLayout2.addView(textView3, w7.b6.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(z2Var) {
            public final hu f32787b;

            {
                this.f32787b = z2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f32787b.dismiss();
                        return;
                    case 1:
                        hu huVar2 = this.f32787b;
                        jf0 jf0Var = jf0.f27345p0;
                        if (jf0Var.P) {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            return;
                        }
                        if (huVar2.f26822u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar2.f21583a).A3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = huVar2.f26817p1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    s4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (huVar2.f26816o1.getVisibility() != 0) {
                            if (jf0.x(z13, huVar2.f26817p1, null, huVar2.f26811i1, huVar2.f26825x1, huVar2.f26826y1, false)) {
                                jf0Var.U = huVar2;
                            }
                            if (huVar2.f26822u1) {
                                huVar2.f26811i1.evaluateJavascript("hideControls();", null);
                            }
                            huVar2.f21586b.setTranslationY(0.0f);
                            huVar2.L();
                            return;
                        }
                        return;
                    case 2:
                        hu huVar3 = this.f32787b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar3.f26827z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar3.f26817p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar3.dismiss();
                        return;
                    default:
                        hu huVar4 = this.f32787b;
                        gf.f.r(huVar4.f26817p1, huVar4.f26827z1);
                        huVar4.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        z2Var.f26818q1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.b6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        z2Var.f26821t1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231275);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i19, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i20);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(imageView, h03, null, N2, null);
        linearLayout2.addView(imageView, w7.b6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(z2Var) {
            public final hu f32787b;

            {
                this.f32787b = z2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f32787b.dismiss();
                        return;
                    case 1:
                        hu huVar2 = this.f32787b;
                        jf0 jf0Var = jf0.f27345p0;
                        if (jf0Var.P) {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            return;
                        }
                        if (huVar2.f26822u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar2.f21583a).A3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = huVar2.f26817p1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    s4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (huVar2.f26816o1.getVisibility() != 0) {
                            if (jf0.x(z13, huVar2.f26817p1, null, huVar2.f26811i1, huVar2.f26825x1, huVar2.f26826y1, false)) {
                                jf0Var.U = huVar2;
                            }
                            if (huVar2.f26822u1) {
                                huVar2.f26811i1.evaluateJavascript("hideControls();", null);
                            }
                            huVar2.f21586b.setTranslationY(0.0f);
                            huVar2.L();
                            return;
                        }
                        return;
                    case 2:
                        hu huVar3 = this.f32787b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar3.f26827z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar3.f26817p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar3.dismiss();
                        return;
                    default:
                        hu huVar4 = this.f32787b;
                        gf.f.r(huVar4.f26817p1, huVar4.f26827z1);
                        huVar4.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(z2Var) {
            public final hu f32787b;

            {
                this.f32787b = z2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f32787b.dismiss();
                        return;
                    case 1:
                        hu huVar2 = this.f32787b;
                        jf0 jf0Var = jf0.f27345p0;
                        if (jf0Var.P) {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            return;
                        }
                        if (huVar2.f26822u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar2.f21583a).A3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = huVar2.f26817p1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    s4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (huVar2.f26816o1.getVisibility() != 0) {
                            if (jf0.x(z13, huVar2.f26817p1, null, huVar2.f26811i1, huVar2.f26825x1, huVar2.f26826y1, false)) {
                                jf0Var.U = huVar2;
                            }
                            if (huVar2.f26822u1) {
                                huVar2.f26811i1.evaluateJavascript("hideControls();", null);
                            }
                            huVar2.f21586b.setTranslationY(0.0f);
                            huVar2.L();
                            return;
                        }
                        return;
                    case 2:
                        hu huVar3 = this.f32787b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar3.f26827z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar3.f26817p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar3.dismiss();
                        return;
                    default:
                        hu huVar4 = this.f32787b;
                        gf.f.r(huVar4.f26817p1, huVar4.f26827z1);
                        huVar4.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232102);
        imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131751762, null));
        org.telegram.ui.ActionBar.a7.t(imageView2, i19, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i20);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.a7.k(imageView2, h04, null, N3, null);
        linearLayout2.addView(imageView2, w7.b6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        z2Var.f26819r1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView4, i19, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i20);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(textView4, h05, null, N4, null);
        textView4.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        textView4.setText(org.telegram.messenger.cd.L0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(textView4, w7.b6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView5, i19, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i20);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(textView5, h06, null, N5, null);
        textView5.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        textView5.setText(org.telegram.messenger.cd.L0(2131747814, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(textView5, w7.b6.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(z2Var) {
            public final hu f32787b;

            {
                this.f32787b = z2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f32787b.dismiss();
                        return;
                    case 1:
                        hu huVar2 = this.f32787b;
                        jf0 jf0Var = jf0.f27345p0;
                        if (jf0Var.P) {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            return;
                        }
                        if (huVar2.f26822u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar2.f21583a).A3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = huVar2.f26817p1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    s4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (huVar2.f26816o1.getVisibility() != 0) {
                            if (jf0.x(z13, huVar2.f26817p1, null, huVar2.f26811i1, huVar2.f26825x1, huVar2.f26826y1, false)) {
                                jf0Var.U = huVar2;
                            }
                            if (huVar2.f26822u1) {
                                huVar2.f26811i1.evaluateJavascript("hideControls();", null);
                            }
                            huVar2.f21586b.setTranslationY(0.0f);
                            huVar2.L();
                            return;
                        }
                        return;
                    case 2:
                        hu huVar3 = this.f32787b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar3.f26827z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar3.f26817p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar3.dismiss();
                        return;
                    default:
                        hu huVar4 = this.f32787b;
                        gf.f.r(huVar4.f26817p1, huVar4.f26827z1);
                        huVar4.dismiss();
                        return;
                }
            }
        });
        if (!m81.a(str4) && !m81.a(str3)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            i17 = 0;
        } else {
            i17 = 4;
        }
        m81Var.setVisibility(i17);
        if (z12) {
            i81 i81Var = m81Var.f28368f0;
            i81Var.setVisibility(4);
            i18 = 0;
            i81Var.d(false, false);
            m81Var.j(true, false);
        } else {
            i18 = 0;
        }
        z2Var.f21623y0 = new eu(z2Var, z12);
        z2Var.f26824w1 = new fu(z2Var, org.telegram.messenger.w0.f19025b, i18);
        String e = m81.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(i18);
            cuVar.setVisibility(i18);
            linearLayout2.setVisibility(i18);
            if (e != null) {
                view.setVisibility(i18);
            }
            textView4.setVisibility(4);
            cuVar.setKeepScreenOn(true);
            m81Var.setVisibility(4);
            m81Var.getControlsView().setVisibility(4);
            m81Var.getTextureView().setVisibility(4);
            if (m81Var.getTextureImageView() != null) {
                m81Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(org.telegram.messenger.vp.r1(z2Var.f21583a).A3)) {
                imageView.setVisibility(8);
            }
        }
        if (z2Var.f26824w1.canDetectOrientation()) {
            z2Var.f26824w1.enable();
        } else {
            z2Var.f26824w1.disable();
            z2Var.f26824w1 = null;
        }
        J1 = z2Var;
        z2Var.f21601h0 = z10;
        z2Var.f21606n = z10;
        z2Var.show();
    }

    @Override
    public final boolean H() {
        m81 m81Var = this.f26812j1;
        if (m81Var.getVisibility() == 0 && m81Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean I() {
        if (this.l1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void I0() {
        cu cuVar = this.f26811i1;
        if (cuVar != null && cuVar.getVisibility() == 0) {
            this.f26820s1.removeView(cuVar);
            cuVar.stopLoading();
            cuVar.loadUrl("about:blank");
            cuVar.destroy();
        }
        jf0.b(false);
        m81 m81Var = this.f26812j1;
        if (m81Var != null) {
            m81Var.b();
        }
        J1 = null;
        L();
    }

    public final void J0() {
        int i10;
        if (this.f26811i1 != null && jf0.f27345p0.P) {
            if (org.telegram.messenger.w0.f19032x) {
                try {
                    this.f26817p1.startService(new Intent(org.telegram.messenger.w0.f19025b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
            }
            if (this.f26822u1) {
                this.f26811i1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f26811i1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f26811i1);
            }
            jg.l0 l0Var = this.f26820s1;
            cu cuVar = this.f26811i1;
            if (this.A1) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            l0Var.addView(cuVar, 0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            this.f21594e0 = true;
            show();
            jf0.b(true);
        }
    }

    @Override
    public final void L() {
        super.L();
        fu fuVar = this.f26824w1;
        if (fuVar != null) {
            fuVar.disable();
            this.f26824w1 = null;
        }
    }

    public final void L0() {
        m81 m81Var = this.f26812j1;
        View aspectRatioView = m81Var.getAspectRatioView();
        int[] iArr = this.f26823v1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - T();
        if (!m81Var.f() && !this.F1) {
            TextureView textureView = m81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = m81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = m81Var.getControlsView();
        if (controlsView.getParent() == this.f21589c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void c0(Configuration configuration) {
        m81 m81Var = this.f26812j1;
        if (m81Var.getVisibility() == 0 && m81Var.f28378x && !m81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = m81Var.T;
                if (!z10 && !z10) {
                    m81Var.T = true;
                    m81Var.m();
                    m81Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = m81Var.T;
            if (z11 && z11) {
                m81Var.T = false;
                m81Var.m();
                m81Var.l(false);
            }
        }
    }

    @Override
    public final void d0() {
        int i10 = this.G1;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.G1 = i11;
            if (i11 == 0) {
                m81 m81Var = this.f26812j1;
                TextureView textureView = m81Var.d;
                ImageView imageView = m81Var.e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap b10 = org.telegram.messenger.js.b(width, height);
                        m81Var.h = b10;
                        m81Var.f28374n.getBitmap(b10);
                    } catch (Throwable th2) {
                        Bitmap bitmap = m81Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            m81Var.h = null;
                        }
                        org.telegram.messenger.f8.g(th2, true);
                    }
                    if (m81Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(m81Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                jf0.b(false);
                return;
            }
            this.f21589c.invalidate();
        }
    }

    @Override
    public final void g0(float f7) {
        L0();
    }

    @Override
    public final boolean k0(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f26812j1.getControlsView()) {
            L0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(View view, int i10, int i11) {
        int L;
        m81 m81Var = this.f26812j1;
        if (view == m81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = m81Var.getMeasuredWidth();
            int measuredHeight = m81Var.getAspectRatioView().getMeasuredHeight();
            if (m81Var.T) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
