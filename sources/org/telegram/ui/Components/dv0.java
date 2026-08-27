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

public final class dv0 extends View {
    public int A;
    public String[] B;
    public int[] C;
    public Drawable[] D;
    public int E;
    public int F;
    public float G;
    public final y5 H;
    public final y5 I;
    public cv0 J;
    public final org.telegram.ui.ActionBar.c6 K;

    public final bv0 f27845a;

    public final Paint f27846b;

    public final Paint f27847c;
    public final TextPaint d;

    public int f27848e;

    public int f27849f;
    public int h;

    public int f27850n;

    public int f27851r;

    public int f27852s;
    public boolean v;

    public boolean f27853w;

    public float f27854x;

    public float f27855y;

    public dv0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27852s = -1;
        this.F = Integer.MIN_VALUE;
        er erVar = er.f28122f;
        this.H = new y5(this, 120L, erVar);
        this.I = new y5(this, 150L, erVar);
        this.K = c6Var;
        this.f27846b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f27847c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f27845a = new bv0(this);
    }

    public void setOption(int i10) {
        if (this.E != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.E = i10;
        cv0 cv0Var = this.J;
        if (cv0Var != null) {
            cv0Var.j(i10);
        }
        invalidate();
    }

    public final void b(int i10, Drawable[] drawableArr, String... strArr) {
        this.B = strArr;
        this.D = drawableArr;
        this.E = i10;
        this.C = new int[strArr.length];
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.B;
            if (i11 >= strArr2.length) {
                break;
            }
            this.C[i11] = (int) Math.ceil(this.d.measureText(strArr2[i11]));
            i11++;
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
        Canvas canvas2 = canvas;
        float fD = this.H.d(this.E, false);
        float f10 = 0.0f;
        float f11 = 1.0f;
        float fD2 = this.I.d(this.v ? 1.0f : 0.0f, false);
        int i10 = 2;
        int iDp = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i11 = 0;
        while (true) {
            int length = this.B.length;
            org.telegram.ui.ActionBar.c6 c6Var = this.K;
            Paint paint = this.f27846b;
            if (i11 >= length) {
                float f12 = this.f27850n;
                int i12 = (this.h * 2) + this.f27851r;
                int i13 = this.f27849f;
                float f13 = ((i12 + i13) * fD) + f12 + (i13 / 2);
                int i14 = org.telegram.ui.ActionBar.g6.N6;
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 80));
                float f14 = iDp;
                canvas2.drawCircle(f13, f14, AndroidUtilities.dp(fD2 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
                canvas2.drawCircle(f13, f14, AndroidUtilities.dp(6.0f), paint);
                return;
            }
            int i15 = this.f27850n;
            int i16 = (this.h * 2) + this.f27851r;
            int i17 = this.f27849f;
            int i18 = (i17 / i10) + ((i16 + i17) * i11) + i15;
            float f15 = i11;
            float f16 = f15 - fD;
            float fMax = Math.max(f10, f11 - Math.abs(f16));
            float fA = h7.n.a((fD - f15) + f11, f10, f11);
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, c6Var);
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
            int i19 = this.F;
            int iD = i0.b.d(fA, iV0, org.telegram.ui.ActionBar.g6.l1((i19 == Integer.MIN_VALUE || i11 > i19) ? 1.0f : 0.5f, iV1));
            paint.setColor(iD);
            Paint paint2 = this.f27847c;
            paint2.setColor(iD);
            float f17 = iDp;
            canvas2.drawCircle(i18, f17, AndroidUtilities.lerp(this.f27849f / 2, AndroidUtilities.dp(6.0f), fMax), paint);
            if (i11 != 0) {
                int i20 = (i18 - (this.f27849f / 2)) - this.h;
                int i21 = this.f27851r;
                int i22 = i20 - i21;
                int i23 = this.f27852s;
                if (i23 == -1 || i11 - 1 < i23) {
                    i18 = i18;
                    float f18 = f16 - 1.0f;
                    float fA2 = h7.n.a(1.0f - Math.abs(f18), 0.0f, 1.0f);
                    int iDp2 = (int) (i21 - (AndroidUtilities.dp(3.0f) * h7.n.a(1.0f - Math.min(Math.abs(f16), Math.abs(f18)), 0.0f, 1.0f)));
                    int iDp3 = (int) ((AndroidUtilities.dp(3.0f) * fA2) + i22);
                    canvas2 = canvas;
                    canvas2.drawRect(iDp3, iDp - AndroidUtilities.dp(1.0f), iDp2 + iDp3, AndroidUtilities.dp(1.0f) + iDp, paint);
                } else {
                    int iDp4 = AndroidUtilities.dp(3.0f) + i22;
                    int iDp5 = i21 - AndroidUtilities.dp(3.0f);
                    int iDp6 = iDp5 / AndroidUtilities.dp(13.0f);
                    if (this.f27848e != iDp6) {
                        paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), org.telegram.messenger.rl.z(8.0f, iDp6, iDp5) / (iDp6 - 1)}, 0.0f));
                        this.f27848e = iDp6;
                    }
                    float fDp = AndroidUtilities.dp(1.0f) + iDp4;
                    float fDp2 = (iDp4 + iDp5) - AndroidUtilities.dp(1.0f);
                    canvas2 = canvas;
                    canvas2.drawLine(fDp, f17, fDp2, f17, paint2);
                }
            } else {
                i18 = i18;
            }
            int i24 = this.C[i11];
            String str = this.B[i11];
            int iD2 = i0.b.d(fMax, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
            TextPaint textPaint = this.d;
            textPaint.setColor(iD2);
            if (this.D != null) {
                canvas2.save();
                if (i11 == 0) {
                    canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i11 == this.B.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i24) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas2.translate((i18 - (i24 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.D[i11].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.D[i11].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate((this.D[i11].getIntrinsicWidth() / 2.0f) - AndroidUtilities.dp(i11 == 0 ? 3.0f : 2.0f), 0.0f);
            }
            if (i11 == 0) {
                canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else if (i11 == this.B.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i24) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i18 - (i24 / 2), AndroidUtilities.dp(28.0f), textPaint);
            }
            if (this.D != null) {
                canvas2.restore();
            }
            i11++;
            f10 = 0.0f;
            f11 = 1.0f;
            i10 = 2;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f27845a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.f27849f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.f27850n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f27849f;
        String[] strArr = this.B;
        this.f27851r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f27850n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float f10 = x8 - this.f27850n;
        int i10 = this.f27849f;
        float fA = h7.n.a(((i10 / 2.0f) + f10) / (((this.h * 2) + this.f27851r) + i10), 0.0f, this.B.length - 1);
        boolean z10 = Math.abs(fA - ((float) Math.round(fA))) < 0.35f;
        if (z10) {
            fA = Math.round(fA);
        }
        int i11 = this.F;
        if (i11 != Integer.MIN_VALUE) {
            fA = Math.max(fA, i11);
        }
        if (motionEvent.getAction() == 0) {
            this.f27854x = x8;
            this.f27855y = y10;
            this.G = fA;
            this.A = this.E;
            this.f27853w = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.f27854x - x8) > Math.abs(this.f27855y - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f27853w && Math.abs(this.f27854x - x8) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.f27853w = false;
            }
            if (this.v) {
                this.G = fA;
                invalidate();
                if (Math.round(this.G) != this.E && z10) {
                    setOption(Math.round(this.G));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.v) {
            int i12 = this.E;
            if (i12 != this.A) {
                setOption(i12);
            }
        } else {
            this.G = fA;
            if (motionEvent.getAction() == 1 && Math.round(this.G) != this.E) {
                setOption(Math.round(this.G));
            }
        }
        cv0 cv0Var = this.J;
        if (cv0Var != null) {
            cv0Var.m();
        }
        this.f27853w = false;
        this.v = false;
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.f27845a.g(this, i10, bundle);
    }

    public void setCallback(cv0 cv0Var) {
        this.J = cv0Var;
    }

    public void setDashedFrom(int i10) {
        this.f27852s = i10;
    }

    public void setMinAllowedIndex(int i10) {
        String[] strArr;
        if (i10 != -1 && (strArr = this.B) != null) {
            i10 = Math.min(i10, strArr.length - 1);
        }
        if (this.F != i10) {
            this.F = i10;
            if (this.E < i10) {
                this.E = i10;
            }
            invalidate();
        }
    }
}
