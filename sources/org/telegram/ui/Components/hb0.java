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
public class hb0 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public static final xq f34203x0 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
    public int D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public fb0 J;
    public eb0 K;
    public db0 L;
    public long M;
    public final SparseArray N;
    public int[] O;
    public final Paint P;
    public int Q;
    public int R;
    public int S;
    public final wk0 T;
    public final wk0 U;
    public int V;
    public cb0 W;
    public boolean f34204a;
    public float f34205a0;
    public int f34206b;
    public long f34207b0;
    public int f34208c;
    public float f34209c0;
    public int d;
    public VelocityTracker f34210d0;
    public final TextView f34211e;
    public final int f34212e0;
    public final int f34213f;
    public final int f34214f0;
    public final int f34215g0;
    public final int h;
    public boolean f34216h0;
    public boolean f34217i0;
    public final Paint f34218j0;
    public final int f34219k0;
    public int f34220l0;
    public int m0;
    public final int f34221n;
    public int f34222n0;
    public boolean f34223o0;
    public boolean f34224p0;
    public final gb0 f34225q0;
    public int f34226r;
    public int f34227r0;
    public final boolean f34228s;
    public final org.telegram.ui.ActionBar.f6 f34229s0;
    public boolean f34230t0;
    public org.telegram.messenger.d20 f34231u0;
    public Integer f34232v0;
    public final int f34233w;
    public int f34234w0;
    public int f34235x;
    public String[] f34236y;

    public hb0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i7, int i10) {
        if (i10 != -1) {
            int size = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(jg.g.j(mode, "Unknown measure mode: "));
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

    public final void a(boolean z9) {
        this.f34211e.setVisibility(4);
        if (!h(this.T)) {
            h(this.U);
        }
        this.V = 0;
        if (z9) {
            this.T.d(-this.Q, 300);
        } else {
            this.T.d(this.Q, 300);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    public final void b(int i7) {
        String str;
        SparseArray sparseArray = this.N;
        if (((String) sparseArray.get(i7)) != null) {
            return;
        }
        int i10 = this.D;
        if (i7 >= i10 && i7 <= this.F) {
            String[] strArr = this.f34236y;
            if (strArr != null) {
                str = strArr[i7 - i10];
            } else {
                db0 db0Var = this.L;
                if (db0Var != null) {
                    str = db0Var.h(i7);
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
        int i7 = this.R - this.S;
        if (i7 == 0) {
            return false;
        }
        this.V = 0;
        int abs = Math.abs(i7);
        int i10 = this.Q;
        if (abs > i10 / 2) {
            if (i7 > 0) {
                i10 = -i10;
            }
            i7 += i10;
        }
        this.U.d(i7, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        wk0 wk0Var = this.T;
        if (wk0Var.f40036q) {
            wk0Var = this.U;
            if (wk0Var.f40036q) {
                return;
            }
        }
        wk0Var.b();
        int i7 = wk0Var.f40030k;
        if (this.V == 0) {
            this.V = wk0Var.f40024c;
        }
        scrollBy(0, i7 - this.V);
        this.V = i7;
        if (wk0Var.f40036q) {
            if (wk0Var == this.T) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.f34220l0 != 1) {
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
        return this.S;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.F - this.D) + 1) * this.Q;
    }

    public CharSequence d(int i7) {
        return this.f34211e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hb0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        if (this.G && i7 > (i13 = this.F) && (i15 = i13 - (i14 = this.D)) != 0) {
            return (((i7 - i13) % i15) + i14) - 1;
        }
        if (this.E && i7 < (i10 = this.D) && (i12 = (i11 = this.F) - i10) != 0) {
            return (i11 - ((i10 - i7) % i12)) + 1;
        }
        return i7;
    }

    public final void f() {
        this.N.clear();
        int[] iArr = this.O;
        int value = getValue();
        for (int i7 = 0; i7 < this.O.length; i7++) {
            int i10 = (i7 - this.f34208c) + value;
            if (this.f34216h0) {
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
        return this.f34236y;
    }

    public int getItemsCount() {
        return this.f34206b;
    }

    public int getMaxValue() {
        return this.F;
    }

    public int getMinValue() {
        return this.D;
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
        return this.H;
    }

    public boolean getWrapSelectorWheel() {
        return this.f34216h0;
    }

    public final boolean h(wk0 wk0Var) {
        wk0Var.f40036q = true;
        int i7 = wk0Var.f40025e - wk0Var.f40030k;
        int i10 = this.R - ((this.S + i7) % this.Q);
        if (i10 == 0) {
            return false;
        }
        int abs = Math.abs(i10);
        int i11 = this.Q;
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
        if (this.f34220l0 != i7) {
            this.f34220l0 = i7;
            eb0 eb0Var = this.K;
            if (eb0Var != null) {
                eb0Var.d(i7);
            }
            if (i7 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f34236y;
                    if (strArr == null) {
                        int i10 = this.H;
                        db0 db0Var = this.L;
                        if (db0Var != null) {
                            str = db0Var.h(i10);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
                        }
                    } else {
                        str = strArr[this.H - this.D];
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
        cb0 cb0Var = this.W;
        if (cb0Var != null) {
            removeCallbacks(cb0Var);
        }
        this.f34225q0.a();
    }

    public final void l(int i7, boolean z9) {
        int min;
        eb0 eb0Var;
        fb0 fb0Var;
        if (this.H != i7) {
            if (this.f34216h0) {
                min = e(i7);
            } else {
                min = Math.min(Math.max(i7, this.D), this.F);
            }
            int i10 = this.H;
            this.I = min;
            this.H = min;
            n();
            if (Math.abs(i10 - min) > 0.9f) {
                org.telegram.messenger.g0.c4(this);
            }
            if (z9 && (fb0Var = this.J) != null) {
                fb0Var.n(this, this.H);
            }
            f();
            invalidate();
            if (this.f34220l0 == 0 && (eb0Var = this.K) != null) {
                eb0Var.d(0);
            }
        }
    }

    public final void m() {
        int i7;
        if (this.f34228s) {
            String[] strArr = this.f34236y;
            Paint paint = this.P;
            int i10 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i11 = 0; i11 <= 9; i11++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i12 = this.F; i12 > 0; i12 /= 10) {
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
            TextView textView = this.f34211e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i7;
            if (this.f34226r != paddingRight) {
                int i14 = this.f34221n;
                if (paddingRight > i14) {
                    this.f34226r = paddingRight;
                } else {
                    this.f34226r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f34236y;
        if (strArr == null) {
            int i7 = this.H;
            db0 db0Var = this.L;
            if (db0Var != null) {
                str = db0Var.h(i7);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
            }
        } else {
            str = strArr[this.H - this.D];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f34211e;
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
        boolean z9;
        int i11;
        int i12 = this.f34234w0;
        if (i12 == 5) {
            this.P.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i12 == 3) {
            this.P.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.P.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.d;
        float f11 = this.S;
        int[] iArr = this.O;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String str = (String) this.N.get(iArr[i13]);
            if (str != null && (i13 != this.f34208c || this.f34211e.getVisibility() != 0)) {
                if (this.f34206b > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.P.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z9 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z9 = false;
                    }
                    float interpolation = f34203x0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.P.getTextSize() * (1.0f - interpolation);
                    if (!z9) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i11 = this.P.getAlpha();
                        this.P.setAlpha((int) ((i11 * interpolation) / 0.1f));
                    } else {
                        i11 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.P);
                    canvas.restore();
                    if (i11 != -1) {
                        this.P.setAlpha(i11);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.P);
                }
            }
            f11 += this.Q;
        }
        if (this.f34230t0) {
            canvas.drawRect(0.0f, this.m0, getRight(), this.f34219k0 + i7, this.f34218j0);
            canvas.drawRect(0.0f, i10 - this.f34219k0, getRight(), this.f34222n0, this.f34218j0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.f34211e.setVisibility(4);
        float y10 = motionEvent.getY();
        this.f34205a0 = y10;
        this.f34209c0 = y10;
        this.f34207b0 = motionEvent.getEventTime();
        float f10 = this.f34205a0;
        if (f10 < this.m0) {
            if (this.f34220l0 == 0) {
                gb0 gb0Var = this.f34225q0;
                gb0Var.a();
                gb0Var.f33881c = 1;
                gb0Var.f33880b = 2;
                ((hb0) gb0Var.d).postDelayed(gb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f34222n0 && this.f34220l0 == 0) {
            gb0 gb0Var2 = this.f34225q0;
            gb0Var2.a();
            gb0Var2.f33881c = 1;
            gb0Var2.f33880b = 1;
            ((hb0) gb0Var2.d).postDelayed(gb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        wk0 wk0Var = this.T;
        if (!wk0Var.f40036q) {
            wk0Var.f40036q = true;
            this.U.f40036q = true;
            i(0);
            return true;
        }
        wk0 wk0Var2 = this.U;
        if (!wk0Var2.f40036q) {
            wk0Var.f40036q = true;
            wk0Var2.f40036q = true;
            return true;
        }
        float f11 = this.f34205a0;
        if (f11 < this.m0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.W;
            if (runnable == null) {
                this.W = new cb0(this);
            } else {
                removeCallbacks(runnable);
            }
            cb0 cb0Var = this.W;
            cb0Var.f32517a = false;
            postDelayed(cb0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f34222n0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.W;
            if (runnable2 == null) {
                this.W = new cb0(this);
            } else {
                removeCallbacks(runnable2);
            }
            cb0 cb0Var2 = this.W;
            cb0Var2.f32517a = true;
            postDelayed(cb0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f34211e.getMeasuredWidth();
        int measuredHeight2 = this.f34211e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.f34211e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z9) {
            f();
            int[] iArr = this.O;
            int length = iArr.length;
            int i15 = this.f34233w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / iArr.length) + 0.5f);
            this.f34235x = bottom;
            this.Q = bottom + i15;
            int top = (this.f34211e.getTop() + this.f34211e.getBaseline()) - (this.Q * this.f34208c);
            this.R = top;
            this.S = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.m0 = ((getHeight() - i15) - this.f34235x) / 2;
            this.f34222n0 = ((getHeight() + i15) + this.f34235x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(g(i7, this.f34226r), g(i10, this.h));
        setMeasuredDimension(k(this.f34221n, getMeasuredWidth(), i7), k(this.f34213f, getMeasuredHeight(), i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f34210d0 == null) {
            this.f34210d0 = VelocityTracker.obtain();
        }
        this.f34210d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.f34220l0 != 1) {
                if (((int) Math.abs(y10 - this.f34205a0)) > this.f34212e0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y10 - this.f34209c0));
                invalidate();
            }
            this.f34209c0 = y10;
            return true;
        }
        cb0 cb0Var = this.W;
        if (cb0Var != null) {
            removeCallbacks(cb0Var);
        }
        this.f34225q0.a();
        VelocityTracker velocityTracker = this.f34210d0;
        velocityTracker.computeCurrentVelocity(1000, this.f34215g0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f34214f0) {
            this.V = 0;
            if (yVelocity > 0) {
                this.T.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.T.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y11 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y11 - this.f34205a0);
            long eventTime = motionEvent.getEventTime() - this.f34207b0;
            if (abs <= this.f34212e0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i7 = (y11 / this.Q) - this.f34208c;
                if (i7 > 0) {
                    a(true);
                    gb0 gb0Var = this.f34225q0;
                    gb0Var.a();
                    gb0Var.f33881c = 2;
                    gb0Var.f33880b = 1;
                    ((hb0) gb0Var.d).post(gb0Var);
                } else if (i7 < 0) {
                    a(false);
                    gb0 gb0Var2 = this.f34225q0;
                    gb0Var2.a();
                    gb0Var2.f33881c = 2;
                    gb0Var2.f33880b = 2;
                    ((hb0) gb0Var2.d).post(gb0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f34210d0.recycle();
        this.f34210d0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        int[] iArr = this.O;
        boolean z9 = this.f34216h0;
        if (!z9 && i10 > 0 && iArr[this.f34208c] <= this.D) {
            int i11 = this.S + i10;
            int i12 = this.R;
            if (i11 > i12) {
                this.S = i12;
                return;
            }
        }
        if (!z9 && i10 < 0 && iArr[this.f34208c] >= this.F) {
            int i13 = this.S + i10;
            int i14 = this.R;
            if (i13 < i14) {
                this.S = i14;
                return;
            }
        }
        this.S += i10;
        while (true) {
            int i15 = this.S;
            if (i15 - this.R <= this.f34235x) {
                break;
            }
            this.S = i15 - this.Q;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.f34216h0 && i16 < this.D) {
                i16 = this.F;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.f34216h0 && iArr[this.f34208c] <= this.D) {
                int i17 = this.S;
                int i18 = this.R;
                if (i17 > i18) {
                    this.S = i18;
                }
            }
        }
        while (true) {
            int i19 = this.S;
            if (i19 - this.R < (-this.f34235x)) {
                this.S = i19 + this.Q;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i20 = iArr[iArr.length - 2] + 1;
                if (this.f34216h0 && i20 > this.F) {
                    i20 = this.D;
                }
                iArr[iArr.length - 1] = i20;
                b(i20);
                if (!this.f34216h0 && iArr[this.f34208c] >= this.F) {
                    int i21 = this.S;
                    int i22 = this.R;
                    if (i21 < i22) {
                        this.S = i22;
                    }
                }
            } else {
                l(iArr[this.f34208c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i7) {
        this.f34232v0 = Integer.valueOf(i7);
        setWrapSelectorWheel(this.f34217i0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.d20 d20Var) {
        this.f34231u0 = d20Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f34236y == strArr) {
            return;
        }
        this.f34236y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z9) {
        this.f34230t0 = z9;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f34211e.setEnabled(z9);
    }

    public void setFormatter(db0 db0Var) {
        if (db0Var == this.L) {
            return;
        }
        this.L = db0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i7) {
        this.f34234w0 = i7;
        super.setGravity(i7);
    }

    public void setItemCount(int i7) {
        if (this.f34206b == i7) {
            return;
        }
        this.f34206b = i7;
        this.f34208c = i7 / 2;
        this.O = new int[i7];
        f();
    }

    public void setMaxValue(int i7) {
        eb0 eb0Var;
        this.G = true;
        if (this.F != i7) {
            if (i7 >= 0) {
                this.F = i7;
                if (i7 < this.H) {
                    int i10 = this.I;
                    if (i7 >= i10) {
                        this.H = i10;
                    } else {
                        this.H = i7;
                    }
                }
                setWrapSelectorWheel(this.f34217i0);
                f();
                n();
                m();
                invalidate();
                if (this.f34220l0 == 0 && (eb0Var = this.K) != null) {
                    eb0Var.d(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i7) {
        eb0 eb0Var;
        this.E = true;
        if (this.D != i7) {
            if (i7 >= 0) {
                this.D = i7;
                if (i7 > this.H) {
                    int i10 = this.I;
                    if (i7 <= i10) {
                        this.H = i10;
                    } else {
                        this.H = i7;
                    }
                }
                setWrapSelectorWheel(this.f34217i0);
                f();
                n();
                m();
                invalidate();
                if (this.f34220l0 == 0 && (eb0Var = this.K) != null) {
                    eb0Var.d(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j3) {
        this.M = j3;
    }

    public void setOnScrollListener(eb0 eb0Var) {
        this.K = eb0Var;
    }

    public void setOnValueChangedListener(fb0 fb0Var) {
        this.J = fb0Var;
    }

    public void setSelectorColor(int i7) {
        this.f34204a = true;
        this.f34218j0.setColor(i7);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.r6.r(this.f34211e);
        this.f34211e.setTextColor(i7);
        this.P.setColor(i7);
    }

    public void setTextOffset(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setValue(int i7) {
        l(i7, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hb0.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.f34204a && (paint = this.f34218j0) != null) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f34229s0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public hb0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(18, context, f6Var);
    }

    public hb0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34206b = 3;
        this.f34208c = 1;
        this.M = 300L;
        this.N = new SparseArray();
        this.O = new int[this.f34206b];
        this.R = Integer.MIN_VALUE;
        this.f34220l0 = 0;
        this.f34227r0 = -1;
        this.f34230t0 = true;
        this.f34229s0 = f6Var;
        int L = org.telegram.messenger.g0.L(i7);
        this.f34233w = L;
        Paint paint = new Paint();
        this.f34218j0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var));
        this.f34219k0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f34213f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f34213f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f34221n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f34226r = -1;
        this.f34228s = true;
        this.f34225q0 = new gb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.f34211e = textView;
        textView.setGravity(17);
        this.f34211e.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(this.f34211e, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        this.f34211e.setBackgroundResource(0);
        float f10 = L;
        this.f34211e.setTextSize(0, f10);
        this.f34211e.setVisibility(4);
        addView(this.f34211e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f34212e0 = viewConfiguration.getScaledTouchSlop();
        this.f34214f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f34215g0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.f34211e.getTypeface());
        paint2.setColor(this.f34211e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.P = paint2;
        this.T = new wk0(getContext(), null);
        this.U = new wk0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new bb0(this));
    }
}
