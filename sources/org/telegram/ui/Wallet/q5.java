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
    public final n5 K;
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
    public final org.telegram.ui.Cells.l7 V;
    public final p5 f33370a;
    public final d5 f33371b;
    public boolean f33372c;
    public boolean d;
    public boolean e;
    public long f33373f;
    public long h;
    public Runnable f33374n;
    public boolean f33375r;
    public boolean f33376s;
    public final o5 v;
    public final o5 f33377w;
    public final m.t3 f33378x;
    public final float[] f33379y;

    public q5(Context context, int i10, int i11) {
        super(context);
        boolean z10 = true;
        this.f33372c = true;
        this.f33373f = 1L;
        this.f33378x = new m.t3();
        this.f33379y = new float[8];
        this.E = new float[8];
        this.I = new float[9];
        this.J = new float[3];
        this.K = new Object();
        this.L = -0.22f;
        this.M = -0.28f;
        this.P = 1.0f;
        this.V = new org.telegram.ui.Cells.l7(this, 29);
        setClipChildren(false);
        setClipToPadding(false);
        w7.b6.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.p(context.getApplicationContext(), i10, i11, 1));
        p5 p5Var = new p5(context, this, i10, i11);
        this.f33370a = p5Var;
        addView(p5Var, w7.z5.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        d5 d5Var = new d5(i10, i11, context, true);
        this.f33371b = d5Var;
        addView(d5Var, w7.z5.d(-1.0f, -1));
        o5 o5Var = new o5(context);
        this.v = o5Var;
        o5 o5Var2 = new o5(context);
        this.f33377w = o5Var2;
        addView(o5Var2, w7.z5.e(-1, -1, 17));
        addView(o5Var, w7.z5.e(-1, -1, 17));
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
        this.f33370a.f33336f0.P = new float[]{f7, f10};
        e();
        double cos = Math.cos(Math.toRadians(f10)) * Math.cos(Math.toRadians(f7));
        if (this.f33372c) {
            this.f33371b.b(f7, f10);
            d5 d5Var = this.f33371b;
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
        o5 o5Var2 = this.f33377w;
        if (cos >= 0.0d) {
            i12 = 4;
        }
        o5Var2.setVisibility(i12);
        postInvalidateOnAnimation();
    }

    public final void c(float f7, float f10, float f11, float f12) {
        l5 l5Var = this.f33370a.f33336f0;
        float[] fArr = l5Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        l5Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        long j10;
        this.f33372c = true;
        p5 p5Var = this.f33370a;
        l5 l5Var = p5Var.f33336f0;
        synchronized (l5Var) {
            j10 = l5Var.U + 1;
        }
        this.f33373f = j10;
        p5Var.setAlpha(0.003921569f);
        o5 o5Var = this.v;
        o5Var.e = true;
        o5Var.f33291f = true;
        a(this.N, this.Q);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o5 o5Var = this.v;
        this.d = true;
        try {
            o5Var.a(this.f33370a.f33336f0);
            this.d = false;
            o5Var.f33291f = this.f33372c;
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
            this.f33378x.c(width, height, this.N, this.Q, false, this.f33379y);
            this.f33378x.c(width, height, this.N, this.Q, true, this.E);
            this.v.b(this.f33379y);
            this.f33377w.b(this.E);
        }
    }

    public final void f() {
        SensorManager sensorManager;
        boolean z10;
        p5 p5Var = this.f33370a;
        if (p5Var != null && (sensorManager = this.F) != null) {
            if (!isShown() || getWindowVisibility() != 0) {
                this.e = true;
            }
            if (this.f33375r && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f33376s != z10) {
                this.f33376s = z10;
                p5Var.setPaused(!z10);
                org.telegram.ui.Cells.l7 l7Var = this.V;
                removeCallbacks(l7Var);
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
                    postOnAnimation(l7Var);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public FrameLayout getBackFace() {
        return this.f33377w.f33290c;
    }

    public float getCardRotationX() {
        return this.N;
    }

    public float getCardRotationY() {
        return this.Q;
    }

    public FrameLayout getFrontFace() {
        return this.v.f33290c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33375r = true;
        this.U = 0L;
        n5 n5Var = this.K;
        n5Var.f33243a = false;
        n5Var.h = 0L;
        n5Var.f33248i = 0L;
        n5Var.f33249j = 0L;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        f();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33375r = false;
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
        this.f33371b.setCardIcon(i10);
        this.f33370a.f33336f0.f33161a0 = i10;
    }

    public void setDiamondAlpha(float f7) {
        l5 l5Var = this.f33370a.f33336f0;
        l5Var.getClass();
        l5Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.f33371b.setEngravingBitmap(bitmap);
        this.f33370a.f33336f0.Y = bitmap;
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        long j10;
        this.f33374n = runnable;
        if (runnable != null) {
            l5 l5Var = this.f33370a.f33336f0;
            synchronized (l5Var) {
                j10 = l5Var.U + 1;
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
        l5 l5Var = this.f33370a.f33336f0;
        float f10 = (this.S * f7) + l5Var.f45708i + this.O;
        this.N = f10;
        float f11 = (this.T * f7) + l5Var.d;
        this.Q = f11;
        a(f10, f11);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
