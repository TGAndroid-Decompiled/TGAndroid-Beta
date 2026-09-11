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
public class vc0 extends LinearLayout {
    public static final pr f31169v0 = new pr(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public int H;
    public tc0 I;
    public sc0 J;
    public rc0 K;
    public long L;
    public final SparseArray M;
    public int[] N;
    public final Paint O;
    public int P;
    public int Q;
    public int R;
    public final nm0 S;
    public final nm0 T;
    public int U;
    public qc0 V;
    public float W;
    public int f31170a;
    public long f31171a0;
    public int f31172b;
    public float f31173b0;
    public int f31174c;
    public VelocityTracker f31175c0;
    public final TextView d;
    public final int f31176d0;
    public final int f31177e;
    public final int f31178e0;
    public final int f31179f;
    public final int f31180f0;
    public boolean f31181g0;
    public final int h;
    public boolean f31182h0;
    public final Paint f31183i0;
    public final int f31184j0;
    public int f31185k0;
    public int f31186l0;
    public int m0;
    public int f31187n;
    public boolean f31188n0;
    public boolean f31189o0;
    public final uc0 f31190p0;
    public int f31191q0;
    public final boolean f31192r;
    public boolean f31193r0;
    public final int f31194s;
    public Utilities.CallbackReturn f31195s0;
    public Integer f31196t0;
    public int f31197u0;
    public int v;
    public String[] f31198w;
    public int f31199x;
    public boolean f31200y;

    public vc0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(i2.g.i(mode, "Unknown measure mode: "));
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

    public final void a(boolean z10) {
        this.d.setVisibility(4);
        if (!h(this.S)) {
            h(this.T);
        }
        this.U = 0;
        if (z10) {
            this.S.d(-this.P, 300);
        } else {
            this.S.d(this.P, 300);
        }
        invalidate();
    }

    public final void b(int i10) {
        String str;
        SparseArray sparseArray = this.M;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.f31199x;
        if (i10 >= i11 && i10 <= this.E) {
            String[] strArr = this.f31198w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                rc0 rc0Var = this.K;
                if (rc0Var != null) {
                    str = rc0Var.f(i10);
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
        int i10 = this.Q - this.R;
        if (i10 == 0) {
            return false;
        }
        this.U = 0;
        int abs = Math.abs(i10);
        int i11 = this.P;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.T.d(i10, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        nm0 nm0Var = this.S;
        if (nm0Var.f28832q) {
            nm0Var = this.T;
            if (nm0Var.f28832q) {
                return;
            }
        }
        nm0Var.b();
        int i10 = nm0Var.f28826k;
        if (this.U == 0) {
            this.U = nm0Var.f28820c;
        }
        scrollBy(0, i10 - this.U);
        this.U = i10;
        if (nm0Var.f28832q) {
            if (nm0Var == this.S) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.f31185k0 != 1) {
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
        return this.R;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.E - this.f31199x) + 1) * this.P;
    }

    public CharSequence d(int i10) {
        return this.d.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        if (this.F && i10 > (i14 = this.E) && (i16 = i14 - (i15 = this.f31199x)) != 0) {
            return (((i10 - i14) % i16) + i15) - 1;
        }
        if (this.f31200y && i10 < (i11 = this.f31199x) && (i13 = (i12 = this.E) - i11) != 0) {
            return (i12 - ((i11 - i10) % i13)) + 1;
        }
        return i10;
    }

    public final void f() {
        this.M.clear();
        int[] iArr = this.N;
        int value = getValue();
        for (int i10 = 0; i10 < this.N.length; i10++) {
            int i11 = (i10 - this.f31172b) + value;
            if (this.f31181g0) {
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
        return this.f31198w;
    }

    public int getItemsCount() {
        return this.f31170a;
    }

    public int getMaxValue() {
        return this.E;
    }

    public int getMinValue() {
        return this.f31199x;
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
        return this.G;
    }

    public boolean getWrapSelectorWheel() {
        return this.f31181g0;
    }

    public final boolean h(nm0 nm0Var) {
        nm0Var.f28832q = true;
        int i10 = nm0Var.f28821e - nm0Var.f28826k;
        int i11 = this.Q - ((this.R + i10) % this.P);
        if (i11 == 0) {
            return false;
        }
        int abs = Math.abs(i11);
        int i12 = this.P;
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
        if (this.f31185k0 != i10) {
            this.f31185k0 = i10;
            sc0 sc0Var = this.J;
            if (sc0Var != null) {
                sc0Var.b(i10);
            }
            if (i10 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f31198w;
                    if (strArr == null) {
                        int i11 = this.G;
                        rc0 rc0Var = this.K;
                        if (rc0Var != null) {
                            str = rc0Var.f(i11);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                        }
                    } else {
                        str = strArr[this.G - this.f31199x];
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
        qc0 qc0Var = this.V;
        if (qc0Var != null) {
            removeCallbacks(qc0Var);
        }
        this.f31190p0.a();
    }

    public final void l(int i10, boolean z10) {
        int min;
        sc0 sc0Var;
        tc0 tc0Var;
        if (this.G != i10) {
            if (this.f31181g0) {
                min = e(i10);
            } else {
                min = Math.min(Math.max(i10, this.f31199x), this.E);
            }
            int i11 = this.G;
            this.H = min;
            this.G = min;
            n();
            if (Math.abs(i11 - min) > 0.9f) {
                AndroidUtilities.vibrateCursor(this);
            }
            if (z10 && (tc0Var = this.I) != null) {
                tc0Var.s(this, this.G);
            }
            f();
            invalidate();
            if (this.f31185k0 == 0 && (sc0Var = this.J) != null) {
                sc0Var.b(0);
            }
        }
    }

    public final void m() {
        int i10;
        if (this.f31192r) {
            String[] strArr = this.f31198w;
            Paint paint = this.O;
            int i11 = 0;
            if (strArr == null) {
                float f7 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
                    if (measureText > f7) {
                        f7 = measureText;
                    }
                }
                for (int i13 = this.E; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f7);
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
            if (this.f31187n != paddingRight) {
                int i15 = this.h;
                if (paddingRight > i15) {
                    this.f31187n = paddingRight;
                } else {
                    this.f31187n = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f31198w;
        if (strArr == null) {
            int i10 = this.G;
            rc0 rc0Var = this.K;
            if (rc0Var != null) {
                str = rc0Var.f(i10);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        } else {
            str = strArr[this.G - this.f31199x];
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
        boolean z10;
        int i12;
        int i13 = this.f31197u0;
        if (i13 == 5) {
            this.O.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i13 == 3) {
            this.O.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.O.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f7 = width + this.f31174c;
        float f10 = this.R;
        int[] iArr = this.N;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String str = (String) this.M.get(iArr[i14]);
            if (str != null && (i14 != this.f31172b || this.d.getVisibility() != 0)) {
                if (this.f31170a > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f10 - (this.O.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f31169v0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.O.getTextSize() * (1.0f - interpolation);
                    if (!z10) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f7, textSize);
                    if (interpolation < 0.1f) {
                        i12 = this.O.getAlpha();
                        this.O.setAlpha((int) ((i12 * interpolation) / 0.1f));
                    } else {
                        i12 = -1;
                    }
                    canvas.drawText(str, f7, f10, this.O);
                    canvas.restore();
                    if (i12 != -1) {
                        this.O.setAlpha(i12);
                    }
                } else {
                    canvas.drawText(str, f7, f10, this.O);
                }
            }
            f10 += this.P;
        }
        if (this.f31193r0) {
            canvas.drawRect(0.0f, this.f31186l0, getRight(), this.f31184j0 + i10, this.f31183i0);
            canvas.drawRect(0.0f, i11 - this.f31184j0, getRight(), this.m0, this.f31183i0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.d.setVisibility(4);
        float y3 = motionEvent.getY();
        this.W = y3;
        this.f31173b0 = y3;
        this.f31171a0 = motionEvent.getEventTime();
        float f7 = this.W;
        if (f7 < this.f31186l0) {
            if (this.f31185k0 == 0) {
                uc0 uc0Var = this.f31190p0;
                uc0Var.a();
                uc0Var.f30862c = 1;
                uc0Var.f30861b = 2;
                ((vc0) uc0Var.d).postDelayed(uc0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f7 > this.m0 && this.f31185k0 == 0) {
            uc0 uc0Var2 = this.f31190p0;
            uc0Var2.a();
            uc0Var2.f30862c = 1;
            uc0Var2.f30861b = 1;
            ((vc0) uc0Var2.d).postDelayed(uc0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        nm0 nm0Var = this.S;
        if (!nm0Var.f28832q) {
            nm0Var.f28832q = true;
            this.T.f28832q = true;
            i(0);
            return true;
        }
        nm0 nm0Var2 = this.T;
        if (!nm0Var2.f28832q) {
            nm0Var.f28832q = true;
            nm0Var2.f28832q = true;
            return true;
        }
        float f10 = this.W;
        if (f10 < this.f31186l0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.V;
            if (runnable == null) {
                this.V = new qc0(this);
            } else {
                removeCallbacks(runnable);
            }
            qc0 qc0Var = this.V;
            qc0Var.f29691a = false;
            postDelayed(qc0Var, longPressTimeout);
            return true;
        }
        if (f10 > this.m0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.V;
            if (runnable2 == null) {
                this.V = new qc0(this);
            } else {
                removeCallbacks(runnable2);
            }
            qc0 qc0Var2 = this.V;
            qc0Var2.f29691a = true;
            postDelayed(qc0Var2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.d.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        if (z10) {
            f();
            int[] iArr = this.N;
            int length = iArr.length;
            int i16 = this.f31194s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / iArr.length) + 0.5f);
            this.v = bottom;
            this.P = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.P * this.f31172b);
            this.Q = top;
            this.R = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.f31186l0 = ((getHeight() - i16) - this.v) / 2;
            this.m0 = ((getHeight() + i16) + this.v) / 2;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.f31187n), g(i11, this.f31179f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i10), k(this.f31177e, getMeasuredHeight(), i11));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f31175c0 == null) {
            this.f31175c0 = VelocityTracker.obtain();
        }
        this.f31175c0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y3 = motionEvent.getY();
            if (this.f31185k0 != 1) {
                if (((int) Math.abs(y3 - this.W)) > this.f31176d0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y3 - this.f31173b0));
                invalidate();
            }
            this.f31173b0 = y3;
            return true;
        }
        qc0 qc0Var = this.V;
        if (qc0Var != null) {
            removeCallbacks(qc0Var);
        }
        this.f31190p0.a();
        VelocityTracker velocityTracker = this.f31175c0;
        velocityTracker.computeCurrentVelocity(1000, this.f31180f0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f31178e0) {
            this.U = 0;
            if (yVelocity > 0) {
                this.S.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.S.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y10 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y10 - this.W);
            long eventTime = motionEvent.getEventTime() - this.f31171a0;
            if (abs <= this.f31176d0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i10 = (y10 / this.P) - this.f31172b;
                if (i10 > 0) {
                    a(true);
                    uc0 uc0Var = this.f31190p0;
                    uc0Var.a();
                    uc0Var.f30862c = 2;
                    uc0Var.f30861b = 1;
                    ((vc0) uc0Var.d).post(uc0Var);
                } else if (i10 < 0) {
                    a(false);
                    uc0 uc0Var2 = this.f31190p0;
                    uc0Var2.a();
                    uc0Var2.f30862c = 2;
                    uc0Var2.f30861b = 2;
                    ((vc0) uc0Var2.d).post(uc0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f31175c0.recycle();
        this.f31175c0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.N;
        boolean z10 = this.f31181g0;
        if (!z10 && i11 > 0 && iArr[this.f31172b] <= this.f31199x) {
            int i12 = this.R + i11;
            int i13 = this.Q;
            if (i12 > i13) {
                this.R = i13;
                return;
            }
        }
        if (!z10 && i11 < 0 && iArr[this.f31172b] >= this.E) {
            int i14 = this.R + i11;
            int i15 = this.Q;
            if (i14 < i15) {
                this.R = i15;
                return;
            }
        }
        this.R += i11;
        while (true) {
            int i16 = this.R;
            if (i16 - this.Q <= this.v) {
                break;
            }
            this.R = i16 - this.P;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i17 = iArr[1] - 1;
            if (this.f31181g0 && i17 < this.f31199x) {
                i17 = this.E;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.f31181g0 && iArr[this.f31172b] <= this.f31199x) {
                int i18 = this.R;
                int i19 = this.Q;
                if (i18 > i19) {
                    this.R = i19;
                }
            }
        }
        while (true) {
            int i20 = this.R;
            if (i20 - this.Q < (-this.v)) {
                this.R = i20 + this.P;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i21 = iArr[iArr.length - 2] + 1;
                if (this.f31181g0 && i21 > this.E) {
                    i21 = this.f31199x;
                }
                iArr[iArr.length - 1] = i21;
                b(i21);
                if (!this.f31181g0 && iArr[this.f31172b] >= this.E) {
                    int i22 = this.R;
                    int i23 = this.Q;
                    if (i22 < i23) {
                        this.R = i23;
                    }
                }
            } else {
                l(iArr[this.f31172b], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.f31196t0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.f31182h0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.f31195s0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f31198w == strArr) {
            return;
        }
        this.f31198w = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f31193r0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.d.setEnabled(z10);
    }

    public void setFormatter(rc0 rc0Var) {
        if (rc0Var == this.K) {
            return;
        }
        this.K = rc0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i10) {
        this.f31197u0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.f31170a == i10) {
            return;
        }
        this.f31170a = i10;
        this.f31172b = i10 / 2;
        this.N = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        sc0 sc0Var;
        this.F = true;
        if (this.E != i10) {
            if (i10 >= 0) {
                this.E = i10;
                if (i10 < this.G) {
                    int i11 = this.H;
                    if (i10 >= i11) {
                        this.G = i11;
                    } else {
                        this.G = i10;
                    }
                }
                setWrapSelectorWheel(this.f31182h0);
                f();
                n();
                m();
                invalidate();
                if (this.f31185k0 == 0 && (sc0Var = this.J) != null) {
                    sc0Var.b(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i10) {
        sc0 sc0Var;
        this.f31200y = true;
        if (this.f31199x != i10) {
            if (i10 >= 0) {
                this.f31199x = i10;
                if (i10 > this.G) {
                    int i11 = this.H;
                    if (i10 <= i11) {
                        this.G = i11;
                    } else {
                        this.G = i10;
                    }
                }
                setWrapSelectorWheel(this.f31182h0);
                f();
                n();
                m();
                invalidate();
                if (this.f31185k0 == 0 && (sc0Var = this.J) != null) {
                    sc0Var.b(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j3) {
        this.L = j3;
    }

    public void setOnScrollListener(sc0 sc0Var) {
        this.J = sc0Var;
    }

    public void setOnValueChangedListener(tc0 tc0Var) {
        this.I = tc0Var;
    }

    public void setSelectorColor(int i10) {
        this.f31183i0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.O.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.f31174c = i10;
        invalidate();
    }

    public void setValue(int i10) {
        l(i10, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc0.setWrapSelectorWheel(boolean):void");
    }

    public vc0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 18, f6Var);
    }

    public vc0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31170a = 3;
        this.f31172b = 1;
        this.L = 300L;
        this.M = new SparseArray();
        this.N = new int[this.f31170a];
        this.Q = Integer.MIN_VALUE;
        this.f31185k0 = 0;
        this.f31191q0 = -1;
        this.f31193r0 = true;
        int dp = AndroidUtilities.dp(i10);
        this.f31194s = dp;
        Paint paint = new Paint();
        this.f31183i0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        this.f31184j0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f31177e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f31179f = applyDimension;
        int i11 = this.f31177e;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f31187n = -1;
        this.f31192r = true;
        this.f31190p0 = new uc0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
        this.d.setBackgroundResource(0);
        float f7 = dp;
        this.d.setTextSize(0, f7);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f31176d0 = viewConfiguration.getScaledTouchSlop();
        this.f31178e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f31180f0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f7);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.O = paint2;
        this.S = new nm0(getContext(), null);
        this.T = new nm0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new pc0(this));
    }
}
