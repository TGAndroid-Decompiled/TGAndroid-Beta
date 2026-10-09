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
public final class q5 extends FrameLayout implements SensorEventListener {
    public final float[] E;
    public final SensorManager F;
    public final Sensor G;
    public final boolean H;
    public final float[] I;
    public final float[] J;
    public final m5 K;
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
    public final n5 V;
    public final p5 f35415a;
    public final d5 f35416b;
    public boolean f35417c;
    public boolean d;
    public boolean f35418e;
    public long f35419f;
    public long h;
    public Runnable f35420n;
    public boolean f35421r;
    public boolean f35422s;
    public final o5 v;
    public final o5 f35423w;
    public final m.q3 f35424x;
    public final float[] f35425y;

    public q5(Context context, int i10, int i11) {
        super(context);
        boolean z10 = true;
        this.f35417c = true;
        this.f35419f = 1L;
        this.f35424x = new m.q3();
        this.f35425y = new float[8];
        this.E = new float[8];
        this.I = new float[9];
        this.J = new float[3];
        this.K = new Object();
        this.L = -0.22f;
        this.M = -0.28f;
        this.P = 1.0f;
        this.V = new n5(this, 0);
        setClipChildren(false);
        setClipToPadding(false);
        w7.z5.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.p(context.getApplicationContext(), i10, i11, 1));
        p5 p5Var = new p5(context, this, i10, i11);
        this.f35415a = p5Var;
        addView(p5Var, w7.x5.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        d5 d5Var = new d5(i10, i11, context, true);
        this.f35416b = d5Var;
        addView(d5Var, w7.x5.d(-1.0f, -1));
        o5 o5Var = new o5(context);
        this.v = o5Var;
        o5 o5Var2 = new o5(context);
        this.f35423w = o5Var2;
        addView(o5Var2, w7.x5.e(-1, -1, 17));
        addView(o5Var, w7.x5.e(-1, -1, 17));
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
        this.f35415a.f35384f0.P = new float[]{f7, f10};
        e();
        double cos = Math.cos(Math.toRadians(f10)) * Math.cos(Math.toRadians(f7));
        if (this.f35417c) {
            this.f35416b.b(f7, f10);
            d5 d5Var = this.f35416b;
            if (cos >= 0.0d) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            d5Var.setVisibility(i11);
        }
        o5 o5Var = this.v;
        if (cos >= 0.0d) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        o5Var.setVisibility(i10);
        o5 o5Var2 = this.f35423w;
        if (cos >= 0.0d) {
            i12 = 4;
        }
        o5Var2.setVisibility(i12);
        postInvalidateOnAnimation();
    }

    public final void c(float f7, float f10, float f11, float f12) {
        k5 k5Var = this.f35415a.f35384f0;
        float[] fArr = k5Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        k5Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        long j3;
        this.f35417c = true;
        p5 p5Var = this.f35415a;
        k5 k5Var = p5Var.f35384f0;
        synchronized (k5Var) {
            j3 = k5Var.U + 1;
        }
        this.f35419f = j3;
        p5Var.setAlpha(0.003921569f);
        o5 o5Var = this.v;
        o5Var.f35351e = true;
        o5Var.f35352f = true;
        a(this.N, this.Q);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o5 o5Var = this.v;
        this.d = true;
        try {
            o5Var.a(this.f35415a.f35384f0);
            this.d = false;
            o5Var.f35352f = this.f35417c;
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
            this.f35424x.c(width, height, this.N, this.Q, false, this.f35425y);
            this.f35424x.c(width, height, this.N, this.Q, true, this.E);
            this.v.b(this.f35425y);
            this.f35423w.b(this.E);
        }
    }

    public final void f() {
        SensorManager sensorManager;
        boolean z10;
        p5 p5Var = this.f35415a;
        if (p5Var != null && (sensorManager = this.F) != null) {
            if (!isShown() || getWindowVisibility() != 0) {
                this.f35418e = true;
            }
            if (this.f35421r && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f35422s != z10) {
                this.f35422s = z10;
                p5Var.setPaused(!z10);
                n5 n5Var = this.V;
                removeCallbacks(n5Var);
                if (z10) {
                    if (this.f35418e) {
                        this.f35418e = false;
                        d();
                    }
                    this.U = 0L;
                    Sensor sensor = this.G;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(n5Var);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public FrameLayout getBackFace() {
        return this.f35423w.f35350c;
    }

    public float getCardRotationX() {
        return this.N;
    }

    public float getCardRotationY() {
        return this.Q;
    }

    public FrameLayout getFrontFace() {
        return this.v.f35350c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35421r = true;
        this.U = 0L;
        m5 m5Var = this.K;
        m5Var.f35239a = false;
        m5Var.h = 0L;
        m5Var.f35245i = 0L;
        m5Var.f35246j = 0L;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        f();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f35421r = false;
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
            long j3 = this.U;
            if (j3 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j3)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.L = b(this.L - ((sensorEvent.values[1] * f7) * (-0.75f)), -0.82f, 0.82f);
                    this.M = b(com.google.android.gms.internal.vision.e2.w(sensorEvent.values[0], f7, -0.75f, this.M), -0.82f, 0.82f);
                }
            }
            this.U = sensorEvent.timestamp;
        }
        long j10 = sensorEvent.timestamp;
        this.K.a(((-this.M) / 0.82f) * 15.0f, (this.L / 0.82f) * 15.0f, j10);
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
        this.f35416b.setCardIcon(i10);
        this.f35415a.f35384f0.f35153a0 = i10;
    }

    public void setDiamondAlpha(float f7) {
        k5 k5Var = this.f35415a.f35384f0;
        k5Var.getClass();
        k5Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.f35416b.setEngravingBitmap(bitmap);
        this.f35415a.f35384f0.Y = bitmap;
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        long j3;
        this.f35420n = runnable;
        if (runnable != null) {
            k5 k5Var = this.f35415a.f35384f0;
            synchronized (k5Var) {
                j3 = k5Var.U + 1;
            }
            this.h = j3;
            this.v.f35351e = true;
            invalidate();
        }
    }

    public void setUseGyroscope(float f7) {
        if (this.P == f7) {
            return;
        }
        this.P = f7;
        k5 k5Var = this.f35415a.f35384f0;
        float f10 = (this.S * f7) + k5Var.f48046i + this.O;
        this.N = f10;
        float f11 = (this.T * f7) + k5Var.d;
        this.Q = f11;
        a(f10, f11);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
