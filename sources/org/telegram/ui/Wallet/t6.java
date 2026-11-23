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
import org.telegram.ui.Components.w01;
import org.telegram.ui.i71;
public final class t6 extends FrameLayout implements SensorEventListener {
    public static final Object f45165o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final a7 H;
    public final int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public long W;
    public boolean f45166a;
    public boolean f45167a0;
    public q6 f45168b;
    public boolean f45169b0;
    public int f45170c;
    public ValueAnimator f45171c0;
    public r3 d;
    public float f45172d0;
    public final org.telegram.ui.Cells.x0 f45173e;
    public float f45174e0;
    public final w01 f45175f;
    public float f45176f0;
    public float f45177g0;
    public final hi.w5 h;
    public float f45178h0;
    public float f45179i0;
    public int f45180j0;
    public int f45181k0;
    public final o5 f45182l0;
    public float m0;
    public final s6 f45183n;
    public float f45184n0;
    public final w01 f45185r;
    public final m.o3 f45186s;
    public final float[] f45187w;
    public final SensorManager f45188x;
    public final Sensor f45189y;

    public t6(Context context, int i7, int i10) {
        super(context);
        this.f45186s = new m.o3();
        this.f45187w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new Object();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f45176f0 = 1.0f;
        this.f45178h0 = Float.NaN;
        this.f45179i0 = Float.NaN;
        this.f45182l0 = new o5(this, 1);
        this.f45170c = i7;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.sa.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this, context);
        this.f45173e = x0Var;
        addView(x0Var, c8.na.e(-1, -1, 17));
        w01 w01Var = new w01(context, 4);
        this.f45175f = w01Var;
        w01Var.setPadding(2, 2, 2, 2);
        w01Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        x0Var.addView(w01Var, layoutParams);
        hi.w5 w5Var = new hi.w5(this, context);
        this.h = w5Var;
        w01Var.addView(w5Var, c8.na.e(-1, -1, 17));
        s6 s6Var = new s6(this, context);
        this.f45183n = s6Var;
        w01Var.addView(s6Var, c8.na.e(-1, -1, 17));
        w01 w01Var2 = new w01(3, context, this);
        this.f45185r = w01Var2;
        w01Var2.setClipChildren(false);
        w01Var2.setClipToPadding(false);
        w01Var2.setLayerType(2, null);
        w01Var2.setPivotX(0.0f);
        w01Var2.setPivotY(0.0f);
        w01Var.addView(w01Var2, c8.na.e(336, 205, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45188x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f45189y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.E = z10;
        r6 r6Var = new r6(this, 1);
        if (q6.f44924j0 && q6.f44929p0.get(Integer.valueOf(i7)) != null) {
            this.f45168b = new q6(context.getApplicationContext(), i7, i10, r6Var);
            return;
        }
        x0Var.setVisibility(4);
        q6.f44926l0.postRunnable(new jg.o1(this, context, i7, i10, r6Var));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f45171c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f45171c0.cancel();
            this.f45171c0 = null;
        }
        float f10 = this.O;
        float f11 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f45171c0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.ui.Cells.c0.q(1.2f, this.f45171c0);
        this.f45171c0.addUpdateListener(new hi.da(this, f10, f11, 6));
        this.f45171c0.addListener(new i71(this, 9));
        this.f45171c0.start();
    }

