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
public final class h11 extends Dialog {
    public TextView D;
    public final org.telegram.ui.Components.us E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.p6 L;
    public org.telegram.messenger.kj M;
    public f11 N;
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
    public final Context f37615a;
    public float f37616a0;
    public final l0 f37617b;
    public boolean f37618b0;
    public final fg.i f37619c;
    public org.telegram.ui.ActionBar.x1 f37620c0;
    public org.telegram.ui.Components.i01 d;
    public ValueAnimator f37621d0;
    public i0.c e;
    public ValueAnimator f37622e0;
    public Bitmap f37623f;
    public BitmapShader h;
    public Paint f37624n;
    public Matrix f37625r;
    public float f37626s;
    public float f37627w;
    public org.telegram.ui.Components.v61 f37628x;
    public vh.p2 f37629y;

    public h11(Activity activity) {
        super(activity, 2131755352);
        this.e = i0.c.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new c11(this, 0);
        this.f37616a0 = 0.0f;
        this.f37618b0 = false;
        this.f37615a = activity;
        org.telegram.messenger.i0.S(getWindow());
        l0 l0Var = new l0(this, activity, 24);
        this.f37617b = l0Var;
        l0Var.setOnClickListener(new d11(this, 0));
        fg.i iVar = new fg.i(this, activity);
        this.f37619c = iVar;
        iVar.setClipToPadding(false);
        l0Var.addView(iVar, w7.b6.e(-1, -1, 119));
        e11 e11Var = new e11(this, 0);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(l0Var, e11Var);
        if (org.telegram.messenger.uz.f18550s0) {
            this.E = new org.telegram.ui.Components.us();
        }
    }

    public final void c(boolean z10, c11 c11Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f37621d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f37622e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f37626s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37621d0 = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(9, this, z10));
        this.f37621d0.addListener(new androidx.fragment.app.g(this, z10, c11Var, 10));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f37621d0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.f37621d0.setDuration(j10);
        this.f37621d0.start();
        float f12 = this.f37627w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f37622e0 = ofFloat2;
        ofFloat2.addUpdateListener(new u01(this, 3));
        this.f37622e0.addListener(new org.telegram.ui.Components.ha0(23, this, z10));
        this.f37622e0.setDuration(((float) j10) * 1.5f);
        this.f37622e0.setInterpolator(grVar);
        this.f37622e0.start();
    }

    public final void d() {
        if (!this.H) {
            l0 l0Var = this.f37617b;
            if (l0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.O;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int width = l0Var.getWidth();
                    i0.c cVar = this.e;
                    this.F = (iArr[0] - this.e.f7766a) - ((((width - cVar.f7766a) - cVar.f7768c) - this.O.getWidth()) / 2.0f);
                    int height = l0Var.getHeight();
                    i0.c cVar2 = this.e;
                    this.G = org.telegram.messenger.m5.y(((height - cVar2.f7767b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f7767b);
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
        f11 f11Var;
        if (!this.f37618b0) {
            org.telegram.ui.ActionBar.x1 x1Var = this.f37620c0;
            if (x1Var != null) {
                x1Var.dismiss();
                this.f37620c0 = null;
            }
            this.f37618b0 = true;
            vh.p2 p2Var = this.f37629y;
            if (p2Var != null) {
                p2Var.e(true);
            }
            org.telegram.ui.Components.v61 v61Var = this.f37628x;
            if (v61Var != null) {
                v61Var.g0();
                this.f37628x.m0();
                this.f37628x = null;
            }
            if (!this.S && (f11Var = this.N) != null && f11Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.rn0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f37626s;
                org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f30037n;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new c11(this, 3));
            l0 l0Var = this.f37617b;
            l0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.q1 q1Var2 = this.O;
                if (q1Var2 != null) {
                    q1Var2.f22647mb = true;
                }
                org.telegram.messenger.i0.g3(i0Var);
                this.Y = null;
                org.telegram.ui.Components.i01 i01Var = new org.telegram.ui.Components.i01(this.f37615a, null);
                this.d = i01Var;
                l0Var.addView(i01Var, w7.b6.e(-1, -1, 119));
                org.telegram.ui.Components.i01 i01Var2 = this.d;
                f11 f11Var2 = this.N;
                c11 c11Var = new c11(this, 1);
                org.telegram.ui.Components.g01 g01Var = i01Var2.f26976a;
                if (g01Var != null) {
                    g01Var.b(1.5f, f11Var2, c11Var);
                    Choreographer.getInstance().postFrameCallback(i01Var2.f26977b);
                } else {
                    org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01(f11Var2, c11Var);
                    h01Var.f26623g = 1.5f;
                    i01Var2.f26978c.add(h01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.us usVar = this.E;
            if (usVar != null) {
                PowerManager.WakeLock wakeLock = usVar.h;
                SensorManager sensorManager = usVar.f31072a;
                if (usVar.f31076n) {
                    Sensor sensor = usVar.f31075f;
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
                    sensorManager.unregisterListener(usVar, usVar.f31074c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    usVar.f31076n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(org.telegram.messenger.i0.T1(this.F, 0.0f, this.f37626s));
            this.N.setTranslationY(org.telegram.messenger.i0.T1(this.G, this.I, this.f37626s));
            vh.p2 p2Var = this.f37629y;
            if (p2Var != null) {
                p2Var.setTranslationX(org.telegram.messenger.i0.T1(this.F, 0.0f, this.f37626s));
                this.f37629y.setTranslationY(org.telegram.messenger.i0.T1(this.G, this.I, this.f37626s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.kj kjVar;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.x1 x1Var = this.f37620c0;
        if (x1Var != null) {
            x1Var.dismiss();
            this.f37620c0 = null;
        } else if (!this.f37618b0 && (kjVar = this.M) != null && !kjVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.L);
            if (this.S) {
                i10 = 2131743618;
            } else {
                i10 = 2131743543;
            }
            String L0 = org.telegram.messenger.dd.L0(i10, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
            x1Var2.R = L0;
            if (this.S) {
                i11 = 2131743619;
            } else {
                i11 = 2131743544;
            }
            x1Var2.T = org.telegram.messenger.dd.L0(i11, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new e11(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751599, null), new e11(this, 2));
            this.f37620c0 = x1Var2;
            x1Var2.show();
            TextView textView = (TextView) this.f37620c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
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
        l0 l0Var = this.f37617b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        boolean z10 = org.telegram.messenger.v2.f18578a;
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
            org.telegram.messenger.i0.l2(new d01(1, this, q1Var), 14.0f);
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
                SensorManager sensorManager = usVar.f31072a;
                if (!usVar.f31076n) {
                    Sensor sensor = usVar.f31075f;
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
                    sensorManager.registerListener(usVar, usVar.f31074c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    usVar.f31076n = true;
                }
            }
        }
    }
}
