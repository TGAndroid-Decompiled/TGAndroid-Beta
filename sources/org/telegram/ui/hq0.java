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
public abstract class hq0 extends NestedScrollView {
    public final Paint W;
    public final r1.g f46457a0;
    public boolean f46458b0;
    public float f46459c0;
    public float f46460d0;
    public float f46461e0;
    public final Method f46462f0;
    public final OverScroller f46463g0;
    public boolean f46464h0;
    public int f46465i0;
    public int f46466j0;
    public float f46467k0;
    public boolean f46468l0;
    public int m0;
    public final kq0 f46469n0;
    public final FrameLayout f46470o0;

    public hq0(Context context, kq0 kq0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.f46467k0 = 1.0f;
        this.m0 = -1;
        this.f46469n0 = kq0Var;
        this.f46470o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) kq0Var, (r1.e) r1.g.f54134p, 0.0f);
        this.f46457a0 = gVar;
        gVar.f54150m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new ab0(this, 2));
        gVar.a(new l9(this, 2));
        gVar.f54150m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f46462f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f46462f0 = null;
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f46463g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f46463g0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f46457a0.d();
            this.f46458b0 = true;
            this.f46459c0 = this.f46469n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f46458b0 && i7 == 0) {
            this.f46458b0 = false;
            if (this.f46459c0 != 0.0f && (overScroller = this.f46463g0) != null && overScroller.isFinished()) {
                float f10 = this.f46461e0;
                r1.g gVar = this.f46457a0;
                if (!gVar.f54144f) {
                    gVar.f54140a = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f46458b0 && this.f46459c0 != 0.0f && (overScroller = this.f46463g0) != null && overScroller.isFinished()) {
            r1.g gVar = this.f46457a0;
            if (!gVar.f54144f) {
                gVar.f54140a = 0.0f;
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
        if (!this.f46458b0 || (((this.f46459c0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f46459c0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f46459c0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f46459c0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f46459c0 = f12;
            iArr[1] = i10;
        }
        G();
        this.f46469n0.setTranslationY(this.f46459c0);
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
        paint.setAlpha((int) (this.f46467k0 * 127.0f));
        canvas.drawRect(0.0f, this.f46469n0.getTranslationY() + this.f46470o0.getTop(), width, i7, paint);
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
                i14 = org.telegram.messenger.g0.f22531m;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            int round = Math.round((1.0f - Math.abs((-this.f46459c0) / (this.f46470o0.getTop() - currentActionBarHeight))) * i12);
            if (round != 0) {
                boolean z9 = this.f46458b0;
                kq0 kq0Var = this.f46469n0;
                if (!z9) {
                    r1.g gVar = this.f46457a0;
                    if (!gVar.f54144f) {
                        OverScroller overScroller = this.f46463g0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22537q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f46460d0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f46459c0 - round;
                            this.f46459c0 = f13;
                            kq0Var.setTranslationY(f13);
                        }
                        if (!gVar.f54144f) {
                            gVar.f54140a = f11;
                            gVar.h();
                        }
                    }
                } else {
                    float f14 = this.f46459c0 - round;
                    this.f46459c0 = f14;
                    kq0Var.setTranslationY(f14);
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
            return i7 - ((ViewGroup.MarginLayoutParams) this.f46470o0.getLayoutParams()).topMargin;
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
        this.f46460d0 = Math.signum(i7);
        this.f46461e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        H(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f46469n0.getTranslationY() + (this.f46470o0.getTop() - getScrollY())) {
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
