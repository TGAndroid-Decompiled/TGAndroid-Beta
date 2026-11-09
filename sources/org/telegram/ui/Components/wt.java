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
public final class wt extends org.telegram.ui.ActionBar.v2 {
    public static wt O1;
    public final boolean A1;
    public final String B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public final int H1;
    public final qt I1;
    public ti.o J1;
    public View K1;
    public int L1;
    public int M1;
    public final rt N1;
    public final st f40149i1;
    public final m71 f40150j1;
    public View f40151k1;
    public final FrameLayout l1;
    public WebChromeClient.CustomViewCallback f40152m1;
    public final View n1;
    public final RadialProgressView f40153o1;
    public final Activity f40154p1;
    public final LinearLayout f40155q1;
    public final TextView f40156r1;
    public final bi.e5 f40157s1;
    public final ImageView f40158t1;
    public boolean f40159u1;
    public final int[] f40160v1;
    public pt f40161w1;
    public final int f40162x1;
    public final int f40163y1;
    public final String f40164z1;

    public wt(Activity activity, String str, String str2, String str3, String str4, int i7, int i10, int i11) {
        super(activity, false);
        boolean z9;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z10;
        int i16;
        int i17;
        this.f40160v1 = new int[2];
        this.C1 = -2;
        this.I1 = new qt(this);
        this.N1 = new rt(this, 0);
        this.U = true;
        this.f28655u0 = false;
        this.f28656v0 = false;
        this.H1 = i11;
        if (com.google.android.recaptcha.internal.a.u(activity)) {
            this.f40154p1 = activity;
        }
        this.B1 = str4;
        if (str2 != null && str2.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.A1 = z9;
        this.f40164z1 = str3;
        this.f40162x1 = i7;
        this.f40163y1 = i10;
        if (i7 == 0 || i10 == 0) {
            Point point = org.telegram.messenger.g0.f22563q;
            this.f40162x1 = point.x;
            this.f40163y1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.l1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new ei.b(17));
        this.f28627c.addView(frameLayout, c8.ha.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bi.e5 e5Var = new bi.e5(17, activity, this);
        this.f40157s1 = e5Var;
        e5Var.setOnTouchListener(new ei.b(17));
        this.N = e5Var;
        st stVar = new st(this, activity, activity, 0);
        this.f40149i1 = stVar;
        stVar.getSettings().setJavaScriptEnabled(true);
        stVar.getSettings().setDomStorageEnabled(true);
        stVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        stVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(stVar, true);
        stVar.setWebChromeClient(new org.telegram.ui.m1(this, 1));
        stVar.setWebViewClient(new org.telegram.ui.n1(this, 1));
        if (z9) {
            i12 = 22;
        } else {
            i12 = 0;
        }
        e5Var.addView(stVar, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 + 84));
        m71 m71Var = new m71(activity, true, new tt(this));
        this.f40150j1 = m71Var;
        m71Var.setVisibility(4);
        if (z9) {
            i13 = 22;
        } else {
            i13 = 0;
        }
        e5Var.addView(m71Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 + 74));
        View view = new View(activity);
        this.n1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        if (z9) {
            i14 = 22;
        } else {
            i14 = 0;
        }
        e5Var.addView(view, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.f40153o1 = radialProgressView;
        radialProgressView.setVisibility(4);
        if (z9) {
            i15 = 22;
        } else {
            i15 = 0;
        }
        e5Var.addView(radialProgressView, c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, (i15 + 84) / 2));
        if (z9) {
            TextView textView = new TextView(activity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            e5Var.addView(textView, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28084p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        e5Var.addView(textView2, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.K5, view2, null);
        e5Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, frameLayout2, null);
        e5Var.addView(frameLayout2, c8.ha.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, c8.ha.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i18 = org.telegram.ui.ActionBar.l6.f28064o5;
        org.telegram.ui.ActionBar.s6.U(textView3, i18, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i19 = org.telegram.ui.ActionBar.l6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i19);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(textView3, h02, null, M, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.id.M0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, c8.ha.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final wt f36497b;

            {
                this.f36497b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f36497b.dismiss();
                        return;
                    case 1:
                        wt wtVar = this.f36497b;
                        st stVar2 = wtVar.f40149i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            return;
                        } else if (wtVar.f40153o1.getVisibility() != 0) {
                            wtVar.O0(stVar2, wtVar.f40162x1, wtVar.f40163y1);
                            if (wtVar.f40159u1) {
                                stVar2.evaluateJavascript("hideControls();", null);
                            }
                            wtVar.f28624b.setTranslationY(0.0f);
                            wtVar.K();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        wt wtVar2 = this.f36497b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.f40164z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.f40154p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        return;
                    default:
                        wt wtVar3 = this.f36497b;
                        vf.c.t(wtVar3.f40154p1, wtVar3.f40164z1);
                        wtVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.f40155q1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, c8.ha.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.f40158t1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231274);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView, i18, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i19);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.s6.j(imageView, h03, null, M2, null);
        linearLayout2.addView(imageView, c8.ha.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final wt f36497b;

            {
                this.f36497b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f36497b.dismiss();
                        return;
                    case 1:
                        wt wtVar = this.f36497b;
                        st stVar2 = wtVar.f40149i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            return;
                        } else if (wtVar.f40153o1.getVisibility() != 0) {
                            wtVar.O0(stVar2, wtVar.f40162x1, wtVar.f40163y1);
                            if (wtVar.f40159u1) {
                                stVar2.evaluateJavascript("hideControls();", null);
                            }
                            wtVar.f28624b.setTranslationY(0.0f);
                            wtVar.K();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        wt wtVar2 = this.f36497b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.f40164z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.f40154p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        return;
                    default:
                        wt wtVar3 = this.f36497b;
                        vf.c.t(wtVar3.f40154p1, wtVar3.f40164z1);
                        wtVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final wt f36497b;

            {
                this.f36497b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f36497b.dismiss();
                        return;
                    case 1:
                        wt wtVar = this.f36497b;
                        st stVar2 = wtVar.f40149i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            return;
                        } else if (wtVar.f40153o1.getVisibility() != 0) {
                            wtVar.O0(stVar2, wtVar.f40162x1, wtVar.f40163y1);
                            if (wtVar.f40159u1) {
                                stVar2.evaluateJavascript("hideControls();", null);
                            }
                            wtVar.f28624b.setTranslationY(0.0f);
                            wtVar.K();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        wt wtVar2 = this.f36497b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.f40164z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.f40154p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        return;
                    default:
                        wt wtVar3 = this.f36497b;
                        vf.c.t(wtVar3.f40154p1, wtVar3.f40164z1);
                        wtVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232103);
        imageView2.setContentDescription(org.telegram.messenger.id.M0(2131751762, null));
        org.telegram.ui.ActionBar.s6.s(imageView2, i18, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i19);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.s6.j(imageView2, h04, null, M3, null);
        linearLayout2.addView(imageView2, c8.ha.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.f40156r1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView4, i18, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.o6 M4 = org.telegram.ui.ActionBar.s6.M(i19);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.s6.j(textView4, h05, null, M4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.id.M0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, c8.ha.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView5, i18, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i19, false), 0, -1);
        org.telegram.ui.ActionBar.o6 M5 = org.telegram.ui.ActionBar.s6.M(i19);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.s6.j(textView5, h06, null, M5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.id.M0(2131747798, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, c8.ha.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final wt f36497b;

            {
                this.f36497b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f36497b.dismiss();
                        return;
                    case 1:
                        wt wtVar = this.f36497b;
                        st stVar2 = wtVar.f40149i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 != null) {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            return;
                        } else if (wtVar.f40153o1.getVisibility() != 0) {
                            wtVar.O0(stVar2, wtVar.f40162x1, wtVar.f40163y1);
                            if (wtVar.f40159u1) {
                                stVar2.evaluateJavascript("hideControls();", null);
                            }
                            wtVar.f28624b.setTranslationY(0.0f);
                            wtVar.K();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        wt wtVar2 = this.f36497b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.f40164z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.f40154p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        return;
                    default:
                        wt wtVar3 = this.f36497b;
                        vf.c.t(wtVar3.f40154p1, wtVar3.f40164z1);
                        wtVar3.dismiss();
                        return;
                }
            }
        });
        if (!m71.a(str4) && !m71.a(str3)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i16 = 0;
        } else {
            i16 = 4;
        }
        m71Var.setVisibility(i16);
        if (z10) {
            i71 i71Var = m71Var.f36006f0;
            i71Var.setVisibility(4);
            i17 = 0;
            i71Var.d(false, false);
            m71Var.j(true, false);
        } else {
            i17 = 0;
        }
        this.f28662y0 = new ut(this, z10);
        this.f40161w1 = new pt(i17, org.telegram.messenger.t0.f25566b, this);
        String e10 = m71.e(str4);
        if (e10 != null || !z10) {
            radialProgressView.setVisibility(i17);
            stVar.setVisibility(i17);
            linearLayout2.setVisibility(i17);
            if (e10 != null) {
                view.setVisibility(i17);
            }
            textView4.setVisibility(4);
            stVar.setKeepScreenOn(true);
            m71Var.setVisibility(4);
            m71Var.getControlsView().setVisibility(4);
            m71Var.getTextureView().setVisibility(4);
            if (m71Var.getTextureImageView() != null) {
                m71Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.qp.s1(this.f28621a).A3)) {
                imageView.setVisibility(8);
            }
        }
        if (this.f40161w1.canDetectOrientation()) {
            this.f40161w1.enable();
        } else {
            this.f40161w1.disable();
            this.f40161w1 = null;
        }
        O1 = this;
    }

    public static li0 I0(wt wtVar, boolean z9, float f10) {
        ti.o oVar;
        ti.i iVar;
        RectF rectF = new RectF();
        if (!z9 && (oVar = wtVar.J1) != null && (iVar = oVar.f56138e) != null) {
            iVar.g(rectF);
        } else {
            ti.i.j(rectF, 1000, Math.round(1000.0f / f10));
        }
        ?? obj = new Object();
        obj.f35751a = rectF.left;
        obj.f35752b = rectF.top;
        obj.f35753c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public static void N0(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.ij ijVar, org.telegram.ui.pq0 pq0Var, String str, String str2, String str3, String str4, int i7, int i10, int i11, boolean z9) {
        String str5;
        TLRPC.MessageMedia messageMedia;
        wt wtVar = O1;
        if (wtVar != null) {
            wtVar.K0();
        }
        if (ijVar != null && (messageMedia = ijVar.f23262k.media) != null && messageMedia.webpage != null) {
            str5 = m71.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.p1().H2(null, f2Var, null);
            PhotoViewer.p1().c2(ijVar, null, null, null, null, null, null, 0, pq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        wt wtVar2 = new wt(f2Var.getParentActivity(), str, str2, str3, str4, i7, i10, i11);
        wtVar2.f28640h0 = z9;
        wtVar2.f28645n = z9;
        wtVar2.show();
    }

    @Override
    public final boolean G() {
        m71 m71Var = this.f40150j1;
        if (m71Var.getVisibility() == 0 && m71Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean H() {
        if (this.l1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void J0() {
        ti.o oVar = this.J1;
        if (oVar != null) {
            this.J1 = null;
            oVar.a(new di.e(12));
            oVar.f();
        }
    }

    @Override
    public final void K() {
        super.K();
        pt ptVar = this.f40161w1;
        if (ptVar != null) {
            ptVar.disable();
            this.f40161w1 = null;
        }
    }

    public final void K0() {
        st stVar = this.f40149i1;
        if (stVar != null && stVar.getVisibility() == 0) {
            this.f40157s1.removeView(stVar);
            stVar.stopLoading();
            stVar.loadUrl("about:blank");
            stVar.destroy();
        }
        ti.o oVar = this.J1;
        if (oVar != null) {
            this.J1 = null;
            oVar.b();
        }
        m71 m71Var = this.f40150j1;
        if (m71Var != null) {
            m71Var.b();
        }
        O1 = null;
        K();
    }

    public final void L0() {
        int i7;
        ImageView imageView;
        if (this.f40149i1 != null && M0()) {
            if (this.K1 != this.f40149i1) {
                m71 m71Var = this.f40150j1;
                if (m71Var.U && (imageView = m71Var.f36002d0) != null) {
                    imageView.callOnClick();
                    return;
                }
                return;
            }
            if (org.telegram.messenger.t0.f25574x) {
                try {
                    this.f40154p1.startService(new Intent(org.telegram.messenger.t0.f25566b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (this.f40159u1) {
                this.f40149i1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f40149i1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f40149i1);
            }
            bi.e5 e5Var = this.f40157s1;
            st stVar = this.f40149i1;
            if (this.A1) {
                i7 = 22;
            } else {
                i7 = 0;
            }
            e5Var.addView(stVar, 0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i7 + 84));
            this.f28633e0 = true;
            show();
            J0();
        }
    }

    public final boolean M0() {
        ti.o oVar = this.J1;
        if (oVar != null && oVar.e()) {
            return true;
        }
        return false;
    }

    public final void O0(View view, int i7, int i10) {
        ti.o c10 = l2.i.d().c();
        if (c10 != null) {
            c10.b();
        }
        this.K1 = view;
        this.L1 = i7;
        this.M1 = i10;
        ti.o k10 = l2.i.d().k(this.N1);
        this.J1 = k10;
        k10.g(this.f40154p1, null, true);
    }

    public final void P0() {
        m71 m71Var = this.f40150j1;
        View aspectRatioView = m71Var.getAspectRatioView();
        int[] iArr = this.f40160v1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - S();
        if (!m71Var.f() && !this.F1) {
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
        if (controlsView.getParent() == this.f28627c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void c0(Configuration configuration) {
        m71 m71Var = this.f40150j1;
        if (m71Var.getVisibility() == 0 && m71Var.f36016x && !m71Var.f()) {
            if (configuration.orientation == 2) {
                boolean z9 = m71Var.T;
                if (!z9 && !z9) {
                    m71Var.T = true;
                    m71Var.m();
                    m71Var.l(false);
                    return;
                }
                return;
            }
            boolean z10 = m71Var.T;
            if (z10 && z10) {
                m71Var.T = false;
                m71Var.m();
                m71Var.l(false);
            }
        }
    }

    @Override
    public final void d0() {
        int i7 = this.G1;
        if (i7 != 0) {
            int i10 = i7 - 1;
            this.G1 = i10;
            if (i10 == 0) {
                m71 m71Var = this.f40150j1;
                TextureView textureView = m71Var.d;
                ImageView imageView = m71Var.f36003e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.as.c(width, height);
                        m71Var.h = c10;
                        m71Var.f36012n.getBitmap(c10);
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
            this.f28627c.invalidate();
        }
    }

    @Override
    public final void g0(float f10) {
        P0();
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        if (view == this.f40150j1.getControlsView()) {
            P0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        int L;
        m71 m71Var = this.f40150j1;
        if (view == m71Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = m71Var.getMeasuredWidth();
            int measuredHeight = m71Var.getAspectRatioView().getMeasuredHeight();
            if (m71Var.T) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
