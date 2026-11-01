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
import org.telegram.messenger.a30;
import org.telegram.ui.Components.ew;
import org.telegram.ui.ms0;
public final class g6 extends FrameLayout implements SensorEventListener {
    public static final Object f34557n0 = new Object();
    public final boolean D;
    public final float[] E;
    public final float[] F;
    public final n6 G;
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
    public boolean f34558a;
    public boolean f34559a0;
    public c6 f34560b;
    public ValueAnimator f34561b0;
    public int f34562c;
    public float f34563c0;
    public l3 d;
    public float f34564d0;
    public final org.telegram.ui.Cells.u0 e;
    public float f34565e0;
    public final f6 f34566f;
    public float f34567f0;
    public float f34568g0;
    public final kg.f0 h;
    public float f34569h0;
    public int f34570i0;
    public int f34571j0;
    public final ew f34572k0;
    public float f34573l0;
    public float m0;
    public final e6 f34574n;
    public final org.telegram.ui.Components.voip.j0 f34575r;
    public final m.p3 f34576s;
    public final float[] f34577w;
    public final SensorManager f34578x;
    public final Sensor f34579y;

    public g6(Context context, int i10, int i11) {
        super(context);
        this.f34576s = new m.p3();
        this.f34577w = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new Object();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.f34565e0 = 1.0f;
        this.f34568g0 = Float.NaN;
        this.f34569h0 = Float.NaN;
        this.f34572k0 = new ew(this, 19);
        this.f34562c = i10;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.i0.L(4800.0f));
        w7.e6.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(this, context);
        this.e = u0Var;
        addView(u0Var, w7.b6.e(-1, -1, 17));
        f6 f6Var = new f6(context, 0);
        this.f34566f = f6Var;
        f6Var.setPadding(2, 2, 2, 2);
        f6Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        u0Var.addView(f6Var, layoutParams);
        kg.f0 f0Var = new kg.f0(this, context);
        this.h = f0Var;
        f6Var.addView(f0Var, w7.b6.e(-1, -1, 17));
        e6 e6Var = new e6(this, context);
        this.f34574n = e6Var;
        f6Var.addView(e6Var, w7.b6.e(-1, -1, 17));
        org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(this, context, 2);
        this.f34575r = j0Var;
        j0Var.setClipChildren(false);
        j0Var.setClipToPadding(false);
        j0Var.setLayerType(2, null);
        j0Var.setPivotX(0.0f);
        j0Var.setPivotY(0.0f);
        f6Var.addView(j0Var, w7.b6.e(336, 205, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34578x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34579y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.D = z10;
        d6 d6Var = new d6(this, 1);
        if (c6.f34320j0 && c6.f34325p0.get(Integer.valueOf(i10)) != null) {
            this.f34560b = new c6(context.getApplicationContext(), i10, i11, d6Var);
            return;
        }
        u0Var.setVisibility(4);
        c6.f34322l0.postRunnable(new bi.u0(this, context, i10, i11, d6Var));
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f34561b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34561b0.cancel();
            this.f34561b0 = null;
        }
        float f7 = this.N;
        float f10 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f34561b0 = ofFloat;
        ofFloat.setDuration(600L);
        a30.j(1.2f, this.f34561b0);
        this.f34561b0.addUpdateListener(new fe.c(this, f7, f10, 6));
        this.f34561b0.addListener(new ms0(this, 19));
        this.f34561b0.start();
    }

