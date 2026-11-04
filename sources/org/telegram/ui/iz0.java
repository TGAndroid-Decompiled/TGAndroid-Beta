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
public final class iz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.js F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.e6 M;
    public org.telegram.messenger.zi N;
    public gz0 O;
    public org.telegram.ui.Cells.q1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.a8 W;
    public boolean X;
    public ge Y;
    public ai.r1 Z;
    public final Context f46456a;
    public final dz0 f46457a0;
    public final l0 f46458b;
    public float f46459b0;
    public final ai.c0 f46460c;
    public boolean f46461c0;
    public org.telegram.ui.Components.cz0 d;
    public org.telegram.ui.ActionBar.s1 f46462d0;
    public i0.b f46463e;
    public ValueAnimator f46464e0;
    public Bitmap f46465f;
    public ValueAnimator f46466f0;
    public BitmapShader h;
    public Paint f46467n;
    public Matrix f46468r;
    public float f46469s;
    public float f46470w;
    public org.telegram.ui.Components.m51 f46471x;
    public gi.l3 f46472y;

    public iz0(Activity activity) {
        super(activity, 2131755352);
        this.f46463e = i0.b.f14494e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.f46457a0 = new dz0(this, 0);
        this.f46459b0 = 0.0f;
        this.f46461c0 = false;
        this.f46456a = activity;
        org.telegram.messenger.g0.S(getWindow());
        l0 l0Var = new l0(23, activity, this);
        this.f46458b = l0Var;
        l0Var.setOnClickListener(new ez0(this, 0));
        ai.c0 c0Var = new ai.c0(this, activity);
        this.f46460c = c0Var;
        c0Var.setClipToPadding(false);
        l0Var.addView(c0Var, b8.mf.e(-1, -1, 119));
        fz0 fz0Var = new fz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(l0Var, fz0Var);
        if (org.telegram.messenger.az.f21662s0) {
            this.F = new org.telegram.ui.Components.js();
        }
    }

    public final void c(boolean z10, dz0 dz0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f46464e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f46466f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f46469s;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f46464e0 = ofFloat;
        ofFloat.addUpdateListener(new dh.u(11, this, z10));
        this.f46464e0.addListener(new androidx.fragment.app.g(this, z10, dz0Var, 13));
        if (!z10 && this.Z == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f46464e0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f46464e0.setDuration(j10);
        this.f46464e0.start();
        float f13 = this.f46470w;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f46466f0 = ofFloat2;
        ofFloat2.addUpdateListener(new xy0(this, 3));
        this.f46466f0.addListener(new u40(7, this, z10));
        this.f46466f0.setDuration(((float) j10) * 1.5f);
        this.f46466f0.setInterpolator(xqVar);
        this.f46466f0.start();
    }

    public final void d() {
        if (!this.I) {
            l0 l0Var = this.f46458b;
            if (l0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.P;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int width = l0Var.getWidth();
                    i0.b bVar = this.f46463e;
                    this.G = (iArr[0] - this.f46463e.f14495a) - ((((width - bVar.f14495a) - bVar.f14497c) - this.P.getWidth()) / 2.0f);
                    int height = l0Var.getHeight();
                    i0.b bVar2 = this.f46463e;
                    this.H = org.telegram.messenger.k5.y(((height - bVar2.f14496b) - bVar2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.f46463e.f14496b);
                    if (!this.K) {
                        this.K = true;
                        float i3 = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.P.getHeight()) / 2.0f);
                        this.J = i3;
                        if (this.T) {
                            this.J = 0.0f;
                        } else {
                            this.J = org.telegram.messenger.g0.T1(0.0f, i3, 0.78f);
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
        gz0 gz0Var;
        if (!this.f46461c0) {
            org.telegram.ui.ActionBar.s1 s1Var = this.f46462d0;
            if (s1Var != null) {
                s1Var.dismiss();
                this.f46462d0 = null;
            }
            this.f46461c0 = true;
            gi.l3 l3Var = this.f46472y;
            if (l3Var != null) {
                l3Var.f(true);
            }
            org.telegram.ui.Components.m51 m51Var = this.f46471x;
            if (m51Var != null) {
                m51Var.g0();
                this.f46471x.m0();
                this.f46471x = null;
            }
            if (!this.T && (gz0Var = this.O) != null && gz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.sm0 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.f46469s;
                org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f38076n;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            this.I = false;
            d();
            c(false, new dz0(this, 3));
            l0 l0Var = this.f46458b;
            l0Var.invalidate();
            ai.r1 r1Var = this.Z;
            if (r1Var != null) {
                org.telegram.ui.Cells.q1 q1Var2 = this.P;
                if (q1Var2 != null) {
                    q1Var2.f30016nb = true;
                }
                org.telegram.messenger.g0.h3(r1Var);
                this.Z = null;
                org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(this.f46456a, null);
                this.d = cz0Var;
                l0Var.addView(cz0Var, b8.mf.e(-1, -1, 119));
                org.telegram.ui.Components.cz0 cz0Var2 = this.d;
                gz0 gz0Var2 = this.O;
                dz0 dz0Var = new dz0(this, 1);
                org.telegram.ui.Components.az0 az0Var = cz0Var2.f32868a;
                if (az0Var != null) {
                    az0Var.b(1.5f, gz0Var2, dz0Var);
                    Choreographer.getInstance().postFrameCallback(cz0Var2.f32869b);
                } else {
                    org.telegram.ui.Components.bz0 bz0Var = new org.telegram.ui.Components.bz0(gz0Var2, dz0Var);
                    bz0Var.f32483g = 1.5f;
                    cz0Var2.f32870c.add(bz0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.js jsVar = this.F;
            if (jsVar != null) {
                PowerManager.WakeLock wakeLock = jsVar.h;
                SensorManager sensorManager = jsVar.f35174a;
                if (jsVar.f35179n) {
                    Sensor sensor = jsVar.f35178f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(jsVar, sensor);
                    }
                    Sensor sensor2 = jsVar.f35177e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(jsVar, sensor2);
                    }
                    Sensor sensor3 = jsVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(jsVar, sensor3);
                    }
                    sensorManager.unregisterListener(jsVar, jsVar.f35176c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    jsVar.f35179n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f46469s));
            this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f46469s));
            gi.l3 l3Var = this.f46472y;
            if (l3Var != null) {
                l3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f46469s));
                this.f46472y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f46469s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.zi ziVar;
        int i3;
        int i10;
        org.telegram.ui.ActionBar.s1 s1Var = this.f46462d0;
        if (s1Var != null) {
            s1Var.dismiss();
            this.f46462d0 = null;
        } else if (!this.f46461c0 && (ziVar = this.N) != null && !ziVar.Q3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
            if (this.T) {
                i3 = 2131743602;
            } else {
                i3 = 2131743527;
            }
            String M0 = org.telegram.messenger.bd.M0(i3, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
            s1Var2.S = M0;
            if (this.T) {
                i10 = 2131743603;
            } else {
                i10 = 2131743528;
            }
            s1Var2.U = org.telegram.messenger.bd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new fz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751599, null), new fz0(this, 2));
            this.f46462d0 = s1Var2;
            s1Var2.show();
            TextView textView = (TextView) this.f46462d0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
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
        l0 l0Var = this.f46458b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i3;
        boolean z10 = org.telegram.messenger.r2.f25040a;
        attributes.flags = i3 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(l0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ei(27, this, q1Var), 14.0f);
            this.X = true;
            c(true, null);
            ge geVar = this.Y;
            if (geVar != null) {
                org.telegram.messenger.g0.h3(geVar);
                this.Y = null;
            }
            org.telegram.ui.Components.js jsVar = this.F;
            if (jsVar != null) {
                PowerManager.WakeLock wakeLock = jsVar.h;
                SensorManager sensorManager = jsVar.f35174a;
                if (!jsVar.f35179n) {
                    Sensor sensor = jsVar.f35178f;
                    if (sensor != null) {
                        sensorManager.registerListener(jsVar, sensor, 30000);
                    }
                    Sensor sensor2 = jsVar.f35177e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(jsVar, sensor2, 30000);
                    }
                    Sensor sensor3 = jsVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(jsVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(jsVar, jsVar.f35176c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    jsVar.f35179n = true;
                }
            }
        }
    }
}
