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
public class xc0 extends LinearLayout {
    public static final mr f30596s0 = new mr(0.0f, 0.5f, 0.5f, 1.0f);
    public int B;
    public boolean C;
    public int D;
    public int E;
    public vc0 F;
    public uc0 G;
    public tc0 H;
    public long I;
    public final SparseArray J;
    public int[] K;
    public final Paint L;
    public int M;
    public int N;
    public int O;
    public final um0 P;
    public final um0 Q;
    public int R;
    public sc0 S;
    public float T;
    public long U;
    public float V;
    public VelocityTracker W;
    public int f30597a;
    public final int f30598a0;
    public int f30599b;
    public final int f30600b0;
    public int f30601c;
    public final int f30602c0;
    public final TextView d;
    public boolean f30603d0;
    public final int e;
    public boolean f30604e0;
    public final int f30605f;
    public final Paint f30606f0;
    public final int f30607g0;
    public final int h;
    public int f30608h0;
    public int f30609i0;
    public int f30610j0;
    public boolean f30611k0;
    public boolean f30612l0;
    public final wc0 m0;
    public int f30613n;
    public int f30614n0;
    public boolean f30615o0;
    public Utilities.CallbackReturn f30616p0;
    public Integer f30617q0;
    public final boolean f30618r;
    public int f30619r0;
    public final int f30620s;
    public int v;
    public String[] f30621w;
    public int f30622x;
    public boolean f30623y;

