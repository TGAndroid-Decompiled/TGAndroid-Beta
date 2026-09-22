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
public final class vu extends org.telegram.ui.ActionBar.f3 {
    public static vu S;
    public int[] E;
    public tu F;
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
    public ou R;
    public pu f29797b;
    public r91 f29798c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f29799f;
    public View h;
    public RadialProgressView f29800n;
    public Activity f29801r;
    public LinearLayout f29802s;
    public TextView v;
    public ai.f0 f29803w;
    public ImageView f29804x;
    public boolean f29805y;

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.tu0 tu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        vu vuVar = S;
        if (vuVar != null) {
            vuVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : r91.e(str4)) != null) {
            PhotoViewer.t1().J2(null, n2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, tu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final ?? f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, false);
        f3Var.E = new int[2];
        f3Var.L = -2;
        f3Var.R = new ou(f3Var);
        f3Var.fullWidth = true;
        f3Var.setApplyTopPadding(false);
        f3Var.setApplyBottomPadding(false);
        f3Var.Q = i12;
        if (parentActivity != null) {
            f3Var.f29801r = parentActivity;
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
        frameLayout.setOnTouchListener(new bi.d(17));
        f3Var.container.addView(frameLayout, w7.y5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) f3Var, parentActivity, 12);
        f3Var.f29803w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        f3Var.setCustomView(f0Var);
        pu puVar = new pu(f3Var, parentActivity, parentActivity, 0);
        f3Var.f29797b = puVar;
        puVar.getSettings().setJavaScriptEnabled(true);
        puVar.getSettings().setDomStorageEnabled(true);
        puVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        puVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(puVar, true);
        puVar.setWebChromeClient(new org.telegram.ui.o1(f3Var, 1));
        puVar.setWebViewClient(new qu(f3Var));
        f0Var.addView(puVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        r91 r91Var = new r91(parentActivity, true, new ru(f3Var));
        f3Var.f29798c = r91Var;
        r91Var.setVisibility(4);
        f0Var.addView(r91Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        f3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        f3Var.f29800n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.y5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19216j5, false));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        f0Var.addView(textView2, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false));
        f0Var.addView(frameLayout2, w7.y5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.y5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f19310o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.y5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(f3Var) {
            public final vu f26547b;

            {
                this.f26547b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26547b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26547b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26547b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29801r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new i2(17));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26547b;
                        nf.f.s(vuVar3.f29801r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        f3Var.f29802s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.y5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        f3Var.f29804x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.y5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(f3Var) {
            public final vu f26547b;

            {
                this.f26547b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26547b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26547b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26547b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29801r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new i2(17));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26547b;
                        nf.f.s(vuVar3.f29801r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(f3Var) {
            public final vu f26547b;

            {
                this.f26547b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26547b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26547b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26547b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29801r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new i2(17));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26547b;
                        nf.f.s(vuVar3.f29801r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.y5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        f3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
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
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.y5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(f3Var) {
            public final vu f26547b;

            {
                this.f26547b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26547b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26547b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26547b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29801r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new i2(17));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26547b;
                        nf.f.s(vuVar3.f29801r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = r91.a(str4) || r91.a(str3);
        r91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            n91 n91Var = r91Var.f27899f0;
            n91Var.setVisibility(4);
            n91Var.d(false, false);
            r91Var.j(true, false);
        }
        f3Var.setDelegate(new su(f3Var, z12));
        f3Var.F = new tu(f3Var, ApplicationLoader.applicationContext);
        String e = r91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            puVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            puVar.setKeepScreenOn(true);
            r91Var.setVisibility(4);
            r91Var.getControlsView().setVisibility(4);
            r91Var.getTextureView().setVisibility(4);
            if (r91Var.getTextureImageView() != null) {
                r91Var.getTextureImageView().setVisibility(4);
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

    public static void m(vu vuVar, View view) {
        boolean z10;
        rg0 rg0Var = rg0.f27960p0;
        if (rg0Var.P) {
            rg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new nu(0, view), 300L);
            return;
        }
        if (vuVar.f29805y && "inapp".equals(MessagesController.getInstance(vuVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !vuVar.F()) || vuVar.f29800n.getVisibility() == 0) {
            return;
        }
        if (rg0.x(z10, vuVar.f29801r, null, vuVar.f29797b, vuVar.G, vuVar.H, false)) {
            rg0Var.U = vuVar;
        }
        if (vuVar.f29805y) {
            vuVar.f29797b.evaluateJavascript("hideControls();", null);
        }
        vuVar.containerView.setTranslationY(0.0f);
        vuVar.dismissInternal();
    }

    public final boolean F() {
        Activity activity = this.f29801r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
            d5.B(activity, null, false);
            return false;
        }
        return true;
    }

    public final void G() {
        pu puVar = this.f29797b;
        if (puVar != null && puVar.getVisibility() == 0) {
            this.f29803w.removeView(puVar);
            puVar.stopLoading();
            puVar.loadUrl("about:blank");
            puVar.destroy();
        }
        rg0.j(false);
        r91 r91Var = this.f29798c;
        if (r91Var != null) {
            r91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f29797b != null && rg0.f27960p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f29801r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f29805y) {
                this.f29797b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f29797b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f29797b);
            }
            ai.f0 f0Var = this.f29803w;
            pu puVar = this.f29797b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(puVar, 0, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            rg0.j(true);
        }
    }

    public final void K() {
        r91 r91Var = this.f29798c;
        View aspectRatioView = r91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!r91Var.f() && !this.O) {
            TextureView textureView = r91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = r91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = r91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        r91 r91Var = this.f29798c;
        if (r91Var.getVisibility() == 0 && r91Var.T) {
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
        tu tuVar = this.F;
        if (tuVar != null) {
            tuVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        r91 r91Var = this.f29798c;
        if (r91Var.getVisibility() == 0 && r91Var.f27908w && !r91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = r91Var.T;
                if (!z10 && !z10) {
                    r91Var.T = true;
                    r91Var.m();
                    r91Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = r91Var.T;
            if (z11 && z11) {
                r91Var.T = false;
                r91Var.m();
                r91Var.l(false);
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
                r91 r91Var = this.f29798c;
                TextureView textureView = r91Var.d;
                ImageView imageView = r91Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        r91Var.h = createBitmap;
                        r91Var.f27905n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = r91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            r91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (r91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(r91Var.h);
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
        K();
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f29798c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        r91 r91Var = this.f29798c;
        if (view == r91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = r91Var.getMeasuredWidth();
            int measuredHeight = r91Var.getAspectRatioView().getMeasuredHeight();
            if (r91Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
