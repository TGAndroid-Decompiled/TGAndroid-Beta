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
public final class zu extends org.telegram.ui.ActionBar.f3 {
    public static zu S;
    public int[] E;
    public xu F;
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
    public su R;
    public tu f33645b;
    public z91 f33646c;
    public View d;
    public FrameLayout f33647e;
    public WebChromeClient.CustomViewCallback f33648f;
    public View h;
    public RadialProgressView f33649n;
    public Activity f33650r;
    public LinearLayout f33651s;
    public TextView v;
    public ai.f0 f33652w;
    public ImageView f33653x;
    public boolean f33654y;

    public static void H(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.ou0 ou0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        zu zuVar = S;
        if (zuVar != null) {
            zuVar.F();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : z91.e(str4)) != null) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, ou0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final ?? f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, false);
        f3Var.E = new int[2];
        f3Var.L = -2;
        f3Var.R = new su(f3Var);
        f3Var.fullWidth = true;
        f3Var.setApplyTopPadding(false);
        f3Var.setApplyBottomPadding(false);
        f3Var.Q = i12;
        if (parentActivity != null) {
            f3Var.f33650r = parentActivity;
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
        f3Var.f33647e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        f3Var.container.addView(frameLayout, w7.z5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) f3Var, parentActivity, 12);
        f3Var.f33652w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        f3Var.setCustomView(f0Var);
        tu tuVar = new tu(f3Var, parentActivity, parentActivity, 0);
        f3Var.f33645b = tuVar;
        tuVar.getSettings().setJavaScriptEnabled(true);
        tuVar.getSettings().setDomStorageEnabled(true);
        tuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        tuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(tuVar, true);
        tuVar.setWebChromeClient(new org.telegram.ui.p1(f3Var, 1));
        tuVar.setWebViewClient(new uu(f3Var));
        f0Var.addView(tuVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        z91 z91Var = new z91(parentActivity, true, new vu(f3Var));
        f3Var.f33646c = z91Var;
        z91Var.setVisibility(4);
        f0Var.addView(z91Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        f3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        f3Var.f33649n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20926j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        f0Var.addView(textView2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20890h5, false));
        f0Var.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.i6.f21020o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.i6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(f3Var) {
            public final zu f29742b;

            {
                this.f29742b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f29742b.dismiss();
                        return;
                    case 1:
                        zu.m(this.f29742b, view3);
                        return;
                    case 2:
                        zu zuVar2 = this.f29742b;
                        zuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar2.f33650r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar2.dismiss();
                        return;
                    default:
                        zu zuVar3 = this.f29742b;
                        nf.f.s(zuVar3.f33650r, zuVar3.I);
                        zuVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        f3Var.f33651s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        f3Var.f33653x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.z5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(f3Var) {
            public final zu f29742b;

            {
                this.f29742b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f29742b.dismiss();
                        return;
                    case 1:
                        zu.m(this.f29742b, view3);
                        return;
                    case 2:
                        zu zuVar2 = this.f29742b;
                        zuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar2.f33650r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar2.dismiss();
                        return;
                    default:
                        zu zuVar3 = this.f29742b;
                        nf.f.s(zuVar3.f33650r, zuVar3.I);
                        zuVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(f3Var) {
            public final zu f29742b;

            {
                this.f29742b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f29742b.dismiss();
                        return;
                    case 1:
                        zu.m(this.f29742b, view3);
                        return;
                    case 2:
                        zu zuVar2 = this.f29742b;
                        zuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar2.f33650r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar2.dismiss();
                        return;
                    default:
                        zu zuVar3 = this.f29742b;
                        nf.f.s(zuVar3.f33650r, zuVar3.I);
                        zuVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        f3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(f3Var) {
            public final zu f29742b;

            {
                this.f29742b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f29742b.dismiss();
                        return;
                    case 1:
                        zu.m(this.f29742b, view3);
                        return;
                    case 2:
                        zu zuVar2 = this.f29742b;
                        zuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar2.f33650r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar2.dismiss();
                        return;
                    default:
                        zu zuVar3 = this.f29742b;
                        nf.f.s(zuVar3.f33650r, zuVar3.I);
                        zuVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = z91.a(str4) || z91.a(str3);
        z91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            v91 v91Var = z91Var.f33450f0;
            v91Var.setVisibility(4);
            v91Var.d(false, false);
            z91Var.j(true, false);
        }
        f3Var.setDelegate(new wu(f3Var, z12));
        f3Var.F = new xu(f3Var, ApplicationLoader.applicationContext);
        String e7 = z91.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            tuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            tuVar.setKeepScreenOn(true);
            z91Var.setVisibility(4);
            z91Var.getControlsView().setVisibility(4);
            z91Var.getTextureView().setVisibility(4);
            if (z91Var.getTextureImageView() != null) {
                z91Var.getTextureImageView().setVisibility(4);
            }
            if (e7 != null && "disabled".equals(MessagesController.getInstance(f3Var.currentAccount).youtubePipType)) {
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

    public static void m(zu zuVar, View view) {
        boolean z10;
        rg0 rg0Var = rg0.f30378p0;
        if (rg0Var.P) {
            rg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new qu(0, view), 300L);
            return;
        }
        if (zuVar.f33654y && "inapp".equals(MessagesController.getInstance(zuVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !zuVar.E()) || zuVar.f33649n.getVisibility() == 0) {
            return;
        }
        if (rg0.x(z10, zuVar.f33650r, null, zuVar.f33645b, zuVar.G, zuVar.H, false)) {
            rg0Var.U = zuVar;
        }
        if (zuVar.f33654y) {
            zuVar.f33645b.evaluateJavascript("hideControls();", null);
        }
        zuVar.containerView.setTranslationY(0.0f);
        zuVar.dismissInternal();
    }

    public final boolean E() {
        Activity activity = this.f33650r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
            e5.B(activity, null, false);
            return false;
        }
        return true;
    }

    public final void F() {
        tu tuVar = this.f33645b;
        if (tuVar != null && tuVar.getVisibility() == 0) {
            this.f33652w.removeView(tuVar);
            tuVar.stopLoading();
            tuVar.loadUrl("about:blank");
            tuVar.destroy();
        }
        rg0.j(false);
        z91 z91Var = this.f33646c;
        if (z91Var != null) {
            z91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void G() {
        int i10;
        if (this.f33645b != null && rg0.f30378p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f33650r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f33654y) {
                this.f33645b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f33645b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f33645b);
            }
            ai.f0 f0Var = this.f33652w;
            tu tuVar = this.f33645b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(tuVar, 0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            rg0.j(true);
        }
    }

    public final void I() {
        z91 z91Var = this.f33646c;
        View aspectRatioView = z91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!z91Var.f() && !this.O) {
            TextureView textureView = z91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = z91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = z91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        z91 z91Var = this.f33646c;
        if (z91Var.getVisibility() == 0 && z91Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f33647e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        xu xuVar = this.F;
        if (xuVar != null) {
            xuVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        z91 z91Var = this.f33646c;
        if (z91Var.getVisibility() == 0 && z91Var.f33459w && !z91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = z91Var.T;
                if (!z10 && !z10) {
                    z91Var.T = true;
                    z91Var.m();
                    z91Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = z91Var.T;
            if (z11 && z11) {
                z91Var.T = false;
                z91Var.m();
                z91Var.l(false);
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
                z91 z91Var = this.f33646c;
                TextureView textureView = z91Var.d;
                ImageView imageView = z91Var.f33447e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        z91Var.h = createBitmap;
                        z91Var.f33456n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = z91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            z91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (z91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(z91Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                rg0.j(false);
                return;
            }
            this.container.invalidate();
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        I();
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f33646c.getControlsView()) {
            I();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        z91 z91Var = this.f33646c;
        if (view == z91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = z91Var.getMeasuredWidth();
            int measuredHeight = z91Var.getAspectRatioView().getMeasuredHeight();
            if (z91Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
