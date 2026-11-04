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
import b8.mf;
import b8.pf;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lt;
import org.telegram.ui.i81;
public final class a6 extends FrameLayout implements SensorEventListener {
    public static final Object f42135o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final h6 H;
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
    public boolean f42136a;
    public boolean f42137a0;
    public x5 f42138b;
    public boolean f42139b0;
    public int f42140c;
    public ValueAnimator f42141c0;
    public j3 d;
    public float f42142d0;
    public final org.telegram.ui.Cells.v0 f42143e;
    public float f42144e0;
    public final ei.k1 f42145f;
    public float f42146f0;
    public float f42147g0;
    public final gi.n5 h;
    public float f42148h0;
    public float f42149i0;
    public int f42150j0;
    public int f42151k0;
    public final lt f42152l0;
    public float m0;
    public final z5 f42153n;
    public float f42154n0;
    public final kw0 f42155r;
    public final fa.f f42156s;
    public final float[] f42157w;
    public final SensorManager f42158x;
    public final Sensor f42159y;

    public a6(Context context, int i3, int i10) {
        super(context);
        this.f42156s = new fa.f(4);
        this.f42157w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new Object();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f42146f0 = 1.0f;
        this.f42148h0 = Float.NaN;
        this.f42149i0 = Float.NaN;
        this.f42152l0 = new lt(this, 20);
        this.f42140c = i3;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        pf.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, context);
        this.f42143e = v0Var;
        addView(v0Var, mf.e(-1, -1, 17));
        ei.k1 k1Var = new ei.k1(context, 1);
        this.f42145f = k1Var;
        k1Var.setPadding(2, 2, 2, 2);
        k1Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        v0Var.addView(k1Var, layoutParams);
        gi.n5 n5Var = new gi.n5(this, context);
        this.h = n5Var;
        k1Var.addView(n5Var, mf.e(-1, -1, 17));
        z5 z5Var = new z5(this, context);
        this.f42153n = z5Var;
        k1Var.addView(z5Var, mf.e(-1, -1, 17));
        kw0 kw0Var = new kw0(5, context, this);
        this.f42155r = kw0Var;
        kw0Var.setClipChildren(false);
        kw0Var.setClipToPadding(false);
        kw0Var.setLayerType(2, null);
        kw0Var.setPivotX(0.0f);
        kw0Var.setPivotY(0.0f);
        k1Var.addView(kw0Var, mf.e(336, 205, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f42158x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f42159y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.E = z10;
        y5 y5Var = new y5(this, 1);
        if (x5.f43399j0 && x5.f43404p0.get(Integer.valueOf(i3)) != null) {
            this.f42138b = new x5(context.getApplicationContext(), i3, i10, y5Var);
            return;
        }
        v0Var.setVisibility(4);
        x5.f43401l0.postRunnable(new ii.j4(this, context, i3, i10, y5Var));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f42141c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42141c0.cancel();
            this.f42141c0 = null;
        }
        float f10 = this.O;
        float f11 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42141c0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.messenger.camera.q.i(1.2f, this.f42141c0);
        this.f42141c0.addUpdateListener(new gi.l9(this, f10, f11, 5));
        this.f42141c0.addListener(new i81(this, 8));
        this.f42141c0.start();
    }

