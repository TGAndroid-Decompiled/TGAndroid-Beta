package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public class cb0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public static final xq f32646y0 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public ab0 K;
    public za0 L;
    public ya0 M;
    public long N;
    public final SparseArray O;
    public int[] P;
    public final Paint Q;
    public int R;
    public int S;
    public int T;
    public final al0 U;
    public final al0 V;
    public int W;
    public boolean f32647a;
    public xa0 f32648a0;
    public int f32649b;
    public float f32650b0;
    public int f32651c;
    public long f32652c0;
    public int d;
    public float f32653d0;
    public final TextView f32654e;
    public VelocityTracker f32655e0;
    public final int f32656f;
    public final int f32657f0;
    public final int f32658g0;
    public final int h;
    public final int f32659h0;
    public boolean f32660i0;
    public boolean f32661j0;
    public final Paint f32662k0;
    public final int f32663l0;
    public int m0;
    public final int f32664n;
    public int f32665n0;
    public int f32666o0;
    public boolean f32667p0;
    public boolean f32668q0;
    public int f32669r;
    public final bb0 f32670r0;
    public final boolean f32671s;
    public int f32672s0;
    public final org.telegram.ui.ActionBar.e6 f32673t0;
    public boolean f32674u0;
    public org.telegram.messenger.v10 f32675v0;
    public final int f32676w;
    public Integer f32677w0;
    public int f32678x;
    public int f32679x0;
    public String[] f32680y;

    public cb0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i3, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i3);
            int mode = View.MeasureSpec.getMode(i3);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(k2.p1.i(mode, "Unknown measure mode: "));
                    }
                } else {
                    return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                }
            } else {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
            }
        }
        return i3;
    }

    public static int k(int i3, int i10, int i11) {
        if (i3 != -1) {
            int max = Math.max(i3, i10);
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    return size;
                }
                return max;
            } else if (size < max) {
                return 16777216 | size;
            } else {
                return max;
            }
        }
        return i10;
    }

    public final void a(boolean z10) {
        this.f32654e.setVisibility(4);
        if (!h(this.U)) {
            h(this.V);
        }
        this.W = 0;
        if (z10) {
            this.U.d(-this.R, 300);
        } else {
            this.U.d(this.R, 300);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    public final void b(int i3) {
        String str;
        SparseArray sparseArray = this.O;
        if (((String) sparseArray.get(i3)) != null) {
            return;
        }
        int i10 = this.E;
        if (i3 >= i10 && i3 <= this.G) {
            String[] strArr = this.f32680y;
            if (strArr != null) {
                str = strArr[i3 - i10];
            } else {
                ya0 ya0Var = this.M;
                if (ya0Var != null) {
                    str = ya0Var.e(i3);
                } else {
                    str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
                }
            }
        } else {
            str = "";
        }
        sparseArray.put(i3, str);
    }

    public final boolean c() {
        int i3 = this.S - this.T;
        if (i3 == 0) {
            return false;
        }
        this.W = 0;
        int abs = Math.abs(i3);
        int i10 = this.R;
        if (abs > i10 / 2) {
            if (i3 > 0) {
                i10 = -i10;
            }
            i3 += i10;
        }
        this.V.d(i3, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        al0 al0Var = this.U;
        if (al0Var.f31890q) {
            al0Var = this.V;
            if (al0Var.f31890q) {
                return;
            }
        }
        al0Var.b();
        int i3 = al0Var.f31884k;
        if (this.W == 0) {
            this.W = al0Var.f31878c;
        }
        scrollBy(0, i3 - this.W);
        this.W = i3;
        if (al0Var.f31890q) {
            if (al0Var == this.U) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.m0 != 1) {
                n();
                return;
            } else {
                return;
            }
        }
        invalidate();
    }

    @Override
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override
    public final int computeVerticalScrollOffset() {
        return this.T;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.G - this.E) + 1) * this.R;
    }

    public CharSequence d(int i3) {
        return this.f32654e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb0.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            j();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final int e(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.H && i3 > (i13 = this.G) && (i15 = i13 - (i14 = this.E)) != 0) {
            return (((i3 - i13) % i15) + i14) - 1;
        }
        if (this.F && i3 < (i10 = this.E) && (i12 = (i11 = this.G) - i10) != 0) {
            return (i11 - ((i10 - i3) % i12)) + 1;
        }
        return i3;
    }

    public final void f() {
        this.O.clear();
        int[] iArr = this.P;
        int value = getValue();
        for (int i3 = 0; i3 < this.P.length; i3++) {
            int i10 = (i3 - this.f32651c) + value;
            if (this.f32660i0) {
                i10 = e(i10);
            }
            iArr[i3] = i10;
            b(i10);
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f32680y;
    }

    public int getItemsCount() {
        return this.f32649b;
    }

    public int getMaxValue() {
        return this.G;
    }

    public int getMinValue() {
        return this.E;
    }

    @Override
    public int getSolidColor() {
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.I;
    }

    public boolean getWrapSelectorWheel() {
        return this.f32660i0;
    }

    public final boolean h(al0 al0Var) {
        al0Var.f31890q = true;
        int i3 = al0Var.f31879e - al0Var.f31884k;
        int i10 = this.S - ((this.T + i3) % this.R);
        if (i10 == 0) {
            return false;
        }
        int abs = Math.abs(i10);
        int i11 = this.R;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i10 -= i11;
            } else {
                i10 += i11;
            }
        }
        scrollBy(0, i3 + i10);
        return true;
    }

    public final void i(int i3) {
        String str;
        if (this.m0 != i3) {
            this.m0 = i3;
            za0 za0Var = this.L;
            if (za0Var != null) {
                za0Var.d(i3);
            }
            if (i3 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f32680y;
                    if (strArr == null) {
                        int i10 = this.I;
                        ya0 ya0Var = this.M;
                        if (ya0Var != null) {
                            str = ya0Var.e(i10);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
                        }
                    } else {
                        str = strArr[this.I - this.E];
                    }
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(16384);
                    obtain.getText().add(str);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }
        }
    }

    public final void j() {
        xa0 xa0Var = this.f32648a0;
        if (xa0Var != null) {
            removeCallbacks(xa0Var);
        }
        this.f32670r0.a();
    }

    public final void l(int i3, boolean z10) {
        int min;
        za0 za0Var;
        ab0 ab0Var;
        if (this.I != i3) {
            if (this.f32660i0) {
                min = e(i3);
            } else {
                min = Math.min(Math.max(i3, this.E), this.G);
            }
            int i10 = this.I;
            this.J = min;
            this.I = min;
            n();
            if (Math.abs(i10 - min) > 0.9f) {
                org.telegram.messenger.g0.c4(this);
            }
            if (z10 && (ab0Var = this.K) != null) {
                ab0Var.l(this, this.I);
            }
            f();
            invalidate();
            if (this.m0 == 0 && (za0Var = this.L) != null) {
                za0Var.d(0);
            }
        }
    }

    public final void m() {
        int i3;
        if (this.f32671s) {
            String[] strArr = this.f32680y;
            Paint paint = this.Q;
            int i10 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i11 = 0; i11 <= 9; i11++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i12 = this.G; i12 > 0; i12 /= 10) {
                    i10++;
                }
                i3 = (int) (i10 * f10);
            } else {
                int length = strArr.length;
                int i13 = 0;
                while (i10 < length) {
                    float measureText2 = paint.measureText(strArr[i10]);
                    if (measureText2 > i13) {
                        i13 = (int) measureText2;
                    }
                    i10++;
                }
                i3 = i13;
            }
            TextView textView = this.f32654e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i3;
            if (this.f32669r != paddingRight) {
                int i14 = this.f32664n;
                if (paddingRight > i14) {
                    this.f32669r = paddingRight;
                } else {
                    this.f32669r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f32680y;
        if (strArr == null) {
            int i3 = this.I;
            ya0 ya0Var = this.M;
            if (ya0Var != null) {
                str = ya0Var.e(i3);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
            }
        } else {
            str = strArr[this.I - this.E];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f32654e;
            if (!str.equals(textView.getText().toString())) {
                textView.setText(str);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float width;
        int i3;
        int i10;
        float measuredHeight;
        boolean z10;
        int i11;
        int i12 = this.f32679x0;
        if (i12 == 5) {
            this.Q.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i12 == 3) {
            this.Q.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.Q.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.d;
        float f11 = this.T;
        int[] iArr = this.P;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String str = (String) this.O.get(iArr[i13]);
            if (str != null && (i13 != this.f32651c || this.f32654e.getVisibility() != 0)) {
                if (this.f32649b > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.Q.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f32646y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.Q.getTextSize() * (1.0f - interpolation);
                    if (!z10) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i11 = this.Q.getAlpha();
                        this.Q.setAlpha((int) ((i11 * interpolation) / 0.1f));
                    } else {
                        i11 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.Q);
                    canvas.restore();
                    if (i11 != -1) {
                        this.Q.setAlpha(i11);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.Q);
                }
            }
            f11 += this.R;
        }
        if (this.f32674u0) {
            canvas.drawRect(0.0f, this.f32665n0, getRight(), this.f32663l0 + i3, this.f32662k0);
            canvas.drawRect(0.0f, i10 - this.f32663l0, getRight(), this.f32666o0, this.f32662k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.f32654e.setVisibility(4);
        float y9 = motionEvent.getY();
        this.f32650b0 = y9;
        this.f32653d0 = y9;
        this.f32652c0 = motionEvent.getEventTime();
        float f10 = this.f32650b0;
        if (f10 < this.f32665n0) {
            if (this.m0 == 0) {
                bb0 bb0Var = this.f32670r0;
                bb0Var.a();
                bb0Var.f32155c = 1;
                bb0Var.f32154b = 2;
                ((cb0) bb0Var.d).postDelayed(bb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f32666o0 && this.m0 == 0) {
            bb0 bb0Var2 = this.f32670r0;
            bb0Var2.a();
            bb0Var2.f32155c = 1;
            bb0Var2.f32154b = 1;
            ((cb0) bb0Var2.d).postDelayed(bb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        al0 al0Var = this.U;
        if (!al0Var.f31890q) {
            al0Var.f31890q = true;
            this.V.f31890q = true;
            i(0);
            return true;
        }
        al0 al0Var2 = this.V;
        if (!al0Var2.f31890q) {
            al0Var.f31890q = true;
            al0Var2.f31890q = true;
            return true;
        }
        float f11 = this.f32650b0;
        if (f11 < this.f32665n0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f32648a0;
            if (runnable == null) {
                this.f32648a0 = new xa0(this);
            } else {
                removeCallbacks(runnable);
            }
            xa0 xa0Var = this.f32648a0;
            xa0Var.f40300a = false;
            postDelayed(xa0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f32666o0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.f32648a0;
            if (runnable2 == null) {
                this.f32648a0 = new xa0(this);
            } else {
                removeCallbacks(runnable2);
            }
            xa0 xa0Var2 = this.f32648a0;
            xa0Var2.f40300a = true;
            postDelayed(xa0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f32654e.getMeasuredWidth();
        int measuredHeight2 = this.f32654e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.f32654e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int[] iArr = this.P;
            int length = iArr.length;
            int i15 = this.f32676w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / iArr.length) + 0.5f);
            this.f32678x = bottom;
            this.R = bottom + i15;
            int top = (this.f32654e.getTop() + this.f32654e.getBaseline()) - (this.R * this.f32651c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.f32665n0 = ((getHeight() - i15) - this.f32678x) / 2;
            this.f32666o0 = ((getHeight() + i15) + this.f32678x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(g(i3, this.f32669r), g(i10, this.h));
        setMeasuredDimension(k(this.f32664n, getMeasuredWidth(), i3), k(this.f32656f, getMeasuredHeight(), i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f32655e0 == null) {
            this.f32655e0 = VelocityTracker.obtain();
        }
        this.f32655e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y9 = motionEvent.getY();
            if (this.m0 != 1) {
                if (((int) Math.abs(y9 - this.f32650b0)) > this.f32657f0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y9 - this.f32653d0));
                invalidate();
            }
            this.f32653d0 = y9;
            return true;
        }
        xa0 xa0Var = this.f32648a0;
        if (xa0Var != null) {
            removeCallbacks(xa0Var);
        }
        this.f32670r0.a();
        VelocityTracker velocityTracker = this.f32655e0;
        velocityTracker.computeCurrentVelocity(1000, this.f32659h0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f32658g0) {
            this.W = 0;
            if (yVelocity > 0) {
                this.U.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.U.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y10 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y10 - this.f32650b0);
            long eventTime = motionEvent.getEventTime() - this.f32652c0;
            if (abs <= this.f32657f0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i3 = (y10 / this.R) - this.f32651c;
                if (i3 > 0) {
                    a(true);
                    bb0 bb0Var = this.f32670r0;
                    bb0Var.a();
                    bb0Var.f32155c = 2;
                    bb0Var.f32154b = 1;
                    ((cb0) bb0Var.d).post(bb0Var);
                } else if (i3 < 0) {
                    a(false);
                    bb0 bb0Var2 = this.f32670r0;
                    bb0Var2.a();
                    bb0Var2.f32155c = 2;
                    bb0Var2.f32154b = 2;
                    ((cb0) bb0Var2.d).post(bb0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f32655e0.recycle();
        this.f32655e0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i3, int i10) {
        int[] iArr = this.P;
        boolean z10 = this.f32660i0;
        if (!z10 && i10 > 0 && iArr[this.f32651c] <= this.E) {
            int i11 = this.T + i10;
            int i12 = this.S;
            if (i11 > i12) {
                this.T = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.f32651c] >= this.G) {
            int i13 = this.T + i10;
            int i14 = this.S;
            if (i13 < i14) {
                this.T = i14;
                return;
            }
        }
        this.T += i10;
        while (true) {
            int i15 = this.T;
            if (i15 - this.S <= this.f32678x) {
                break;
            }
            this.T = i15 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.f32660i0 && i16 < this.E) {
                i16 = this.G;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.f32660i0 && iArr[this.f32651c] <= this.E) {
                int i17 = this.T;
                int i18 = this.S;
                if (i17 > i18) {
                    this.T = i18;
                }
            }
        }
        while (true) {
            int i19 = this.T;
            if (i19 - this.S < (-this.f32678x)) {
                this.T = i19 + this.R;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i20 = iArr[iArr.length - 2] + 1;
                if (this.f32660i0 && i20 > this.G) {
                    i20 = this.E;
                }
                iArr[iArr.length - 1] = i20;
                b(i20);
                if (!this.f32660i0 && iArr[this.f32651c] >= this.G) {
                    int i21 = this.T;
                    int i22 = this.S;
                    if (i21 < i22) {
                        this.T = i22;
                    }
                }
            } else {
                l(iArr[this.f32651c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i3) {
        this.f32677w0 = Integer.valueOf(i3);
        setWrapSelectorWheel(this.f32661j0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.v10 v10Var) {
        this.f32675v0 = v10Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f32680y == strArr) {
            return;
        }
        this.f32680y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f32674u0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f32654e.setEnabled(z10);
    }

    public void setFormatter(ya0 ya0Var) {
        if (ya0Var == this.M) {
            return;
        }
        this.M = ya0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i3) {
        this.f32679x0 = i3;
        super.setGravity(i3);
    }

    public void setItemCount(int i3) {
        if (this.f32649b == i3) {
            return;
        }
        this.f32649b = i3;
        this.f32651c = i3 / 2;
        this.P = new int[i3];
        f();
    }

    public void setMaxValue(int i3) {
        za0 za0Var;
        this.H = true;
        if (this.G != i3) {
            if (i3 >= 0) {
                this.G = i3;
                if (i3 < this.I) {
                    int i10 = this.J;
                    if (i3 >= i10) {
                        this.I = i10;
                    } else {
                        this.I = i3;
                    }
                }
                setWrapSelectorWheel(this.f32661j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (za0Var = this.L) != null) {
                    za0Var.d(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i3) {
        za0 za0Var;
        this.F = true;
        if (this.E != i3) {
            if (i3 >= 0) {
                this.E = i3;
                if (i3 > this.I) {
                    int i10 = this.J;
                    if (i3 <= i10) {
                        this.I = i10;
                    } else {
                        this.I = i3;
                    }
                }
                setWrapSelectorWheel(this.f32661j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (za0Var = this.L) != null) {
                    za0Var.d(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.N = j10;
    }

    public void setOnScrollListener(za0 za0Var) {
        this.L = za0Var;
    }

    public void setOnValueChangedListener(ab0 ab0Var) {
        this.K = ab0Var;
    }

    public void setSelectorColor(int i3) {
        this.f32647a = true;
        this.f32662k0.setColor(i3);
    }

    public void setTextColor(int i3) {
        org.telegram.ui.ActionBar.r6.r(this.f32654e);
        this.f32654e.setTextColor(i3);
        this.Q.setColor(i3);
    }

    public void setTextOffset(int i3) {
        this.d = i3;
        invalidate();
    }

    public void setValue(int i3) {
        l(i3, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb0.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.f32647a && (paint = this.f32662k0) != null) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f32673t0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public cb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(18, context, e6Var);
    }

    public cb0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32649b = 3;
        this.f32651c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.f32649b];
        this.S = Integer.MIN_VALUE;
        this.m0 = 0;
        this.f32672s0 = -1;
        this.f32674u0 = true;
        this.f32673t0 = e6Var;
        int L = org.telegram.messenger.g0.L(i3);
        this.f32676w = L;
        Paint paint = new Paint();
        this.f32662k0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        this.f32663l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f32656f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f32656f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f32664n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f32669r = -1;
        this.f32671s = true;
        this.f32670r0 = new bb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.f32654e = textView;
        textView.setGravity(17);
        this.f32654e.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(this.f32654e, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        this.f32654e.setBackgroundResource(0);
        float f10 = L;
        this.f32654e.setTextSize(0, f10);
        this.f32654e.setVisibility(4);
        addView(this.f32654e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f32657f0 = viewConfiguration.getScaledTouchSlop();
        this.f32658g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f32659h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.f32654e.getTypeface());
        paint2.setColor(this.f32654e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new al0(getContext(), null);
        this.V = new al0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new wa0(this));
    }
}
