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
import android.graphics.PorterDuffColorFilter;
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
public final class cv extends org.telegram.ui.ActionBar.f3 {
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
    public wu f25260b;
    public w91 f25261c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f25262f;
    public View h;
    public RadialProgressView f25263n;
    public Activity f25264r;
    public LinearLayout f25265s;
    public TextView v;
    public ah.x f25266w;
    public ImageView f25267x;
    public boolean f25268y;

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.zt0 zt0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        cv cvVar = S;
        if (cvVar != null) {
            cvVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : w91.e(str4)) != null) {
            PhotoViewer.u1().M2(null, n2Var, null);
            PhotoViewer.u1().h2(messageObject, null, null, null, null, null, null, 0, zt0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final ?? f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, false);
        f3Var.E = new int[2];
        f3Var.L = -2;
        f3Var.R = new vu(f3Var);
        f3Var.fullWidth = true;
        f3Var.setApplyTopPadding(false);
        f3Var.setApplyBottomPadding(false);
        f3Var.Q = i12;
        if (parentActivity != null) {
            f3Var.f25264r = parentActivity;
        }
        f3Var.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        f3Var.J = z11;
        f3Var.I = str3;
        f3Var.G = i10;
        f3Var.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            f3Var.G = point.x;
            f3Var.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        f3Var.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new di.d(17));
        f3Var.container.addView(frameLayout, w7.z5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ah.x xVar = new ah.x((Object) f3Var, parentActivity, 15);
        f3Var.f25266w = xVar;
        xVar.setOnTouchListener(new di.d(17));
        f3Var.setCustomView(xVar);
        wu wuVar = new wu(f3Var, parentActivity, parentActivity, 0);
        f3Var.f25260b = wuVar;
        wuVar.getSettings().setJavaScriptEnabled(true);
        wuVar.getSettings().setDomStorageEnabled(true);
        wuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        wuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(wuVar, true);
        wuVar.setWebChromeClient(new org.telegram.ui.r1(f3Var, 1));
        wuVar.setWebViewClient(new xu(f3Var));
        xVar.addView(wuVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        w91 w91Var = new w91(parentActivity, true, new yu(f3Var));
        f3Var.f25261c = w91Var;
        w91Var.setVisibility(4);
        xVar.addView(w91Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        f3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        xVar.addView(view, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        f3Var.f25263n = radialProgressView;
        radialProgressView.setVisibility(4);
        xVar.addView(radialProgressView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21096j5, false));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        xVar.addView(textView2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K5, false));
        xVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false));
        xVar.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f21192o5;
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(f3Var) {
            public final cv f30677b;

            {
                this.f30677b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30677b.dismiss();
                        return;
                    case 1:
                        cv.n(this.f30677b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30677b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25264r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30677b;
                        pf.d.r(cvVar3.f25264r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        f3Var.f25265s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        f3Var.f25267x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.z5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(f3Var) {
            public final cv f30677b;

            {
                this.f30677b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30677b.dismiss();
                        return;
                    case 1:
                        cv.n(this.f30677b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30677b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25264r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30677b;
                        pf.d.r(cvVar3.f25264r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(f3Var) {
            public final cv f30677b;

            {
                this.f30677b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30677b.dismiss();
                        return;
                    case 1:
                        cv.n(this.f30677b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30677b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25264r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30677b;
                        pf.d.r(cvVar3.f25264r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        f3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(f3Var) {
            public final cv f30677b;

            {
                this.f30677b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f30677b.dismiss();
                        return;
                    case 1:
                        cv.n(this.f30677b, view3);
                        return;
                    case 2:
                        cv cvVar2 = this.f30677b;
                        cvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar2.f25264r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar2.dismiss();
                        return;
                    default:
                        cv cvVar3 = this.f30677b;
                        pf.d.r(cvVar3.f25264r, cvVar3.I);
                        cvVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = w91.a(str4) || w91.a(str3);
        w91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            s91 s91Var = w91Var.f32025f0;
            s91Var.setVisibility(4);
            s91Var.d(false, false);
            w91Var.j(true, false);
        }
        f3Var.setDelegate(new zu(f3Var, z12));
        f3Var.F = new av(f3Var, ApplicationLoader.applicationContext);
        String e = w91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            wuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            wuVar.setKeepScreenOn(true);
            w91Var.setVisibility(4);
            w91Var.getControlsView().setVisibility(4);
            w91Var.getTextureView().setVisibility(4);
            if (w91Var.getTextureImageView() != null) {
                w91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(f3Var.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (f3Var.F.canDetectOrientation()) {
            f3Var.F.enable();
        } else {
            f3Var.F.disable();
            f3Var.F = null;
        }
        S = f3Var;
        f3Var.setCalcMandatoryInsets(z10);
        f3Var.show();
    }

    public static void n(cv cvVar, View view) {
        boolean z10;
        ah0 ah0Var = ah0.f24598p0;
        if (ah0Var.P) {
            ah0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new uu(0, view), 300L);
            return;
        }
        if (cvVar.f25268y && "inapp".equals(MessagesController.getInstance(cvVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Activity activity = cvVar.f25264r;
            if (activity != null) {
                if (!Settings.canDrawOverlays(activity)) {
                    f5.A(activity, null, false);
                    return;
                }
            } else {
                return;
            }
        }
        if (cvVar.f25263n.getVisibility() == 0) {
            return;
        }
        if (ah0.x(z10, cvVar.f25264r, null, cvVar.f25260b, cvVar.G, cvVar.H, false)) {
            ah0Var.U = cvVar;
        }
        if (cvVar.f25268y) {
            cvVar.f25260b.evaluateJavascript("hideControls();", null);
        }
        cvVar.containerView.setTranslationY(0.0f);
        cvVar.dismissInternal();
    }

    public final void G() {
        wu wuVar = this.f25260b;
        if (wuVar != null && wuVar.getVisibility() == 0) {
            this.f25266w.removeView(wuVar);
            wuVar.stopLoading();
            wuVar.loadUrl("about:blank");
            wuVar.destroy();
        }
        ah0.j(false);
        w91 w91Var = this.f25261c;
        if (w91Var != null) {
            w91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f25260b != null && ah0.f24598p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f25264r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f25268y) {
                this.f25260b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f25260b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f25260b);
            }
            ah.x xVar = this.f25266w;
            wu wuVar = this.f25260b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            xVar.addView(wuVar, 0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            ah0.j(true);
        }
    }

    public final void K() {
        w91 w91Var = this.f25261c;
        View aspectRatioView = w91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!w91Var.f() && !this.O) {
            TextureView textureView = w91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = w91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = w91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        w91 w91Var = this.f25261c;
        if (w91Var.getVisibility() == 0 && w91Var.T) {
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
        w91 w91Var = this.f25261c;
        if (w91Var.getVisibility() == 0 && w91Var.f32034w && !w91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = w91Var.T;
                if (!z10 && !z10) {
                    w91Var.T = true;
                    w91Var.m();
                    w91Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = w91Var.T;
            if (z11 && z11) {
                w91Var.T = false;
                w91Var.m();
                w91Var.l(false);
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
                w91 w91Var = this.f25261c;
                TextureView textureView = w91Var.d;
                ImageView imageView = w91Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        w91Var.h = createBitmap;
                        w91Var.f32031n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = w91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            w91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (w91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(w91Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ah0.j(false);
                return;
            }
            this.container.invalidate();
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        K();
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f25261c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        w91 w91Var = this.f25261c;
        if (view == w91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = w91Var.getMeasuredWidth();
            int measuredHeight = w91Var.getAspectRatioView().getMeasuredHeight();
            if (w91Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
