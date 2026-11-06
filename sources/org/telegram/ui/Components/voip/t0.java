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
import c8.ha;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c40;
import org.telegram.ui.t20;
import org.telegram.ui.va;
import org.telegram.ui.w9;
import org.webrtc.RendererCommon;
public abstract class t0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean D;
    public boolean f39495a;
    public final c5.k f39496b;
    public final ei.k f39497c;
    public final LinearLayout d;
    public final ch0 f39498e;
    public final TextView[] f39499f;
    public final k2 h;
    public int f39500n;
    public int f39501r;
    public boolean f39502s;
    public boolean f39503w;
    public float f39504x;
    public int f39505y;

    public t0(Context context, boolean z9) {
        super(context);
        int i7;
        this.f39500n = 1;
        this.f39501r = 1;
        this.D = z9;
        if (z9) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        this.f39499f = new TextView[i7];
        c5.k kVar = new c5.k(context);
        this.f39496b = kVar;
        org.telegram.messenger.g0.C3(kVar, 2130706432);
        kVar.setAdapter(new a20(this, 1));
        kVar.setPageMargin(0);
        kVar.setOffscreenPageLimit(1);
        addView(kVar, ha.c(-1.0f, -1));
        kVar.b(new r0(this));
        k2 k2Var = new k2(context, false, false);
        this.h = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        k2Var.f39296a0 = 1;
        k2Var.f39300c0 = true;
        j2Var.setAlpha(0.0f);
        j2Var.setRotateTextureWithScreen(true);
        j2Var.setUseCameraRotation(true);
        addView(k2Var, ha.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(context, null);
        kVar2.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        kVar2.setBackgroundColor(0);
        r6.m(kVar2, 1, k6.Vg, null);
        kVar2.setOccupyStatusBar(true);
        kVar2.setActionBarMenuOnItemClick(new w9(this, 19));
        addView(kVar2);
        ei.k kVar3 = new ei.k(this, getContext());
        this.f39497c = kVar3;
        kVar3.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        kVar3.setTag(-1);
        kVar3.setTextSize(1, 14.0f);
        int i10 = k6.f27822bh;
        r6.V(kVar3, i10, null);
        kVar3.setGravity(17);
        kVar3.setTypeface(org.telegram.messenger.g0.o());
        kVar3.setText(hd.M0(2131743241, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(k6.x0(null, i10, false), 76);
        kVar3.setForeground(k6.k0(L, L, L, L, 0, o4, o4));
        kVar3.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        kVar3.setOnClickListener(new ii.g(this, 18));
        addView(kVar3, ha.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, ha.e(-2, 64, 80));
        int i11 = 0;
        while (true) {
            TextView[] textViewArr = this.f39499f;
            if (i11 >= textViewArr.length) {
                break;
            }
            textViewArr[i11] = new TextView(context);
            this.f39499f[i11].setTextSize(1, 12.0f);
            this.f39499f[i11].setTextColor(-1);
            this.f39499f[i11].setTypeface(org.telegram.messenger.g0.o());
            this.f39499f[i11].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.f39499f[i11].setGravity(16);
            this.f39499f[i11].setSingleLine(true);
            this.d.addView(this.f39499f[i11], ha.o(-2, -1));
            if (i11 == 0 && this.D) {
                this.f39499f[i11].setText(hd.M0(2131743260, null));
            } else if (i11 != 0 && (i11 != 1 || !this.D)) {
                this.f39499f[i11].setText(hd.M0(2131743494, null));
            } else {
                this.f39499f[i11].setText(hd.M0(2131743406, null));
            }
            this.f39499f[i11].setOnClickListener(new ai.v(this, i11, 20));
            i11++;
        }
        setAlpha(0.0f);
        setTranslationX(org.telegram.messenger.g0.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.f39496b.setCurrentItem(this.D ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.f39498e = imageView;
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setBackground(k6.L(org.telegram.messenger.g0.L(48.0f), i0.a.o(-16777216, 76)));
        zg0 zg0Var = new zg0(2131624331, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        imageView.setAnimation(zg0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f39503w = true;
        zg0Var.M(69);
        imageView.setOnClickListener(new t41(2, this, zg0Var));
        addView((View) imageView, ha.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(t0 t0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (t0Var.f39500n != t0Var.f39501r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i7 = t0Var.f39500n;
            if ((i7 == 1 && !isFrontFaceCamera) || (i7 == 2 && isFrontFaceCamera)) {
                t0Var.c();
                t0Var.f39502s = false;
                VoIPService.getSharedInstance().switchCamera();
                t0Var.h.setAlpha(0.0f);
            }
            t0Var.f39501r = t0Var.f39500n;
        }
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f39495a) {
            return;
        }
        this.f39495a = true;
        c();
        c40 c40Var = ((t20) this).E;
        boolean z11 = c40Var.f44613q2.f39503w;
        c40Var.f44613q2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z10) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z9, z11);
            }
            if (z9 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            c40Var.T1(true, false);
            c40Var.R2.z();
            c40Var.Q0(true);
            c40Var.l1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(32.0f)).setDuration(150L).setListener(new va(this, 12));
        invalidate();
    }

    public final void c() {
        k2 k2Var = this.h;
        if (this.f39502s) {
            try {
                Bitmap bitmap = k2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), k2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File h = org.telegram.messenger.t0.h();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(h, "cthumb" + this.f39501r + ".jpg")));
                        View findViewWithTag = this.f39496b.findViewWithTag(Integer.valueOf(this.f39501r - (1 ^ (this.D ? 1 : 0))));
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
        int i7 = this.f39505y;
        TextView[] textViewArr = this.f39499f;
        TextView textView2 = textViewArr[i7];
        if (i7 < textViewArr.length - 1) {
            textView = textViewArr[i7 + 1];
        } else {
            textView = null;
        }
        getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f39504x;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = this.f39505y;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f39504x;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f39504x;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f39497c.invalidate();
        boolean z9 = this.D;
        k2 k2Var = this.h;
        if (z9 && this.f39505y == 0 && this.f39504x <= 0.0f) {
            k2Var.setVisibility(4);
            return;
        }
        k2Var.setVisibility(0);
        if (this.f39505y + (!z9 ? 1 : 0) == this.f39500n) {
            k2Var.setTranslationX((-this.f39504x) * getMeasuredWidth());
        } else {
            k2Var.setTranslationX((1.0f - this.f39504x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.o(k6.x0(null, k6.Ug, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.s0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f39502s) {
            this.f39502s = true;
            this.h.animate().alpha(1.0f).setDuration(250L);
        }
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        d();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39497c.getLayoutParams();
        if (z9) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        ch0 ch0Var = this.f39498e;
        if (ch0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ch0Var.getLayoutParams();
            if (z9) {
                int L3 = org.telegram.messenger.g0.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = org.telegram.messenger.g0.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i7, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        org.telegram.messenger.voip.s0.g(this, i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.f39497c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
        ((FrameLayout.LayoutParams) this.f39498e.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(136.0f) + i7;
    }
}
