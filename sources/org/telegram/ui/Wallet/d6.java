package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.w41;
import org.telegram.ui.u81;
public final class d6 extends FrameLayout implements SensorEventListener {
    public static final Object f42349n0 = new Object();
    public final boolean D;
    public final float[] E;
    public final float[] F;
    public final k6 G;
    public final int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public long V;
    public boolean W;
    public boolean f42350a;
    public boolean f42351a0;
    public a6 f42352b;
    public ValueAnimator f42353b0;
    public int f42354c;
    public float f42355c0;
    public j3 d;
    public float f42356d0;
    public final org.telegram.ui.Cells.v0 f42357e;
    public float f42358e0;
    public final w41 f42359f;
    public float f42360f0;
    public float f42361g0;
    public final fi.p5 h;
    public float f42362h0;
    public int f42363i0;
    public int f42364j0;
    public final dt f42365k0;
    public float f42366l0;
    public float m0;
    public final c6 f42367n;
    public final w41 f42368r;
    public final ga.d f42369s;
    public final float[] f42370w;
    public final SensorManager f42371x;
    public final Sensor f42372y;

    public d6(Context context, int i7, int i10) {
        super(context);
        this.f42369s = new ga.d(4);
        this.f42370w = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new Object();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.f42358e0 = 1.0f;
        this.f42361g0 = Float.NaN;
        this.f42362h0 = Float.NaN;
        this.f42365k0 = new dt(this, 25);
        this.f42354c = i7;
        boolean z9 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.ka.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, context);
        this.f42357e = v0Var;
        addView(v0Var, c8.ha.e(-1, -1, 17));
        w41 w41Var = new w41(context);
        this.f42359f = w41Var;
        w41Var.setPadding(2, 2, 2, 2);
        w41Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        v0Var.addView(w41Var, layoutParams);
        fi.p5 p5Var = new fi.p5(this, context);
        this.h = p5Var;
        w41Var.addView(p5Var, c8.ha.e(-1, -1, 17));
        c6 c6Var = new c6(this, context);
        this.f42367n = c6Var;
        w41Var.addView(c6Var, c8.ha.e(-1, -1, 17));
        w41 w41Var2 = new w41(3, context, this);
        this.f42368r = w41Var2;
        w41Var2.setClipChildren(false);
        w41Var2.setClipToPadding(false);
        w41Var2.setLayerType(2, null);
        w41Var2.setPivotX(0.0f);
        w41Var2.setPivotY(0.0f);
        w41Var.addView(w41Var2, c8.ha.e(336, 205, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42371x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f42372y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z9 = true;
        }
        this.D = z9;
        b6 b6Var = new b6(this, 1);
        if (a6.f42106j0 && a6.f42111p0.get(Integer.valueOf(i7)) != null) {
            this.f42352b = new a6(context.getApplicationContext(), i7, i10, b6Var);
            return;
        }
        v0Var.setVisibility(4);
        a6.f42108l0.postRunnable(new hi.j4(this, context, i7, i10, b6Var));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f42353b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42353b0.cancel();
            this.f42353b0 = null;
        }
        float f10 = this.N;
        float f11 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42353b0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.messenger.camera.q.i(1.2f, this.f42353b0);
        this.f42353b0.addUpdateListener(new fi.k9(this, f10, f11, 5));
        this.f42353b0.addListener(new u81(this, 8));
        this.f42353b0.start();
    }

    public final void b(float f10, float f11) {
        boolean z9;
        float[] fArr;
        this.f42355c0 = f10;
        this.f42360f0 = f11;
        float f12 = f10 + this.f42366l0;
        float f13 = f11 + this.m0;
        if (Math.cos(Math.toRadians(f13)) * Math.cos(Math.toRadians(f12)) < 0.0d) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = this.f42350a;
        c6 c6Var = this.f42367n;
        if (z10 != z9) {
            this.f42350a = z9;
            this.f42368r.invalidate();
            c6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f42361g0 == f12 && this.f42362h0 == f13 && this.f42363i0 == width && this.f42364j0 == height) {
            return;
        }
        this.f42361g0 = f12;
        this.f42362h0 = f13;
        this.f42363i0 = width;
        this.f42364j0 = height;
        if (width > 0 && height > 0) {
            this.f42369s.f(width, height, f12, f13, z9, this.f42370w);
            a6 a6Var = this.f42352b;
            if (a6Var != null) {
                float[] fArr2 = a6Var.f42132n;
                float[] fArr3 = a6Var.f42131m;
                float[] fArr4 = a6Var.f42129k;
                float[] fArr5 = a6Var.f42130l;
                int[] iArr = a6Var.f42133o;
                a6Var.f42136r = z9;
                float[] fArr6 = a6Var.f42126i;
                if (z9) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z9) {
                    fArr4 = fArr5;
                }
                ga.d dVar = this.f42369s;
                dVar.getClass();
                int i7 = 0;
                while (i7 < fArr6.length / 2) {
                    int i10 = i7 * 2;
                    float f14 = (fArr6[i10 + 1] * (-1.212122f)) + 0.618561f;
                    float f15 = ((fArr6[i10] * 2.0f) - 1.0f) * 1.0f;
                    float g10 = dVar.g(-0.0125f, f14, f15, width, height, fArr, i10);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i7] = (g10 + dVar.g(0.0125f, f14, f15, width, height, fArr8, i10)) * 0.5f;
                    i7++;
                    dVar = dVar;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                a6Var.f42135q = width / 336.0f;
                int i11 = 0;
                while (i11 < 76) {
                    int i12 = i11 + 1;
                    fArr2[i11] = (fArr3[i11] + fArr3[i12 % 76]) * 0.5f;
                    iArr2[i11] = i11;
                    i11 = i12;
                }
                for (int i13 = 1; i13 < 76; i13++) {
                    int i14 = iArr2[i13];
                    int i15 = i13 - 1;
                    while (i15 >= 0) {
                        int i16 = iArr2[i15];
                        if (fArr2[i16] < fArr2[i14]) {
                            iArr2[i15 + 1] = i16;
                            i15--;
                        }
                    }
                    iArr2[i15 + 1] = i14;
                }
            }
            org.telegram.ui.Cells.v0 v0Var = this.f42357e;
            int width2 = v0Var.getWidth();
            int height2 = v0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) v0Var.f30628b;
                fArr9[0] = 0.0f;
                fArr9[1] = 0.0f;
                float f16 = width2;
                fArr9[2] = f16;
                fArr9[3] = 0.0f;
                fArr9[4] = f16;
                float f17 = height2;
                fArr9[5] = f17;
                fArr9[6] = 0.0f;
                fArr9[7] = f17;
                v0Var.f30629c = ((Matrix) v0Var.d).setPolyToPoly(fArr9, 0, this.f42370w, 0, 4);
                v0Var.invalidate();
            }
        }
        a6 a6Var2 = this.f42352b;
        if (a6Var2 != null) {
            a6Var2.k(f12, f13);
        }
        this.h.invalidate();
        c6Var.invalidate();
    }

    public final void d(int i7, MotionEvent motionEvent) {
        this.P = motionEvent.getPointerId(i7);
        this.Q = motionEvent.getX(i7);
        this.R = motionEvent.getY(i7);
        this.S = this.N;
        this.T = this.O;
    }

    public final void e() {
        boolean z9;
        SensorManager sensorManager = this.f42371x;
        if (sensorManager != null) {
            if (this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f42351a0 != z9) {
                this.f42351a0 = z9;
                dt dtVar = this.f42365k0;
                removeCallbacks(dtVar);
                if (z9) {
                    this.V = 0L;
                    Sensor sensor = this.f42372y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(dtVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f42355c0;
    }

    public float getCardRotationY() {
        return this.f42360f0;
    }

    public FrameLayout getFrontFace() {
        return this.f42368r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
        this.V = 0L;
        k6 k6Var = this.G;
        k6Var.f42721a = false;
        k6Var.h = 0L;
        k6Var.f42727i = 0L;
        k6Var.f42728j = 0L;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.W = false;
        e();
        ValueAnimator valueAnimator = this.f42353b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42353b0.cancel();
            this.f42353b0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), 1073741824));
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.D) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.E;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.F;
            SensorManager.getOrientation(fArr2, fArr3);
            if (!Float.isNaN(fArr3[1]) && !Float.isNaN(fArr3[2])) {
                this.I = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
                this.J = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
            } else {
                return;
            }
        } else {
            long j3 = this.V;
            if (j3 != 0) {
                float f10 = ((float) (sensorEvent.timestamp - j3)) * 1.0E-9f;
                if (f10 > 0.0f && f10 < 0.1f) {
                    this.I = c(org.telegram.ui.Cells.f1.x(sensorEvent.values[1], f10, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = c(com.google.android.recaptcha.internal.a.x(sensorEvent.values[0], f10, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.V = sensorEvent.timestamp;
        }
        float f11 = ((-this.J) / 0.82f) * 15.0f;
        float f12 = (this.I / 0.82f) * 15.0f;
        long j10 = sensorEvent.timestamp;
        k6 k6Var = this.G;
        k6Var.getClass();
        if (!Float.isNaN(f11) && !Float.isInfinite(f11) && !Float.isNaN(f12) && !Float.isInfinite(f12)) {
            k6Var.f42722b = f11;
            k6Var.f42723c = f12;
            k6Var.f42727i = j10;
            if (!k6Var.f42721a) {
                k6Var.f42721a = true;
                k6Var.d = f11;
                k6Var.f42724e = f12;
                k6Var.f42725f = f11;
                k6Var.f42726g = f12;
                k6Var.h = j10;
                return;
            }
            float f13 = f11 - k6Var.f42725f;
            float f14 = f12 - k6Var.f42726g;
            if ((f14 * f14) + (f13 * f13) > 1.265625f) {
                k6Var.f42725f = f11;
                k6Var.f42726g = f12;
                k6Var.h = j10;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = i7 / org.telegram.messenger.g0.L(336.0f);
        w41 w41Var = this.f42368r;
        w41Var.setScaleX(L);
        w41Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.f42355c0, this.f42360f0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.P) {
                                for (int i7 = 0; i7 < motionEvent.getPointerCount(); i7++) {
                                    if (i7 != motionEvent.getActionIndex()) {
                                        d(i7, motionEvent);
                                        return true;
                                    }
                                }
                            }
                        } else {
                            d(motionEvent.getActionIndex(), motionEvent);
                            this.U = true;
                            setPressed(false);
                            return true;
                        }
                    } else {
                        this.P = -1;
                        getParent().requestDisallowInterceptTouchEvent(false);
                        setPressed(false);
                        if (this.U) {
                            a();
                            return true;
                        }
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.P);
                    if (findPointerIndex >= 0) {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x10 - this.Q);
                        float f10 = this.H;
                        if (abs > f10 || Math.abs(y10 - this.R) > f10) {
                            this.U = true;
                            setPressed(false);
                        }
                        if (this.U) {
                            float f11 = this.T;
                            this.O = c(com.google.android.recaptcha.internal.a.v(x10, this.Q, 0.03f, f11), f11 - 32.0f, f11 + 32.0f);
                            float f12 = this.S;
                            this.N = c(com.google.android.recaptcha.internal.a.v(y10, this.R, 0.03f, f12), f12 - 22.0f, f12 + 22.0f);
                        }
                    }
                }
                return true;
            }
            this.P = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.U) {
                a();
                return true;
            }
            postDelayed(new b6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f42353b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42353b0.cancel();
            this.f42353b0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        d(0, motionEvent);
        this.U = false;
        setPressed(true);
        return true;
    }

    @Override
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        e();
    }

    @Override
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        e();
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        e();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f10) {
        float f11 = this.f42356d0;
        if (f11 == f10) {
            return;
        }
        this.f42356d0 = f10;
        b((this.f42355c0 + f10) - f11, this.f42360f0);
    }

    public void setCardIcon(int i7) {
        c6 c6Var = this.f42367n;
        d6 d6Var = c6Var.f42215b;
        d6Var.f42354c = i7;
        a6 a6Var = d6Var.f42352b;
        if (a6Var != null) {
            a6Var.j(i7);
        }
        c6Var.invalidate();
    }

    public void setHasCardNumber(boolean z9) {
        c6 c6Var = this.f42367n;
        c6Var.f42214a = z9;
        c6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        fi.p5 p5Var = this.h;
        p5Var.f12599b = fArr;
        this.f42357e.invalidate();
        p5Var.invalidate();
        this.f42367n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f42358e0 == f10) {
            return;
        }
        this.f42358e0 = f10;
        b((this.L * f10) + this.N + this.f42356d0, (this.M * f10) + this.O);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
