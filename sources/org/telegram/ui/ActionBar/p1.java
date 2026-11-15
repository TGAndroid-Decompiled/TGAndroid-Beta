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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.st;
public final class p1 extends LinearLayout implements z5 {
    public boolean f29465a;
    public final org.telegram.ui.Components.u5 f29466b;
    public final Paint f29467c;
    public final t1 d;

    public p1(t1 t1Var, Context context) {
        super(context);
        this.d = t1Var;
        ?? obj = new Object();
        obj.f39902f = 0L;
        obj.f39903g = 200L;
        obj.h = er.f34419f;
        obj.f39898a = this;
        obj.d = 0.0f;
        obj.f39900c = 0.0f;
        obj.f39901e = false;
        this.f29466b = obj;
        this.f29467c = new Paint(1);
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
        t1 t1Var = this.d;
        if (t1Var.U0) {
            if (t1Var.f29631g0 == 3 && t1Var.f29646r != null) {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = t1Var.f29646r.getScaleX() * t1Var.f29646r.getWidth();
                float scaleY = t1Var.f29646r.getScaleY() * t1Var.f29646r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (t1Var.G0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float e10 = this.f29466b.e(false, f10);
            Paint paint = t1Var.G0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, t1Var.G0);
            }
            if (t1Var.H0 == null) {
                Paint paint2 = new Paint(1);
                t1Var.H0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (t1Var.R0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, t1Var.H0);
            int i7 = t1Var.V0;
            Paint paint3 = this.f29467c;
            paint3.setColor(i7);
            paint3.setAlpha((int) ((((t1Var.C0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        t1 t1Var = this.d;
        if (t1Var.I) {
            t1Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        t1 t1Var = this.d;
        int[] iArr = t1Var.f29658y0;
        if (t1Var.f29631g0 == 3) {
            int measuredWidth = ((i11 - i7) - t1Var.f29646r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - t1Var.f29646r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = t1Var.f29646r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, t1Var.f29646r.getMeasuredHeight() + measuredHeight);
        } else {
            l1 l1Var = t1Var.f29653w;
            if (l1Var != null) {
                if (t1Var.f29657y == null) {
                    t1Var.f29657y = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            t1 t1Var2 = p1.this.d;
                            boolean z12 = false;
                            if (t1Var2.f29628f != null && t1Var2.f29653w.getScrollY() > t1Var2.f29655x.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            t1.a(t1Var2, 0, z11);
                            if (t1Var2.f29651u0 != null) {
                                if (t1Var2.f29653w.getHeight() + t1Var2.f29653w.getScrollY() < t1Var2.f29655x.getBottom()) {
                                    z12 = true;
                                }
                            }
                            t1.a(t1Var2, 1, z12);
                            t1Var2.f29653w.invalidate();
                        }
                    };
                    l1Var.getViewTreeObserver().addOnScrollChangedListener(t1Var.f29657y);
                }
                t1Var.f29657y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = t1Var.E0;
        if (matrix != null && t1Var.F0 != null) {
            matrix.reset();
            t1Var.E0.postScale(8.0f, 8.0f);
            t1Var.E0.postTranslate(-iArr[0], -iArr[1]);
            t1Var.F0.setLocalMatrix(t1Var.E0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.p1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t1 t1Var = this.d;
        if (t1Var.I) {
            t1Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f29465a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i7;
        int f10;
        int f11;
        t1 t1Var = this.d;
        try {
            t1Var.s();
            int i10 = t1Var.f29622c1;
            if (i10 >= 0 && (f11 = t1Var.f(i10)) != t1Var.V0) {
                t1Var.V0 = f11;
                Drawable drawable = t1Var.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(t1Var.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = t1Var.f29646r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    j6.C1(t1Var.V0, t1Var.f29646r.getBackground());
                }
                p1 p1Var = t1Var.f29619b1;
                if (p1Var != null) {
                    p1Var.invalidate();
                }
            }
            k70 k70Var = t1Var.f29652v0;
            if (k70Var != null) {
                k70Var.setProgressColor(t1Var.f(j6.F5));
                t1Var.f29652v0.setBackColor(t1Var.f(j6.G5));
                t1Var.f29652v0.invalidate();
            }
            if (t1Var.f29653w != null && (f10 = t1Var.f(j6.A5)) != t1Var.f29627e1) {
                t1Var.f29627e1 = f10;
                org.telegram.messenger.g0.y3(t1Var.f29653w, f10);
            }
            if (!t1Var.f29634h1) {
                xh.l lVar = t1Var.f29628f;
                if (lVar != null && lVar.getCurrentTextColor() == t1Var.f29630f1) {
                    xh.l lVar2 = t1Var.f29628f;
                    int f12 = t1Var.f(j6.f28957j5);
                    t1Var.f29630f1 = f12;
                    lVar2.setTextColor(f12);
                }
                st stVar = t1Var.f29641n;
                if (stVar != null && stVar.getCurrentTextColor() == t1Var.f29632g1) {
                    st stVar2 = t1Var.f29641n;
                    if (t1Var.X) {
                        i7 = j6.f29241y6;
                    } else {
                        i7 = j6.f28957j5;
                    }
                    int f13 = t1Var.f(i7);
                    t1Var.f29632g1 = f13;
                    stVar2.setTextColor(f13);
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
