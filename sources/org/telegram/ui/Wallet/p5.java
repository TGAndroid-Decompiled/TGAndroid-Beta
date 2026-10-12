package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class p5 extends FrameLayout implements SensorEventListener {
    public final float[] E;
    public final SensorManager F;
    public final Sensor G;
    public final boolean H;
    public final float[] I;
    public final float[] J;
    public final l5 K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public long U;
    public final m5 V;
    public final o5 f33596a;
    public final c5 f33597b;
    public boolean f33598c;
    public boolean d;
    public boolean e;
    public long f33599f;
    public long h;
    public Runnable f33600n;
    public boolean f33601r;
    public boolean f33602s;
    public final n5 v;
    public final n5 f33603w;
    public final m.q3 f33604x;
    public final float[] f33605y;

    public p5(Context context, int i10, int i11) {
        super(context);
        boolean z10 = true;
        this.f33598c = true;
        this.f33599f = 1L;
        this.f33604x = new m.q3();
        this.f33605y = new float[8];
        this.E = new float[8];
        this.I = new float[9];
        this.J = new float[3];
        this.K = new Object();
        this.L = -0.22f;
        this.M = -0.28f;
        this.P = 1.0f;
        this.V = new m5(this, 0);
        setClipChildren(false);
        setClipToPadding(false);
        w7.c6.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.q(context.getApplicationContext(), i10, i11, 1));
        o5 o5Var = new o5(context, this, i10, i11);
        this.f33596a = o5Var;
        addView(o5Var, w7.a6.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        c5 c5Var = new c5(i10, i11, context, true);
        this.f33597b = c5Var;
        addView(c5Var, w7.a6.d(-1.0f, -1));
        n5 n5Var = new n5(context);
        this.v = n5Var;
        n5 n5Var2 = new n5(context);
        this.f33603w = n5Var2;
        addView(n5Var2, w7.a6.e(-1, -1, 17));
        addView(n5Var, w7.a6.e(-1, -1, 17));
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.F = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.G = defaultSensor;
        this.H = (defaultSensor == null || defaultSensor.getType() == 4) ? false : z10;
    }

    public static float b(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a(float f7, float f10) {
        int i10;
        int i11;
        int i12 = 0;
        this.f33596a.f33562f0.P = new float[]{f7, f10};
        e();
        double cos = Math.cos(Math.toRadians(f10)) * Math.cos(Math.toRadians(f7));
        if (this.f33598c) {
            this.f33597b.b(f7, f10);
            c5 c5Var = this.f33597b;
            if (cos >= 0.0d) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            c5Var.setVisibility(i11);
        }
        n5 n5Var = this.v;
        if (cos >= 0.0d) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        n5Var.setVisibility(i10);
        n5 n5Var2 = this.f33603w;
        if (cos >= 0.0d) {
            i12 = 4;
        }
        n5Var2.setVisibility(i12);
        postInvalidateOnAnimation();
    }

    public final void c(float f7, float f10, float f11, float f12) {
        j5 j5Var = this.f33596a.f33562f0;
        float[] fArr = j5Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        j5Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        long j10;
        this.f33598c = true;
        o5 o5Var = this.f33596a;
        j5 j5Var = o5Var.f33562f0;
        synchronized (j5Var) {
            j10 = j5Var.U + 1;
        }
        this.f33599f = j10;
        o5Var.setAlpha(0.003921569f);
        n5 n5Var = this.v;
        n5Var.e = true;
        n5Var.f33517f = true;
        a(this.N, this.Q);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n5 n5Var = this.v;
        this.d = true;
        try {
            n5Var.a(this.f33596a.f33562f0);
            this.d = false;
            n5Var.f33517f = this.f33598c;
            super.dispatchDraw(canvas);
        } catch (Throwable th2) {
            this.d = false;
            throw th2;
        }
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            this.f33604x.c(width, height, this.N, this.Q, false, this.f33605y);
            this.f33604x.c(width, height, this.N, this.Q, true, this.E);
            this.v.b(this.f33605y);
            this.f33603w.b(this.E);
        }
    }

    public final void f() {
        SensorManager sensorManager;
        boolean z10;
        o5 o5Var = this.f33596a;
        if (o5Var != null && (sensorManager = this.F) != null) {
            if (!isShown() || getWindowVisibility() != 0) {
                this.e = true;
            }
            if (this.f33601r && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f33602s != z10) {
                this.f33602s = z10;
                o5Var.setPaused(!z10);
                m5 m5Var = this.V;
                removeCallbacks(m5Var);
                if (z10) {
                    if (this.e) {
                        this.e = false;
                        d();
                    }
                    this.U = 0L;
                    Sensor sensor = this.G;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(m5Var);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public FrameLayout getBackFace() {
        return this.f33603w.f33516c;
    }

    public float getCardRotationX() {
        return this.N;
    }

    public float getCardRotationY() {
        return this.Q;
    }

    public FrameLayout getFrontFace() {
        return this.v.f33516c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33601r = true;
        this.U = 0L;
        l5 l5Var = this.K;
        l5Var.f33434a = false;
        l5Var.h = 0L;
        l5Var.f33439i = 0L;
        l5Var.f33440j = 0L;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        f();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33601r = false;
        f();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            e();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), 1073741824));
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.H) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.I;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.J;
            SensorManager.getOrientation(fArr2, fArr3);
            this.L = b((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.M = b(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            long j10 = this.U;
            if (j10 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.L = b(this.L - ((sensorEvent.values[1] * f7) * (-0.75f)), -0.82f, 0.82f);
                    this.M = b(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, -0.75f, this.M), -0.82f, 0.82f);
                }
            }
            this.U = sensorEvent.timestamp;
        }
        long j11 = sensorEvent.timestamp;
        this.K.a(((-this.M) / 0.82f) * 15.0f, (this.L / 0.82f) * 15.0f, j11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        e();
    }

    @Override
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        f();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        f();
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        f();
    }

    public void setAdditionalTilt(float f7) {
        float f10 = this.O;
        if (f10 == f7) {
            return;
        }
        float f11 = (f7 - f10) + this.N;
        this.N = f11;
        this.O = f7;
        a(f11, this.Q);
    }

    public void setCardIcon(int i10) {
        this.f33597b.setCardIcon(i10);
        this.f33596a.f33562f0.f33356a0 = i10;
    }

    public void setDiamondAlpha(float f7) {
        j5 j5Var = this.f33596a.f33562f0;
        j5Var.getClass();
        j5Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.f33597b.setEngravingBitmap(bitmap);
        this.f33596a.f33562f0.Y = bitmap;
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        long j10;
        this.f33600n = runnable;
        if (runnable != null) {
            j5 j5Var = this.f33596a.f33562f0;
            synchronized (j5Var) {
                j10 = j5Var.U + 1;
            }
            this.h = j10;
            this.v.e = true;
            invalidate();
        }
    }

    public void setUseGyroscope(float f7) {
        if (this.P == f7) {
            return;
        }
        this.P = f7;
        j5 j5Var = this.f33596a.f33562f0;
        float f10 = (this.S * f7) + j5Var.f45708i + this.O;
        this.N = f10;
        float f11 = (this.T * f7) + j5Var.d;
        this.Q = f11;
        a(f10, f11);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
