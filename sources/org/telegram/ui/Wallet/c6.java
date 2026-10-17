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
public final class c6 extends FrameLayout implements SensorEventListener {
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final a6 H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public long R;
    public final org.telegram.ui.Cells.k7 S;
    public float T;
    public float U;
    public final b6 f34080a;
    public final o5 f34081b;
    public boolean f34082c;
    public boolean d;
    public Runnable e;
    public boolean f34083f;
    public boolean h;
    public final ai.w1 f34084n;
    public final ai.w1 f34085r;
    public final m.s3 f34086s;
    public final float[] v;
    public final float[] f34087w;
    public final SensorManager f34088x;
    public final Sensor f34089y;

    public c6(Context context, int i10, int i11) {
        super(context);
        boolean z10 = true;
        this.f34082c = true;
        this.f34086s = new m.s3();
        this.v = new float[8];
        this.f34087w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new Object();
        this.I = -0.22f;
        this.J = -0.28f;
        this.M = 1.0f;
        this.S = new org.telegram.ui.Cells.k7(this, 29);
        setClipChildren(false);
        setClipToPadding(false);
        w7.b6.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.o(context.getApplicationContext(), i10, i11, 1));
        b6 b6Var = new b6(context, this, i10, i11);
        this.f34080a = b6Var;
        addView(b6Var, w7.z5.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        o5 o5Var = new o5(i10, i11, context, true);
        this.f34081b = o5Var;
        addView(o5Var, w7.z5.d(-1.0f, -1));
        ai.w1 w1Var = new ai.w1(context, 12);
        this.f34084n = w1Var;
        ai.w1 w1Var2 = new ai.w1(context, 12);
        this.f34085r = w1Var2;
        addView(w1Var2, w7.z5.e(-1, -1, 17));
        addView(w1Var, w7.z5.e(-1, -1, 17));
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34088x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34089y = defaultSensor;
        this.E = (defaultSensor == null || defaultSensor.getType() == 4) ? false : z10;
    }

    public static float b(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a(float f7, float f10) {
        int i10;
        int i11;
        float f11 = f7 + this.T;
        float f12 = f10 + this.U;
        int i12 = 0;
        this.f34080a.f34039f0.Q = new float[]{f11, f12};
        e();
        double cos = Math.cos(Math.toRadians(f12)) * Math.cos(Math.toRadians(f11));
        if (this.f34082c) {
            this.f34081b.b(f11, f12);
            o5 o5Var = this.f34081b;
            if (cos >= 0.0d) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            o5Var.setVisibility(i11);
        }
        ai.w1 w1Var = this.f34084n;
        if (cos >= 0.0d) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        w1Var.setVisibility(i10);
        ai.w1 w1Var2 = this.f34085r;
        if (cos >= 0.0d) {
            i12 = 4;
        }
        w1Var2.setVisibility(i12);
        postInvalidateOnAnimation();
    }

    public final void c(float f7, float f10, float f11, float f12) {
        y5 y5Var = this.f34080a.f34039f0;
        float[] fArr = y5Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        y5Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        this.f34082c = true;
        this.f34080a.setAlpha(0.003921569f);
        a(this.K, this.N);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Runnable runnable = this.e;
        if (runnable != null) {
            this.e = null;
            post(runnable);
        }
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            this.f34086s.c(width, height, this.K, this.N, false, this.v);
            this.f34086s.c(width, height, this.K, this.N, true, this.f34087w);
            this.f34084n.a(this.v);
            this.f34085r.a(this.f34087w);
        }
    }

    public final void f() {
        SensorManager sensorManager;
        boolean z10;
        b6 b6Var = this.f34080a;
        if (b6Var != null && (sensorManager = this.f34088x) != null) {
            if (!isShown() || getWindowVisibility() != 0) {
                this.d = true;
            }
            if (this.f34083f && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.h != z10) {
                this.h = z10;
                b6Var.setPaused(!z10);
                org.telegram.ui.Cells.k7 k7Var = this.S;
                removeCallbacks(k7Var);
                if (z10) {
                    if (this.d) {
                        this.d = false;
                        d();
                    }
                    this.R = 0L;
                    Sensor sensor = this.f34089y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(k7Var);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public FrameLayout getBackFace() {
        return (FrameLayout) this.f34085r.d;
    }

    public float getCardRotationX() {
        return this.K;
    }

    public float getCardRotationY() {
        return this.N;
    }

    public FrameLayout getFrontFace() {
        return (FrameLayout) this.f34084n.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34083f = true;
        this.R = 0L;
        a6 a6Var = this.H;
        a6Var.f33987a = false;
        a6Var.h = 0L;
        a6Var.f33992i = 0L;
        a6Var.f33993j = 0L;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        f();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34083f = false;
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
        if (this.E) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.F;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.G;
            SensorManager.getOrientation(fArr2, fArr3);
            this.I = b((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.J = b(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            long j10 = this.R;
            if (j10 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.I = b(org.telegram.ui.Cells.t0.z(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = b(com.google.android.gms.internal.cast.a6.t(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.R = sensorEvent.timestamp;
        }
        long j11 = sensorEvent.timestamp;
        this.H.a(((-this.J) / 0.82f) * 15.0f, (this.I / 0.82f) * 15.0f, j11);
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
        float f10 = this.L;
        if (f10 == f7) {
            return;
        }
        float f11 = (f7 - f10) + this.K;
        this.K = f11;
        this.L = f7;
        a(f11, this.N);
    }

    public void setCardIcon(int i10) {
        this.f34081b.setCardIcon(i10);
        this.f34080a.f34039f0.T = i10;
    }

    public void setDiamondAlpha(float f7) {
        y5 y5Var = this.f34080a.f34039f0;
        y5Var.getClass();
        y5Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingAlpha(float f7) {
        y5 y5Var = this.f34080a.f34039f0;
        y5Var.getClass();
        y5Var.P = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.f34081b.setEngravingBitmap(bitmap);
        this.f34080a.f34039f0.R = bitmap;
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        this.e = runnable;
        if (runnable != null) {
            invalidate();
        }
    }

    public void setStickerStyle(float[] fArr) {
        boolean z10;
        float[] fArr2;
        y5 y5Var = this.f34080a.f34039f0;
        y5Var.getClass();
        if (fArr.length != y5Var.X.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            if (fArr[i10] != y5Var.X[i10]) {
                z10 = true;
            }
        }
        if (!z10) {
            for (int i11 = 10; i11 < fArr.length; i11++) {
                if (fArr[i11] != y5Var.X[i11]) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            fArr2 = k7.f(fArr);
        } else {
            fArr2 = (float[]) y5Var.Y.clone();
        }
        System.arraycopy(fArr, 6, fArr2, 24, 4);
        y5Var.X = fArr;
        y5Var.Y = fArr2;
        this.f34081b.setStickerStyle(fArr);
    }

    public void setUseGyroscope(float f7) {
        if (this.M == f7) {
            return;
        }
        this.M = f7;
        y5 y5Var = this.f34080a.f34039f0;
        float f10 = (this.P * f7) + y5Var.f47095i + this.L;
        this.K = f10;
        float f11 = (this.Q * f7) + y5Var.d;
        this.N = f11;
        a(f10, f11);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
