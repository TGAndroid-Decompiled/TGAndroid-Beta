package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.kk;
import org.telegram.ui.vf1;
public final class p5 extends FrameLayout implements SensorEventListener {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public float S;
    public float T;
    public float U;
    public float V;
    public final org.telegram.ui.Cells.k7 W;
    public final boolean f34731a;
    public float f34732a0;
    public final ai.w1 f34733b;
    public float f34734b0;
    public final o5 f34735c;
    public final n5 d;
    public final FrameLayout e;
    public final m.s3 f34736f;
    public final float[] h;
    public final SensorManager f34737n;
    public final Sensor f34738r;
    public final boolean f34739s;
    public final float[] v;
    public final float[] f34740w;
    public final d6 f34741x;
    public final int f34742y;

    public p5(int i10, int i11, Context context, boolean z10) {
        super(context);
        this.f34736f = new m.s3();
        this.h = new float[8];
        this.v = new float[9];
        this.f34740w = new float[3];
        this.f34741x = new Object();
        this.E = -0.22f;
        this.F = -0.28f;
        this.U = 1.0f;
        this.W = new org.telegram.ui.Cells.k7(this, 28);
        this.f34731a = z10;
        boolean z11 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        w7.b6.b(this, 0.02f, 1.2f);
        ai.w1 w1Var = new ai.w1(context, 11);
        this.f34733b = w1Var;
        addView(w1Var, w7.z5.e(-1, -1, 17));
        o5 o5Var = new o5(context);
        this.f34735c = o5Var;
        w1Var.addView(o5Var, w7.z5.e(-1, -1, 17));
        n5 n5Var = new n5(context, i10, i11);
        this.d = n5Var;
        w1Var.addView(n5Var, w7.z5.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        w1Var.addView(frameLayout, w7.z5.e(336, 205, 51));
        this.f34742y = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34737n = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34738r = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z11 = true;
        }
        this.f34739s = z11;
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.R.cancel();
            this.R = null;
        }
        float f7 = this.J;
        float f10 = this.K;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R = ofFloat;
        ofFloat.setDuration(600L);
        kk.l(1.2f, this.R);
        this.R.addUpdateListener(new ei.ja(this, f7, f10, 6));
        this.R.addListener(new vf1(this, 6));
        this.R.start();
    }

    public final void b(float f7, float f10) {
        this.S = f7;
        this.V = f10;
        float f11 = f7 + this.f34732a0;
        float f12 = f10 + this.f34734b0;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            this.f34736f.c(width, height, f11, f12, false, this.h);
            ai.w1 w1Var = this.f34733b;
            int width2 = w1Var.getWidth();
            int height2 = w1Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr = (float[]) w1Var.d;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f13 = width2;
                fArr[2] = f13;
                fArr[3] = 0.0f;
                fArr[4] = f13;
                float f14 = height2;
                fArr[5] = f14;
                fArr[6] = 0.0f;
                fArr[7] = f14;
                ((Matrix) w1Var.f2353b).setPolyToPoly(fArr, 0, this.h, 0, 4);
                w1Var.invalidate();
            }
        }
        o5 o5Var = this.f34735c;
        Matrix matrix = o5Var.f34673b;
        if (o5Var.d != null) {
            matrix.setRotate(((2.0f * f12) - (1.25f * f11)) - 69.01f, o5Var.h, o5Var.f34676n);
            o5Var.d.setLocalMatrix(matrix);
            o5Var.invalidate();
        }
        n5 n5Var = this.d;
        n5Var.H = f11;
        n5Var.I = f12;
        n5Var.invalidate();
    }

    public float getCardRotationX() {
        return this.S;
    }

    public float getCardRotationY() {
        return this.V;
    }

    public FrameLayout getFrontFace() {
        return this.e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34731a) {
            return;
        }
        this.Q = 0L;
        d6 d6Var = this.f34741x;
        d6Var.f34131a = false;
        d6Var.h = 0L;
        d6Var.f34136i = 0L;
        d6Var.f34137j = 0L;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        Sensor sensor = this.f34738r;
        if (sensor != null) {
            this.f34737n.registerListener(this, sensor, 1);
        }
        org.telegram.ui.Cells.k7 k7Var = this.W;
        removeCallbacks(k7Var);
        postOnAnimation(k7Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34737n.unregisterListener(this);
        removeCallbacks(this.W);
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.R.cancel();
            this.R = null;
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
        if (this.f34739s) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.v;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.f34740w;
            SensorManager.getOrientation(fArr2, fArr3);
            this.E = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.F = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            long j10 = this.Q;
            if (j10 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.E = c(org.telegram.ui.Cells.c1.z(sensorEvent.values[1], f7, 0.75f, this.E), -0.82f, 0.82f);
                    this.F = c(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, 0.75f, this.F), -0.82f, 0.82f);
                }
            }
            this.Q = sensorEvent.timestamp;
        }
        long j11 = sensorEvent.timestamp;
        this.f34741x.a(((-this.F) / 0.82f) * 15.0f, (this.E / 0.82f) * 15.0f, j11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = i10 / AndroidUtilities.dp(336.0f);
        FrameLayout frameLayout = this.e;
        frameLayout.setScaleX(dp);
        frameLayout.setScaleY(i11 / AndroidUtilities.dp(205.0f));
        b(this.S, this.V);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f34731a) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        setPressed(false);
                        if (this.P) {
                            a();
                            return true;
                        }
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.L);
                    float f7 = this.f34742y;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.M) > f7) {
                        this.P = true;
                        setPressed(false);
                    }
                    if (this.P) {
                        float D = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getX(), this.L, 0.03f, this.O);
                        float f10 = this.O;
                        this.K = c(D, f10 - 32.0f, f10 + 32.0f);
                        float D2 = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getY(), this.M, 0.03f, this.N);
                        float f11 = this.N;
                        this.J = c(D2, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.P) {
                a();
                return true;
            }
            postDelayed(new n(this, 10), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.R.cancel();
            this.R = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.L = motionEvent.getX();
        this.M = motionEvent.getY();
        this.N = this.J;
        this.O = this.K;
        this.P = false;
        setPressed(true);
        return true;
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f7) {
        float f10 = this.T;
        if (f10 == f7) {
            return;
        }
        this.T = f7;
        b((this.S + f7) - f10, this.V);
    }

    public void setCardIcon(int i10) {
        n5 n5Var = this.d;
        Drawable drawable = n5Var.getContext().getDrawable(i10);
        n5Var.f34640x = drawable;
        if (drawable != null) {
            n5Var.f34640x = drawable.mutate();
        }
        n5Var.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        n5 n5Var = this.d;
        n5Var.F = bitmap;
        n5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        int a2;
        o5 o5Var = this.f34735c;
        o5Var.e = fArr;
        o5Var.invalidate();
        n5 n5Var = this.d;
        Paint paint = n5Var.f34634c;
        if (fArr != null && fArr.length >= 18) {
            a2 = i0.a.f(fArr[8], n7.a(fArr, 0), n7.a(fArr, 1));
        } else {
            a2 = n7.a(null, 0);
        }
        paint.setColorFilter(new PorterDuffColorFilter(a2, PorterDuff.Mode.SRC_IN));
        n5Var.invalidate();
    }

    public void setUseGyroscope(float f7) {
        if (this.U == f7) {
            return;
        }
        this.U = f7;
        b((this.H * f7) + this.J + this.T, (this.I * f7) + this.K);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
