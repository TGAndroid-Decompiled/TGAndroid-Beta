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
public class od0 extends LinearLayout {
    public static final bs f29002v0 = new bs(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public int H;
    public md0 I;
    public ld0 J;
    public kd0 K;
    public long L;
    public final SparseArray M;
    public int[] N;
    public final Paint O;
    public int P;
    public int Q;
    public int R;
    public final mn0 S;
    public final mn0 T;
    public int U;
    public jd0 V;
    public float W;
    public int f29003a;
    public long f29004a0;
    public int f29005b;
    public float f29006b0;
    public int f29007c;
    public VelocityTracker f29008c0;
    public final TextView d;
    public final int f29009d0;
    public final int e;
    public final int f29010e0;
    public final int f29011f;
    public final int f29012f0;
    public boolean f29013g0;
    public final int h;
    public boolean f29014h0;
    public final Paint f29015i0;
    public final int f29016j0;
    public int f29017k0;
    public int f29018l0;
    public int m0;
    public int f29019n;
    public boolean f29020n0;
    public boolean f29021o0;
    public final nd0 f29022p0;
    public int f29023q0;
    public final boolean f29024r;
    public boolean f29025r0;
    public final int f29026s;
    public Utilities.CallbackReturn f29027s0;
    public Integer f29028t0;
    public int f29029u0;
    public int v;
    public String[] f29030w;
    public int f29031x;
    public boolean f29032y;

    public od0(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }

    public static int g(int i10, int i11) {
        if (i11 != -1) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalArgumentException(i2.e.j(mode, "Unknown measure mode: "));
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
        int i11 = this.f29031x;
        if (i10 >= i11 && i10 <= this.E) {
            String[] strArr = this.f29030w;
            if (strArr != null) {
                str = strArr[i10 - i11];
            } else {
                kd0 kd0Var = this.K;
                if (kd0Var != null) {
                    str = kd0Var.e(i10);
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
        mn0 mn0Var = this.S;
        if (mn0Var.f28575q) {
            mn0Var = this.T;
            if (mn0Var.f28575q) {
                return;
            }
        }
        mn0Var.b();
        int i10 = mn0Var.f28569k;
        if (this.U == 0) {
            this.U = mn0Var.f28564c;
        }
        scrollBy(0, i10 - this.U);
        this.U = i10;
        if (mn0Var.f28575q) {
            if (mn0Var == this.S) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.f29017k0 != 1) {
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
        return ((this.E - this.f29031x) + 1) * this.P;
    }

    public CharSequence d(int i10) {
        return this.d.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.od0.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        if (this.F && i10 > (i14 = this.E) && (i16 = i14 - (i15 = this.f29031x)) != 0) {
            return (((i10 - i14) % i16) + i15) - 1;
        }
        if (this.f29032y && i10 < (i11 = this.f29031x) && (i13 = (i12 = this.E) - i11) != 0) {
            return (i12 - ((i11 - i10) % i13)) + 1;
        }
        return i10;
    }

    public final void f() {
        this.M.clear();
        int[] iArr = this.N;
        int value = getValue();
        for (int i10 = 0; i10 < this.N.length; i10++) {
            int i11 = (i10 - this.f29005b) + value;
            if (this.f29013g0) {
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
        return this.f29030w;
    }

    public int getItemsCount() {
        return this.f29003a;
    }

    public int getMaxValue() {
        return this.E;
    }

    public int getMinValue() {
        return this.f29031x;
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
        return this.f29013g0;
    }

    public final boolean h(mn0 mn0Var) {
        mn0Var.f28575q = true;
        int i10 = mn0Var.e - mn0Var.f28569k;
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
        if (this.f29017k0 != i10) {
            this.f29017k0 = i10;
            ld0 ld0Var = this.J;
            if (ld0Var != null) {
                ld0Var.l(i10);
            }
            if (i10 == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.f29030w;
                    if (strArr == null) {
                        int i11 = this.G;
                        kd0 kd0Var = this.K;
                        if (kd0Var != null) {
                            str = kd0Var.e(i11);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
                        }
                    } else {
                        str = strArr[this.G - this.f29031x];
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
        jd0 jd0Var = this.V;
        if (jd0Var != null) {
            removeCallbacks(jd0Var);
        }
        this.f29022p0.a();
    }

    public final void l(int i10, boolean z10) {
        int min;
        ld0 ld0Var;
        md0 md0Var;
        if (this.G != i10) {
            if (this.f29013g0) {
                min = e(i10);
            } else {
                min = Math.min(Math.max(i10, this.f29031x), this.E);
            }
            int i11 = this.G;
            this.H = min;
            this.G = min;
            n();
            if (Math.abs(i11 - min) > 0.9f) {
                AndroidUtilities.vibrateCursor(this);
            }
            if (z10 && (md0Var = this.I) != null) {
                md0Var.q(this, this.G);
            }
            f();
            invalidate();
            if (this.f29017k0 == 0 && (ld0Var = this.J) != null) {
                ld0Var.l(0);
            }
        }
    }

    public final void m() {
        int i10;
        if (this.f29024r) {
            String[] strArr = this.f29030w;
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
            if (this.f29019n != paddingRight) {
                int i15 = this.h;
                if (paddingRight > i15) {
                    this.f29019n = paddingRight;
                } else {
                    this.f29019n = i15;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.f29030w;
        if (strArr == null) {
            int i10 = this.G;
            kd0 kd0Var = this.K;
            if (kd0Var != null) {
                str = kd0Var.e(i10);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
            }
        } else {
            str = strArr[this.G - this.f29031x];
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
        int i13 = this.f29029u0;
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
        float f7 = width + this.f29007c;
        float f10 = this.R;
        int[] iArr = this.N;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String str = (String) this.M.get(iArr[i14]);
            if (str != null && (i14 != this.f29005b || this.d.getVisibility() != 0)) {
                if (this.f29003a > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f10 - (this.O.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z10 = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z10 = false;
                    }
                    float interpolation = f29002v0.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
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
        if (this.f29025r0) {
            canvas.drawRect(0.0f, this.f29018l0, getRight(), this.f29016j0 + i10, this.f29015i0);
            canvas.drawRect(0.0f, i11 - this.f29016j0, getRight(), this.m0, this.f29015i0);
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
        this.f29006b0 = y3;
        this.f29004a0 = motionEvent.getEventTime();
        float f7 = this.W;
        if (f7 < this.f29018l0) {
            if (this.f29017k0 == 0) {
                nd0 nd0Var = this.f29022p0;
                nd0Var.a();
                nd0Var.f28789c = 1;
                nd0Var.f28788b = 2;
                ((od0) nd0Var.d).postDelayed(nd0Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f7 > this.m0 && this.f29017k0 == 0) {
            nd0 nd0Var2 = this.f29022p0;
            nd0Var2.a();
            nd0Var2.f28789c = 1;
            nd0Var2.f28788b = 1;
            ((od0) nd0Var2.d).postDelayed(nd0Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        mn0 mn0Var = this.S;
        if (!mn0Var.f28575q) {
            mn0Var.f28575q = true;
            this.T.f28575q = true;
            i(0);
            return true;
        }
        mn0 mn0Var2 = this.T;
        if (!mn0Var2.f28575q) {
            mn0Var.f28575q = true;
            mn0Var2.f28575q = true;
            return true;
        }
        float f10 = this.W;
        if (f10 < this.f29018l0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.V;
            if (runnable == null) {
                this.V = new jd0(this);
            } else {
                removeCallbacks(runnable);
            }
            jd0 jd0Var = this.V;
            jd0Var.f27508a = false;
            postDelayed(jd0Var, longPressTimeout);
            return true;
        }
        if (f10 > this.m0) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.V;
            if (runnable2 == null) {
                this.V = new jd0(this);
            } else {
                removeCallbacks(runnable2);
            }
            jd0 jd0Var2 = this.V;
            jd0Var2.f27508a = true;
            postDelayed(jd0Var2, longPressTimeout2);
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
            int i16 = this.f29026s;
            int bottom = (int) (((((getBottom() - getTop()) + i16) - (length * i16)) / iArr.length) + 0.5f);
            this.v = bottom;
            this.P = bottom + i16;
            int top = (this.d.getTop() + this.d.getBaseline()) - (this.P * this.f29005b);
            this.Q = top;
            this.R = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i16) / 2);
            this.f29018l0 = ((getHeight() - i16) - this.v) / 2;
            this.m0 = ((getHeight() + i16) + this.v) / 2;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(g(i10, this.f29019n), g(i11, this.f29011f));
        setMeasuredDimension(k(this.h, getMeasuredWidth(), i10), k(this.e, getMeasuredHeight(), i11));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f29008c0 == null) {
            this.f29008c0 = VelocityTracker.obtain();
        }
        this.f29008c0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y3 = motionEvent.getY();
            if (this.f29017k0 != 1) {
                if (((int) Math.abs(y3 - this.W)) > this.f29009d0) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y3 - this.f29006b0));
                invalidate();
            }
            this.f29006b0 = y3;
            return true;
        }
        jd0 jd0Var = this.V;
        if (jd0Var != null) {
            removeCallbacks(jd0Var);
        }
        this.f29022p0.a();
        VelocityTracker velocityTracker = this.f29008c0;
        velocityTracker.computeCurrentVelocity(1000, this.f29012f0);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.f29010e0) {
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
            long eventTime = motionEvent.getEventTime() - this.f29004a0;
            if (abs <= this.f29009d0 && eventTime < ViewConfiguration.getTapTimeout()) {
                int i10 = (y10 / this.P) - this.f29005b;
                if (i10 > 0) {
                    a(true);
                    nd0 nd0Var = this.f29022p0;
                    nd0Var.a();
                    nd0Var.f28789c = 2;
                    nd0Var.f28788b = 1;
                    ((od0) nd0Var.d).post(nd0Var);
                } else if (i10 < 0) {
                    a(false);
                    nd0 nd0Var2 = this.f29022p0;
                    nd0Var2.a();
                    nd0Var2.f28789c = 2;
                    nd0Var2.f28788b = 2;
                    ((od0) nd0Var2.d).post(nd0Var2);
                }
            } else {
                c();
            }
            i(0);
        }
        this.f29008c0.recycle();
        this.f29008c0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        int[] iArr = this.N;
        boolean z10 = this.f29013g0;
        if (!z10 && i11 > 0 && iArr[this.f29005b] <= this.f29031x) {
            int i12 = this.R + i11;
            int i13 = this.Q;
            if (i12 > i13) {
                this.R = i13;
                return;
            }
        }
        if (!z10 && i11 < 0 && iArr[this.f29005b] >= this.E) {
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
            if (this.f29013g0 && i17 < this.f29031x) {
                i17 = this.E;
            }
            iArr[0] = i17;
            b(i17);
            if (!this.f29013g0 && iArr[this.f29005b] <= this.f29031x) {
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
                if (this.f29013g0 && i21 > this.E) {
                    i21 = this.f29031x;
                }
                iArr[iArr.length - 1] = i21;
                b(i21);
                if (!this.f29013g0 && iArr[this.f29005b] >= this.E) {
                    int i22 = this.R;
                    int i23 = this.Q;
                    if (i22 < i23) {
                        this.R = i23;
                    }
                }
            } else {
                l(iArr[this.f29005b], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i10) {
        this.f29028t0 = Integer.valueOf(i10);
        setWrapSelectorWheel(this.f29014h0);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.f29027s0 = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f29030w == strArr) {
            return;
        }
        this.f29030w = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z10) {
        this.f29025r0 = z10;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.d.setEnabled(z10);
    }

    public void setFormatter(kd0 kd0Var) {
        if (kd0Var == this.K) {
            return;
        }
        this.K = kd0Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i10) {
        this.f29029u0 = i10;
        super.setGravity(i10);
    }

    public void setItemCount(int i10) {
        if (this.f29003a == i10) {
            return;
        }
        this.f29003a = i10;
        this.f29005b = i10 / 2;
        this.N = new int[i10];
        f();
    }

    public void setMaxValue(int i10) {
        ld0 ld0Var;
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
                setWrapSelectorWheel(this.f29014h0);
                f();
                n();
                m();
                invalidate();
                if (this.f29017k0 == 0 && (ld0Var = this.J) != null) {
                    ld0Var.l(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i10) {
        ld0 ld0Var;
        this.f29032y = true;
        if (this.f29031x != i10) {
            if (i10 >= 0) {
                this.f29031x = i10;
                if (i10 > this.G) {
                    int i11 = this.H;
                    if (i10 <= i11) {
                        this.G = i11;
                    } else {
                        this.G = i10;
                    }
                }
                setWrapSelectorWheel(this.f29014h0);
                f();
                n();
                m();
                invalidate();
                if (this.f29017k0 == 0 && (ld0Var = this.J) != null) {
                    ld0Var.l(0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.L = j10;
    }

    public void setOnScrollListener(ld0 ld0Var) {
        this.J = ld0Var;
    }

    public void setOnValueChangedListener(md0 md0Var) {
        this.I = md0Var;
    }

    public void setSelectorColor(int i10) {
        this.f29015i0.setColor(i10);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
        this.O.setColor(i10);
    }

    public void setTextOffset(int i10) {
        this.f29007c = i10;
        invalidate();
    }

    public void setValue(int i10) {
        l(i10, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.od0.setWrapSelectorWheel(boolean):void");
    }

    public od0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, 18, d6Var);
    }

    public od0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f29003a = 3;
        this.f29005b = 1;
        this.L = 300L;
        this.M = new SparseArray();
        this.N = new int[this.f29003a];
        this.Q = Integer.MIN_VALUE;
        this.f29017k0 = 0;
        this.f29023q0 = -1;
        this.f29025r0 = true;
        int dp = AndroidUtilities.dp(i10);
        this.f29026s = dp;
        Paint paint = new Paint();
        this.f29015i0 = paint;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        this.f29016j0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.e = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.f29011f = applyDimension;
        int i11 = this.e;
        if (i11 != -1 && applyDimension != -1 && i11 > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.h = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f29019n = -1;
        this.f29024r = true;
        this.f29022p0 = new nd0(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21099j5, d6Var));
        this.d.setBackgroundResource(0);
        float f7 = dp;
        this.d.setTextSize(0, f7);
        this.d.setVisibility(4);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f29009d0 = viewConfiguration.getScaledTouchSlop();
        this.f29010e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29012f0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f7);
        paint2.setTypeface(this.d.getTypeface());
        paint2.setColor(this.d.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.O = paint2;
        this.S = new mn0(getContext(), null);
        this.T = new mn0(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new id0(this));
    }
}
