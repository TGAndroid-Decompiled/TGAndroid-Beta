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
public final class hv extends org.telegram.ui.ActionBar.e3 {
    public static hv S;
    public int[] E;
    public fv F;
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
    public av R;
    public bv f25405b;
    public da1 f25406c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f25407f;
    public View h;
    public RadialProgressView f25408n;
    public Activity f25409r;
    public LinearLayout f25410s;
    public TextView v;
    public ah.x f25411w;
    public ImageView f25412x;
    public boolean f25413y;

    public static void J(org.telegram.ui.ActionBar.m2 m2Var, MessageObject messageObject, org.telegram.ui.zu0 zu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        hv hvVar = S;
        if (hvVar != null) {
            hvVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : da1.e(str4)) != null) {
            PhotoViewer.t1().K2(null, m2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, zu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        final ?? e3Var = new org.telegram.ui.ActionBar.e3(parentActivity, false);
        e3Var.E = new int[2];
        e3Var.L = -2;
        e3Var.R = new av(e3Var);
        e3Var.fullWidth = true;
        e3Var.setApplyTopPadding(false);
        e3Var.setApplyBottomPadding(false);
        e3Var.Q = i12;
        if (parentActivity != null) {
            e3Var.f25409r = parentActivity;
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
        frameLayout.setOnTouchListener(new ci.d(17));
        e3Var.container.addView(frameLayout, w7.z5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ah.x xVar = new ah.x((Object) e3Var, parentActivity, 13);
        e3Var.f25411w = xVar;
        xVar.setOnTouchListener(new ci.d(17));
        e3Var.setCustomView(xVar);
        bv bvVar = new bv(e3Var, parentActivity, parentActivity, 0);
        e3Var.f25405b = bvVar;
        bvVar.getSettings().setJavaScriptEnabled(true);
        bvVar.getSettings().setDomStorageEnabled(true);
        bvVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        bvVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(bvVar, true);
        bvVar.setWebChromeClient(new org.telegram.ui.r1(e3Var, 1));
        bvVar.setWebViewClient(new cv(e3Var));
        xVar.addView(bvVar, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        da1 da1Var = new da1(parentActivity, true, new dv(e3Var));
        e3Var.f25406c = da1Var;
        da1Var.setVisibility(4);
        xVar.addView(da1Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        e3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        xVar.addView(view, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        e3Var.f25408n = radialProgressView;
        radialProgressView.setVisibility(4);
        xVar.addView(radialProgressView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            xVar.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 77.0f, -1, 83));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        xVar.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 57.0f, -1, 83));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K5, false));
        xVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
        xVar.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.g6.f19803o5;
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.g6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(e3Var) {
            public final hv f31364b;

            {
                this.f31364b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f31364b.dismiss();
                        return;
                    case 1:
                        hv.n(this.f31364b, view3);
                        return;
                    case 2:
                        hv hvVar2 = this.f31364b;
                        hvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar2.f25409r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar2.dismiss();
                        return;
                    default:
                        hv hvVar3 = this.f31364b;
                        pf.d.r(hvVar3.f25409r, hvVar3.I);
                        hvVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        e3Var.f25410s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        e3Var.f25412x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.z5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 51));
        imageView.setOnClickListener(new View.OnClickListener(e3Var) {
            public final hv f31364b;

            {
                this.f31364b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f31364b.dismiss();
                        return;
                    case 1:
                        hv.n(this.f31364b, view3);
                        return;
                    case 2:
                        hv hvVar2 = this.f31364b;
                        hvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar2.f25409r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar2.dismiss();
                        return;
                    default:
                        hv hvVar3 = this.f31364b;
                        pf.d.r(hvVar3.f25409r, hvVar3.I);
                        hvVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(e3Var) {
            public final hv f31364b;

            {
                this.f31364b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f31364b.dismiss();
                        return;
                    case 1:
                        hv.n(this.f31364b, view3);
                        return;
                    case 2:
                        hv hvVar2 = this.f31364b;
                        hvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar2.f25409r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar2.dismiss();
                        return;
                    default:
                        hv hvVar3 = this.f31364b;
                        pf.d.r(hvVar3.f25409r, hvVar3.I);
                        hvVar3.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        e3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
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
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(e3Var) {
            public final hv f31364b;

            {
                this.f31364b = e3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f31364b.dismiss();
                        return;
                    case 1:
                        hv.n(this.f31364b, view3);
                        return;
                    case 2:
                        hv hvVar2 = this.f31364b;
                        hvVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar2.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar2.f25409r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar2.dismiss();
                        return;
                    default:
                        hv hvVar3 = this.f31364b;
                        pf.d.r(hvVar3.f25409r, hvVar3.I);
                        hvVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = da1.a(str4) || da1.a(str3);
        da1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            z91 z91Var = da1Var.f24055f0;
            z91Var.setVisibility(4);
            z91Var.d(false, false);
            da1Var.j(true, false);
        }
        e3Var.setDelegate(new ev(e3Var, z12));
        e3Var.F = new fv(e3Var, ApplicationLoader.applicationContext);
        String e = da1.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            bvVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            bvVar.setKeepScreenOn(true);
            da1Var.setVisibility(4);
            da1Var.getControlsView().setVisibility(4);
            da1Var.getTextureView().setVisibility(4);
            if (da1Var.getTextureImageView() != null) {
                da1Var.getTextureImageView().setVisibility(4);
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

    public static void n(hv hvVar, View view) {
        boolean z10;
        fh0 fh0Var = fh0.f24733p0;
        if (fh0Var.P) {
            fh0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new zu(0, view), 300L);
            return;
        }
        if (hvVar.f25413y && "inapp".equals(MessagesController.getInstance(hvVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Activity activity = hvVar.f25409r;
            if (activity != null) {
                if (!Settings.canDrawOverlays(activity)) {
                    g5.A(activity, null, false);
                    return;
                }
            } else {
                return;
            }
        }
        if (hvVar.f25408n.getVisibility() == 0) {
            return;
        }
        if (fh0.x(z10, hvVar.f25409r, null, hvVar.f25405b, hvVar.G, hvVar.H, false)) {
            fh0Var.U = hvVar;
        }
        if (hvVar.f25413y) {
            hvVar.f25405b.evaluateJavascript("hideControls();", null);
        }
        hvVar.containerView.setTranslationY(0.0f);
        hvVar.dismissInternal();
    }

    public final void H() {
        bv bvVar = this.f25405b;
        if (bvVar != null && bvVar.getVisibility() == 0) {
            this.f25411w.removeView(bvVar);
            bvVar.stopLoading();
            bvVar.loadUrl("about:blank");
            bvVar.destroy();
        }
        fh0.j(false);
        da1 da1Var = this.f25406c;
        if (da1Var != null) {
            da1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f25405b != null && fh0.f24733p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f25409r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f25413y) {
                this.f25405b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f25405b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f25405b);
            }
            ah.x xVar = this.f25411w;
            bv bvVar = this.f25405b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            xVar.addView(bvVar, 0, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, i10 + 84, -1, 51));
            setShowWithoutAnimation(true);
            show();
            fh0.j(true);
        }
    }

    public final void K() {
        da1 da1Var = this.f25406c;
        View aspectRatioView = da1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!da1Var.f() && !this.O) {
            TextureView textureView = da1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = da1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = da1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        da1 da1Var = this.f25406c;
        if (da1Var.getVisibility() == 0 && da1Var.T) {
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
        fv fvVar = this.F;
        if (fvVar != null) {
            fvVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        da1 da1Var = this.f25406c;
        if (da1Var.getVisibility() == 0 && da1Var.f24064w && !da1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = da1Var.T;
                if (!z10 && !z10) {
                    da1Var.T = true;
                    da1Var.m();
                    da1Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = da1Var.T;
            if (z11 && z11) {
                da1Var.T = false;
                da1Var.m();
                da1Var.l(false);
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
                da1 da1Var = this.f25406c;
                TextureView textureView = da1Var.d;
                ImageView imageView = da1Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        da1Var.h = createBitmap;
                        da1Var.f24061n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = da1Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            da1Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (da1Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(da1Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                fh0.j(false);
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
        if (view == this.f25406c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        da1 da1Var = this.f25406c;
        if (view == da1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = da1Var.getMeasuredWidth();
            int measuredHeight = da1Var.getAspectRatioView().getMeasuredHeight();
            if (da1Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
