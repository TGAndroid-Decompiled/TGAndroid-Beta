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
public final class zw0 extends View {
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final h6 L;
    public final h6 M;
    public yw0 N;
    public final org.telegram.ui.ActionBar.u6 O;
    public final xw0 f35417a;
    public final Paint f35418b;
    public final Paint f35419c;
    public final TextPaint d;
    public int e;
    public int f35420f;
    public int h;
    public int f35421n;
    public int f35422r;
    public int f35423s;
    public boolean v;
    public boolean f35424w;
    public float f35425x;
    public float f35426y;

    public zw0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f35423s = -1;
        this.J = Integer.MIN_VALUE;
        ds dsVar = ds.f27586f;
        this.L = new h6(this, 120L, dsVar);
        this.M = new h6(this, 150L, dsVar);
        this.O = u6Var;
        this.f35418b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f35419c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f35417a = new xw0(this);
    }

    public void setOption(int i10) {
        if (this.I != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.I = i10;
        yw0 yw0Var = this.N;
        if (yw0Var != null) {
            yw0Var.j(i10);
        }
        invalidate();
    }

    public final void b(int i10, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.F = strArr;
        this.H = drawableArr;
        this.I = i10;
        this.G = new int[strArr.length];
        int i11 = 0;
        while (true) {
            if (i11 >= this.F.length) {
                break;
            }
            this.G[i11] = (int) Math.ceil(this.d.measureText(strArr2[i11]));
            i11++;
        }
        Drawable[] drawableArr2 = this.H;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.I;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        float f11;
        float f12;
        float f13;
        int dp;
        int dp2;
        int i11;
        Canvas canvas2 = canvas;
        char c10 = 0;
        float d = this.L.d(this.I, false);
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (this.v) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d10 = this.M.d(f7, false);
        int i12 = 2;
        int dp3 = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.F.length;
            org.telegram.ui.ActionBar.u6 u6Var2 = this.O;
            Paint paint = this.f35418b;
            if (i13 < length) {
                int i14 = this.f35421n;
                int i15 = (this.h * i12) + this.f35422r;
                int i16 = this.f35420f;
                int i17 = (i16 / i12) + ((i15 + i16) * i13) + i14;
                float f16 = i13;
                float f17 = f16 - d;
                char c11 = c10;
                float max = Math.max(f14, f15 - Math.abs(f17));
                float a2 = a8.ee.a((d - f16) + f15, f14, f15);
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.M6, u6Var2);
                float f18 = f15;
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N6, u6Var2);
                int i18 = this.J;
                int i19 = i12;
                if (i18 != Integer.MIN_VALUE && i13 <= i18) {
                    f10 = 0.5f;
                } else {
                    f10 = f18;
                }
                int f19 = i0.a.f(a2, w02, org.telegram.ui.ActionBar.y6.o1(f10, w03));
                paint.setColor(f19);
                Paint paint2 = this.f35419c;
                paint2.setColor(f19);
                float f20 = dp3;
                canvas2.drawCircle(i17, f20, AndroidUtilities.lerp(this.f35420f / 2, AndroidUtilities.dp(6.0f), max), paint);
                if (i13 != 0) {
                    f11 = 3.0f;
                    int i20 = (i17 - (this.f35420f / 2)) - this.h;
                    int i21 = this.f35422r;
                    int i22 = i20 - i21;
                    int i23 = this.f35423s;
                    if (i23 != -1 && i13 - 1 >= i23) {
                        int dp4 = AndroidUtilities.dp(3.0f) + i22;
                        int dp5 = (i21 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                        if (this.e != dp5) {
                            i11 = dp4;
                            i10 = i17;
                            float[] fArr = new float[i19];
                            fArr[c11] = AndroidUtilities.dp(6.0f);
                            fArr[1] = org.telegram.messenger.vh.C(8.0f, dp5, dp2) / (dp5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.e = dp5;
                        } else {
                            i11 = dp4;
                            i10 = i17;
                        }
                        u6Var = u6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(AndroidUtilities.dp(f18) + i11, f20, (i11 + dp2) - AndroidUtilities.dp(f18), f20, paint2);
                    } else {
                        i10 = i17;
                        u6Var = u6Var2;
                        float f21 = f17 - f18;
                        float a10 = a8.ee.a(f18 - Math.abs(f21), 0.0f, f18);
                        int dp6 = (int) (i21 - (AndroidUtilities.dp(3.0f) * a8.ee.a(f18 - Math.min(Math.abs(f17), Math.abs(f21)), 0.0f, f18)));
                        f18 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a10) + i22), dp3 - AndroidUtilities.dp(1.0f), dp6 + dp, AndroidUtilities.dp(1.0f) + dp3, paint);
                    }
                } else {
                    i10 = i17;
                    u6Var = u6Var2;
                    f11 = 3.0f;
                }
                int i24 = this.G[i13];
                String str = this.F[i13];
                int f22 = i0.a.f(max, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23748y6, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23540n6, u6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(f22);
                if (this.H != null) {
                    canvas2.save();
                    if (i13 == 0) {
                        canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                    } else if (i13 == this.F.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i24) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    } else {
                        canvas2.translate((i10 - (i24 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    }
                    this.H[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.H[i13].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.H[i13].getIntrinsicWidth() / 2.0f;
                    if (i13 == 0) {
                        f13 = f11;
                    } else {
                        f13 = 2.0f;
                    }
                    f12 = 0.0f;
                    canvas2.translate(intrinsicWidth - AndroidUtilities.dp(f13), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                if (i13 == 0) {
                    canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else if (i13 == this.F.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i24) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i10 - (i24 / 2), AndroidUtilities.dp(28.0f), textPaint);
                }
                if (this.H != null) {
                    canvas2.restore();
                }
                i13++;
                f14 = f12;
                c10 = c11;
                f15 = f18;
                i12 = 2;
            } else {
                int i25 = (this.h * 2) + this.f35422r;
                int i26 = this.f35420f;
                float f23 = ((i25 + i26) * d) + this.f35421n + (i26 / 2);
                int i27 = org.telegram.ui.ActionBar.y6.N6;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(i27, u6Var2), 80));
                float f24 = dp3;
                canvas2.drawCircle(f23, f24, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(i27, u6Var2));
                canvas2.drawCircle(f23, f24, AndroidUtilities.dp(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35417a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.f35420f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.f35421n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f35420f;
        String[] strArr = this.F;
        this.f35422r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f35421n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float a2 = a8.ee.a(((this.f35420f / 2.0f) + (x9 - this.f35421n)) / (((this.h * 2) + this.f35422r) + i10), 0.0f, this.F.length - 1);
        if (Math.abs(a2 - Math.round(a2)) < 0.35f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 = Math.round(a2);
        }
        int i11 = this.J;
        if (i11 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i11);
        }
        if (motionEvent.getAction() == 0) {
            this.f35425x = x9;
            this.f35426y = y3;
            this.K = a2;
            this.E = this.I;
            this.f35424w = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.f35425x - x9) > Math.abs(this.f35426y - y3)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f35424w && Math.abs(this.f35425x - x9) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.f35424w = false;
            }
            if (this.v) {
                this.K = a2;
                invalidate();
                if (Math.round(this.K) != this.I && z10) {
                    setOption(Math.round(this.K));
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        } else {
            if (!this.v) {
                this.K = a2;
                if (motionEvent.getAction() == 1 && Math.round(this.K) != this.I) {
                    setOption(Math.round(this.K));
                }
            } else {
                int i12 = this.I;
                if (i12 != this.E) {
                    setOption(i12);
                }
            }
            yw0 yw0Var = this.N;
            if (yw0Var != null) {
                yw0Var.m();
            }
            this.f35424w = false;
            this.v = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f35417a.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(yw0 yw0Var) {
        this.N = yw0Var;
    }

    public void setDashedFrom(int i10) {
        this.f35423s = i10;
    }

    public void setMinAllowedIndex(int i10) {
        String[] strArr;
        if (i10 != -1 && (strArr = this.F) != null) {
            i10 = Math.min(i10, strArr.length - 1);
        }
        if (this.J != i10) {
            this.J = i10;
            if (this.I < i10) {
                this.I = i10;
            }
            invalidate();
        }
    }
}
