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
public final class gu extends org.telegram.ui.ActionBar.f3 {
    public static gu O;
    public int[] A;
    public eu B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public zt N;
    public au f28868b;
    public g81 f28869c;
    public View d;
    public FrameLayout f28870e;
    public WebChromeClient.CustomViewCallback f28871f;
    public View h;
    public RadialProgressView f28872n;
    public Activity f28873r;
    public LinearLayout f28874s;
    public TextView v;
    public fh.d2 f28875w;
    public ImageView f28876x;
    public boolean f28877y;

    public static void I(org.telegram.ui.ActionBar.o2 o2Var, MessageObject messageObject, org.telegram.ui.rt0 rt0Var, String str, String str2, String str3, String str4, int i9, int i10, int i11, boolean z10) {
        float f10;
        TLRPC.MessageMedia messageMedia;
        gu guVar = O;
        if (guVar != null) {
            guVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : g81.e(str4)) != null) {
            PhotoViewer.t1().K2(null, o2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, rt0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        final ?? f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, false);
        f3Var.A = new int[2];
        f3Var.H = -2;
        f3Var.N = new zt(f3Var);
        f3Var.fullWidth = true;
        f3Var.setApplyTopPadding(false);
        f3Var.setApplyBottomPadding(false);
        f3Var.M = i11;
        if (parentActivity != null) {
            f3Var.f28873r = parentActivity;
        }
        f3Var.G = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        f3Var.F = z11;
        f3Var.E = str3;
        f3Var.C = i9;
        f3Var.D = i10;
        if (i9 == 0 || i10 == 0) {
            Point point = AndroidUtilities.displaySize;
            f3Var.C = point.x;
            f3Var.D = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        f3Var.f28870e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new jh.d(17));
        f3Var.container.addView(frameLayout, g7.e6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        fh.d2 d2Var = new fh.d2((Object) f3Var, parentActivity, 15);
        f3Var.f28875w = d2Var;
        d2Var.setOnTouchListener(new jh.d(17));
        f3Var.setCustomView(d2Var);
        au auVar = new au(f3Var, parentActivity, parentActivity, 0);
        f3Var.f28868b = auVar;
        auVar.getSettings().setJavaScriptEnabled(true);
        auVar.getSettings().setDomStorageEnabled(true);
        auVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        auVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(auVar, true);
        auVar.setWebChromeClient(new org.telegram.ui.r1(f3Var, 1));
        auVar.setWebViewClient(new bu(f3Var));
        d2Var.addView(auVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        g81 g81Var = new g81(parentActivity, true, new cu(f3Var));
        f3Var.f28869c = g81Var;
        g81Var.setVisibility(4);
        d2Var.addView(g81Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        f3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        d2Var.addView(view, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        f3Var.f28872n = radialProgressView;
        radialProgressView.setVisibility(4);
        d2Var.addView(radialProgressView, g7.e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            d2Var.addView(textView, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23211p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        d2Var.addView(textView2, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K5, false));
        d2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        d2Var.addView(frameLayout2, g7.e6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, g7.e6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.f6.f23196o5;
        j3.r0.w(i12, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i13 = org.telegram.ui.ActionBar.f6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, g7.e6.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(f3Var) {
            public final gu f34767b;

            {
                this.f34767b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f34767b.dismiss();
                        return;
                    case 1:
                        gu.m(this.f34767b, view3);
                        return;
                    case 2:
                        gu guVar2 = this.f34767b;
                        guVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar2.f28873r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f34767b;
                        ve.e.s(guVar3.f28873r, guVar3.E);
                        guVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        f3Var.f28874s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, g7.e6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        f3Var.f28876x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        linearLayout2.addView(imageView, g7.e6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(f3Var) {
            public final gu f34767b;

            {
                this.f34767b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f34767b.dismiss();
                        return;
                    case 1:
                        gu.m(this.f34767b, view3);
                        return;
                    case 2:
                        gu guVar2 = this.f34767b;
                        guVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar2.f28873r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f34767b;
                        ve.e.s(guVar3.f28873r, guVar3.E);
                        guVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(f3Var) {
            public final gu f34767b;

            {
                this.f34767b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f34767b.dismiss();
                        return;
                    case 1:
                        gu.m(this.f34767b, view3);
                        return;
                    case 2:
                        gu guVar2 = this.f34767b;
                        guVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar2.f28873r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f34767b;
                        ve.e.s(guVar3.f28873r, guVar3.E);
                        guVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i12, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        linearLayout2.addView(imageView2, g7.e6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        f3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        j3.r0.w(i12, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, g7.e6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        j3.r0.w(i12, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, g7.e6.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(f3Var) {
            public final gu f34767b;

            {
                this.f34767b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f34767b.dismiss();
                        return;
                    case 1:
                        gu.m(this.f34767b, view3);
                        return;
                    case 2:
                        gu guVar2 = this.f34767b;
                        guVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar2.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar2.f28873r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar2.dismiss();
                        return;
                    default:
                        gu guVar3 = this.f34767b;
                        ve.e.s(guVar3.f28873r, guVar3.E);
                        guVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = g81.a(str4) || g81.a(str3);
        g81Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            c81 c81Var = g81Var.f28695b0;
            c81Var.setVisibility(4);
            c81Var.d(false, false);
            g81Var.j(true, false);
        }
        f3Var.setDelegate(new du(f3Var, z12));
        f3Var.B = new eu(f3Var, ApplicationLoader.applicationContext);
        String e10 = g81.e(str4);
        if (e10 != null || !z12) {
            radialProgressView.setVisibility(0);
            auVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e10 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            auVar.setKeepScreenOn(true);
            g81Var.setVisibility(4);
            g81Var.getControlsView().setVisibility(4);
            g81Var.getTextureView().setVisibility(4);
            if (g81Var.getTextureImageView() != null) {
                g81Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(MessagesController.getInstance(f3Var.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (f3Var.B.canDetectOrientation()) {
            f3Var.B.enable();
        } else {
            f3Var.B.disable();
            f3Var.B = null;
        }
        O = f3Var;
        f3Var.setCalcMandatoryInsets(z10);
        f3Var.show();
    }

    public static void m(gu guVar, View view) {
        boolean z10;
        pf0 pf0Var = pf0.f31622l0;
        if (pf0Var.L) {
            pf0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new yt(0, view), 300L);
            return;
        }
        if (guVar.f28877y && "inapp".equals(MessagesController.getInstance(guVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !guVar.F()) || guVar.f28872n.getVisibility() == 0) {
            return;
        }
        if (pf0.x(z10, guVar.f28873r, null, guVar.f28868b, guVar.C, guVar.D, false)) {
            pf0Var.Q = guVar;
        }
        if (guVar.f28877y) {
            guVar.f28868b.evaluateJavascript("hideControls();", null);
        }
        guVar.containerView.setTranslationY(0.0f);
        guVar.dismissInternal();
    }

    public final boolean F() {
        Activity activity = this.f28873r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
            y4.B(activity, null, false);
            return false;
        }
        return true;
    }

    public final void G() {
        au auVar = this.f28868b;
        if (auVar != null && auVar.getVisibility() == 0) {
            this.f28875w.removeView(auVar);
            auVar.stopLoading();
            auVar.loadUrl("about:blank");
            auVar.destroy();
        }
        pf0.j(false);
        g81 g81Var = this.f28869c;
        if (g81Var != null) {
            g81Var.b();
        }
        O = null;
        dismissInternal();
    }

    public final void H() {
        int i9;
        if (this.f28868b != null && pf0.f31622l0.L) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f28873r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.f28877y) {
                this.f28868b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f28868b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f28868b);
            }
            fh.d2 d2Var = this.f28875w;
            au auVar = this.f28868b;
            if (this.F) {
                i9 = 22;
            } else {
                i9 = 0;
            }
            d2Var.addView(auVar, 0, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i9 + 84));
            setShowWithoutAnimation(true);
            show();
            pf0.j(true);
        }
    }

    public final void J() {
        g81 g81Var = this.f28869c;
        View aspectRatioView = g81Var.getAspectRatioView();
        int[] iArr = this.A;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!g81Var.f() && !this.K) {
            TextureView textureView = g81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = g81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = g81Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        g81 g81Var = this.f28869c;
        if (g81Var.getVisibility() == 0 && g81Var.P) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f28870e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        eu euVar = this.B;
        if (euVar != null) {
            euVar.disable();
            this.B = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        g81 g81Var = this.f28869c;
        if (g81Var.getVisibility() == 0 && g81Var.f28707w && !g81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = g81Var.P;
                if (!z10 && !z10) {
                    g81Var.P = true;
                    g81Var.m();
                    g81Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = g81Var.P;
            if (z11 && z11) {
                g81Var.P = false;
                g81Var.m();
                g81Var.l(false);
            }
        }
    }

    @Override
    public final void onContainerDraw(Canvas canvas) {
        int i9 = this.L;
        if (i9 != 0) {
            int i10 = i9 - 1;
            this.L = i10;
            if (i10 == 0) {
                g81 g81Var = this.f28869c;
                TextureView textureView = g81Var.d;
                ImageView imageView = g81Var.f28699e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        g81Var.h = createBitmap;
                        g81Var.f28704n.getBitmap(createBitmap);
                    } catch (Throwable th) {
                        Bitmap bitmap = g81Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            g81Var.h = null;
                        }
                        FileLog.e(th);
                    }
                    if (g81Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(g81Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                pf0.j(false);
                return;
            }
            this.container.invalidate();
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        J();
    }

    @Override
    public final boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        if (view == this.f28869c.getControlsView()) {
            J();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i9, int i10) {
        int dp;
        g81 g81Var = this.f28869c;
        if (view == g81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = g81Var.getMeasuredWidth();
            int measuredHeight = g81Var.getAspectRatioView().getMeasuredHeight();
            if (g81Var.P) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
