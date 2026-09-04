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
public final class sv0 extends View {
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final e6 L;
    public final e6 M;
    public rv0 N;
    public final org.telegram.ui.ActionBar.f6 O;
    public final qv0 f30420a;
    public final Paint f30421b;
    public final Paint f30422c;
    public final TextPaint d;
    public int f30423e;
    public int f30424f;
    public int h;
    public int f30425n;
    public int f30426r;
    public int f30427s;
    public boolean v;
    public boolean f30428w;
    public float f30429x;
    public float f30430y;

    public sv0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30427s = -1;
        this.J = Integer.MIN_VALUE;
        pr prVar = pr.f29466f;
        this.L = new e6(this, 120L, prVar);
        this.M = new e6(this, 150L, prVar);
        this.O = f6Var;
        this.f30421b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.f30422c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f30420a = new qv0(this);
    }

    public void setOption(int i10) {
        if (this.I != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.I = i10;
        rv0 rv0Var = this.N;
        if (rv0Var != null) {
            rv0Var.i(i10);
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
        org.telegram.ui.ActionBar.f6 f6Var;
        float f11;
        int dp;
        int dp2;
        int i11;
        Canvas canvas2 = canvas;
        float d = this.L.d(this.I, false);
        float f12 = 0.0f;
        float f13 = 1.0f;
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
            org.telegram.ui.ActionBar.f6 f6Var2 = this.O;
            Paint paint = this.f30421b;
            if (i13 < length) {
                int i14 = this.f30425n;
                int i15 = (this.h * 2) + this.f30426r;
                int i16 = this.f30424f;
                int i17 = (i16 / i12) + ((i15 + i16) * i13) + i14;
                float f14 = i13;
                float f15 = f14 - d;
                float max = Math.max(f12, f13 - Math.abs(f15));
                float a2 = w7.p.a((d - f14) + f13, f12, f13);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.M6, f6Var2);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var2);
                int i18 = this.J;
                if (i18 != Integer.MIN_VALUE && i13 <= i18) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                int d11 = i0.a.d(a2, v02, org.telegram.ui.ActionBar.j6.l1(f10, v03));
                paint.setColor(d11);
                Paint paint2 = this.f30422c;
                paint2.setColor(d11);
                float f16 = dp3;
                canvas2.drawCircle(i17, f16, AndroidUtilities.lerp(this.f30424f / 2, AndroidUtilities.dp(6.0f), max), paint);
                if (i13 != 0) {
                    int i19 = (i17 - (this.f30424f / 2)) - this.h;
                    int i20 = this.f30426r;
                    int i21 = i19 - i20;
                    int i22 = this.f30427s;
                    if (i22 != -1 && i13 - 1 >= i22) {
                        int dp4 = AndroidUtilities.dp(3.0f) + i21;
                        int dp5 = (i20 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                        if (this.f30423e != dp5) {
                            i11 = dp4;
                            i10 = i17;
                            paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), org.telegram.messenger.wl.A(8.0f, dp5, dp2) / ((float) (dp5 - 1))}, 0.0f));
                            this.f30423e = dp5;
                        } else {
                            i11 = dp4;
                            i10 = i17;
                        }
                        f6Var = f6Var2;
                        canvas2 = canvas;
                        canvas2.drawLine(AndroidUtilities.dp(1.0f) + i11, f16, (i11 + dp2) - AndroidUtilities.dp(1.0f), f16, paint2);
                    } else {
                        i10 = i17;
                        f6Var = f6Var2;
                        float f17 = f15 - 1.0f;
                        float a10 = w7.p.a(1.0f - Math.abs(f17), 0.0f, 1.0f);
                        int dp6 = (int) (i20 - (AndroidUtilities.dp(3.0f) * w7.p.a(1.0f - Math.min(Math.abs(f15), Math.abs(f17)), 0.0f, 1.0f)));
                        canvas2 = canvas;
                        canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a10) + i21), dp3 - AndroidUtilities.dp(1.0f), dp6 + dp, AndroidUtilities.dp(1.0f) + dp3, paint);
                    }
                } else {
                    i10 = i17;
                    f6Var = f6Var2;
                }
                int i23 = this.G[i13];
                String str = this.F[i13];
                int d12 = i0.a.d(max, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20846n6, f6Var));
                TextPaint textPaint = this.d;
                textPaint.setColor(d12);
                if (this.H != null) {
                    canvas2.save();
                    if (i13 == 0) {
                        canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                    } else if (i13 == this.F.length - 1) {
                        canvas2.translate(((getMeasuredWidth() - i23) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    } else {
                        canvas2.translate((i10 - (i23 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                    }
                    this.H[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    this.H[i13].draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    float intrinsicWidth = this.H[i13].getIntrinsicWidth() / 2.0f;
                    if (i13 == 0) {
                        f11 = 3.0f;
                    } else {
                        f11 = 2.0f;
                    }
                    canvas2.translate(intrinsicWidth - AndroidUtilities.dp(f11), 0.0f);
                }
                if (i13 == 0) {
                    canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else if (i13 == this.F.length - 1) {
                    canvas2.drawText(str, (getMeasuredWidth() - i23) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
                } else {
                    canvas2.drawText(str, i10 - (i23 / 2), AndroidUtilities.dp(28.0f), textPaint);
                }
                if (this.H != null) {
                    canvas2.restore();
                }
                i13++;
                f12 = 0.0f;
                f13 = 1.0f;
                i12 = 2;
            } else {
                int i24 = (this.h * 2) + this.f30426r;
                int i25 = this.f30424f;
                float f18 = ((i24 + i25) * d) + this.f30425n + (i25 / 2);
                int i26 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i26, f6Var2), 80));
                float f19 = dp3;
                canvas2.drawCircle(f18, f19, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(i26, f6Var2));
                canvas2.drawCircle(f18, f19, AndroidUtilities.dp(6.0f), paint);
                return;
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f30420a.e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.f30424f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.f30425n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f30424f;
        String[] strArr = this.F;
        this.f30426r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.f30425n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float a2 = w7.p.a(((this.f30424f / 2.0f) + (x10 - this.f30425n)) / (((this.h * 2) + this.f30426r) + i10), 0.0f, this.F.length - 1);
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
            this.f30429x = x10;
            this.f30430y = y3;
            this.K = a2;
            this.E = this.I;
            this.f30428w = true;
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.f30429x - x10) > Math.abs(this.f30430y - y3)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.f30428w && Math.abs(this.f30429x - x10) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.f30428w = false;
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
            rv0 rv0Var = this.N;
            if (rv0Var != null) {
                rv0Var.l();
            }
            this.f30428w = false;
            this.v = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f30420a.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setCallback(rv0 rv0Var) {
        this.N = rv0Var;
    }

    public void setDashedFrom(int i10) {
        this.f30427s = i10;
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
