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
import b8.mf;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.o20;
import org.telegram.ui.o9;
import org.telegram.ui.x30;
import org.webrtc.RendererCommon;
public abstract class f0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean E;
    public boolean f39325a;
    public final b5.l f39326b;
    public final fi.j f39327c;
    public final LinearLayout d;
    public final fh0 f39328e;
    public final TextView[] f39329f;
    public final z1 h;
    public int f39330n;
    public int f39331r;
    public boolean f39332s;
    public boolean f39333w;
    public float f39334x;
    public int f39335y;

    public f0(Context context, boolean z10) {
        super(context);
        int i3;
        this.f39330n = 1;
        this.f39331r = 1;
        this.E = z10;
        if (z10) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        this.f39329f = new TextView[i3];
        b5.l lVar = new b5.l(context);
        this.f39326b = lVar;
        org.telegram.messenger.g0.C3(lVar, 2130706432);
        lVar.setAdapter(new w10(this, 1));
        lVar.setPageMargin(0);
        lVar.setOffscreenPageLimit(1);
        addView(lVar, mf.c(-1.0f, -1));
        lVar.b(new d0(this));
        z1 z1Var = new z1(context, false, false);
        this.h = z1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        y1 y1Var = z1Var.d;
        y1Var.setScalingType(scalingType);
        z1Var.f39733b0 = 1;
        z1Var.f39736d0 = true;
        y1Var.setAlpha(0.0f);
        y1Var.setRotateTextureWithScreen(true);
        y1Var.setUseCameraRotation(true);
        addView(z1Var, mf.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        kVar.setBackgroundColor(0);
        r6.m(kVar, 1, k6.Vg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new o9(this, 20));
        addView(kVar);
        fi.j jVar = new fi.j(this, getContext());
        this.f39327c = jVar;
        jVar.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        jVar.setTag(-1);
        jVar.setTextSize(1, 14.0f);
        int i10 = k6.f27853bh;
        r6.V(jVar, i10, null);
        jVar.setGravity(17);
        jVar.setTypeface(org.telegram.messenger.g0.o());
        jVar.setText(bd.M0(2131743250, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o10 = i0.a.o(k6.x0(null, i10, false), 76);
        jVar.setForeground(k6.k0(L, L, L, L, 0, o10, o10));
        jVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        jVar.setOnClickListener(new ii.m(this, 21));
        addView(jVar, mf.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, mf.e(-2, 64, 80));
        int i11 = 0;
        while (true) {
            TextView[] textViewArr = this.f39329f;
            if (i11 >= textViewArr.length) {
                break;
            }
            textViewArr[i11] = new TextView(context);
            this.f39329f[i11].setTextSize(1, 12.0f);
            this.f39329f[i11].setTextColor(-1);
            this.f39329f[i11].setTypeface(org.telegram.messenger.g0.o());
            this.f39329f[i11].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.f39329f[i11].setGravity(16);
            this.f39329f[i11].setSingleLine(true);
            this.d.addView(this.f39329f[i11], mf.o(-2, -1));
            if (i11 == 0 && this.E) {
                this.f39329f[i11].setText(bd.M0(2131743269, null));
            } else if (i11 != 0 && (i11 != 1 || !this.E)) {
                this.f39329f[i11].setText(bd.M0(2131743503, null));
            } else {
                this.f39329f[i11].setText(bd.M0(2131743415, null));
            }
            this.f39329f[i11].setOnClickListener(new bi.q(this, i11, 20));
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
        this.f39326b.setCurrentItem(this.E ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.f39328e = imageView;
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setBackground(k6.L(org.telegram.messenger.g0.L(48.0f), i0.a.o(-16777216, 76)));
        ch0 ch0Var = new ch0(2131624331, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        imageView.setAnimation(ch0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f39333w = true;
        ch0Var.M(69);
        imageView.setOnClickListener(new ux0(8, (Object) this, (Object) ch0Var));
        addView((View) imageView, mf.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(f0 f0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (f0Var.f39330n != f0Var.f39331r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i3 = f0Var.f39330n;
            if ((i3 == 1 && !isFrontFaceCamera) || (i3 == 2 && isFrontFaceCamera)) {
                f0Var.c();
                f0Var.f39332s = false;
                VoIPService.getSharedInstance().switchCamera();
                f0Var.h.setAlpha(0.0f);
            }
            f0Var.f39331r = f0Var.f39330n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f39325a) {
            return;
        }
        this.f39325a = true;
        c();
        x30 x30Var = ((o20) this).F;
        boolean z12 = x30Var.f51788r2.f39333w;
        x30Var.f51788r2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            x30Var.Q1(true, false);
            x30Var.S2.z();
            x30Var.Q0(true);
            x30Var.m1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(32.0f)).setDuration(150L).setListener(new w9(this, 12));
        invalidate();
    }

    public final void c() {
        z1 z1Var = this.h;
        if (this.f39332s) {
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
                        File h = org.telegram.messenger.t0.h();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(h, "cthumb" + this.f39331r + ".jpg")));
                        View findViewWithTag = this.f39326b.findViewWithTag(Integer.valueOf(this.f39331r - (1 ^ (this.E ? 1 : 0))));
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
        int i3 = this.f39335y;
        TextView[] textViewArr = this.f39329f;
        TextView textView2 = textViewArr[i3];
        if (i3 < textViewArr.length - 1) {
            textView = textViewArr[i3 + 1];
        } else {
            textView = null;
        }
        getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f39334x;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = this.f39335y;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f39334x;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f39334x;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f39327c.invalidate();
        boolean z10 = this.E;
        z1 z1Var = this.h;
        if (z10 && this.f39335y == 0 && this.f39334x <= 0.0f) {
            z1Var.setVisibility(4);
            return;
        }
        z1Var.setVisibility(0);
        if (this.f39335y + (!z10 ? 1 : 0) == this.f39330n) {
            z1Var.setTranslationX((-this.f39334x) * getMeasuredWidth());
        } else {
            z1Var.setTranslationX((1.0f - this.f39334x) * getMeasuredWidth());
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
        if (!this.f39332s) {
            this.f39332s = true;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        d();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        if (View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39327c.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        fh0 fh0Var = this.f39328e;
        if (fh0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.getLayoutParams();
            if (z10) {
                int L3 = org.telegram.messenger.g0.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = org.telegram.messenger.g0.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i3, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override
    public final void onStateChanged(int i3) {
        org.telegram.messenger.voip.s0.g(this, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public void setBottomPadding(int i3) {
        ((FrameLayout.LayoutParams) this.f39327c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f) + i3;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i3;
        ((FrameLayout.LayoutParams) this.f39328e.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(136.0f) + i3;
    }
}
