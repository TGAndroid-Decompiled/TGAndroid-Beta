package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.ps F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.e6 M;
    public org.telegram.messenger.gj N;
    public nz0 O;
    public org.telegram.ui.Cells.q1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.z7 W;
    public boolean X;
    public fe Y;
    public bi.m1 Z;
    public final Context f50399a;
    public final kz0 f50400a0;
    public final k0 f50401b;
    public float f50402b0;
    public final ai.j0 f50403c;
    public boolean f50404c0;
    public org.telegram.ui.Components.fz0 d;
    public org.telegram.ui.ActionBar.t1 f50405d0;
    public i0.c f50406e;
    public ValueAnimator f50407e0;
    public Bitmap f50408f;
    public ValueAnimator f50409f0;
    public BitmapShader h;
    public Paint f50410n;
    public Matrix f50411r;
    public float f50412s;
    public float f50413w;
    public org.telegram.ui.Components.u51 f50414x;
    public hi.l3 f50415y;

    public pz0(Activity activity) {
        super(activity, 2131755352);
        this.f50406e = i0.c.f15573e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.f50400a0 = new kz0(this, 0);
        this.f50402b0 = 0.0f;
        this.f50404c0 = false;
        this.f50399a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.f50401b = k0Var;
        k0Var.setOnClickListener(new lz0(this, 0));
        ai.j0 j0Var = new ai.j0(this, activity);
        this.f50403c = j0Var;
        j0Var.setClipToPadding(false);
        k0Var.addView(j0Var, c8.ja.e(-1, -1, 119));
        mz0 mz0Var = new mz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(k0Var, mz0Var);
        if (org.telegram.messenger.gz.f23979s0) {
            this.F = new org.telegram.ui.Components.ps();
        }
    }

    public final void c(boolean z10, kz0 kz0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f50407e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f50409f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f50412s;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f50407e0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(11, this, z10));
        this.f50407e0.addListener(new androidx.fragment.app.g(this, z10, kz0Var, 13));
        if (!z10 && this.Z == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f50407e0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.f50407e0.setDuration(j3);
        this.f50407e0.start();
        float f13 = this.f50413w;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f50409f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ez0(this, 3));
        this.f50409f0.addListener(new z20(8, this, z10));
        this.f50409f0.setDuration(((float) j3) * 1.5f);
        this.f50409f0.setInterpolator(erVar);
        this.f50409f0.start();
    }

    public final void d() {
        if (!this.I) {
            k0 k0Var = this.f50401b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.P;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.c cVar = this.f50406e;
                    this.G = (iArr[0] - this.f50406e.f15574a) - ((((width - cVar.f15574a) - cVar.f15576c) - this.P.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.c cVar2 = this.f50406e;
                    this.H = org.telegram.messenger.k5.y(((height - cVar2.f15575b) - cVar2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.f50406e.f15575b);
                    if (!this.K) {
                        this.K = true;
                        float i7 = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.P.getHeight()) / 2.0f);
                        this.J = i7;
                        if (this.T) {
                            this.J = 0.0f;
                        } else {
                            this.J = org.telegram.messenger.g0.T1(0.0f, i7, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.H = 0.0f;
                    this.G = 0.0f;
                }
                this.I = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        nz0 nz0Var;
        if (!this.f50404c0) {
            org.telegram.ui.ActionBar.t1 t1Var = this.f50405d0;
            if (t1Var != null) {
                t1Var.dismiss();
                this.f50405d0 = null;
            }
            this.f50404c0 = true;
            hi.l3 l3Var = this.f50415y;
            if (l3Var != null) {
                l3Var.f(true);
            }
            org.telegram.ui.Components.u51 u51Var = this.f50414x;
            if (u51Var != null) {
                u51Var.g0();
                this.f50414x.m0();
                this.f50414x = null;
            }
            if (!this.T && (nz0Var = this.O) != null && nz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.tm0 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.f50412s;
                org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f39736n;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            this.I = false;
            d();
            c(false, new kz0(this, 3));
            k0 k0Var = this.f50401b;
            k0Var.invalidate();
            bi.m1 m1Var = this.Z;
            if (m1Var != null) {
                org.telegram.ui.Cells.q1 q1Var2 = this.P;
                if (q1Var2 != null) {
                    q1Var2.f31095ob = true;
                }
                org.telegram.messenger.g0.h3(m1Var);
                this.Z = null;
                org.telegram.ui.Components.fz0 fz0Var = new org.telegram.ui.Components.fz0(this.f50399a, null);
                this.d = fz0Var;
                k0Var.addView(fz0Var, c8.ja.e(-1, -1, 119));
                org.telegram.ui.Components.fz0 fz0Var2 = this.d;
                nz0 nz0Var2 = this.O;
                kz0 kz0Var = new kz0(this, 1);
                org.telegram.ui.Components.dz0 dz0Var = fz0Var2.f34755a;
                if (dz0Var != null) {
                    dz0Var.b(1.5f, nz0Var2, kz0Var);
                    Choreographer.getInstance().postFrameCallback(fz0Var2.f34756b);
                } else {
                    org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0(nz0Var2, kz0Var);
                    ez0Var.f34460g = 1.5f;
                    fz0Var2.f34757c.add(ez0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ps psVar = this.F;
            if (psVar != null) {
                PowerManager.WakeLock wakeLock = psVar.h;
                SensorManager sensorManager = psVar.f38395a;
                if (psVar.f38400n) {
                    Sensor sensor = psVar.f38399f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(psVar, sensor);
                    }
                    Sensor sensor2 = psVar.f38398e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(psVar, sensor2);
                    }
                    Sensor sensor3 = psVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(psVar, sensor3);
                    }
                    sensorManager.unregisterListener(psVar, psVar.f38397c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    psVar.f38400n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f50412s));
            this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f50412s));
            hi.l3 l3Var = this.f50415y;
            if (l3Var != null) {
                l3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f50412s));
                this.f50415y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f50412s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.gj gjVar;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.t1 t1Var = this.f50405d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.f50405d0 = null;
        } else if (!this.f50404c0 && (gjVar = this.N) != null && !gjVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
            if (this.T) {
                i7 = 2131743592;
            } else {
                i7 = 2131743517;
            }
            String M0 = org.telegram.messenger.hd.M0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
            t1Var2.S = M0;
            if (this.T) {
                i10 = 2131743593;
            } else {
                i10 = 2131743518;
            }
            t1Var2.U = org.telegram.messenger.hd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new mz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751598, null), new mz0(this, 2));
            this.f50405d0 = t1Var2;
            t1Var2.show();
            TextView textView = (TextView) this.f50405d0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        k0 k0Var = this.f50401b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.r2.f26198a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(k0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.gh(29, this, q1Var), 14.0f);
            this.X = true;
            c(true, null);
            fe feVar = this.Y;
            if (feVar != null) {
                org.telegram.messenger.g0.h3(feVar);
                this.Y = null;
            }
            org.telegram.ui.Components.ps psVar = this.F;
            if (psVar != null) {
                PowerManager.WakeLock wakeLock = psVar.h;
                SensorManager sensorManager = psVar.f38395a;
                if (!psVar.f38400n) {
                    Sensor sensor = psVar.f38399f;
                    if (sensor != null) {
                        sensorManager.registerListener(psVar, sensor, 30000);
                    }
                    Sensor sensor2 = psVar.f38398e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(psVar, sensor2, 30000);
                    }
                    Sensor sensor3 = psVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(psVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(psVar, psVar.f38397c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    psVar.f38400n = true;
                }
            }
        }
    }
}
