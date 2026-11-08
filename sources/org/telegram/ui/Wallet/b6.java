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
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.v41;
import org.telegram.ui.s81;
public final class b6 extends FrameLayout implements SensorEventListener {
    public static final Object f42190n0 = new Object();
    public final boolean D;
    public final float[] E;
    public final float[] F;
    public final i6 G;
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
    public boolean f42191a;
    public boolean f42192a0;
    public y5 f42193b;
    public ValueAnimator f42194b0;
    public int f42195c;
    public float f42196c0;
    public k3 d;
    public float f42197d0;
    public final org.telegram.ui.Cells.v0 f42198e;
    public float f42199e0;
    public final v41 f42200f;
    public float f42201f0;
    public float f42202g0;
    public final fi.p5 h;
    public float f42203h0;
    public int f42204i0;
    public int f42205j0;
    public final et f42206k0;
    public float f42207l0;
    public float m0;
    public final a6 f42208n;
    public final v41 f42209r;
    public final ga.d f42210s;
    public final float[] f42211w;
    public final SensorManager f42212x;
    public final Sensor f42213y;

    public b6(Context context, int i7, int i10) {
        super(context);
        this.f42210s = new ga.d(4);
        this.f42211w = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new Object();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.f42199e0 = 1.0f;
        this.f42202g0 = Float.NaN;
        this.f42203h0 = Float.NaN;
        this.f42206k0 = new et(this, 25);
        this.f42195c = i7;
        boolean z9 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.ka.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, context);
        this.f42198e = v0Var;
        addView(v0Var, c8.ha.e(-1, -1, 17));
        v41 v41Var = new v41(context);
        this.f42200f = v41Var;
        v41Var.setPadding(2, 2, 2, 2);
        v41Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        v0Var.addView(v41Var, layoutParams);
        fi.p5 p5Var = new fi.p5(this, context);
        this.h = p5Var;
        v41Var.addView(p5Var, c8.ha.e(-1, -1, 17));
        a6 a6Var = new a6(this, context);
        this.f42208n = a6Var;
        v41Var.addView(a6Var, c8.ha.e(-1, -1, 17));
        v41 v41Var2 = new v41(3, context, this);
        this.f42209r = v41Var2;
        v41Var2.setClipChildren(false);
        v41Var2.setClipToPadding(false);
        v41Var2.setLayerType(2, null);
        v41Var2.setPivotX(0.0f);
        v41Var2.setPivotY(0.0f);
        v41Var.addView(v41Var2, c8.ha.e(336, 205, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42212x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f42213y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z9 = true;
        }
        this.D = z9;
        z5 z5Var = new z5(this, 1);
        if (y5.f43396j0 && y5.f43401p0.get(Integer.valueOf(i7)) != null) {
            this.f42193b = new y5(context.getApplicationContext(), i7, i10, z5Var);
            return;
        }
        v0Var.setVisibility(4);
        y5.f43398l0.postRunnable(new hi.j4(this, context, i7, i10, z5Var));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f42194b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42194b0.cancel();
            this.f42194b0 = null;
        }
        float f10 = this.N;
        float f11 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42194b0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.messenger.camera.q.i(1.2f, this.f42194b0);
        this.f42194b0.addUpdateListener(new fi.l9(this, f10, f11, 5));
        this.f42194b0.addListener(new s81(this, 8));
        this.f42194b0.start();
    }

    public final void b(float f10, float f11) {
        boolean z9;
        float[] fArr;
        this.f42196c0 = f10;
        this.f42201f0 = f11;
        float f12 = f10 + this.f42207l0;
        float f13 = f11 + this.m0;
        if (Math.cos(Math.toRadians(f13)) * Math.cos(Math.toRadians(f12)) < 0.0d) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = this.f42191a;
        a6 a6Var = this.f42208n;
        if (z10 != z9) {
            this.f42191a = z9;
            this.f42209r.invalidate();
            a6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f42202g0 == f12 && this.f42203h0 == f13 && this.f42204i0 == width && this.f42205j0 == height) {
            return;
        }
        this.f42202g0 = f12;
        this.f42203h0 = f13;
        this.f42204i0 = width;
        this.f42205j0 = height;
        if (width > 0 && height > 0) {
            this.f42210s.f(width, height, f12, f13, z9, this.f42211w);
            y5 y5Var = this.f42193b;
            if (y5Var != null) {
                float[] fArr2 = y5Var.f43422n;
                float[] fArr3 = y5Var.f43421m;
                float[] fArr4 = y5Var.f43419k;
                float[] fArr5 = y5Var.f43420l;
                int[] iArr = y5Var.f43423o;
                y5Var.f43426r = z9;
                float[] fArr6 = y5Var.f43416i;
                if (z9) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z9) {
                    fArr4 = fArr5;
                }
                ga.d dVar = this.f42210s;
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
                y5Var.f43425q = width / 336.0f;
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
            org.telegram.ui.Cells.v0 v0Var = this.f42198e;
            int width2 = v0Var.getWidth();
            int height2 = v0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) v0Var.f30613b;
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
                v0Var.f30614c = ((Matrix) v0Var.d).setPolyToPoly(fArr9, 0, this.f42211w, 0, 4);
                v0Var.invalidate();
            }
        }
        y5 y5Var2 = this.f42193b;
        if (y5Var2 != null) {
            y5Var2.k(f12, f13);
        }
        this.h.invalidate();
        a6Var.invalidate();
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
        SensorManager sensorManager = this.f42212x;
        if (sensorManager != null) {
            if (this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f42192a0 != z9) {
                this.f42192a0 = z9;
                et etVar = this.f42206k0;
                removeCallbacks(etVar);
                if (z9) {
                    this.V = 0L;
                    Sensor sensor = this.f42213y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(etVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f42196c0;
    }

    public float getCardRotationY() {
        return this.f42201f0;
    }

    public FrameLayout getFrontFace() {
        return this.f42209r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
        this.V = 0L;
        i6 i6Var = this.G;
        i6Var.f42629a = false;
        i6Var.h = 0L;
        i6Var.f42635i = 0L;
        i6Var.f42636j = 0L;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.W = false;
        e();
        ValueAnimator valueAnimator = this.f42194b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42194b0.cancel();
            this.f42194b0 = null;
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
        i6 i6Var = this.G;
        i6Var.getClass();
        if (!Float.isNaN(f11) && !Float.isInfinite(f11) && !Float.isNaN(f12) && !Float.isInfinite(f12)) {
            i6Var.f42630b = f11;
            i6Var.f42631c = f12;
            i6Var.f42635i = j10;
            if (!i6Var.f42629a) {
                i6Var.f42629a = true;
                i6Var.d = f11;
                i6Var.f42632e = f12;
                i6Var.f42633f = f11;
                i6Var.f42634g = f12;
                i6Var.h = j10;
                return;
            }
            float f13 = f11 - i6Var.f42633f;
            float f14 = f12 - i6Var.f42634g;
            if ((f14 * f14) + (f13 * f13) > 1.265625f) {
                i6Var.f42633f = f11;
                i6Var.f42634g = f12;
                i6Var.h = j10;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = i7 / org.telegram.messenger.g0.L(336.0f);
        v41 v41Var = this.f42209r;
        v41Var.setScaleX(L);
        v41Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.f42196c0, this.f42201f0);
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
            postDelayed(new z5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f42194b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42194b0.cancel();
            this.f42194b0 = null;
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
        float f11 = this.f42197d0;
        if (f11 == f10) {
            return;
        }
        this.f42197d0 = f10;
        b((this.f42196c0 + f10) - f11, this.f42201f0);
    }

    public void setCardIcon(int i7) {
        a6 a6Var = this.f42208n;
        b6 b6Var = a6Var.f42119b;
        b6Var.f42195c = i7;
        y5 y5Var = b6Var.f42193b;
        if (y5Var != null) {
            y5Var.j(i7);
        }
        a6Var.invalidate();
    }

    public void setHasCardNumber(boolean z9) {
        a6 a6Var = this.f42208n;
        a6Var.f42118a = z9;
        a6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        fi.p5 p5Var = this.h;
        p5Var.f12597b = fArr;
        this.f42198e.invalidate();
        p5Var.invalidate();
        this.f42208n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f42199e0 == f10) {
            return;
        }
        this.f42199e0 = f10;
        b((this.L * f10) + this.N + this.f42197d0, (this.M * f10) + this.O);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
