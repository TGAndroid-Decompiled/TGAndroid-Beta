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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xt;
public final class q1 extends LinearLayout implements c6 {
    public boolean f29892a;
    public final org.telegram.ui.Components.c6 f29893b;
    public final Paint f29894c;
    public final u1 d;

    public q1(u1 u1Var, Context context) {
        super(context);
        this.d = u1Var;
        ?? obj = new Object();
        obj.f33894f = 0L;
        obj.f33895g = 200L;
        obj.h = lr.f37208f;
        obj.f33890a = this;
        obj.d = 0.0f;
        obj.f33892c = 0.0f;
        obj.f33893e = false;
        this.f29893b = obj;
        this.f29894c = new Paint(1);
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
        if (u1Var.U0) {
            if (u1Var.f30043g0 == 3 && u1Var.f30058r != null) {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = u1Var.f30058r.getScaleX() * u1Var.f30058r.getWidth();
                float scaleY = u1Var.f30058r.getScaleY() * u1Var.f30058r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (u1Var.G0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float e10 = this.f29893b.e(false, f10);
            Paint paint = u1Var.G0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, u1Var.G0);
            }
            if (u1Var.H0 == null) {
                Paint paint2 = new Paint(1);
                u1Var.H0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (u1Var.R0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, u1Var.H0);
            int i7 = u1Var.V0;
            Paint paint3 = this.f29894c;
            paint3.setColor(i7);
            paint3.setAlpha((int) ((((u1Var.C0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        if (u1Var.I) {
            u1Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        u1 u1Var = this.d;
        int[] iArr = u1Var.f30070y0;
        if (u1Var.f30043g0 == 3) {
            int measuredWidth = ((i11 - i7) - u1Var.f30058r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - u1Var.f30058r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = u1Var.f30058r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, u1Var.f30058r.getMeasuredHeight() + measuredHeight);
        } else {
            m1 m1Var = u1Var.f30065w;
            if (m1Var != null) {
                if (u1Var.f30069y == null) {
                    u1Var.f30069y = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            u1 u1Var2 = q1.this.d;
                            boolean z12 = false;
                            if (u1Var2.f30040f != null && u1Var2.f30065w.getScrollY() > u1Var2.f30067x.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            u1.a(u1Var2, 0, z11);
                            if (u1Var2.f30063u0 != null) {
                                if (u1Var2.f30065w.getHeight() + u1Var2.f30065w.getScrollY() < u1Var2.f30067x.getBottom()) {
                                    z12 = true;
                                }
                            }
                            u1.a(u1Var2, 1, z12);
                            u1Var2.f30065w.invalidate();
                        }
                    };
                    m1Var.getViewTreeObserver().addOnScrollChangedListener(u1Var.f30069y);
                }
                u1Var.f30069y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = u1Var.E0;
        if (matrix != null && u1Var.F0 != null) {
            matrix.reset();
            u1Var.E0.postScale(8.0f, 8.0f);
            u1Var.E0.postTranslate(-iArr[0], -iArr[1]);
            u1Var.F0.setLocalMatrix(u1Var.E0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u1 u1Var = this.d;
        if (u1Var.I) {
            u1Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f29892a) {
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
            int i10 = u1Var.f30034c1;
            if (i10 >= 0 && (f11 = u1Var.f(i10)) != u1Var.V0) {
                u1Var.V0 = f11;
                Drawable drawable = u1Var.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(u1Var.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = u1Var.f30058r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    n6.C1(u1Var.V0, u1Var.f30058r.getBackground());
                }
                q1 q1Var = u1Var.f30031b1;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            v70 v70Var = u1Var.f30064v0;
            if (v70Var != null) {
                v70Var.setProgressColor(u1Var.f(n6.F5));
                u1Var.f30064v0.setBackColor(u1Var.f(n6.G5));
                u1Var.f30064v0.invalidate();
            }
            if (u1Var.f30065w != null && (f10 = u1Var.f(n6.A5)) != u1Var.f30039e1) {
                u1Var.f30039e1 = f10;
                org.telegram.messenger.g0.x3(u1Var.f30065w, f10);
            }
            if (!u1Var.f30046h1) {
                xh.l lVar = u1Var.f30040f;
                if (lVar != null && lVar.getCurrentTextColor() == u1Var.f30042f1) {
                    xh.l lVar2 = u1Var.f30040f;
                    int f12 = u1Var.f(n6.f29504j5);
                    u1Var.f30042f1 = f12;
                    lVar2.setTextColor(f12);
                }
                xt xtVar = u1Var.f30053n;
                if (xtVar != null && xtVar.getCurrentTextColor() == u1Var.f30044g1) {
                    xt xtVar2 = u1Var.f30053n;
                    if (u1Var.X) {
                        i7 = n6.f29788y6;
                    } else {
                        i7 = n6.f29504j5;
                    }
                    int f13 = u1Var.f(i7);
                    u1Var.f30044g1 = f13;
                    xtVar2.setTextColor(f13);
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
