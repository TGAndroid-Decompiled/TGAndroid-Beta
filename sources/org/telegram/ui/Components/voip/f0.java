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
import bi.j6;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.a50;
import org.telegram.ui.ar;
import org.telegram.ui.r30;
import org.telegram.ui.s9;
import org.webrtc.RendererCommon;
import w7.b6;
public abstract class f0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean D;
    public boolean f31473a;
    public final z4.g f31474b;
    public final j6 f31475c;
    public final LinearLayout d;
    public final fi0 e;
    public final TextView[] f31476f;
    public final z1 h;
    public int f31477n;
    public int f31478r;
    public boolean f31479s;
    public boolean f31480w;
    public float f31481x;
    public int f31482y;

    public f0(Context context, boolean z10) {
        super(context);
        int i10;
        this.f31477n = 1;
        this.f31478r = 1;
        this.D = z10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f31476f = new TextView[i10];
        z4.g gVar = new z4.g(context);
        this.f31474b = gVar;
        org.telegram.messenger.i0.B3(gVar, 2130706432);
        gVar.setAdapter(new kg.e1(this, 2));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, b6.c(-1.0f, -1));
        gVar.b(new d0(this));
        z1 z1Var = new z1(context, false, false);
        this.h = z1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        y1 y1Var = z1Var.d;
        y1Var.setScalingType(scalingType);
        z1Var.f31848a0 = 1;
        z1Var.f31852c0 = true;
        y1Var.setAlpha(0.0f);
        y1Var.setRotateTextureWithScreen(true);
        y1Var.setUseCameraRotation(true);
        addView(z1Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        lVar.setBackgroundColor(0);
        a7.m(lVar, 1, t6.Vg, null);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new ar(this, 10));
        addView(lVar);
        j6 j6Var = new j6(this, getContext());
        this.f31475c = j6Var;
        j6Var.setMinWidth(org.telegram.messenger.i0.L(64.0f));
        j6Var.setTag(-1);
        j6Var.setTextSize(1, 14.0f);
        int i11 = t6.f20902bh;
        a7.V(j6Var, i11, null);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.i0.o());
        j6Var.setText(dd.L0(2131743266, null));
        int L = org.telegram.messenger.i0.L(6.0f);
        int o10 = i0.b.o(t6.x0(null, i11, false), 76);
        j6Var.setForeground(t6.k0(L, L, L, L, 0, o10, o10));
        j6Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        j6Var.setOnClickListener(new ag.g(this, 21));
        addView(j6Var, b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, b6.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f31476f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f31476f[i12].setTextSize(1, 12.0f);
            this.f31476f[i12].setTextColor(-1);
            this.f31476f[i12].setTypeface(org.telegram.messenger.i0.o());
            this.f31476f[i12].setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            this.f31476f[i12].setGravity(16);
            this.f31476f[i12].setSingleLine(true);
            this.d.addView(this.f31476f[i12], b6.o(-2, -1));
            if (i12 == 0 && this.D) {
                this.f31476f[i12].setText(dd.L0(2131743285, null));
            } else if (i12 != 0 && (i12 != 1 || !this.D)) {
                this.f31476f[i12].setText(dd.L0(2131743519, null));
            } else {
                this.f31476f[i12].setText(dd.L0(2131743431, null));
            }
            this.f31476f[i12].setOnClickListener(new bh.f(this, i12, 15));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(org.telegram.messenger.i0.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.f31474b.setCurrentItem(this.D ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f));
        imageView.setBackground(t6.L(org.telegram.messenger.i0.L(48.0f), i0.b.o(-16777216, 76)));
        ci0 ci0Var = new ci0(2131624329, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        imageView.setAnimation(ci0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f31480w = true;
        ci0Var.M(69);
        imageView.setOnClickListener(new sr(25, this, ci0Var));
        addView((View) imageView, b6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(f0 f0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (f0Var.f31477n != f0Var.f31478r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = f0Var.f31477n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                f0Var.c();
                f0Var.f31479s = false;
                VoIPService.getSharedInstance().switchCamera();
                f0Var.h.setAlpha(0.0f);
            }
            f0Var.f31478r = f0Var.f31477n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f31473a) {
            return;
        }
        this.f31473a = true;
        c();
        a50 a50Var = ((r30) this).E;
        boolean z12 = a50Var.f35648q2.f31480w;
        a50Var.f35648q2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            a50Var.Q1(true, false);
            a50Var.R2.z();
            a50Var.Q0(true);
            a50Var.l1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.i0.L(32.0f)).setDuration(150L).setListener(new s9(this, 23));
        invalidate();
    }

    public final void c() {
        z1 z1Var = this.h;
        if (this.f31479s) {
            try {
                Bitmap bitmap = z1Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), z1Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File h = org.telegram.messenger.w0.h();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(h, "cthumb" + this.f31478r + ".jpg")));
                        View findViewWithTag = this.f31474b.findViewWithTag(Integer.valueOf(this.f31478r - (1 ^ (this.D ? 1 : 0))));
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
        int i10 = this.f31482y;
        TextView[] textViewArr = this.f31476f;
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
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f31481x;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f31482y;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f31481x;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f31481x;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f31475c.invalidate();
        boolean z10 = this.D;
        z1 z1Var = this.h;
        if (z10 && this.f31482y == 0 && this.f31481x <= 0.0f) {
            z1Var.setVisibility(4);
            return;
        }
        z1Var.setVisibility(0);
        if (this.f31482y + (!z10 ? 1 : 0) == this.f31477n) {
            z1Var.setTranslationX((-this.f31481x) * getMeasuredWidth());
        } else {
            z1Var.setTranslationX((1.0f - this.f31481x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.b.o(t6.x0(null, t6.Ug, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.y0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f31479s) {
            this.f31479s = true;
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31475c.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.i0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        fi0 fi0Var = this.e;
        if (fi0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fi0Var.getLayoutParams();
            if (z10) {
                int L3 = org.telegram.messenger.i0.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = org.telegram.messenger.i0.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i10, i11);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.y0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f31475c.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(136.0f) + i10;
    }
}
