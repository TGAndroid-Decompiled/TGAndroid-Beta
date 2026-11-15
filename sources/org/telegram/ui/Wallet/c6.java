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
import org.telegram.messenger.i20;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.zj;
import org.telegram.ui.g71;
public final class c6 extends FrameLayout implements SensorEventListener {
    public static final Object f43618o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final j6 H;
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
    public boolean f43619a;
    public boolean f43620a0;
    public z5 f43621b;
    public boolean f43622b0;
    public int f43623c;
    public ValueAnimator f43624c0;
    public i3 d;
    public float f43625d0;
    public final org.telegram.ui.Cells.v0 f43626e;
    public float f43627e0;
    public final m01 f43628f;
    public float f43629f0;
    public float f43630g0;
    public final hi.n5 h;
    public float f43631h0;
    public float f43632i0;
    public int f43633j0;
    public int f43634k0;
    public final zj f43635l0;
    public float m0;
    public final b6 f43636n;
    public float f43637n0;
    public final m01 f43638r;
    public final ga.d f43639s;
    public final float[] f43640w;
    public final SensorManager f43641x;
    public final Sensor f43642y;

    public c6(Context context, int i7, int i10) {
        super(context);
        this.f43639s = new ga.d(4);
        this.f43640w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new Object();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f43629f0 = 1.0f;
        this.f43631h0 = Float.NaN;
        this.f43632i0 = Float.NaN;
        this.f43635l0 = new zj(this, 28);
        this.f43623c = i7;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.na.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, context);
        this.f43626e = v0Var;
        addView(v0Var, c8.ja.e(-1, -1, 17));
        m01 m01Var = new m01(context, 5);
        this.f43628f = m01Var;
        m01Var.setPadding(2, 2, 2, 2);
        m01Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        v0Var.addView(m01Var, layoutParams);
        hi.n5 n5Var = new hi.n5(this, context);
        this.h = n5Var;
        m01Var.addView(n5Var, c8.ja.e(-1, -1, 17));
        b6 b6Var = new b6(this, context);
        this.f43636n = b6Var;
        m01Var.addView(b6Var, c8.ja.e(-1, -1, 17));
        m01 m01Var2 = new m01(4, context, this);
        this.f43638r = m01Var2;
        m01Var2.setClipChildren(false);
        m01Var2.setClipToPadding(false);
        m01Var2.setLayerType(2, null);
        m01Var2.setPivotX(0.0f);
        m01Var2.setPivotY(0.0f);
        m01Var.addView(m01Var2, c8.ja.e(336, 205, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f43641x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f43642y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.E = z10;
        a6 a6Var = new a6(this, 1);
        if (z5.f44803j0 && z5.f44808p0.get(Integer.valueOf(i7)) != null) {
            this.f43621b = new z5(context.getApplicationContext(), i7, i10, a6Var);
            return;
        }
        v0Var.setVisibility(4);
        z5.f44805l0.postRunnable(new jg.o1(this, context, i7, i10, a6Var));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f43624c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f43624c0.cancel();
            this.f43624c0 = null;
        }
        float f10 = this.O;
        float f11 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43624c0 = ofFloat;
        ofFloat.setDuration(600L);
        i20.k(1.2f, this.f43624c0);
        this.f43624c0.addUpdateListener(new hi.i9(this, f10, f11, 5));
        this.f43624c0.addListener(new g71(this, 9));
        this.f43624c0.start();
    }