    public xc0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(kf.k0.j(mode, "Unknown measure mode: "));
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
        int i11 = this.f30622x;
        if (i10 >= i11 && i10 <= this.B) {
            String[] strArr = this.f30621w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                tc0 tc0Var = this.H;
                if (tc0Var != null) {
                    str = tc0Var.e(i10);
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
        um0 um0Var = this.P;
        if (um0Var.f29262q) {
            um0Var = this.Q;
            if (um0Var.f29262q) {
                return;
            }
        }
        um0Var.b();
        int i10 = um0Var.f29256k;
        if (this.R == 0) {
            this.R = um0Var.f29251c;
        }
        scrollBy(0, i10 - this.R);
        this.R = i10;
        if (um0Var.f29262q) {
            if (um0Var == this.P) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.f30608h0 != 1) {
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
        return ((this.B - this.f30622x) + 1) * this.M;
    }

    public CharSequence d(int i10) {
        return this.d.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xc0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        if (this.C && i10 > (i14 = this.B) && (i16 = i14 - (i15 = this.f30622x)) != 0) {
            return (((i10 - i14) % i16) + i15) - 1;
        }
        if (this.f30623y && i10 < (i11 = this.f30622x) && (i13 = (i12 = this.B) - i11) != 0) {
            return (i12 - ((i11 - i10) % i13)) + 1;
        }
        return i10;
    }

    public final void f() {
        this.J.clear();
        int[] iArr = this.K;
        int value = getValue();
        for (int i10 = 0; i10 < this.K.length; i10++) {
            int i11 = (i10 - this.f30599b) + value;
            if (this.f30603d0) {
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
        return this.f30621w;
    }

    public int getItemsCount() {
        return this.f30597a;
    }

    public int getMaxValue() {
        return this.B;
    }

    public int getMinValue() {
        return this.f30622x;
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
        return this.f30603d0;
    }

    public final boolean h(um0 um0Var) {
        um0Var.f29262q = true;
        int i10 = um0Var.e - um0Var.f29256k;
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
        if (this.f30608h0 != i10) {
            this.f30608h0 = i10;
            uc0 uc0Var = this.G;
            if (uc0Var != null) {
                uc0Var.k(i10);
            }
            if (i10 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f30621w;
                    if (strArr == null) {
                        int i11 = this.D;
                        tc0 tc0Var = this.H;
                        if (tc0Var != null) {
                            str = tc0Var.e(i11);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                        }
                    } else {
                        str = strArr[this.D - this.f30622x];
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
        sc0 sc0Var = this.S;
        if (sc0Var != null) {
            removeCallbacks(sc0Var);
        }
        this.m0.a();
    }

    public final void l(int i10, boolean z4) {
        int min;
        uc0 uc0Var;
        vc0 vc0Var;
        if (this.D != i10) {
            if (this.f30603d0) {
                min = e(i10);
            } else {
                min = Math.min(Math.max(i10, this.f30622x), this.B);
            }
            int i11 = this.D;
            this.E = min;
            this.D = min;
            n();
            if (Math.abs(i11 - min) > 0.9f) {
                AndroidUtilities.vibrateCursor(this);
            }
            if (z4 && (vc0Var = this.F) != null) {
                vc0Var.q(this, this.D);
            }
            f();
            invalidate();
            if (this.f30608h0 == 0 && (uc0Var = this.G) != null) {
                uc0Var.k(0);
            }
        }
    }

    public final void m() {
        int i10;
        if (this.f30618r) {
            String[] strArr = this.f30621w;
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
            if (this.f30613n != paddingRight) {
                int i15 = this.h;
                if (paddingRight > i15) {
                    this.f30613n = paddingRight;
                } else {
                    this.f30613n = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f30621w;
        if (strArr == null) {
            int i10 = this.D;
            tc0 tc0Var = this.H;
            if (tc0Var != null) {
                str = tc0Var.e(i10);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        } else {
            str = strArr[this.D - this.f30622x];
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
        int i13 = this.f30619r0;
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
        float f10 = width + this.f30601c;
        float f11 = this.O;
        int[] iArr = this.K;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String str = (String) this.J.get(iArr[i14]);
            if (str != null && (i14 != this.f30599b || this.d.getVisibility() != 0)) {
                if (this.f30597a > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f11 - (this.L.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z4 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z4 = false;
                    }
                    float interpolation = f30596s0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
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
        if (this.f30615o0) {
            canvas.drawRect(0.0f, this.f30609i0, getRight(), this.f30607g0 + i10, this.f30606f0);
            canvas.drawRect(0.0f, i11 - this.f30607g0, getRight(), this.f30610j0, this.f30606f0);
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
        if (f10 < this.f30609i0) {
            if (this.f30608h0 == 0) {
                wc0 wc0Var = this.m0;
                wc0Var.a();
                wc0Var.f30219c = 1;
                wc0Var.f30218b = 2;
                ((xc0) wc0Var.d).postDelayed(wc0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f10 > this.f30610j0 && this.f30608h0 == 0) {
            wc0 wc0Var2 = this.m0;
            wc0Var2.a();
            wc0Var2.f30219c = 1;
            wc0Var2.f30218b = 1;
            ((xc0) wc0Var2.d).postDelayed(wc0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        um0 um0Var = this.P;
        if (!um0Var.f29262q) {
            um0Var.f29262q = true;
            this.Q.f29262q = true;
            i(0);
            return true;
        }
        um0 um0Var2 = this.Q;
        if (!um0Var2.f29262q) {
            um0Var.f29262q = true;
            um0Var2.f29262q = true;
            return true;
        }
        float f11 = this.T;
        if (f11 < this.f30609i0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.S;
            if (runnable == null) {
                this.S = new sc0(this);
            } else {
                removeCallbacks(runnable);
            }
            sc0 sc0Var = this.S;
            sc0Var.f28721a = false;
            postDelayed(sc0Var, longPressTimeout);
            return true;
        }
        if (f11 > this.f30610j0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.S;
            if (runnable2 == null) {
                this.S = new sc0(this);
            } else {
                removeCallbacks(runnable2);
            }
            sc0 sc0Var2 = this.S;
            sc0Var2.f28721a = true;
            postDelayed(sc0Var2, longPressTimeout2);
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
            int i16 = this.f30620s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / iArr.length) + 0.5f);
            this.v = bottom;
            this.M = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.M * this.f30599b);
            this.N = top;
            this.O = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.f30609i0 = ((getHeight() - i16) - this.v) / 2;
            this.f30610j0 = ((getHeight() + i16) + this.v) / 2;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.f30613n), g(i11, this.f30605f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i10), k(this.e, getMeasuredHeight(), i11));
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
            if (this.f30608h0 != 1) {
                if (((int) Math.abs(y10 - this.T)) > this.f30598a0) {
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
        sc0 sc0Var = this.S;
        if (sc0Var != null) {
            removeCallbacks(sc0Var);
        }
        this.m0.a();
        VelocityTracker velocityTracker = this.W;
        velocityTracker.computeCurrentVelocity(1000, this.f30602c0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f30600b0) {
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
            if (abs <= this.f30598a0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i10 = (y11 / this.M) - this.f30599b;
                if (i10 > 0) {
                    a(true);
                    wc0 wc0Var = this.m0;
                    wc0Var.a();
                    wc0Var.f30219c = 2;
                    wc0Var.f30218b = 1;
                    ((xc0) wc0Var.d).post(wc0Var);
                } else if (i10 < 0) {
                    a(false);
                    wc0 wc0Var2 = this.m0;
                    wc0Var2.a();
                    wc0Var2.f30219c = 2;
                    wc0Var2.f30218b = 2;
                    ((xc0) wc0Var2.d).post(wc0Var2);
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
        boolean z4 = this.f30603d0;
        if (!z4 && i11 > 0 && iArr[this.f30599b] <= this.f30622x) {
            int i12 = this.O + i11;
            int i13 = this.N;
            if (i12 > i13) {
                this.O = i13;
                return;
            }
        }
        if (!z4 && i11 < 0 && iArr[this.f30599b] >= this.B) {
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
            if (this.f30603d0 && i17 < this.f30622x) {
                i17 = this.B;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.f30603d0 && iArr[this.f30599b] <= this.f30622x) {
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
                if (this.f30603d0 && i21 > this.B) {
                    i21 = this.f30622x;
                }
                iArr[iArr.length - 1] = i21;
                b(i21);
                if (!this.f30603d0 && iArr[this.f30599b] >= this.B) {
                    int i22 = this.O;
                    int i23 = this.N;
                    if (i22 < i23) {
                        this.O = i23;
                    }
                }
            } else {
                l(iArr[this.f30599b], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.f30617q0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.f30604e0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.f30616p0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f30621w == strArr) {
            return;
        }
        this.f30621w = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z4) {
        this.f30615o0 = z4;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.d.setEnabled(z4);
    }

    public void setFormatter(tc0 tc0Var) {
        if (tc0Var == this.H) {
            return;
        }
        this.H = tc0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i10) {
        this.f30619r0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.f30597a == i10) {
            return;
        }
        this.f30597a = i10;
        this.f30599b = i10 / 2;
        this.K = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        uc0 uc0Var;
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
                setWrapSelectorWheel(this.f30604e0);
                f();
                n();
                m();
                invalidate();
                if (this.f30608h0 == 0 && (uc0Var = this.G) != null) {
                    uc0Var.k(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i10) {
        uc0 uc0Var;
        this.f30623y = true;
        if (this.f30622x != i10) {
            if (i10 >= 0) {
                this.f30622x = i10;
                if (i10 > this.D) {
                    int i11 = this.E;
                    if (i10 <= i11) {
                        this.D = i11;
                    } else {
                        this.D = i10;
                    }
                }
                setWrapSelectorWheel(this.f30604e0);
                f();
                n();
                m();
                invalidate();
                if (this.f30608h0 == 0 && (uc0Var = this.G) != null) {
                    uc0Var.k(0);
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

    public void setOnScrollListener(uc0 uc0Var) {
        this.G = uc0Var;
    }

    public void setOnValueChangedListener(vc0 vc0Var) {
        this.F = vc0Var;
    }

    public void setSelectorColor(int i10) {
        this.f30606f0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.L.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.f30601c = i10;
        invalidate();
    }

    public void setValue(int i10) {
        l(i10, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xc0.setWrapSelectorWheel(boolean):void");
    }

    public xc0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 18, f6Var);
    }

    public xc0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30597a = 3;
        this.f30599b = 1;
        this.I = 300L;
        this.J = new SparseArray();
        this.K = new int[this.f30597a];
        this.N = Integer.MIN_VALUE;
        this.f30608h0 = 0;
        this.f30614n0 = -1;
        this.f30615o0 = true;
        int dp = AndroidUtilities.dp(i10);
        this.f30620s = dp;
        Paint paint = new Paint();
        this.f30606f0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        this.f30607g0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f30605f = applyDimension;
        int i11 = this.e;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f30613n = -1;
        this.f30618r = true;
        this.m0 = new wc0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
        this.d.setBackgroundResource(0);
        float f10 = dp;
        this.d.setTextSize(0, f10);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f30598a0 = viewConfiguration.getScaledTouchSlop();
        this.f30600b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f30602c0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f10);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.L = paint2;
        this.P = new um0(getContext(), null);
        this.Q = new um0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new rc0(this));
    }
}
