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
public abstract class du0 extends NestedScrollView {
    public final Paint W;
    public final o1.j f38677a0;
    public boolean f38678b0;
    public float f38679c0;
    public float f38680d0;
    public float f38681e0;
    public final Method f38682f0;
    public final OverScroller f38683g0;
    public boolean f38684h0;
    public int f38685i0;
    public int f38686j0;
    public float f38687k0;
    public boolean f38688l0;
    public int m0;
    public final gu0 f38689n0;
    public final FrameLayout f38690o0;

    public du0(Context context, gu0 gu0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.f38687k0 = 1.0f;
        this.m0 = -1;
        this.f38689n0 = gu0Var;
        this.f38690o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(gu0Var, o1.h.f18952n, 0.0f);
        this.f38677a0 = jVar;
        jVar.f18968u.b(100.0f);
        jVar.e(1.0f);
        jVar.b(new cd0(this, 2));
        jVar.a(new r9(this, 2));
        jVar.f18968u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("c", null);
            this.f38682f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.f38682f0 = null;
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f38683g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f38683g0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean A(int i10, int i11) {
        if (i11 == 0) {
            this.f38677a0.c();
            this.f38678b0 = true;
            this.f38679c0 = this.f38689n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i10) {
        OverScroller overScroller;
        if (this.f38678b0 && i10 == 0) {
            this.f38678b0 = false;
            if (this.f38679c0 != 0.0f && (overScroller = this.f38683g0) != null && overScroller.isFinished()) {
                float f7 = this.f38681e0;
                o1.j jVar = this.f38677a0;
                if (!jVar.f18962f) {
                    jVar.f18959a = f7;
                    jVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    public final void H(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.du0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f38678b0 && this.f38679c0 != 0.0f && (overScroller = this.f38683g0) != null && overScroller.isFinished()) {
            o1.j jVar = this.f38677a0;
            if (!jVar.f18962f) {
                jVar.f18959a = 0.0f;
                jVar.h();
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
        paint.setAlpha((int) (this.f38687k0 * 127.0f));
        canvas.drawRect(0.0f, this.f38689n0.getTranslationY() + this.f38690o0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f38678b0 || (((this.f38679c0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f38679c0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f38679c0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f38679c0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f38679c0 = f11;
            iArr[1] = i11;
        }
        G();
        this.f38689n0.setTranslationY(this.f38679c0);
        return true;
    }

    @Override
    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        int i15;
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            if (D()) {
                i15 = AndroidUtilities.statusBarHeight;
            } else {
                i15 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
            int round = Math.round((1.0f - Math.abs((-this.f38679c0) / (this.f38690o0.getTop() - currentActionBarHeight))) * i13);
            if (round != 0) {
                boolean z10 = this.f38678b0;
                gu0 gu0Var = this.f38689n0;
                if (!z10) {
                    o1.j jVar = this.f38677a0;
                    if (!jVar.f18962f) {
                        OverScroller overScroller = this.f38683g0;
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
                            f10 = min * (-this.f38680d0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f38679c0 - round;
                            this.f38679c0 = f12;
                            gu0Var.setTranslationY(f12);
                        }
                        if (!jVar.f18962f) {
                            jVar.f18959a = f10;
                            jVar.h();
                        }
                    }
                } else {
                    float f13 = this.f38679c0 - round;
                    this.f38679c0 = f13;
                    gu0Var.setTranslationY(f13);
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
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f38690o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10) {
        super.i(i10);
        this.f38680d0 = Math.signum(i10);
        this.f38681e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f38689n0.getTranslationY() + (this.f38690o0.getTop() - getScrollY())) {
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