    public final void b(float f10, float f11) {
        boolean z10;
        float[] fArr;
        this.f43625d0 = f10;
        this.f43630g0 = f11;
        float f12 = f10 + this.m0;
        float f13 = f11 + this.f43637n0;
        if (Math.cos(Math.toRadians(f13)) * Math.cos(Math.toRadians(f12)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f43619a;
        b6 b6Var = this.f43636n;
        if (z11 != z10) {
            this.f43619a = z10;
            this.f43638r.invalidate();
            b6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f43631h0 == f12 && this.f43632i0 == f13 && this.f43633j0 == width && this.f43634k0 == height) {
            return;
        }
        this.f43631h0 = f12;
        this.f43632i0 = f13;
        this.f43633j0 = width;
        this.f43634k0 = height;
        if (width > 0 && height > 0) {
            this.f43639s.f(width, height, f12, f13, z10, this.f43640w);
            z5 z5Var = this.f43621b;
            if (z5Var != null) {
                float[] fArr2 = z5Var.f44829n;
                float[] fArr3 = z5Var.f44828m;
                float[] fArr4 = z5Var.f44826k;
                float[] fArr5 = z5Var.f44827l;
                int[] iArr = z5Var.f44830o;
                z5Var.f44833r = z10;
                float[] fArr6 = z5Var.f44823i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                ga.d dVar = this.f43639s;
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
                z5Var.f44832q = width / 336.0f;
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
            org.telegram.ui.Cells.v0 v0Var = this.f43626e;
            int width2 = v0Var.getWidth();
            int height2 = v0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) v0Var.f31783b;
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
                v0Var.f31784c = ((Matrix) v0Var.d).setPolyToPoly(fArr9, 0, this.f43640w, 0, 4);
                v0Var.invalidate();
            }
        }
        z5 z5Var2 = this.f43621b;
        if (z5Var2 != null) {
            z5Var2.k(f12, f13);
        }
        this.h.invalidate();
        b6Var.invalidate();
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
        SensorManager sensorManager = this.f43641x;
        if (sensorManager != null) {
            if (this.f43620a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f43622b0 != z10) {
                this.f43622b0 = z10;
                zj zjVar = this.f43635l0;
                removeCallbacks(zjVar);
                if (z10) {
                    this.W = 0L;
                    Sensor sensor = this.f43642y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(zjVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f43625d0;
    }

    public float getCardRotationY() {
        return this.f43630g0;
    }

    public FrameLayout getFrontFace() {
        return this.f43638r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43620a0 = true;
        this.W = 0L;
        j6 j6Var = this.H;
        j6Var.f44017a = false;
        j6Var.h = 0L;
        j6Var.f44023i = 0L;
        j6Var.f44024j = 0L;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43620a0 = false;
        e();
        ValueAnimator valueAnimator = this.f43624c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f43624c0.cancel();
            this.f43624c0 = null;
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
                    this.J = c(org.telegram.ui.Cells.y0.x(sensorEvent.values[1], f10, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(com.google.android.gms.internal.vision.e2.x(sensorEvent.values[0], f10, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f11 = ((-this.K) / 0.82f) * 15.0f;
        float f12 = (this.J / 0.82f) * 15.0f;
        long j10 = sensorEvent.timestamp;
        j6 j6Var = this.H;
        j6Var.getClass();
        if (!Float.isNaN(f11) && !Float.isInfinite(f11) && !Float.isNaN(f12) && !Float.isInfinite(f12)) {
            j6Var.f44018b = f11;
            j6Var.f44019c = f12;
            j6Var.f44023i = j10;
            if (!j6Var.f44017a) {
                j6Var.f44017a = true;
                j6Var.d = f11;
                j6Var.f44020e = f12;
                j6Var.f44021f = f11;
                j6Var.f44022g = f12;
                j6Var.h = j10;
                return;
            }
            float f13 = f11 - j6Var.f44021f;
            float f14 = f12 - j6Var.f44022g;
            if ((f14 * f14) + (f13 * f13) > 1.265625f) {
                j6Var.f44021f = f11;
                j6Var.f44022g = f12;
                j6Var.h = j10;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = i7 / org.telegram.messenger.g0.L(336.0f);
        m01 m01Var = this.f43638r;
        m01Var.setScaleX(L);
        m01Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.f43625d0, this.f43630g0);
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
            postDelayed(new a6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f43624c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f43624c0.cancel();
            this.f43624c0 = null;
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
        float f11 = this.f43627e0;
        if (f11 == f10) {
            return;
        }
        this.f43627e0 = f10;
        b((this.f43625d0 + f10) - f11, this.f43630g0);
    }

    public void setCardIcon(int i7) {
        b6 b6Var = this.f43636n;
        c6 c6Var = b6Var.f43507b;
        c6Var.f43623c = i7;
        z5 z5Var = c6Var.f43621b;
        if (z5Var != null) {
            z5Var.j(i7);
        }
        b6Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        b6 b6Var = this.f43636n;
        b6Var.f43506a = z10;
        b6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        hi.n5 n5Var = this.h;
        n5Var.f14761b = fArr;
        this.f43626e.invalidate();
        n5Var.invalidate();
        this.f43636n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f43629f0 == f10) {
            return;
        }
        this.f43629f0 = f10;
        b((this.M * f10) + this.O + this.f43627e0, (this.N * f10) + this.P);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
