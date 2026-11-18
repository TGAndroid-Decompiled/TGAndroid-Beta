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
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.w01;
import org.telegram.ui.k71;
public final class s6 extends FrameLayout implements SensorEventListener {
    public static final Object f44993o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final z6 H;
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
    public boolean f44994a;
    public boolean f44995a0;
    public p6 f44996b;
    public boolean f44997b0;
    public int f44998c;
    public ValueAnimator f44999c0;
    public q3 d;
    public float f45000d0;
    public final org.telegram.ui.Cells.w0 f45001e;
    public float f45002e0;
    public final w01 f45003f;
    public float f45004f0;
    public float f45005g0;
    public final hi.m5 h;
    public float f45006h0;
    public float f45007i0;
    public int f45008j0;
    public int f45009k0;
    public final gk f45010l0;
    public float m0;
    public final r6 f45011n;
    public float f45012n0;
    public final w01 f45013r;
    public final ga.d f45014s;
    public final float[] f45015w;
    public final SensorManager f45016x;
    public final Sensor f45017y;

    public s6(Context context, int i7, int i10) {
        super(context);
        this.f45014s = new ga.d(4);
        this.f45015w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new Object();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f45004f0 = 1.0f;
        this.f45006h0 = Float.NaN;
        this.f45007i0 = Float.NaN;
        this.f45010l0 = new gk(this, 28);
        this.f44998c = i7;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.ra.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(this, context);
        this.f45001e = w0Var;
        addView(w0Var, c8.ma.e(-1, -1, 17));
        w01 w01Var = new w01(context, 4);
        this.f45003f = w01Var;
        w01Var.setPadding(2, 2, 2, 2);
        w01Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        w0Var.addView(w01Var, layoutParams);
        hi.m5 m5Var = new hi.m5(this, context);
        this.h = m5Var;
        w01Var.addView(m5Var, c8.ma.e(-1, -1, 17));
        r6 r6Var = new r6(this, context);
        this.f45011n = r6Var;
        w01Var.addView(r6Var, c8.ma.e(-1, -1, 17));
        w01 w01Var2 = new w01(3, context, this);
        this.f45013r = w01Var2;
        w01Var2.setClipChildren(false);
        w01Var2.setClipToPadding(false);
        w01Var2.setLayerType(2, null);
        w01Var2.setPivotX(0.0f);
        w01Var2.setPivotY(0.0f);
        w01Var.addView(w01Var2, c8.ma.e(336, 205, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f45016x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f45017y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.E = z10;
        q6 q6Var = new q6(this, 1);
        if (p6.f44752j0 && p6.f44757p0.get(Integer.valueOf(i7)) != null) {
            this.f44996b = new p6(context.getApplicationContext(), i7, i10, q6Var);
            return;
        }
        w0Var.setVisibility(4);
        p6.f44754l0.postRunnable(new jg.o1(this, context, i7, i10, q6Var));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f44999c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f44999c0.cancel();
            this.f44999c0 = null;
        }
        float f10 = this.O;
        float f11 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44999c0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.ui.Cells.c0.q(1.2f, this.f44999c0);
        this.f44999c0.addUpdateListener(new hi.j9(this, f10, f11, 5));
        this.f44999c0.addListener(new k71(this, 9));
        this.f44999c0.start();
    }

    public final void b(float f10, float f11) {
        boolean z10;
        float[] fArr;
        this.f45000d0 = f10;
        this.f45005g0 = f11;
        float f12 = f10 + this.m0;
        float f13 = f11 + this.f45012n0;
        if (Math.cos(Math.toRadians(f13)) * Math.cos(Math.toRadians(f12)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f44994a;
        r6 r6Var = this.f45011n;
        if (z11 != z10) {
            this.f44994a = z10;
            this.f45013r.invalidate();
            r6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f45006h0 == f12 && this.f45007i0 == f13 && this.f45008j0 == width && this.f45009k0 == height) {
            return;
        }
        this.f45006h0 = f12;
        this.f45007i0 = f13;
        this.f45008j0 = width;
        this.f45009k0 = height;
        if (width > 0 && height > 0) {
            this.f45014s.f(width, height, f12, f13, z10, this.f45015w);
            p6 p6Var = this.f44996b;
            if (p6Var != null) {
                float[] fArr2 = p6Var.f44778n;
                float[] fArr3 = p6Var.f44777m;
                float[] fArr4 = p6Var.f44775k;
                float[] fArr5 = p6Var.f44776l;
                int[] iArr = p6Var.f44779o;
                p6Var.f44782r = z10;
                float[] fArr6 = p6Var.f44772i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                ga.d dVar = this.f45014s;
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
                p6Var.f44781q = width / 336.0f;
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
            org.telegram.ui.Cells.w0 w0Var = this.f45001e;
            int width2 = w0Var.getWidth();
            int height2 = w0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) w0Var.f32228b;
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
                w0Var.f32229c = ((Matrix) w0Var.d).setPolyToPoly(fArr9, 0, this.f45015w, 0, 4);
                w0Var.invalidate();
            }
        }
        p6 p6Var2 = this.f44996b;
        if (p6Var2 != null) {
            p6Var2.k(f12, f13);
        }
        this.h.invalidate();
        r6Var.invalidate();
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
        SensorManager sensorManager = this.f45016x;
        if (sensorManager != null) {
            if (this.f44995a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f44997b0 != z10) {
                this.f44997b0 = z10;
                gk gkVar = this.f45010l0;
                removeCallbacks(gkVar);
                if (z10) {
                    this.W = 0L;
                    Sensor sensor = this.f45017y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(gkVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f45000d0;
    }

    public float getCardRotationY() {
        return this.f45005g0;
    }

    public FrameLayout getFrontFace() {
        return this.f45013r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44995a0 = true;
        this.W = 0L;
        z6 z6Var = this.H;
        z6Var.f45347a = false;
        z6Var.h = 0L;
        z6Var.f45353i = 0L;
        z6Var.f45354j = 0L;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44995a0 = false;
        e();
        ValueAnimator valueAnimator = this.f44999c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f44999c0.cancel();
            this.f44999c0 = null;
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
        z6 z6Var = this.H;
        z6Var.getClass();
        if (!Float.isNaN(f11) && !Float.isInfinite(f11) && !Float.isNaN(f12) && !Float.isInfinite(f12)) {
            z6Var.f45348b = f11;
            z6Var.f45349c = f12;
            z6Var.f45353i = j10;
            if (!z6Var.f45347a) {
                z6Var.f45347a = true;
                z6Var.d = f11;
                z6Var.f45350e = f12;
                z6Var.f45351f = f11;
                z6Var.f45352g = f12;
                z6Var.h = j10;
                return;
            }
            float f13 = f11 - z6Var.f45351f;
            float f14 = f12 - z6Var.f45352g;
            if ((f14 * f14) + (f13 * f13) > 1.265625f) {
                z6Var.f45351f = f11;
                z6Var.f45352g = f12;
                z6Var.h = j10;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = i7 / org.telegram.messenger.g0.L(336.0f);
        w01 w01Var = this.f45013r;
        w01Var.setScaleX(L);
        w01Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.f45000d0, this.f45005g0);
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
            postDelayed(new q6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f44999c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f44999c0.cancel();
            this.f44999c0 = null;
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
        float f11 = this.f45002e0;
        if (f11 == f10) {
            return;
        }
        this.f45002e0 = f10;
        b((this.f45000d0 + f10) - f11, this.f45005g0);
    }

    public void setCardIcon(int i7) {
        r6 r6Var = this.f45011n;
        s6 s6Var = r6Var.f44880b;
        s6Var.f44998c = i7;
        p6 p6Var = s6Var.f44996b;
        if (p6Var != null) {
            p6Var.j(i7);
        }
        r6Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        r6 r6Var = this.f45011n;
        r6Var.f44879a = z10;
        r6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        hi.m5 m5Var = this.h;
        m5Var.f15031b = fArr;
        this.f45001e.invalidate();
        m5Var.invalidate();
        this.f45011n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f45004f0 == f10) {
            return;
        }
        this.f45004f0 = f10;
        b((this.M * f10) + this.O + this.f45002e0, (this.N * f10) + this.P);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