    public final void b(float f10, float f11) {
        boolean z10;
        float[] fArr;
        this.f42142d0 = f10;
        this.f42147g0 = f11;
        float f12 = f10 + this.m0;
        float f13 = f11 + this.f42154n0;
        if (Math.cos(Math.toRadians(f13)) * Math.cos(Math.toRadians(f12)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f42136a;
        z5 z5Var = this.f42153n;
        if (z11 != z10) {
            this.f42136a = z10;
            this.f42155r.invalidate();
            z5Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f42148h0 == f12 && this.f42149i0 == f13 && this.f42150j0 == width && this.f42151k0 == height) {
            return;
        }
        this.f42148h0 = f12;
        this.f42149i0 = f13;
        this.f42150j0 = width;
        this.f42151k0 = height;
        if (width > 0 && height > 0) {
            this.f42156s.f(width, height, f12, f13, z10, this.f42157w);
            x5 x5Var = this.f42138b;
            if (x5Var != null) {
                float[] fArr2 = x5Var.f43425n;
                float[] fArr3 = x5Var.f43424m;
                float[] fArr4 = x5Var.f43422k;
                float[] fArr5 = x5Var.f43423l;
                int[] iArr = x5Var.f43426o;
                x5Var.f43429r = z10;
                float[] fArr6 = x5Var.f43419i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                fa.f fVar = this.f42156s;
                fVar.getClass();
                int i3 = 0;
                while (i3 < fArr6.length / 2) {
                    int i10 = i3 * 2;
                    float f14 = (fArr6[i10 + 1] * (-1.212122f)) + 0.618561f;
                    float f15 = ((fArr6[i10] * 2.0f) - 1.0f) * 1.0f;
                    float g7 = fVar.g(-0.0125f, f14, f15, width, height, fArr, i10);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i3] = (g7 + fVar.g(0.0125f, f14, f15, width, height, fArr8, i10)) * 0.5f;
                    i3++;
                    fVar = fVar;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                x5Var.f43428q = width / 336.0f;
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
            org.telegram.ui.Cells.v0 v0Var = this.f42143e;
            int width2 = v0Var.getWidth();
            int height2 = v0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) v0Var.f30707b;
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
                v0Var.f30708c = ((Matrix) v0Var.d).setPolyToPoly(fArr9, 0, this.f42157w, 0, 4);
                v0Var.invalidate();
            }
        }
        x5 x5Var2 = this.f42138b;
        if (x5Var2 != null) {
            x5Var2.k(f12, f13);
        }
        this.h.invalidate();
        z5Var.invalidate();
    }

    public final void d(int i3, MotionEvent motionEvent) {
        this.Q = motionEvent.getPointerId(i3);
        this.R = motionEvent.getX(i3);
        this.S = motionEvent.getY(i3);
        this.T = this.O;
        this.U = this.P;
    }

    public final void e() {
        boolean z10;
        SensorManager sensorManager = this.f42158x;
        if (sensorManager != null) {
            if (this.f42137a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f42139b0 != z10) {
                this.f42139b0 = z10;
                lt ltVar = this.f42152l0;
                removeCallbacks(ltVar);
                if (z10) {
                    this.W = 0L;
                    Sensor sensor = this.f42159y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(ltVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f42142d0;
    }

    public float getCardRotationY() {
        return this.f42147g0;
    }

    public FrameLayout getFrontFace() {
        return this.f42155r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42137a0 = true;
        this.W = 0L;
        h6 h6Var = this.H;
        h6Var.f42617a = false;
        h6Var.h = 0L;
        h6Var.f42623i = 0L;
        h6Var.f42624j = 0L;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f42137a0 = false;
        e();
        ValueAnimator valueAnimator = this.f42141c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42141c0.cancel();
            this.f42141c0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
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
            long j10 = this.W;
            if (j10 != 0) {
                float f10 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f10 > 0.0f && f10 < 0.1f) {
                    this.J = c(org.telegram.ui.Cells.f1.A(sensorEvent.values[1], f10, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(com.google.android.recaptcha.internal.a.v(sensorEvent.values[0], f10, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f11 = ((-this.K) / 0.82f) * 15.0f;
        float f12 = (this.J / 0.82f) * 15.0f;
        long j11 = sensorEvent.timestamp;
        h6 h6Var = this.H;
        h6Var.getClass();
        if (!Float.isNaN(f11) && !Float.isInfinite(f11) && !Float.isNaN(f12) && !Float.isInfinite(f12)) {
            h6Var.f42618b = f11;
            h6Var.f42619c = f12;
            h6Var.f42623i = j11;
            if (!h6Var.f42617a) {
                h6Var.f42617a = true;
                h6Var.d = f11;
                h6Var.f42620e = f12;
                h6Var.f42621f = f11;
                h6Var.f42622g = f12;
                h6Var.h = j11;
                return;
            }
            float f13 = f11 - h6Var.f42621f;
            float f14 = f12 - h6Var.f42622g;
            if ((f14 * f14) + (f13 * f13) > 1.265625f) {
                h6Var.f42621f = f11;
                h6Var.f42622g = f12;
                h6Var.h = j11;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        float L = i3 / org.telegram.messenger.g0.L(336.0f);
        kw0 kw0Var = this.f42155r;
        kw0Var.setScaleX(L);
        kw0Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.f42142d0, this.f42147g0);
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
                                for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                                    if (i3 != motionEvent.getActionIndex()) {
                                        d(i3, motionEvent);
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
                        float y9 = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x10 - this.R);
                        float f10 = this.I;
                        if (abs > f10 || Math.abs(y9 - this.S) > f10) {
                            this.V = true;
                            setPressed(false);
                        }
                        if (this.V) {
                            float f11 = this.U;
                            this.P = c(a1.g.D(x10, this.R, 0.03f, f11), f11 - 32.0f, f11 + 32.0f);
                            float f12 = this.T;
                            this.O = c(a1.g.D(y9, this.S, 0.03f, f12), f12 - 22.0f, f12 + 22.0f);
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
            postDelayed(new y5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f42141c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42141c0.cancel();
            this.f42141c0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        d(0, motionEvent);
        this.V = false;
        setPressed(true);
        return true;
    }

    @Override
    public final void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        e();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        e();
    }

    @Override
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        e();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f10) {
        float f11 = this.f42144e0;
        if (f11 == f10) {
            return;
        }
        this.f42144e0 = f10;
        b((this.f42142d0 + f10) - f11, this.f42147g0);
    }

    public void setCardIcon(int i3) {
        z5 z5Var = this.f42153n;
        a6 a6Var = z5Var.f43507b;
        a6Var.f42140c = i3;
        x5 x5Var = a6Var.f42138b;
        if (x5Var != null) {
            x5Var.j(i3);
        }
        z5Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        z5 z5Var = this.f42153n;
        z5Var.f43506a = z10;
        z5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        gi.n5 n5Var = this.h;
        n5Var.f13303b = fArr;
        this.f42143e.invalidate();
        n5Var.invalidate();
        this.f42153n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f42146f0 == f10) {
            return;
        }
        this.f42146f0 = f10;
        b((this.M * f10) + this.O + this.f42144e0, (this.N * f10) + this.P);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
