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
public final class tu extends org.telegram.ui.ActionBar.f3 {
    public static tu S;
    public int[] E;
    public ru F;
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
    public mu R;
    public nu f30734b;
    public b91 f30735c;
    public View d;
    public FrameLayout f30736e;
    public WebChromeClient.CustomViewCallback f30737f;
    public View h;
    public RadialProgressView f30738n;
    public Activity f30739r;
    public LinearLayout f30740s;
    public TextView v;
    public ah.y f30741w;
    public ImageView f30742x;
    public boolean f30743y;

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.su0 su0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        tu tuVar = S;
        if (tuVar != null) {
            tuVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : b91.e(str4)) != null) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, su0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final ?? f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, false);
        f3Var.E = new int[2];
        f3Var.L = -2;
        f3Var.R = new mu(f3Var);
        f3Var.fullWidth = true;
        f3Var.setApplyTopPadding(false);
        f3Var.setApplyBottomPadding(false);
        f3Var.Q = i12;
        if (parentActivity != null) {
            f3Var.f30739r = parentActivity;
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
        f3Var.f30736e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new ci.d(17));
        f3Var.container.addView(frameLayout, w7.x5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ah.y yVar = new ah.y((Object) f3Var, parentActivity, 13);
        f3Var.f30741w = yVar;
        yVar.setOnTouchListener(new ci.d(17));
        f3Var.setCustomView(yVar);
        nu nuVar = new nu(f3Var, parentActivity, parentActivity, 0);
        f3Var.f30734b = nuVar;
        nuVar.getSettings().setJavaScriptEnabled(true);
        nuVar.getSettings().setDomStorageEnabled(true);
        nuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        nuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(nuVar, true);
        nuVar.setWebChromeClient(new org.telegram.ui.p1(f3Var, 1));
        nuVar.setWebViewClient(new ou(f3Var));
        yVar.addView(nuVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        b91 b91Var = new b91(parentActivity, true, new pu(f3Var));
        f3Var.f30735c = b91Var;
        b91Var.setVisibility(4);
        yVar.addView(b91Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        f3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        yVar.addView(view, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        f3Var.f30738n = radialProgressView;
        radialProgressView.setVisibility(4);
        yVar.addView(radialProgressView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            yVar.addView(textView, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
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
        yVar.addView(textView2, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K5, false));
        yVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20761h5, false));
        yVar.addView(frameLayout2, w7.x5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f20888o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.x5.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(f3Var) {
            public final tu f27930b;

            {
                this.f27930b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f27930b.dismiss();
                        return;
                    case 1:
                        tu.m(this.f27930b, view3);
                        return;
                    case 2:
                        tu tuVar2 = this.f27930b;
                        tuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = tuVar2.f30739r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new p2(10));
                        }
                        tuVar2.dismiss();
                        return;
                    default:
                        tu tuVar3 = this.f27930b;
                        of.f.s(tuVar3.f30739r, tuVar3.I);
                        tuVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        f3Var.f30740s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.x5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        f3Var.f30742x = imageView;
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
        imageView.setOnClickListener(new View.OnClickListener(f3Var) {
            public final tu f27930b;

            {
                this.f27930b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f27930b.dismiss();
                        return;
                    case 1:
                        tu.m(this.f27930b, view3);
                        return;
                    case 2:
                        tu tuVar2 = this.f27930b;
                        tuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = tuVar2.f30739r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new p2(10));
                        }
                        tuVar2.dismiss();
                        return;
                    default:
                        tu tuVar3 = this.f27930b;
                        of.f.s(tuVar3.f30739r, tuVar3.I);
                        tuVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(f3Var) {
            public final tu f27930b;

            {
                this.f27930b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f27930b.dismiss();
                        return;
                    case 1:
                        tu.m(this.f27930b, view3);
                        return;
                    case 2:
                        tu tuVar2 = this.f27930b;
                        tuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = tuVar2.f30739r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new p2(10));
                        }
                        tuVar2.dismiss();
                        return;
                    default:
                        tu tuVar3 = this.f27930b;
                        of.f.s(tuVar3.f30739r, tuVar3.I);
                        tuVar3.dismiss();
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
        f3Var.v = textView4;
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
        textView5.setOnClickListener(new View.OnClickListener(f3Var) {
            public final tu f27930b;

            {
                this.f27930b = f3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f27930b.dismiss();
                        return;
                    case 1:
                        tu.m(this.f27930b, view3);
                        return;
                    case 2:
                        tu tuVar2 = this.f27930b;
                        tuVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tuVar2.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = tuVar2.f30739r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new p2(10));
                        }
                        tuVar2.dismiss();
                        return;
                    default:
                        tu tuVar3 = this.f27930b;
                        of.f.s(tuVar3.f30739r, tuVar3.I);
                        tuVar3.dismiss();
                        return;
                }
            }
        });
        boolean z12 = b91.a(str4) || b91.a(str3);
        b91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            x81 x81Var = b91Var.f24655f0;
            x81Var.setVisibility(4);
            x81Var.d(false, false);
            b91Var.j(true, false);
        }
        f3Var.setDelegate(new qu(f3Var, z12));
        f3Var.F = new ru(f3Var, ApplicationLoader.applicationContext);
        String e7 = b91.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            nuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            nuVar.setKeepScreenOn(true);
            b91Var.setVisibility(4);
            b91Var.getControlsView().setVisibility(4);
            b91Var.getTextureView().setVisibility(4);
            if (b91Var.getTextureImageView() != null) {
                b91Var.getTextureImageView().setVisibility(4);
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

    public static void m(tu tuVar, View view) {
        boolean z10;
        eg0 eg0Var = eg0.f25702p0;
        if (eg0Var.P) {
            eg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new lu(0, view), 300L);
            return;
        }
        if (tuVar.f30743y && "inapp".equals(MessagesController.getInstance(tuVar.currentAccount).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !tuVar.G()) || tuVar.f30738n.getVisibility() == 0) {
            return;
        }
        if (eg0.x(z10, tuVar.f30739r, null, tuVar.f30734b, tuVar.G, tuVar.H, false)) {
            eg0Var.U = tuVar;
        }
        if (tuVar.f30743y) {
            tuVar.f30734b.evaluateJavascript("hideControls();", null);
        }
        tuVar.containerView.setTranslationY(0.0f);
        tuVar.dismissInternal();
    }

    public final boolean G() {
        Activity activity = this.f30739r;
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
        nu nuVar = this.f30734b;
        if (nuVar != null && nuVar.getVisibility() == 0) {
            this.f30741w.removeView(nuVar);
            nuVar.stopLoading();
            nuVar.loadUrl("about:blank");
            nuVar.destroy();
        }
        eg0.j(false);
        b91 b91Var = this.f30735c;
        if (b91Var != null) {
            b91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        int i10;
        if (this.f30734b != null && eg0.f25702p0.P) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f30739r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f30743y) {
                this.f30734b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f30734b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30734b);
            }
            ah.y yVar = this.f30741w;
            nu nuVar = this.f30734b;
            if (this.J) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            yVar.addView(nuVar, 0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            eg0.j(true);
        }
    }

    public final void K() {
        b91 b91Var = this.f30735c;
        View aspectRatioView = b91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!b91Var.f() && !this.O) {
            TextureView textureView = b91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = b91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = b91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        b91 b91Var = this.f30735c;
        if (b91Var.getVisibility() == 0 && b91Var.T) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f30736e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        ru ruVar = this.F;
        if (ruVar != null) {
            ruVar.disable();
            this.F = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        b91 b91Var = this.f30735c;
        if (b91Var.getVisibility() == 0 && b91Var.f24664w && !b91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = b91Var.T;
                if (!z10 && !z10) {
                    b91Var.T = true;
                    b91Var.m();
                    b91Var.l(false);
                    return;
                }
                return;
            }
            boolean z11 = b91Var.T;
            if (z11 && z11) {
                b91Var.T = false;
                b91Var.m();
                b91Var.l(false);
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
                b91 b91Var = this.f30735c;
                TextureView textureView = b91Var.d;
                ImageView imageView = b91Var.f24652e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        b91Var.h = createBitmap;
                        b91Var.f24661n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = b91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            b91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (b91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(b91Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                eg0.j(false);
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
        if (view == this.f30735c.getControlsView()) {
            K();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        b91 b91Var = this.f30735c;
        if (view == b91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = b91Var.getMeasuredWidth();
            int measuredHeight = b91Var.getAspectRatioView().getMeasuredHeight();
            if (b91Var.T) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
