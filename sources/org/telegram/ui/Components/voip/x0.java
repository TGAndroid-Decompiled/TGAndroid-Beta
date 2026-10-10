package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.m4;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.vt;
import org.telegram.ui.g60;
import org.telegram.ui.ro;
import org.telegram.ui.s40;
import org.webrtc.RendererCommon;
import w7.x5;
public abstract class x0 extends FrameLayout implements VoIPService.StateListener {
    public boolean f32423a;
    public final z4.g f32424b;
    public final bi.o f32425c;
    public final LinearLayout d;
    public final gk0 f32426e;
    public final TextView[] f32427f;
    public final s2 h;
    public int f32428n;
    public int f32429r;
    public boolean f32430s;
    public boolean v;
    public float f32431w;
    public int f32432x;
    public final boolean f32433y;

    public x0(Context context, boolean z10) {
        super(context);
        int i10;
        this.f32428n = 1;
        this.f32429r = 1;
        this.f32433y = z10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f32427f = new TextView[i10];
        z4.g gVar = new z4.g(context);
        this.f32424b = gVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new w0(this));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, x5.d(-1.0f, -1));
        gVar.b(new u0(this));
        s2 s2Var = new s2(context, false, false);
        this.h = s2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        r2 r2Var = s2Var.d;
        r2Var.setScalingType(scalingType);
        s2Var.f32276a0 = 1;
        s2Var.f32280c0 = true;
        r2Var.setAlpha(0.0f);
        r2Var.setRotateTextureWithScreen(true);
        r2Var.setUseCameraRotation(true);
        addView(s2Var, x5.d(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        kVar.setBackgroundColor(0);
        kVar.D(i6.x0(null, i6.f20882hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ro(this, 14));
        addView(kVar);
        bi.o oVar = new bi.o(this, getContext());
        this.f32425c = oVar;
        oVar.setMinWidth(AndroidUtilities.dp(64.0f));
        oVar.setTag(-1);
        oVar.setTextSize(1, 14.0f);
        int i11 = i6.f20994ng;
        oVar.setTextColor(i6.x0(null, i11, false));
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setText(LocaleController.getString(R.string.VoipShareVideo));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(i6.x0(null, i11, false), 76);
        oVar.setForeground(i6.j0(dp, dp, dp, dp, 0, k10, k10));
        oVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        oVar.setOnClickListener(new o(this, 1));
        addView(oVar, x5.a(48.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 80));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, x5.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f32427f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f32427f[i12].setTextSize(1, 12.0f);
            this.f32427f[i12].setTextColor(-1);
            this.f32427f[i12].setTypeface(AndroidUtilities.bold());
            this.f32427f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f32427f[i12].setGravity(16);
            this.f32427f[i12].setSingleLine(true);
            this.d.addView(this.f32427f[i12], x5.n(-2, -1));
            if (i12 == 0 && this.f32433y) {
                this.f32427f[i12].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i12 != 0 && (i12 != 1 || !this.f32433y)) {
                this.f32427f[i12].setText(LocaleController.getString(R.string.VoipBackCamera));
            } else {
                this.f32427f[i12].setText(LocaleController.getString(R.string.VoipFrontCamera));
            }
            this.f32427f[i12].setOnClickListener(new m4(this, i12, 15));
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
        this.f32424b.setCurrentItem(this.f32433y ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.f32426e = imageView;
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setBackground(i6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        dk0 dk0Var = new dk0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        imageView.setAnimation(dk0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        dk0Var.M(69);
        imageView.setOnClickListener(new vt(24, this, dk0Var));
        addView((View) imageView, x5.a(48.0f, 24.0f, 0.0f, 0.0f, 136.0f, 48, 83));
    }

    public static void a(x0 x0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (x0Var.f32428n != x0Var.f32429r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = x0Var.f32428n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                x0Var.c();
                x0Var.f32430s = false;
                VoIPService.getSharedInstance().switchCamera();
                x0Var.h.setAlpha(0.0f);
            }
            x0Var.f32429r = x0Var.f32428n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32423a) {
            return;
        }
        this.f32423a = true;
        c();
        g60 g60Var = ((s40) this).E;
        boolean z12 = g60Var.f37937z0.v;
        g60Var.f37937z0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            g60Var.O1(true, false);
            g60Var.f37833a1.sortParticipants();
            g60Var.P0(true);
            g60Var.f37849e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new j91(this, 5));
        invalidate();
    }

    public final void c() {
        s2 s2Var = this.h;
        if (this.f32430s) {
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
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(filesDirFixed, "cthumb" + this.f32429r + ".jpg")));
                        View findViewWithTag = this.f32424b.findViewWithTag(Integer.valueOf(this.f32429r - (1 ^ (this.f32433y ? 1 : 0))));
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
        int i10 = this.f32432x;
        TextView[] textViewArr = this.f32427f;
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
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f32431w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f32432x;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f32431w;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f32431w;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f32425c.invalidate();
        boolean z10 = this.f32433y;
        s2 s2Var = this.h;
        if (z10 && this.f32432x == 0 && this.f32431w <= 0.0f) {
            s2Var.setVisibility(4);
            return;
        }
        s2Var.setVisibility(0);
        if (this.f32432x + (!z10 ? 1 : 0) == this.f32428n) {
            s2Var.setTranslationX((-this.f32431w) * getMeasuredWidth());
        } else {
            s2Var.setTranslationX((1.0f - this.f32431w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(i6.x0(null, i6.f20864gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.w0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f32430s) {
            this.f32430s = true;
            this.h.animate().alpha(1.0f).setDuration(250L);
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32425c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        gk0 gk0Var = this.f32426e;
        if (gk0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gk0Var.getLayoutParams();
            if (z10) {
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
        org.telegram.messenger.voip.w0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.w0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.w0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.w0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.w0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f32425c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.f32426e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
