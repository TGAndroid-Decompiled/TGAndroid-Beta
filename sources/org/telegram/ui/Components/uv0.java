package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class uv0 extends View {
    public int B;
    public String[] C;
    public int[] D;
    public Drawable[] E;
    public int F;
    public int G;
    public float H;
    public final z5 I;
    public final z5 J;
    public tv0 K;
    public final org.telegram.ui.ActionBar.g6 L;
    public final sv0 f31692a;
    public final Paint f31693b;
    public final Paint f31694c;
    public final TextPaint d;
    public int f31695e;
    public int f31696f;
    public int h;
    public int f31697n;
    public int f31698r;
    public int f31699s;
    public boolean v;
    public boolean f31700w;
    public float f31701x;
    public float f31702y;

    public uv0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f31699s = -1;
        this.G = Integer.MIN_VALUE;
        pr prVar = pr.f30168f;
        this.I = new z5(this, 120L, prVar);
        this.J = new z5(this, 150L, prVar);
        this.L = g6Var;
        this.f31693b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f31694c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f31692a = new sv0(this);
    }

    public void setOption(int i10) {
        if (this.F != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.F = i10;
        tv0 tv0Var = this.K;
        if (tv0Var != null) {
            tv0Var.i(i10);
        }
        invalidate();
    }

    public final void b(int i10, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.C = strArr;
        this.E = drawableArr;
        this.F = i10;
        this.D = new int[strArr.length];
        int i11 = 0;
        while (true) {
            if (i11 >= this.C.length) {
                break;
            }
            this.D[i11] = (int) Math.ceil(this.d.measureText(strArr2[i11]));
            i11++;
        }
        Drawable[] drawableArr2 = this.E;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.F;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        float f12;
        int dp;
        int dp2;
        int i11;
        Canvas canvas2 = canvas;
        float d = this.I.d(this.F, false);
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (this.v) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d10 = this.J.d(f10, false);
        int i12 = 2;
        int dp3 = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.C.length;
            org.telegram.ui.ActionBar.g6 g6Var2 = this.L;
            Paint paint = this.f31693b;
            if (i13 < length) {
                int i14 = this.f31697n;
                int i15 = (this.h * 2) + this.f31698r;
                int i16 = this.f31696f;
                int i17 = (i16 / i12) + ((i15 + i16) * i13) + i14;
                float f15 = i13;
                float f16 = f15 - d;
                float max = Math.max(f13, f14 - Math.abs(f16));
                float a2 = k7.o.a((d - f15) + f14, f13, f14);
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.M6, g6Var2);
                int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.N6, g6Var2);
                int i18 = this.G;
                if (i18 != Integer.MIN_VALUE && i13 <= i18) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                int d11 = i0.a.d(a2, v02, org.telegram.ui.ActionBar.k6.l1(f11, v03));
                paint.setColor(d11);
                Paint paint2 = this.f31694c;
                paint2.setColor(d11);
                float f17 = dp3;
                canvas2.drawCircle(i17, f17, AndroidUtilities.lerp(this.f31696f / 2, AndroidUtilities.dp(6.0f), max), paint);
                if (i13 != 0) {
                    int i19 = (i17 - (this.f31696f / 2)) - this.h;
                    int i20 = this.f31698r;
                    int i21 = i19 - i20;
                    int i22 = this.f31699s;
                    if (i22 != -1 && i13 - 1 >= i22) {
                        int dp4 = AndroidUtilities.dp(3.0f) + i21;
                        int dp5 = (i20 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                        if (this.f31695e != dp5) {
                            i11 = dp4;
                            i10 = i17;
                            paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), org.telegram.ui.b.z(8.0f, dp5, dp2) / ((float) (dp5 - 1))}, 0.0f));
                            this.f31695e = dp5;
                        } else {
                            i11 = dp4;
                            i10 = i17;
                        }
                        g6Var = g6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(AndroidUtilities.dp(1.0f) + i11, f17, (i11 + dp2) - AndroidUtilities.dp(1.0f), f17, paint2);
                    } else {
                        i10 = i17;
                        g6Var = g6Var2;
                        float f18 = f16 - 1.0f;
                        float a10 = k7.o.a(1.0f - Math.abs(f18), 0.0f, 1.0f);
                        int dp6 = (int) (i20 - (AndroidUtilities.dp(3.0f) * k7.o.a(1.0f - Math.min(Math.abs(f16), Math.abs(f18)), 0.0f, 1.0f)));
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a10) + i21), dp3 - AndroidUtilities.dp(1.0f), dp6 + dp, AndroidUtilities.dp(1.0f) + dp3, paint);
                    }
                } else {
                    i10 = i17;
                    g6Var = g6Var2;
                }
                int i23 = this.D[i13];
                String str = this.C[i13];
                int d12 = i0.a.d(max, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21841n6, g6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(d12);
                if (this.E != null) {
                    canvas2.save();
                    if (i13 == 0) {
                        canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                    } else if (i13 == this.C.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i23) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    } else {
                        canvas2.translate((i10 - (i23 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    }
                    this.E[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.E[i13].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.E[i13].getIntrinsicWidth() / 2.0f;
                    if (i13 == 0) {
                        f12 = 3.0f;
                    } else {
                        f12 = 2.0f;
                    }
                    canvas2.translate(intrinsicWidth - AndroidUtilities.dp(f12), 0.0f);
                }
                if (i13 == 0) {
                    canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else if (i13 == this.C.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i23) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i10 - (i23 / 2), AndroidUtilities.dp(28.0f), textPaint);
                }
                if (this.E != null) {
                    canvas2.restore();
                }
                i13++;
                f13 = 0.0f;
                f14 = 1.0f;
                i12 = 2;
            } else {
                int i24 = (this.h * 2) + this.f31698r;
                int i25 = this.f31696f;
                float f19 = ((i24 + i25) * d) + this.f31697n + (i25 / 2);
                int i26 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i26, g6Var2), 80));
                float f20 = dp3;
                canvas2.drawCircle(f19, f20, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.k6.v0(i26, g6Var2));
                canvas2.drawCircle(f19, f20, AndroidUtilities.dp(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f31692a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.f31696f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.f31697n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f31696f;
        String[] strArr = this.C;
        this.f31698r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f31697n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z4;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float a2 = k7.o.a(((this.f31696f / 2.0f) + (x10 - this.f31697n)) / (((this.h * 2) + this.f31698r) + i10), 0.0f, this.C.length - 1);
        if (Math.abs(a2 - Math.round(a2)) < 0.35f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a2 = Math.round(a2);
        }
        int i11 = this.G;
        if (i11 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i11);
        }
        if (motionEvent.getAction() == 0) {
            this.f31701x = x10;
            this.f31702y = y10;
            this.H = a2;
            this.B = this.F;
            this.f31700w = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.f31701x - x10) > Math.abs(this.f31702y - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f31700w && Math.abs(this.f31701x - x10) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.f31700w = false;
            }
            if (this.v) {
                this.H = a2;
                invalidate();
                if (Math.round(this.H) != this.F && z4) {
                    setOption(Math.round(this.H));
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        } else {
            if (!this.v) {
                this.H = a2;
                if (motionEvent.getAction() == 1 && Math.round(this.H) != this.F) {
                    setOption(Math.round(this.H));
                }
            } else {
                int i12 = this.F;
                if (i12 != this.B) {
                    setOption(i12);
                }
            }
            tv0 tv0Var = this.K;
            if (tv0Var != null) {
                tv0Var.m();
            }
            this.f31700w = false;
            this.v = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f31692a.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(tv0 tv0Var) {
        this.K = tv0Var;
    }

    public void setDashedFrom(int i10) {
        this.f31699s = i10;
    }

    public void setMinAllowedIndex(int i10) {
        String[] strArr;
        if (i10 != -1 && (strArr = this.C) != null) {
            i10 = Math.min(i10, strArr.length - 1);
        }
        if (this.G != i10) {
            this.G = i10;
            if (this.F < i10) {
                this.F = i10;
            }
            invalidate();
        }
    }
}
