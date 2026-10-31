package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xt;
public final class t1 extends LinearLayout implements k6 {
    public boolean f20858a;
    public final org.telegram.ui.Components.t5 f20859b;
    public final Paint f20860c;
    public final x1 d;

    public t1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        ?? obj = new Object();
        obj.f30446f = 0L;
        obj.f30447g = 200L;
        obj.h = gr.f26495f;
        obj.f30443a = this;
        obj.d = 0.0f;
        obj.f30445c = 0.0f;
        obj.e = false;
        this.f20859b = obj;
        this.f20860c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x1 x1Var = this.d;
        Drawable drawable = x1Var.B0;
        if (x1Var.f21492k0 && !x1Var.V0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = x1Var.V;
            if (view != null && x1Var.f21494l0) {
                int bottom = view.getBottom();
                canvas.save();
                canvas.clipRect(0, bottom, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                canvas.restore();
            } else {
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        float L;
        float f7;
        x1 x1Var = this.d;
        if (x1Var.V0) {
            if (x1Var.f21482f0 == 3 && x1Var.f21500r != null) {
                L = org.telegram.messenger.i0.L(18.0f);
                float scaleX = x1Var.f21500r.getScaleX() * x1Var.f21500r.getWidth();
                float scaleY = x1Var.f21500r.getScaleY() * x1Var.f21500r.getHeight();
                org.telegram.messenger.i0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
                org.telegram.messenger.i0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (x1Var.H0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float e = this.f20859b.e(false, f7);
            Paint paint = x1Var.H0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.i0.P, L, L, x1Var.H0);
            }
            if (x1Var.I0 == null) {
                Paint paint2 = new Paint(1);
                x1Var.I0 = paint2;
                paint2.setColor(i0.b.o(-16777216, (int) (x1Var.S0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.i0.P;
            canvas.drawRoundRect(rectF, L, L, x1Var.I0);
            int i10 = x1Var.W0;
            Paint paint3 = this.f20860c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((x1Var.D0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, L, L, paint3);
        }
        super.draw(canvas);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x1 x1Var = this.d;
        if (x1Var.H) {
            x1Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x1 x1Var = this.d;
        int[] iArr = x1Var.f21513z0;
        if (x1Var.f21482f0 == 3) {
            int measuredWidth = ((i12 - i10) - x1Var.f21500r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - x1Var.f21500r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = x1Var.f21500r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, x1Var.f21500r.getMeasuredHeight() + measuredHeight);
        } else {
            p1 p1Var = x1Var.f21507w;
            if (p1Var != null) {
                if (x1Var.f21511y == null) {
                    x1Var.f21511y = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            x1 x1Var2 = t1.this.d;
                            boolean z12 = false;
                            if (x1Var2.f21481f != null && x1Var2.f21507w.getScrollY() > x1Var2.f21509x.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            x1.a(x1Var2, 0, z11);
                            if (x1Var2.f21506v0 != null) {
                                if (x1Var2.f21507w.getHeight() + x1Var2.f21507w.getScrollY() < x1Var2.f21509x.getBottom()) {
                                    z12 = true;
                                }
                            }
                            x1.a(x1Var2, 1, z12);
                            x1Var2.f21507w.invalidate();
                        }
                    };
                    p1Var.getViewTreeObserver().addOnScrollChangedListener(x1Var.f21511y);
                }
                x1Var.f21511y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = x1Var.F0;
        if (matrix != null && x1Var.G0 != null) {
            matrix.reset();
            x1Var.F0.postScale(8.0f, 8.0f);
            x1Var.F0.postTranslate(-iArr[0], -iArr[1]);
            x1Var.G0.setLocalMatrix(x1Var.F0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x1 x1Var = this.d;
        if (x1Var.H) {
            x1Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f20858a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i10;
        int f7;
        int f10;
        x1 x1Var = this.d;
        try {
            x1Var.s();
            int i11 = x1Var.f21478d1;
            if (i11 >= 0 && (f10 = x1Var.f(i11)) != x1Var.W0) {
                x1Var.W0 = f10;
                Drawable drawable = x1Var.B0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(x1Var.W0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = x1Var.f21500r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    t6.C1(x1Var.W0, x1Var.f21500r.getBackground());
                }
                t1 t1Var = x1Var.f21476c1;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            a80 a80Var = x1Var.f21508w0;
            if (a80Var != null) {
                a80Var.setProgressColor(x1Var.f(t6.F5));
                x1Var.f21508w0.setBackColor(x1Var.f(t6.G5));
                x1Var.f21508w0.invalidate();
            }
            if (x1Var.f21507w != null && (f7 = x1Var.f(t6.A5)) != x1Var.f21483f1) {
                x1Var.f21483f1 = f7;
                org.telegram.messenger.i0.y3(x1Var.f21507w, f7);
            }
            if (!x1Var.f21489i1) {
                nh.p pVar = x1Var.f21481f;
                if (pVar != null && pVar.getCurrentTextColor() == x1Var.f21485g1) {
                    nh.p pVar2 = x1Var.f21481f;
                    int f11 = x1Var.f(t6.f21037j5);
                    x1Var.f21485g1 = f11;
                    pVar2.setTextColor(f11);
                }
                xt xtVar = x1Var.f21495n;
                if (xtVar != null && xtVar.getCurrentTextColor() == x1Var.f21487h1) {
                    xt xtVar2 = x1Var.f21495n;
                    if (x1Var.W) {
                        i10 = t6.f21311y6;
                    } else {
                        i10 = t6.f21037j5;
                    }
                    int f12 = x1Var.f(i10);
                    x1Var.f21487h1 = f12;
                    xtVar2.setTextColor(f12);
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
