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
public class sb0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public static final lr f39557y0 = new lr(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public qb0 K;
    public pb0 L;
    public ob0 M;
    public long N;
    public final SparseArray O;
    public int[] P;
    public final Paint Q;
    public int R;
    public int S;
    public int T;
    public final jl0 U;
    public final jl0 V;
    public int W;
    public boolean f39558a;
    public nb0 f39559a0;
    public int f39560b;
    public float f39561b0;
    public int f39562c;
    public long f39563c0;
    public int d;
    public float f39564d0;
    public final TextView f39565e;
    public VelocityTracker f39566e0;
    public final int f39567f;
    public final int f39568f0;
    public final int f39569g0;
    public final int h;
    public final int f39570h0;
    public boolean f39571i0;
    public boolean f39572j0;
    public final Paint f39573k0;
    public final int f39574l0;
    public int m0;
    public final int f39575n;
    public int f39576n0;
    public int f39577o0;
    public boolean f39578p0;
    public boolean f39579q0;
    public int f39580r;
    public final rb0 f39581r0;
    public final boolean f39582s;
    public int f39583s0;
    public final org.telegram.ui.ActionBar.i6 f39584t0;
    public boolean f39585u0;
    public org.telegram.messenger.y10 f39586v0;
    public final int f39587w;
    public Integer f39588w0;
    public int f39589x;
    public int f39590x0;
    public String[] f39591y;

    public sb0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i7, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(i5.c.i(mode, "Unknown measure mode: "));
                    }
                } else {
                    return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                }
            } else {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
            }
        }
        return i7;
    }

    public static int k(int i7, int i10, int i11) {
        if (i7 != -1) {
            int max = Math.max(i7, i10);
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
        this.f39565e.setVisibility(4);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    public final void b(int i7) {
        String str;
        SparseArray sparseArray = this.O;
        if (((String) sparseArray.get(i7)) != null) {
            return;
        }
        int i10 = this.E;
        if (i7 >= i10 && i7 <= this.G) {
            String[] strArr = this.f39591y;
            if (strArr != null) {
                str = strArr[i7 - i10];
            } else {
                ob0 ob0Var = this.M;
                if (ob0Var != null) {
                    str = ob0Var.i(i7);
                } else {
                    str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
                }
            }
        } else {
            str = "";
        }
        sparseArray.put(i7, str);
    }

    public final boolean c() {
        int i7 = this.S - this.T;
        if (i7 == 0) {
            return false;
        }
        this.W = 0;
        int abs = Math.abs(i7);
        int i10 = this.R;
        if (abs > i10 / 2) {
            if (i7 > 0) {
                i10 = -i10;
            }
            i7 += i10;
        }
        this.V.d(i7, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        jl0 jl0Var = this.U;
        if (jl0Var.f36481q) {
            jl0Var = this.V;
            if (jl0Var.f36481q) {
                return;
            }
        }
        jl0Var.b();
        int i7 = jl0Var.f36475k;
        if (this.W == 0) {
            this.W = jl0Var.f36469c;
        }
        scrollBy(0, i7 - this.W);
        this.W = i7;
        if (jl0Var.f36481q) {
            if (jl0Var == this.U) {
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

    public CharSequence d(int i7) {
        return this.f39565e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sb0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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

    public final int e(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.H && i7 > (i13 = this.G) && (i15 = i13 - (i14 = this.E)) != 0) {
            return (((i7 - i13) % i15) + i14) - 1;
        }
        if (this.F && i7 < (i10 = this.E) && (i12 = (i11 = this.G) - i10) != 0) {
            return (i11 - ((i10 - i7) % i12)) + 1;
        }
        return i7;
    }

    public final void f() {
        this.O.clear();
        int[] iArr = this.P;
        int value = getValue();
        for (int i7 = 0; i7 < this.P.length; i7++) {
            int i10 = (i7 - this.f39562c) + value;
            if (this.f39571i0) {
                i10 = e(i10);
            }
            iArr[i7] = i10;
            b(i10);
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f39591y;
    }

    public int getItemsCount() {
        return this.f39560b;
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
        return this.f39571i0;
    }

    public final boolean h(jl0 jl0Var) {
        jl0Var.f36481q = true;
        int i7 = jl0Var.f36470e - jl0Var.f36475k;
        int i10 = this.S - ((this.T + i7) % this.R);
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
        scrollBy(0, i7 + i10);
        return true;
    }

    public final void i(int i7) {
        String str;
        if (this.m0 != i7) {
            this.m0 = i7;
            pb0 pb0Var = this.L;
            if (pb0Var != null) {
                pb0Var.i(i7);
            }
            if (i7 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f39591y;
                    if (strArr == null) {
                        int i10 = this.I;
                        ob0 ob0Var = this.M;
                        if (ob0Var != null) {
                            str = ob0Var.i(i10);
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
        nb0 nb0Var = this.f39559a0;
        if (nb0Var != null) {
            removeCallbacks(nb0Var);
        }
        this.f39581r0.a();
    }

    public final void l(int i7, boolean z10) {
        int min;
        pb0 pb0Var;
        qb0 qb0Var;
        if (this.I != i7) {
            if (this.f39571i0) {
                min = e(i7);
            } else {
                min = Math.min(Math.max(i7, this.E), this.G);
            }
            int i10 = this.I;
            this.J = min;
            this.I = min;
            n();
            if (Math.abs(i10 - min) > 0.9f) {
                org.telegram.messenger.g0.a4(this);
            }
            if (z10 && (qb0Var = this.K) != null) {
                qb0Var.n(this, this.I);
            }
            f();
            invalidate();
            if (this.m0 == 0 && (pb0Var = this.L) != null) {
                pb0Var.i(0);
            }
        }
    }

    public final void m() {
        int i7;
        if (this.f39582s) {
            String[] strArr = this.f39591y;
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
                i7 = (int) (i10 * f10);
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
                i7 = i13;
            }
            TextView textView = this.f39565e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i7;
            if (this.f39580r != paddingRight) {
                int i14 = this.f39575n;
                if (paddingRight > i14) {
                    this.f39580r = paddingRight;
                } else {
                    this.f39580r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f39591y;
        if (strArr == null) {
            int i7 = this.I;
            ob0 ob0Var = this.M;
            if (ob0Var != null) {
                str = ob0Var.i(i7);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
            }
        } else {
            str = strArr[this.I - this.E];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f39565e;
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
        int i7;
        int i10;
        float measuredHeight;
        boolean z10;
        int i11;
        int i12 = this.f39590x0;
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
            if (str != null && (i13 != this.f39562c || this.f39565e.getVisibility() != 0)) {
                if (this.f39560b > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.Q.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f39557y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
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
        if (this.f39585u0) {
            canvas.drawRect(0.0f, this.f39576n0, getRight(), this.f39574l0 + i7, this.f39573k0);
            canvas.drawRect(0.0f, i10 - this.f39574l0, getRight(), this.f39577o0, this.f39573k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.f39565e.setVisibility(4);
        float y10 = motionEvent.getY();
        this.f39561b0 = y10;
        this.f39564d0 = y10;
        this.f39563c0 = motionEvent.getEventTime();
        float f10 = this.f39561b0;
        if (f10 < this.f39576n0) {
            if (this.m0 == 0) {
                rb0 rb0Var = this.f39581r0;
                rb0Var.a();
                rb0Var.f39089c = 1;
                rb0Var.f39088b = 2;
                ((sb0) rb0Var.d).postDelayed(rb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f39577o0 && this.m0 == 0) {
            rb0 rb0Var2 = this.f39581r0;
            rb0Var2.a();
            rb0Var2.f39089c = 1;
            rb0Var2.f39088b = 1;
            ((sb0) rb0Var2.d).postDelayed(rb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        jl0 jl0Var = this.U;
        if (!jl0Var.f36481q) {
            jl0Var.f36481q = true;
            this.V.f36481q = true;
            i(0);
            return true;
        }
        jl0 jl0Var2 = this.V;
        if (!jl0Var2.f36481q) {
            jl0Var.f36481q = true;
            jl0Var2.f36481q = true;
            return true;
        }
        float f11 = this.f39561b0;
        if (f11 < this.f39576n0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f39559a0;
            if (runnable == null) {
                this.f39559a0 = new nb0(this);
            } else {
                removeCallbacks(runnable);
            }
            nb0 nb0Var = this.f39559a0;
            nb0Var.f37758a = false;
            postDelayed(nb0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f39577o0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.f39559a0;
            if (runnable2 == null) {
                this.f39559a0 = new nb0(this);
            } else {
                removeCallbacks(runnable2);
            }
            nb0 nb0Var2 = this.f39559a0;
            nb0Var2.f37758a = true;
            postDelayed(nb0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f39565e.getMeasuredWidth();
        int measuredHeight2 = this.f39565e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.f39565e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int[] iArr = this.P;
            int length = iArr.length;
            int i15 = this.f39587w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / iArr.length) + 0.5f);
            this.f39589x = bottom;
            this.R = bottom + i15;
            int top = (this.f39565e.getTop() + this.f39565e.getBaseline()) - (this.R * this.f39562c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.f39576n0 = ((getHeight() - i15) - this.f39589x) / 2;
            this.f39577o0 = ((getHeight() + i15) + this.f39589x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(g(i7, this.f39580r), g(i10, this.h));
        setMeasuredDimension(k(this.f39575n, getMeasuredWidth(), i7), k(this.f39567f, getMeasuredHeight(), i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f39566e0 == null) {
            this.f39566e0 = VelocityTracker.obtain();
        }
        this.f39566e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.m0 != 1) {
                if (((int) Math.abs(y10 - this.f39561b0)) > this.f39568f0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y10 - this.f39564d0));
                invalidate();
            }
            this.f39564d0 = y10;
            return true;
        }
        nb0 nb0Var = this.f39559a0;
        if (nb0Var != null) {
            removeCallbacks(nb0Var);
        }
        this.f39581r0.a();
        VelocityTracker velocityTracker = this.f39566e0;
        velocityTracker.computeCurrentVelocity(1000, this.f39570h0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f39569g0) {
            this.W = 0;
            if (yVelocity > 0) {
                this.U.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.U.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y11 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y11 - this.f39561b0);
            long eventTime = motionEvent.getEventTime() - this.f39563c0;
            if (abs <= this.f39568f0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i7 = (y11 / this.R) - this.f39562c;
                if (i7 > 0) {
                    a(true);
                    rb0 rb0Var = this.f39581r0;
                    rb0Var.a();
                    rb0Var.f39089c = 2;
                    rb0Var.f39088b = 1;
                    ((sb0) rb0Var.d).post(rb0Var);
                } else if (i7 < 0) {
                    a(false);
                    rb0 rb0Var2 = this.f39581r0;
                    rb0Var2.a();
                    rb0Var2.f39089c = 2;
                    rb0Var2.f39088b = 2;
                    ((sb0) rb0Var2.d).post(rb0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f39566e0.recycle();
        this.f39566e0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        int[] iArr = this.P;
        boolean z10 = this.f39571i0;
        if (!z10 && i10 > 0 && iArr[this.f39562c] <= this.E) {
            int i11 = this.T + i10;
            int i12 = this.S;
            if (i11 > i12) {
                this.T = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.f39562c] >= this.G) {
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
            if (i15 - this.S <= this.f39589x) {
                break;
            }
            this.T = i15 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.f39571i0 && i16 < this.E) {
                i16 = this.G;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.f39571i0 && iArr[this.f39562c] <= this.E) {
                int i17 = this.T;
                int i18 = this.S;
                if (i17 > i18) {
                    this.T = i18;
                }
            }
        }
        while (true) {
            int i19 = this.T;
            if (i19 - this.S < (-this.f39589x)) {
                this.T = i19 + this.R;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i20 = iArr[iArr.length - 2] + 1;
                if (this.f39571i0 && i20 > this.G) {
                    i20 = this.E;
                }
                iArr[iArr.length - 1] = i20;
                b(i20);
                if (!this.f39571i0 && iArr[this.f39562c] >= this.G) {
                    int i21 = this.T;
                    int i22 = this.S;
                    if (i21 < i22) {
                        this.T = i22;
                    }
                }
            } else {
                l(iArr[this.f39562c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i7) {
        this.f39588w0 = Integer.valueOf(i7);
        setWrapSelectorWheel(this.f39572j0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.y10 y10Var) {
        this.f39586v0 = y10Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f39591y == strArr) {
            return;
        }
        this.f39591y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f39585u0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f39565e.setEnabled(z10);
    }

    public void setFormatter(ob0 ob0Var) {
        if (ob0Var == this.M) {
            return;
        }
        this.M = ob0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i7) {
        this.f39590x0 = i7;
        super.setGravity(i7);
    }

    public void setItemCount(int i7) {
        if (this.f39560b == i7) {
            return;
        }
        this.f39560b = i7;
        this.f39562c = i7 / 2;
        this.P = new int[i7];
        f();
    }

    public void setMaxValue(int i7) {
        pb0 pb0Var;
        this.H = true;
        if (this.G != i7) {
            if (i7 >= 0) {
                this.G = i7;
                if (i7 < this.I) {
                    int i10 = this.J;
                    if (i7 >= i10) {
                        this.I = i10;
                    } else {
                        this.I = i7;
                    }
                }
                setWrapSelectorWheel(this.f39572j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (pb0Var = this.L) != null) {
                    pb0Var.i(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i7) {
        pb0 pb0Var;
        this.F = true;
        if (this.E != i7) {
            if (i7 >= 0) {
                this.E = i7;
                if (i7 > this.I) {
                    int i10 = this.J;
                    if (i7 <= i10) {
                        this.I = i10;
                    } else {
                        this.I = i7;
                    }
                }
                setWrapSelectorWheel(this.f39572j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (pb0Var = this.L) != null) {
                    pb0Var.i(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j3) {
        this.N = j3;
    }

    public void setOnScrollListener(pb0 pb0Var) {
        this.L = pb0Var;
    }

    public void setOnValueChangedListener(qb0 qb0Var) {
        this.K = qb0Var;
    }

    public void setSelectorColor(int i7) {
        this.f39558a = true;
        this.f39573k0.setColor(i7);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.u6.q(this.f39565e);
        this.f39565e.setTextColor(i7);
        this.Q.setColor(i7);
    }

    public void setTextOffset(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setValue(int i7) {
        l(i7, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sb0.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.f39558a && (paint = this.f39573k0) != null) {
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f39584t0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public sb0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(18, context, i6Var);
    }

    public sb0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f39560b = 3;
        this.f39562c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.f39560b];
        this.S = Integer.MIN_VALUE;
        this.m0 = 0;
        this.f39583s0 = -1;
        this.f39585u0 = true;
        this.f39584t0 = i6Var;
        int L = org.telegram.messenger.g0.L(i7);
        this.f39587w = L;
        Paint paint = new Paint();
        this.f39573k0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        this.f39574l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f39567f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f39567f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f39575n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f39580r = -1;
        this.f39582s = true;
        this.f39581r0 = new rb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.f39565e = textView;
        textView.setGravity(17);
        this.f39565e.setSingleLine(true);
        org.telegram.ui.ActionBar.u6.U(this.f39565e, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        this.f39565e.setBackgroundResource(0);
        float f10 = L;
        this.f39565e.setTextSize(0, f10);
        this.f39565e.setVisibility(4);
        addView(this.f39565e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f39568f0 = viewConfiguration.getScaledTouchSlop();
        this.f39569g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f39570h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.f39565e.getTypeface());
        paint2.setColor(this.f39565e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new jl0(getContext(), null);
        this.V = new jl0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new mb0(this));
    }
}
