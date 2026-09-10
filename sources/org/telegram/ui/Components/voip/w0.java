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
import bi.j5;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.j60;
import org.telegram.ui.v40;
import org.telegram.ui.vo;
import org.webrtc.RendererCommon;
import w7.a6;
public abstract class w0 extends FrameLayout implements VoIPService.StateListener {
    public boolean f28505a;
    public final z4.g f28506b;
    public final ai.t f28507c;
    public final LinearLayout d;
    public final kj0 e;
    public final TextView[] f28508f;
    public final r2 h;
    public int f28509n;
    public int f28510r;
    public boolean f28511s;
    public boolean v;
    public float f28512w;
    public int f28513x;
    public final boolean f28514y;

    public w0(Context context, boolean z10) {
        super(context);
        int i10;
        this.f28509n = 1;
        this.f28510r = 1;
        this.f28514y = z10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f28508f = new TextView[i10];
        z4.g gVar = new z4.g(context);
        this.f28506b = gVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new v0(this));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, a6.c(-1.0f, -1));
        gVar.b(new t0(this));
        r2 r2Var = new r2(context, false, false);
        this.h = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        q2 q2Var = r2Var.d;
        q2Var.setScalingType(scalingType);
        r2Var.f28373a0 = 1;
        r2Var.f28377c0 = true;
        q2Var.setAlpha(0.0f);
        q2Var.setRotateTextureWithScreen(true);
        q2Var.setUseCameraRotation(true);
        addView(r2Var, a6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        lVar.setBackgroundColor(0);
        lVar.C(j6.w0(null, j6.f18007hg, false), false);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new vo(this, 14));
        addView(lVar);
        ai.t tVar = new ai.t(this, getContext());
        this.f28507c = tVar;
        tVar.setMinWidth(AndroidUtilities.dp(64.0f));
        tVar.setTag(-1);
        tVar.setTextSize(1, 14.0f);
        int i11 = j6.f18117ng;
        tVar.setTextColor(j6.w0(null, i11, false));
        tVar.setGravity(17);
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(j6.w0(null, i11, false), 76);
            tVar.setForeground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        tVar.setOnClickListener(new ai.u(this, 27));
        addView(tVar, a6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, a6.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f28508f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f28508f[i12].setTextSize(1, 12.0f);
            this.f28508f[i12].setTextColor(-1);
            this.f28508f[i12].setTypeface(AndroidUtilities.bold());
            this.f28508f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f28508f[i12].setGravity(16);
            this.f28508f[i12].setSingleLine(true);
            this.d.addView(this.f28508f[i12], a6.n(-2, -1));
            if (i12 == 0 && this.f28514y) {
                this.f28508f[i12].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i12 != 0 && (i12 != 1 || !this.f28514y)) {
                this.f28508f[i12].setText(LocaleController.getString(R.string.VoipBackCamera));
            } else {
                this.f28508f[i12].setText(LocaleController.getString(R.string.VoipFrontCamera));
            }
            this.f28508f[i12].setOnClickListener(new j5(this, i12, 15));
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
        this.f28506b.setCurrentItem(this.f28514y ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setBackground(j6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        hj0 hj0Var = new hj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        imageView.setAnimation(hj0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        hj0Var.M(69);
        imageView.setOnClickListener(new u10(21, this, hj0Var));
        addView((View) imageView, a6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(w0 w0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (w0Var.f28509n != w0Var.f28510r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = w0Var.f28509n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                w0Var.c();
                w0Var.f28511s = false;
                VoIPService.getSharedInstance().switchCamera();
                w0Var.h.setAlpha(0.0f);
            }
            w0Var.f28510r = w0Var.f28509n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f28505a) {
            return;
        }
        this.f28505a = true;
        c();
        j60 j60Var = ((v40) this).E;
        boolean z12 = j60Var.f34039z0.v;
        j60Var.f34039z0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            j60Var.N1(true, false);
            j60Var.f33936a1.sortParticipants();
            j60Var.O0(true);
            j60Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new zn0(this, 24));
        invalidate();
    }

    public final void c() {
        r2 r2Var = this.h;
        if (this.f28511s) {
            try {
                Bitmap bitmap = r2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), r2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(filesDirFixed, "cthumb" + this.f28510r + ".jpg")));
                        View findViewWithTag = this.f28506b.findViewWithTag(Integer.valueOf(this.f28510r - (1 ^ (this.f28514y ? 1 : 0))));
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
        int i10 = this.f28513x;
        TextView[] textViewArr = this.f28508f;
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
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f28512w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f28513x;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f28512w;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f28512w;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f28507c.invalidate();
        boolean z10 = this.f28514y;
        r2 r2Var = this.h;
        if (z10 && this.f28513x == 0 && this.f28512w <= 0.0f) {
            r2Var.setVisibility(4);
            return;
        }
        r2Var.setVisibility(0);
        if (this.f28513x + (!z10 ? 1 : 0) == this.f28509n) {
            r2Var.setTranslationX((-this.f28512w) * getMeasuredWidth());
        } else {
            r2Var.setTranslationX((1.0f - this.f28512w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(j6.w0(null, j6.f17990gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.x0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f28511s) {
            this.f28511s = true;
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28507c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        kj0 kj0Var = this.e;
        if (kj0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) kj0Var.getLayoutParams();
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
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.x0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f28507c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
