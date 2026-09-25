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
import org.telegram.ui.Components.rr;
public final class y1 extends LinearLayout {
    public boolean f19935a;
    public final org.telegram.ui.Components.e6 f19936b;
    public final Paint f19937c;
    public final a2 d;

    public y1(Context context, a2 a2Var) {
        super(context);
        this.d = a2Var;
        ?? obj = new Object();
        obj.f23846f = 0L;
        obj.f23847g = 200L;
        obj.h = rr.f28031f;
        obj.f23843a = this;
        obj.d = 0.0f;
        obj.f23845c = 0.0f;
        obj.e = false;
        this.f19936b = obj;
        this.f19937c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a2 a2Var = this.d;
        Drawable drawable = a2Var.f18707z0;
        if (a2Var.f18685i0 && !a2Var.T0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = a2Var.V;
            if (view != null && a2Var.f18686j0) {
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
        a2 a2Var = this.d;
        if (a2Var.T0) {
            if (a2Var.f18679d0 == 3 && a2Var.f18694r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = a2Var.f18694r.getScaleX() * a2Var.f18694r.getWidth();
                float scaleY = a2Var.f18694r.getScaleY() * a2Var.f18694r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (a2Var.F0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f19936b.d(f7, false);
            Paint paint = a2Var.F0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, a2Var.F0);
            }
            if (a2Var.G0 == null) {
                Paint paint2 = new Paint(1);
                a2Var.G0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (a2Var.Q0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, a2Var.G0);
            int i10 = a2Var.U0;
            Paint paint3 = this.f19937c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((a2Var.B0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        a2 a2Var = this.d;
        if (a2Var.H) {
            a2Var.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a2 a2Var = this.d;
        int[] iArr = a2Var.f18704x0;
        if (a2Var.f18679d0 == 3) {
            int measuredWidth = ((i12 - i10) - a2Var.f18694r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - a2Var.f18694r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = a2Var.f18694r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, a2Var.f18694r.getMeasuredHeight() + measuredHeight);
        } else {
            u1 u1Var = a2Var.v;
            if (u1Var != null) {
                if (a2Var.f18703x == null) {
                    a2Var.f18703x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            a2 a2Var2 = y1.this.d;
                            boolean z12 = false;
                            if (a2Var2.f18681f != null && a2Var2.v.getScrollY() > a2Var2.f18701w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a2.a(a2Var2, 0, z11);
                            if (a2Var2.f18698t0 != null) {
                                if (a2Var2.v.getHeight() + a2Var2.v.getScrollY() < a2Var2.f18701w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            a2.a(a2Var2, 1, z12);
                            a2Var2.v.invalidate();
                        }
                    };
                    u1Var.getViewTreeObserver().addOnScrollChangedListener(a2Var.f18703x);
                }
                a2Var.f18703x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = a2Var.D0;
        if (matrix != null && a2Var.E0 != null) {
            matrix.reset();
            a2Var.D0.postScale(8.0f, 8.0f);
            a2Var.D0.postTranslate(-iArr[0], -iArr[1]);
            a2Var.E0.setLocalMatrix(a2Var.D0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a2 a2Var = this.d;
        if (a2Var.H) {
            a2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f19935a) {
            return;
        }
        super.requestLayout();
    }
}
