package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.lk;
import org.telegram.ui.vf1;
public final class s5 extends FrameLayout implements SensorEventListener {
    public static final Object f34815k0 = new Object();
    public final float[] E;
    public final z5 F;
    public final int G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public boolean T;
    public long U;
    public ValueAnimator V;
    public float W;
    public boolean f34816a;
    public float f34817a0;
    public o5 f34818b;
    public float f34819b0;
    public int f34820c;
    public float f34821c0;
    public u2 d;
    public float f34822d0;
    public final r5 e;
    public float f34823e0;
    public final ei.g6 f34824f;
    public int f34825f0;
    public int f34826g0;
    public final q5 h;
    public final org.telegram.ui.Cells.k7 f34827h0;
    public float f34828i0;
    public float f34829j0;
    public final ah.x f34830n;
    public final m.s3 f34831r;
    public final float[] f34832s;
    public final SensorManager v;
    public final Sensor f34833w;
    public final boolean f34834x;
    public final float[] f34835y;

    public s5(Context context, int i10, int i11) {
        super(context);
        this.f34831r = new m.s3();
        this.f34832s = new float[8];
        this.f34835y = new float[9];
        this.E = new float[3];
        this.F = new Object();
        this.H = -0.22f;
        this.I = -0.28f;
        this.O = -1;
        this.f34819b0 = 1.0f;
        this.f34822d0 = Float.NaN;
        this.f34823e0 = Float.NaN;
        this.f34827h0 = new org.telegram.ui.Cells.k7(this, 28);
        this.f34820c = i10;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        w7.b6.b(this, 0.02f, 1.2f);
        r5 r5Var = new r5(this, context);
        this.e = r5Var;
        addView(r5Var, w7.z5.e(-1, -1, 17));
        ei.g6 g6Var = new ei.g6(this, context);
        this.f34824f = g6Var;
        r5Var.addView(g6Var, w7.z5.e(-1, -1, 17));
        q5 q5Var = new q5(this, context);
        this.h = q5Var;
        r5Var.addView(q5Var, w7.z5.e(-1, -1, 17));
        ah.x xVar = new ah.x(this, context, 29);
        this.f34830n = xVar;
        xVar.setClipChildren(false);
        xVar.setClipToPadding(false);
        xVar.setLayerType(2, null);
        xVar.setPivotX(0.0f);
        xVar.setPivotY(0.0f);
        r5Var.addView(xVar, w7.z5.e(336, 205, 51));
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.v = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f34833w = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.f34834x = z10;
        p5 p5Var = new p5(this, 1);
        if (o5.f34647j0 && o5.f34652p0.get(Integer.valueOf(i10)) != null) {
            this.f34818b = new o5(context.getApplicationContext(), i10, i11, p5Var);
            return;
        }
        r5Var.setVisibility(4);
        o5.f34649l0.postRunnable(new gi.m4(this, context, i10, i11, p5Var));
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
            this.V = null;
        }
        float f7 = this.M;
        float f10 = this.N;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V = ofFloat;
        ofFloat.setDuration(600L);
        lk.l(1.2f, this.V);
        this.V.addUpdateListener(new ja(this, f7, f10, 6));
        this.V.addListener(new vf1(this, 6));
        this.V.start();
    }

    public final void b(float f7, float f10) {
        boolean z10;
        float[] fArr;
        this.W = f7;
        this.f34821c0 = f10;
        float f11 = f7 + this.f34828i0;
        float f12 = f10 + this.f34829j0;
        if (Math.cos(Math.toRadians(f12)) * Math.cos(Math.toRadians(f11)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f34816a;
        q5 q5Var = this.h;
        if (z11 != z10) {
            this.f34816a = z10;
            this.f34830n.invalidate();
            q5Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f34822d0 == f11 && this.f34823e0 == f12 && this.f34825f0 == width && this.f34826g0 == height) {
            return;
        }
        this.f34822d0 = f11;
        this.f34823e0 = f12;
        this.f34825f0 = width;
        this.f34826g0 = height;
        if (width > 0 && height > 0) {
            this.f34831r.c(width, height, f11, f12, z10, this.f34832s);
            o5 o5Var = this.f34818b;
            if (o5Var != null) {
                float[] fArr2 = o5Var.f34672n;
                float[] fArr3 = o5Var.f34671m;
                float[] fArr4 = o5Var.f34669k;
                float[] fArr5 = o5Var.f34670l;
                int[] iArr = o5Var.f34673o;
                o5Var.f34676r = z10;
                float[] fArr6 = o5Var.f34666i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                m.s3 s3Var = this.f34831r;
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
                o5Var.f34675q = width / 336.0f;
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
            r5 r5Var = this.e;
            int width2 = r5Var.getWidth();
            int height2 = r5Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = r5Var.d;
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
                r5Var.f34780b = r5Var.f34779a.setPolyToPoly(fArr9, 0, this.f34832s, 0, 4);
                r5Var.invalidate();
            }
        }
        o5 o5Var2 = this.f34818b;
        if (o5Var2 != null) {
            o5Var2.k(f11, f12);
        }
        this.f34824f.invalidate();
        q5Var.invalidate();
    }

    public final void d(int i10, MotionEvent motionEvent) {
        this.O = motionEvent.getPointerId(i10);
        this.P = motionEvent.getX(i10);
        this.Q = motionEvent.getY(i10);
        this.R = this.M;
        this.S = this.N;
    }

    public float getCardRotationX() {
        return this.W;
    }

    public float getCardRotationY() {
        return this.f34821c0;
    }

    public FrameLayout getFrontFace() {
        return this.f34830n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = 0L;
        z5 z5Var = this.F;
        z5Var.f35178a = false;
        z5Var.h = 0L;
        z5Var.f35183i = 0L;
        z5Var.f35184j = 0L;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        Sensor sensor = this.f34833w;
        if (sensor != null) {
            this.v.registerListener(this, sensor, 1);
        }
        org.telegram.ui.Cells.k7 k7Var = this.f34827h0;
        removeCallbacks(k7Var);
        postOnAnimation(k7Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.v.unregisterListener(this);
        removeCallbacks(this.f34827h0);
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
            this.V = null;
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
        if (this.f34834x) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.f34835y;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.E;
            SensorManager.getOrientation(fArr2, fArr3);
            this.H = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.I = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            long j10 = this.U;
            if (j10 != 0) {
                float f7 = ((float) (sensorEvent.timestamp - j10)) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.H = c(org.telegram.ui.Cells.c1.z(sensorEvent.values[1], f7, 0.75f, this.H), -0.82f, 0.82f);
                    this.I = c(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, 0.75f, this.I), -0.82f, 0.82f);
                }
            }
            this.U = sensorEvent.timestamp;
        }
        float f10 = ((-this.I) / 0.82f) * 15.0f;
        float f11 = (this.H / 0.82f) * 15.0f;
        long j11 = sensorEvent.timestamp;
        z5 z5Var = this.F;
        z5Var.getClass();
        if (!Float.isNaN(f10) && !Float.isInfinite(f10) && !Float.isNaN(f11) && !Float.isInfinite(f11)) {
            z5Var.f35179b = f10;
            z5Var.f35180c = f11;
            z5Var.f35183i = j11;
            if (!z5Var.f35178a) {
                z5Var.f35178a = true;
                z5Var.d = f10;
                z5Var.e = f11;
                z5Var.f35181f = f10;
                z5Var.f35182g = f11;
                z5Var.h = j11;
                return;
            }
            float f12 = f10 - z5Var.f35181f;
            float f13 = f11 - z5Var.f35182g;
            if ((f13 * f13) + (f12 * f12) > 1.265625f) {
                z5Var.f35181f = f10;
                z5Var.f35182g = f11;
                z5Var.h = j11;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = i10 / AndroidUtilities.dp(336.0f);
        ah.x xVar = this.f34830n;
        xVar.setScaleX(dp);
        xVar.setScaleY(i11 / AndroidUtilities.dp(205.0f));
        b(this.W, this.f34821c0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.O) {
                                for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
                                    if (i10 != motionEvent.getActionIndex()) {
                                        d(i10, motionEvent);
                                        return true;
                                    }
                                }
                            }
                        } else {
                            d(motionEvent.getActionIndex(), motionEvent);
                            this.T = true;
                            setPressed(false);
                            return true;
                        }
                    } else {
                        this.O = -1;
                        getParent().requestDisallowInterceptTouchEvent(false);
                        setPressed(false);
                        if (this.T) {
                            a();
                            return true;
                        }
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.O);
                    if (findPointerIndex >= 0) {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x10 - this.P);
                        float f7 = this.G;
                        if (abs > f7 || Math.abs(y3 - this.Q) > f7) {
                            this.T = true;
                            setPressed(false);
                        }
                        if (this.T) {
                            float f10 = this.S;
                            this.N = c(com.google.android.gms.internal.play_billing.k3.D(x10, this.P, 0.03f, f10), f10 - 32.0f, f10 + 32.0f);
                            float f11 = this.R;
                            this.M = c(com.google.android.gms.internal.play_billing.k3.D(y3, this.Q, 0.03f, f11), f11 - 22.0f, f11 + 22.0f);
                        }
                    }
                }
                return true;
            }
            this.O = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.T) {
                a();
                return true;
            }
            postDelayed(new p5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
            this.V = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        d(0, motionEvent);
        this.T = false;
        setPressed(true);
        return true;
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f7) {
        float f10 = this.f34817a0;
        if (f10 == f7) {
            return;
        }
        this.f34817a0 = f7;
        b((this.W + f7) - f10, this.f34821c0);
    }

    public void setCardIcon(int i10) {
        q5 q5Var = this.h;
        s5 s5Var = q5Var.e;
        s5Var.f34820c = i10;
        o5 o5Var = s5Var.f34818b;
        if (o5Var != null) {
            o5Var.j(i10);
        }
        q5Var.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        q5 q5Var = this.h;
        q5Var.d = bitmap;
        q5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        ei.g6 g6Var = this.f34824f;
        g6Var.f9070b = fArr;
        this.e.invalidate();
        g6Var.invalidate();
        q5 q5Var = this.h;
        q5Var.f34748a.setColorFilter(new PorterDuffColorFilter(h7.b(fArr), PorterDuff.Mode.SRC_IN));
        q5Var.invalidate();
    }

    public void setUseGyroscope(float f7) {
        if (this.f34819b0 == f7) {
            return;
        }
        this.f34819b0 = f7;
        b((this.K * f7) + this.M + this.f34817a0, (this.L * f7) + this.N);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
