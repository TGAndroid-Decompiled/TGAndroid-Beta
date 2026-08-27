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

public final class fu extends org.telegram.ui.ActionBar.e3 {
    public static fu O;
    public int[] A;
    public du B;
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
    public yt N;

    public zt f28450b;

    public i81 f28451c;
    public View d;

    public FrameLayout f28452e;

    public WebChromeClient.CustomViewCallback f28453f;
    public View h;

    public RadialProgressView f28454n;

    public Activity f28455r;

    public LinearLayout f28456s;
    public TextView v;

    public ag.p1 f28457w;

    public ImageView f28458x;

    public boolean f28459y;

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.st0 st0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f10;
        TLRPC.MessageMedia messageMedia;
        fu fuVar = O;
        if (fuVar != null) {
            fuVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : i81.e(str4)) != null) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, st0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final fu fuVar2 = new fu(parentActivity, false);
        fuVar2.A = new int[2];
        fuVar2.H = -2;
        fuVar2.N = new yt(fuVar2);
        fuVar2.fullWidth = true;
        fuVar2.setApplyTopPadding(false);
        fuVar2.setApplyBottomPadding(false);
        fuVar2.M = i12;
        if (parentActivity != null) {
            fuVar2.f28455r = parentActivity;
        }
        fuVar2.G = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        fuVar2.F = z11;
        fuVar2.E = str3;
        fuVar2.C = i10;
        fuVar2.D = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            fuVar2.C = point.x;
            fuVar2.D = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        fuVar2.f28452e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new kh.e(17));
        fuVar2.container.addView(frameLayout, h7.z5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ag.p1 p1Var = new ag.p1(fuVar2, parentActivity, 18);
        fuVar2.f28457w = p1Var;
        p1Var.setOnTouchListener(new kh.e(17));
        fuVar2.setCustomView(p1Var);
        zt ztVar = new zt(fuVar2, parentActivity, parentActivity, 0);
        fuVar2.f28450b = ztVar;
        ztVar.getSettings().setJavaScriptEnabled(true);
        ztVar.getSettings().setDomStorageEnabled(true);
        ztVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ztVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ztVar, true);
        ztVar.setWebChromeClient(new org.telegram.ui.s1(fuVar2, 1));
        ztVar.setWebViewClient(new au(fuVar2));
        p1Var.addView(ztVar, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        i81 i81Var = new i81(parentActivity, true, new bu(fuVar2));
        fuVar2.f28451c = i81Var;
        i81Var.setVisibility(4);
        p1Var.addView(i81Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        fuVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        p1Var.addView(view, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        fuVar2.f28454n = radialProgressView;
        radialProgressView.setVisibility(4);
        p1Var.addView(radialProgressView, h7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            p1Var.addView(textView, h7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23268p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        p1Var.addView(textView2, h7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K5, false));
        p1Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        p1Var.addView(frameLayout2, h7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, h7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.g6.f23250o5;
        org.telegram.ui.Cells.pa.s(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.g6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, h7.z5.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(fuVar2) {

            public final fu f34324b;

            {
                this.f34324b = fuVar2;
            }

            @Override
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.f34324b.dismiss();
                        break;
                    case 1:
                        fu.m(this.f34324b, view3);
                        break;
                    case 2:
                        fu fuVar3 = this.f34324b;
                        fuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fuVar3.E));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        Activity activity = fuVar3.f28455r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new c2(20));
                        }
                        fuVar3.dismiss();
                        break;
                    default:
                        fu fuVar4 = this.f34324b;
                        we.e.s(fuVar4.f28455r, fuVar4.E);
                        fuVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        fuVar2.f28456s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, h7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        fuVar2.f28458x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, h7.z5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(fuVar2) {

            public final fu f34324b;

            {
                this.f34324b = fuVar2;
            }

            @Override
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.f34324b.dismiss();
                        break;
                    case 1:
                        fu.m(this.f34324b, view3);
                        break;
                    case 2:
                        fu fuVar3 = this.f34324b;
                        fuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fuVar3.E));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        Activity activity = fuVar3.f28455r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new c2(20));
                        }
                        fuVar3.dismiss();
                        break;
                    default:
                        fu fuVar4 = this.f34324b;
                        we.e.s(fuVar4.f28455r, fuVar4.E);
                        fuVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(fuVar2) {

            public final fu f34324b;

            {
                this.f34324b = fuVar2;
            }

            @Override
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.f34324b.dismiss();
                        break;
                    case 1:
                        fu.m(this.f34324b, view3);
                        break;
                    case 2:
                        fu fuVar3 = this.f34324b;
                        fuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fuVar3.E));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        Activity activity = fuVar3.f28455r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new c2(20));
                        }
                        fuVar3.dismiss();
                        break;
                    default:
                        fu fuVar4 = this.f34324b;
                        we.e.s(fuVar4.f28455r, fuVar4.E);
                        fuVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, h7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        fuVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.pa.s(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, h7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.pa.s(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, h7.z5.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(fuVar2) {

            public final fu f34324b;

            {
                this.f34324b = fuVar2;
            }

            @Override
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.f34324b.dismiss();
                        break;
                    case 1:
                        fu.m(this.f34324b, view3);
                        break;
                    case 2:
                        fu fuVar3 = this.f34324b;
                        fuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fuVar3.E));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        Activity activity = fuVar3.f28455r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new c2(20));
                        }
                        fuVar3.dismiss();
                        break;
                    default:
                        fu fuVar4 = this.f34324b;
                        we.e.s(fuVar4.f28455r, fuVar4.E);
                        fuVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = i81.a(str4) || i81.a(str3);
        i81Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            e81 e81Var = i81Var.f29298b0;
            e81Var.setVisibility(4);
            e81Var.d(false, false);
            i81Var.j(true, false);
        }
        fuVar2.setDelegate(new cu(fuVar2, z12));
        fuVar2.B = new du(fuVar2, ApplicationLoader.applicationContext);
        String strE = i81.e(str4);
        if (strE != null || !z12) {
            radialProgressView.setVisibility(0);
            ztVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (strE != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            ztVar.setKeepScreenOn(true);
            i81Var.setVisibility(4);
            i81Var.getControlsView().setVisibility(4);
            i81Var.getTextureView().setVisibility(4);
            if (i81Var.getTextureImageView() != null) {
                i81Var.getTextureImageView().setVisibility(4);
            }
            if (strE != null && "disabled".equals(MessagesController.getInstance(fuVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (fuVar2.B.canDetectOrientation()) {
            fuVar2.B.enable();
        } else {
            fuVar2.B.disable();
            fuVar2.B = null;
        }
        O = fuVar2;
        fuVar2.setCalcMandatoryInsets(z10);
        fuVar2.show();
    }

    public static void m(fu fuVar, View view) {
        sf0 sf0Var = sf0.f32415l0;
        if (sf0Var.L) {
            sf0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new xt(0, view), 300L);
            return;
        }
        boolean z10 = fuVar.f28459y && "inapp".equals(MessagesController.getInstance(fuVar.currentAccount).youtubePipType);
        if ((z10 || fuVar.G()) && fuVar.f28454n.getVisibility() != 0) {
            if (sf0.x(z10, fuVar.f28455r, null, fuVar.f28450b, fuVar.C, fuVar.D, false)) {
                sf0Var.Q = fuVar;
            }
            if (fuVar.f28459y) {
                fuVar.f28450b.evaluateJavascript("hideControls();", null);
            }
            fuVar.containerView.setTranslationY(0.0f);
            fuVar.dismissInternal();
        }
    }

    public final boolean G() {
        Activity activity = this.f28455r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(activity)) {
            return true;
        }
        y4.B(activity, null, false);
        return false;
    }

    public final void H() {
        zt ztVar = this.f28450b;
        if (ztVar != null && ztVar.getVisibility() == 0) {
            this.f28457w.removeView(ztVar);
            ztVar.stopLoading();
            ztVar.loadUrl("about:blank");
            ztVar.destroy();
        }
        sf0.j(false);
        i81 i81Var = this.f28451c;
        if (i81Var != null) {
            i81Var.b();
        }
        O = null;
        dismissInternal();
    }

    public final void I() {
        if (this.f28450b == null || !sf0.f32415l0.L) {
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f28455r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        if (this.f28459y) {
            this.f28450b.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.f28450b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f28450b);
        }
        this.f28457w.addView(this.f28450b, 0, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.F ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        sf0.j(true);
    }

    public final void K() {
        i81 i81Var = this.f28451c;
        View aspectRatioView = i81Var.getAspectRatioView();
        int[] iArr = this.A;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!i81Var.f() && !this.K) {
            TextureView textureView = i81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = i81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = i81Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        i81 i81Var = this.f28451c;
        return (i81Var.getVisibility() == 0 && i81Var.P) ? false : true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f28452e.getVisibility() != 0;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        du duVar = this.B;
        if (duVar != null) {
            duVar.disable();
            this.B = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        i81 i81Var = this.f28451c;
        if (i81Var.getVisibility() == 0 && i81Var.f29310w && !i81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = i81Var.P;
                if (z10 || z10) {
                    return;
                }
                i81Var.P = true;
                i81Var.m();
                i81Var.l(false);
                return;
            }
            boolean z11 = i81Var.P;
            if (z11 && z11) {
                i81Var.P = false;
                i81Var.m();
                i81Var.l(false);
            }
        }
    }

    @Override
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.L;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.L = i11;
            if (i11 != 0) {
                this.container.invalidate();
                return;
            }
            i81 i81Var = this.f28451c;
            TextureView textureView = i81Var.d;
            ImageView imageView = i81Var.f29302e;
            if (imageView != null) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    i81Var.h = bitmapCreateBitmap;
                    i81Var.f29307n.getBitmap(bitmapCreateBitmap);
                } catch (Throwable th) {
                    Bitmap bitmap = i81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        i81Var.h = null;
                    }
                    FileLog.e(th);
                }
                if (i81Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(i81Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            sf0.j(false);
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        K();
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.f28451c.getControlsView()) {
            return false;
        }
        K();
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        i81 i81Var = this.f28451c;
        if (view == i81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i81Var.getMeasuredWidth();
            layoutParams.height = i81Var.getAspectRatioView().getMeasuredHeight() + (i81Var.P ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
