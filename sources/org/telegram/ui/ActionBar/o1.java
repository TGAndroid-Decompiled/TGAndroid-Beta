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
import org.telegram.messenger.a8;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.xq;
public final class o1 extends LinearLayout implements z5 {
    public boolean f28377a;
    public final org.telegram.ui.Components.u5 f28378b;
    public final Paint f28379c;
    public final s1 d;

    public o1(s1 s1Var, Context context) {
        super(context);
        this.d = s1Var;
        ?? obj = new Object();
        obj.f38647f = 0L;
        obj.f38648g = 200L;
        obj.h = xq.f40452f;
        obj.f38643a = this;
        obj.d = 0.0f;
        obj.f38645c = 0.0f;
        obj.f38646e = false;
        this.f28378b = obj;
        this.f28379c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var = this.d;
        Drawable drawable = s1Var.C0;
        if (s1Var.f28549l0 && !s1Var.W0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = s1Var.W;
            if (view != null && s1Var.m0) {
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
        float f10;
        s1 s1Var = this.d;
        if (s1Var.W0) {
            if (s1Var.f28540g0 == 3 && s1Var.f28556r != null) {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = s1Var.f28556r.getScaleX() * s1Var.f28556r.getWidth();
                float scaleY = s1Var.f28556r.getScaleY() * s1Var.f28556r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (s1Var.I0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float e10 = this.f28378b.e(false, f10);
            Paint paint = s1Var.I0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, s1Var.I0);
            }
            if (s1Var.J0 == null) {
                Paint paint2 = new Paint(1);
                s1Var.J0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (s1Var.T0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, s1Var.J0);
            int i3 = s1Var.X0;
            Paint paint3 = this.f28379c;
            paint3.setColor(i3);
            paint3.setAlpha((int) ((((s1Var.E0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        s1 s1Var = this.d;
        if (s1Var.I) {
            s1Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        s1 s1Var = this.d;
        int[] iArr = s1Var.A0;
        if (s1Var.f28540g0 == 3) {
            int measuredWidth = ((i11 - i3) - s1Var.f28556r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - s1Var.f28556r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = s1Var.f28556r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, s1Var.f28556r.getMeasuredHeight() + measuredHeight);
        } else {
            k1 k1Var = s1Var.f28563w;
            if (k1Var != null) {
                if (s1Var.f28567y == null) {
                    s1Var.f28567y = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            s1 s1Var2 = o1.this.d;
                            boolean z12 = false;
                            if (s1Var2.f28537f != null && s1Var2.f28563w.getScrollY() > s1Var2.f28565x.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            s1.a(s1Var2, 0, z11);
                            if (s1Var2.f28564w0 != null) {
                                if (s1Var2.f28563w.getHeight() + s1Var2.f28563w.getScrollY() < s1Var2.f28565x.getBottom()) {
                                    z12 = true;
                                }
                            }
                            s1.a(s1Var2, 1, z12);
                            s1Var2.f28563w.invalidate();
                        }
                    };
                    k1Var.getViewTreeObserver().addOnScrollChangedListener(s1Var.f28567y);
                }
                s1Var.f28567y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = s1Var.G0;
        if (matrix != null && s1Var.H0 != null) {
            matrix.reset();
            s1Var.G0.postScale(8.0f, 8.0f);
            s1Var.G0.postTranslate(-iArr[0], -iArr[1]);
            s1Var.H0.setLocalMatrix(s1Var.G0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.o1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s1 s1Var = this.d;
        if (s1Var.I) {
            s1Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f28377a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i3;
        int f10;
        int f11;
        s1 s1Var = this.d;
        try {
            s1Var.s();
            int i10 = s1Var.f28536e1;
            if (i10 >= 0 && (f11 = s1Var.f(i10)) != s1Var.X0) {
                s1Var.X0 = f11;
                Drawable drawable = s1Var.C0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(s1Var.X0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = s1Var.f28556r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    k6.C1(s1Var.X0, s1Var.f28556r.getBackground());
                }
                o1 o1Var = s1Var.f28533d1;
                if (o1Var != null) {
                    o1Var.invalidate();
                }
            }
            d70 d70Var = s1Var.f28566x0;
            if (d70Var != null) {
                d70Var.setProgressColor(s1Var.f(k6.F5));
                s1Var.f28566x0.setBackColor(s1Var.f(k6.G5));
                s1Var.f28566x0.invalidate();
            }
            if (s1Var.f28563w != null && (f10 = s1Var.f(k6.A5)) != s1Var.f28541g1) {
                s1Var.f28541g1 = f10;
                org.telegram.messenger.g0.z3(s1Var.f28563w, f10);
            }
            if (!s1Var.f28547j1) {
                yh.l lVar = s1Var.f28537f;
                if (lVar != null && lVar.getCurrentTextColor() == s1Var.f28543h1) {
                    yh.l lVar2 = s1Var.f28537f;
                    int f12 = s1Var.f(k6.f27988j5);
                    s1Var.f28543h1 = f12;
                    lVar2.setTextColor(f12);
                }
                kt ktVar = s1Var.f28551n;
                if (ktVar != null && ktVar.getCurrentTextColor() == s1Var.f28545i1) {
                    kt ktVar2 = s1Var.f28551n;
                    if (s1Var.X) {
                        i3 = k6.f28273y6;
                    } else {
                        i3 = k6.f27988j5;
                    }
                    int f13 = s1Var.f(i3);
                    s1Var.f28545i1 = f13;
                    ktVar2.setTextColor(f13);
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
