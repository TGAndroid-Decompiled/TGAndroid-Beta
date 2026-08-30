package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.c60;
import org.telegram.ui.p40;
import org.webrtc.RendererCommon;
public abstract class u0 extends FrameLayout implements VoIPService.StateListener {
    public boolean f29965a;
    public final m2.h f29966b;
    public final eg.s0 f29967c;
    public final LinearLayout d;
    public final jj0 e;
    public final TextView[] f29968f;
    public final s2 h;
    public int f29969n;
    public int f29970r;
    public boolean f29971s;
    public boolean v;
    public float f29972w;
    public int f29973x;
    public final boolean f29974y;

    public u0(Context context, boolean z4) {
        super(context);
        int i10;
        this.f29969n = 1;
        this.f29970r = 1;
        this.f29974y = z4;
        if (z4) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f29968f = new TextView[i10];
        m2.h hVar = new m2.h(context);
        this.f29966b = hVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(hVar, 2130706432);
        hVar.setAdapter(new t0(this));
        hVar.setPageMargin(0);
        hVar.setOffscreenPageLimit(1);
        addView(hVar, b6.c(-1.0f, -1));
        hVar.b(new r0(this));
        s2 s2Var = new s2(context, false, false);
        this.h = s2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        r2 r2Var = s2Var.d;
        r2Var.setScalingType(scalingType);
        s2Var.U = 1;
        s2Var.W = true;
        r2Var.setAlpha(0.0f);
        r2Var.setRotateTextureWithScreen(true);
        r2Var.setUseCameraRotation(true);
        addView(s2Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        kVar.setBackgroundColor(0);
        kVar.C(j6.w0(null, j6.f19987hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new y51(this, 1));
        addView(kVar);
        eg.s0 s0Var = new eg.s0(this, getContext());
        this.f29967c = s0Var;
        s0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        s0Var.setTag(-1);
        s0Var.setTextSize(1, 14.0f);
        int i11 = j6.f20094ng;
        s0Var.setTextColor(j6.w0(null, i11, false));
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(j6.w0(null, i11, false), 76);
            s0Var.setForeground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        s0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        s0Var.setOnClickListener(new oh.n(this, 2));
        addView(s0Var, b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, b6.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f29968f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f29968f[i12].setTextSize(1, 12.0f);
            this.f29968f[i12].setTextColor(-1);
            this.f29968f[i12].setTypeface(AndroidUtilities.bold());
            this.f29968f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f29968f[i12].setGravity(16);
            this.f29968f[i12].setSingleLine(true);
            this.d.addView(this.f29968f[i12], b6.n(-2, -1));
            if (i12 == 0 && this.f29974y) {
                this.f29968f[i12].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i12 != 0 && (i12 != 1 || !this.f29974y)) {
                this.f29968f[i12].setText(LocaleController.getString(R.string.VoipBackCamera));
            } else {
                this.f29968f[i12].setText(LocaleController.getString(R.string.VoipFrontCamera));
            }
            this.f29968f[i12].setOnClickListener(new lh.y0(this, i12, 12));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(AndroidUtilities.dp(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.f29966b.setCurrentItem(this.f29974y ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setBackground(j6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        int i13 = R.raw.voice_mini;
        gj0 gj0Var = new gj0(i13, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        imageView.setAnimation(gj0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        gj0Var.K(69);
        imageView.setOnClickListener(new rx0(9, this, gj0Var));
        addView((View) imageView, b6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(u0 u0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (u0Var.f29969n != u0Var.f29970r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = u0Var.f29969n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                u0Var.c();
                u0Var.f29971s = false;
                VoIPService.getSharedInstance().switchCamera();
                u0Var.h.setAlpha(0.0f);
            }
            u0Var.f29970r = u0Var.f29969n;
        }
    }

    public final void b(boolean z4, boolean z10) {
        if (this.f29965a) {
            return;
        }
        this.f29965a = true;
        c();
        c60 c60Var = ((p40) this).B;
        boolean z11 = c60Var.f33189w0.v;
        c60Var.f33189w0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z10) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z4, z11);
            }
            if (z4 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            c60Var.N1(true, false);
            c60Var.X0.sortParticipants();
            c60Var.O0(true);
            c60Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new f91(this, 3));
        invalidate();
    }

    public final void c() {
        s2 s2Var = this.h;
        if (this.f29971s) {
            try {
                Bitmap bitmap = s2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), s2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(filesDirFixed, "cthumb" + this.f29970r + ".jpg")));
                        View findViewWithTag = this.f29966b.findViewWithTag(Integer.valueOf(this.f29970r - (1 ^ (this.f29974y ? 1 : 0))));
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        TextView textView;
        int i10 = this.f29973x;
        TextView[] textViewArr = this.f29968f;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f29972w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f29973x;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.f29972w;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f29972w;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f11);
            textViewArr[i11].setScaleX(f10);
            textViewArr[i11].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f29967c.invalidate();
        boolean z4 = this.f29974y;
        s2 s2Var = this.h;
        if (z4 && this.f29973x == 0 && this.f29972w <= 0.0f) {
            s2Var.setVisibility(4);
            return;
        }
        s2Var.setVisibility(0);
        if (this.f29973x + (!z4 ? 1 : 0) == this.f29969n) {
            s2Var.setTranslationX((-this.f29972w) * getMeasuredWidth());
        } else {
            s2Var.setTranslationX((1.0f - this.f29972w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(j6.w0(null, j6.f19970gg, false), (int) (getAlpha() * 1.0f * 255.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        org.telegram.messenger.voip.v0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f29971s) {
            this.f29971s = true;
            this.h.animate().alpha(1.0f).setDuration(250L);
        }
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        if (VoIPService.getSharedInstance() != null) {
            this.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z4 = true;
        } else {
            z4 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29967c.getLayoutParams();
        if (z4) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        jj0 jj0Var = this.e;
        if (jj0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) jj0Var.getLayoutParams();
            if (z4) {
                int dp3 = AndroidUtilities.dp(88.0f);
                marginLayoutParams2.leftMargin = dp3;
                marginLayoutParams2.rightMargin = dp3;
            } else {
                int dp4 = AndroidUtilities.dp(24.0f);
                marginLayoutParams2.leftMargin = dp4;
                marginLayoutParams2.rightMargin = dp4;
            }
        }
        super.onMeasure(i10, i11);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.v0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f29967c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
