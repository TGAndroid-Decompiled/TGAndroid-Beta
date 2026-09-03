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
public abstract class au0 extends NestedScrollView {
    public final Paint T;
    public final o1.j U;
    public boolean V;
    public float W;
    public float f35252a0;
    public float f35253b0;
    public final Method f35254c0;
    public final OverScroller f35255d0;
    public boolean f35256e0;
    public int f35257f0;
    public int f35258g0;
    public float f35259h0;
    public boolean f35260i0;
    public int f35261j0;
    public final du0 f35262k0;
    public final FrameLayout f35263l0;

    public au0(Context context, du0 du0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f35259h0 = 1.0f;
        this.f35261j0 = -1;
        this.f35262k0 = du0Var;
        this.f35263l0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(du0Var, o1.h.f16321n, 0.0f);
        this.U = jVar;
        jVar.f16338u.b(100.0f);
        jVar.f16335j = 1.0f;
        jVar.b(new md0(this, 2));
        jVar.a(new o9(this, 2));
        jVar.f16338u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f35254c0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e6) {
            this.f35254c0 = null;
            FileLog.e(e6);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f35255d0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f35255d0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.V && i10 == 0) {
            this.V = false;
            if (this.W != 0.0f && (overScroller = this.f35255d0) != null && overScroller.isFinished()) {
                float f10 = this.f35253b0;
                o1.j jVar = this.U;
                if (!jVar.f16332f) {
                    jVar.f16328a = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.au0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.V && this.W != 0.0f && (overScroller = this.f35255d0) != null && overScroller.isFinished()) {
            o1.j jVar = this.U;
            if (!jVar.f16332f) {
                jVar.f16328a = 0.0f;
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
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i10);
        Paint paint = this.T;
        paint.setAlpha((int) (this.f35259h0 * 127.0f));
        canvas.drawRect(0.0f, this.f35262k0.getTranslationY() + this.f35263l0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f10;
        int i13;
        iArr[1] = 0;
        if (!this.V || (((this.W) <= 0.0f || i11 <= 0) && (f10 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f11 = i11;
        float f12 = f10 - f11;
        if (i13 > 0) {
            if (f12 < 0.0f) {
                this.W = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.W = f12;
                iArr[1] = i11;
            }
        } else if (f12 > 0.0f) {
            this.W = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.W = f12;
            iArr[1] = i11;
        }
        G();
        this.f35262k0.setTranslationY(this.W);
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f35261j0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f35263l0.getLayoutParams()).topMargin;
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
        float f10;
        float f11;
        float f12;
        if (i13 != 0) {
            if (C()) {
                i15 = AndroidUtilities.statusBarHeight;
            } else {
                i15 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
            int round = Math.round((1.0f - Math.abs((-this.W) / (this.f35263l0.getTop() - currentActionBarHeight))) * i13);
            if (round != 0) {
                boolean z4 = this.V;
                du0 du0Var = this.f35262k0;
                if (!z4) {
                    o1.j jVar = this.U;
                    if (!jVar.f16332f) {
                        OverScroller overScroller = this.f35255d0;
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
                            f11 = min * (-this.f35252a0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.W - round;
                            this.W = f13;
                            du0Var.setTranslationY(f13);
                        }
                        if (!jVar.f16332f) {
                            jVar.f16328a = f11;
                            jVar.f();
                        }
                    }
                } else {
                    float f14 = this.W - round;
                    this.W = f14;
                    du0Var.setTranslationY(f14);
                }
            }
            G();
        }
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f35252a0 = Math.signum(i10);
        this.f35253b0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f35262k0.getTranslationY() + (this.f35263l0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.U.c();
            this.V = true;
            this.W = this.f35262k0.getTranslationY();
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
