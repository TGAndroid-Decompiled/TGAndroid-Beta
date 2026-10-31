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
public final class i11 extends Dialog {
    public TextView D;
    public final org.telegram.ui.Components.us E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.p6 L;
    public org.telegram.messenger.jj M;
    public g11 N;
    public org.telegram.ui.Cells.q1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.x7 V;
    public boolean W;
    public ue X;
    public a3.i0 Y;
    public final c11 Z;
    public final Context f38082a;
    public float f38083a0;
    public final l0 f38084b;
    public boolean f38085b0;
    public final fg.i f38086c;
    public org.telegram.ui.ActionBar.x1 f38087c0;
    public org.telegram.ui.Components.h01 d;
    public ValueAnimator f38088d0;
    public i0.c e;
    public ValueAnimator f38089e0;
    public Bitmap f38090f;
    public BitmapShader h;
    public Paint f38091n;
    public Matrix f38092r;
    public float f38093s;
    public float f38094w;
    public org.telegram.ui.Components.u61 f38095x;
    public vh.p2 f38096y;

    public i11(Activity activity) {
        super(activity, 2131755352);
        this.e = i0.c.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new c11(this, 0);
        this.f38083a0 = 0.0f;
        this.f38085b0 = false;
        this.f38082a = activity;
        org.telegram.messenger.i0.S(getWindow());
        l0 l0Var = new l0(this, activity, 24);
        this.f38084b = l0Var;
        l0Var.setOnClickListener(new d11(this, 0));
        fg.i iVar = new fg.i(this, activity);
        this.f38086c = iVar;
        iVar.setClipToPadding(false);
        l0Var.addView(iVar, w7.b6.e(-1, -1, 119));
        e11 e11Var = new e11(this, 0);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(l0Var, e11Var);
        if (org.telegram.messenger.tz.f18181s0) {
            this.E = new org.telegram.ui.Components.us();
        }
    }

