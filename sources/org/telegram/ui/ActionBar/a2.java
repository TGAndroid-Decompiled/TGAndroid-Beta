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
import org.telegram.ui.Components.sr;
public final class a2 extends LinearLayout {
    public boolean f18666a;
    public final org.telegram.ui.Components.e6 f18667b;
    public final Paint f18668c;
    public final c2 d;

    public a2(Context context, c2 c2Var) {
        super(context);
        this.d = c2Var;
        ?? obj = new Object();
        obj.f23891f = 0L;
        obj.f23892g = 200L;
        obj.h = sr.f28359f;
        obj.f23888a = this;
        obj.d = 0.0f;
        obj.f23890c = 0.0f;
        obj.e = false;
        this.f18667b = obj;
        this.f18668c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.d;
        Drawable drawable = c2Var.f18753z0;
        if (c2Var.f18731i0 && !c2Var.T0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = c2Var.V;
            if (view != null && c2Var.f18732j0) {
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
        c2 c2Var = this.d;
        if (c2Var.T0) {
            if (c2Var.f18725d0 == 3 && c2Var.f18740r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = c2Var.f18740r.getScaleX() * c2Var.f18740r.getWidth();
                float scaleY = c2Var.f18740r.getScaleY() * c2Var.f18740r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (c2Var.F0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f18667b.d(f7, false);
            Paint paint = c2Var.F0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, c2Var.F0);
            }
            if (c2Var.G0 == null) {
                Paint paint2 = new Paint(1);
                c2Var.G0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (c2Var.Q0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, c2Var.G0);
            int i10 = c2Var.U0;
            Paint paint3 = this.f18668c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((c2Var.B0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        c2 c2Var = this.d;
        if (c2Var.H) {
            c2Var.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c2 c2Var = this.d;
        int[] iArr = c2Var.f18750x0;
        if (c2Var.f18725d0 == 3) {
            int measuredWidth = ((i12 - i10) - c2Var.f18740r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - c2Var.f18740r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = c2Var.f18740r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, c2Var.f18740r.getMeasuredHeight() + measuredHeight);
        } else {
            w1 w1Var = c2Var.v;
            if (w1Var != null) {
                if (c2Var.f18749x == null) {
                    c2Var.f18749x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            c2 c2Var2 = a2.this.d;
                            boolean z12 = false;
                            if (c2Var2.f18727f != null && c2Var2.v.getScrollY() > c2Var2.f18747w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c2.a(c2Var2, 0, z11);
                            if (c2Var2.f18744t0 != null) {
                                if (c2Var2.v.getHeight() + c2Var2.v.getScrollY() < c2Var2.f18747w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            c2.a(c2Var2, 1, z12);
                            c2Var2.v.invalidate();
                        }
                    };
                    w1Var.getViewTreeObserver().addOnScrollChangedListener(c2Var.f18749x);
                }
                c2Var.f18749x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = c2Var.D0;
        if (matrix != null && c2Var.E0 != null) {
            matrix.reset();
            c2Var.D0.postScale(8.0f, 8.0f);
            c2Var.D0.postTranslate(-iArr[0], -iArr[1]);
            c2Var.E0.setLocalMatrix(c2Var.D0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var = this.d;
        if (c2Var.H) {
            c2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f18666a) {
            return;
        }
        super.requestLayout();
    }
}
