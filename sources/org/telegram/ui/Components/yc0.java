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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public class yc0 extends LinearLayout {
    public static final pr f33486s0 = new pr(0.0f, 0.5f, 0.5f, 1.0f);
    public int B;
    public boolean C;
    public int D;
    public int E;
    public wc0 F;
    public vc0 G;
    public uc0 H;
    public long I;
    public final SparseArray J;
    public int[] K;
    public final Paint L;
    public int M;
    public int N;
    public int O;
    public final vm0 P;
    public final vm0 Q;
    public int R;
    public tc0 S;
    public float T;
    public long U;
    public float V;
    public VelocityTracker W;
    public int f33487a;
    public final int f33488a0;
    public int f33489b;
    public final int f33490b0;
    public int f33491c;
    public final int f33492c0;
    public final TextView d;
    public boolean f33493d0;
    public final int f33494e;
    public boolean f33495e0;
    public final int f33496f;
    public final Paint f33497f0;
    public final int f33498g0;
    public final int h;
    public int f33499h0;
    public int f33500i0;
    public int f33501j0;
    public boolean f33502k0;
    public boolean f33503l0;
    public final xc0 m0;
    public int f33504n;
    public int f33505n0;
    public boolean f33506o0;
    public Utilities.CallbackReturn f33507p0;
    public Integer f33508q0;
    public final boolean f33509r;
    public int f33510r0;
    public final int f33511s;
    public int v;
    public String[] f33512w;
    public int f33513x;
    public boolean f33514y;

    public yc0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(l.d.j(mode, "Unknown measure mode: "));
                    }
                } else {
                    return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                }
            } else {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
            }
        }
        return i10;
    }

    public static int k(int i10, int i11, int i12) {
        if (i10 != -1) {
            int max = Math.max(i10, i11);
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
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
        return i11;
    }

    public final void a(boolean z4) {
        this.d.setVisibility(4);
        if (!h(this.P)) {
            h(this.Q);
        }
        this.R = 0;
        if (z4) {
            this.P.d(-this.M, 300);
        } else {
            this.P.d(this.M, 300);
        }
        invalidate();
    }

    public final void b(int i10) {
        String str;
        SparseArray sparseArray = this.J;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.f33513x;
        if (i10 >= i11 && i10 <= this.B) {
            String[] strArr = this.f33512w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                uc0 uc0Var = this.H;
                if (uc0Var != null) {
                    str = uc0Var.e(i10);
                } else {
                    str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
                }
            }
        } else {
            str = "";
        }
        sparseArray.put(i10, str);
    }

    public final boolean c() {
        int i10 = this.N - this.O;
        if (i10 == 0) {
            return false;
        }
        this.R = 0;
        int abs = Math.abs(i10);
        int i11 = this.M;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.Q.d(i10, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        vm0 vm0Var = this.P;
        if (vm0Var.f31934q) {
            vm0Var = this.Q;
            if (vm0Var.f31934q) {
                return;
            }
        }
        vm0Var.b();
        int i10 = vm0Var.f31928k;
        if (this.R == 0) {
            this.R = vm0Var.f31922c;
        }
        scrollBy(0, i10 - this.R);
        this.R = i10;
        if (vm0Var.f31934q) {
            if (vm0Var == this.P) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.f33499h0 != 1) {
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
        return this.O;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.B - this.f33513x) + 1) * this.M;
    }

    public CharSequence d(int i10) {
        return this.d.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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

    public final int e(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.C && i10 > (i14 = this.B) && (i16 = i14 - (i15 = this.f33513x)) != 0) {
            return (((i10 - i14) % i16) + i15) - 1;
        }
        if (this.f33514y && i10 < (i11 = this.f33513x) && (i13 = (i12 = this.B) - i11) != 0) {
            return (i12 - ((i11 - i10) % i13)) + 1;
        }
        return i10;
    }

    public final void f() {
        this.J.clear();
        int[] iArr = this.K;
        int value = getValue();
        for (int i10 = 0; i10 < this.K.length; i10++) {
            int i11 = (i10 - this.f33489b) + value;
            if (this.f33493d0) {
                i11 = e(i11);
            }
            iArr[i10] = i11;
            b(i11);
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f33512w;
    }

    public int getItemsCount() {
        return this.f33487a;
    }

    public int getMaxValue() {
        return this.B;
    }

    public int getMinValue() {
        return this.f33513x;
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
        return this.D;
    }

    public boolean getWrapSelectorWheel() {
        return this.f33493d0;
    }

    public final boolean h(vm0 vm0Var) {
        vm0Var.f31934q = true;
        int i10 = vm0Var.f31923e - vm0Var.f31928k;
        int i11 = this.N - ((this.O + i10) % this.M);
        if (i11 == 0) {
            return false;
        }
        int abs = Math.abs(i11);
        int i12 = this.M;
        if (abs > i12 / 2) {
            if (i11 > 0) {
                i11 -= i12;
            } else {
                i11 += i12;
            }
        }
        scrollBy(0, i10 + i11);
        return true;
    }

    public final void i(int i10) {
        String str;
        if (this.f33499h0 != i10) {
            this.f33499h0 = i10;
            vc0 vc0Var = this.G;
            if (vc0Var != null) {
                vc0Var.g(i10);
            }
            if (i10 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f33512w;
                    if (strArr == null) {
                        int i11 = this.D;
                        uc0 uc0Var = this.H;
                        if (uc0Var != null) {
                            str = uc0Var.e(i11);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                        }
                    } else {
                        str = strArr[this.D - this.f33513x];
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
        tc0 tc0Var = this.S;
        if (tc0Var != null) {
            removeCallbacks(tc0Var);
        }
        this.m0.a();
    }

    public final void l(int i10, boolean z4) {
        int min;
        vc0 vc0Var;
        wc0 wc0Var;
        if (this.D != i10) {
            if (this.f33493d0) {
                min = e(i10);
            } else {
                min = Math.min(Math.max(i10, this.f33513x), this.B);
            }
            int i11 = this.D;
            this.E = min;
            this.D = min;
            n();
            if (Math.abs(i11 - min) > 0.9f) {
                AndroidUtilities.vibrateCursor(this);
            }
            if (z4 && (wc0Var = this.F) != null) {
                wc0Var.q(this, this.D);
            }
            f();
            invalidate();
            if (this.f33499h0 == 0 && (vc0Var = this.G) != null) {
                vc0Var.g(0);
            }
        }
    }

    public final void m() {
        int i10;
        if (this.f33509r) {
            String[] strArr = this.f33512w;
            Paint paint = this.L;
            int i11 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
                    if (measureText > f10) {
                        f10 = measureText;
                    }
                }
                for (int i13 = this.B; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f10);
            } else {
                int length = strArr.length;
                int i14 = 0;
                while (i11 < length) {
                    float measureText2 = paint.measureText(strArr[i11]);
                    if (measureText2 > i14) {
                        i14 = (int) measureText2;
                    }
                    i11++;
                }
                i10 = i14;
            }
            TextView textView = this.d;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i10;
            if (this.f33504n != paddingRight) {
                int i15 = this.h;
                if (paddingRight > i15) {
                    this.f33504n = paddingRight;
                } else {
                    this.f33504n = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f33512w;
        if (strArr == null) {
            int i10 = this.D;
            uc0 uc0Var = this.H;
            if (uc0Var != null) {
                str = uc0Var.e(i10);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        } else {
            str = strArr[this.D - this.f33513x];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.d;
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
        int i10;
        int i11;
        float measuredHeight;
        boolean z4;
        int i12;
        int i13 = this.f33510r0;
        if (i13 == 5) {
            this.L.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i13 == 3) {
            this.L.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.L.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f10 = width + this.f33491c;
        float f11 = this.O;
        int[] iArr = this.K;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String str = (String) this.J.get(iArr[i14]);
            if (str != null && (i14 != this.f33489b || this.d.getVisibility() != 0)) {
                if (this.f33487a > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.L.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z4 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z4 = false;
                    }
                    float interpolation = f33486s0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.L.getTextSize() * (1.0f - interpolation);
                    if (!z4) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f10, textSize);
                    if (interpolation < 0.1f) {
                        i12 = this.L.getAlpha();
                        this.L.setAlpha((int) ((i12 * interpolation) / 0.1f));
                    } else {
                        i12 = -1;
                    }
                    canvas.drawText(str, f10, f11, this.L);
                    canvas.restore();
                    if (i12 != -1) {
                        this.L.setAlpha(i12);
                    }
                } else {
                    canvas.drawText(str, f10, f11, this.L);
                }
            }
            f11 += this.M;
        }
        if (this.f33506o0) {
            canvas.drawRect(0.0f, this.f33500i0, getRight(), this.f33498g0 + i10, this.f33497f0);
            canvas.drawRect(0.0f, i11 - this.f33498g0, getRight(), this.f33501j0, this.f33497f0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.d.setVisibility(4);
        float y10 = motionEvent.getY();
        this.T = y10;
        this.V = y10;
        this.U = motionEvent.getEventTime();
        float f10 = this.T;
        if (f10 < this.f33500i0) {
            if (this.f33499h0 == 0) {
                xc0 xc0Var = this.m0;
                xc0Var.a();
                xc0Var.f33032c = 1;
                xc0Var.f33031b = 2;
                ((yc0) xc0Var.d).postDelayed(xc0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f33501j0 && this.f33499h0 == 0) {
            xc0 xc0Var2 = this.m0;
            xc0Var2.a();
            xc0Var2.f33032c = 1;
            xc0Var2.f33031b = 1;
            ((yc0) xc0Var2.d).postDelayed(xc0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        vm0 vm0Var = this.P;
        if (!vm0Var.f31934q) {
            vm0Var.f31934q = true;
            this.Q.f31934q = true;
            i(0);
            return true;
        }
        vm0 vm0Var2 = this.Q;
        if (!vm0Var2.f31934q) {
            vm0Var.f31934q = true;
            vm0Var2.f31934q = true;
            return true;
        }
        float f11 = this.T;
        if (f11 < this.f33500i0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.S;
            if (runnable == null) {
                this.S = new tc0(this);
            } else {
                removeCallbacks(runnable);
            }
            tc0 tc0Var = this.S;
            tc0Var.f31336a = false;
            postDelayed(tc0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f33501j0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.S;
            if (runnable2 == null) {
                this.S = new tc0(this);
            } else {
                removeCallbacks(runnable2);
            }
            tc0 tc0Var2 = this.S;
            tc0Var2.f31336a = true;
            postDelayed(tc0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.d.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        if (z4) {
            f();
            int[] iArr = this.K;
            int length = iArr.length;
            int i16 = this.f33511s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / iArr.length) + 0.5f);
            this.v = bottom;
            this.M = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.M * this.f33489b);
            this.N = top;
            this.O = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.f33500i0 = ((getHeight() - i16) - this.v) / 2;
            this.f33501j0 = ((getHeight() + i16) + this.v) / 2;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.f33504n), g(i11, this.f33496f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i10), k(this.f33494e, getMeasuredHeight(), i11));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.f33499h0 != 1) {
                if (((int) Math.abs(y10 - this.T)) > this.f33488a0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y10 - this.V));
                invalidate();
            }
            this.V = y10;
            return true;
        }
        tc0 tc0Var = this.S;
        if (tc0Var != null) {
            removeCallbacks(tc0Var);
        }
        this.m0.a();
        VelocityTracker velocityTracker = this.W;
        velocityTracker.computeCurrentVelocity(1000, this.f33492c0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f33490b0) {
            this.R = 0;
            if (yVelocity > 0) {
                this.P.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.P.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y11 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y11 - this.T);
            long eventTime = motionEvent.getEventTime() - this.U;
            if (abs <= this.f33488a0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i10 = (y11 / this.M) - this.f33489b;
                if (i10 > 0) {
                    a(true);
                    xc0 xc0Var = this.m0;
                    xc0Var.a();
                    xc0Var.f33032c = 2;
                    xc0Var.f33031b = 1;
                    ((yc0) xc0Var.d).post(xc0Var);
                } else if (i10 < 0) {
                    a(false);
                    xc0 xc0Var2 = this.m0;
                    xc0Var2.a();
                    xc0Var2.f33032c = 2;
                    xc0Var2.f33031b = 2;
                    ((yc0) xc0Var2.d).post(xc0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.W.recycle();
        this.W = null;
        return true;
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.K;
        boolean z4 = this.f33493d0;
        if (!z4 && i11 > 0 && iArr[this.f33489b] <= this.f33513x) {
            int i12 = this.O + i11;
            int i13 = this.N;
            if (i12 > i13) {
                this.O = i13;
                return;
            }
        }
        if (!z4 && i11 < 0 && iArr[this.f33489b] >= this.B) {
            int i14 = this.O + i11;
            int i15 = this.N;
            if (i14 < i15) {
                this.O = i15;
                return;
            }
        }
        this.O += i11;
        while (true) {
            int i16 = this.O;
            if (i16 - this.N <= this.v) {
                break;
            }
            this.O = i16 - this.M;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i17 = iArr[1] - 1;
            if (this.f33493d0 && i17 < this.f33513x) {
                i17 = this.B;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.f33493d0 && iArr[this.f33489b] <= this.f33513x) {
                int i18 = this.O;
                int i19 = this.N;
                if (i18 > i19) {
                    this.O = i19;
                }
            }
        }
        while (true) {
            int i20 = this.O;
            if (i20 - this.N < (-this.v)) {
                this.O = i20 + this.M;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i21 = iArr[iArr.length - 2] + 1;
                if (this.f33493d0 && i21 > this.B) {
                    i21 = this.f33513x;
                }
                iArr[iArr.length - 1] = i21;
                b(i21);
                if (!this.f33493d0 && iArr[this.f33489b] >= this.B) {
                    int i22 = this.O;
                    int i23 = this.N;
                    if (i22 < i23) {
                        this.O = i23;
                    }
                }
            } else {
                l(iArr[this.f33489b], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.f33508q0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.f33495e0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.f33507p0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f33512w == strArr) {
            return;
        }
        this.f33512w = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z4) {
        this.f33506o0 = z4;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.d.setEnabled(z4);
    }

    public void setFormatter(uc0 uc0Var) {
        if (uc0Var == this.H) {
            return;
        }
        this.H = uc0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i10) {
        this.f33510r0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.f33487a == i10) {
            return;
        }
        this.f33487a = i10;
        this.f33489b = i10 / 2;
        this.K = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        vc0 vc0Var;
        this.C = true;
        if (this.B != i10) {
            if (i10 >= 0) {
                this.B = i10;
                if (i10 < this.D) {
                    int i11 = this.E;
                    if (i10 >= i11) {
                        this.D = i11;
                    } else {
                        this.D = i10;
                    }
                }
                setWrapSelectorWheel(this.f33495e0);
                f();
                n();
                m();
                invalidate();
                if (this.f33499h0 == 0 && (vc0Var = this.G) != null) {
                    vc0Var.g(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i10) {
        vc0 vc0Var;
        this.f33514y = true;
        if (this.f33513x != i10) {
            if (i10 >= 0) {
                this.f33513x = i10;
                if (i10 > this.D) {
                    int i11 = this.E;
                    if (i10 <= i11) {
                        this.D = i11;
                    } else {
                        this.D = i10;
                    }
                }
                setWrapSelectorWheel(this.f33495e0);
                f();
                n();
                m();
                invalidate();
                if (this.f33499h0 == 0 && (vc0Var = this.G) != null) {
                    vc0Var.g(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.I = j10;
    }

    public void setOnScrollListener(vc0 vc0Var) {
        this.G = vc0Var;
    }

    public void setOnValueChangedListener(wc0 wc0Var) {
        this.F = wc0Var;
    }

    public void setSelectorColor(int i10) {
        this.f33497f0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.L.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.f33491c = i10;
        invalidate();
    }

    public void setValue(int i10) {
        l(i10, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc0.setWrapSelectorWheel(boolean):void");
    }

    public yc0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, 18, g6Var);
    }

    public yc0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f33487a = 3;
        this.f33489b = 1;
        this.I = 300L;
        this.J = new SparseArray();
        this.K = new int[this.f33487a];
        this.N = Integer.MIN_VALUE;
        this.f33499h0 = 0;
        this.f33505n0 = -1;
        this.f33506o0 = true;
        int dp = AndroidUtilities.dp(i10);
        this.f33511s = dp;
        Paint paint = new Paint();
        this.f33497f0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        this.f33498g0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f33494e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f33496f = applyDimension;
        int i11 = this.f33494e;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f33504n = -1;
        this.f33509r = true;
        this.m0 = new xc0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, g6Var));
        this.d.setBackgroundResource(0);
        float f10 = dp;
        this.d.setTextSize(0, f10);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f33488a0 = viewConfiguration.getScaledTouchSlop();
        this.f33490b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33492c0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.L = paint2;
        this.P = new vm0(getContext(), null);
        this.Q = new vm0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new sc0(this));
    }
}
