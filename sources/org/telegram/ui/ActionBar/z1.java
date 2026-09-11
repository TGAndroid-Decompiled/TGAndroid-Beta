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
import org.telegram.ui.Components.pr;
public final class z1 extends LinearLayout {
    public boolean f21553a;
    public final org.telegram.ui.Components.e6 f21554b;
    public final Paint f21555c;
    public final b2 d;

    public z1(Context context, b2 b2Var) {
        super(context);
        this.d = b2Var;
        ?? obj = new Object();
        obj.f25567f = 0L;
        obj.f25568g = 200L;
        obj.h = pr.f29466f;
        obj.f25563a = this;
        obj.d = 0.0f;
        obj.f25565c = 0.0f;
        obj.f25566e = false;
        this.f21554b = obj;
        this.f21555c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.d;
        Drawable drawable = b2Var.f20261z0;
        if (b2Var.f20239i0 && !b2Var.T0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = b2Var.V;
            if (view != null && b2Var.f20240j0) {
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
        b2 b2Var = this.d;
        if (b2Var.T0) {
            if (b2Var.f20232d0 == 3 && b2Var.f20248r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = b2Var.f20248r.getScaleX() * b2Var.f20248r.getWidth();
                float scaleY = b2Var.f20248r.getScaleY() * b2Var.f20248r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (b2Var.F0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f21554b.d(f7, false);
            Paint paint = b2Var.F0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, b2Var.F0);
            }
            if (b2Var.G0 == null) {
                Paint paint2 = new Paint(1);
                b2Var.G0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (b2Var.Q0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, b2Var.G0);
            int i10 = b2Var.U0;
            Paint paint3 = this.f21555c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((b2Var.B0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        b2 b2Var = this.d;
        if (b2Var.H) {
            b2Var.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b2 b2Var = this.d;
        int[] iArr = b2Var.f20258x0;
        if (b2Var.f20232d0 == 3) {
            int measuredWidth = ((i12 - i10) - b2Var.f20248r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - b2Var.f20248r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = b2Var.f20248r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, b2Var.f20248r.getMeasuredHeight() + measuredHeight);
        } else {
            v1 v1Var = b2Var.v;
            if (v1Var != null) {
                if (b2Var.f20257x == null) {
                    b2Var.f20257x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            b2 b2Var2 = z1.this.d;
                            boolean z12 = false;
                            if (b2Var2.f20235f != null && b2Var2.v.getScrollY() > b2Var2.f20255w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            b2.a(b2Var2, 0, z11);
                            if (b2Var2.f20252t0 != null) {
                                if (b2Var2.v.getHeight() + b2Var2.v.getScrollY() < b2Var2.f20255w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            b2.a(b2Var2, 1, z12);
                            b2Var2.v.invalidate();
                        }
                    };
                    v1Var.getViewTreeObserver().addOnScrollChangedListener(b2Var.f20257x);
                }
                b2Var.f20257x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = b2Var.D0;
        if (matrix != null && b2Var.E0 != null) {
            matrix.reset();
            b2Var.D0.postScale(8.0f, 8.0f);
            b2Var.D0.postTranslate(-iArr[0], -iArr[1]);
            b2Var.E0.setLocalMatrix(b2Var.D0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.z1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b2 b2Var = this.d;
        if (b2Var.H) {
            b2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f21553a) {
            return;
        }
        super.requestLayout();
    }
}
