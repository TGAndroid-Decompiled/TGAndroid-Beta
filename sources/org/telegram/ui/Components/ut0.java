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
public final class ut0 extends View {
    public float E;
    public int F;
    public String[] G;
    public int[] H;
    public Drawable[] I;
    public int J;
    public int K;
    public float L;
    public final u5 M;
    public final u5 N;
    public tt0 O;
    public final org.telegram.ui.ActionBar.e6 P;
    public final st0 f38877a;
    public final Paint f38878b;
    public final Paint f38879c;
    public final TextPaint d;
    public int f38880e;
    public int f38881f;
    public int h;
    public int f38882n;
    public int f38883r;
    public int f38884s;
    public boolean f38885w;
    public boolean f38886x;
    public float f38887y;

    public ut0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38884s = -1;
        this.K = Integer.MIN_VALUE;
        xq xqVar = xq.f40452f;
        this.M = new u5(this, 120L, xqVar);
        this.N = new u5(this, 150L, xqVar);
        this.P = e6Var;
        this.f38878b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f38879c = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        this.f38877a = new st0(0, this);
    }

    public void setOption(int i3) {
        if (this.J != i3) {
            org.telegram.messenger.g0.c4(this);
        }
        this.J = i3;
        tt0 tt0Var = this.O;
        if (tt0Var != null) {
            tt0Var.l(i3);
        }
        invalidate();
    }

    public final void b(int i3, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.G = strArr;
        this.I = drawableArr;
        this.J = i3;
        this.H = new int[strArr.length];
        int i10 = 0;
        while (true) {
            if (i10 >= this.G.length) {
                break;
            }
            this.H[i10] = (int) Math.ceil(this.d.measureText(strArr2[i10]));
            i10++;
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.J;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f12;
        float f13;
        float f14;
        int L;
        int L2;
        int i10;
        Canvas canvas2 = canvas;
        char c2 = 0;
        float e10 = this.M.e(false, this.J);
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (this.f38885w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e11 = this.N.e(false, f10);
        int i11 = 2;
        int L3 = org.telegram.messenger.g0.L(11.0f) + (getMeasuredHeight() / 2);
        int i12 = 0;
        while (true) {
            int length = this.G.length;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.P;
            Paint paint = this.f38878b;
            if (i12 < length) {
                int i13 = this.f38882n;
                int i14 = (this.h * i11) + this.f38883r;
                int i15 = this.f38881f;
                int i16 = (i15 / i11) + ((i14 + i15) * i12) + i13;
                float f17 = i12;
                float f18 = f17 - e10;
                char c10 = c2;
                float max = Math.max(f15, f16 - Math.abs(f18));
                float a10 = b8.be.a((e10 - f17) + f16, f15, f16);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.M6, e6Var2);
                float f19 = f16;
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var2);
                int i17 = this.K;
                int i18 = i11;
                if (i17 != Integer.MIN_VALUE && i12 <= i17) {
                    f11 = 0.5f;
                } else {
                    f11 = f19;
                }
                int f20 = i0.a.f(a10, w02, org.telegram.ui.ActionBar.k6.r1(f11, w03));
                paint.setColor(f20);
                Paint paint2 = this.f38879c;
                paint2.setColor(f20);
                float f21 = L3;
                canvas2.drawCircle(i16, f21, org.telegram.messenger.g0.W1(max, this.f38881f / 2, org.telegram.messenger.g0.L(6.0f)), paint);
                if (i12 != 0) {
                    f12 = 3.0f;
                    int i19 = (i16 - (this.f38881f / 2)) - this.h;
                    int i20 = this.f38883r;
                    int i21 = i19 - i20;
                    int i22 = this.f38884s;
                    if (i22 != -1 && i12 - 1 >= i22) {
                        int L4 = org.telegram.messenger.g0.L(3.0f) + i21;
                        int L5 = (i20 - org.telegram.messenger.g0.L(3.0f)) / org.telegram.messenger.g0.L(13.0f);
                        if (this.f38880e != L5) {
                            i10 = L4;
                            i3 = i16;
                            float[] fArr = new float[i18];
                            fArr[c10] = org.telegram.messenger.g0.L(6.0f);
                            fArr[1] = org.telegram.messenger.camera.q.A(8.0f, L5, L2) / (L5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.f38880e = L5;
                        } else {
                            i10 = L4;
                            i3 = i16;
                        }
                        e6Var = e6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(org.telegram.messenger.g0.L(f19) + i10, f21, (i10 + L2) - org.telegram.messenger.g0.L(f19), f21, paint2);
                    } else {
                        i3 = i16;
                        e6Var = e6Var2;
                        float f22 = f18 - f19;
                        float a11 = b8.be.a(f19 - Math.abs(f22), 0.0f, f19);
                        int L6 = (int) (i20 - (org.telegram.messenger.g0.L(3.0f) * b8.be.a(f19 - Math.min(Math.abs(f18), Math.abs(f22)), 0.0f, f19)));
                        f19 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((org.telegram.messenger.g0.L(3.0f) * a11) + i21), L3 - org.telegram.messenger.g0.L(1.0f), L6 + L, org.telegram.messenger.g0.L(1.0f) + L3, paint);
                    }
                } else {
                    i3 = i16;
                    e6Var = e6Var2;
                    f12 = 3.0f;
                }
                int i23 = this.H[i12];
                String str = this.G[i12];
                int f23 = i0.a.f(max, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(f23);
                if (this.I != null) {
                    canvas2.save();
                    if (i12 == 0) {
                        canvas2.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(15.5f));
                    } else if (i12 == this.G.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i23) - org.telegram.messenger.g0.L(22.0f)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                    } else {
                        canvas2.translate((i3 - (i23 / 2)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                    }
                    this.I[i12].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.I[i12].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.I[i12].getIntrinsicWidth() / 2.0f;
                    if (i12 == 0) {
                        f14 = f12;
                    } else {
                        f14 = 2.0f;
                    }
                    f13 = 0.0f;
                    canvas2.translate(intrinsicWidth - org.telegram.messenger.g0.L(f14), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                if (i12 == 0) {
                    canvas2.drawText(str, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
                } else if (i12 == this.G.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i23) - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i3 - (i23 / 2), org.telegram.messenger.g0.L(28.0f), textPaint);
                }
                if (this.I != null) {
                    canvas2.restore();
                }
                i12++;
                f15 = f13;
                c2 = c10;
                f16 = f19;
                i11 = 2;
            } else {
                int i24 = (this.h * 2) + this.f38883r;
                int i25 = this.f38881f;
                float f24 = ((i24 + i25) * e10) + this.f38882n + (i25 / 2);
                int i26 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i26, e6Var2), 80));
                float f25 = L3;
                canvas2.drawCircle(f24, f25, org.telegram.messenger.g0.L(e11 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i26, e6Var2));
                canvas2.drawCircle(f24, f25, org.telegram.messenger.g0.L(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38877a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(74.0f), 1073741824));
        this.f38881f = org.telegram.messenger.g0.L(6.0f);
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.f38882n = org.telegram.messenger.g0.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f38881f;
        String[] strArr = this.G;
        this.f38883r = (((measuredWidth - (i11 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f38882n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        boolean z10;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        float a10 = b8.be.a(((this.f38881f / 2.0f) + (x10 - this.f38882n)) / (((this.h * 2) + this.f38883r) + i3), 0.0f, this.G.length - 1);
        if (Math.abs(a10 - Math.round(a10)) < 0.35f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a10 = Math.round(a10);
        }
        int i10 = this.K;
        if (i10 != Integer.MIN_VALUE) {
            a10 = Math.max(a10, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.f38887y = x10;
            this.E = y9;
            this.L = a10;
            this.F = this.J;
            this.f38886x = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.f38885w && Math.abs(this.f38887y - x10) > Math.abs(this.E - y9)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f38886x && Math.abs(this.f38887y - x10) >= org.telegram.messenger.g0.f22587e) {
                this.f38885w = true;
                this.f38886x = false;
            }
            if (this.f38885w) {
                this.L = a10;
                invalidate();
                if (Math.round(this.L) != this.J && z10) {
                    setOption(Math.round(this.L));
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        } else {
            if (!this.f38885w) {
                this.L = a10;
                if (motionEvent.getAction() == 1 && Math.round(this.L) != this.J) {
                    setOption(Math.round(this.L));
                }
            } else {
                int i11 = this.J;
                if (i11 != this.F) {
                    setOption(i11);
                }
            }
            tt0 tt0Var = this.O;
            if (tt0Var != null) {
                tt0Var.p();
            }
            this.f38886x = false;
            this.f38885w = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (!super.performAccessibilityAction(i3, bundle) && !this.f38877a.g(this, i3, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(tt0 tt0Var) {
        this.O = tt0Var;
    }

    public void setDashedFrom(int i3) {
        this.f38884s = i3;
    }

    public void setMinAllowedIndex(int i3) {
        String[] strArr;
        if (i3 != -1 && (strArr = this.G) != null) {
            i3 = Math.min(i3, strArr.length - 1);
        }
        if (this.K != i3) {
            this.K = i3;
            if (this.J < i3) {
                this.J = i3;
            }
            invalidate();
        }
    }
}
