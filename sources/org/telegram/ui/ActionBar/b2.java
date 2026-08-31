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
public final class b2 extends LinearLayout {
    public boolean f21191a;
    public final org.telegram.ui.Components.z5 f21192b;
    public final Paint f21193c;
    public final d2 d;

    public b2(Context context, d2 d2Var) {
        super(context);
        this.d = d2Var;
        ?? obj = new Object();
        obj.f33727f = 0L;
        obj.f33728g = 200L;
        obj.h = pr.f30183f;
        obj.f33723a = this;
        obj.d = 0.0f;
        obj.f33725c = 0.0f;
        obj.f33726e = false;
        this.f21192b = obj;
        this.f21193c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d2 d2Var = this.d;
        Drawable drawable = d2Var.f21265w0;
        if (d2Var.f21245f0 && !d2Var.Q0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = d2Var.S;
            if (view != null && d2Var.f21246g0) {
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
        float f10;
        d2 d2Var = this.d;
        if (d2Var.Q0) {
            if (d2Var.f21236a0 == 3 && d2Var.f21257r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = d2Var.f21257r.getScaleX() * d2Var.f21257r.getWidth();
                float scaleY = d2Var.f21257r.getScaleY() * d2Var.f21257r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (d2Var.C0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float d = this.f21192b.d(f10, false);
            Paint paint = d2Var.C0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, d2Var.C0);
            }
            if (d2Var.D0 == null) {
                Paint paint2 = new Paint(1);
                d2Var.D0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (d2Var.N0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, d2Var.D0);
            int i10 = d2Var.R0;
            Paint paint3 = this.f21193c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((d2Var.f21269y0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        if (d2Var.E) {
            d2Var.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        d2 d2Var = this.d;
        int[] iArr = d2Var.f21262u0;
        if (d2Var.f21236a0 == 3) {
            int measuredWidth = ((i12 - i10) - d2Var.f21257r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - d2Var.f21257r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = d2Var.f21257r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, d2Var.f21257r.getMeasuredHeight() + measuredHeight);
        } else {
            x1 x1Var = d2Var.v;
            if (x1Var != null) {
                if (d2Var.f21266x == null) {
                    d2Var.f21266x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z10;
                            d2 d2Var2 = b2.this.d;
                            boolean z11 = false;
                            if (d2Var2.f21244f != null && d2Var2.v.getScrollY() > d2Var2.f21264w.getTop()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            d2.a(d2Var2, 0, z10);
                            if (d2Var2.f21256q0 != null) {
                                if (d2Var2.v.getHeight() + d2Var2.v.getScrollY() < d2Var2.f21264w.getBottom()) {
                                    z11 = true;
                                }
                            }
                            d2.a(d2Var2, 1, z11);
                            d2Var2.v.invalidate();
                        }
                    };
                    x1Var.getViewTreeObserver().addOnScrollChangedListener(d2Var.f21266x);
                }
                d2Var.f21266x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = d2Var.A0;
        if (matrix != null && d2Var.B0 != null) {
            matrix.reset();
            d2Var.A0.postScale(8.0f, 8.0f);
            d2Var.A0.postTranslate(-iArr[0], -iArr[1]);
            d2Var.B0.setLocalMatrix(d2Var.A0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d2 d2Var = this.d;
        if (d2Var.E) {
            d2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f21191a) {
            return;
        }
        super.requestLayout();
    }
}
