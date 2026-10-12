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
public final class cx0 extends View {
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final g6 L;
    public final g6 M;
    public bx0 N;
    public final org.telegram.ui.ActionBar.c6 O;
    public final ax0 f25039a;
    public final Paint f25040b;
    public final Paint f25041c;
    public final TextPaint d;
    public int f25042e;
    public int f25043f;
    public int h;
    public int f25044n;
    public int f25045r;
    public int f25046s;
    public boolean v;
    public boolean f25047w;
    public float f25048x;
    public float f25049y;

    public cx0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25046s = -1;
        this.J = Integer.MIN_VALUE;
        js jsVar = js.f27627f;
        this.L = new g6(this, 120L, jsVar);
        this.M = new g6(this, 150L, jsVar);
        this.O = c6Var;
        this.f25040b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f25041c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f25039a = new ax0(this);
    }

    public void setOption(int i10) {
        if (this.I != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.I = i10;
        bx0 bx0Var = this.N;
        if (bx0Var != null) {
            bx0Var.g(i10);
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
        org.telegram.ui.ActionBar.c6 c6Var;
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
            org.telegram.ui.ActionBar.c6 c6Var2 = this.O;
            Paint paint = this.f25040b;
            if (i13 < length) {
                int i14 = this.f25044n;
                int i15 = (this.h * i12) + this.f25045r;
                int i16 = this.f25043f;
                int i17 = (i16 / i12) + ((i15 + i16) * i13) + i14;
                float f16 = i13;
                float f17 = f16 - d;
                char c11 = c10;
                float max = Math.max(f14, f15 - Math.abs(f17));
                float a2 = w7.n.a((d - f16) + f15, f14, f15);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.M6, c6Var2);
                float f18 = f15;
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, c6Var2);
                int i18 = this.J;
                int i19 = i12;
                if (i18 != Integer.MIN_VALUE && i13 <= i18) {
                    f10 = 0.5f;
                } else {
                    f10 = f18;
                }
                int d11 = i0.a.d(a2, w02, org.telegram.ui.ActionBar.h6.m1(f10, w03));
                paint.setColor(d11);
                Paint paint2 = this.f25041c;
                paint2.setColor(d11);
                float f19 = dp3;
                canvas2.drawCircle(i17, f19, AndroidUtilities.lerp(this.f25043f / 2, AndroidUtilities.dp(6.0f), max), paint);
                if (i13 != 0) {
                    f11 = 3.0f;
                    int i20 = (i17 - (this.f25043f / 2)) - this.h;
                    int i21 = this.f25045r;
                    int i22 = i20 - i21;
                    int i23 = this.f25046s;
                    if (i23 != -1 && i13 - 1 >= i23) {
                        int dp4 = AndroidUtilities.dp(3.0f) + i22;
                        int dp5 = (i21 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                        if (this.f25042e != dp5) {
                            i11 = dp4;
                            i10 = i17;
                            float[] fArr = new float[i19];
                            fArr[c11] = AndroidUtilities.dp(6.0f);
                            fArr[1] = org.telegram.messenger.am.B(8.0f, dp5, dp2) / (dp5 - 1);
                            paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                            this.f25042e = dp5;
                        } else {
                            i11 = dp4;
                            i10 = i17;
                        }
                        c6Var = c6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(AndroidUtilities.dp(f18) + i11, f19, (i11 + dp2) - AndroidUtilities.dp(f18), f19, paint2);
                    } else {
                        i10 = i17;
                        c6Var = c6Var2;
                        float f20 = f17 - f18;
                        float a10 = w7.n.a(f18 - Math.abs(f20), 0.0f, f18);
                        int dp6 = (int) (i21 - (AndroidUtilities.dp(3.0f) * w7.n.a(f18 - Math.min(Math.abs(f17), Math.abs(f20)), 0.0f, f18)));
                        f18 = 1.0f;
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a10) + i22), dp3 - AndroidUtilities.dp(1.0f), dp6 + dp, AndroidUtilities.dp(1.0f) + dp3, paint);
                    }
                } else {
                    i10 = i17;
                    c6Var = c6Var2;
                    f11 = 3.0f;
                }
                int i24 = this.G[i13];
                String str = this.F[i13];
                int d12 = i0.a.d(max, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20945y6, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20744n6, c6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(d12);
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
                int i25 = (this.h * 2) + this.f25045r;
                int i26 = this.f25043f;
                float f21 = ((i25 + i26) * d) + this.f25044n + (i26 / 2);
                int i27 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(i27, c6Var2), 80));
                float f22 = dp3;
                canvas2.drawCircle(f21, f22, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(i27, c6Var2));
                canvas2.drawCircle(f21, f22, AndroidUtilities.dp(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f25039a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.f25043f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.f25044n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f25043f;
        String[] strArr = this.F;
        this.f25045r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f25044n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float a2 = w7.n.a(((this.f25043f / 2.0f) + (x10 - this.f25044n)) / (((this.h * 2) + this.f25045r) + i10), 0.0f, this.F.length - 1);
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
            this.f25048x = x10;
            this.f25049y = y3;
            this.K = a2;
            this.E = this.I;
            this.f25047w = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.f25048x - x10) > Math.abs(this.f25049y - y3)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f25047w && Math.abs(this.f25048x - x10) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.f25047w = false;
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
            bx0 bx0Var = this.N;
            if (bx0Var != null) {
                bx0Var.l();
            }
            this.f25047w = false;
            this.v = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f25039a.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(bx0 bx0Var) {
        this.N = bx0Var;
    }

    public void setDashedFrom(int i10) {
        this.f25046s = i10;
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
