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
public final class ut extends org.telegram.ui.ActionBar.t2 {
    public static ut K1;
    public String A1;
    public boolean B1;
    public String C1;
    public int D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public int I1;
    public ot J1;
    public pt f38862j1;
    public d71 k1;
    public View f38863l1;
    public FrameLayout m1;
    public WebChromeClient.CustomViewCallback f38864n1;
    public View f38865o1;
    public RadialProgressView f38866p1;
    public Activity f38867q1;
    public LinearLayout f38868r1;
    public TextView f38869s1;
    public ai.o2 f38870t1;
    public ImageView f38871u1;
    public boolean f38872v1;
    public int[] f38873w1;
    public st f38874x1;
    public int f38875y1;
    public int f38876z1;

    public static void K0(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.zi ziVar, org.telegram.ui.eq0 eq0Var, String str, String str2, String str3, String str4, int i3, int i10, int i11, boolean z10) {
        String str5;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z12;
        int i16;
        int i17;
        TLRPC.MessageMedia messageMedia;
        ut utVar = K1;
        if (utVar != null) {
            utVar.I0();
        }
        if (ziVar != null && (messageMedia = ziVar.f26868k.media) != null && messageMedia.webpage != null) {
            str5 = d71.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.v1().N2(null, d2Var, null);
            PhotoViewer.v1().h2(ziVar, null, null, null, null, null, null, 0, eq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        final ?? t2Var = new org.telegram.ui.ActionBar.t2(parentActivity, false);
        t2Var.f38873w1 = new int[2];
        t2Var.D1 = -2;
        t2Var.J1 = new ot(t2Var);
        t2Var.V = true;
        t2Var.f28619v0 = false;
        t2Var.f28621w0 = false;
        t2Var.I1 = i11;
        if (parentActivity != null) {
            t2Var.f38867q1 = parentActivity;
        }
        t2Var.C1 = str4;
        if (str2 != null && str2.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        t2Var.B1 = z11;
        t2Var.A1 = str3;
        t2Var.f38875y1 = i3;
        t2Var.f38876z1 = i10;
        if (i3 == 0 || i10 == 0) {
            Point point = org.telegram.messenger.g0.f22608q;
            t2Var.f38875y1 = point.x;
            t2Var.f38876z1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        t2Var.m1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new fi.a(17));
        t2Var.f28589c.addView(frameLayout, b8.mf.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.o2 o2Var = new ai.o2(19, parentActivity, (Object) t2Var);
        t2Var.f38870t1 = o2Var;
        o2Var.setOnTouchListener(new fi.a(17));
        t2Var.O = o2Var;
        pt ptVar = new pt(t2Var, parentActivity, parentActivity, 0);
        t2Var.f38862j1 = ptVar;
        ptVar.getSettings().setJavaScriptEnabled(true);
        ptVar.getSettings().setDomStorageEnabled(true);
        ptVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ptVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ptVar, true);
        ptVar.setWebChromeClient(new org.telegram.ui.n1(t2Var, 1));
        ptVar.setWebViewClient(new org.telegram.ui.o1(t2Var, 1));
        if (z11) {
            i12 = 22;
        } else {
            i12 = 0;
        }
        o2Var.addView(ptVar, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 + 84));
        d71 d71Var = new d71(parentActivity, true, new qt(t2Var));
        t2Var.k1 = d71Var;
        d71Var.setVisibility(4);
        if (z11) {
            i13 = 22;
        } else {
            i13 = 0;
        }
        o2Var.addView(d71Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 + 74));
        View view = new View(parentActivity);
        t2Var.f38865o1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        if (z11) {
            i14 = 22;
        } else {
            i14 = 0;
        }
        o2Var.addView(view, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        t2Var.f38866p1 = radialProgressView;
        radialProgressView.setVisibility(4);
        if (z11) {
            i15 = 22;
        } else {
            i15 = 0;
        }
        o2Var.addView(radialProgressView, b8.mf.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, (i15 + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            o2Var.addView(textView, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28100p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        o2Var.addView(textView2, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.K5, view2, null);
        o2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout2, null);
        o2Var.addView(frameLayout2, b8.mf.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, b8.mf.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i18 = org.telegram.ui.ActionBar.k6.f28080o5;
        org.telegram.ui.ActionBar.r6.V(textView3, i18, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i19 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(textView3, h02, null, N, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.bd.M0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, b8.mf.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(t2Var) {
            public final ut f36251b;

            {
                this.f36251b = t2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f36251b.dismiss();
                        return;
                    case 1:
                        ut utVar2 = this.f36251b;
                        ie0 ie0Var = ie0.f34683q0;
                        if (ie0Var.Q) {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            return;
                        }
                        if (utVar2.f38872v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar2.f28583a).B3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = utVar2.f38867q1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    t4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (utVar2.f38866p1.getVisibility() != 0) {
                            if (ie0.x(z13, utVar2.f38867q1, null, utVar2.f38862j1, utVar2.f38875y1, utVar2.f38876z1, false)) {
                                ie0Var.V = utVar2;
                            }
                            if (utVar2.f38872v1) {
                                utVar2.f38862j1.evaluateJavascript("hideControls();", null);
                            }
                            utVar2.f28586b.setTranslationY(0.0f);
                            utVar2.K();
                            return;
                        }
                        return;
                    case 2:
                        ut utVar3 = this.f36251b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar3.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar3.f38867q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar3.dismiss();
                        return;
                    default:
                        ut utVar4 = this.f36251b;
                        sf.c.t(utVar4.f38867q1, utVar4.A1);
                        utVar4.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        t2Var.f38868r1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, b8.mf.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        t2Var.f38871u1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i18, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i19);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(imageView, h03, null, N2, null);
        linearLayout2.addView(imageView, b8.mf.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(t2Var) {
            public final ut f36251b;

            {
                this.f36251b = t2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f36251b.dismiss();
                        return;
                    case 1:
                        ut utVar2 = this.f36251b;
                        ie0 ie0Var = ie0.f34683q0;
                        if (ie0Var.Q) {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            return;
                        }
                        if (utVar2.f38872v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar2.f28583a).B3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = utVar2.f38867q1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    t4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (utVar2.f38866p1.getVisibility() != 0) {
                            if (ie0.x(z13, utVar2.f38867q1, null, utVar2.f38862j1, utVar2.f38875y1, utVar2.f38876z1, false)) {
                                ie0Var.V = utVar2;
                            }
                            if (utVar2.f38872v1) {
                                utVar2.f38862j1.evaluateJavascript("hideControls();", null);
                            }
                            utVar2.f28586b.setTranslationY(0.0f);
                            utVar2.K();
                            return;
                        }
                        return;
                    case 2:
                        ut utVar3 = this.f36251b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar3.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar3.f38867q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar3.dismiss();
                        return;
                    default:
                        ut utVar4 = this.f36251b;
                        sf.c.t(utVar4.f38867q1, utVar4.A1);
                        utVar4.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(t2Var) {
            public final ut f36251b;

            {
                this.f36251b = t2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f36251b.dismiss();
                        return;
                    case 1:
                        ut utVar2 = this.f36251b;
                        ie0 ie0Var = ie0.f34683q0;
                        if (ie0Var.Q) {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            return;
                        }
                        if (utVar2.f38872v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar2.f28583a).B3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = utVar2.f38867q1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    t4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (utVar2.f38866p1.getVisibility() != 0) {
                            if (ie0.x(z13, utVar2.f38867q1, null, utVar2.f38862j1, utVar2.f38875y1, utVar2.f38876z1, false)) {
                                ie0Var.V = utVar2;
                            }
                            if (utVar2.f38872v1) {
                                utVar2.f38862j1.evaluateJavascript("hideControls();", null);
                            }
                            utVar2.f28586b.setTranslationY(0.0f);
                            utVar2.K();
                            return;
                        }
                        return;
                    case 2:
                        ut utVar3 = this.f36251b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar3.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar3.f38867q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar3.dismiss();
                        return;
                    default:
                        ut utVar4 = this.f36251b;
                        sf.c.t(utVar4.f38867q1, utVar4.A1);
                        utVar4.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232103);
        imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131751762, null));
        org.telegram.ui.ActionBar.r6.t(imageView2, i18, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i19);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView2, h04, null, N3, null);
        linearLayout2.addView(imageView2, b8.mf.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        t2Var.f38869s1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView4, i18, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i19);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(textView4, h05, null, N4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.bd.M0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, b8.mf.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView5, i18, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i19);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(textView5, h06, null, N5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.bd.M0(2131747806, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, b8.mf.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(t2Var) {
            public final ut f36251b;

            {
                this.f36251b = t2Var;
            }

            @Override
            public final void onClick(View view3) {
                boolean z13;
                switch (r2) {
                    case 0:
                        this.f36251b.dismiss();
                        return;
                    case 1:
                        ut utVar2 = this.f36251b;
                        ie0 ie0Var = ie0.f34683q0;
                        if (ie0Var.Q) {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            return;
                        }
                        if (utVar2.f38872v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar2.f28583a).B3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            Activity activity = utVar2.f38867q1;
                            if (activity != null) {
                                if (!Settings.canDrawOverlays(activity)) {
                                    t4.A(activity, null, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (utVar2.f38866p1.getVisibility() != 0) {
                            if (ie0.x(z13, utVar2.f38867q1, null, utVar2.f38862j1, utVar2.f38875y1, utVar2.f38876z1, false)) {
                                ie0Var.V = utVar2;
                            }
                            if (utVar2.f38872v1) {
                                utVar2.f38862j1.evaluateJavascript("hideControls();", null);
                            }
                            utVar2.f28586b.setTranslationY(0.0f);
                            utVar2.K();
                            return;
                        }
                        return;
                    case 2:
                        ut utVar3 = this.f36251b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar3.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar3.f38867q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar3.dismiss();
                        return;
                    default:
                        ut utVar4 = this.f36251b;
                        sf.c.t(utVar4.f38867q1, utVar4.A1);
                        utVar4.dismiss();
                        return;
                }
            }
        });
        if (!d71.a(str4) && !d71.a(str3)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            i16 = 0;
        } else {
            i16 = 4;
        }
        d71Var.setVisibility(i16);
        if (z12) {
            z61 z61Var = d71Var.f33007g0;
            z61Var.setVisibility(4);
            i17 = 0;
            z61Var.d(false, false);
            d71Var.j(true, false);
        } else {
            i17 = 0;
        }
        t2Var.f28626z0 = new rt(t2Var, z12);
        t2Var.f38874x1 = new st(i17, org.telegram.messenger.t0.f25457b, t2Var);
        String e10 = d71.e(str4);
        if (e10 != null || !z12) {
            radialProgressView.setVisibility(i17);
            ptVar.setVisibility(i17);
            linearLayout2.setVisibility(i17);
            if (e10 != null) {
                view.setVisibility(i17);
            }
            textView4.setVisibility(4);
            ptVar.setKeepScreenOn(true);
            d71Var.setVisibility(4);
            d71Var.getControlsView().setVisibility(4);
            d71Var.getTextureView().setVisibility(4);
            if (d71Var.getTextureImageView() != null) {
                d71Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.hp.s1(t2Var.f28583a).B3)) {
                imageView.setVisibility(8);
            }
        }
        if (t2Var.f38874x1.canDetectOrientation()) {
            t2Var.f38874x1.enable();
        } else {
            t2Var.f38874x1.disable();
            t2Var.f38874x1 = null;
        }
        K1 = t2Var;
        t2Var.f28604i0 = z10;
        t2Var.f28608n = z10;
        t2Var.show();
    }

    @Override
    public final boolean G() {
        d71 d71Var = this.k1;
        if (d71Var.getVisibility() == 0 && d71Var.U) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean H() {
        if (this.m1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void I0() {
        pt ptVar = this.f38862j1;
        if (ptVar != null && ptVar.getVisibility() == 0) {
            this.f38870t1.removeView(ptVar);
            ptVar.stopLoading();
            ptVar.loadUrl("about:blank");
            ptVar.destroy();
        }
        ie0.b(false);
        d71 d71Var = this.k1;
        if (d71Var != null) {
            d71Var.b();
        }
        K1 = null;
        K();
    }

    public final void J0() {
        int i3;
        if (this.f38862j1 != null && ie0.f34683q0.Q) {
            if (org.telegram.messenger.t0.f25465x) {
                try {
                    this.f38867q1.startService(new Intent(org.telegram.messenger.t0.f25457b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (this.f38872v1) {
                this.f38862j1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f38862j1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f38862j1);
            }
            ai.o2 o2Var = this.f38870t1;
            pt ptVar = this.f38862j1;
            if (this.B1) {
                i3 = 22;
            } else {
                i3 = 0;
            }
            o2Var.addView(ptVar, 0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i3 + 84));
            this.f28598f0 = true;
            show();
            ie0.b(true);
        }
    }

    @Override
    public final void K() {
        super.K();
        st stVar = this.f38874x1;
        if (stVar != null) {
            stVar.disable();
            this.f38874x1 = null;
        }
    }

    public final void L0() {
        d71 d71Var = this.k1;
        View aspectRatioView = d71Var.getAspectRatioView();
        int[] iArr = this.f38873w1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - S();
        if (!d71Var.f() && !this.G1) {
            TextureView textureView = d71Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = d71Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = d71Var.getControlsView();
        if (controlsView.getParent() == this.f28589c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void c0(Configuration configuration) {
        d71 d71Var = this.k1;
        if (d71Var.getVisibility() == 0 && d71Var.f33017x && !d71Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = d71Var.U;
                if (!z10 && !z10) {
                    d71Var.U = true;
                    d71Var.m();
                    d71Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = d71Var.U;
            if (z11 && z11) {
                d71Var.U = false;
                d71Var.m();
                d71Var.l(false);
            }
        }
    }

    @Override
    public final void d0() {
        int i3 = this.H1;
        if (i3 != 0) {
            int i10 = i3 - 1;
            this.H1 = i10;
            if (i10 == 0) {
                d71 d71Var = this.k1;
                TextureView textureView = d71Var.d;
                ImageView imageView = d71Var.f33003e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c2 = org.telegram.messenger.sr.c(width, height);
                        d71Var.h = c2;
                        d71Var.f33013n.getBitmap(c2);
                    } catch (Throwable th2) {
                        Bitmap bitmap = d71Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            d71Var.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (d71Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(d71Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ie0.b(false);
                return;
            }
            this.f28589c.invalidate();
        }
    }

    @Override
    public final void g0(float f10) {
        L0();
    }

    @Override
    public final boolean k0(View view, int i3, int i10, int i11, int i12) {
        if (view == this.k1.getControlsView()) {
            L0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(View view, int i3, int i10) {
        int L;
        d71 d71Var = this.k1;
        if (view == d71Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = d71Var.getMeasuredWidth();
            int measuredHeight = d71Var.getAspectRatioView().getMeasuredHeight();
            if (d71Var.U) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
