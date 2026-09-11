package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public abstract class nu0 extends NestedScrollView {
    public final Paint W;
    public final o1.k f39021a0;
    public boolean f39022b0;
    public float f39023c0;
    public float f39024d0;
    public float f39025e0;
    public final Method f39026f0;
    public final OverScroller f39027g0;
    public boolean f39028h0;
    public int f39029i0;
    public int f39030j0;
    public float f39031k0;
    public boolean f39032l0;
    public int m0;
    public final qu0 f39033n0;
    public final FrameLayout f39034o0;

    public nu0(Context context, qu0 qu0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.f39031k0 = 1.0f;
        this.m0 = -1;
        this.f39033n0 = qu0Var;
        this.f39034o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(qu0Var, o1.h.f16807n, 0.0f);
        this.f39021a0 = kVar;
        kVar.f16825u.b(100.0f);
        kVar.f16821j = 1.0f;
        kVar.b(new td0(this, 2));
        kVar.a(new n9(this, 2));
        kVar.f16825u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f39026f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e7) {
            this.f39026f0 = null;
            FileLog.e(e7);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f39027g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f39027g0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f39022b0 && i10 == 0) {
            this.f39022b0 = false;
            if (this.f39023c0 != 0.0f && (overScroller = this.f39027g0) != null && overScroller.isFinished()) {
                float f7 = this.f39025e0;
                o1.k kVar = this.f39021a0;
                if (!kVar.f16818f) {
                    kVar.f16814a = f7;
                    kVar.f();
                }
            }
            D();
        }
    }

    public boolean C() {
        return true;
    }

    public final void H(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nu0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f39022b0 && this.f39023c0 != 0.0f && (overScroller = this.f39027g0) != null && overScroller.isFinished()) {
            o1.k kVar = this.f39021a0;
            if (!kVar.f16818f) {
                kVar.f16814a = 0.0f;
                kVar.f();
            }
        }
        G();
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i10);
        Paint paint = this.W;
        paint.setAlpha((int) (this.f39031k0 * 127.0f));
        canvas.drawRect(0.0f, this.f39033n0.getTranslationY() + this.f39034o0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f39022b0 || (((this.f39023c0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f39023c0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f39023c0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f39023c0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f39023c0 = f11;
            iArr[1] = i11;
        }
        G();
        this.f39033n0.setTranslationY(this.f39023c0);
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f39034o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        int i15;
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            if (C()) {
                i15 = AndroidUtilities.statusBarHeight;
            } else {
                i15 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
            int round = Math.round((1.0f - Math.abs((-this.f39023c0) / (this.f39034o0.getTop() - currentActionBarHeight))) * i13);
            if (round != 0) {
                boolean z10 = this.f39022b0;
                qu0 qu0Var = this.f39033n0;
                if (!z10) {
                    o1.k kVar = this.f39021a0;
                    if (!kVar.f16818f) {
                        OverScroller overScroller = this.f39027g0;
                        if (overScroller != null) {
                            f7 = overScroller.getCurrVelocity();
                        } else {
                            f7 = Float.NaN;
                        }
                        if (!Float.isNaN(f7)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f11 = 3000.0f;
                            } else {
                                f11 = 5000.0f;
                            }
                            float min = Math.min(f11, f7);
                            round = (int) ((round * min) / f7);
                            f10 = min * (-this.f39024d0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f39023c0 - round;
                            this.f39023c0 = f12;
                            qu0Var.setTranslationY(f12);
                        }
                        if (!kVar.f16818f) {
                            kVar.f16814a = f10;
                            kVar.f();
                        }
                    }
                } else {
                    float f13 = this.f39023c0 - round;
                    this.f39023c0 = f13;
                    qu0Var.setTranslationY(f13);
                }
            }
            G();
        }
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f39024d0 = Math.signum(i10);
        this.f39025e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f39033n0.getTranslationY() + (this.f39034o0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f39021a0.c();
            this.f39022b0 = true;
            this.f39023c0 = this.f39033n0.getTranslationY();
            F();
        }
        return true;
    }

    public void D() {
    }

    public void F() {
    }

    public void G() {
    }
}
