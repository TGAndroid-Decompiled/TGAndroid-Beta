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
public final class vt0 extends View {
    public float D;
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final w5 L;
    public final w5 M;
    public ut0 N;
    public final org.telegram.ui.ActionBar.f6 O;
    public final tt0 f39680a;
    public final Paint f39681b;
    public final Paint f39682c;
    public final TextPaint d;
    public int f39683e;
    public int f39684f;
    public int h;
    public int f39685n;
    public int f39686r;
    public int f39687s;
    public boolean f39688w;
    public boolean f39689x;
    public float f39690y;

    public vt0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f39687s = -1;
        this.J = Integer.MIN_VALUE;
        xq xqVar = xq.f40329f;
        this.L = new w5(this, 120L, xqVar);
        this.M = new w5(this, 150L, xqVar);
        this.O = f6Var;
        this.f39681b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f39682c = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        this.f39680a = new tt0(0, this);
    }

    public void setOption(int i7) {
        if (this.I != i7) {
            org.telegram.messenger.g0.c4(this);
        }
        this.I = i7;
        ut0 ut0Var = this.N;
        if (ut0Var != null) {
            ut0Var.m(i7);
        }
        invalidate();
    }

    public final void b(int i7, Drawable[] drawableArr, String... strArr) {
        String[] strArr2;
        this.F = strArr;
        this.H = drawableArr;
        this.I = i7;
        this.G = new int[strArr.length];
        int i10 = 0;
        while (true) {
            if (i10 >= this.F.length) {
                break;
            }
            this.G[i10] = (int) Math.ceil(this.d.measureText(strArr2[i10]));
            i10++;
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
        float f10;
        float f11;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f12;
        float f13;
        float f14;
        int L;
        int L2;
        int i10;
        Canvas canvas2 = canvas;
        char c10 = 0;
        float e10 = this.L.e(false, this.I);
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (this.f39688w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e11 = this.M.e(false, f10);
        int i11 = 2;
        int L3 = org.telegram.messenger.g0.L(11.0f) + (getMeasuredHeight() / 2);
        int i12 = 0;
        while (true) {
            int length = this.F.length;
            org.telegram.ui.ActionBar.f6 f6Var2 = this.O;
            Paint paint = this.f39681b;
            if (i12 < length) {
                int i13 = this.f39685n;
                int i14 = (this.h * i11) + this.f39686r;
                int i15 = this.f39684f;
                int i16 = (i15 / i11) + ((i14 + i15) * i12) + i13;
                float f17 = i12;
                float f18 = f17 - e10;
                char c11 = c10;
                float max = Math.max(f15, f16 - Math.abs(f18));
                float a10 = c8.j9.a((e10 - f17) + f16, f15, f16);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.M6, f6Var2);
                float f19 = f16;
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, f6Var2);
                int i17 = this.J;
                int i18 = i11;
                if (i17 != Integer.MIN_VALUE && i12 <= i17) {
                    f11 = 0.5f;
                } else {
                    f11 = f19;
                }
                int f20 = i0.a.f(a10, w02, org.telegram.ui.ActionBar.k6.r1(f11, w03));
                paint.setColor(f20);
                Paint paint2 = this.f39682c;
                paint2.setColor(f20);
                float f21 = L3;
                canvas2.drawCircle(i16, f21, org.telegram.messenger.g0.W1(max, this.f39684f / 2, org.telegram.messenger.g0.L(6.0f)), paint);
                if (i12 != 0) {
                    f12 = 3.0f;
                    int i19 = (i16 - (this.f39684f / 2)) - this.h;
                    int i20 = this.f39686r;
                    int i21 = i19 - i20;
                    int i22 = this.f39687s;
                    if (i22 != -1 && i12 - 1 >= i22) {
                        int L4 = org.telegram.messenger.g0.L(3.0f) + i21;
                        int L5 = (i20 - org.telegram.messenger.g0.L(3.0f)) / org.telegram.messenger.g0.L(13.0f);
                        if (this.f39683e != L5) {
                            i10 = L4;
                            i7 = i16;
                            float[] fArr = new float[i18];
                            fArr[c11] = org.telegram.messenger.g0.L(6.0f);
                            fArr[1] = org.telegram.messenger.camera.q.A(8.0f, L5, L2) / (L5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.f39683e = L5;
                        } else {
                            i10 = L4;
                            i7 = i16;
                        }
                        f6Var = f6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(org.telegram.messenger.g0.L(f19) + i10, f21, (i10 + L2) - org.telegram.messenger.g0.L(f19), f21, paint2);
                    } else {
                        i7 = i16;
                        f6Var = f6Var2;
                        float f22 = f18 - f19;
                        float a11 = c8.j9.a(f19 - Math.abs(f22), 0.0f, f19);
                        int L6 = (int) (i20 - (org.telegram.messenger.g0.L(3.0f) * c8.j9.a(f19 - Math.min(Math.abs(f18), Math.abs(f22)), 0.0f, f19)));
                        f19 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((org.telegram.messenger.g0.L(3.0f) * a11) + i21), L3 - org.telegram.messenger.g0.L(1.0f), L6 + L, org.telegram.messenger.g0.L(1.0f) + L3, paint);
                    }
                } else {
                    i7 = i16;
                    f6Var = f6Var2;
                    f12 = 3.0f;
                }
                int i23 = this.G[i12];
                String str = this.F[i12];
                int f23 = i0.a.f(max, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28240y6, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, f6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(f23);
                if (this.H != null) {
                    canvas2.save();
                    if (i12 == 0) {
                        canvas2.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(15.5f));
                    } else if (i12 == this.F.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i23) - org.telegram.messenger.g0.L(22.0f)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                    } else {
                        canvas2.translate((i7 - (i23 / 2)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                    }
                    this.H[i12].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.H[i12].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.H[i12].getIntrinsicWidth() / 2.0f;
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
                } else if (i12 == this.F.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i23) - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i7 - (i23 / 2), org.telegram.messenger.g0.L(28.0f), textPaint);
                }
                if (this.H != null) {
                    canvas2.restore();
                }
                i12++;
                f15 = f13;
                c10 = c11;
                f16 = f19;
                i11 = 2;
            } else {
                int i24 = (this.h * 2) + this.f39686r;
                int i25 = this.f39684f;
                float f24 = ((i24 + i25) * e10) + this.f39685n + (i25 / 2);
                int i26 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i26, f6Var2), 80));
                float f25 = L3;
                canvas2.drawCircle(f24, f25, org.telegram.messenger.g0.L(e11 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i26, f6Var2));
                canvas2.drawCircle(f24, f25, org.telegram.messenger.g0.L(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f39680a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(74.0f), 1073741824));
        this.f39684f = org.telegram.messenger.g0.L(6.0f);
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.f39685n = org.telegram.messenger.g0.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f39684f;
        String[] strArr = this.F;
        this.f39686r = (((measuredWidth - (i11 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f39685n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z9;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float a10 = c8.j9.a(((this.f39684f / 2.0f) + (x10 - this.f39685n)) / (((this.h * 2) + this.f39686r) + i7), 0.0f, this.F.length - 1);
        if (Math.abs(a10 - Math.round(a10)) < 0.35f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            a10 = Math.round(a10);
        }
        int i10 = this.J;
        if (i10 != Integer.MIN_VALUE) {
            a10 = Math.max(a10, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.f39690y = x10;
            this.D = y10;
            this.K = a10;
            this.E = this.I;
            this.f39689x = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.f39688w && Math.abs(this.f39690y - x10) > Math.abs(this.D - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f39689x && Math.abs(this.f39690y - x10) >= org.telegram.messenger.g0.f22516e) {
                this.f39688w = true;
                this.f39689x = false;
            }
            if (this.f39688w) {
                this.K = a10;
                invalidate();
                if (Math.round(this.K) != this.I && z9) {
                    setOption(Math.round(this.K));
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        } else {
            if (!this.f39688w) {
                this.K = a10;
                if (motionEvent.getAction() == 1 && Math.round(this.K) != this.I) {
                    setOption(Math.round(this.K));
                }
            } else {
                int i11 = this.I;
                if (i11 != this.E) {
                    setOption(i11);
                }
            }
            ut0 ut0Var = this.N;
            if (ut0Var != null) {
                ut0Var.n();
            }
            this.f39689x = false;
            this.f39688w = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f39680a.g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(ut0 ut0Var) {
        this.N = ut0Var;
    }

    public void setDashedFrom(int i7) {
        this.f39687s = i7;
    }

    public void setMinAllowedIndex(int i7) {
        String[] strArr;
        if (i7 != -1 && (strArr = this.F) != null) {
            i7 = Math.min(i7, strArr.length - 1);
        }
        if (this.J != i7) {
            this.J = i7;
            if (this.I < i7) {
                this.I = i7;
            }
            invalidate();
        }
    }
}
