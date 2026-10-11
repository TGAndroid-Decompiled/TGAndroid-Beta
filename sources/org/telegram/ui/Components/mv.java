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
    public gv f28942b;
    public ha1 f28943c;
    public View d;
    public FrameLayout f28944e;
    public WebChromeClient.CustomViewCallback f28945f;
    public View h;
    public RadialProgressView f28946n;
    public Activity f28947r;
    public LinearLayout f28948s;
    public TextView v;
    public ai.f0 f28949w;
    public ImageView f28950x;
    public boolean f28951y;

    public static void J(org.telegram.ui.ActionBar.m2 m2Var, MessageObject messageObject, org.telegram.ui.tu0 tu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        mv mvVar = S;
        if (mvVar != null) {
            mvVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : ha1.e(str4)) != null) {
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
            e3Var.f28947r = parentActivity;
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
        e3Var.f28944e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        e3Var.container.addView(frameLayout, w7.x5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) e3Var, parentActivity, 12);
        e3Var.f28949w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        e3Var.setCustomView(f0Var);
        gv gvVar = new gv(e3Var, parentActivity, parentActivity, 0);
        e3Var.f28942b = gvVar;
        gvVar.getSettings().setJavaScriptEnabled(true);
        gvVar.getSettings().setDomStorageEnabled(true);
        gvVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        gvVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(gvVar, true);
        gvVar.setWebChromeClient(new org.telegram.ui.o1(e3Var, 1));
        gvVar.setWebViewClient(new hv(e3Var));
        f0Var.addView(gvVar, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        ha1 ha1Var = new ha1(parentActivity, true, new iv(e3Var));
        e3Var.f28943c = ha1Var;
        ha1Var.setVisibility(4);
        f0Var.addView(ha1Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        e3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        e3Var.f28946n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930j5, false));
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
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20893h5, false));
        f0Var.addView(frameLayout2, w7.x5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f21024o5;
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
            public final mv f25878b;

            {
                this.f25878b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25878b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25878b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25878b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28947r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25878b;
                        of.f.s(mvVar3.f28947r, mvVar3.I);
                        mvVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        e3Var.f28948s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.x5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        e3Var.f28950x = imageView;
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
            public final mv f25878b;

            {
                this.f25878b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25878b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25878b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25878b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28947r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25878b;
                        of.f.s(mvVar3.f28947r, mvVar3.I);
                        mvVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(e3Var) {
            public final mv f25878b;

            {
                this.f25878b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25878b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25878b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25878b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28947r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25878b;
                        of.f.s(mvVar3.f28947r, mvVar3.I);
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
            public final mv f25878b;

            {
                this.f25878b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f25878b.dismiss();
                        return;
                    case 1:
                        mv.o(this.f25878b, view3);
                        return;
                    case 2:
                        mv mvVar2 = this.f25878b;
                        mvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mvVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = mvVar2.f28947r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new e2(22));
                        }
                        mvVar2.dismiss();
                        return;
                    default:
                        mv mvVar3 = this.f25878b;
                        of.f.s(mvVar3.f28947r, mvVar3.I);
                        mvVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = ha1.a(str4) || ha1.a(str3);
        ha1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            da1 da1Var = ha1Var.f27048f0;
            da1Var.setVisibility(4);
            da1Var.d(false, false);
            ha1Var.j(true, false);
        }
        e3Var.setDelegate(new jv(e3Var, z12));
        e3Var.F = new kv(e3Var, ApplicationLoader.applicationContext);
        String e7 = ha1.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            gvVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            gvVar.setKeepScreenOn(true);
            ha1Var.setVisibility(4);
            ha1Var.getControlsView().setVisibility(4);
            ha1Var.getTextureView().setVisibility(4);
            if (ha1Var.getTextureImageView() != null) {
                ha1Var.getTextureImageView().setVisibility(4);
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
        hh0 hh0Var = hh0.f27101p0;
        if (hh0Var.P) {
            hh0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new ev(0, view), 300L);
            return;
        }
        if (mvVar.f28951y && "inapp".equals(MessagesController.getInstance(mvVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Activity activity = mvVar.f28947r;
            if (activity != null) {
                if (!Settings.canDrawOverlays(activity)) {
                    g5.A(activity, null, false);
                    return;
                }
            } else {
                return;
            }
        }
        if (mvVar.f28946n.getVisibility() == 0) {
            return;
        }
        if (hh0.x(z10, mvVar.f28947r, null, mvVar.f28942b, mvVar.G, mvVar.H, false)) {
            hh0Var.U = mvVar;
        }
        if (mvVar.f28951y) {
            mvVar.f28942b.evaluateJavascript("hideControls();", null);
        }
        mvVar.containerView.setTranslationY(0.0f);
        mvVar.dismissInternal();
    }

    public final void H() {
        gv gvVar = this.f28942b;
        if (gvVar != null && gvVar.getVisibility() == 0) {
            this.f28949w.removeView(gvVar);
            gvVar.stopLoading();
            gvVar.loadUrl("about:blank");
            gvVar.destroy();
        }
        hh0.j(false);
        ha1 ha1Var = this.f28943c;
        if (ha1Var != null) {
            ha1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f28942b != null && hh0.f27101p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f28947r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f28951y) {
                this.f28942b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f28942b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f28942b);
            }
            ai.f0 f0Var = this.f28949w;
            gv gvVar = this.f28942b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(gvVar, 0, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, i10 + 84, -1, 51));
            setShowWithoutAnimation(true);
            show();
            hh0.j(true);
        }
    }

    public final void K() {
        ha1 ha1Var = this.f28943c;
        View aspectRatioView = ha1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!ha1Var.f() && !this.O) {
            TextureView textureView = ha1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = ha1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = ha1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        ha1 ha1Var = this.f28943c;
        if (ha1Var.getVisibility() == 0 && ha1Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f28944e.getVisibility() != 0) {
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
        ha1 ha1Var = this.f28943c;
        if (ha1Var.getVisibility() == 0 && ha1Var.f27057w && !ha1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = ha1Var.T;
                if (!z10 && !z10) {
                    ha1Var.T = true;
                    ha1Var.m();
                    ha1Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = ha1Var.T;
            if (z11 && z11) {
                ha1Var.T = false;
                ha1Var.m();
                ha1Var.l(false);
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
                ha1 ha1Var = this.f28943c;
                TextureView textureView = ha1Var.d;
                ImageView imageView = ha1Var.f27045e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ha1Var.h = createBitmap;
                        ha1Var.f27054n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = ha1Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            ha1Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ha1Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ha1Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                hh0.j(false);
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
        if (view == this.f28943c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        ha1 ha1Var = this.f28943c;
        if (view == ha1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = ha1Var.getMeasuredWidth();
            int measuredHeight = ha1Var.getAspectRatioView().getMeasuredHeight();
            if (ha1Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