    public final void b(float f10, float f11) {
        boolean z10;
        float[] fArr;
        this.f45172d0 = f10;
        this.f45177g0 = f11;
        float f12 = f10 + this.m0;
        float f13 = f11 + this.f45184n0;
        if (Math.cos(Math.toRadians(f13)) * Math.cos(Math.toRadians(f12)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f45166a;
        s6 s6Var = this.f45183n;
        if (z11 != z10) {
            this.f45166a = z10;
            this.f45185r.invalidate();
            s6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f45178h0 == f12 && this.f45179i0 == f13 && this.f45180j0 == width && this.f45181k0 == height) {
            return;
        }
        this.f45178h0 = f12;
        this.f45179i0 = f13;
        this.f45180j0 = width;
        this.f45181k0 = height;
        if (width > 0 && height > 0) {
            this.f45186s.c(width, height, f12, f13, z10, this.f45187w);
            q6 q6Var = this.f45168b;
            if (q6Var != null) {
                float[] fArr2 = q6Var.f44950n;
                float[] fArr3 = q6Var.f44949m;
                float[] fArr4 = q6Var.f44947k;
                float[] fArr5 = q6Var.f44948l;
                int[] iArr = q6Var.f44951o;
                q6Var.f44954r = z10;
                float[] fArr6 = q6Var.f44944i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                m.o3 o3Var = this.f45186s;
                o3Var.getClass();
                int i7 = 0;
                while (i7 < fArr6.length / 2) {
                    int i10 = i7 * 2;
                    float f14 = (fArr6[i10 + 1] * (-1.212122f)) + 0.618561f;
                    float f15 = ((fArr6[i10] * 2.0f) - 1.0f) * 1.0f;
                    float d = o3Var.d(-0.0125f, f14, f15, width, height, fArr, i10);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i7] = (d + o3Var.d(0.0125f, f14, f15, width, height, fArr8, i10)) * 0.5f;
                    i7++;
                    o3Var = o3Var;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                q6Var.f44953q = width / 336.0f;
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
            org.telegram.ui.Cells.x0 x0Var = this.f45173e;
            int width2 = x0Var.getWidth();
            int height2 = x0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) x0Var.f32380b;
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
                x0Var.f32381c = ((Matrix) x0Var.d).setPolyToPoly(fArr9, 0, this.f45187w, 0, 4);
                x0Var.invalidate();
            }
        }
        q6 q6Var2 = this.f45168b;
        if (q6Var2 != null) {
            q6Var2.k(f12, f13);
        }
        this.h.invalidate();
        s6Var.invalidate();
    }

    public final void d(int i7, MotionEvent motionEvent) {
        this.Q = motionEvent.getPointerId(i7);
        this.R = motionEvent.getX(i7);
        this.S = motionEvent.getY(i7);
        this.T = this.O;
        this.U = this.P;
    }

    public final void e() {
        boolean z10;
        SensorManager sensorManager = this.f45188x;
        if (sensorManager != null) {
            if (this.f45167a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f45169b0 != z10) {
                this.f45169b0 = z10;
                o5 o5Var = this.f45182l0;
                removeCallbacks(o5Var);
                if (z10) {
                    this.W = 0L;
                    Sensor sensor = this.f45189y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(o5Var);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f45172d0;
    }

    public float getCardRotationY() {
        return this.f45177g0;
    }

    public FrameLayout getFrontFace() {
        return this.f45185r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45167a0 = true;
        this.W = 0L;
        a7 a7Var = this.H;
        a7Var.f44049a = false;
        a7Var.h = 0L;
        a7Var.f44055i = 0L;
        a7Var.f44056j = 0L;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f45167a0 = false;
        e();
        ValueAnimator valueAnimator = this.f45171c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f45171c0.cancel();
            this.f45171c0 = null;
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
        if (this.E) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.F;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.G;
            SensorManager.getOrientation(fArr2, fArr3);
            if (!Float.isNaN(fArr3[1]) && !Float.isNaN(fArr3[2])) {
                this.J = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
                this.K = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
            } else {
                return;
            }
        } else {
            long j3 = this.W;
            if (j3 != 0) {
                float f10 = ((float) (sensorEvent.timestamp - j3)) * 1.0E-9f;
                if (f10 > 0.0f && f10 < 0.1f) {
                    this.J = c(org.telegram.ui.Cells.c0.z(sensorEvent.values[1], f10, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(com.google.android.gms.internal.vision.e2.x(sensorEvent.values[0], f10, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f11 = ((-this.K) / 0.82f) * 15.0f;
        float f12 = (this.J / 0.82f) * 15.0f;
        long j10 = sensorEvent.timestamp;
        a7 a7Var = this.H;
        a7Var.getClass();
        if (!Float.isNaN(f11) && !Float.isInfinite(f11) && !Float.isNaN(f12) && !Float.isInfinite(f12)) {
            a7Var.f44050b = f11;
            a7Var.f44051c = f12;
            a7Var.f44055i = j10;
            if (!a7Var.f44049a) {
                a7Var.f44049a = true;
                a7Var.d = f11;
                a7Var.f44052e = f12;
                a7Var.f44053f = f11;
                a7Var.f44054g = f12;
                a7Var.h = j10;
                return;
            }
            float f13 = f11 - a7Var.f44053f;
            float f14 = f12 - a7Var.f44054g;
            if ((f14 * f14) + (f13 * f13) > 1.265625f) {
                a7Var.f44053f = f11;
                a7Var.f44054g = f12;
                a7Var.h = j10;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = i7 / org.telegram.messenger.g0.L(336.0f);
        w01 w01Var = this.f45185r;
        w01Var.setScaleX(L);
        w01Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.f45172d0, this.f45177g0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.Q) {
                                for (int i7 = 0; i7 < motionEvent.getPointerCount(); i7++) {
                                    if (i7 != motionEvent.getActionIndex()) {
                                        d(i7, motionEvent);
                                        return true;
                                    }
                                }
                            }
                        } else {
                            d(motionEvent.getActionIndex(), motionEvent);
                            this.V = true;
                            setPressed(false);
                            return true;
                        }
                    } else {
                        this.Q = -1;
                        getParent().requestDisallowInterceptTouchEvent(false);
                        setPressed(false);
                        if (this.V) {
                            a();
                            return true;
                        }
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.Q);
                    if (findPointerIndex >= 0) {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x10 - this.R);
                        float f10 = this.I;
                        if (abs > f10 || Math.abs(y10 - this.S) > f10) {
                            this.V = true;
                            setPressed(false);
                        }
                        if (this.V) {
                            float f11 = this.U;
                            this.P = c(com.google.android.gms.internal.vision.e2.t(x10, this.R, 0.03f, f11), f11 - 32.0f, f11 + 32.0f);
                            float f12 = this.T;
                            this.O = c(com.google.android.gms.internal.vision.e2.t(y10, this.S, 0.03f, f12), f12 - 22.0f, f12 + 22.0f);
                        }
                    }
                }
                return true;
            }
            this.Q = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.V) {
                a();
                return true;
            }
            postDelayed(new r6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f45171c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f45171c0.cancel();
            this.f45171c0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        d(0, motionEvent);
        this.V = false;
        setPressed(true);
        return true;
    }

    @Override
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        e();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
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
        float f11 = this.f45174e0;
        if (f11 == f10) {
            return;
        }
        this.f45174e0 = f10;
        b((this.f45172d0 + f10) - f11, this.f45177g0);
    }

    public void setCardIcon(int i7) {
        s6 s6Var = this.f45183n;
        t6 t6Var = s6Var.f45052b;
        t6Var.f45170c = i7;
        q6 q6Var = t6Var.f45168b;
        if (q6Var != null) {
            q6Var.j(i7);
        }
        s6Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        s6 s6Var = this.f45183n;
        s6Var.f45051a = z10;
        s6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        hi.w5 w5Var = this.h;
        w5Var.f15677b = fArr;
        this.f45173e.invalidate();
        w5Var.invalidate();
        this.f45183n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f45176f0 == f10) {
            return;
        }
        this.f45176f0 = f10;
        b((this.M * f10) + this.O + this.f45174e0, (this.N * f10) + this.P);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