    public final void b(float f7, float f10) {
        boolean z10;
        float[] fArr;
        this.f34563c0 = f7;
        this.f34567f0 = f10;
        float f11 = f7 + this.f34573l0;
        float f12 = f10 + this.m0;
        if (Math.cos(Math.toRadians(f12)) * Math.cos(Math.toRadians(f11)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f34558a;
        e6 e6Var = this.f34574n;
        if (z11 != z10) {
            this.f34558a = z10;
            this.f34575r.invalidate();
            e6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f34568g0 == f11 && this.f34569h0 == f12 && this.f34570i0 == width && this.f34571j0 == height) {
            return;
        }
        this.f34568g0 = f11;
        this.f34569h0 = f12;
        this.f34570i0 = width;
        this.f34571j0 = height;
        if (width > 0 && height > 0) {
            this.f34576s.c(width, height, f11, f12, z10, this.f34577w);
            c6 c6Var = this.f34560b;
            if (c6Var != null) {
                float[] fArr2 = c6Var.f34345n;
                float[] fArr3 = c6Var.f34344m;
                float[] fArr4 = c6Var.f34342k;
                float[] fArr5 = c6Var.f34343l;
                int[] iArr = c6Var.f34346o;
                c6Var.f34349r = z10;
                float[] fArr6 = c6Var.f34339i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                m.p3 p3Var = this.f34576s;
                p3Var.getClass();
                int i10 = 0;
                while (i10 < fArr6.length / 2) {
                    int i11 = i10 * 2;
                    float f13 = (fArr6[i11 + 1] * (-1.212122f)) + 0.618561f;
                    float f14 = ((fArr6[i11] * 2.0f) - 1.0f) * 1.0f;
                    float d = p3Var.d(-0.0125f, f13, f14, width, height, fArr, i11);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i10] = (d + p3Var.d(0.0125f, f13, f14, width, height, fArr8, i11)) * 0.5f;
                    i10++;
                    p3Var = p3Var;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                c6Var.f34348q = width / 336.0f;
                int i12 = 0;
                while (i12 < 76) {
                    int i13 = i12 + 1;
                    fArr2[i12] = (fArr3[i12] + fArr3[i13 % 76]) * 0.5f;
                    iArr2[i12] = i12;
                    i12 = i13;
                }
                for (int i14 = 1; i14 < 76; i14++) {
                    int i15 = iArr2[i14];
                    int i16 = i14 - 1;
                    while (i16 >= 0) {
                        int i17 = iArr2[i16];
                        if (fArr2[i17] < fArr2[i15]) {
                            iArr2[i16 + 1] = i17;
                            i16--;
                        }
                    }
                    iArr2[i16 + 1] = i15;
                }
            }
            org.telegram.ui.Cells.u0 u0Var = this.e;
            int width2 = u0Var.getWidth();
            int height2 = u0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) u0Var.f23119b;
                fArr9[0] = 0.0f;
                fArr9[1] = 0.0f;
                float f15 = width2;
                fArr9[2] = f15;
                fArr9[3] = 0.0f;
                fArr9[4] = f15;
                float f16 = height2;
                fArr9[5] = f16;
                fArr9[6] = 0.0f;
                fArr9[7] = f16;
                u0Var.f23120c = ((Matrix) u0Var.d).setPolyToPoly(fArr9, 0, this.f34577w, 0, 4);
                u0Var.invalidate();
            }
        }
        c6 c6Var2 = this.f34560b;
        if (c6Var2 != null) {
            c6Var2.k(f11, f12);
        }
        this.h.invalidate();
        e6Var.invalidate();
    }

    public final void d(int i10, MotionEvent motionEvent) {
        this.P = motionEvent.getPointerId(i10);
        this.Q = motionEvent.getX(i10);
        this.R = motionEvent.getY(i10);
        this.S = this.N;
        this.T = this.O;
    }

