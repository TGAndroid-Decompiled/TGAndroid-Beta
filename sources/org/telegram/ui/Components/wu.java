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
import android.os.Build;
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
public final class wu extends org.telegram.ui.ActionBar.e3 {
    public static wu S;
    public int[] E;
    public uu F;
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
    public pu R;
    public qu f30184b;
    public o91 f30185c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f30186f;
    public View h;
    public RadialProgressView f30187n;
    public Activity f30188r;
    public LinearLayout f30189s;
    public TextView v;
    public ai.f0 f30190w;
    public ImageView f30191x;
    public boolean f30192y;

    public static void J(org.telegram.ui.ActionBar.m2 m2Var, MessageObject messageObject, org.telegram.ui.lu0 lu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        wu wuVar = S;
        if (wuVar != null) {
            wuVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : o91.e(str4)) != null) {
            PhotoViewer.t1().J2(null, m2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, lu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        final ?? e3Var = new org.telegram.ui.ActionBar.e3(parentActivity, false);
        e3Var.E = new int[2];
        e3Var.L = -2;
        e3Var.R = new pu(e3Var);
        e3Var.fullWidth = true;
        e3Var.setApplyTopPadding(false);
        e3Var.setApplyBottomPadding(false);
        e3Var.Q = i12;
        if (parentActivity != null) {
            e3Var.f30188r = parentActivity;
        }
        e3Var.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        e3Var.J = z11;
        e3Var.I = str3;
        e3Var.G = i10;
        e3Var.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            e3Var.G = point.x;
            e3Var.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        e3Var.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        e3Var.container.addView(frameLayout, w7.y5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) e3Var, parentActivity, 12);
        e3Var.f30190w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        e3Var.setCustomView(f0Var);
        qu quVar = new qu(e3Var, parentActivity, parentActivity, 0);
        e3Var.f30184b = quVar;
        quVar.getSettings().setJavaScriptEnabled(true);
        quVar.getSettings().setDomStorageEnabled(true);
        quVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        quVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(quVar, true);
        quVar.setWebChromeClient(new org.telegram.ui.p1(e3Var, 1));
        quVar.setWebViewClient(new ru(e3Var));
        f0Var.addView(quVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        o91 o91Var = new o91(parentActivity, true, new su(e3Var));
        e3Var.f30185c = o91Var;
        o91Var.setVisibility(4);
        f0Var.addView(o91Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        e3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        e3Var.f30187n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.y5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        f0Var.addView(textView2, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false));
        f0Var.addView(frameLayout2, w7.y5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.y5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f19260o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.y5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(e3Var) {
            public final wu f26806b;

            {
                this.f26806b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26806b.dismiss();
                        return;
                    case 1:
                        wu.m(this.f26806b, view3);
                        return;
                    case 2:
                        wu wuVar2 = this.f26806b;
                        wuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = wuVar2.f30188r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new x1(28));
                        }
                        wuVar2.dismiss();
                        return;
                    default:
                        wu wuVar3 = this.f26806b;
                        nf.f.s(wuVar3.f30188r, wuVar3.I);
                        wuVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        e3Var.f30189s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.y5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        e3Var.f30191x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.y5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(e3Var) {
            public final wu f26806b;

            {
                this.f26806b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26806b.dismiss();
                        return;
                    case 1:
                        wu.m(this.f26806b, view3);
                        return;
                    case 2:
                        wu wuVar2 = this.f26806b;
                        wuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = wuVar2.f30188r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new x1(28));
                        }
                        wuVar2.dismiss();
                        return;
                    default:
                        wu wuVar3 = this.f26806b;
                        nf.f.s(wuVar3.f30188r, wuVar3.I);
                        wuVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(e3Var) {
            public final wu f26806b;

            {
                this.f26806b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26806b.dismiss();
                        return;
                    case 1:
                        wu.m(this.f26806b, view3);
                        return;
                    case 2:
                        wu wuVar2 = this.f26806b;
                        wuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = wuVar2.f30188r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new x1(28));
                        }
                        wuVar2.dismiss();
                        return;
                    default:
                        wu wuVar3 = this.f26806b;
                        nf.f.s(wuVar3.f30188r, wuVar3.I);
                        wuVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.y5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        e3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.y5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.y5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(e3Var) {
            public final wu f26806b;

            {
                this.f26806b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26806b.dismiss();
                        return;
                    case 1:
                        wu.m(this.f26806b, view3);
                        return;
                    case 2:
                        wu wuVar2 = this.f26806b;
                        wuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = wuVar2.f30188r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new x1(28));
                        }
                        wuVar2.dismiss();
                        return;
                    default:
                        wu wuVar3 = this.f26806b;
                        nf.f.s(wuVar3.f30188r, wuVar3.I);
                        wuVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = o91.a(str4) || o91.a(str3);
        o91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            k91 k91Var = o91Var.f27005f0;
            k91Var.setVisibility(4);
            k91Var.d(false, false);
            o91Var.j(true, false);
        }
        e3Var.setDelegate(new tu(e3Var, z12));
        e3Var.F = new uu(e3Var, ApplicationLoader.applicationContext);
        String e = o91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            quVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            quVar.setKeepScreenOn(true);
            o91Var.setVisibility(4);
            o91Var.getControlsView().setVisibility(4);
            o91Var.getTextureView().setVisibility(4);
            if (o91Var.getTextureImageView() != null) {
                o91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(e3Var.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (e3Var.F.canDetectOrientation()) {
            e3Var.F.enable();
        } else {
            e3Var.F.disable();
            e3Var.F = null;
        }
        S = e3Var;
        e3Var.setCalcMandatoryInsets(z10);
        e3Var.show();
    }

    public static void m(wu wuVar, View view) {
        boolean z10;
        og0 og0Var = og0.f27047p0;
        if (og0Var.P) {
            og0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new ou(0, view), 300L);
            return;
        }
        if (wuVar.f30192y && "inapp".equals(MessagesController.getInstance(wuVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !wuVar.G()) || wuVar.f30187n.getVisibility() == 0) {
            return;
        }
        if (og0.x(z10, wuVar.f30188r, null, wuVar.f30184b, wuVar.G, wuVar.H, false)) {
            og0Var.U = wuVar;
        }
        if (wuVar.f30192y) {
            wuVar.f30184b.evaluateJavascript("hideControls();", null);
        }
        wuVar.containerView.setTranslationY(0.0f);
        wuVar.dismissInternal();
    }

    public final boolean G() {
        Activity activity = this.f30188r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
            e5.B(activity, null, false);
            return false;
        }
        return true;
    }

    public final void H() {
        qu quVar = this.f30184b;
        if (quVar != null && quVar.getVisibility() == 0) {
            this.f30190w.removeView(quVar);
            quVar.stopLoading();
            quVar.loadUrl("about:blank");
            quVar.destroy();
        }
        og0.j(false);
        o91 o91Var = this.f30185c;
        if (o91Var != null) {
            o91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f30184b != null && og0.f27047p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f30188r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f30192y) {
                this.f30184b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f30184b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30184b);
            }
            ai.f0 f0Var = this.f30190w;
            qu quVar = this.f30184b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(quVar, 0, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            og0.j(true);
        }
    }

    public final void K() {
        o91 o91Var = this.f30185c;
        View aspectRatioView = o91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!o91Var.f() && !this.O) {
            TextureView textureView = o91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = o91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = o91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        o91 o91Var = this.f30185c;
        if (o91Var.getVisibility() == 0 && o91Var.T) {
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
        uu uuVar = this.F;
        if (uuVar != null) {
            uuVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        o91 o91Var = this.f30185c;
        if (o91Var.getVisibility() == 0 && o91Var.f27014w && !o91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = o91Var.T;
                if (!z10 && !z10) {
                    o91Var.T = true;
                    o91Var.m();
                    o91Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = o91Var.T;
            if (z11 && z11) {
                o91Var.T = false;
                o91Var.m();
                o91Var.l(false);
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
                o91 o91Var = this.f30185c;
                TextureView textureView = o91Var.d;
                ImageView imageView = o91Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        o91Var.h = createBitmap;
                        o91Var.f27011n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = o91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            o91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (o91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(o91Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                og0.j(false);
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
        if (view == this.f30185c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        o91 o91Var = this.f30185c;
        if (view == o91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = o91Var.getMeasuredWidth();
            int measuredHeight = o91Var.getAspectRatioView().getMeasuredHeight();
            if (o91Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
