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
public final class ou extends org.telegram.ui.ActionBar.g3 {
    public static ou P;
    public int[] B;
    public mu C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public hu O;
    public iu f27651b;
    public e91 f27652c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f27653f;
    public View h;
    public RadialProgressView f27654n;
    public Activity f27655r;
    public LinearLayout f27656s;
    public TextView v;
    public dg.u2 f27657w;
    public ImageView f27658x;
    public boolean f27659y;

    public static void I(org.telegram.ui.ActionBar.p2 p2Var, MessageObject messageObject, org.telegram.ui.fu0 fu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z4) {
        float f10;
        TLRPC.MessageMedia messageMedia;
        ou ouVar = P;
        if (ouVar != null) {
            ouVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : e91.e(str4)) != null) {
            PhotoViewer.t1().K2(null, p2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, fu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        final ?? g3Var = new org.telegram.ui.ActionBar.g3(parentActivity, false);
        g3Var.B = new int[2];
        g3Var.I = -2;
        g3Var.O = new hu(g3Var);
        g3Var.fullWidth = true;
        g3Var.setApplyTopPadding(false);
        g3Var.setApplyBottomPadding(false);
        g3Var.N = i12;
        if (parentActivity != null) {
            g3Var.f27655r = parentActivity;
        }
        g3Var.H = str4;
        boolean z10 = str2 != null && str2.length() > 0;
        g3Var.G = z10;
        g3Var.F = str3;
        g3Var.D = i10;
        g3Var.E = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            g3Var.D = point.x;
            g3Var.E = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        g3Var.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new oh.d(17));
        g3Var.container.addView(frameLayout, k7.b6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        dg.u2 u2Var = new dg.u2((Object) g3Var, parentActivity, 18);
        g3Var.f27657w = u2Var;
        u2Var.setOnTouchListener(new oh.d(17));
        g3Var.setCustomView(u2Var);
        iu iuVar = new iu(g3Var, parentActivity, parentActivity, 0);
        g3Var.f27651b = iuVar;
        iuVar.getSettings().setJavaScriptEnabled(true);
        iuVar.getSettings().setDomStorageEnabled(true);
        iuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        iuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(iuVar, true);
        iuVar.setWebChromeClient(new org.telegram.ui.s1(g3Var, 1));
        iuVar.setWebViewClient(new ju(g3Var));
        u2Var.addView(iuVar, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z10 ? 22 : 0) + 84));
        e91 e91Var = new e91(parentActivity, true, new ku(g3Var));
        g3Var.f27652c = e91Var;
        e91Var.setVisibility(4);
        u2Var.addView(e91Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z10 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        g3Var.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        u2Var.addView(view, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z10 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        g3Var.f27654n = radialProgressView;
        radialProgressView.setVisibility(4);
        u2Var.addView(radialProgressView, k7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z10 ? 22 : 0) + 84) / 2));
        if (z10) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            u2Var.addView(textView, k7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20095p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        u2Var.addView(textView2, k7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K5, false));
        u2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
        u2Var.addView(frameLayout2, k7.b6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, k7.b6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f20077o5;
        org.telegram.ui.ai.s(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, k7.b6.q(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(g3Var) {
            public final ou f24968b;

            {
                this.f24968b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f24968b.dismiss();
                        return;
                    case 1:
                        ou.m(this.f24968b, view3);
                        return;
                    case 2:
                        ou ouVar2 = this.f24968b;
                        ouVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ouVar2.F));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = ouVar2.f27655r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ouVar2.dismiss();
                        return;
                    default:
                        ou ouVar3 = this.f24968b;
                        ze.d.s(ouVar3.f27655r, ouVar3.F);
                        ouVar3.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        g3Var.f27656s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, k7.b6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        g3Var.f27658x = imageView;
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
        linearLayout2.addView(imageView, k7.b6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(g3Var) {
            public final ou f24968b;

            {
                this.f24968b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f24968b.dismiss();
                        return;
                    case 1:
                        ou.m(this.f24968b, view3);
                        return;
                    case 2:
                        ou ouVar2 = this.f24968b;
                        ouVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ouVar2.F));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = ouVar2.f27655r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ouVar2.dismiss();
                        return;
                    default:
                        ou ouVar3 = this.f24968b;
                        ze.d.s(ouVar3.f27655r, ouVar3.F);
                        ouVar3.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(g3Var) {
            public final ou f24968b;

            {
                this.f24968b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f24968b.dismiss();
                        return;
                    case 1:
                        ou.m(this.f24968b, view3);
                        return;
                    case 2:
                        ou ouVar2 = this.f24968b;
                        ouVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ouVar2.F));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = ouVar2.f27655r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ouVar2.dismiss();
                        return;
                    default:
                        ou ouVar3 = this.f24968b;
                        ze.d.s(ouVar3.f27655r, ouVar3.F);
                        ouVar3.dismiss();
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
        linearLayout2.addView(imageView2, k7.b6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        g3Var.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ai.s(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, k7.b6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ai.s(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, k7.b6.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(g3Var) {
            public final ou f24968b;

            {
                this.f24968b = g3Var;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f24968b.dismiss();
                        return;
                    case 1:
                        ou.m(this.f24968b, view3);
                        return;
                    case 2:
                        ou ouVar2 = this.f24968b;
                        ouVar2.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ouVar2.F));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = ouVar2.f27655r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ouVar2.dismiss();
                        return;
                    default:
                        ou ouVar3 = this.f24968b;
                        ze.d.s(ouVar3.f27655r, ouVar3.F);
                        ouVar3.dismiss();
                        return;
                }
            }
        });
        boolean z11 = e91.a(str4) || e91.a(str3);
        e91Var.setVisibility(z11 ? 0 : 4);
        if (z11) {
            a91 a91Var = e91Var.f24535c0;
            a91Var.setVisibility(4);
            a91Var.d(false, false);
            e91Var.j(true, false);
        }
        g3Var.setDelegate(new lu(g3Var, z11));
        g3Var.C = new mu(g3Var, ApplicationLoader.applicationContext);
        String e = e91.e(str4);
        if (e != null || !z11) {
            radialProgressView.setVisibility(0);
            iuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            iuVar.setKeepScreenOn(true);
            e91Var.setVisibility(4);
            e91Var.getControlsView().setVisibility(4);
            e91Var.getTextureView().setVisibility(4);
            if (e91Var.getTextureImageView() != null) {
                e91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(g3Var.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (g3Var.C.canDetectOrientation()) {
            g3Var.C.enable();
        } else {
            g3Var.C.disable();
            g3Var.C = null;
        }
        P = g3Var;
        g3Var.setCalcMandatoryInsets(z4);
        g3Var.show();
    }

    public static void m(ou ouVar, View view) {
        boolean z4;
        mg0 mg0Var = mg0.m0;
        if (mg0Var.M) {
            mg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new gu(0, view), 300L);
            return;
        }
        if (ouVar.f27659y && "inapp".equals(MessagesController.getInstance(ouVar.currentAccount).youtubePipType)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((!z4 && !ouVar.F()) || ouVar.f27654n.getVisibility() == 0) {
            return;
        }
        if (mg0.x(z4, ouVar.f27655r, null, ouVar.f27651b, ouVar.D, ouVar.E, false)) {
            mg0Var.R = ouVar;
        }
        if (ouVar.f27659y) {
            ouVar.f27651b.evaluateJavascript("hideControls();", null);
        }
        ouVar.containerView.setTranslationY(0.0f);
        ouVar.dismissInternal();
    }

    public final boolean F() {
        Activity activity = this.f27655r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
            z4.B(activity, null, false);
            return false;
        }
        return true;
    }

    public final void G() {
        iu iuVar = this.f27651b;
        if (iuVar != null && iuVar.getVisibility() == 0) {
            this.f27657w.removeView(iuVar);
            iuVar.stopLoading();
            iuVar.loadUrl("about:blank");
            iuVar.destroy();
        }
        mg0.j(false);
        e91 e91Var = this.f27652c;
        if (e91Var != null) {
            e91Var.b();
        }
        P = null;
        dismissInternal();
    }

    public final void H() {
        int i10;
        if (this.f27651b != null && mg0.m0.M) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f27655r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f27659y) {
                this.f27651b.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.f27651b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f27651b);
            }
            dg.u2 u2Var = this.f27657w;
            iu iuVar = this.f27651b;
            if (this.G) {
                i10 = 22;
            } else {
                i10 = 0;
            }
            u2Var.addView(iuVar, 0, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 + 84));
            setShowWithoutAnimation(true);
            show();
            mg0.j(true);
        }
    }

    public final void J() {
        e91 e91Var = this.f27652c;
        View aspectRatioView = e91Var.getAspectRatioView();
        int[] iArr = this.B;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!e91Var.f() && !this.L) {
            TextureView textureView = e91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = e91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = e91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        e91 e91Var = this.f27652c;
        if (e91Var.getVisibility() == 0 && e91Var.Q) {
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
        mu muVar = this.C;
        if (muVar != null) {
            muVar.disable();
            this.C = null;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        e91 e91Var = this.f27652c;
        if (e91Var.getVisibility() == 0 && e91Var.f24545w && !e91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z4 = e91Var.Q;
                if (!z4 && !z4) {
                    e91Var.Q = true;
                    e91Var.m();
                    e91Var.l(false);
                    return;
                }
                return;
            }
            boolean z10 = e91Var.Q;
            if (z10 && z10) {
                e91Var.Q = false;
                e91Var.m();
                e91Var.l(false);
            }
        }
    }

    @Override
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.M;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.M = i11;
            if (i11 == 0) {
                e91 e91Var = this.f27652c;
                TextureView textureView = e91Var.d;
                ImageView imageView = e91Var.e;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        e91Var.h = createBitmap;
                        e91Var.f24542n.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap = e91Var.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            e91Var.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (e91Var.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(e91Var.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                mg0.j(false);
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
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f27652c.getControlsView()) {
            J();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        int dp;
        e91 e91Var = this.f27652c;
        if (view == e91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = e91Var.getMeasuredWidth();
            int measuredHeight = e91Var.getAspectRatioView().getMeasuredHeight();
            if (e91Var.Q) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            layoutParams.height = measuredHeight + dp;
        }
        return false;
    }
}
