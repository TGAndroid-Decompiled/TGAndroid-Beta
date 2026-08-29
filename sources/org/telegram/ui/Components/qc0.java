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
public class qc0 extends LinearLayout {
    public static final jr f31893r0 = new jr(0.0f, 0.5f, 0.5f, 1.0f);
    public int A;
    public boolean B;
    public int C;
    public int D;
    public oc0 E;
    public nc0 F;
    public mc0 G;
    public long H;
    public final SparseArray I;
    public int[] J;
    public final Paint K;
    public int L;
    public int M;
    public int N;
    public final lm0 O;
    public final lm0 P;
    public int Q;
    public lc0 R;
    public float S;
    public long T;
    public float U;
    public VelocityTracker V;
    public final int W;
    public int f31894a;
    public final int f31895a0;
    public int f31896b;
    public final int f31897b0;
    public int f31898c;
    public boolean f31899c0;
    public final TextView d;
    public boolean f31900d0;
    public final int f31901e;
    public final Paint f31902e0;
    public final int f31903f;
    public final int f31904f0;
    public int f31905g0;
    public final int h;
    public int f31906h0;
    public int f31907i0;
    public boolean f31908j0;
    public boolean f31909k0;
    public final pc0 f31910l0;
    public int m0;
    public int f31911n;
    public boolean f31912n0;
    public Utilities.CallbackReturn f31913o0;
    public Integer f31914p0;
    public int f31915q0;
    public final boolean f31916r;
    public final int f31917s;
    public int v;
    public String[] f31918w;
    public int f31919x;
    public boolean f31920y;

