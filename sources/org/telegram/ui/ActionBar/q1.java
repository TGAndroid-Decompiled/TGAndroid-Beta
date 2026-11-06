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
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.xq;
public final class q1 extends LinearLayout implements a6 {
    public boolean f28394a;
    public final org.telegram.ui.Components.w5 f28395b;
    public final Paint f28396c;
    public final u1 d;

    public q1(u1 u1Var, Context context) {
        super(context);
        this.d = u1Var;
        ?? obj = new Object();
        obj.f39859f = 0L;
        obj.f39860g = 200L;
        obj.h = xq.f40329f;
        obj.f39855a = this;
        obj.d = 0.0f;
        obj.f39857c = 0.0f;
        obj.f39858e = false;
        this.f28395b = obj;
        this.f28396c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.d.getClass();
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        float L;
        float f10;
        u1 u1Var = this.d;
        if (u1Var.T0) {
            if (u1Var.f28562f0 == 3 && u1Var.f28578r != null) {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = u1Var.f28578r.getScaleX() * u1Var.f28578r.getWidth();
                float scaleY = u1Var.f28578r.getScaleY() * u1Var.f28578r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (u1Var.F0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float e10 = this.f28395b.e(false, f10);
            Paint paint = u1Var.F0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, u1Var.F0);
            }
            if (u1Var.G0 == null) {
                Paint paint2 = new Paint(1);
                u1Var.G0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (u1Var.Q0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, u1Var.G0);
            int i7 = u1Var.U0;
            Paint paint3 = this.f28396c;
            paint3.setColor(i7);
            paint3.setAlpha((int) ((((u1Var.B0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        u1 u1Var = this.d;
        if (u1Var.H) {
            u1Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        u1 u1Var = this.d;
        int[] iArr = u1Var.f28588x0;
        if (u1Var.f28562f0 == 3) {
            int measuredWidth = ((i11 - i7) - u1Var.f28578r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - u1Var.f28578r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = u1Var.f28578r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, u1Var.f28578r.getMeasuredHeight() + measuredHeight);
        } else {
            m1 m1Var = u1Var.f28585w;
            if (m1Var != null) {
                if (u1Var.f28589y == null) {
                    u1Var.f28589y = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z10;
                            u1 u1Var2 = q1.this.d;
                            boolean z11 = false;
                            if (u1Var2.f28561f != null && u1Var2.f28585w.getScrollY() > u1Var2.f28587x.getTop()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u1.a(u1Var2, 0, z10);
                            if (u1Var2.f28582t0 != null) {
                                if (u1Var2.f28585w.getHeight() + u1Var2.f28585w.getScrollY() < u1Var2.f28587x.getBottom()) {
                                    z11 = true;
                                }
                            }
                            u1.a(u1Var2, 1, z11);
                            u1Var2.f28585w.invalidate();
                        }
                    };
                    m1Var.getViewTreeObserver().addOnScrollChangedListener(u1Var.f28589y);
                }
                u1Var.f28589y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = u1Var.D0;
        if (matrix != null && u1Var.E0 != null) {
            matrix.reset();
            u1Var.D0.postScale(8.0f, 8.0f);
            u1Var.D0.postTranslate(-iArr[0], -iArr[1]);
            u1Var.E0.setLocalMatrix(u1Var.D0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u1 u1Var = this.d;
        if (u1Var.H) {
            u1Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f28394a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i7;
        int f10;
        int f11;
        u1 u1Var = this.d;
        try {
            u1Var.s();
            int i10 = u1Var.f28552b1;
            if (i10 >= 0 && (f11 = u1Var.f(i10)) != u1Var.U0) {
                u1Var.U0 = f11;
                Drawable drawable = u1Var.f28591z0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(u1Var.U0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = u1Var.f28578r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    k6.C1(u1Var.U0, u1Var.f28578r.getBackground());
                }
                q1 q1Var = u1Var.f28549a1;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            h70 h70Var = u1Var.f28583u0;
            if (h70Var != null) {
                h70Var.setProgressColor(u1Var.f(k6.F5));
                u1Var.f28583u0.setBackColor(u1Var.f(k6.G5));
                u1Var.f28583u0.invalidate();
            }
            if (u1Var.f28585w != null && (f10 = u1Var.f(k6.A5)) != u1Var.f28557d1) {
                u1Var.f28557d1 = f10;
                org.telegram.messenger.g0.z3(u1Var.f28585w, f10);
            }
            if (!u1Var.f28565g1) {
                xh.l lVar = u1Var.f28561f;
                if (lVar != null && lVar.getCurrentTextColor() == u1Var.f28560e1) {
                    xh.l lVar2 = u1Var.f28561f;
                    int f12 = u1Var.f(k6.f27956j5);
                    u1Var.f28560e1 = f12;
                    lVar2.setTextColor(f12);
                }
                lt ltVar = u1Var.f28573n;
                if (ltVar != null && ltVar.getCurrentTextColor() == u1Var.f28563f1) {
                    lt ltVar2 = u1Var.f28573n;
                    if (u1Var.W) {
                        i7 = k6.f28240y6;
                    } else {
                        i7 = k6.f27956j5;
                    }
                    int f13 = u1Var.f(i7);
                    u1Var.f28563f1 = f13;
                    ltVar2.setTextColor(f13);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
