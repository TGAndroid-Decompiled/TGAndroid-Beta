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
public abstract class kq0 extends NestedScrollView {
    public final Paint f49329a0;
    public final r1.g f49330b0;
    public boolean f49331c0;
    public float f49332d0;
    public float f49333e0;
    public float f49334f0;
    public final Method f49335g0;
    public final OverScroller f49336h0;
    public boolean f49337i0;
    public int f49338j0;
    public int f49339k0;
    public float f49340l0;
    public boolean m0;
    public int f49341n0;
    public final nq0 f49342o0;
    public final FrameLayout f49343p0;

    public kq0(Context context, nq0 nq0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.f49329a0 = paint;
        this.f49340l0 = 1.0f;
        this.f49341n0 = -1;
        this.f49342o0 = nq0Var;
        this.f49343p0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) nq0Var, (r1.e) r1.g.f56317p, 0.0f);
        this.f49330b0 = gVar;
        gVar.f56333m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new bb0(this, 2));
        gVar.a(new m9(this, 2));
        gVar.f56333m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f49335g0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f49335g0 = null;
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f49336h0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f49336h0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f49330b0.d();
            this.f49331c0 = true;
            this.f49332d0 = this.f49342o0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f49331c0 && i7 == 0) {
            this.f49331c0 = false;
            if (this.f49332d0 != 0.0f && (overScroller = this.f49336h0) != null && overScroller.isFinished()) {
                float f10 = this.f49334f0;
                r1.g gVar = this.f49330b0;
                if (!gVar.f56327f) {
                    gVar.f56323a = f10;
                    gVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    public final void H(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f49331c0 && this.f49332d0 != 0.0f && (overScroller = this.f49336h0) != null && overScroller.isFinished()) {
            r1.g gVar = this.f49330b0;
            if (!gVar.f56327f) {
                gVar.f56323a = 0.0f;
                gVar.h();
            }
        }
        G();
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f49331c0 || (((this.f49332d0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f49332d0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f49332d0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f49332d0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f49332d0 = f12;
            iArr[1] = i10;
        }
        G();
        this.f49342o0.setTranslationY(this.f49332d0);
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i7);
        Paint paint = this.f49329a0;
        paint.setAlpha((int) (this.f49340l0 * 127.0f));
        canvas.drawRect(0.0f, this.f49342o0.getTranslationY() + this.f49343p0.getTop(), width, i7, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void e(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        int i14;
        float f10;
        float f11;
        float f12;
        if (i12 != 0) {
            if (D()) {
                i14 = org.telegram.messenger.g0.f24004m;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            int round = Math.round((1.0f - Math.abs((-this.f49332d0) / (this.f49343p0.getTop() - currentActionBarHeight))) * i12);
            if (round != 0) {
                boolean z10 = this.f49331c0;
                nq0 nq0Var = this.f49342o0;
                if (!z10) {
                    r1.g gVar = this.f49330b0;
                    if (!gVar.f56327f) {
                        OverScroller overScroller = this.f49336h0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f24010q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f49333e0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f49332d0 - round;
                            this.f49332d0 = f13;
                            nq0Var.setTranslationY(f13);
                        }
                        if (!gVar.f56327f) {
                            gVar.f56323a = f11;
                            gVar.h();
                        }
                    }
                } else {
                    float f14 = this.f49332d0 - round;
                    this.f49332d0 = f14;
                    nq0Var.setTranslationY(f14);
                }
            }
            G();
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f49341n0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f49343p0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i7) {
        super.i(i7);
        this.f49333e0 = Math.signum(i7);
        this.f49334f0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        H(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f49342o0.getTranslationY() + (this.f49343p0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }
}
