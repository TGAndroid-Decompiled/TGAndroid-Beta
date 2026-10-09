package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import ci.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
public final class c5 extends FrameLayout implements SensorEventListener {
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
    public final org.telegram.ui.Cells.t6 W;
    public final boolean f34749a;
    public final ai.x7 f34750b;
    public final b5 f34751c;
    public final a5 d;
    public final FrameLayout f34752e;
    public final m.q3 f34753f;
    public final float[] h;
    public final SensorManager f34754n;
    public final Sensor f34755r;
    public final boolean f34756s;
    public final float[] v;
    public final float[] f34757w;
    public final l5 f34758x;
    public final int f34759y;

    public c5(int i10, int i11, Context context, boolean z10) {
        super(context);
        this.f34753f = new m.q3();
        this.h = new float[8];
        this.v = new float[9];
        this.f34757w = new float[3];
        this.f34758x = new Object();
        this.E = -0.22f;
        this.F = -0.28f;
        this.U = 1.0f;
        this.W = new org.telegram.ui.Cells.t6(this, 29);
        this.f34749a = z10;
        boolean z11 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        w7.z5.b(this, 0.02f, 1.2f);
        ai.x7 x7Var = new ai.x7(context, 9);
        this.f34750b = x7Var;
        addView(x7Var, w7.x5.e(-1, -1, 17));
        b5 b5Var = new b5(context);
        this.f34751c = b5Var;
        x7Var.addView(b5Var, w7.x5.e(-1, -1, 17));
        a5 a5Var = new a5(context, i10, i11);
        this.d = a5Var;
        x7Var.addView(a5Var, w7.x5.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34752e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        x7Var.addView(frameLayout, w7.x5.e(336, 205, 51));
        this.f34759y = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f34754n = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34755r = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z11 = true;
        }
        this.f34756s = z11;
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
        bi.l(1.2f, this.R);
        this.R.addUpdateListener(new ya(this, f7, f10, 6));
        this.R.addListener(new w4(this, 1));
        this.R.start();
    }

    public final void b(float f7, float f10) {
        float f11;
        float f12;
        this.S = f7;
        this.V = f10;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            f11 = f7;
            f12 = f10;
            this.f34753f.c(width, height, f11, f12, false, this.h);
            ai.x7 x7Var = this.f34750b;
            int width2 = x7Var.getWidth();
            int height2 = x7Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr = (float[]) x7Var.d;
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
                ((Matrix) x7Var.f1911b).setPolyToPoly(fArr, 0, this.h, 0, 4);
                x7Var.invalidate();
            }
        } else {
            f11 = f7;
            f12 = f10;
        }
        b5 b5Var = this.f34751c;
        Matrix matrix = b5Var.f34654b;
        if (b5Var.d != null) {
            matrix.setRotate(((2.0f * f12) - (1.25f * f11)) - 69.01f, b5Var.f34656e, b5Var.f34657f);
            b5Var.d.setLocalMatrix(matrix);
            b5Var.invalidate();
        }
        a5 a5Var = this.d;
        a5Var.H = f11;
        a5Var.I = f12;
        a5Var.invalidate();
    }

    public float getCardRotationX() {
        return this.S;
    }

    public float getCardRotationY() {
        return this.V;
    }

    public FrameLayout getFrontFace() {
        return this.f34752e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34749a) {
            return;
        }
        this.Q = 0L;
        l5 l5Var = this.f34758x;
        l5Var.f35175a = false;
        l5Var.h = 0L;
        l5Var.f35181i = 0L;
        l5Var.f35182j = 0L;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        Sensor sensor = this.f34755r;
        if (sensor != null) {
            this.f34754n.registerListener(this, sensor, 1);
        }
        org.telegram.ui.Cells.t6 t6Var = this.W;
        removeCallbacks(t6Var);
        postOnAnimation(t6Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34754n.unregisterListener(this);
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
        if (this.f34756s) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.v;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.f34757w;
            SensorManager.getOrientation(fArr2, fArr3);
            this.E = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.F = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            long j3 = this.Q;
            if (j3 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j3)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.E = c(this.E - ((sensorEvent.values[1] * f7) * 0.75f), -0.82f, 0.82f);
                    this.F = c(com.google.android.gms.internal.vision.e2.w(sensorEvent.values[0], f7, 0.75f, this.F), -0.82f, 0.82f);
                }
            }
            this.Q = sensorEvent.timestamp;
        }
        long j10 = sensorEvent.timestamp;
        this.f34758x.a(((-this.F) / 0.82f) * 15.0f, (this.E / 0.82f) * 15.0f, j10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = i10 / AndroidUtilities.dp(336.0f);
        FrameLayout frameLayout = this.f34752e;
        frameLayout.setScaleX(dp);
        frameLayout.setScaleY(i11 / AndroidUtilities.dp(205.0f));
        b(this.S, this.V);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f34749a) {
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
                    float f7 = this.f34759y;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.M) > f7) {
                        this.P = true;
                        setPressed(false);
                    }
                    if (this.P) {
                        float b10 = com.google.android.gms.internal.vision.e2.b(motionEvent.getX(), this.L, 0.03f, this.O);
                        float f10 = this.O;
                        this.K = c(b10, f10 - 32.0f, f10 + 32.0f);
                        float b11 = com.google.android.gms.internal.vision.e2.b(motionEvent.getY(), this.M, 0.03f, this.N);
                        float f11 = this.N;
                        this.J = c(b11, f11 - 22.0f, f11 + 22.0f);
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
            postDelayed(new m(this, 9), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
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
        a5 a5Var = this.d;
        Drawable drawable = a5Var.getContext().getDrawable(i10);
        a5Var.f34627x = drawable;
        if (drawable != null) {
            a5Var.f34627x = drawable.mutate();
        }
        a5Var.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        a5 a5Var = this.d;
        a5Var.F = bitmap;
        a5Var.invalidate();
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