    public final void e() {
        boolean z10;
        SensorManager sensorManager = this.f34578x;
        if (sensorManager != null) {
            if (this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f34559a0 != z10) {
                this.f34559a0 = z10;
                ew ewVar = this.f34572k0;
                removeCallbacks(ewVar);
                if (z10) {
                    this.V = 0L;
                    Sensor sensor = this.f34579y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(ewVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f34563c0;
    }

    public float getCardRotationY() {
        return this.f34567f0;
    }

    public FrameLayout getFrontFace() {
        return this.f34575r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
        this.V = 0L;
        n6 n6Var = this.G;
        n6Var.f34938a = false;
        n6Var.h = 0L;
        n6Var.f34943i = 0L;
        n6Var.f34944j = 0L;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.W = false;
        e();
        ValueAnimator valueAnimator = this.f34561b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34561b0.cancel();
            this.f34561b0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
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
            long j10 = this.V;
            if (j10 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.I = c(org.telegram.ui.Cells.f1.x(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = c(c3.i0.u(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.V = sensorEvent.timestamp;
        }
        float f10 = ((-this.J) / 0.82f) * 15.0f;
        float f11 = (this.I / 0.82f) * 15.0f;
        long j11 = sensorEvent.timestamp;
        n6 n6Var = this.G;
        n6Var.getClass();
        if (!Float.isNaN(f10) && !Float.isInfinite(f10) && !Float.isNaN(f11) && !Float.isInfinite(f11)) {
            n6Var.f34939b = f10;
            n6Var.f34940c = f11;
            n6Var.f34943i = j11;
            if (!n6Var.f34938a) {
                n6Var.f34938a = true;
                n6Var.d = f10;
                n6Var.e = f11;
                n6Var.f34941f = f10;
                n6Var.f34942g = f11;
                n6Var.h = j11;
                return;
            }
            float f12 = f10 - n6Var.f34941f;
            float f13 = f11 - n6Var.f34942g;
            if ((f13 * f13) + (f12 * f12) > 1.265625f) {
                n6Var.f34941f = f10;
                n6Var.f34942g = f11;
                n6Var.h = j11;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float L = i10 / org.telegram.messenger.i0.L(336.0f);
        org.telegram.ui.Components.voip.j0 j0Var = this.f34575r;
        j0Var.setScaleX(L);
        j0Var.setScaleY(i11 / org.telegram.messenger.i0.L(205.0f));
        b(this.f34563c0, this.f34567f0);
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
                                for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
                                    if (i10 != motionEvent.getActionIndex()) {
                                        d(i10, motionEvent);
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
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x10 - this.Q);
                        float f7 = this.H;
                        if (abs > f7 || Math.abs(y3 - this.R) > f7) {
                            this.U = true;
                            setPressed(false);
                        }
                        if (this.U) {
                            float f10 = this.T;
                            this.O = c(sc.e.z(x10, this.Q, 0.03f, f10), f10 - 32.0f, f10 + 32.0f);
                            float f11 = this.S;
                            this.N = c(sc.e.z(y3, this.R, 0.03f, f11), f11 - 22.0f, f11 + 22.0f);
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
            postDelayed(new d6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f34561b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34561b0.cancel();
            this.f34561b0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        d(0, motionEvent);
        this.U = false;
        setPressed(true);
        return true;
    }

    @Override
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        e();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        e();
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        e();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f7) {
        float f10 = this.f34564d0;
        if (f10 == f7) {
            return;
        }
        this.f34564d0 = f7;
        b((this.f34563c0 + f7) - f10, this.f34567f0);
    }

    public void setCardIcon(int i10) {
        e6 e6Var = this.f34574n;
        g6 g6Var = e6Var.f34460b;
        g6Var.f34562c = i10;
        c6 c6Var = g6Var.f34560b;
        if (c6Var != null) {
            c6Var.j(i10);
        }
        e6Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        e6 e6Var = this.f34574n;
        e6Var.f34459a = z10;
        e6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        kg.f0 f0Var = this.h;
        f0Var.f11064b = fArr;
        this.e.invalidate();
        f0Var.invalidate();
        this.f34574n.invalidate();
    }

    public void setUseGyroscope(float f7) {
        if (this.f34565e0 == f7) {
            return;
        }
        this.f34565e0 = f7;
        b((this.L * f7) + this.N + this.f34564d0, (this.M * f7) + this.O);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
