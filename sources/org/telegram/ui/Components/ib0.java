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
public class ib0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public static final er f35532y0 = new er(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public gb0 K;
    public fb0 L;
    public eb0 M;
    public long N;
    public final SparseArray O;
    public int[] P;
    public final Paint Q;
    public int R;
    public int S;
    public int T;
    public final bl0 U;
    public final bl0 V;
    public int W;
    public boolean f35533a;
    public db0 f35534a0;
    public int f35535b;
    public float f35536b0;
    public int f35537c;
    public long f35538c0;
    public int d;
    public float f35539d0;
    public final TextView f35540e;
    public VelocityTracker f35541e0;
    public final int f35542f;
    public final int f35543f0;
    public final int f35544g0;
    public final int h;
    public final int f35545h0;
    public boolean f35546i0;
    public boolean f35547j0;
    public final Paint f35548k0;
    public final int f35549l0;
    public int m0;
    public final int f35550n;
    public int f35551n0;
    public int f35552o0;
    public boolean f35553p0;
    public boolean f35554q0;
    public int f35555r;
    public final hb0 f35556r0;
    public final boolean f35557s;
    public int f35558s0;
    public final org.telegram.ui.ActionBar.e6 f35559t0;
    public boolean f35560u0;
    public org.telegram.messenger.a20 f35561v0;
    public final int f35562w;
    public Integer f35563w0;
    public int f35564x;
    public int f35565x0;
    public String[] f35566y;

    public ib0(LaunchActivity launchActivity) {
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
        this.f35540e.setVisibility(4);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void b(int i7) {
        String str;
        SparseArray sparseArray = this.O;
        if (((String) sparseArray.get(i7)) != null) {
            return;
        }
        int i10 = this.E;
        if (i7 >= i10 && i7 <= this.G) {
            String[] strArr = this.f35566y;
            if (strArr != null) {
                str = strArr[i7 - i10];
            } else {
                eb0 eb0Var = this.M;
                if (eb0Var != null) {
                    str = eb0Var.e(i7);
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
        bl0 bl0Var = this.U;
        if (bl0Var.f33321q) {
            bl0Var = this.V;
            if (bl0Var.f33321q) {
                return;
            }
        }
        bl0Var.b();
        int i7 = bl0Var.f33315k;
        if (this.W == 0) {
            this.W = bl0Var.f33309c;
        }
        scrollBy(0, i7 - this.W);
        this.W = i7;
        if (bl0Var.f33321q) {
            if (bl0Var == this.U) {
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
        return this.f35540e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
            int i10 = (i7 - this.f35537c) + value;
            if (this.f35546i0) {
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
        return this.f35566y;
    }

    public int getItemsCount() {
        return this.f35535b;
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
        return this.f35546i0;
    }

    public final boolean h(bl0 bl0Var) {
        bl0Var.f33321q = true;
        int i7 = bl0Var.f33310e - bl0Var.f33315k;
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
            fb0 fb0Var = this.L;
            if (fb0Var != null) {
                fb0Var.i(i7);
            }
            if (i7 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f35566y;
                    if (strArr == null) {
                        int i10 = this.I;
                        eb0 eb0Var = this.M;
                        if (eb0Var != null) {
                            str = eb0Var.e(i10);
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
        db0 db0Var = this.f35534a0;
        if (db0Var != null) {
            removeCallbacks(db0Var);
        }
        this.f35556r0.a();
    }

    public final void l(int i7, boolean z10) {
        int min;
        fb0 fb0Var;
        gb0 gb0Var;
        if (this.I != i7) {
            if (this.f35546i0) {
                min = e(i7);
            } else {
                min = Math.min(Math.max(i7, this.E), this.G);
            }
            int i10 = this.I;
            this.J = min;
            this.I = min;
            n();
            if (Math.abs(i10 - min) > 0.9f) {
                org.telegram.messenger.g0.b4(this);
            }
            if (z10 && (gb0Var = this.K) != null) {
                gb0Var.m(this, this.I);
            }
            f();
            invalidate();
            if (this.m0 == 0 && (fb0Var = this.L) != null) {
                fb0Var.i(0);
            }
        }
    }

    public final void m() {
        int i7;
        if (this.f35557s) {
            String[] strArr = this.f35566y;
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
            TextView textView = this.f35540e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i7;
            if (this.f35555r != paddingRight) {
                int i14 = this.f35550n;
                if (paddingRight > i14) {
                    this.f35555r = paddingRight;
                } else {
                    this.f35555r = i14;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f35566y;
        if (strArr == null) {
            int i7 = this.I;
            eb0 eb0Var = this.M;
            if (eb0Var != null) {
                str = eb0Var.e(i7);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
            }
        } else {
            str = strArr[this.I - this.E];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f35540e;
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
        int i12 = this.f35565x0;
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
            if (str != null && (i13 != this.f35537c || this.f35540e.getVisibility() != 0)) {
                if (this.f35535b > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.Q.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f35532y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
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
        if (this.f35560u0) {
            canvas.drawRect(0.0f, this.f35551n0, getRight(), this.f35549l0 + i7, this.f35548k0);
            canvas.drawRect(0.0f, i10 - this.f35549l0, getRight(), this.f35552o0, this.f35548k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.f35540e.setVisibility(4);
        float y10 = motionEvent.getY();
        this.f35536b0 = y10;
        this.f35539d0 = y10;
        this.f35538c0 = motionEvent.getEventTime();
        float f10 = this.f35536b0;
        if (f10 < this.f35551n0) {
            if (this.m0 == 0) {
                hb0 hb0Var = this.f35556r0;
                hb0Var.a();
                hb0Var.f35211c = 1;
                hb0Var.f35210b = 2;
                ((ib0) hb0Var.d).postDelayed(hb0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f35552o0 && this.m0 == 0) {
            hb0 hb0Var2 = this.f35556r0;
            hb0Var2.a();
            hb0Var2.f35211c = 1;
            hb0Var2.f35210b = 1;
            ((ib0) hb0Var2.d).postDelayed(hb0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        bl0 bl0Var = this.U;
        if (!bl0Var.f33321q) {
            bl0Var.f33321q = true;
            this.V.f33321q = true;
            i(0);
            return true;
        }
        bl0 bl0Var2 = this.V;
        if (!bl0Var2.f33321q) {
            bl0Var.f33321q = true;
            bl0Var2.f33321q = true;
            return true;
        }
        float f11 = this.f35536b0;
        if (f11 < this.f35551n0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f35534a0;
            if (runnable == null) {
                this.f35534a0 = new db0(this);
            } else {
                removeCallbacks(runnable);
            }
            db0 db0Var = this.f35534a0;
            db0Var.f33896a = false;
            postDelayed(db0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f35552o0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.f35534a0;
            if (runnable2 == null) {
                this.f35534a0 = new db0(this);
            } else {
                removeCallbacks(runnable2);
            }
            db0 db0Var2 = this.f35534a0;
            db0Var2.f33896a = true;
            postDelayed(db0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f35540e.getMeasuredWidth();
        int measuredHeight2 = this.f35540e.getMeasuredHeight();
        int i13 = (measuredWidth - measuredWidth2) / 2;
        int i14 = (measuredHeight - measuredHeight2) / 2;
        this.f35540e.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
        if (z10) {
            f();
            int[] iArr = this.P;
            int length = iArr.length;
            int i15 = this.f35562w;
            int bottom = (int) (((((getBottom() - getTop()) + i15) - (length * i15)) / iArr.length) + 0.5f);
            this.f35564x = bottom;
            this.R = bottom + i15;
            int top = (this.f35540e.getTop() + this.f35540e.getBaseline()) - (this.R * this.f35537c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i15) / 2);
            this.f35551n0 = ((getHeight() - i15) - this.f35564x) / 2;
            this.f35552o0 = ((getHeight() + i15) + this.f35564x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(g(i7, this.f35555r), g(i10, this.h));
        setMeasuredDimension(k(this.f35550n, getMeasuredWidth(), i7), k(this.f35542f, getMeasuredHeight(), i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f35541e0 == null) {
            this.f35541e0 = VelocityTracker.obtain();
        }
        this.f35541e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y10 = motionEvent.getY();
            if (this.m0 != 1) {
                if (((int) Math.abs(y10 - this.f35536b0)) > this.f35543f0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y10 - this.f35539d0));
                invalidate();
            }
            this.f35539d0 = y10;
            return true;
        }
        db0 db0Var = this.f35534a0;
        if (db0Var != null) {
            removeCallbacks(db0Var);
        }
        this.f35556r0.a();
        VelocityTracker velocityTracker = this.f35541e0;
        velocityTracker.computeCurrentVelocity(1000, this.f35545h0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f35544g0) {
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
            int abs = (int) Math.abs(y11 - this.f35536b0);
            long eventTime = motionEvent.getEventTime() - this.f35538c0;
            if (abs <= this.f35543f0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i7 = (y11 / this.R) - this.f35537c;
                if (i7 > 0) {
                    a(true);
                    hb0 hb0Var = this.f35556r0;
                    hb0Var.a();
                    hb0Var.f35211c = 2;
                    hb0Var.f35210b = 1;
                    ((ib0) hb0Var.d).post(hb0Var);
                } else if (i7 < 0) {
                    a(false);
                    hb0 hb0Var2 = this.f35556r0;
                    hb0Var2.a();
                    hb0Var2.f35211c = 2;
                    hb0Var2.f35210b = 2;
                    ((ib0) hb0Var2.d).post(hb0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f35541e0.recycle();
        this.f35541e0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        int[] iArr = this.P;
        boolean z10 = this.f35546i0;
        if (!z10 && i10 > 0 && iArr[this.f35537c] <= this.E) {
            int i11 = this.T + i10;
            int i12 = this.S;
            if (i11 > i12) {
                this.T = i12;
                return;
            }
        }
        if (!z10 && i10 < 0 && iArr[this.f35537c] >= this.G) {
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
            if (i15 - this.S <= this.f35564x) {
                break;
            }
            this.T = i15 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i16 = iArr[1] - 1;
            if (this.f35546i0 && i16 < this.E) {
                i16 = this.G;
            }
            iArr[0] = i16;
            b(i16);
            if (!this.f35546i0 && iArr[this.f35537c] <= this.E) {
                int i17 = this.T;
                int i18 = this.S;
                if (i17 > i18) {
                    this.T = i18;
                }
            }
        }
        while (true) {
            int i19 = this.T;
            if (i19 - this.S < (-this.f35564x)) {
                this.T = i19 + this.R;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i20 = iArr[iArr.length - 2] + 1;
                if (this.f35546i0 && i20 > this.G) {
                    i20 = this.E;
                }
                iArr[iArr.length - 1] = i20;
                b(i20);
                if (!this.f35546i0 && iArr[this.f35537c] >= this.G) {
                    int i21 = this.T;
                    int i22 = this.S;
                    if (i21 < i22) {
                        this.T = i22;
                    }
                }
            } else {
                l(iArr[this.f35537c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i7) {
        this.f35563w0 = Integer.valueOf(i7);
        setWrapSelectorWheel(this.f35547j0);
    }

    public void setContentDescriptionCallback(org.telegram.messenger.a20 a20Var) {
        this.f35561v0 = a20Var;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f35566y == strArr) {
            return;
        }
        this.f35566y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f35560u0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f35540e.setEnabled(z10);
    }

    public void setFormatter(eb0 eb0Var) {
        if (eb0Var == this.M) {
            return;
        }
        this.M = eb0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i7) {
        this.f35565x0 = i7;
        super.setGravity(i7);
    }

    public void setItemCount(int i7) {
        if (this.f35535b == i7) {
            return;
        }
        this.f35535b = i7;
        this.f35537c = i7 / 2;
        this.P = new int[i7];
        f();
    }

    public void setMaxValue(int i7) {
        fb0 fb0Var;
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
                setWrapSelectorWheel(this.f35547j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (fb0Var = this.L) != null) {
                    fb0Var.i(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i7) {
        fb0 fb0Var;
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
                setWrapSelectorWheel(this.f35547j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (fb0Var = this.L) != null) {
                    fb0Var.i(0);
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

    public void setOnScrollListener(fb0 fb0Var) {
        this.L = fb0Var;
    }

    public void setOnValueChangedListener(gb0 gb0Var) {
        this.K = gb0Var;
    }

    public void setSelectorColor(int i7) {
        this.f35533a = true;
        this.f35548k0.setColor(i7);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.q6.q(this.f35540e);
        this.f35540e.setTextColor(i7);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib0.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.f35533a && (paint = this.f35548k0) != null) {
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f35559t0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ib0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(18, context, e6Var);
    }

    public ib0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35535b = 3;
        this.f35537c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.f35535b];
        this.S = Integer.MIN_VALUE;
        this.m0 = 0;
        this.f35558s0 = -1;
        this.f35560u0 = true;
        this.f35559t0 = e6Var;
        int L = org.telegram.messenger.g0.L(i7);
        this.f35562w = L;
        Paint paint = new Paint();
        this.f35548k0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var));
        this.f35549l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f35542f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i10 = this.f35542f;
        if (i10 != -1 && applyDimension != -1 && i10 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f35550n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f35555r = -1;
        this.f35557s = true;
        this.f35556r0 = new hb0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.f35540e = textView;
        textView.setGravity(17);
        this.f35540e.setSingleLine(true);
        org.telegram.ui.ActionBar.q6.U(this.f35540e, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        this.f35540e.setBackgroundResource(0);
        float f10 = L;
        this.f35540e.setTextSize(0, f10);
        this.f35540e.setVisibility(4);
        addView(this.f35540e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f35543f0 = viewConfiguration.getScaledTouchSlop();
        this.f35544g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35545h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.f35540e.getTypeface());
        paint2.setColor(this.f35540e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new bl0(getContext(), null);
        this.V = new bl0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new cb0(this));
    }
}
