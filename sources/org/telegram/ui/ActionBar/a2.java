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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.su;
public final class a2 extends LinearLayout implements p6 {
    public boolean f22375a;
    public final org.telegram.ui.Components.h6 f22376b;
    public final Paint f22377c;
    public final e2 d;

    public a2(Context context, e2 e2Var) {
        super(context);
        this.d = e2Var;
        ?? obj = new Object();
        obj.f28810f = 0L;
        obj.f28811g = 200L;
        obj.h = ds.f27584f;
        obj.f28807a = this;
        obj.d = 0.0f;
        obj.f28809c = 0.0f;
        obj.e = false;
        this.f22376b = obj;
        this.f22377c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.d;
        Drawable drawable = e2Var.B0;
        if (e2Var.f22577k0 && !e2Var.V0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = e2Var.V;
            if (view != null && e2Var.f22579l0) {
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
        e2 e2Var = this.d;
        if (e2Var.V0) {
            if (e2Var.f22567f0 == 3 && e2Var.f22585r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = e2Var.f22585r.getScaleX() * e2Var.f22585r.getWidth();
                float scaleY = e2Var.f22585r.getScaleY() * e2Var.f22585r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (e2Var.H0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f22376b.d(f7, false);
            Paint paint = e2Var.H0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, e2Var.H0);
            }
            if (e2Var.I0 == null) {
                Paint paint2 = new Paint(1);
                e2Var.I0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (e2Var.S0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, e2Var.I0);
            int i10 = e2Var.W0;
            Paint paint3 = this.f22377c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((e2Var.D0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        e2 e2Var = this.d;
        if (e2Var.H) {
            e2Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e2 e2Var = this.d;
        int[] iArr = e2Var.f22598z0;
        if (e2Var.f22567f0 == 3) {
            int measuredWidth = ((i12 - i10) - e2Var.f22585r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - e2Var.f22585r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = e2Var.f22585r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, e2Var.f22585r.getMeasuredHeight() + measuredHeight);
        } else {
            w1 w1Var = e2Var.v;
            if (w1Var != null) {
                if (e2Var.f22594x == null) {
                    e2Var.f22594x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            e2 e2Var2 = a2.this.d;
                            boolean z12 = false;
                            if (e2Var2.f22566f != null && e2Var2.v.getScrollY() > e2Var2.f22592w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            e2.a(e2Var2, 0, z11);
                            if (e2Var2.f22591v0 != null) {
                                if (e2Var2.v.getHeight() + e2Var2.v.getScrollY() < e2Var2.f22592w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            e2.a(e2Var2, 1, z12);
                            e2Var2.v.invalidate();
                        }
                    };
                    w1Var.getViewTreeObserver().addOnScrollChangedListener(e2Var.f22594x);
                }
                e2Var.f22594x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = e2Var.F0;
        if (matrix != null && e2Var.G0 != null) {
            matrix.reset();
            e2Var.F0.postScale(8.0f, 8.0f);
            e2Var.F0.postTranslate(-iArr[0], -iArr[1]);
            e2Var.G0.setLocalMatrix(e2Var.F0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e2 e2Var = this.d;
        if (e2Var.H) {
            e2Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f22375a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i10;
        int f7;
        int f10;
        e2 e2Var = this.d;
        try {
            e2Var.s();
            int i11 = e2Var.f22563d1;
            if (i11 >= 0 && (f10 = e2Var.f(i11)) != e2Var.W0) {
                e2Var.W0 = f10;
                Drawable drawable = e2Var.B0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(e2Var.W0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = e2Var.f22585r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    y6.z1(e2Var.W0, e2Var.f22585r.getBackground());
                }
                a2 a2Var = e2Var.f22561c1;
                if (a2Var != null) {
                    a2Var.invalidate();
                }
            }
            i90 i90Var = e2Var.f22593w0;
            if (i90Var != null) {
                i90Var.setProgressColor(e2Var.f(y6.F5));
                e2Var.f22593w0.setBackColor(e2Var.f(y6.G5));
                e2Var.f22593w0.invalidate();
            }
            if (e2Var.v != null && (f7 = e2Var.f(y6.A5)) != e2Var.f22568f1) {
                e2Var.f22568f1 = f7;
                AndroidUtilities.setScrollViewEdgeEffectColor(e2Var.v, f7);
            }
            if (!e2Var.f22574i1) {
                xh.n nVar = e2Var.f22566f;
                if (nVar != null && nVar.getCurrentTextColor() == e2Var.f22570g1) {
                    xh.n nVar2 = e2Var.f22566f;
                    int f11 = e2Var.f(y6.f23462j5);
                    e2Var.f22570g1 = f11;
                    nVar2.setTextColor(f11);
                }
                su suVar = e2Var.f22580n;
                if (suVar != null && suVar.getCurrentTextColor() == e2Var.f22572h1) {
                    su suVar2 = e2Var.f22580n;
                    if (e2Var.W) {
                        i10 = y6.f23746y6;
                    } else {
                        i10 = y6.f23462j5;
                    }
                    int f12 = e2Var.f(i10);
                    e2Var.f22572h1 = f12;
                    suVar2.setTextColor(f12);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
