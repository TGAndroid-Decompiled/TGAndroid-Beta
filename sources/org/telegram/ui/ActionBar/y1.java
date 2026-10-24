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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.zr;
public final class y1 extends LinearLayout implements b6 {
    public boolean f21971a;
    public final org.telegram.ui.Components.d6 f21972b;
    public final Paint f21973c;
    public final c2 d;

    public y1(Context context, c2 c2Var) {
        super(context);
        this.d = c2Var;
        ?? obj = new Object();
        obj.f25569f = 0L;
        obj.f25570g = 200L;
        obj.h = zr.f33337f;
        obj.f25566a = this;
        obj.d = 0.0f;
        obj.f25568c = 0.0f;
        obj.e = false;
        this.f21972b = obj;
        this.f21973c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.d;
        Drawable drawable = c2Var.B0;
        if (c2Var.f20767k0 && !c2Var.V0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = c2Var.V;
            if (view != null && c2Var.f20769l0) {
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
        if (c2Var.V0) {
            if (c2Var.f20757f0 == 3 && c2Var.f20775r != null) {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = c2Var.f20775r.getScaleX() * c2Var.f20775r.getWidth();
                float scaleY = c2Var.f20775r.getScaleY() * c2Var.f20775r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (c2Var.H0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f21972b.d(f7, false);
            Paint paint = c2Var.H0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, c2Var.H0);
            }
            if (c2Var.I0 == null) {
                Paint paint2 = new Paint(1);
                c2Var.I0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (c2Var.S0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, c2Var.I0);
            int i10 = c2Var.W0;
            Paint paint3 = this.f21973c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((c2Var.D0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
            c2Var.q();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c2 c2Var = this.d;
        int[] iArr = c2Var.f20788z0;
        if (c2Var.f20757f0 == 3) {
            int measuredWidth = ((i12 - i10) - c2Var.f20775r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - c2Var.f20775r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = c2Var.f20775r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, c2Var.f20775r.getMeasuredHeight() + measuredHeight);
        } else {
            u1 u1Var = c2Var.v;
            if (u1Var != null) {
                if (c2Var.f20784x == null) {
                    c2Var.f20784x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            boolean z11;
                            c2 c2Var2 = y1.this.d;
                            boolean z12 = false;
                            if (c2Var2.f20756f != null && c2Var2.v.getScrollY() > c2Var2.f20782w.getTop()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c2.a(c2Var2, 0, z11);
                            if (c2Var2.f20781v0 != null) {
                                if (c2Var2.v.getHeight() + c2Var2.v.getScrollY() < c2Var2.f20782w.getBottom()) {
                                    z12 = true;
                                }
                            }
                            c2.a(c2Var2, 1, z12);
                            c2Var2.v.invalidate();
                        }
                    };
                    u1Var.getViewTreeObserver().addOnScrollChangedListener(c2Var.f20784x);
                }
                c2Var.f20784x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = c2Var.F0;
        if (matrix != null && c2Var.G0 != null) {
            matrix.reset();
            c2Var.F0.postScale(8.0f, 8.0f);
            c2Var.F0.postTranslate(-iArr[0], -iArr[1]);
            c2Var.G0.setLocalMatrix(c2Var.F0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var = this.d;
        if (c2Var.H) {
            c2Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f21971a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i10;
        int f7;
        int f10;
        c2 c2Var = this.d;
        try {
            c2Var.s();
            int i11 = c2Var.f20753d1;
            if (i11 >= 0 && (f10 = c2Var.f(i11)) != c2Var.W0) {
                c2Var.W0 = f10;
                Drawable drawable = c2Var.B0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(c2Var.W0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = c2Var.f20775r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    k6.z1(c2Var.W0, c2Var.f20775r.getBackground());
                }
                y1 y1Var = c2Var.f20751c1;
                if (y1Var != null) {
                    y1Var.invalidate();
                }
            }
            f90 f90Var = c2Var.f20783w0;
            if (f90Var != null) {
                f90Var.setProgressColor(c2Var.f(k6.F5));
                c2Var.f20783w0.setBackColor(c2Var.f(k6.G5));
                c2Var.f20783w0.invalidate();
            }
            if (c2Var.v != null && (f7 = c2Var.f(k6.A5)) != c2Var.f20758f1) {
                c2Var.f20758f1 = f7;
                AndroidUtilities.setScrollViewEdgeEffectColor(c2Var.v, f7);
            }
            if (!c2Var.f20764i1) {
                wh.n nVar = c2Var.f20756f;
                if (nVar != null && nVar.getCurrentTextColor() == c2Var.f20760g1) {
                    wh.n nVar2 = c2Var.f20756f;
                    int f11 = c2Var.f(k6.f21290j5);
                    c2Var.f20760g1 = f11;
                    nVar2.setTextColor(f11);
                }
                pu puVar = c2Var.f20770n;
                if (puVar != null && puVar.getCurrentTextColor() == c2Var.f20762h1) {
                    pu puVar2 = c2Var.f20770n;
                    if (c2Var.W) {
                        i10 = k6.f21572y6;
                    } else {
                        i10 = k6.f21290j5;
                    }
                    int f12 = c2Var.f(i10);
                    c2Var.f20762h1 = f12;
                    puVar2.setTextColor(f12);
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
