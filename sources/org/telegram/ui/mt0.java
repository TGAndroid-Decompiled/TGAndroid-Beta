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
public abstract class mt0 extends NestedScrollView {
    public final Paint S;
    public final o1.j T;
    public boolean U;
    public float V;
    public float W;
    public float f40518a0;
    public final Method f40519b0;
    public final OverScroller f40520c0;
    public boolean f40521d0;
    public int f40522e0;
    public int f40523f0;
    public float f40524g0;
    public boolean f40525h0;
    public int f40526i0;
    public final pt0 f40527j0;
    public final FrameLayout f40528k0;

    public mt0(Context context, pt0 pt0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.S = paint;
        this.f40524g0 = 1.0f;
        this.f40526i0 = -1;
        this.f40527j0 = pt0Var;
        this.f40528k0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(pt0Var, o1.h.f18783n, 0.0f);
        this.T = jVar;
        jVar.f18800u.b(100.0f);
        jVar.f18797j = 1.0f;
        jVar.b(new ad0(this, 2));
        jVar.a(new l9(this, 2));
        jVar.f18800u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f40519b0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f40519b0 = null;
            FileLog.e(e10);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f40520c0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f40520c0 = null;
            FileLog.e(e11);
        }
    }

    @Override
    public final void B(int i9) {
        OverScroller overScroller;
        if (this.U && i9 == 0) {
            this.U = false;
            if (this.V != 0.0f && (overScroller = this.f40520c0) != null && overScroller.isFinished()) {
                float f10 = this.f40518a0;
                o1.j jVar = this.T;
                if (!jVar.f18794f) {
                    jVar.f18790a = f10;
                    jVar.f();
                }
            }
            D();
        }
    }

    public boolean C() {
        return true;
    }

    public final void H(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mt0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.U && this.V != 0.0f && (overScroller = this.f40520c0) != null && overScroller.isFinished()) {
            o1.j jVar = this.T;
            if (!jVar.f18794f) {
                jVar.f18790a = 0.0f;
                jVar.f();
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
        int i9 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i9);
        Paint paint = this.S;
        paint.setAlpha((int) (this.f40524g0 * 127.0f));
        canvas.drawRect(0.0f, this.f40527j0.getTranslationY() + this.f40528k0.getTop(), width, i9, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.U || (((this.V) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.V = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.V = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.V = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.V = f12;
            iArr[1] = i10;
        }
        G();
        this.f40527j0.setTranslationY(this.V);
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i9 = this.f40526i0;
        if (i9 >= 0) {
            return i9 - ((ViewGroup.MarginLayoutParams) this.f40528k0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        int i14;
        float f10;
        float f11;
        float f12;
        if (i12 != 0) {
            if (C()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            int round = Math.round((1.0f - Math.abs((-this.V) / (this.f40528k0.getTop() - currentActionBarHeight))) * i12);
            if (round != 0) {
                boolean z10 = this.U;
                pt0 pt0Var = this.f40527j0;
                if (!z10) {
                    o1.j jVar = this.T;
                    if (!jVar.f18794f) {
                        OverScroller overScroller = this.f40520c0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.W);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.V - round;
                            this.V = f13;
                            pt0Var.setTranslationY(f13);
                        }
                        if (!jVar.f18794f) {
                            jVar.f18790a = f11;
                            jVar.f();
                        }
                    }
                } else {
                    float f14 = this.V - round;
                    this.V = f14;
                    pt0Var.setTranslationY(f14);
                }
            }
            G();
        }
    }

    @Override
    public final void k(int i9) {
        super.k(i9);
        this.W = Math.signum(i9);
        this.f40518a0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        H(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        super.onMeasure(i9, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f40527j0.getTranslationY() + (this.f40528k0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean z(int i9, int i10) {
        if (i10 == 0) {
            this.T.c();
            this.U = true;
            this.V = this.f40527j0.getTranslationY();
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
