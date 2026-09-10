package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class b2 extends LinearLayout {
    public boolean f17546a;
    public final org.telegram.ui.Components.d6 f17547b;
    public final Paint f17548c;
    public final d2 d;

    public b2(Context context, d2 d2Var) {
        super(context);
        this.d = d2Var;
        ?? obj = new Object();
        obj.f22296f = 0L;
        obj.f22297g = 200L;
        obj.h = wr.f28819f;
        obj.f22293a = this;
        obj.d = 0.0f;
        obj.f22295c = 0.0f;
        obj.e = false;
        this.f17547b = obj;
        this.f17548c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d2 d2Var = this.d;
        Drawable drawable = d2Var.f17645z0;
        if (d2Var.f17623i0 && !d2Var.T0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = d2Var.V;
            if (view != null && d2Var.f17624j0) {
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
        float dp;
        float f7;
        d2 d2Var = this.d;
        if (d2Var.T0) {
            if (d2Var.f17617d0 == 3 && d2Var.f17632r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = d2Var.f17632r.getScaleX() * d2Var.f17632r.getWidth();
                float scaleY = d2Var.f17632r.getScaleY() * d2Var.f17632r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (d2Var.F0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f17547b.d(f7, false);
            Paint paint = d2Var.F0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, d2Var.F0);
            }
            if (d2Var.G0 == null) {
                Paint paint2 = new Paint(1);
                d2Var.G0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (d2Var.Q0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, d2Var.G0);
            int i10 = d2Var.U0;
            Paint paint3 = this.f17548c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((d2Var.B0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, dp, dp, paint3);
        }
        super.draw(canvas);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d2 d2Var = this.d;
        if (d2Var.H) {
            d2Var.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d2 d2Var = this.d;
        int[] iArr = d2Var.f17642x0;
        if (d2Var.f17617d0 == 3) {
            int measuredWidth = ((i12 - i10) - d2Var.f17632r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - d2Var.f17632r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = d2Var.f17632r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, d2Var.f17632r.getMeasuredHeight() + measuredHeight);
        } else {
            x1 x1Var = d2Var.v;
            if (x1Var != null) {
                if (d2Var.f17641x == null) {
                    d2Var.f17641x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            d2 d2Var2 = b2.this.d;
                            boolean z12 = false;
                            if (d2Var2.f17619f != null && d2Var2.v.getScrollY() > d2Var2.f17639w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            d2.a(d2Var2, 0, z11);
                            if (d2Var2.f17636t0 != null) {
                                if (d2Var2.v.getHeight() + d2Var2.v.getScrollY() < d2Var2.f17639w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            d2.a(d2Var2, 1, z12);
                            d2Var2.v.invalidate();
                        }
                    };
                    x1Var.getViewTreeObserver().addOnScrollChangedListener(d2Var.f17641x);
                }
                d2Var.f17641x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = d2Var.D0;
        if (matrix != null && d2Var.E0 != null) {
            matrix.reset();
            d2Var.D0.postScale(8.0f, 8.0f);
            d2Var.D0.postTranslate(-iArr[0], -iArr[1]);
            d2Var.E0.setLocalMatrix(d2Var.D0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d2 d2Var = this.d;
        if (d2Var.H) {
            d2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f17546a) {
            return;
        }
        super.requestLayout();
    }
}
