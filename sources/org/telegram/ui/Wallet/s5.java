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
import ei.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.nk;
import org.telegram.ui.Components.t00;
import org.telegram.ui.tf1;
public final class s5 extends FrameLayout implements SensorEventListener {
    public static final Object f34844n0 = new Object();
    public final float[] E;
    public final float[] F;
    public final z5 G;
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
    public boolean f34845a;
    public boolean f34846a0;
    public p5 f34847b;
    public ValueAnimator f34848b0;
    public int f34849c;
    public float f34850c0;
    public v2 d;
    public float f34851d0;
    public final t00 e;
    public float f34852e0;
    public final ci.m1 f34853f;
    public float f34854f0;
    public float f34855g0;
    public final ei.g6 h;
    public float f34856h0;
    public int f34857i0;
    public int f34858j0;
    public final org.telegram.ui.Cells.k7 f34859k0;
    public float f34860l0;
    public float m0;
    public final r5 f34861n;
    public final ah.x f34862r;
    public final m.s3 f34863s;
    public final float[] v;
    public final SensorManager f34864w;
    public final Sensor f34865x;
    public final boolean f34866y;

    public s5(Context context, int i10, int i11) {
        super(context);
        this.f34863s = new m.s3();
        this.v = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new Object();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.f34852e0 = 1.0f;
        this.f34855g0 = Float.NaN;
        this.f34856h0 = Float.NaN;
        this.f34859k0 = new org.telegram.ui.Cells.k7(this, 28);
        this.f34849c = i10;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        w7.b6.b(this, 0.02f, 1.2f);
        t00 t00Var = new t00(this, context);
        this.e = t00Var;
        addView(t00Var, w7.z5.e(-1, -1, 17));
        ci.m1 m1Var = new ci.m1(context, 1);
        this.f34853f = m1Var;
        m1Var.setPadding(2, 2, 2, 2);
        m1Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        t00Var.addView(m1Var, layoutParams);
        ei.g6 g6Var = new ei.g6(this, context);
        this.h = g6Var;
        m1Var.addView(g6Var, w7.z5.e(-1, -1, 17));
        r5 r5Var = new r5(this, context);
        this.f34861n = r5Var;
        m1Var.addView(r5Var, w7.z5.e(-1, -1, 17));
        ah.x xVar = new ah.x(this, context, 28);
        this.f34862r = xVar;
        xVar.setClipChildren(false);
        xVar.setClipToPadding(false);
        xVar.setLayerType(2, null);
        xVar.setPivotX(0.0f);
        xVar.setPivotY(0.0f);
        m1Var.addView(xVar, w7.z5.e(336, 205, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34864w = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34865x = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.f34866y = z10;
        q5 q5Var = new q5(this, 1);
        if (p5.f34703j0 && p5.f34708p0.get(Integer.valueOf(i10)) != null) {
            this.f34847b = new p5(context.getApplicationContext(), i10, i11, q5Var);
            return;
        }
        t00Var.setVisibility(4);
        p5.f34705l0.postRunnable(new gi.m4(this, context, i10, i11, q5Var));
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f34848b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34848b0.cancel();
            this.f34848b0 = null;
        }
        float f7 = this.N;
        float f10 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f34848b0 = ofFloat;
        ofFloat.setDuration(600L);
        nk.l(1.2f, this.f34848b0);
        this.f34848b0.addUpdateListener(new ja(this, f7, f10, 6));
        this.f34848b0.addListener(new tf1(this, 6));
        this.f34848b0.start();
    }

    public final void b(float f7, float f10) {
        boolean z10;
        float[] fArr;
        this.f34850c0 = f7;
        this.f34854f0 = f10;
        float f11 = f7 + this.f34860l0;
        float f12 = f10 + this.m0;
        if (Math.cos(Math.toRadians(f12)) * Math.cos(Math.toRadians(f11)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f34845a;
        r5 r5Var = this.f34861n;
        if (z11 != z10) {
            this.f34845a = z10;
            this.f34862r.invalidate();
            r5Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f34855g0 == f11 && this.f34856h0 == f12 && this.f34857i0 == width && this.f34858j0 == height) {
            return;
        }
        this.f34855g0 = f11;
        this.f34856h0 = f12;
        this.f34857i0 = width;
        this.f34858j0 = height;
        if (width > 0 && height > 0) {
            this.f34863s.c(width, height, f11, f12, z10, this.v);
            p5 p5Var = this.f34847b;
            if (p5Var != null) {
                float[] fArr2 = p5Var.f34728n;
                float[] fArr3 = p5Var.f34727m;
                float[] fArr4 = p5Var.f34725k;
                float[] fArr5 = p5Var.f34726l;
                int[] iArr = p5Var.f34729o;
                p5Var.f34732r = z10;
                float[] fArr6 = p5Var.f34722i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                m.s3 s3Var = this.f34863s;
                s3Var.getClass();
                int i10 = 0;
                while (i10 < fArr6.length / 2) {
                    int i11 = i10 * 2;
                    float f13 = (fArr6[i11 + 1] * (-1.212122f)) + 0.618561f;
                    float f14 = ((fArr6[i11] * 2.0f) - 1.0f) * 1.0f;
                    float d = s3Var.d(-0.0125f, f13, f14, width, height, fArr, i11);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i10] = (d + s3Var.d(0.0125f, f13, f14, width, height, fArr8, i11)) * 0.5f;
                    i10++;
                    s3Var = s3Var;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                p5Var.f34731q = width / 336.0f;
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
            t00 t00Var = this.e;
            int width2 = t00Var.getWidth();
            int height2 = t00Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) t00Var.d;
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
                t00Var.f30388b = ((Matrix) t00Var.f30389c).setPolyToPoly(fArr9, 0, this.v, 0, 4);
                t00Var.invalidate();
            }
        }
        p5 p5Var2 = this.f34847b;
        if (p5Var2 != null) {
            p5Var2.k(f11, f12);
        }
        this.h.invalidate();
        r5Var.invalidate();
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
        SensorManager sensorManager = this.f34864w;
        if (sensorManager != null) {
            if (this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f34846a0 != z10) {
                this.f34846a0 = z10;
                org.telegram.ui.Cells.k7 k7Var = this.f34859k0;
                removeCallbacks(k7Var);
                if (z10) {
                    this.V = 0L;
                    Sensor sensor = this.f34865x;
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

    public float getCardRotationX() {
        return this.f34850c0;
    }

    public float getCardRotationY() {
        return this.f34854f0;
    }

    public FrameLayout getFrontFace() {
        return this.f34862r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
        this.V = 0L;
        z5 z5Var = this.G;
        z5Var.f35186a = false;
        z5Var.h = 0L;
        z5Var.f35191i = 0L;
        z5Var.f35192j = 0L;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.W = false;
        e();
        ValueAnimator valueAnimator = this.f34848b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34848b0.cancel();
            this.f34848b0 = null;
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
        if (this.f34866y) {
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
                    this.I = c(org.telegram.ui.Cells.c1.z(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = c(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.V = sensorEvent.timestamp;
        }
        float f10 = ((-this.J) / 0.82f) * 15.0f;
        float f11 = (this.I / 0.82f) * 15.0f;
        long j11 = sensorEvent.timestamp;
        z5 z5Var = this.G;
        z5Var.getClass();
        if (!Float.isNaN(f10) && !Float.isInfinite(f10) && !Float.isNaN(f11) && !Float.isInfinite(f11)) {
            z5Var.f35187b = f10;
            z5Var.f35188c = f11;
            z5Var.f35191i = j11;
            if (!z5Var.f35186a) {
                z5Var.f35186a = true;
                z5Var.d = f10;
                z5Var.e = f11;
                z5Var.f35189f = f10;
                z5Var.f35190g = f11;
                z5Var.h = j11;
                return;
            }
            float f12 = f10 - z5Var.f35189f;
            float f13 = f11 - z5Var.f35190g;
            if ((f13 * f13) + (f12 * f12) > 1.265625f) {
                z5Var.f35189f = f10;
                z5Var.f35190g = f11;
                z5Var.h = j11;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = i10 / AndroidUtilities.dp(336.0f);
        ah.x xVar = this.f34862r;
        xVar.setScaleX(dp);
        xVar.setScaleY(i11 / AndroidUtilities.dp(205.0f));
        b(this.f34850c0, this.f34854f0);
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
                            this.O = c(com.google.android.gms.internal.play_billing.k3.D(x10, this.Q, 0.03f, f10), f10 - 32.0f, f10 + 32.0f);
                            float f11 = this.S;
                            this.N = c(com.google.android.gms.internal.play_billing.k3.D(y3, this.R, 0.03f, f11), f11 - 22.0f, f11 + 22.0f);
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
            postDelayed(new q5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f34848b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34848b0.cancel();
            this.f34848b0 = null;
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
        float f10 = this.f34851d0;
        if (f10 == f7) {
            return;
        }
        this.f34851d0 = f7;
        b((this.f34850c0 + f7) - f10, this.f34854f0);
    }

    public void setCardIcon(int i10) {
        r5 r5Var = this.f34861n;
        s5 s5Var = r5Var.f34810b;
        s5Var.f34849c = i10;
        p5 p5Var = s5Var.f34847b;
        if (p5Var != null) {
            p5Var.j(i10);
        }
        r5Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        r5 r5Var = this.f34861n;
        r5Var.f34809a = z10;
        r5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        ei.g6 g6Var = this.h;
        g6Var.f9069b = fArr;
        this.e.invalidate();
        g6Var.invalidate();
        this.f34861n.invalidate();
    }

    public void setUseGyroscope(float f7) {
        if (this.f34852e0 == f7) {
            return;
        }
        this.f34852e0 = f7;
        b((this.L * f7) + this.N + this.f34851d0, (this.M * f7) + this.O);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
