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
import ei.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.vf1;
public final class o5 extends FrameLayout implements SensorEventListener {
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
    public final boolean f34672a;
    public float f34673a0;
    public final ai.w1 f34674b;
    public float f34675b0;
    public final n5 f34676c;
    public final m5 d;
    public final FrameLayout e;
    public final m.s3 f34677f;
    public final float[] h;
    public final SensorManager f34678n;
    public final Sensor f34679r;
    public final boolean f34680s;
    public final float[] v;
    public final float[] f34681w;
    public final a6 f34682x;
    public final int f34683y;

    public o5(int i10, int i11, Context context, boolean z10) {
        super(context);
        this.f34677f = new m.s3();
        this.h = new float[8];
        this.v = new float[9];
        this.f34681w = new float[3];
        this.f34682x = new Object();
        this.E = -0.22f;
        this.F = -0.28f;
        this.U = 1.0f;
        this.W = new org.telegram.ui.Cells.k7(this, 28);
        this.f34672a = z10;
        boolean z11 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        w7.b6.b(this, 0.02f, 1.2f);
        ai.w1 w1Var = new ai.w1(context, 11);
        this.f34674b = w1Var;
        addView(w1Var, w7.z5.e(-1, -1, 17));
        n5 n5Var = new n5(context);
        this.f34676c = n5Var;
        w1Var.addView(n5Var, w7.z5.e(-1, -1, 17));
        m5 m5Var = new m5(context, i10, i11);
        this.d = m5Var;
        w1Var.addView(m5Var, w7.z5.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        w1Var.addView(frameLayout, w7.z5.e(336, 205, 51));
        this.f34683y = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34678n = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34679r = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z11 = true;
        }
        this.f34680s = z11;
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
        wh.l(1.2f, this.R);
        this.R.addUpdateListener(new ja(this, f7, f10, 6));
        this.R.addListener(new vf1(this, 6));
        this.R.start();
    }

    public final void b(float f7, float f10) {
        this.S = f7;
        this.V = f10;
        float f11 = f7 + this.f34673a0;
        float f12 = f10 + this.f34675b0;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            this.f34677f.c(width, height, f11, f12, false, this.h);
            ai.w1 w1Var = this.f34674b;
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
                ((Matrix) w1Var.f2351b).setPolyToPoly(fArr, 0, this.h, 0, 4);
                w1Var.invalidate();
            }
        }
        n5 n5Var = this.f34676c;
        Matrix matrix = n5Var.f34636b;
        if (n5Var.d != null) {
            matrix.setRotate(((2.0f * f12) - (1.25f * f11)) - 69.01f, n5Var.h, n5Var.f34639n);
            n5Var.d.setLocalMatrix(matrix);
            n5Var.invalidate();
        }
        m5 m5Var = this.d;
        m5Var.H = f11;
        m5Var.I = f12;
        m5Var.invalidate();
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
        if (this.f34672a) {
            return;
        }
        this.Q = 0L;
        a6 a6Var = this.f34682x;
        a6Var.f33987a = false;
        a6Var.h = 0L;
        a6Var.f33992i = 0L;
        a6Var.f33993j = 0L;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        Sensor sensor = this.f34679r;
        if (sensor != null) {
            this.f34678n.registerListener(this, sensor, 1);
        }
        org.telegram.ui.Cells.k7 k7Var = this.W;
        removeCallbacks(k7Var);
        postOnAnimation(k7Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34678n.unregisterListener(this);
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
        if (this.f34680s) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.v;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.f34681w;
            SensorManager.getOrientation(fArr2, fArr3);
            this.E = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.F = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            long j10 = this.Q;
            if (j10 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.E = c(org.telegram.ui.Cells.t0.z(sensorEvent.values[1], f7, 0.75f, this.E), -0.82f, 0.82f);
                    this.F = c(com.google.android.gms.internal.cast.a6.t(sensorEvent.values[0], f7, 0.75f, this.F), -0.82f, 0.82f);
                }
            }
            this.Q = sensorEvent.timestamp;
        }
        long j11 = sensorEvent.timestamp;
        this.f34682x.a(((-this.F) / 0.82f) * 15.0f, (this.E / 0.82f) * 15.0f, j11);
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
        if (this.f34672a) {
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
                    float f7 = this.f34683y;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.M) > f7) {
                        this.P = true;
                        setPressed(false);
                    }
                    if (this.P) {
                        float D = com.google.android.gms.internal.cast.a6.D(motionEvent.getX(), this.L, 0.03f, this.O);
                        float f10 = this.O;
                        this.K = c(D, f10 - 32.0f, f10 + 32.0f);
                        float D2 = com.google.android.gms.internal.cast.a6.D(motionEvent.getY(), this.M, 0.03f, this.N);
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
        m5 m5Var = this.d;
        Drawable drawable = m5Var.getContext().getDrawable(i10);
        m5Var.f34595x = drawable;
        if (drawable != null) {
            m5Var.f34595x = drawable.mutate();
        }
        m5Var.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        m5 m5Var = this.d;
        m5Var.F = bitmap;
        m5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        int a2;
        n5 n5Var = this.f34676c;
        n5Var.e = fArr;
        n5Var.invalidate();
        m5 m5Var = this.d;
        Paint paint = m5Var.f34589c;
        if (fArr != null && fArr.length >= 18) {
            a2 = i0.b.f(fArr[8], k7.a(fArr, 0), k7.a(fArr, 1));
        } else {
            a2 = k7.a(null, 0);
        }
        paint.setColorFilter(new PorterDuffColorFilter(a2, PorterDuff.Mode.SRC_IN));
        m5Var.invalidate();
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
