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
public final class hu0 extends View {
    public float E;
    public int F;
    public String[] G;
    public int[] H;
    public Drawable[] I;
    public int J;
    public int K;
    public float L;
    public final d6 M;
    public final d6 N;
    public gu0 O;
    public final org.telegram.ui.ActionBar.h6 P;
    public final fu0 f35921a;
    public final Paint f35922b;
    public final Paint f35923c;
    public final TextPaint d;
    public int f35924e;
    public int f35925f;
    public int h;
    public int f35926n;
    public int f35927r;
    public int f35928s;
    public boolean f35929w;
    public boolean f35930x;
    public float f35931y;

    public hu0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f35928s = -1;
        this.K = Integer.MIN_VALUE;
        nr nrVar = nr.f37917f;
        this.M = new d6(this, 120L, nrVar);
        this.N = new d6(this, 150L, nrVar);
        this.P = h6Var;
        this.f35922b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f35923c = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        this.f35921a = new fu0(0, this);
    }

    public void setOption(int i7) {
        if (this.J != i7) {
            org.telegram.messenger.g0.a4(this);
        }
        this.J = i7;
        gu0 gu0Var = this.O;
        if (gu0Var != null) {
            gu0Var.k(i7);
        }
        invalidate();
    }

    public final void b(int i7, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.G = strArr;
        this.I = drawableArr;
        this.J = i7;
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
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        float f12;
        float f13;
        float f14;
        int L;
        int L2;
        int i10;
        Canvas canvas2 = canvas;
        char c10 = 0;
        float e10 = this.M.e(false, this.J);
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (this.f35929w) {
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
            org.telegram.ui.ActionBar.h6 h6Var2 = this.P;
            Paint paint = this.f35922b;
            if (i12 < length) {
                int i13 = this.f35926n;
                int i14 = (this.h * i11) + this.f35927r;
                int i15 = this.f35925f;
                int i16 = (i15 / i11) + ((i14 + i15) * i12) + i13;
                float f17 = i12;
                float f18 = f17 - e10;
                char c11 = c10;
                float max = Math.max(f15, f16 - Math.abs(f18));
                float a10 = c8.m9.a((e10 - f17) + f16, f15, f16);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.M6, h6Var2);
                float f19 = f16;
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.N6, h6Var2);
                int i17 = this.K;
                int i18 = i11;
                if (i17 != Integer.MIN_VALUE && i12 <= i17) {
                    f11 = 0.5f;
                } else {
                    f11 = f19;
                }
                int f20 = i0.a.f(a10, w02, org.telegram.ui.ActionBar.m6.r1(f11, w03));
                paint.setColor(f20);
                Paint paint2 = this.f35923c;
                paint2.setColor(f20);
                float f21 = L3;
                canvas2.drawCircle(i16, f21, org.telegram.messenger.g0.W1(max, this.f35925f / 2, org.telegram.messenger.g0.L(6.0f)), paint);
                if (i12 != 0) {
                    f12 = 3.0f;
                    int i19 = (i16 - (this.f35925f / 2)) - this.h;
                    int i20 = this.f35927r;
                    int i21 = i19 - i20;
                    int i22 = this.f35928s;
                    if (i22 != -1 && i12 - 1 >= i22) {
                        int L4 = org.telegram.messenger.g0.L(3.0f) + i21;
                        int L5 = (i20 - org.telegram.messenger.g0.L(3.0f)) / org.telegram.messenger.g0.L(13.0f);
                        if (this.f35924e != L5) {
                            i10 = L4;
                            i7 = i16;
                            float[] fArr = new float[i18];
                            fArr[c11] = org.telegram.messenger.g0.L(6.0f);
                            fArr[1] = org.telegram.messenger.o10.B(8.0f, L5, L2) / (L5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.f35924e = L5;
                        } else {
                            i10 = L4;
                            i7 = i16;
                        }
                        h6Var = h6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(org.telegram.messenger.g0.L(f19) + i10, f21, (i10 + L2) - org.telegram.messenger.g0.L(f19), f21, paint2);
                    } else {
                        i7 = i16;
                        h6Var = h6Var2;
                        float f22 = f18 - f19;
                        float a11 = c8.m9.a(f19 - Math.abs(f22), 0.0f, f19);
                        int L6 = (int) (i20 - (org.telegram.messenger.g0.L(3.0f) * c8.m9.a(f19 - Math.min(Math.abs(f18), Math.abs(f22)), 0.0f, f19)));
                        f19 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((org.telegram.messenger.g0.L(3.0f) * a11) + i21), L3 - org.telegram.messenger.g0.L(1.0f), L6 + L, org.telegram.messenger.g0.L(1.0f) + L3, paint);
                    }
                } else {
                    i7 = i16;
                    h6Var = h6Var2;
                    f12 = 3.0f;
                }
                int i23 = this.H[i12];
                String str = this.G[i12];
                int f23 = i0.a.f(max, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29739y6, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29529n6, h6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(f23);
                if (this.I != null) {
                    canvas2.save();
                    if (i12 == 0) {
                        canvas2.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(15.5f));
                    } else if (i12 == this.G.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i23) - org.telegram.messenger.g0.L(22.0f)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                    } else {
                        canvas2.translate((i7 - (i23 / 2)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
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
                    canvas2.drawText(str, i7 - (i23 / 2), org.telegram.messenger.g0.L(28.0f), textPaint);
                }
                if (this.I != null) {
                    canvas2.restore();
                }
                i12++;
                f15 = f13;
                c10 = c11;
                f16 = f19;
                i11 = 2;
            } else {
                int i24 = (this.h * 2) + this.f35927r;
                int i25 = this.f35925f;
                float f24 = ((i24 + i25) * e10) + this.f35926n + (i25 / 2);
                int i26 = org.telegram.ui.ActionBar.m6.N6;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i26, h6Var2), 80));
                float f25 = L3;
                canvas2.drawCircle(f24, f25, org.telegram.messenger.g0.L(e11 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(i26, h6Var2));
                canvas2.drawCircle(f24, f25, org.telegram.messenger.g0.L(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35921a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(74.0f), 1073741824));
        this.f35925f = org.telegram.messenger.g0.L(6.0f);
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.f35926n = org.telegram.messenger.g0.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f35925f;
        String[] strArr = this.G;
        this.f35927r = (((measuredWidth - (i11 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f35926n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float a10 = c8.m9.a(((this.f35925f / 2.0f) + (x10 - this.f35926n)) / (((this.h * 2) + this.f35927r) + i7), 0.0f, this.G.length - 1);
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
            this.f35931y = x10;
            this.E = y10;
            this.L = a10;
            this.F = this.J;
            this.f35930x = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.f35929w && Math.abs(this.f35931y - x10) > Math.abs(this.E - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f35930x && Math.abs(this.f35931y - x10) >= org.telegram.messenger.g0.f23989e) {
                this.f35929w = true;
                this.f35930x = false;
            }
            if (this.f35929w) {
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
            if (!this.f35929w) {
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
            gu0 gu0Var = this.O;
            if (gu0Var != null) {
                gu0Var.o();
            }
            this.f35930x = false;
            this.f35929w = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f35921a.g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(gu0 gu0Var) {
        this.O = gu0Var;
    }

    public void setDashedFrom(int i7) {
        this.f35928s = i7;
    }

    public void setMinAllowedIndex(int i7) {
        String[] strArr;
        if (i7 != -1 && (strArr = this.G) != null) {
            i7 = Math.min(i7, strArr.length - 1);
        }
        if (this.K != i7) {
            this.K = i7;
            if (this.J < i7) {
                this.J = i7;
            }
            invalidate();
        }
    }
}
