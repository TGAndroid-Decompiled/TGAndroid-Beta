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
import org.telegram.ui.Components.jr;
public final class a2 extends LinearLayout {
    public boolean f22726a;
    public final org.telegram.ui.Components.d6 f22727b;
    public final Paint f22728c;
    public final c2 d;

    public a2(Context context, c2 c2Var) {
        super(context);
        this.d = c2Var;
        ?? obj = new Object();
        obj.f27668f = 0L;
        obj.f27669g = 200L;
        obj.h = jr.f29800f;
        obj.f27664a = this;
        obj.d = 0.0f;
        obj.f27666c = 0.0f;
        obj.f27667e = false;
        this.f22727b = obj;
        this.f22728c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.d;
        Drawable drawable = c2Var.f22806v0;
        if (c2Var.f22786e0 && !c2Var.P0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = c2Var.R;
            if (view != null && c2Var.f22788f0) {
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
        float f9;
        c2 c2Var = this.d;
        if (c2Var.P0) {
            if (c2Var.Z == 3 && c2Var.f22800r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = c2Var.f22800r.getScaleX() * c2Var.f22800r.getWidth();
                float scaleY = c2Var.f22800r.getScaleY() * c2Var.f22800r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (c2Var.B0 != null) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            float d = this.f22727b.d(f9, false);
            Paint paint = c2Var.B0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, c2Var.B0);
            }
            if (c2Var.C0 == null) {
                Paint paint2 = new Paint(1);
                c2Var.C0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (c2Var.M0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, c2Var.C0);
            int i10 = c2Var.Q0;
            Paint paint3 = this.f22728c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((c2Var.f22810x0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        if (c2Var.D) {
            c2Var.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c2 c2Var = this.d;
        int[] iArr = c2Var.f22804t0;
        if (c2Var.Z == 3) {
            int measuredWidth = ((i12 - i10) - c2Var.f22800r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - c2Var.f22800r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = c2Var.f22800r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, c2Var.f22800r.getMeasuredHeight() + measuredHeight);
        } else {
            w1 w1Var = c2Var.v;
            if (w1Var != null) {
                if (c2Var.f22809x == null) {
                    c2Var.f22809x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            c2 c2Var2 = a2.this.d;
                            boolean z12 = false;
                            if (c2Var2.f22787f != null && c2Var2.v.getScrollY() > c2Var2.f22807w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c2.a(c2Var2, 0, z11);
                            if (c2Var2.f22798p0 != null) {
                                if (c2Var2.v.getHeight() + c2Var2.v.getScrollY() < c2Var2.f22807w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            c2.a(c2Var2, 1, z12);
                            c2Var2.v.invalidate();
                        }
                    };
                    w1Var.getViewTreeObserver().addOnScrollChangedListener(c2Var.f22809x);
                }
                c2Var.f22809x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = c2Var.f22813z0;
        if (matrix != null && c2Var.A0 != null) {
            matrix.reset();
            c2Var.f22813z0.postScale(8.0f, 8.0f);
            c2Var.f22813z0.postTranslate(-iArr[0], -iArr[1]);
            c2Var.A0.setLocalMatrix(c2Var.f22813z0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var = this.d;
        if (c2Var.D) {
            c2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f22726a) {
            return;
        }
        super.requestLayout();
    }
}
