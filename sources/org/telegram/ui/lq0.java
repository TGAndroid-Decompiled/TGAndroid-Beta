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
public abstract class lq0 extends NestedScrollView {
    public final Paint W;
    public final r1.g f47663a0;
    public boolean f47664b0;
    public float f47665c0;
    public float f47666d0;
    public float f47667e0;
    public final Method f47668f0;
    public final OverScroller f47669g0;
    public boolean f47670h0;
    public int f47671i0;
    public int f47672j0;
    public float f47673k0;
    public boolean f47674l0;
    public int m0;
    public final oq0 f47675n0;
    public final FrameLayout f47676o0;

    public lq0(Context context, oq0 oq0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.f47673k0 = 1.0f;
        this.m0 = -1;
        this.f47675n0 = oq0Var;
        this.f47676o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) oq0Var, (r1.e) r1.g.f54263p, 0.0f);
        this.f47663a0 = gVar;
        gVar.f54279m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new db0(this, 2));
        gVar.a(new l9(this, 2));
        gVar.f54279m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f47668f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f47668f0 = null;
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f47669g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f47669g0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f47663a0.d();
            this.f47664b0 = true;
            this.f47665c0 = this.f47675n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f47664b0 && i7 == 0) {
            this.f47664b0 = false;
            if (this.f47665c0 != 0.0f && (overScroller = this.f47669g0) != null && overScroller.isFinished()) {
                float f10 = this.f47667e0;
                r1.g gVar = this.f47663a0;
                if (!gVar.f54273f) {
                    gVar.f54269a = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lq0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f47664b0 && this.f47665c0 != 0.0f && (overScroller = this.f47669g0) != null && overScroller.isFinished()) {
            r1.g gVar = this.f47663a0;
            if (!gVar.f54273f) {
                gVar.f54269a = 0.0f;
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
        if (!this.f47664b0 || (((this.f47665c0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f47665c0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f47665c0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f47665c0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f47665c0 = f12;
            iArr[1] = i10;
        }
        G();
        this.f47675n0.setTranslationY(this.f47665c0);
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
        Paint paint = this.W;
        paint.setAlpha((int) (this.f47673k0 * 127.0f));
        canvas.drawRect(0.0f, this.f47675n0.getTranslationY() + this.f47676o0.getTop(), width, i7, paint);
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
                i14 = org.telegram.messenger.g0.f22561m;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i14;
            int round = Math.round((1.0f - Math.abs((-this.f47665c0) / (this.f47676o0.getTop() - currentActionBarHeight))) * i12);
            if (round != 0) {
                boolean z9 = this.f47664b0;
                oq0 oq0Var = this.f47675n0;
                if (!z9) {
                    r1.g gVar = this.f47663a0;
                    if (!gVar.f54273f) {
                        OverScroller overScroller = this.f47669g0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22567q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f47666d0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f47665c0 - round;
                            this.f47665c0 = f13;
                            oq0Var.setTranslationY(f13);
                        }
                        if (!gVar.f54273f) {
                            gVar.f54269a = f11;
                            gVar.h();
                        }
                    }
                } else {
                    float f14 = this.f47665c0 - round;
                    this.f47665c0 = f14;
                    oq0Var.setTranslationY(f14);
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
        int i7 = this.m0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f47676o0.getLayoutParams()).topMargin;
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
        this.f47666d0 = Math.signum(i7);
        this.f47667e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        H(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f47675n0.getTranslationY() + (this.f47676o0.getTop() - getScrollY())) {
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
