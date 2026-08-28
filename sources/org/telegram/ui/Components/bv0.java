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
public final class bv0 extends View {
    public int A;
    public String[] B;
    public int[] C;
    public Drawable[] D;
    public int E;
    public int F;
    public float G;
    public final y5 H;
    public final y5 I;
    public av0 J;
    public final org.telegram.ui.ActionBar.b6 K;
    public final zu0 f27286a;
    public final Paint f27287b;
    public final Paint f27288c;
    public final TextPaint d;
    public int f27289e;
    public int f27290f;
    public int h;
    public int f27291n;
    public int f27292r;
    public int f27293s;
    public boolean v;
    public boolean f27294w;
    public float f27295x;
    public float f27296y;

    public bv0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f27293s = -1;
        this.F = Integer.MIN_VALUE;
        gr grVar = gr.f28844f;
        this.H = new y5(this, 120L, grVar);
        this.I = new y5(this, 150L, grVar);
        this.K = b6Var;
        this.f27287b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f27288c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f27286a = new zu0(this);
    }

    public void setOption(int i9) {
        if (this.E != i9) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.E = i9;
        av0 av0Var = this.J;
        if (av0Var != null) {
            av0Var.h(i9);
        }
        invalidate();
    }

    public final void b(int i9, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.B = strArr;
        this.D = drawableArr;
        this.E = i9;
        this.C = new int[strArr.length];
        int i10 = 0;
        while (true) {
            if (i10 >= this.B.length) {
                break;
            }
            this.C[i10] = (int) Math.ceil(this.d.measureText(strArr2[i10]));
            i10++;
        }
        Drawable[] drawableArr2 = this.D;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        float f12;
        int dp;
        int dp2;
        int i10;
        Canvas canvas2 = canvas;
        float d = this.H.d(this.E, false);
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (this.v) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d9 = this.I.d(f10, false);
        int i11 = 2;
        int dp3 = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i12 = 0;
        while (true) {
            int length = this.B.length;
            org.telegram.ui.ActionBar.b6 b6Var2 = this.K;
            Paint paint = this.f27287b;
            if (i12 < length) {
                int i13 = this.f27291n;
                int i14 = (this.h * 2) + this.f27292r;
                int i15 = this.f27290f;
                int i16 = (i15 / i11) + ((i14 + i15) * i12) + i13;
                float f15 = i12;
                float f16 = f15 - d;
                float max = Math.max(f13, f14 - Math.abs(f16));
                float a2 = g7.n.a((d - f15) + f14, f13, f14);
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.M6, b6Var2);
                int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N6, b6Var2);
                int i17 = this.F;
                if (i17 != Integer.MIN_VALUE && i12 <= i17) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                int d10 = i0.a.d(a2, v02, org.telegram.ui.ActionBar.f6.l1(f11, v03));
                paint.setColor(d10);
                Paint paint2 = this.f27288c;
                paint2.setColor(d10);
                float f17 = dp3;
                canvas2.drawCircle(i16, f17, AndroidUtilities.lerp(this.f27290f / 2, AndroidUtilities.dp(6.0f), max), paint);
                if (i12 != 0) {
                    int i18 = (i16 - (this.f27290f / 2)) - this.h;
                    int i19 = this.f27292r;
                    int i20 = i18 - i19;
                    int i21 = this.f27293s;
                    if (i21 != -1 && i12 - 1 >= i21) {
                        int dp4 = AndroidUtilities.dp(3.0f) + i20;
                        int dp5 = (i19 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                        if (this.f27289e != dp5) {
                            i10 = dp4;
                            i9 = i16;
                            paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), org.telegram.messenger.ll.A(8.0f, dp5, dp2) / ((float) (dp5 - 1))}, 0.0f));
                            this.f27289e = dp5;
                        } else {
                            i10 = dp4;
                            i9 = i16;
                        }
                        b6Var = b6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(AndroidUtilities.dp(1.0f) + i10, f17, (i10 + dp2) - AndroidUtilities.dp(1.0f), f17, paint2);
                    } else {
                        i9 = i16;
                        b6Var = b6Var2;
                        float f18 = f16 - 1.0f;
                        float a3 = g7.n.a(1.0f - Math.abs(f18), 0.0f, 1.0f);
                        int dp6 = (int) (i19 - (AndroidUtilities.dp(3.0f) * g7.n.a(1.0f - Math.min(Math.abs(f16), Math.abs(f18)), 0.0f, 1.0f)));
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a3) + i20), dp3 - AndroidUtilities.dp(1.0f), dp6 + dp, AndroidUtilities.dp(1.0f) + dp3, paint);
                    }
                } else {
                    i9 = i16;
                    b6Var = b6Var2;
                }
                int i22 = this.C[i12];
                String str = this.B[i12];
                int d11 = i0.a.d(max, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(d11);
                if (this.D != null) {
                    canvas2.save();
                    if (i12 == 0) {
                        canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                    } else if (i12 == this.B.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i22) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    } else {
                        canvas2.translate((i9 - (i22 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    }
                    this.D[i12].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.D[i12].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.D[i12].getIntrinsicWidth() / 2.0f;
                    if (i12 == 0) {
                        f12 = 3.0f;
                    } else {
                        f12 = 2.0f;
                    }
                    canvas2.translate(intrinsicWidth - AndroidUtilities.dp(f12), 0.0f);
                }
                if (i12 == 0) {
                    canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else if (i12 == this.B.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i22) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i9 - (i22 / 2), AndroidUtilities.dp(28.0f), textPaint);
                }
                if (this.D != null) {
                    canvas2.restore();
                }
                i12++;
                f13 = 0.0f;
                f14 = 1.0f;
                i11 = 2;
            } else {
                int i23 = (this.h * 2) + this.f27292r;
                int i24 = this.f27290f;
                float f19 = ((i23 + i24) * d) + this.f27291n + (i24 / 2);
                int i25 = org.telegram.ui.ActionBar.f6.N6;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i25, b6Var2), 80));
                float f20 = dp3;
                canvas2.drawCircle(f19, f20, AndroidUtilities.dp(d9 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(i25, b6Var2));
                canvas2.drawCircle(f19, f20, AndroidUtilities.dp(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f27286a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.f27290f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.f27291n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f27290f;
        String[] strArr = this.B;
        this.f27292r = (((measuredWidth - (i11 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f27291n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        boolean z10;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float a2 = g7.n.a(((this.f27290f / 2.0f) + (x10 - this.f27291n)) / (((this.h * 2) + this.f27292r) + i9), 0.0f, this.B.length - 1);
        if (Math.abs(a2 - Math.round(a2)) < 0.35f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 = Math.round(a2);
        }
        int i10 = this.F;
        if (i10 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.f27295x = x10;
            this.f27296y = y10;
            this.G = a2;
            this.A = this.E;
            this.f27294w = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.f27295x - x10) > Math.abs(this.f27296y - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f27294w && Math.abs(this.f27295x - x10) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.f27294w = false;
            }
            if (this.v) {
                this.G = a2;
                invalidate();
                if (Math.round(this.G) != this.E && z10) {
                    setOption(Math.round(this.G));
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        } else {
            if (!this.v) {
                this.G = a2;
                if (motionEvent.getAction() == 1 && Math.round(this.G) != this.E) {
                    setOption(Math.round(this.G));
                }
            } else {
                int i11 = this.E;
                if (i11 != this.A) {
                    setOption(i11);
                }
            }
            av0 av0Var = this.J;
            if (av0Var != null) {
                av0Var.m();
            }
            this.f27294w = false;
            this.v = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (!super.performAccessibilityAction(i9, bundle) && !this.f27286a.g(this, i9, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(av0 av0Var) {
        this.J = av0Var;
    }

    public void setDashedFrom(int i9) {
        this.f27293s = i9;
    }

    public void setMinAllowedIndex(int i9) {
        String[] strArr;
        if (i9 != -1 && (strArr = this.B) != null) {
            i9 = Math.min(i9, strArr.length - 1);
        }
        if (this.F != i9) {
            this.F = i9;
            if (this.E < i9) {
                this.E = i9;
            }
            invalidate();
        }
    }
}
