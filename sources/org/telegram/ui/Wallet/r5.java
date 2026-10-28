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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.t00;
import org.telegram.ui.hc1;
public final class r5 extends FrameLayout implements SensorEventListener {
    public static final Object f37189n0 = new Object();
    public final float[] E;
    public final float[] F;
    public final y5 G;
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
    public boolean f37190a;
    public boolean f37191a0;
    public n5 f37192b;
    public ValueAnimator f37193b0;
    public int f37194c;
    public float f37195c0;
    public u2 d;
    public float f37196d0;
    public final t00 e;
    public float f37197e0;
    public final di.l1 f37198f;
    public float f37199f0;
    public float f37200g0;
    public final fi.f6 h;
    public float f37201h0;
    public int f37202i0;
    public int f37203j0;
    public final dy0 f37204k0;
    public float f37205l0;
    public float m0;
    public final q5 f37206n;
    public final p5 f37207r;
    public final m.r3 f37208s;
    public final float[] v;
    public final SensorManager f37209w;
    public final Sensor f37210x;
    public final boolean f37211y;

    public r5(Context context, int i10, int i11) {
        super(context);
        this.f37208s = new m.r3();
        this.v = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new Object();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.f37197e0 = 1.0f;
        this.f37200g0 = Float.NaN;
        this.f37201h0 = Float.NaN;
        this.f37204k0 = new dy0(this, 7);
        this.f37194c = i10;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        kb1.c(this, 0.02f, 1.2f);
        t00 t00Var = new t00(this, context);
        this.e = t00Var;
        addView(t00Var, kb1.i(-1, -1, 17));
        di.l1 l1Var = new di.l1(context, 1);
        this.f37198f = l1Var;
        l1Var.setPadding(2, 2, 2, 2);
        l1Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        t00Var.addView(l1Var, layoutParams);
        fi.f6 f6Var = new fi.f6(this, context);
        this.h = f6Var;
        l1Var.addView(f6Var, kb1.i(-1, -1, 17));
        q5 q5Var = new q5(this, context);
        this.f37206n = q5Var;
        l1Var.addView(q5Var, kb1.i(-1, -1, 17));
        p5 p5Var = new p5(this, context, 0);
        this.f37207r = p5Var;
        p5Var.setClipChildren(false);
        p5Var.setClipToPadding(false);
        p5Var.setLayerType(2, null);
        p5Var.setPivotX(0.0f);
        p5Var.setPivotY(0.0f);
        l1Var.addView(p5Var, kb1.i(336, 205, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f37209w = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.f37210x = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.f37211y = z10;
        o5 o5Var = new o5(this, 1);
        if (n5.f37015j0 && n5.f37020p0.get(Integer.valueOf(i10)) != null) {
            this.f37192b = new n5(context.getApplicationContext(), i10, i11, o5Var);
            return;
        }
        t00Var.setVisibility(4);
        n5.f37017l0.postRunnable(new hi.v4(this, context, i10, i11, o5Var));
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f37193b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f37193b0.cancel();
            this.f37193b0 = null;
        }
        float f7 = this.N;
        float f10 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37193b0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.ui.d3.m(1.2f, this.f37193b0);
        this.f37193b0.addUpdateListener(new fi.fa(this, f7, f10, 6));
        this.f37193b0.addListener(new hc1(this, 9));
        this.f37193b0.start();
    }

    public final void b(float f7, float f10) {
        boolean z10;
        float[] fArr;
        this.f37195c0 = f7;
        this.f37199f0 = f10;
        float f11 = f7 + this.f37205l0;
        float f12 = f10 + this.m0;
        if (Math.cos(Math.toRadians(f12)) * Math.cos(Math.toRadians(f11)) < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f37190a;
        q5 q5Var = this.f37206n;
        if (z11 != z10) {
            this.f37190a = z10;
            this.f37207r.invalidate();
            q5Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f37200g0 == f11 && this.f37201h0 == f12 && this.f37202i0 == width && this.f37203j0 == height) {
            return;
        }
        this.f37200g0 = f11;
        this.f37201h0 = f12;
        this.f37202i0 = width;
        this.f37203j0 = height;
        if (width > 0 && height > 0) {
            this.f37208s.c(width, height, f11, f12, z10, this.v);
            n5 n5Var = this.f37192b;
            if (n5Var != null) {
                float[] fArr2 = n5Var.f37040n;
                float[] fArr3 = n5Var.f37039m;
                float[] fArr4 = n5Var.f37037k;
                float[] fArr5 = n5Var.f37038l;
                int[] iArr = n5Var.f37041o;
                n5Var.f37044r = z10;
                float[] fArr6 = n5Var.f37034i;
                if (z10) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                }
                if (!z10) {
                    fArr4 = fArr5;
                }
                m.r3 r3Var = this.f37208s;
                r3Var.getClass();
                int i10 = 0;
                while (i10 < fArr6.length / 2) {
                    int i11 = i10 * 2;
                    float f13 = (fArr6[i11 + 1] * (-1.212122f)) + 0.618561f;
                    float f14 = ((fArr6[i11] * 2.0f) - 1.0f) * 1.0f;
                    float d = r3Var.d(-0.0125f, f13, f14, width, height, fArr, i11);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i10] = (d + r3Var.d(0.0125f, f13, f14, width, height, fArr8, i11)) * 0.5f;
                    i10++;
                    r3Var = r3Var;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                n5Var.f37043q = width / 336.0f;
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
                t00Var.f32796b = ((Matrix) t00Var.f32797c).setPolyToPoly(fArr9, 0, this.v, 0, 4);
                t00Var.invalidate();
            }
        }
        n5 n5Var2 = this.f37192b;
        if (n5Var2 != null) {
            n5Var2.k(f11, f12);
        }
        this.h.invalidate();
        q5Var.invalidate();
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
        SensorManager sensorManager = this.f37209w;
        if (sensorManager != null) {
            if (this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f37191a0 != z10) {
                this.f37191a0 = z10;
                dy0 dy0Var = this.f37204k0;
                removeCallbacks(dy0Var);
                if (z10) {
                    this.V = 0L;
                    Sensor sensor = this.f37210x;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(dy0Var);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.f37195c0;
    }

    public float getCardRotationY() {
        return this.f37199f0;
    }

    public FrameLayout getFrontFace() {
        return this.f37207r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
        this.V = 0L;
        y5 y5Var = this.G;
        y5Var.f37538a = false;
        y5Var.h = 0L;
        y5Var.f37543i = 0L;
        y5Var.f37544j = 0L;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.W = false;
        e();
        ValueAnimator valueAnimator = this.f37193b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f37193b0.cancel();
            this.f37193b0 = null;
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
        if (this.f37211y) {
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
                    this.I = c(org.telegram.ui.d3.A(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = c(c3.h0.u(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.V = sensorEvent.timestamp;
        }
        float f10 = ((-this.J) / 0.82f) * 15.0f;
        float f11 = (this.I / 0.82f) * 15.0f;
        long j11 = sensorEvent.timestamp;
        y5 y5Var = this.G;
        y5Var.getClass();
        if (!Float.isNaN(f10) && !Float.isInfinite(f10) && !Float.isNaN(f11) && !Float.isInfinite(f11)) {
            y5Var.f37539b = f10;
            y5Var.f37540c = f11;
            y5Var.f37543i = j11;
            if (!y5Var.f37538a) {
                y5Var.f37538a = true;
                y5Var.d = f10;
                y5Var.e = f11;
                y5Var.f37541f = f10;
                y5Var.f37542g = f11;
                y5Var.h = j11;
                return;
            }
            float f12 = f10 - y5Var.f37541f;
            float f13 = f11 - y5Var.f37542g;
            if ((f13 * f13) + (f12 * f12) > 1.265625f) {
                y5Var.f37541f = f10;
                y5Var.f37542g = f11;
                y5Var.h = j11;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = i10 / AndroidUtilities.dp(336.0f);
        p5 p5Var = this.f37207r;
        p5Var.setScaleX(dp);
        p5Var.setScaleY(i11 / AndroidUtilities.dp(205.0f));
        b(this.f37195c0, this.f37199f0);
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
                        float x9 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x9 - this.Q);
                        float f7 = this.H;
                        if (abs > f7 || Math.abs(y3 - this.R) > f7) {
                            this.U = true;
                            setPressed(false);
                        }
                        if (this.U) {
                            float f10 = this.T;
                            this.O = c(ic.a.d(x9, this.Q, 0.03f, f10), f10 - 32.0f, f10 + 32.0f);
                            float f11 = this.S;
                            this.N = c(ic.a.d(y3, this.R, 0.03f, f11), f11 - 22.0f, f11 + 22.0f);
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
            postDelayed(new o5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f37193b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f37193b0.cancel();
            this.f37193b0 = null;
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
        float f10 = this.f37196d0;
        if (f10 == f7) {
            return;
        }
        this.f37196d0 = f7;
        b((this.f37195c0 + f7) - f10, this.f37199f0);
    }

    public void setCardIcon(int i10) {
        q5 q5Var = this.f37206n;
        r5 r5Var = q5Var.f37158b;
        r5Var.f37194c = i10;
        n5 n5Var = r5Var.f37192b;
        if (n5Var != null) {
            n5Var.j(i10);
        }
        q5Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        q5 q5Var = this.f37206n;
        q5Var.f37157a = z10;
        q5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        fi.f6 f6Var = this.h;
        f6Var.f10863b = fArr;
        this.e.invalidate();
        f6Var.invalidate();
        this.f37206n.invalidate();
    }

    public void setUseGyroscope(float f7) {
        if (this.f37197e0 == f7) {
            return;
        }
        this.f37197e0 = f7;
        b((this.L * f7) + this.N + this.f37196d0, (this.M * f7) + this.O);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
