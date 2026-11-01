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
public final class zu0 extends View {
    public float D;
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final t5 L;
    public final t5 M;
    public yu0 N;
    public final org.telegram.ui.ActionBar.p6 O;
    public final xu0 f33227a;
    public final Paint f33228b;
    public final Paint f33229c;
    public final TextPaint d;
    public int e;
    public int f33230f;
    public int h;
    public int f33231n;
    public int f33232r;
    public int f33233s;
    public boolean f33234w;
    public boolean f33235x;
    public float f33236y;

    public zu0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f33233s = -1;
        this.J = Integer.MIN_VALUE;
        gr grVar = gr.f26523f;
        this.L = new t5(this, 120L, grVar);
        this.M = new t5(this, 150L, grVar);
        this.O = p6Var;
        this.f33228b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f33229c = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        this.f33227a = new xu0(0, this);
    }

    public void setOption(int i10) {
        if (this.I != i10) {
            org.telegram.messenger.i0.b4(this);
        }
        this.I = i10;
        yu0 yu0Var = this.N;
        if (yu0Var != null) {
            yu0Var.m(i10);
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
        org.telegram.ui.ActionBar.p6 p6Var;
        float f11;
        float f12;
        float f13;
        int L;
        int L2;
        int i11;
        Canvas canvas2 = canvas;
        char c10 = 0;
        float e = this.L.e(false, this.I);
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (this.f33234w) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e7 = this.M.e(false, f7);
        int i12 = 2;
        int L3 = org.telegram.messenger.i0.L(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.F.length;
            org.telegram.ui.ActionBar.p6 p6Var2 = this.O;
            Paint paint = this.f33228b;
            if (i13 < length) {
                int i14 = this.f33231n;
                int i15 = (this.h * i12) + this.f33232r;
                int i16 = this.f33230f;
                int i17 = (i16 / i12) + ((i15 + i16) * i13) + i14;
                float f16 = i13;
                float f17 = f16 - e;
                char c11 = c10;
                float max = Math.max(f14, f15 - Math.abs(f17));
                float a2 = w7.u.a((e - f16) + f15, f14, f15);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.M6, p6Var2);
                float f18 = f15;
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.N6, p6Var2);
                int i18 = this.J;
                int i19 = i12;
                if (i18 != Integer.MIN_VALUE && i13 <= i18) {
                    f10 = 0.5f;
                } else {
                    f10 = f18;
                }
                int f19 = i0.b.f(a2, w02, org.telegram.ui.ActionBar.t6.r1(f10, w03));
                paint.setColor(f19);
                Paint paint2 = this.f33229c;
                paint2.setColor(f19);
                float f20 = L3;
                canvas2.drawCircle(i17, f20, org.telegram.messenger.i0.W1(max, this.f33230f / 2, org.telegram.messenger.i0.L(6.0f)), paint);
                if (i13 != 0) {
                    f11 = 3.0f;
                    int i20 = (i17 - (this.f33230f / 2)) - this.h;
                    int i21 = this.f33232r;
                    int i22 = i20 - i21;
                    int i23 = this.f33233s;
                    if (i23 != -1 && i13 - 1 >= i23) {
                        int L4 = org.telegram.messenger.i0.L(3.0f) + i22;
                        int L5 = (i21 - org.telegram.messenger.i0.L(3.0f)) / org.telegram.messenger.i0.L(13.0f);
                        if (this.e != L5) {
                            i11 = L4;
                            i10 = i17;
                            float[] fArr = new float[i19];
                            fArr[c11] = org.telegram.messenger.i0.L(6.0f);
                            fArr[1] = org.telegram.messenger.a30.A(8.0f, L5, L2) / (L5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.e = L5;
                        } else {
                            i11 = L4;
                            i10 = i17;
                        }
                        p6Var = p6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(org.telegram.messenger.i0.L(f18) + i11, f20, (i11 + L2) - org.telegram.messenger.i0.L(f18), f20, paint2);
                    } else {
                        i10 = i17;
                        p6Var = p6Var2;
                        float f21 = f17 - f18;
                        float a10 = w7.u.a(f18 - Math.abs(f21), 0.0f, f18);
                        int L6 = (int) (i21 - (org.telegram.messenger.i0.L(3.0f) * w7.u.a(f18 - Math.min(Math.abs(f17), Math.abs(f21)), 0.0f, f18)));
                        f18 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((org.telegram.messenger.i0.L(3.0f) * a10) + i22), L3 - org.telegram.messenger.i0.L(1.0f), L6 + L, org.telegram.messenger.i0.L(1.0f) + L3, paint);
                    }
                } else {
                    i10 = i17;
                    p6Var = p6Var2;
                    f11 = 3.0f;
                }
                int i24 = this.G[i13];
                String str = this.F[i13];
                int f22 = i0.b.f(max, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(f22);
                if (this.H != null) {
                    canvas2.save();
                    if (i13 == 0) {
                        canvas2.translate(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(15.5f));
                    } else if (i13 == this.F.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i24) - org.telegram.messenger.i0.L(22.0f)) - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(28.0f) - org.telegram.messenger.i0.L(12.5f));
                    } else {
                        canvas2.translate((i10 - (i24 / 2)) - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(28.0f) - org.telegram.messenger.i0.L(12.5f));
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
                    canvas2.translate(intrinsicWidth - org.telegram.messenger.i0.L(f13), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                if (i13 == 0) {
                    canvas2.drawText(str, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
                } else if (i13 == this.F.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i24) - org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i10 - (i24 / 2), org.telegram.messenger.i0.L(28.0f), textPaint);
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
                int i25 = (this.h * 2) + this.f33232r;
                int i26 = this.f33230f;
                float f23 = ((i25 + i26) * e) + this.f33231n + (i26 / 2);
                int i27 = org.telegram.ui.ActionBar.t6.N6;
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i27, p6Var2), 80));
                float f24 = L3;
                canvas2.drawCircle(f23, f24, org.telegram.messenger.i0.L(e7 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(i27, p6Var2));
                canvas2.drawCircle(f23, f24, org.telegram.messenger.i0.L(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f33227a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(74.0f), 1073741824));
        this.f33230f = org.telegram.messenger.i0.L(6.0f);
        this.h = org.telegram.messenger.i0.L(2.0f);
        this.f33231n = org.telegram.messenger.i0.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f33230f;
        String[] strArr = this.F;
        this.f33232r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f33231n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float a2 = w7.u.a(((this.f33230f / 2.0f) + (x10 - this.f33231n)) / (((this.h * 2) + this.f33232r) + i10), 0.0f, this.F.length - 1);
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
            this.f33236y = x10;
            this.D = y3;
            this.K = a2;
            this.E = this.I;
            this.f33235x = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.f33234w && Math.abs(this.f33236y - x10) > Math.abs(this.D - y3)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f33235x && Math.abs(this.f33236y - x10) >= org.telegram.messenger.i0.e) {
                this.f33234w = true;
                this.f33235x = false;
            }
            if (this.f33234w) {
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
            if (!this.f33234w) {
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
            yu0 yu0Var = this.N;
            if (yu0Var != null) {
                yu0Var.r();
            }
            this.f33235x = false;
            this.f33234w = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f33227a.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(yu0 yu0Var) {
        this.N = yu0Var;
    }

    public void setDashedFrom(int i10) {
        this.f33233s = i10;
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
