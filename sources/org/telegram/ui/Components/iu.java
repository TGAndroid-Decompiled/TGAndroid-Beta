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
public final class iu extends org.telegram.ui.ActionBar.w2 {
    public static iu S1;
    public cu A1;
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
    public final du M1;
    public wi.n N1;
    public View O1;
    public int P1;
    public int Q1;
    public final pf R1;
    public final eu f36270m1;
    public final z71 n1;
    public View f36271o1;
    public final FrameLayout f36272p1;
    public WebChromeClient.CustomViewCallback f36273q1;
    public final View f36274r1;
    public final RadialProgressView f36275s1;
    public final Activity f36276t1;
    public final LinearLayout f36277u1;
    public final TextView f36278v1;
    public final bi.g3 f36279w1;
    public final ImageView f36280x1;
    public boolean f36281y1;
    public final int[] f36282z1;

    public iu(Activity activity, String str, String str2, String str3, String str4, int i7, int i10, int i11) {
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
        this.f36282z1 = new int[2];
        this.G1 = -2;
        this.M1 = new du(this);
        this.R1 = new pf(this, 2);
        this.V = true;
        this.f30178v0 = false;
        this.f30180w0 = false;
        this.L1 = i11;
        if (com.google.android.gms.internal.vision.e2.s(activity)) {
            this.f36276t1 = activity;
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
            Point point = org.telegram.messenger.g0.f24010q;
            this.B1 = point.x;
            this.C1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f36272p1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new gi.a(18));
        this.f30145c.addView(frameLayout, c8.na.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bi.g3 g3Var = new bi.g3(18, activity, this);
        this.f36279w1 = g3Var;
        g3Var.setOnTouchListener(new gi.a(18));
        this.O = g3Var;
        eu euVar = new eu(this, activity, activity, 0);
        this.f36270m1 = euVar;
        euVar.getSettings().setJavaScriptEnabled(true);
        euVar.getSettings().setDomStorageEnabled(true);
        euVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        euVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(euVar, true);
        euVar.setWebChromeClient(new org.telegram.ui.m1(this, 1));
        euVar.setWebViewClient(new org.telegram.ui.n1(this, 1));
        if (z10) {
            i12 = 22;
        } else {
            i12 = 0;
        }
        g3Var.addView(euVar, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 + 84));
        z71 z71Var = new z71(activity, true, new fu(this));
        this.n1 = z71Var;
        z71Var.setVisibility(4);
        if (z10) {
            i13 = 22;
        } else {
            i13 = 0;
        }
        g3Var.addView(z71Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 + 74));
        View view = new View(activity);
        this.f36274r1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        if (z10) {
            i14 = 22;
        } else {
            i14 = 0;
        }
        g3Var.addView(view, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.f36275s1 = radialProgressView;
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
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29455j5, null);
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
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29566p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        g3Var.addView(textView2, c8.na.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.K5, view2, null);
        g3Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, frameLayout2, null);
        g3Var.addView(frameLayout2, c8.na.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, c8.na.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i18 = org.telegram.ui.ActionBar.m6.f29546o5;
        org.telegram.ui.ActionBar.t6.U(textView3, i18, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i19 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(textView3, h02, null, M, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.hd.N0(2131752029, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, c8.na.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final iu f33622b;

            {
                this.f33622b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f33622b.dismiss();
                        return;
                    case 1:
                        iu iuVar = this.f33622b;
                        eu euVar2 = iuVar.f36270m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new bu(0, view3), 300L);
                            return;
                        } else if (iuVar.f36275s1.getVisibility() != 0) {
                            iuVar.P0(euVar2, iuVar.B1, iuVar.C1);
                            if (iuVar.f36281y1) {
                                euVar2.evaluateJavascript("hideControls();", null);
                            }
                            iuVar.f30142b.setTranslationY(0.0f);
                            iuVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        iu iuVar2 = this.f33622b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iuVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = iuVar2.f36276t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new l2(22));
                        }
                        iuVar2.dismiss();
                        return;
                    default:
                        iu iuVar3 = this.f33622b;
                        vf.c.t(iuVar3.f36276t1, iuVar3.D1);
                        iuVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.f36277u1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, c8.na.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.f36280x1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754807, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i18, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i19);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(imageView, h03, null, M2, null);
        linearLayout2.addView(imageView, c8.na.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final iu f33622b;

            {
                this.f33622b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f33622b.dismiss();
                        return;
                    case 1:
                        iu iuVar = this.f33622b;
                        eu euVar2 = iuVar.f36270m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new bu(0, view3), 300L);
                            return;
                        } else if (iuVar.f36275s1.getVisibility() != 0) {
                            iuVar.P0(euVar2, iuVar.B1, iuVar.C1);
                            if (iuVar.f36281y1) {
                                euVar2.evaluateJavascript("hideControls();", null);
                            }
                            iuVar.f30142b.setTranslationY(0.0f);
                            iuVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        iu iuVar2 = this.f33622b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iuVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = iuVar2.f36276t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new l2(22));
                        }
                        iuVar2.dismiss();
                        return;
                    default:
                        iu iuVar3 = this.f33622b;
                        vf.c.t(iuVar3.f36276t1, iuVar3.D1);
                        iuVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final iu f33622b;

            {
                this.f33622b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f33622b.dismiss();
                        return;
                    case 1:
                        iu iuVar = this.f33622b;
                        eu euVar2 = iuVar.f36270m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new bu(0, view3), 300L);
                            return;
                        } else if (iuVar.f36275s1.getVisibility() != 0) {
                            iuVar.P0(euVar2, iuVar.B1, iuVar.C1);
                            if (iuVar.f36281y1) {
                                euVar2.evaluateJavascript("hideControls();", null);
                            }
                            iuVar.f30142b.setTranslationY(0.0f);
                            iuVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        iu iuVar2 = this.f33622b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iuVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = iuVar2.f36276t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new l2(22));
                        }
                        iuVar2.dismiss();
                        return;
                    default:
                        iu iuVar3 = this.f33622b;
                        vf.c.t(iuVar3.f36276t1, iuVar3.D1);
                        iuVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232105);
        imageView2.setContentDescription(org.telegram.messenger.hd.N0(2131751750, null));
        org.telegram.ui.ActionBar.t6.s(imageView2, i18, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i19);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.t6.j(imageView2, h04, null, M3, null);
        linearLayout2.addView(imageView2, c8.na.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.f36278v1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView4, i18, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i19);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(textView4, h05, null, M4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.hd.N0(2131751755, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, c8.na.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView5, i18, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i19);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(textView5, h06, null, M5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.hd.N0(2131747604, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, c8.na.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final iu f33622b;

            {
                this.f33622b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f33622b.dismiss();
                        return;
                    case 1:
                        iu iuVar = this.f33622b;
                        eu euVar2 = iuVar.f36270m1;
                        wi.n c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.h3(new bu(0, view3), 300L);
                            return;
                        } else if (iuVar.f36275s1.getVisibility() != 0) {
                            iuVar.P0(euVar2, iuVar.B1, iuVar.C1);
                            if (iuVar.f36281y1) {
                                euVar2.evaluateJavascript("hideControls();", null);
                            }
                            iuVar.f30142b.setTranslationY(0.0f);
                            iuVar.L();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        iu iuVar2 = this.f33622b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iuVar2.D1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = iuVar2.f36276t1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new l2(22));
                        }
                        iuVar2.dismiss();
                        return;
                    default:
                        iu iuVar3 = this.f33622b;
                        vf.c.t(iuVar3.f36276t1, iuVar3.D1);
                        iuVar3.dismiss();
                        return;
                }
            }
        });
        if (!z71.a(str4) && !z71.a(str3)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i16 = 0;
        } else {
            i16 = 4;
        }
        z71Var.setVisibility(i16);
        if (z11) {
            v71 v71Var = z71Var.f42678g0;
            v71Var.setVisibility(4);
            i17 = 0;
            v71Var.d(false, false);
            z71Var.j(true, false);
        } else {
            i17 = 0;
        }
        this.f30185z0 = new gu(this, z11);
        this.A1 = new cu(i17, org.telegram.messenger.t0.f26895b, this);
        String e10 = z71.e(str4);
        if (e10 != null || !z11) {
            radialProgressView.setVisibility(i17);
            euVar.setVisibility(i17);
            linearLayout2.setVisibility(i17);
            if (e10 != null) {
                view.setVisibility(i17);
            }
            textView4.setVisibility(4);
            euVar.setKeepScreenOn(true);
            z71Var.setVisibility(4);
            z71Var.getControlsView().setVisibility(4);
            z71Var.getTextureView().setVisibility(4);
            if (z71Var.getTextureImageView() != null) {
                z71Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.np.u1(this.f30139a).D3)) {
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

    public static aj0 J0(iu iuVar, boolean z10, float f10) {
        wi.n nVar;
        wi.h hVar;
        RectF rectF = new RectF();
        if (!z10 && (nVar = iuVar.N1) != null && (hVar = nVar.f60000e) != null) {
            hVar.g(rectF);
        } else {
            wi.h.j(rectF, 1000, Math.round(1000.0f / f10));
        }
        ?? obj = new Object();
        obj.f33496a = rectF.left;
        obj.f33497b = rectF.top;
        obj.f33498c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public static void O0(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.gj gjVar, org.telegram.ui.pq0 pq0Var, String str, String str2, String str3, String str4, int i7, int i10, int i11, boolean z10) {
        String str5;
        TLRPC.MessageMedia messageMedia;
        iu iuVar = S1;
        if (iuVar != null) {
            iuVar.L0();
        }
        if (gjVar != null && (messageMedia = gjVar.f24177k.media) != null && messageMedia.webpage != null) {
            str5 = z71.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.p1().I2(null, g2Var, null);
            PhotoViewer.p1().d2(gjVar, null, null, null, null, null, null, 0, pq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        iu iuVar2 = new iu(g2Var.getParentActivity(), str, str2, str3, str4, i7, i10, i11);
        iuVar2.f30160i0 = z10;
        iuVar2.f30167n = z10;
        iuVar2.show();
    }

    @Override
    public final boolean G() {
        z71 z71Var = this.n1;
        if (z71Var.getVisibility() == 0 && z71Var.U) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean I() {
        if (this.f36272p1.getVisibility() != 0) {
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
        cu cuVar = this.A1;
        if (cuVar != null) {
            cuVar.disable();
            this.A1 = null;
        }
    }

    public final void L0() {
        eu euVar = this.f36270m1;
        if (euVar != null && euVar.getVisibility() == 0) {
            this.f36279w1.removeView(euVar);
            euVar.stopLoading();
            euVar.loadUrl("about:blank");
            euVar.destroy();
        }
        wi.n nVar = this.N1;
        if (nVar != null) {
            this.N1 = null;
            nVar.b();
        }
        z71 z71Var = this.n1;
        if (z71Var != null) {
            z71Var.b();
        }
        S1 = null;
        L();
    }

    public final void M0() {
        int i7;
        ImageView imageView;
        if (this.f36270m1 != null && N0()) {
            if (this.O1 != this.f36270m1) {
                z71 z71Var = this.n1;
                if (z71Var.V && (imageView = z71Var.f42675e0) != null) {
                    imageView.callOnClick();
                    return;
                }
                return;
            }
            if (org.telegram.messenger.t0.f26903x) {
                try {
                    this.f36276t1.startService(new Intent(org.telegram.messenger.t0.f26895b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (this.f36281y1) {
                this.f36270m1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f36270m1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f36270m1);
            }
            bi.g3 g3Var = this.f36279w1;
            eu euVar = this.f36270m1;
            if (this.E1) {
                i7 = 22;
            } else {
                i7 = 0;
            }
            g3Var.addView(euVar, 0, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i7 + 84));
            this.f30154f0 = true;
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
        wi.n c10 = l2.i.d().c();
        if (c10 != null) {
            c10.b();
        }
        this.O1 = view;
        this.P1 = i7;
        this.Q1 = i10;
        wi.n k10 = l2.i.d().k(this.R1);
        this.N1 = k10;
        k10.g(this.f36276t1, null, true);
    }

    public final void Q0() {
        z71 z71Var = this.n1;
        View aspectRatioView = z71Var.getAspectRatioView();
        int[] iArr = this.f36282z1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - T();
        if (!z71Var.f() && !this.J1) {
            TextureView textureView = z71Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = z71Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = z71Var.getControlsView();
        if (controlsView.getParent() == this.f30145c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void c0(Configuration configuration) {
        z71 z71Var = this.n1;
        if (z71Var.getVisibility() == 0 && z71Var.f42688x && !z71Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = z71Var.U;
                if (!z10 && !z10) {
                    z71Var.U = true;
                    z71Var.m();
                    z71Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = z71Var.U;
            if (z11 && z11) {
                z71Var.U = false;
                z71Var.m();
                z71Var.l(false);
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
                z71 z71Var = this.n1;
                TextureView textureView = z71Var.d;
                ImageView imageView = z71Var.f42674e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.wr.c(width, height);
                        z71Var.h = c10;
                        z71Var.f42684n.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap = z71Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            z71Var.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (z71Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(z71Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                K0();
                return;
            }
            this.f30145c.invalidate();
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
        z71 z71Var = this.n1;
        if (view == z71Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = z71Var.getMeasuredWidth();
            int measuredHeight = z71Var.getAspectRatioView().getMeasuredHeight();
            if (z71Var.U) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
