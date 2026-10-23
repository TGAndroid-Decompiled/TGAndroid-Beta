package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class cv extends org.telegram.ui.ActionBar.h3 {
    public static cv S;
    public int[] E;
    public av F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public String K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public vu R;
    public wu f25428b;
    public da1 f25429c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f25430f;
    public View h;
    public RadialProgressView f25431n;
    public Activity f25432r;
    public LinearLayout f25433s;
    public TextView v;
    public ah.x f25434w;
    public ImageView f25435x;
    public boolean f25436y;

    public static void I(org.telegram.ui.ActionBar.o2 o2Var, MessageObject messageObject, org.telegram.ui.cu0 cu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        cv cvVar = S;
        if (cvVar != null) {
            cvVar.F();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : da1.e(str4)) != null) {
            PhotoViewer.u1().M2(null, o2Var, null);
            PhotoViewer.u1().g2(messageObject, null, null, null, null, null, null, 0, cu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        final ?? h3Var = new org.telegram.ui.ActionBar.h3(parentActivity, false);
        h3Var.E = new int[2];
        h3Var.L = -2;
        h3Var.R = new vu(h3Var);
        h3Var.fullWidth = true;
        h3Var.setApplyTopPadding(false);
        h3Var.setApplyBottomPadding(false);
        h3Var.Q = i12;
        if (parentActivity != null) {
            h3Var.f25432r = parentActivity;
        }
        h3Var.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        h3Var.J = z11;
        h3Var.I = str3;
        h3Var.G = i10;
        h3Var.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            h3Var.G = point.x;
            h3Var.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        h3Var.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new di.d(17));
        h3Var.container.addView(frameLayout, w7.z5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ah.x xVar = new ah.x((Object) h3Var, parentActivity, 15);
        h3Var.f25434w = xVar;
        xVar.setOnTouchListener(new di.d(17));
        h3Var.setCustomView(xVar);
        wu wuVar = new wu(h3Var, parentActivity, parentActivity, 0);
        h3Var.f25428b = wuVar;
        wuVar.getSettings().setJavaScriptEnabled(true);
        wuVar.getSettings().setDomStorageEnabled(true);
        wuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        wuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(wuVar, true);
        wuVar.setWebChromeClient(new org.telegram.ui.q1(h3Var, 1));
        wuVar.setWebViewClient(new xu(h3Var));
        xVar.addView(wuVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        da1 da1Var = new da1(parentActivity, true, new yu(h3Var));
        h3Var.f25429c = da1Var;
        da1Var.setVisibility(4);
        xVar.addView(da1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        h3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        xVar.addView(view, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        h3Var.f25431n = radialProgressView;
        radialProgressView.setVisibility(4);
        xVar.addView(radialProgressView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            xVar.addView(textView, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        xVar.addView(textView2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.K5, view2, null);
        xVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, frameLayout2, null);
        xVar.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f21385o5;
        org.telegram.ui.ActionBar.r6.W(textView3, i13, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        textView3.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(textView3, g02, null, O, null);
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(h3Var) {
            public final cv f30908b;

            {
                this.f30908b = h3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30908b.dismiss();
                        return;
                    case 1:
                        cv.m(this.f30908b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30908b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25432r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new e2(21));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30908b;
                        pf.d.r(cvVar3.f25432r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        h3Var.f25433s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        h3Var.f25435x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, null, mode);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        imageView.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(imageView, g03, null, O2, null);
        linearLayout2.addView(imageView, w7.z5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(h3Var) {
            public final cv f30908b;

            {
                this.f30908b = h3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30908b.dismiss();
                        return;
                    case 1:
                        cv.m(this.f30908b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30908b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25432r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new e2(21));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30908b;
                        pf.d.r(cvVar3.f25432r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(h3Var) {
            public final cv f30908b;

            {
                this.f30908b = h3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30908b.dismiss();
                        return;
                    case 1:
                        cv.m(this.f30908b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30908b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25432r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new e2(21));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30908b;
                        pf.d.r(cvVar3.f25432r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        org.telegram.ui.ActionBar.r6.t(imageView2, i13, null, mode);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i14);
        imageView2.setBackground(g04);
        org.telegram.ui.ActionBar.r6.k(imageView2, g04, null, O3, null);
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        h3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView4, i13, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i14);
        textView4.setBackground(g05);
        org.telegram.ui.ActionBar.r6.k(textView4, g05, null, O4, null);
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView5, i13, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i14);
        textView5.setBackground(g06);
        org.telegram.ui.ActionBar.r6.k(textView5, g06, null, O5, null);
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(h3Var) {
            public final cv f30908b;

            {
                this.f30908b = h3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30908b.dismiss();
                        return;
                    case 1:
                        cv.m(this.f30908b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30908b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25432r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new e2(21));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30908b;
                        pf.d.r(cvVar3.f25432r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = da1.a(str4) || da1.a(str3);
        da1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            z91 z91Var = da1Var.f25573f0;
            z91Var.setVisibility(4);
            z91Var.d(false, false);
            da1Var.j(true, false);
        }
        h3Var.setDelegate(new zu(h3Var, z12));
        h3Var.F = new av(h3Var, ApplicationLoader.applicationContext);
        String e = da1.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            wuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            wuVar.setKeepScreenOn(true);
            da1Var.setVisibility(4);
            da1Var.getControlsView().setVisibility(4);
            da1Var.getTextureView().setVisibility(4);
            if (da1Var.getTextureImageView() != null) {
                da1Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(h3Var.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (h3Var.F.canDetectOrientation()) {
            h3Var.F.enable();
        } else {
            h3Var.F.disable();
            h3Var.F = null;
        }
        S = h3Var;
        h3Var.setCalcMandatoryInsets(z10);
        h3Var.show();
    }

    public static void m(cv cvVar, View view) {
        boolean z10;
        dh0 dh0Var = dh0.f25631p0;
        if (dh0Var.P) {
            dh0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new uu(0, view), 300L);
            return;
        }
        if (cvVar.f25436y && "inapp".equals(MessagesController.getInstance(cvVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Activity activity = cvVar.f25432r;
            if (activity != null) {
                if (!Settings.canDrawOverlays(activity)) {
                    f5.B(activity, null, false);
                    return;
                }
            } else {
                return;
            }
        }
        if (cvVar.f25431n.getVisibility() == 0) {
            return;
        }
        if (dh0.x(z10, cvVar.f25432r, null, cvVar.f25428b, cvVar.G, cvVar.H, false)) {
            dh0Var.U = cvVar;
        }
        if (cvVar.f25436y) {
            cvVar.f25428b.evaluateJavascript("hideControls();", null);
        }
        cvVar.containerView.setTranslationY(0.0f);
        cvVar.dismissInternal();
    }

    public final void F() {
        wu wuVar = this.f25428b;
        if (wuVar != null && wuVar.getVisibility() == 0) {
            this.f25434w.removeView(wuVar);
            wuVar.stopLoading();
            wuVar.loadUrl("about:blank");
            wuVar.destroy();
        }
        dh0.j(false);
        da1 da1Var = this.f25429c;
        if (da1Var != null) {
            da1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void G() {
        int i10;
        if (this.f25428b != null && dh0.f25631p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f25432r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f25436y) {
                this.f25428b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f25428b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f25428b);
            }
            ah.x xVar = this.f25434w;
            wu wuVar = this.f25428b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            xVar.addView(wuVar, 0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            dh0.j(true);
        }
    }

    public final void J() {
        da1 da1Var = this.f25429c;
        View aspectRatioView = da1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!da1Var.f() && !this.O) {
            TextureView textureView = da1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = da1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = da1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        da1 da1Var = this.f25429c;
        if (da1Var.getVisibility() == 0 && da1Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        av avVar = this.F;
        if (avVar != null) {
            avVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        da1 da1Var = this.f25429c;
        if (da1Var.getVisibility() == 0 && da1Var.f25582w && !da1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = da1Var.T;
                if (!z10 && !z10) {
                    da1Var.T = true;
                    da1Var.m();
                    da1Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = da1Var.T;
            if (z11 && z11) {
                da1Var.T = false;
                da1Var.m();
                da1Var.l(false);
            }
        }
    }

    @Override
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.P;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.P = i11;
            if (i11 == 0) {
                da1 da1Var = this.f25429c;
                TextureView textureView = da1Var.d;
                ImageView imageView = da1Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        da1Var.h = createBitmap;
                        da1Var.f25579n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = da1Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            da1Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (da1Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(da1Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                dh0.j(false);
                return;
            }
            this.container.invalidate();
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        J();
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f25429c.getControlsView()) {
            J();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        da1 da1Var = this.f25429c;
        if (view == da1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = da1Var.getMeasuredWidth();
            int measuredHeight = da1Var.getAspectRatioView().getMeasuredHeight();
            if (da1Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
