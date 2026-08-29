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
public abstract class kt0 extends NestedScrollView {
    public final Paint S;
    public final o1.k T;
    public boolean U;
    public float V;
    public float W;
    public float f40006a0;
    public final Method f40007b0;
    public final OverScroller f40008c0;
    public boolean f40009d0;
    public int f40010e0;
    public int f40011f0;
    public float f40012g0;
    public boolean f40013h0;
    public int f40014i0;
    public final nt0 f40015j0;
    public final FrameLayout f40016k0;

    public kt0(Context context, nt0 nt0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.S = paint;
        this.f40012g0 = 1.0f;
        this.f40014i0 = -1;
        this.f40015j0 = nt0Var;
        this.f40016k0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(nt0Var, o1.i.f19028n, 0.0f);
        this.T = kVar;
        kVar.f19045u.b(100.0f);
        kVar.f19042j = 1.0f;
        kVar.b(new cd0(this, 2));
        kVar.a(new k9(this, 2));
        kVar.f19045u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f40007b0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.f40007b0 = null;
            FileLog.e(e10);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f40008c0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f40008c0 = null;
            FileLog.e(e11);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.U && i10 == 0) {
            this.U = false;
            if (this.V != 0.0f && (overScroller = this.f40008c0) != null && overScroller.isFinished()) {
                float f9 = this.f40006a0;
                o1.k kVar = this.T;
                if (!kVar.f19039f) {
                    kVar.f19035a = f9;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kt0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.U && this.V != 0.0f && (overScroller = this.f40008c0) != null && overScroller.isFinished()) {
            o1.k kVar = this.T;
            if (!kVar.f19039f) {
                kVar.f19035a = 0.0f;
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
        Paint paint = this.S;
        paint.setAlpha((int) (this.f40012g0 * 127.0f));
        canvas.drawRect(0.0f, this.f40015j0.getTranslationY() + this.f40016k0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f9;
        int i13;
        iArr[1] = 0;
        if (!this.U || (((this.V) <= 0.0f || i11 <= 0) && (f9 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f9 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.V = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.V = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.V = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.V = f11;
            iArr[1] = i11;
        }
        G();
        this.f40015j0.setTranslationY(this.V);
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f40014i0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f40016k0.getLayoutParams()).topMargin;
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
        float f9;
        float f10;
        float f11;
        if (i13 != 0) {
            if (C()) {
                i15 = AndroidUtilities.statusBarHeight;
            } else {
                i15 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i15;
            int round = Math.round((1.0f - Math.abs((-this.V) / (this.f40016k0.getTop() - currentActionBarHeight))) * i13);
            if (round != 0) {
                boolean z10 = this.U;
                nt0 nt0Var = this.f40015j0;
                if (!z10) {
                    o1.k kVar = this.T;
                    if (!kVar.f19039f) {
                        OverScroller overScroller = this.f40008c0;
                        if (overScroller != null) {
                            f9 = overScroller.getCurrVelocity();
                        } else {
                            f9 = Float.NaN;
                        }
                        if (!Float.isNaN(f9)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f11 = 3000.0f;
                            } else {
                                f11 = 5000.0f;
                            }
                            float min = Math.min(f11, f9);
                            round = (int) ((round * min) / f9);
                            f10 = min * (-this.W);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.V - round;
                            this.V = f12;
                            nt0Var.setTranslationY(f12);
                        }
                        if (!kVar.f19039f) {
                            kVar.f19035a = f10;
                            kVar.f();
                        }
                    }
                } else {
                    float f13 = this.V - round;
                    this.V = f13;
                    nt0Var.setTranslationY(f13);
                }
            }
            G();
        }
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.W = Math.signum(i10);
        this.f40006a0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f40015j0.getTranslationY() + (this.f40016k0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.T.c();
            this.U = true;
            this.V = this.f40015j0.getTranslationY();
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
