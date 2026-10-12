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
public final class ov extends org.telegram.ui.ActionBar.e3 {
    public static ov S;
    public int[] E;
    public mv F;
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
    public hv R;
    public iv f29299b;
    public ma1 f29300c;
    public View d;
    public FrameLayout f29301e;
    public WebChromeClient.CustomViewCallback f29302f;
    public View h;
    public RadialProgressView f29303n;
    public Activity f29304r;
    public LinearLayout f29305s;
    public TextView v;
    public ai.f0 f29306w;
    public ImageView f29307x;
    public boolean f29308y;

    public static void J(org.telegram.ui.ActionBar.m2 m2Var, MessageObject messageObject, org.telegram.ui.wu0 wu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        ov ovVar = S;
        if (ovVar != null) {
            ovVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : ma1.e(str4)) != null) {
            PhotoViewer.t1().K2(null, m2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, wu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        final ?? e3Var = new org.telegram.ui.ActionBar.e3(parentActivity, false);
        e3Var.E = new int[2];
        e3Var.L = -2;
        e3Var.R = new hv(e3Var);
        e3Var.fullWidth = true;
        e3Var.setApplyTopPadding(false);
        e3Var.setApplyBottomPadding(false);
        e3Var.Q = i12;
        if (parentActivity != null) {
            e3Var.f29304r = parentActivity;
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
        e3Var.f29301e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        e3Var.container.addView(frameLayout, w7.w5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0((Object) e3Var, parentActivity, 12);
        e3Var.f29306w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        e3Var.setCustomView(f0Var);
        iv ivVar = new iv(e3Var, parentActivity, parentActivity, 0);
        e3Var.f29299b = ivVar;
        ivVar.getSettings().setJavaScriptEnabled(true);
        ivVar.getSettings().setDomStorageEnabled(true);
        ivVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ivVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ivVar, true);
        ivVar.setWebChromeClient(new org.telegram.ui.p1(e3Var, 1));
        ivVar.setWebViewClient(new jv(e3Var));
        f0Var.addView(ivVar, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        ma1 ma1Var = new ma1(parentActivity, true, new kv(e3Var));
        e3Var.f29300c = ma1Var;
        ma1Var.setVisibility(4);
        f0Var.addView(ma1Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        e3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        e3Var.f29303n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 77.0f, -1, 83));
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
        f0Var.addView(textView2, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 57.0f, -1, 83));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false));
        f0Var.addView(frameLayout2, w7.w5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.w5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f20762o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.w5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(e3Var) {
            public final ov f26175b;

            {
                this.f26175b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26175b.dismiss();
                        return;
                    case 1:
                        ov.o(this.f26175b, view3);
                        return;
                    case 2:
                        ov ovVar2 = this.f26175b;
                        ovVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ovVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = ovVar2.f29304r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        ovVar2.dismiss();
                        return;
                    default:
                        ov ovVar3 = this.f26175b;
                        of.f.s(ovVar3.f29304r, ovVar3.I);
                        ovVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        e3Var.f29305s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.w5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        e3Var.f29307x = imageView;
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
        linearLayout2.addView(imageView, w7.w5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 51));
        imageView.setOnClickListener(new View.OnClickListener(e3Var) {
            public final ov f26175b;

            {
                this.f26175b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26175b.dismiss();
                        return;
                    case 1:
                        ov.o(this.f26175b, view3);
                        return;
                    case 2:
                        ov ovVar2 = this.f26175b;
                        ovVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ovVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = ovVar2.f29304r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        ovVar2.dismiss();
                        return;
                    default:
                        ov ovVar3 = this.f26175b;
                        of.f.s(ovVar3.f29304r, ovVar3.I);
                        ovVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(e3Var) {
            public final ov f26175b;

            {
                this.f26175b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26175b.dismiss();
                        return;
                    case 1:
                        ov.o(this.f26175b, view3);
                        return;
                    case 2:
                        ov ovVar2 = this.f26175b;
                        ovVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ovVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = ovVar2.f29304r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        ovVar2.dismiss();
                        return;
                    default:
                        ov ovVar3 = this.f26175b;
                        of.f.s(ovVar3.f29304r, ovVar3.I);
                        ovVar3.dismiss();
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
        linearLayout2.addView(imageView2, w7.w5.e(48, 48, 51));
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
        linearLayout.addView(textView4, w7.w5.e(-2, -1, 51));
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
        linearLayout.addView(textView5, w7.w5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(e3Var) {
            public final ov f26175b;

            {
                this.f26175b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f26175b.dismiss();
                        return;
                    case 1:
                        ov.o(this.f26175b, view3);
                        return;
                    case 2:
                        ov ovVar2 = this.f26175b;
                        ovVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ovVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = ovVar2.f29304r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        ovVar2.dismiss();
                        return;
                    default:
                        ov ovVar3 = this.f26175b;
                        of.f.s(ovVar3.f29304r, ovVar3.I);
                        ovVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = ma1.a(str4) || ma1.a(str3);
        ma1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            ia1 ia1Var = ma1Var.f28508f0;
            ia1Var.setVisibility(4);
            ia1Var.d(false, false);
            ma1Var.j(true, false);
        }
        e3Var.setDelegate(new lv(e3Var, z12));
        e3Var.F = new mv(e3Var, ApplicationLoader.applicationContext);
        String e7 = ma1.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            ivVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            ivVar.setKeepScreenOn(true);
            ma1Var.setVisibility(4);
            ma1Var.getControlsView().setVisibility(4);
            ma1Var.getTextureView().setVisibility(4);
            if (ma1Var.getTextureImageView() != null) {
                ma1Var.getTextureImageView().setVisibility(4);
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

    public static void o(ov ovVar, View view) {
        boolean z10;
        jh0 jh0Var = jh0.f27497p0;
        if (jh0Var.P) {
            jh0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new gv(0, view), 300L);
            return;
        }
        if (ovVar.f29308y && "inapp".equals(MessagesController.getInstance(ovVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Activity activity = ovVar.f29304r;
            if (activity != null) {
                if (!Settings.canDrawOverlays(activity)) {
                    g5.A(activity, null, false);
                    return;
                }
            } else {
                return;
            }
        }
        if (ovVar.f29303n.getVisibility() == 0) {
            return;
        }
        if (jh0.x(z10, ovVar.f29304r, null, ovVar.f29299b, ovVar.G, ovVar.H, false)) {
            jh0Var.U = ovVar;
        }
        if (ovVar.f29308y) {
            ovVar.f29299b.evaluateJavascript("hideControls();", null);
        }
        ovVar.containerView.setTranslationY(0.0f);
        ovVar.dismissInternal();
    }

    public final void H() {
        iv ivVar = this.f29299b;
        if (ivVar != null && ivVar.getVisibility() == 0) {
            this.f29306w.removeView(ivVar);
            ivVar.stopLoading();
            ivVar.loadUrl("about:blank");
            ivVar.destroy();
        }
        jh0.j(false);
        ma1 ma1Var = this.f29300c;
        if (ma1Var != null) {
            ma1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f29299b != null && jh0.f27497p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f29304r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f29308y) {
                this.f29299b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f29299b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f29299b);
            }
            ai.f0 f0Var = this.f29306w;
            iv ivVar = this.f29299b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            f0Var.addView(ivVar, 0, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, i10 + 84, -1, 51));
            setShowWithoutAnimation(true);
            show();
            jh0.j(true);
        }
    }

    public final void K() {
        ma1 ma1Var = this.f29300c;
        View aspectRatioView = ma1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!ma1Var.f() && !this.O) {
            TextureView textureView = ma1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = ma1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = ma1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        ma1 ma1Var = this.f29300c;
        if (ma1Var.getVisibility() == 0 && ma1Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f29301e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        mv mvVar = this.F;
        if (mvVar != null) {
            mvVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ma1 ma1Var = this.f29300c;
        if (ma1Var.getVisibility() == 0 && ma1Var.f28517w && !ma1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = ma1Var.T;
                if (!z10 && !z10) {
                    ma1Var.T = true;
                    ma1Var.m();
                    ma1Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = ma1Var.T;
            if (z11 && z11) {
                ma1Var.T = false;
                ma1Var.m();
                ma1Var.l(false);
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
                ma1 ma1Var = this.f29300c;
                TextureView textureView = ma1Var.d;
                ImageView imageView = ma1Var.f28505e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ma1Var.h = createBitmap;
                        ma1Var.f28514n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = ma1Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            ma1Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ma1Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ma1Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                jh0.j(false);
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
        if (view == this.f29300c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        ma1 ma1Var = this.f29300c;
        if (view == ma1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = ma1Var.getMeasuredWidth();
            int measuredHeight = ma1Var.getAspectRatioView().getMeasuredHeight();
            if (ma1Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