    public qc0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(j7.l1.k(mode, "Unknown measure mode: "));
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
        if (!h(this.O)) {
            h(this.P);
        }
        this.Q = 0;
        if (z10) {
            this.O.d(-this.L, 300);
        } else {
            this.O.d(this.L, 300);
        }
        invalidate();
    }

    public final void b(int i10) {
        String str;
        SparseArray sparseArray = this.I;
        if (((String) sparseArray.get(i10)) != null) {
            return;
        }
        int i11 = this.f31919x;
        if (i10 >= i11 && i10 <= this.A) {
            String[] strArr = this.f31918w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                mc0 mc0Var = this.G;
                if (mc0Var != null) {
                    str = mc0Var.e(i10);
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
        int i10 = this.M - this.N;
        if (i10 == 0) {
            return false;
        }
        this.Q = 0;
        int abs = Math.abs(i10);
        int i11 = this.L;
        if (abs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        this.P.d(i10, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        lm0 lm0Var = this.O;
        if (lm0Var.f30395q) {
            lm0Var = this.P;
            if (lm0Var.f30395q) {
                return;
            }
        }
        lm0Var.b();
        int i10 = lm0Var.f30389k;
        if (this.Q == 0) {
            this.Q = lm0Var.f30383c;
        }
        scrollBy(0, i10 - this.Q);
        this.Q = i10;
        if (lm0Var.f30395q) {
            if (lm0Var == this.O) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.f31905g0 != 1) {
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
        return this.N;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.A - this.f31919x) + 1) * this.L;
    }

    public CharSequence d(int i10) {
        return this.d.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        if (this.B && i10 > (i14 = this.A) && (i16 = i14 - (i15 = this.f31919x)) != 0) {
            return (((i10 - i14) % i16) + i15) - 1;
        }
        if (this.f31920y && i10 < (i11 = this.f31919x) && (i13 = (i12 = this.A) - i11) != 0) {
            return (i12 - ((i11 - i10) % i13)) + 1;
        }
        return i10;
    }

    public final void f() {
        this.I.clear();
        int[] iArr = this.J;
        int value = getValue();
        for (int i10 = 0; i10 < this.J.length; i10++) {
            int i11 = (i10 - this.f31896b) + value;
            if (this.f31899c0) {
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
        return this.f31918w;
    }

    public int getItemsCount() {
        return this.f31894a;
    }

    public int getMaxValue() {
        return this.A;
    }

    public int getMinValue() {
        return this.f31919x;
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
        return this.C;
    }

    public boolean getWrapSelectorWheel() {
        return this.f31899c0;
    }

    public final boolean h(lm0 lm0Var) {
        lm0Var.f30395q = true;
        int i10 = lm0Var.f30384e - lm0Var.f30389k;
        int i11 = this.M - ((this.N + i10) % this.L);
        if (i11 == 0) {
            return false;
        }
        int abs = Math.abs(i11);
        int i12 = this.L;
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
        if (this.f31905g0 != i10) {
            this.f31905g0 = i10;
            nc0 nc0Var = this.F;
            if (nc0Var != null) {
                nc0Var.n(i10);
            }
            if (i10 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f31918w;
                    if (strArr == null) {
                        int i11 = this.C;
                        mc0 mc0Var = this.G;
                        if (mc0Var != null) {
                            str = mc0Var.e(i11);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                        }
                    } else {
                        str = strArr[this.C - this.f31919x];
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
        lc0 lc0Var = this.R;
        if (lc0Var != null) {
            removeCallbacks(lc0Var);
        }
        this.f31910l0.a();
    }

    public final void l(int i10, boolean z10) {
        int min;
        nc0 nc0Var;
        oc0 oc0Var;
        if (this.C != i10) {
            if (this.f31899c0) {
                min = e(i10);
            } else {
                min = Math.min(Math.max(i10, this.f31919x), this.A);
            }
            int i11 = this.C;
            this.D = min;
            this.C = min;
            n();
            if (Math.abs(i11 - min) > 0.9f) {
                AndroidUtilities.vibrateCursor(this);
            }
            if (z10 && (oc0Var = this.E) != null) {
                oc0Var.q(this, this.C);
            }
            f();
            invalidate();
            if (this.f31905g0 == 0 && (nc0Var = this.F) != null) {
                nc0Var.n(0);
            }
        }
    }

    public final void m() {
        int i10;
        if (this.f31916r) {
            String[] strArr = this.f31918w;
            Paint paint = this.K;
            int i11 = 0;
            if (strArr == null) {
                float f9 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
                    if (measureText > f9) {
                        f9 = measureText;
                    }
                }
                for (int i13 = this.A; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f9);
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
            if (this.f31911n != paddingRight) {
                int i15 = this.h;
                if (paddingRight > i15) {
                    this.f31911n = paddingRight;
                } else {
                    this.f31911n = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f31918w;
        if (strArr == null) {
            int i10 = this.C;
            mc0 mc0Var = this.G;
            if (mc0Var != null) {
                str = mc0Var.e(i10);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        } else {
            str = strArr[this.C - this.f31919x];
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
        int i13 = this.f31915q0;
        if (i13 == 5) {
            this.K.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i13 == 3) {
            this.K.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            this.K.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f9 = width + this.f31898c;
        float f10 = this.N;
        int[] iArr = this.J;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String str = (String) this.I.get(iArr[i14]);
            if (str != null && (i14 != this.f31896b || this.d.getVisibility() != 0)) {
                if (this.f31894a > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f10 - (this.K.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f31893r0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = this.K.getTextSize() * (1.0f - interpolation);
                    if (!z10) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f9, textSize);
                    if (interpolation < 0.1f) {
                        i12 = this.K.getAlpha();
                        this.K.setAlpha((int) ((i12 * interpolation) / 0.1f));
                    } else {
                        i12 = -1;
                    }
                    canvas.drawText(str, f9, f10, this.K);
                    canvas.restore();
                    if (i12 != -1) {
                        this.K.setAlpha(i12);
                    }
                } else {
                    canvas.drawText(str, f9, f10, this.K);
                }
            }
            f10 += this.L;
        }
        if (this.f31912n0) {
            canvas.drawRect(0.0f, this.f31906h0, getRight(), this.f31904f0 + i10, this.f31902e0);
            canvas.drawRect(0.0f, i11 - this.f31904f0, getRight(), this.f31907i0, this.f31902e0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.d.setVisibility(4);
        float y8 = motionEvent.getY();
        this.S = y8;
        this.U = y8;
        this.T = motionEvent.getEventTime();
        float f9 = this.S;
        if (f9 < this.f31906h0) {
            if (this.f31905g0 == 0) {
                pc0 pc0Var = this.f31910l0;
                pc0Var.a();
                pc0Var.f31646c = 1;
                pc0Var.f31645b = 2;
                ((qc0) pc0Var.d).postDelayed(pc0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f9 > this.f31907i0 && this.f31905g0 == 0) {
            pc0 pc0Var2 = this.f31910l0;
            pc0Var2.a();
            pc0Var2.f31646c = 1;
            pc0Var2.f31645b = 1;
            ((qc0) pc0Var2.d).postDelayed(pc0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        lm0 lm0Var = this.O;
        if (!lm0Var.f30395q) {
            lm0Var.f30395q = true;
            this.P.f30395q = true;
            i(0);
            return true;
        }
        lm0 lm0Var2 = this.P;
        if (!lm0Var2.f30395q) {
            lm0Var.f30395q = true;
            lm0Var2.f30395q = true;
            return true;
        }
        float f10 = this.S;
        if (f10 < this.f31906h0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.R;
            if (runnable == null) {
                this.R = new lc0(this);
            } else {
                removeCallbacks(runnable);
            }
            lc0 lc0Var = this.R;
            lc0Var.f30287a = false;
            postDelayed(lc0Var, longPressTimeout);
            return true;
        }
        if (f10 > this.f31907i0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.R;
            if (runnable2 == null) {
                this.R = new lc0(this);
            } else {
                removeCallbacks(runnable2);
            }
            lc0 lc0Var2 = this.R;
            lc0Var2.f30287a = true;
            postDelayed(lc0Var2, longPressTimeout2);
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
            int[] iArr = this.J;
            int length = iArr.length;
            int i16 = this.f31917s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / iArr.length) + 0.5f);
            this.v = bottom;
            this.L = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.L * this.f31896b);
            this.M = top;
            this.N = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.f31906h0 = ((getHeight() - i16) - this.v) / 2;
            this.f31907i0 = ((getHeight() + i16) + this.v) / 2;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.f31911n), g(i11, this.f31903f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i10), k(this.f31901e, getMeasuredHeight(), i11));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.V == null) {
            this.V = VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y8 = motionEvent.getY();
            if (this.f31905g0 != 1) {
                if (((int) Math.abs(y8 - this.S)) > this.W) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y8 - this.U));
                invalidate();
            }
            this.U = y8;
            return true;
        }
        lc0 lc0Var = this.R;
        if (lc0Var != null) {
            removeCallbacks(lc0Var);
        }
        this.f31910l0.a();
        VelocityTracker velocityTracker = this.V;
        velocityTracker.computeCurrentVelocity(1000, this.f31897b0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f31895a0) {
            this.Q = 0;
            if (yVelocity > 0) {
                this.O.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.O.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y10 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y10 - this.S);
            long eventTime = motionEvent.getEventTime() - this.T;
            if (abs <= this.W && eventTime < ViewConfiguration.getTapTimeout()) {
                int i10 = (y10 / this.L) - this.f31896b;
                if (i10 > 0) {
                    a(true);
                    pc0 pc0Var = this.f31910l0;
                    pc0Var.a();
                    pc0Var.f31646c = 2;
                    pc0Var.f31645b = 1;
                    ((qc0) pc0Var.d).post(pc0Var);
                } else if (i10 < 0) {
                    a(false);
                    pc0 pc0Var2 = this.f31910l0;
                    pc0Var2.a();
                    pc0Var2.f31646c = 2;
                    pc0Var2.f31645b = 2;
                    ((qc0) pc0Var2.d).post(pc0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.V.recycle();
        this.V = null;
        return true;
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.J;
        boolean z10 = this.f31899c0;
        if (!z10 && i11 > 0 && iArr[this.f31896b] <= this.f31919x) {
            int i12 = this.N + i11;
            int i13 = this.M;
            if (i12 > i13) {
                this.N = i13;
                return;
            }
        }
        if (!z10 && i11 < 0 && iArr[this.f31896b] >= this.A) {
            int i14 = this.N + i11;
            int i15 = this.M;
            if (i14 < i15) {
                this.N = i15;
                return;
            }
        }
        this.N += i11;
        while (true) {
            int i16 = this.N;
            if (i16 - this.M <= this.v) {
                break;
            }
            this.N = i16 - this.L;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i17 = iArr[1] - 1;
            if (this.f31899c0 && i17 < this.f31919x) {
                i17 = this.A;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.f31899c0 && iArr[this.f31896b] <= this.f31919x) {
                int i18 = this.N;
                int i19 = this.M;
                if (i18 > i19) {
                    this.N = i19;
                }
            }
        }
        while (true) {
            int i20 = this.N;
            if (i20 - this.M < (-this.v)) {
                this.N = i20 + this.L;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i21 = iArr[iArr.length - 2] + 1;
                if (this.f31899c0 && i21 > this.A) {
                    i21 = this.f31919x;
                }
                iArr[iArr.length - 1] = i21;
                b(i21);
                if (!this.f31899c0 && iArr[this.f31896b] >= this.A) {
                    int i22 = this.N;
                    int i23 = this.M;
                    if (i22 < i23) {
                        this.N = i23;
                    }
                }
            } else {
                l(iArr[this.f31896b], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.f31914p0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.f31900d0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.f31913o0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f31918w == strArr) {
            return;
        }
        this.f31918w = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f31912n0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.d.setEnabled(z10);
    }

    public void setFormatter(mc0 mc0Var) {
        if (mc0Var == this.G) {
            return;
        }
        this.G = mc0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i10) {
        this.f31915q0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.f31894a == i10) {
            return;
        }
        this.f31894a = i10;
        this.f31896b = i10 / 2;
        this.J = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        nc0 nc0Var;
        this.B = true;
        if (this.A != i10) {
            if (i10 >= 0) {
                this.A = i10;
                if (i10 < this.C) {
                    int i11 = this.D;
                    if (i10 >= i11) {
                        this.C = i11;
                    } else {
                        this.C = i10;
                    }
                }
                setWrapSelectorWheel(this.f31900d0);
                f();
                n();
                m();
                invalidate();
                if (this.f31905g0 == 0 && (nc0Var = this.F) != null) {
                    nc0Var.n(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i10) {
        nc0 nc0Var;
        this.f31920y = true;
        if (this.f31919x != i10) {
            if (i10 >= 0) {
                this.f31919x = i10;
                if (i10 > this.C) {
                    int i11 = this.D;
                    if (i10 <= i11) {
                        this.C = i11;
                    } else {
                        this.C = i10;
                    }
                }
                setWrapSelectorWheel(this.f31900d0);
                f();
                n();
                m();
                invalidate();
                if (this.f31905g0 == 0 && (nc0Var = this.F) != null) {
                    nc0Var.n(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.H = j10;
    }

    public void setOnScrollListener(nc0 nc0Var) {
        this.F = nc0Var;
    }

    public void setOnValueChangedListener(oc0 oc0Var) {
        this.E = oc0Var;
    }

    public void setSelectorColor(int i10) {
        this.f31902e0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.K.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.f31898c = i10;
        invalidate();
    }

    public void setValue(int i10) {
        l(i10, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc0.setWrapSelectorWheel(boolean):void");
    }

    public qc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 18, c6Var);
    }

    public qc0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31894a = 3;
        this.f31896b = 1;
        this.H = 300L;
        this.I = new SparseArray();
        this.J = new int[this.f31894a];
        this.M = Integer.MIN_VALUE;
        this.f31905g0 = 0;
        this.m0 = -1;
        this.f31912n0 = true;
        int dp = AndroidUtilities.dp(i10);
        this.f31917s = dp;
        Paint paint = new Paint();
        this.f31902e0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        this.f31904f0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f31901e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f31903f = applyDimension;
        int i11 = this.f31901e;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f31911n = -1;
        this.f31916r = true;
        this.f31910l0 = new pc0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        this.d.setBackgroundResource(0);
        float f9 = dp;
        this.d.setTextSize(0, f9);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f31895a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f31897b0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f9);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.K = paint2;
        this.O = new lm0(getContext(), null);
        this.P = new lm0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new kc0(this));
    }
}
