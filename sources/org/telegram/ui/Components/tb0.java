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
public class tb0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public static final nr f39813y0 = new nr(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public rb0 K;
    public qb0 L;
    public pb0 M;
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
    public boolean f39814a;
    public ob0 f39815a0;
    public int f39816b;
    public float f39817b0;
    public int f39818c;
    public long f39819c0;
    public int d;
    public float f39820d0;
    public final TextView f39821e;
    public VelocityTracker f39822e0;
    public final int f39823f;
    public final int f39824f0;
    public final int f39825g0;
    public final int h;
    public final int f39826h0;
    public boolean f39827i0;
    public boolean f39828j0;
    public final Paint f39829k0;
    public final int f39830l0;
    public int m0;
    public final int f39831n;
    public int f39832n0;
    public int f39833o0;
    public boolean f39834p0;
    public boolean f39835q0;
    public int f39836r;
    public final sb0 f39837r0;
    public final boolean f39838s;
    public int f39839s0;
    public final org.telegram.ui.ActionBar.h6 f39840t0;
    public boolean f39841u0;
    public org.telegram.messenger.z10 f39842v0;
    public final int f39843w;
    public Integer f39844w0;
    public int f39845x;
    public int f39846x0;
    public String[] f39847y;

    public tb0(LaunchActivity launchActivity) {
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
        this.f39821e.setVisibility(4);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
    }

    public final void b(int i7) {
        String str;
        SparseArray sparseArray = this.O;
        if (((String) sparseArray.get(i7)) != null) {
            return;
        }
        int i10 = this.E;
        if (i7 >= i10 && i7 <= this.G) {
            String[] strArr = this.f39847y;
            if (strArr != null) {
                str = strArr[i7 - i10];
            } else {
                pb0 pb0Var = this.M;
                if (pb0Var != null) {
                    str = pb0Var.i(i7);
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
        if (ll0Var.f37232q) {
            ll0Var = this.V;
            if (ll0Var.f37232q) {
                return;
            }
        }
        ll0Var.b();
        int i7 = ll0Var.f37226k;
        if (this.W == 0) {
            this.W = ll0Var.f37220c;
        }
        scrollBy(0, i7 - this.W);
        this.W = i7;
        if (ll0Var.f37232q) {
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
        return this.f39821e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tb0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
            int i10 = (i7 - this.f39818c) + value;
            if (this.f39827i0) {
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
        return this.f39847y;
    }

    public int getItemsCount() {
        return this.f39816b;
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
        return this.f39827i0;
    }

    public final boolean h(ll0 ll0Var) {
        ll0Var.f37232q = true;
        int i7 = ll0Var.f37221e - ll0Var.f37226k;
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
            qb0 qb0Var = this.L;
            if (qb0Var != null) {
                qb0Var.i(i7);
            }
            if (i7 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f39847y;
                    if (strArr == null) {
                        int i10 = this.I;
                        pb0 pb0Var = this.M;
                        if (pb0Var != null) {
                            str = pb0Var.i(i10);
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
        ob0 ob0Var = this.f39815a0;
        if (ob0Var != null) {
            removeCallbacks(ob0Var);
        }
        this.f39837r0.a();
    }

    public final void l(int i7, boolean z10) {
        int min;
        qb0 qb0Var;
        rb0 rb0Var;
        if (this.I != i7) {
            if (this.f39827i0) {
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
            if (z10 && (rb0Var = this.K) != null) {
                rb0Var.n(this, this.I);
            }
            f();
            invalidate();
            if (this.m0 == 0 && (qb0Var = this.L) != null) {
                qb0Var.i(0);
            }
        }
    }

    public final void m() {
        int i7;
        if (this.f39838s) {
            String[] strArr = this.f39847y;
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
            TextView textView = this.f39821e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i7;
            if (this.f39836r != paddingRight) {
                int i14 = this.f39831n;
                if (paddingRight > i14) {
                    this.f39836r = paddingRight;
                } else {
                    this.f39836r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f39847y;
        if (strArr == null) {
            int i7 = this.I;
            pb0 pb0Var = this.M;
            if (pb0Var != null) {
                str = pb0Var.i(i7);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
            }
        } else {
            str = strArr[this.I - this.E];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f39821e;
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
        int i12 = this.f39846x0;
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
            if (str != null && (i13 != this.f39818c || this.f39821e.getVisibility() != 0)) {
                if (this.f39816b > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.Q.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f39813y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
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
        if (this.f39841u0) {
            canvas.drawRect(0.0f, this.f39832n0, getRight(), this.f39830l0 + i7, this.f39829k0);
            canvas.drawRect(0.0f, i10 - this.f39830l0, getRight(), this.f39833o0, this.f39829k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.f39821e.setVisibility(4);
        float y10 = motionEvent.getY();
        this.f39817b0 = y10;
        this.f39820d0 = y10;
        this.f39819c0 = motionEvent.getEventTime();
        float f10 = this.f39817b0;
        if (f10 < this.f39832n0) {
            if (this.m0 == 0) {
                sb0 sb0Var = this.f39837r0;
                sb0Var.a();
                sb0Var.f39547c = 1;
                sb0Var.f39546b = 2;
                ((tb0) sb0Var.d).postDelayed(sb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f39833o0 && this.m0 == 0) {
            sb0 sb0Var2 = this.f39837r0;
            sb0Var2.a();
            sb0Var2.f39547c = 1;
            sb0Var2.f39546b = 1;
            ((tb0) sb0Var2.d).postDelayed(sb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ll0 ll0Var = this.U;
        if (!ll0Var.f37232q) {
            ll0Var.f37232q = true;
            this.V.f37232q = true;
            i(0);
            return true;
        }
        ll0 ll0Var2 = this.V;
        if (!ll0Var2.f37232q) {
            ll0Var.f37232q = true;
            ll0Var2.f37232q = true;
            return true;
        }
        float f11 = this.f39817b0;
        if (f11 < this.f39832n0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f39815a0;
            if (runnable == null) {
                this.f39815a0 = new ob0(this);
            } else {
                removeCallbacks(runnable);
            }
            ob0 ob0Var = this.f39815a0;
            ob0Var.f38159a = false;
            postDelayed(ob0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f39833o0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.f39815a0;
            if (runnable2 == null) {
                this.f39815a0 = new ob0(this);
            } else {
                removeCallbacks(runnable2);
            }
            ob0 ob0Var2 = this.f39815a0;
            ob0Var2.f38159a = true;
            postDelayed(ob0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f39821e.getMeasuredWidth();
        int measuredHeight2 = this.f39821e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.f39821e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int[] iArr = this.P;
            int length = iArr.length;
            int i15 = this.f39843w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / iArr.length) + 0.5f);
            this.f39845x = bottom;
            this.R = bottom + i15;
            int top = (this.f39821e.getTop() + this.f39821e.getBaseline()) - (this.R * this.f39818c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.f39832n0 = ((getHeight() - i15) - this.f39845x) / 2;
            this.f39833o0 = ((getHeight() + i15) + this.f39845x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(g(i7, this.f39836r), g(i10, this.h));
        setMeasuredDimension(k(this.f39831n, getMeasuredWidth(), i7), k(this.f39823f, getMeasuredHeight(), i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f39822e0 == null) {
            this.f39822e0 = VelocityTracker.obtain();
        }
        this.f39822e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.m0 != 1) {
                if (((int) Math.abs(y10 - this.f39817b0)) > this.f39824f0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y10 - this.f39820d0));
                invalidate();
            }
            this.f39820d0 = y10;
            return true;
        }
        ob0 ob0Var = this.f39815a0;
        if (ob0Var != null) {
            removeCallbacks(ob0Var);
        }
        this.f39837r0.a();
        VelocityTracker velocityTracker = this.f39822e0;
        velocityTracker.computeCurrentVelocity(1000, this.f39826h0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f39825g0) {
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
            int abs = (int) Math.abs(y11 - this.f39817b0);
            long eventTime = motionEvent.getEventTime() - this.f39819c0;
            if (abs <= this.f39824f0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i7 = (y11 / this.R) - this.f39818c;
                if (i7 > 0) {
                    a(true);
                    sb0 sb0Var = this.f39837r0;
                    sb0Var.a();
                    sb0Var.f39547c = 2;
                    sb0Var.f39546b = 1;
                    ((tb0) sb0Var.d).post(sb0Var);
                } else if (i7 < 0) {
                    a(false);
                    sb0 sb0Var2 = this.f39837r0;
                    sb0Var2.a();
                    sb0Var2.f39547c = 2;
                    sb0Var2.f39546b = 2;
                    ((tb0) sb0Var2.d).post(sb0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f39822e0.recycle();
        this.f39822e0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        int[] iArr = this.P;
        boolean z10 = this.f39827i0;
        if (!z10 && i10 > 0 && iArr[this.f39818c] <= this.E) {
            int i11 = this.T + i10;
            int i12 = this.S;
            if (i11 > i12) {
                this.T = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.f39818c] >= this.G) {
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
            if (i15 - this.S <= this.f39845x) {
                break;
            }
            this.T = i15 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.f39827i0 && i16 < this.E) {
                i16 = this.G;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.f39827i0 && iArr[this.f39818c] <= this.E) {
                int i17 = this.T;
                int i18 = this.S;
                if (i17 > i18) {
                    this.T = i18;
                }
            }
        }
        while (true) {
            int i19 = this.T;
            if (i19 - this.S < (-this.f39845x)) {
                this.T = i19 + this.R;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i20 = iArr[iArr.length - 2] + 1;
                if (this.f39827i0 && i20 > this.G) {
                    i20 = this.E;
                }
                iArr[iArr.length - 1] = i20;
                b(i20);
                if (!this.f39827i0 && iArr[this.f39818c] >= this.G) {
                    int i21 = this.T;
                    int i22 = this.S;
                    if (i21 < i22) {
                        this.T = i22;
                    }
                }
            } else {
                l(iArr[this.f39818c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i7) {
        this.f39844w0 = Integer.valueOf(i7);
        setWrapSelectorWheel(this.f39828j0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.z10 z10Var) {
        this.f39842v0 = z10Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f39847y == strArr) {
            return;
        }
        this.f39847y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f39841u0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f39821e.setEnabled(z10);
    }

    public void setFormatter(pb0 pb0Var) {
        if (pb0Var == this.M) {
            return;
        }
        this.M = pb0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i7) {
        this.f39846x0 = i7;
        super.setGravity(i7);
    }

    public void setItemCount(int i7) {
        if (this.f39816b == i7) {
            return;
        }
        this.f39816b = i7;
        this.f39818c = i7 / 2;
        this.P = new int[i7];
        f();
    }

    public void setMaxValue(int i7) {
        qb0 qb0Var;
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
                setWrapSelectorWheel(this.f39828j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (qb0Var = this.L) != null) {
                    qb0Var.i(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i7) {
        qb0 qb0Var;
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
                setWrapSelectorWheel(this.f39828j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (qb0Var = this.L) != null) {
                    qb0Var.i(0);
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

    public void setOnScrollListener(qb0 qb0Var) {
        this.L = qb0Var;
    }

    public void setOnValueChangedListener(rb0 rb0Var) {
        this.K = rb0Var;
    }

    public void setSelectorColor(int i7) {
        this.f39814a = true;
        this.f39829k0.setColor(i7);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.t6.q(this.f39821e);
        this.f39821e.setTextColor(i7);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tb0.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.f39814a && (paint = this.f39829k0) != null) {
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.f39840t0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public tb0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(18, context, h6Var);
    }

    public tb0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f39816b = 3;
        this.f39818c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.f39816b];
        this.S = Integer.MIN_VALUE;
        this.m0 = 0;
        this.f39839s0 = -1;
        this.f39841u0 = true;
        this.f39840t0 = h6Var;
        int L = org.telegram.messenger.g0.L(i7);
        this.f39843w = L;
        Paint paint = new Paint();
        this.f39829k0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var));
        this.f39830l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f39823f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f39823f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f39831n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f39836r = -1;
        this.f39838s = true;
        this.f39837r0 = new sb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.f39821e = textView;
        textView.setGravity(17);
        this.f39821e.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(this.f39821e, org.telegram.ui.ActionBar.m6.f29489j5, h6Var);
        this.f39821e.setBackgroundResource(0);
        float f10 = L;
        this.f39821e.setTextSize(0, f10);
        this.f39821e.setVisibility(4);
        addView(this.f39821e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f39824f0 = viewConfiguration.getScaledTouchSlop();
        this.f39825g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f39826h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.f39821e.getTypeface());
        paint2.setColor(this.f39821e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new ll0(getContext(), null);
        this.V = new ll0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new nb0(this));
    }
}
