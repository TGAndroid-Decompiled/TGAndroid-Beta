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
import c8.ma;
import hi.o4;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.f40;
import org.telegram.ui.w20;
import org.telegram.ui.x7;
import org.webrtc.RendererCommon;
public abstract class w0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean E;
    public boolean f41415a;
    public final c5.l f41416b;
    public final gi.j f41417c;
    public final LinearLayout d;
    public final rh0 f41418e;
    public final TextView[] f41419f;
    public final n2 h;
    public int f41420n;
    public int f41421r;
    public boolean f41422s;
    public boolean f41423w;
    public float f41424x;
    public int f41425y;

    public w0(Context context, boolean z10) {
        super(context);
        int i7;
        this.f41420n = 1;
        this.f41421r = 1;
        this.E = z10;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        this.f41419f = new TextView[i7];
        c5.l lVar = new c5.l(context);
        this.f41416b = lVar;
        org.telegram.messenger.g0.A3(lVar, 2130706432);
        lVar.setAdapter(new n20(this, 1));
        lVar.setPageMargin(0);
        lVar.setOffscreenPageLimit(1);
        addView(lVar, ma.c(-1.0f, -1));
        lVar.b(new u0(this));
        n2 n2Var = new n2(context, false, false);
        this.h = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.f41213b0 = 1;
        n2Var.f41216d0 = true;
        m2Var.setAlpha(0.0f);
        m2Var.setRotateTextureWithScreen(true);
        m2Var.setUseCameraRotation(true);
        addView(n2Var, ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        kVar.setBackgroundColor(0);
        t6.l(kVar, 1, m6.Yg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new x7(this, 22));
        addView(kVar);
        gi.j jVar = new gi.j(this, getContext());
        this.f41417c = jVar;
        jVar.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        jVar.setTag(-1);
        jVar.setTextSize(1, 14.0f);
        int i10 = m6.f29410eh;
        t6.U(jVar, i10, null);
        jVar.setGravity(17);
        jVar.setTypeface(org.telegram.messenger.g0.o());
        jVar.setText(hd.N0(2131742995, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(m6.x0(null, i10, false), 76);
        jVar.setForeground(m6.k0(L, L, L, L, 0, o4, o4));
        jVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        jVar.setOnClickListener(new o4(this, 25));
        addView(jVar, ma.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, ma.e(-2, 64, 80));
        int i11 = 0;
        while (true) {
            TextView[] textViewArr = this.f41419f;
            if (i11 >= textViewArr.length) {
                break;
            }
            textViewArr[i11] = new TextView(context);
            this.f41419f[i11].setTextSize(1, 12.0f);
            this.f41419f[i11].setTextColor(-1);
            this.f41419f[i11].setTypeface(org.telegram.messenger.g0.o());
            this.f41419f[i11].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.f41419f[i11].setGravity(16);
            this.f41419f[i11].setSingleLine(true);
            this.d.addView(this.f41419f[i11], ma.o(-2, -1));
            if (i11 == 0 && this.E) {
                this.f41419f[i11].setText(hd.N0(2131743014, null));
            } else if (i11 != 0 && (i11 != 1 || !this.E)) {
                this.f41419f[i11].setText(hd.N0(2131743248, null));
            } else {
                this.f41419f[i11].setText(hd.N0(2131743160, null));
            }
            this.f41419f[i11].setOnClickListener(new ci.q(this, i11, 22));
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
        this.f41416b.setCurrentItem(this.E ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.f41418e = imageView;
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setBackground(m6.L(org.telegram.messenger.g0.L(48.0f), i0.a.o(-16777216, 76)));
        oh0 oh0Var = new oh0(2131624332, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        imageView.setAnimation(oh0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f41423w = true;
        oh0Var.M(69);
        imageView.setOnClickListener(new q31(4, this, oh0Var));
        addView((View) imageView, ma.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(w0 w0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (w0Var.f41420n != w0Var.f41421r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i7 = w0Var.f41420n;
            if ((i7 == 1 && !isFrontFaceCamera) || (i7 == 2 && isFrontFaceCamera)) {
                w0Var.c();
                w0Var.f41422s = false;
                VoIPService.getSharedInstance().switchCamera();
                w0Var.h.setAlpha(0.0f);
            }
            w0Var.f41421r = w0Var.f41420n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f41415a) {
            return;
        }
        this.f41415a = true;
        c();
        f40 f40Var = ((w20) this).F;
        boolean z12 = f40Var.f47555u2.f41423w;
        f40Var.f47555u2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            f40Var.W1(true, false);
            f40Var.V2.z();
            f40Var.R0(true);
            f40Var.f47530p1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(32.0f)).setDuration(150L).setListener(new y9(this, 13));
        invalidate();
    }

    public final void c() {
        n2 n2Var = this.h;
        if (this.f41422s) {
            try {
                Bitmap bitmap = n2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), n2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File h = org.telegram.messenger.t0.h();
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(h, "cthumb" + this.f41421r + ".jpg")));
                        View findViewWithTag = this.f41416b.findViewWithTag(Integer.valueOf(this.f41421r - (1 ^ (this.E ? 1 : 0))));
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
        int i7 = this.f41425y;
        TextView[] textViewArr = this.f41419f;
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
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f41424x;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = this.f41425y;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f41424x;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f41424x;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f41417c.invalidate();
        boolean z10 = this.E;
        n2 n2Var = this.h;
        if (z10 && this.f41425y == 0 && this.f41424x <= 0.0f) {
            n2Var.setVisibility(4);
            return;
        }
        n2Var.setVisibility(0);
        if (this.f41425y + (!z10 ? 1 : 0) == this.f41420n) {
            n2Var.setTranslationX((-this.f41424x) * getMeasuredWidth());
        } else {
            n2Var.setTranslationX((1.0f - this.f41424x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.o(m6.x0(null, m6.Xg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.t0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f41422s) {
            this.f41422s = true;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        d();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41417c.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        rh0 rh0Var = this.f41418e;
        if (rh0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rh0Var.getLayoutParams();
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
        super.onMeasure(i7, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        org.telegram.messenger.voip.t0.g(this, i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.f41417c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
        ((FrameLayout.LayoutParams) this.f41418e.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(136.0f) + i7;
    }
}
