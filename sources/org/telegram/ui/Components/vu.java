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
public final class vu extends org.telegram.ui.ActionBar.g3 {
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
    public pu f29412b;
    public d91 f29413c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f29414f;
    public View h;
    public RadialProgressView f29415n;
    public Activity f29416r;
    public LinearLayout f29417s;
    public TextView v;
    public ai.f0 f29418w;
    public ImageView f29419x;
    public boolean f29420y;

    public static void J(org.telegram.ui.ActionBar.o2 o2Var, MessageObject messageObject, org.telegram.ui.vu0 vu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        vu vuVar = S;
        if (vuVar != null) {
            vuVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : d91.e(str4)) != null) {
            PhotoViewer.t1().J2(null, o2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, vu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        final ?? g3Var = new org.telegram.ui.ActionBar.g3(parentActivity, false);
        g3Var.E = new int[2];
        g3Var.L = -2;
        g3Var.R = new ou(g3Var);
        g3Var.fullWidth = true;
        g3Var.setApplyTopPadding(false);
        g3Var.setApplyBottomPadding(false);
        g3Var.Q = i12;
        if (parentActivity != null) {
            g3Var.f29416r = parentActivity;
        }
        g3Var.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        g3Var.J = z11;
        g3Var.I = str3;
        g3Var.G = i10;
        g3Var.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            g3Var.G = point.x;
            g3Var.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        g3Var.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        g3Var.container.addView(frameLayout, w7.x5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) g3Var, parentActivity, 12);
        g3Var.f29418w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        g3Var.setCustomView(f0Var);
        pu puVar = new pu(g3Var, parentActivity, parentActivity, 0);
        g3Var.f29412b = puVar;
        puVar.getSettings().setJavaScriptEnabled(true);
        puVar.getSettings().setDomStorageEnabled(true);
        puVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        puVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(puVar, true);
        puVar.setWebChromeClient(new org.telegram.ui.o1(g3Var, 1));
        puVar.setWebViewClient(new qu(g3Var));
        f0Var.addView(puVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        d91 d91Var = new d91(parentActivity, true, new ru(g3Var));
        g3Var.f29413c = d91Var;
        d91Var.setVisibility(4);
        f0Var.addView(d91Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        g3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        g3Var.f29415n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18970j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
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
        f0Var.addView(textView2, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18934h5, false));
        f0Var.addView(frameLayout2, w7.x5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f19064o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.x5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(g3Var) {
            public final vu f26270b;

            {
                this.f26270b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26270b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26270b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26270b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29416r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new l2(13));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26270b;
                        nf.f.s(vuVar3.f29416r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        g3Var.f29417s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.x5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        g3Var.f29419x = imageView;
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
        linearLayout2.addView(imageView, w7.x5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(g3Var) {
            public final vu f26270b;

            {
                this.f26270b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26270b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26270b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26270b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29416r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new l2(13));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26270b;
                        nf.f.s(vuVar3.f29416r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(g3Var) {
            public final vu f26270b;

            {
                this.f26270b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26270b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26270b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26270b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29416r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new l2(13));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26270b;
                        nf.f.s(vuVar3.f29416r, vuVar3.I);
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
        linearLayout2.addView(imageView2, w7.x5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        g3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.x5.e(-2, -1, 51));
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
        linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(g3Var) {
            public final vu f26270b;

            {
                this.f26270b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26270b.dismiss();
                        return;
                    case 1:
                        vu.m(this.f26270b, view3);
                        return;
                    case 2:
                        vu vuVar2 = this.f26270b;
                        vuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar2.f29416r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new l2(13));
                        }
                        vuVar2.dismiss();
                        return;
                    default:
                        vu vuVar3 = this.f26270b;
                        nf.f.s(vuVar3.f29416r, vuVar3.I);
                        vuVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = d91.a(str4) || d91.a(str3);
        d91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            z81 z81Var = d91Var.f23276f0;
            z81Var.setVisibility(4);
            z81Var.d(false, false);
            d91Var.j(true, false);
        }
        g3Var.setDelegate(new su(g3Var, z12));
        g3Var.F = new tu(g3Var, ApplicationLoader.applicationContext);
        String e = d91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            puVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            puVar.setKeepScreenOn(true);
            d91Var.setVisibility(4);
            d91Var.getControlsView().setVisibility(4);
            d91Var.getTextureView().setVisibility(4);
            if (d91Var.getTextureImageView() != null) {
                d91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(g3Var.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (g3Var.F.canDetectOrientation()) {
            g3Var.F.enable();
        } else {
            g3Var.F.disable();
            g3Var.F = null;
        }
        S = g3Var;
        g3Var.setCalcMandatoryInsets(z10);
        g3Var.show();
    }

    public static void m(vu vuVar, View view) {
        boolean z10;
        fg0 fg0Var = fg0.f23914p0;
        if (fg0Var.P) {
            fg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new nu(0, view), 300L);
            return;
        }
        if (vuVar.f29420y && "inapp".equals(MessagesController.getInstance(vuVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !vuVar.G()) || vuVar.f29415n.getVisibility() == 0) {
            return;
        }
        if (fg0.x(z10, vuVar.f29416r, null, vuVar.f29412b, vuVar.G, vuVar.H, false)) {
            fg0Var.U = vuVar;
        }
        if (vuVar.f29420y) {
            vuVar.f29412b.evaluateJavascript("hideControls();", null);
        }
        vuVar.containerView.setTranslationY(0.0f);
        vuVar.dismissInternal();
    }

    public final boolean G() {
        Activity activity = this.f29416r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
            c5.B(activity, null, false);
            return false;
        }
        return true;
    }

    public final void H() {
        pu puVar = this.f29412b;
        if (puVar != null && puVar.getVisibility() == 0) {
            this.f29418w.removeView(puVar);
            puVar.stopLoading();
            puVar.loadUrl("about:blank");
            puVar.destroy();
        }
        fg0.j(false);
        d91 d91Var = this.f29413c;
        if (d91Var != null) {
            d91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f29412b != null && fg0.f23914p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f29416r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f29420y) {
                this.f29412b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f29412b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f29412b);
            }
            ai.f0 f0Var = this.f29418w;
            pu puVar = this.f29412b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(puVar, 0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            fg0.j(true);
        }
    }

    public final void K() {
        d91 d91Var = this.f29413c;
        View aspectRatioView = d91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!d91Var.f() && !this.O) {
            TextureView textureView = d91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = d91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = d91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        d91 d91Var = this.f29413c;
        if (d91Var.getVisibility() == 0 && d91Var.T) {
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
        d91 d91Var = this.f29413c;
        if (d91Var.getVisibility() == 0 && d91Var.f23285w && !d91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = d91Var.T;
                if (!z10 && !z10) {
                    d91Var.T = true;
                    d91Var.m();
                    d91Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = d91Var.T;
            if (z11 && z11) {
                d91Var.T = false;
                d91Var.m();
                d91Var.l(false);
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
                d91 d91Var = this.f29413c;
                TextureView textureView = d91Var.d;
                ImageView imageView = d91Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        d91Var.h = createBitmap;
                        d91Var.f23282n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = d91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            d91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (d91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(d91Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                fg0.j(false);
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
        if (view == this.f29413c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        d91 d91Var = this.f29413c;
        if (view == d91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = d91Var.getMeasuredWidth();
            int measuredHeight = d91Var.getAspectRatioView().getMeasuredHeight();
            if (d91Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
