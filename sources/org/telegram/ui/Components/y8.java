package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.cc1;
public final class y8 extends tw0 {
    public float A0;
    public float B0;
    public final g9 C0;
    public final b2.q0 f33172w0;
    public final g9 f33173x0;
    public boolean f33174y0;
    public boolean f33175z0;

    public y8(g9 g9Var, Context context) {
        super(context, null);
        this.C0 = g9Var;
        this.f33173x0 = g9Var;
        this.f33172w0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        g9 g9Var = this.C0;
        if (!g9Var.U) {
            if (!g9Var.h) {
                canvas.save();
                float x10 = g9Var.f26687a.getX() + g9Var.f26695r.getX();
                float y3 = g9Var.f26687a.getY() + g9Var.f26695r.getY();
                int i10 = g9Var.d - g9Var.f26691c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - g9Var.f26691c) >> 1), g9Var.N);
                canvas.translate(x10, lerp);
                g9Var.f26687a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (g9Var.E * f10), g9Var.f26687a.getMeasuredWidth() + x10, (f10 * g9Var.E) + g9Var.f26687a.getMeasuredHeight() + lerp);
                z8 z8Var = g9Var.f26687a;
                float f11 = x10 + z8Var.f26397y;
                float f12 = lerp + z8Var.E;
                id idVar = g9Var.K;
                float f13 = z8Var.f26396x;
                idVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                idVar.f27421i = false;
                idVar.f27417c = 0;
                idVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = g9Var.f26687a.f26394s.f26665c;
            if (g9Var.f26692e.getVisibility() == 0) {
                f7 = g9Var.f26692e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                g9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(g9Var.H.getX(), g9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, g9Var.H.getMeasuredWidth(), g9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                g9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                g9Var.H.setVisibility(8);
            }
        }
        if (g9Var.f26693f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        g9 g9Var = this.C0;
        Paint paint = g9Var.O;
        if (view != g9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.m2) g9Var).actionBar;
            if (view == kVar && g9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
                paint.setAlpha((int) (g9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) g9Var.getParentLayout()).p(canvas2, (int) (g9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f33172w0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0.N == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        float f7;
        org.telegram.ui.ActionBar.k kVar;
        R();
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f31370f) {
            z10 = true;
        } else {
            z10 = false;
        }
        g9 g9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != g9Var.U) {
            g9Var.U = z10;
            AndroidUtilities.removeFromParent(g9Var.f26687a);
            AndroidUtilities.requestAdjustNothing(g9Var.getParentActivity(), g9Var.getClassGuid());
            if (g9Var.U) {
                g9Var.i0(0.0f, false);
                g9Var.f26687a.setExpanded(false);
                addView(g9Var.f26687a, 0, w7.x5.d(-1.0f, -1));
            } else {
                g9Var.f26695r.addView(g9Var.f26687a, 0, w7.x5.d(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        }
        if (g9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) g9Var.f26695r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.f26695r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) g9Var.f26687a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) g9Var.f26698x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) g9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) g9Var.f26695r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.f26695r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.f26687a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.f26698x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = g9Var.L;
        if (this.f31370f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        g9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (g9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.m2) g9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-g9Var.f26689b.getTop());
            } else {
                i12 = 0;
            }
            cc1 cc1Var = g9Var.f26695r;
            cc1Var.setTranslationY((cc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) g9Var.f26695r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) g9Var.f26695r.getLayoutParams()).topMargin = i12;
            boolean z13 = g9Var.L;
            if (!g9Var.U) {
                float f11 = g9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((g9Var.d - g9Var.f26691c) - AndroidUtilities.statusBarHeight) * g9Var.E;
                if (z13) {
                    g9Var.f26687a.setExpanded(false);
                    f12 = g9Var.f26695r.getTranslationY();
                } else {
                    f10 = g9Var.f26695r.getTranslationY();
                }
                if (g9Var.F && !z13) {
                    g9Var.f26687a.setExpanded(true);
                } else {
                    g9Var.F = false;
                }
                g9Var.M.addUpdateListener(new b9(g9Var, f12, f10, z13));
                g9Var.M.addListener(new v8(g9Var, 1));
                g9Var.M.setDuration(250L);
                g9Var.M.setInterpolator(org.telegram.ui.ActionBar.o1.f21443w);
                g9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        g9Var.f26691c = g9Var.f26687a.getMeasuredHeight();
        g9Var.d = g9Var.f26687a.getMeasuredWidth();
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        g9 g9Var = this.f33173x0;
        if (g9Var.N <= 0.0f && !g9Var.U && i11 > 0 && g9Var.E > 0.0f) {
            g9Var.d0();
            g9Var.i0(Utilities.clamp(g9Var.E - (i11 / g9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        g9 g9Var = this.f33173x0;
        if (g9Var.N <= 0.0f && !g9Var.U && i13 != 0) {
            g9Var.d0();
            g9Var.i0(Utilities.clamp(g9Var.E - (i13 / g9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f33172w0.f3533a = i10;
        this.f33173x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        g9 g9Var = this.f33173x0;
        if (g9Var.N <= 0.0f && !g9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f33172w0.f3533a = 0;
        g9 g9Var = this.f33173x0;
        if (g9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        g9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        g9 g9Var = this.C0;
        if (!g9Var.K.b(motionEvent)) {
            if (!g9Var.U) {
                if (motionEvent.getAction() == 0) {
                    a9 a9Var = g9Var.f26689b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    a9Var.getHitRect(rect);
                    rect.offset(0, (int) g9Var.f26695r.getY());
                    if (g9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f33174y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f33174y0) || this.f33175z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f33174y0 = false;
                            this.f33175z0 = true;
                            this.A0 = g9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        g9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / g9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f33175z0) {
                        if (g9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g9Var.g0(z10, false, false);
                    }
                    this.f33174y0 = false;
                    this.f33175z0 = false;
                }
            }
            if (!this.f33175z0 && !super.onTouchEvent(motionEvent) && !this.f33174y0) {
                return false;
            }
        }
        return true;
    }
}
