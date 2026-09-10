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
public abstract class ou0 extends NestedScrollView {
    public final Paint W;
    public final o1.k f35602a0;
    public boolean f35603b0;
    public float f35604c0;
    public float f35605d0;
    public float f35606e0;
    public final Method f35607f0;
    public final OverScroller f35608g0;
    public boolean f35609h0;
    public int f35610i0;
    public int f35611j0;
    public float f35612k0;
    public boolean f35613l0;
    public int m0;
    public final ru0 f35614n0;
    public final FrameLayout f35615o0;

    public ou0(Context context, ru0 ru0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.f35612k0 = 1.0f;
        this.m0 = -1;
        this.f35614n0 = ru0Var;
        this.f35615o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(ru0Var, o1.h.f14117n, 0.0f);
        this.f35602a0 = kVar;
        kVar.f14134u.b(100.0f);
        kVar.f14130j = 1.0f;
        kVar.b(new td0(this, 2));
        kVar.a(new n9(this, 2));
        kVar.f14134u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f35607f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.f35607f0 = null;
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f35608g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f35608g0 = null;
            FileLog.e(e7);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f35603b0 && i10 == 0) {
            this.f35603b0 = false;
            if (this.f35604c0 != 0.0f && (overScroller = this.f35608g0) != null && overScroller.isFinished()) {
                float f7 = this.f35606e0;
                o1.k kVar = this.f35602a0;
                if (!kVar.f14127f) {
                    kVar.f14124a = f7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ou0.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f35603b0 && this.f35604c0 != 0.0f && (overScroller = this.f35608g0) != null && overScroller.isFinished()) {
            o1.k kVar = this.f35602a0;
            if (!kVar.f14127f) {
                kVar.f14124a = 0.0f;
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
        paint.setAlpha((int) (this.f35612k0 * 127.0f));
        canvas.drawRect(0.0f, this.f35614n0.getTranslationY() + this.f35615o0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f35603b0 || (((this.f35604c0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f35604c0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f35604c0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f35604c0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f35604c0 = f11;
            iArr[1] = i11;
        }
        G();
        this.f35614n0.setTranslationY(this.f35604c0);
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f35615o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i15;
            int round = Math.round((1.0f - Math.abs((-this.f35604c0) / (this.f35615o0.getTop() - currentActionBarHeight))) * i13);
            if (round != 0) {
                boolean z10 = this.f35603b0;
                ru0 ru0Var = this.f35614n0;
                if (!z10) {
                    o1.k kVar = this.f35602a0;
                    if (!kVar.f14127f) {
                        OverScroller overScroller = this.f35608g0;
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
                            f10 = min * (-this.f35605d0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f35604c0 - round;
                            this.f35604c0 = f12;
                            ru0Var.setTranslationY(f12);
                        }
                        if (!kVar.f14127f) {
                            kVar.f14124a = f10;
                            kVar.f();
                        }
                    }
                } else {
                    float f13 = this.f35604c0 - round;
                    this.f35604c0 = f13;
                    ru0Var.setTranslationY(f13);
                }
            }
            G();
        }
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f35605d0 = Math.signum(i10);
        this.f35606e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f35614n0.getTranslationY() + (this.f35615o0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f35602a0.c();
            this.f35603b0 = true;
            this.f35604c0 = this.f35614n0.getTranslationY();
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
