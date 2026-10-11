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
public final class mv extends org.telegram.ui.ActionBar.e3 {
    public static mv S;
    public int[] E;
    public kv F;
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
    public fv R;
    public gv f28864b;
    public ia1 f28865c;
    public View d;
    public FrameLayout f28866e;
    public WebChromeClient.CustomViewCallback f28867f;
    public View h;
    public RadialProgressView f28868n;
    public Activity f28869r;
    public LinearLayout f28870s;
    public TextView v;
    public ai.f0 f28871w;
    public ImageView f28872x;
    public boolean f28873y;

    public static void J(org.telegram.ui.ActionBar.m2 m2Var, MessageObject messageObject, org.telegram.ui.tu0 tu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        mv mvVar = S;
        if (mvVar != null) {
            mvVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : ia1.e(str4)) != null) {
            PhotoViewer.t1().K2(null, m2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, tu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        final ?? e3Var = new org.telegram.ui.ActionBar.e3(parentActivity, false);
        e3Var.E = new int[2];
        e3Var.L = -2;
        e3Var.R = new fv(e3Var);
        e3Var.fullWidth = true;
        e3Var.setApplyTopPadding(false);
        e3Var.setApplyBottomPadding(false);
        e3Var.Q = i12;
        if (parentActivity != null) {
            e3Var.f28869r = parentActivity;
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
        e3Var.f28866e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        e3Var.container.addView(frameLayout, w7.x5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) e3Var, parentActivity, 12);
        e3Var.f28871w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        e3Var.setCustomView(f0Var);
        gv gvVar = new gv(e3Var, parentActivity, parentActivity, 0);
        e3Var.f28864b = gvVar;
        gvVar.getSettings().setJavaScriptEnabled(true);
        gvVar.getSettings().setDomStorageEnabled(true);
        gvVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        gvVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(gvVar, true);
        gvVar.setWebChromeClient(new org.telegram.ui.o1(e3Var, 1));
        gvVar.setWebViewClient(new hv(e3Var));
        f0Var.addView(gvVar, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        ia1 ia1Var = new ia1(parentActivity, true, new iv(e3Var));
        e3Var.f28865c = ia1Var;
        ia1Var.setVisibility(4);
        f0Var.addView(ia1Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        e3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        e3Var.f28868n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 77.0f, -1, 83));
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
        f0Var.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 57.0f, -1, 83));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
        f0Var.addView(frameLayout2, w7.x5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f20988o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.x5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(e3Var) {
            public final mv f25677b;

            {
                this.f25677b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25677b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25677b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25677b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28869r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25677b;
                        of.f.s(mvVar3.f28869r, mvVar3.I);
                        mvVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        e3Var.f28870s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.x5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        e3Var.f28872x = imageView;
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
        linearLayout2.addView(imageView, w7.x5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 51));
        imageView.setOnClickListener(new View.OnClickListener(e3Var) {
            public final mv f25677b;

            {
                this.f25677b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25677b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25677b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25677b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28869r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25677b;
                        of.f.s(mvVar3.f28869r, mvVar3.I);
                        mvVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(e3Var) {
            public final mv f25677b;

            {
                this.f25677b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25677b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25677b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25677b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28869r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25677b;
                        of.f.s(mvVar3.f28869r, mvVar3.I);
                        mvVar3.dismiss();
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
        linearLayout2.addView(imageView2, w7.x5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        e3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
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
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(e3Var) {
            public final mv f25677b;

            {
                this.f25677b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25677b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25677b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25677b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28869r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25677b;
                        of.f.s(mvVar3.f28869r, mvVar3.I);
                        mvVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = ia1.a(str4) || ia1.a(str3);
        ia1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            ea1 ea1Var = ia1Var.f27256f0;
            ea1Var.setVisibility(4);
            ea1Var.d(false, false);
            ia1Var.j(true, false);
        }
        e3Var.setDelegate(new jv(e3Var, z12));
        e3Var.F = new kv(e3Var, ApplicationLoader.applicationContext);
        String e7 = ia1.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            gvVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            gvVar.setKeepScreenOn(true);
            ia1Var.setVisibility(4);
            ia1Var.getControlsView().setVisibility(4);
            ia1Var.getTextureView().setVisibility(4);
            if (ia1Var.getTextureImageView() != null) {
                ia1Var.getTextureImageView().setVisibility(4);
            }
            if (e7 != null && "disabled".equals(MessagesController.getInstance(e3Var.currentAccount).youtubePipType)) {
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

    public static void o(mv mvVar, View view) {
        boolean z10;
        ih0 ih0Var = ih0.f27325p0;
        if (ih0Var.P) {
            ih0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new ev(0, view), 300L);
            return;
        }
        if (mvVar.f28873y && "inapp".equals(MessagesController.getInstance(mvVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Activity activity = mvVar.f28869r;
            if (activity != null) {
                if (!Settings.canDrawOverlays(activity)) {
                    g5.A(activity, null, false);
                    return;
                }
            } else {
                return;
            }
        }
        if (mvVar.f28868n.getVisibility() == 0) {
            return;
        }
        if (ih0.x(z10, mvVar.f28869r, null, mvVar.f28864b, mvVar.G, mvVar.H, false)) {
            ih0Var.U = mvVar;
        }
        if (mvVar.f28873y) {
            mvVar.f28864b.evaluateJavascript("hideControls();", null);
        }
        mvVar.containerView.setTranslationY(0.0f);
        mvVar.dismissInternal();
    }

    public final void H() {
        gv gvVar = this.f28864b;
        if (gvVar != null && gvVar.getVisibility() == 0) {
            this.f28871w.removeView(gvVar);
            gvVar.stopLoading();
            gvVar.loadUrl("about:blank");
            gvVar.destroy();
        }
        ih0.j(false);
        ia1 ia1Var = this.f28865c;
        if (ia1Var != null) {
            ia1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f28864b != null && ih0.f27325p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f28869r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f28873y) {
                this.f28864b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f28864b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f28864b);
            }
            ai.f0 f0Var = this.f28871w;
            gv gvVar = this.f28864b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(gvVar, 0, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, i10 + 84, -1, 51));
            setShowWithoutAnimation(true);
            show();
            ih0.j(true);
        }
    }

    public final void K() {
        ia1 ia1Var = this.f28865c;
        View aspectRatioView = ia1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!ia1Var.f() && !this.O) {
            TextureView textureView = ia1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = ia1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = ia1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        ia1 ia1Var = this.f28865c;
        if (ia1Var.getVisibility() == 0 && ia1Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f28866e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        kv kvVar = this.F;
        if (kvVar != null) {
            kvVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ia1 ia1Var = this.f28865c;
        if (ia1Var.getVisibility() == 0 && ia1Var.f27265w && !ia1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = ia1Var.T;
                if (!z10 && !z10) {
                    ia1Var.T = true;
                    ia1Var.m();
                    ia1Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = ia1Var.T;
            if (z11 && z11) {
                ia1Var.T = false;
                ia1Var.m();
                ia1Var.l(false);
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
                ia1 ia1Var = this.f28865c;
                TextureView textureView = ia1Var.d;
                ImageView imageView = ia1Var.f27253e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ia1Var.h = createBitmap;
                        ia1Var.f27262n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = ia1Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            ia1Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ia1Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ia1Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ih0.j(false);
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
        if (view == this.f28865c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        ia1 ia1Var = this.f28865c;
        if (view == ia1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = ia1Var.getMeasuredWidth();
            int measuredHeight = ia1Var.getAspectRatioView().getMeasuredHeight();
            if (ia1Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
