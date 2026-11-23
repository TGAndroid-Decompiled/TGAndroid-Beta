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
public class qb0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public static final kr f38756y0 = new kr(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public ob0 K;
    public nb0 L;
    public mb0 M;
    public long N;
    public final SparseArray O;
    public int[] P;
    public final Paint Q;
    public int R;
    public int S;
    public int T;
    public final ll0 U;
    public final ll0 V;
    public int W;
    public boolean f38757a;
    public lb0 f38758a0;
    public int f38759b;
    public float f38760b0;
    public int f38761c;
    public long f38762c0;
    public int d;
    public float f38763d0;
    public final TextView f38764e;
    public VelocityTracker f38765e0;
    public final int f38766f;
    public final int f38767f0;
    public final int f38768g0;
    public final int h;
    public final int f38769h0;
    public boolean f38770i0;
    public boolean f38771j0;
    public final Paint f38772k0;
    public final int f38773l0;
    public int m0;
    public final int f38774n;
    public int f38775n0;
    public int f38776o0;
    public boolean f38777p0;
    public boolean f38778q0;
    public int f38779r;
    public final pb0 f38780r0;
    public final boolean f38781s;
    public int f38782s0;
    public final org.telegram.ui.ActionBar.i6 f38783t0;
    public boolean f38784u0;
    public org.telegram.messenger.x10 f38785v0;
    public final int f38786w;
    public Integer f38787w0;
    public int f38788x;
    public int f38789x0;
    public String[] f38790y;

    public qb0(LaunchActivity launchActivity) {
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
        this.f38764e.setVisibility(4);
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
            String[] strArr = this.f38790y;
            if (strArr != null) {
                str = strArr[i7 - i10];
            } else {
                mb0 mb0Var = this.M;
                if (mb0Var != null) {
                    str = mb0Var.e(i7);
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
        ll0 ll0Var = this.U;
        if (ll0Var.f37176q) {
            ll0Var = this.V;
            if (ll0Var.f37176q) {
                return;
            }
        }
        ll0Var.b();
        int i7 = ll0Var.f37170k;
        if (this.W == 0) {
            this.W = ll0Var.f37164c;
        }
        scrollBy(0, i7 - this.W);
        this.W = i7;
        if (ll0Var.f37176q) {
            if (ll0Var == this.U) {
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
        return this.f38764e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qb0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
            int i10 = (i7 - this.f38761c) + value;
            if (this.f38770i0) {
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
        return this.f38790y;
    }

    public int getItemsCount() {
        return this.f38759b;
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
        return this.f38770i0;
    }

    public final boolean h(ll0 ll0Var) {
        ll0Var.f37176q = true;
        int i7 = ll0Var.f37165e - ll0Var.f37170k;
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
            nb0 nb0Var = this.L;
            if (nb0Var != null) {
                nb0Var.f(i7);
            }
            if (i7 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f38790y;
                    if (strArr == null) {
                        int i10 = this.I;
                        mb0 mb0Var = this.M;
                        if (mb0Var != null) {
                            str = mb0Var.e(i10);
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
        lb0 lb0Var = this.f38758a0;
        if (lb0Var != null) {
            removeCallbacks(lb0Var);
        }
        this.f38780r0.a();
    }

    public final void l(int i7, boolean z10) {
        int min;
        nb0 nb0Var;
        ob0 ob0Var;
        if (this.I != i7) {
            if (this.f38770i0) {
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
            if (z10 && (ob0Var = this.K) != null) {
                ob0Var.o(this, this.I);
            }
            f();
            invalidate();
            if (this.m0 == 0 && (nb0Var = this.L) != null) {
                nb0Var.f(0);
            }
        }
    }

    public final void m() {
        int i7;
        if (this.f38781s) {
            String[] strArr = this.f38790y;
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
            TextView textView = this.f38764e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i7;
            if (this.f38779r != paddingRight) {
                int i14 = this.f38774n;
                if (paddingRight > i14) {
                    this.f38779r = paddingRight;
                } else {
                    this.f38779r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f38790y;
        if (strArr == null) {
            int i7 = this.I;
            mb0 mb0Var = this.M;
            if (mb0Var != null) {
                str = mb0Var.e(i7);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
            }
        } else {
            str = strArr[this.I - this.E];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f38764e;
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
        int i12 = this.f38789x0;
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
            if (str != null && (i13 != this.f38761c || this.f38764e.getVisibility() != 0)) {
                if (this.f38759b > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.Q.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f38756y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
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
        if (this.f38784u0) {
            canvas.drawRect(0.0f, this.f38775n0, getRight(), this.f38773l0 + i7, this.f38772k0);
            canvas.drawRect(0.0f, i10 - this.f38773l0, getRight(), this.f38776o0, this.f38772k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.f38764e.setVisibility(4);
        float y10 = motionEvent.getY();
        this.f38760b0 = y10;
        this.f38763d0 = y10;
        this.f38762c0 = motionEvent.getEventTime();
        float f10 = this.f38760b0;
        if (f10 < this.f38775n0) {
            if (this.m0 == 0) {
                pb0 pb0Var = this.f38780r0;
                pb0Var.a();
                pb0Var.f38446c = 1;
                pb0Var.f38445b = 2;
                ((qb0) pb0Var.d).postDelayed(pb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f38776o0 && this.m0 == 0) {
            pb0 pb0Var2 = this.f38780r0;
            pb0Var2.a();
            pb0Var2.f38446c = 1;
            pb0Var2.f38445b = 1;
            ((qb0) pb0Var2.d).postDelayed(pb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ll0 ll0Var = this.U;
        if (!ll0Var.f37176q) {
            ll0Var.f37176q = true;
            this.V.f37176q = true;
            i(0);
            return true;
        }
        ll0 ll0Var2 = this.V;
        if (!ll0Var2.f37176q) {
            ll0Var.f37176q = true;
            ll0Var2.f37176q = true;
            return true;
        }
        float f11 = this.f38760b0;
        if (f11 < this.f38775n0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f38758a0;
            if (runnable == null) {
                this.f38758a0 = new lb0(this);
            } else {
                removeCallbacks(runnable);
            }
            lb0 lb0Var = this.f38758a0;
            lb0Var.f37101a = false;
            postDelayed(lb0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f38776o0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.f38758a0;
            if (runnable2 == null) {
                this.f38758a0 = new lb0(this);
            } else {
                removeCallbacks(runnable2);
            }
            lb0 lb0Var2 = this.f38758a0;
            lb0Var2.f37101a = true;
            postDelayed(lb0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f38764e.getMeasuredWidth();
        int measuredHeight2 = this.f38764e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.f38764e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int[] iArr = this.P;
            int length = iArr.length;
            int i15 = this.f38786w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / iArr.length) + 0.5f);
            this.f38788x = bottom;
            this.R = bottom + i15;
            int top = (this.f38764e.getTop() + this.f38764e.getBaseline()) - (this.R * this.f38761c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.f38775n0 = ((getHeight() - i15) - this.f38788x) / 2;
            this.f38776o0 = ((getHeight() + i15) + this.f38788x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(g(i7, this.f38779r), g(i10, this.h));
        setMeasuredDimension(k(this.f38774n, getMeasuredWidth(), i7), k(this.f38766f, getMeasuredHeight(), i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f38765e0 == null) {
            this.f38765e0 = VelocityTracker.obtain();
        }
        this.f38765e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.m0 != 1) {
                if (((int) Math.abs(y10 - this.f38760b0)) > this.f38767f0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y10 - this.f38763d0));
                invalidate();
            }
            this.f38763d0 = y10;
            return true;
        }
        lb0 lb0Var = this.f38758a0;
        if (lb0Var != null) {
            removeCallbacks(lb0Var);
        }
        this.f38780r0.a();
        VelocityTracker velocityTracker = this.f38765e0;
        velocityTracker.computeCurrentVelocity(1000, this.f38769h0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f38768g0) {
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
            int abs = (int) Math.abs(y11 - this.f38760b0);
            long eventTime = motionEvent.getEventTime() - this.f38762c0;
            if (abs <= this.f38767f0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i7 = (y11 / this.R) - this.f38761c;
                if (i7 > 0) {
                    a(true);
                    pb0 pb0Var = this.f38780r0;
                    pb0Var.a();
                    pb0Var.f38446c = 2;
                    pb0Var.f38445b = 1;
                    ((qb0) pb0Var.d).post(pb0Var);
                } else if (i7 < 0) {
                    a(false);
                    pb0 pb0Var2 = this.f38780r0;
                    pb0Var2.a();
                    pb0Var2.f38446c = 2;
                    pb0Var2.f38445b = 2;
                    ((qb0) pb0Var2.d).post(pb0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f38765e0.recycle();
        this.f38765e0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        int[] iArr = this.P;
        boolean z10 = this.f38770i0;
        if (!z10 && i10 > 0 && iArr[this.f38761c] <= this.E) {
            int i11 = this.T + i10;
            int i12 = this.S;
            if (i11 > i12) {
                this.T = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.f38761c] >= this.G) {
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
            if (i15 - this.S <= this.f38788x) {
                break;
            }
            this.T = i15 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.f38770i0 && i16 < this.E) {
                i16 = this.G;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.f38770i0 && iArr[this.f38761c] <= this.E) {
                int i17 = this.T;
                int i18 = this.S;
                if (i17 > i18) {
                    this.T = i18;
                }
            }
        }
        while (true) {
            int i19 = this.T;
            if (i19 - this.S < (-this.f38788x)) {
                this.T = i19 + this.R;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i20 = iArr[iArr.length - 2] + 1;
                if (this.f38770i0 && i20 > this.G) {
                    i20 = this.E;
                }
                iArr[iArr.length - 1] = i20;
                b(i20);
                if (!this.f38770i0 && iArr[this.f38761c] >= this.G) {
                    int i21 = this.T;
                    int i22 = this.S;
                    if (i21 < i22) {
                        this.T = i22;
                    }
                }
            } else {
                l(iArr[this.f38761c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i7) {
        this.f38787w0 = Integer.valueOf(i7);
        setWrapSelectorWheel(this.f38771j0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.x10 x10Var) {
        this.f38785v0 = x10Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f38790y == strArr) {
            return;
        }
        this.f38790y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f38784u0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f38764e.setEnabled(z10);
    }

    public void setFormatter(mb0 mb0Var) {
        if (mb0Var == this.M) {
            return;
        }
        this.M = mb0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i7) {
        this.f38789x0 = i7;
        super.setGravity(i7);
    }

    public void setItemCount(int i7) {
        if (this.f38759b == i7) {
            return;
        }
        this.f38759b = i7;
        this.f38761c = i7 / 2;
        this.P = new int[i7];
        f();
    }

    public void setMaxValue(int i7) {
        nb0 nb0Var;
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
                setWrapSelectorWheel(this.f38771j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (nb0Var = this.L) != null) {
                    nb0Var.f(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i7) {
        nb0 nb0Var;
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
                setWrapSelectorWheel(this.f38771j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (nb0Var = this.L) != null) {
                    nb0Var.f(0);
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

    public void setOnScrollListener(nb0 nb0Var) {
        this.L = nb0Var;
    }

    public void setOnValueChangedListener(ob0 ob0Var) {
        this.K = ob0Var;
    }

    public void setSelectorColor(int i7) {
        this.f38757a = true;
        this.f38772k0.setColor(i7);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.u6.q(this.f38764e);
        this.f38764e.setTextColor(i7);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qb0.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.f38757a && (paint = this.f38772k0) != null) {
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f38783t0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public qb0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(18, context, i6Var);
    }

    public qb0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f38759b = 3;
        this.f38761c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.f38759b];
        this.S = Integer.MIN_VALUE;
        this.m0 = 0;
        this.f38782s0 = -1;
        this.f38784u0 = true;
        this.f38783t0 = i6Var;
        int L = org.telegram.messenger.g0.L(i7);
        this.f38786w = L;
        Paint paint = new Paint();
        this.f38772k0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        this.f38773l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f38766f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f38766f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f38774n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f38779r = -1;
        this.f38781s = true;
        this.f38780r0 = new pb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.f38764e = textView;
        textView.setGravity(17);
        this.f38764e.setSingleLine(true);
        org.telegram.ui.ActionBar.u6.U(this.f38764e, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        this.f38764e.setBackgroundResource(0);
        float f10 = L;
        this.f38764e.setTextSize(0, f10);
        this.f38764e.setVisibility(4);
        addView(this.f38764e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f38767f0 = viewConfiguration.getScaledTouchSlop();
        this.f38768g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f38769h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.f38764e.getTypeface());
        paint2.setColor(this.f38764e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new ll0(getContext(), null);
        this.V = new ll0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new kb0(this));
    }
}
