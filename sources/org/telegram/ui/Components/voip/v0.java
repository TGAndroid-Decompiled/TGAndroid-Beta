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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.d60;
import org.telegram.ui.q40;
import org.webrtc.RendererCommon;
public abstract class v0 extends FrameLayout implements VoIPService.StateListener {
    public boolean f32408a;
    public final m2.h f32409b;
    public final fg.s0 f32410c;
    public final LinearLayout d;
    public final lj0 f32411e;
    public final TextView[] f32412f;
    public final t2 h;
    public int f32413n;
    public int f32414r;
    public boolean f32415s;
    public boolean v;
    public float f32416w;
    public int f32417x;
    public final boolean f32418y;

    public v0(Context context, boolean z4) {
        super(context);
        int i10;
        this.f32413n = 1;
        this.f32414r = 1;
        this.f32418y = z4;
        if (z4) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f32412f = new TextView[i10];
        m2.h hVar = new m2.h(context);
        this.f32409b = hVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(hVar, 2130706432);
        hVar.setAdapter(new u0(this));
        hVar.setPageMargin(0);
        hVar.setOffscreenPageLimit(1);
        addView(hVar, c6.c(-1.0f, -1));
        hVar.b(new s0(this));
        t2 t2Var = new t2(context, false, false);
        this.h = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        s2 s2Var = t2Var.d;
        s2Var.setScalingType(scalingType);
        t2Var.U = 1;
        t2Var.W = true;
        s2Var.setAlpha(0.0f);
        s2Var.setRotateTextureWithScreen(true);
        s2Var.setUseCameraRotation(true);
        addView(t2Var, c6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        kVar.setBackgroundColor(0);
        kVar.C(k6.w0(null, k6.f21741hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new z51(this, 1));
        addView(kVar);
        fg.s0 s0Var = new fg.s0(this, getContext());
        this.f32410c = s0Var;
        s0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        s0Var.setTag(-1);
        s0Var.setTextSize(1, 14.0f);
        int i11 = k6.f21848ng;
        s0Var.setTextColor(k6.w0(null, i11, false));
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(k6.w0(null, i11, false), 76);
            s0Var.setForeground(k6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        s0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        s0Var.setOnClickListener(new o(this, 1));
        addView(s0Var, c6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, c6.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f32412f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f32412f[i12].setTextSize(1, 12.0f);
            this.f32412f[i12].setTextColor(-1);
            this.f32412f[i12].setTypeface(AndroidUtilities.bold());
            this.f32412f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f32412f[i12].setGravity(16);
            this.f32412f[i12].setSingleLine(true);
            this.d.addView(this.f32412f[i12], c6.n(-2, -1));
            if (i12 == 0 && this.f32418y) {
                this.f32412f[i12].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i12 != 0 && (i12 != 1 || !this.f32418y)) {
                this.f32412f[i12].setText(LocaleController.getString(R.string.VoipBackCamera));
            } else {
                this.f32412f[i12].setText(LocaleController.getString(R.string.VoipFrontCamera));
            }
            this.f32412f[i12].setOnClickListener(new mh.x0(this, i12, 12));
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
        this.f32409b.setCurrentItem(this.f32418y ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.f32411e = imageView;
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setBackground(k6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        int i13 = R.raw.voice_mini;
        ij0 ij0Var = new ij0(i13, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        imageView.setAnimation(ij0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        ij0Var.K(69);
        imageView.setOnClickListener(new sx0(9, this, ij0Var));
        addView((View) imageView, c6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(v0 v0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (v0Var.f32413n != v0Var.f32414r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = v0Var.f32413n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                v0Var.c();
                v0Var.f32415s = false;
                VoIPService.getSharedInstance().switchCamera();
                v0Var.h.setAlpha(0.0f);
            }
            v0Var.f32414r = v0Var.f32413n;
        }
    }

    public final void b(boolean z4, boolean z10) {
        if (this.f32408a) {
            return;
        }
        this.f32408a = true;
        c();
        d60 d60Var = ((q40) this).B;
        boolean z11 = d60Var.f36103w0.v;
        d60Var.f36103w0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z10) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z4, z11);
            }
            if (z4 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            d60Var.N1(true, false);
            d60Var.X0.sortParticipants();
            d60Var.O0(true);
            d60Var.f36027e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new g91(this, 3));
        invalidate();
    }

    public final void c() {
        t2 t2Var = this.h;
        if (this.f32415s) {
            try {
                Bitmap bitmap = t2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), t2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(filesDirFixed, "cthumb" + this.f32414r + ".jpg")));
                        View findViewWithTag = this.f32409b.findViewWithTag(Integer.valueOf(this.f32414r - (1 ^ (this.f32418y ? 1 : 0))));
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
        int i10 = this.f32417x;
        TextView[] textViewArr = this.f32412f;
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
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f32416w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f32417x;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.f32416w;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f32416w;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f11);
            textViewArr[i11].setScaleX(f10);
            textViewArr[i11].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f32410c.invalidate();
        boolean z4 = this.f32418y;
        t2 t2Var = this.h;
        if (z4 && this.f32417x == 0 && this.f32416w <= 0.0f) {
            t2Var.setVisibility(4);
            return;
        }
        t2Var.setVisibility(0);
        if (this.f32417x + (!z4 ? 1 : 0) == this.f32413n) {
            t2Var.setTranslationX((-this.f32416w) * getMeasuredWidth());
        } else {
            t2Var.setTranslationX((1.0f - this.f32416w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(k6.w0(null, k6.f21724gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        if (!this.f32415s) {
            this.f32415s = true;
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32410c.getLayoutParams();
        if (z4) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        lj0 lj0Var = this.f32411e;
        if (lj0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) lj0Var.getLayoutParams();
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
        ((FrameLayout.LayoutParams) this.f32410c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.f32411e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