    public final void c(boolean z10, c11 c11Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f38088d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38089e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f38093s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38088d0 = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(9, this, z10));
        this.f38088d0.addListener(new androidx.fragment.app.g(this, z10, c11Var, 10));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f38088d0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.f38088d0.setDuration(j10);
        this.f38088d0.start();
        float f12 = this.f38094w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38089e0 = ofFloat2;
        ofFloat2.addUpdateListener(new u01(this, 3));
        this.f38089e0.addListener(new org.telegram.ui.Components.ha0(23, this, z10));
        this.f38089e0.setDuration(((float) j10) * 1.5f);
        this.f38089e0.setInterpolator(grVar);
        this.f38089e0.start();
    }

    public final void d() {
        if (!this.H) {
            l0 l0Var = this.f38084b;
            if (l0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.O;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int width = l0Var.getWidth();
                    i0.c cVar = this.e;
                    this.F = (iArr[0] - this.e.f7765a) - ((((width - cVar.f7765a) - cVar.f7767c) - this.O.getWidth()) / 2.0f);
                    int height = l0Var.getHeight();
                    i0.c cVar2 = this.e;
                    this.G = org.telegram.messenger.m5.y(((height - cVar2.f7766b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f7766b);
                    if (!this.J) {
                        this.J = true;
                        float i10 = (Utilities.i((this.O.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.O.getHeight()) / 2.0f);
                        this.I = i10;
                        if (this.S) {
                            this.I = 0.0f;
                        } else {
                            this.I = org.telegram.messenger.i0.T1(0.0f, i10, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.G = 0.0f;
                    this.F = 0.0f;
                }
                this.H = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        g11 g11Var;
        if (!this.f38085b0) {
            org.telegram.ui.ActionBar.x1 x1Var = this.f38087c0;
            if (x1Var != null) {
                x1Var.dismiss();
                this.f38087c0 = null;
            }
            this.f38085b0 = true;
            vh.p2 p2Var = this.f38096y;
            if (p2Var != null) {
                p2Var.e(true);
            }
            org.telegram.ui.Components.u61 u61Var = this.f38095x;
            if (u61Var != null) {
                u61Var.g0();
                this.f38095x.m0();
                this.f38095x = null;
            }
            if (!this.S && (g11Var = this.N) != null && g11Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.qn0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f38093s;
                org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f29698n;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new c11(this, 3));
            l0 l0Var = this.f38084b;
            l0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.q1 q1Var2 = this.O;
                if (q1Var2 != null) {
                    q1Var2.f22646mb = true;
                }
                org.telegram.messenger.i0.g3(i0Var);
                this.Y = null;
                org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01(this.f38082a, null);
                this.d = h01Var;
                l0Var.addView(h01Var, w7.b6.e(-1, -1, 119));
                org.telegram.ui.Components.h01 h01Var2 = this.d;
                g11 g11Var2 = this.N;
                c11 c11Var = new c11(this, 1);
                org.telegram.ui.Components.f01 f01Var = h01Var2.f26574a;
                if (f01Var != null) {
                    f01Var.b(1.5f, g11Var2, c11Var);
                    Choreographer.getInstance().postFrameCallback(h01Var2.f26575b);
                } else {
                    org.telegram.ui.Components.g01 g01Var = new org.telegram.ui.Components.g01(g11Var2, c11Var);
                    g01Var.f26210g = 1.5f;
                    h01Var2.f26576c.add(g01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.us usVar = this.E;
            if (usVar != null) {
                PowerManager.WakeLock wakeLock = usVar.h;
                SensorManager sensorManager = usVar.f31021a;
                if (usVar.f31025n) {
                    Sensor sensor = usVar.f31024f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(usVar, sensor);
                    }
                    Sensor sensor2 = usVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(usVar, sensor2);
                    }
                    Sensor sensor3 = usVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(usVar, sensor3);
                    }
                    sensorManager.unregisterListener(usVar, usVar.f31023c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    usVar.f31025n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(org.telegram.messenger.i0.T1(this.F, 0.0f, this.f38093s));
            this.N.setTranslationY(org.telegram.messenger.i0.T1(this.G, this.I, this.f38093s));
            vh.p2 p2Var = this.f38096y;
            if (p2Var != null) {
                p2Var.setTranslationX(org.telegram.messenger.i0.T1(this.F, 0.0f, this.f38093s));
                this.f38096y.setTranslationY(org.telegram.messenger.i0.T1(this.G, this.I, this.f38093s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.jj jjVar;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.x1 x1Var = this.f38087c0;
        if (x1Var != null) {
            x1Var.dismiss();
            this.f38087c0 = null;
        } else if (!this.f38085b0 && (jjVar = this.M) != null && !jjVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.L);
            if (this.S) {
                i10 = 2131743618;
            } else {
                i10 = 2131743543;
            }
            String L0 = org.telegram.messenger.cd.L0(i10, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
            x1Var2.R = L0;
            if (this.S) {
                i11 = 2131743619;
            } else {
                i11 = 2131743544;
            }
            x1Var2.T = org.telegram.messenger.cd.L0(i11, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new e11(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751599, null), new e11(this, 2));
            this.f38087c0 = x1Var2;
            x1Var2.show();
            TextView textView = (TextView) this.f38087c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
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
        l0 l0Var = this.f38084b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        boolean z10 = org.telegram.messenger.v2.f18448a;
        attributes.flags = i10 | (-2013060864);
        org.telegram.messenger.i0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.i0.n3(l0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.O;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.i0.l2(new f11(0, this, q1Var), 14.0f);
            this.W = true;
            c(true, null);
            ue ueVar = this.X;
            if (ueVar != null) {
                org.telegram.messenger.i0.g3(ueVar);
                this.X = null;
            }
            org.telegram.ui.Components.us usVar = this.E;
            if (usVar != null) {
                PowerManager.WakeLock wakeLock = usVar.h;
                SensorManager sensorManager = usVar.f31021a;
                if (!usVar.f31025n) {
                    Sensor sensor = usVar.f31024f;
                    if (sensor != null) {
                        sensorManager.registerListener(usVar, sensor, 30000);
                    }
                    Sensor sensor2 = usVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(usVar, sensor2, 30000);
                    }
                    Sensor sensor3 = usVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(usVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(usVar, usVar.f31023c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    usVar.f31025n = true;
                }
            }
        }
    }
}
