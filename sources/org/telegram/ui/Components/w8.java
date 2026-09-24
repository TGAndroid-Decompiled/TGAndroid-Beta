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
import org.telegram.ui.ub1;
public final class w8 extends aw0 {
    public float A0;
    public float B0;
    public final e9 C0;
    public final b2.q0 f29903w0;
    public final e9 f29904x0;
    public boolean f29905y0;
    public boolean f29906z0;

    public w8(e9 e9Var, Context context) {
        super(context, null);
        this.C0 = e9Var;
        this.f29904x0 = e9Var;
        this.f29903w0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        e9 e9Var = this.C0;
        if (!e9Var.U) {
            if (!e9Var.h) {
                canvas.save();
                float x10 = e9Var.f23851a.getX() + e9Var.f23858r.getX();
                float y3 = e9Var.f23851a.getY() + e9Var.f23858r.getY();
                int i10 = e9Var.d - e9Var.f23855c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - e9Var.f23855c) >> 1), e9Var.N);
                canvas.translate(x10, lerp);
                e9Var.f23851a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (e9Var.E * f10), e9Var.f23851a.getMeasuredWidth() + x10, (f10 * e9Var.E) + e9Var.f23851a.getMeasuredHeight() + lerp);
                x8 x8Var = e9Var.f23851a;
                float f11 = x10 + x8Var.f23535y;
                float f12 = lerp + x8Var.E;
                gd gdVar = e9Var.K;
                float f13 = x8Var.f23534x;
                gdVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                gdVar.f24423i = false;
                gdVar.f24420c = 0;
                gdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = e9Var.f23851a.f23532s.f23817c;
            if (e9Var.e.getVisibility() == 0) {
                f7 = e9Var.e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                e9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(e9Var.H.getX(), e9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, e9Var.H.getMeasuredWidth(), e9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                e9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                e9Var.H.setVisibility(8);
            }
        }
        if (e9Var.f23856f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        e9 e9Var = this.C0;
        Paint paint = e9Var.O;
        if (view != e9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.m2) e9Var).actionBar;
            if (view == kVar && e9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                paint.setAlpha((int) (e9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) e9Var.getParentLayout()).p(canvas2, (int) (e9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        b2.q0 q0Var = this.f29903w0;
        return q0Var.f3196b | q0Var.f3195a;
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
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f22786f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e9 e9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != e9Var.U) {
            e9Var.U = z10;
            AndroidUtilities.removeFromParent(e9Var.f23851a);
            AndroidUtilities.requestAdjustNothing(e9Var.getParentActivity(), e9Var.getClassGuid());
            if (e9Var.U) {
                e9Var.i0(0.0f, false);
                e9Var.f23851a.setExpanded(false);
                addView(e9Var.f23851a, 0, w7.y5.c(-1.0f, -1));
            } else {
                e9Var.f23858r.addView(e9Var.f23851a, 0, w7.y5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(e9Var.getParentActivity(), e9Var.getClassGuid());
        }
        if (e9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) e9Var.f23858r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.f23858r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) e9Var.f23851a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) e9Var.f23861x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) e9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) e9Var.f23858r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) e9Var.f23858r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.f23851a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) e9Var.f23861x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) e9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) e9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = e9Var.L;
        if (this.f22786f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        e9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (e9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.m2) e9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-e9Var.f23853b.getTop());
            } else {
                i12 = 0;
            }
            ub1 ub1Var = e9Var.f23858r;
            ub1Var.setTranslationY((ub1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) e9Var.f23858r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) e9Var.f23858r.getLayoutParams()).topMargin = i12;
            boolean z13 = e9Var.L;
            if (!e9Var.U) {
                float f11 = e9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((e9Var.d - e9Var.f23855c) - AndroidUtilities.statusBarHeight) * e9Var.E;
                if (z13) {
                    e9Var.f23851a.setExpanded(false);
                    f12 = e9Var.f23858r.getTranslationY();
                } else {
                    f10 = e9Var.f23858r.getTranslationY();
                }
                if (e9Var.F && !z13) {
                    e9Var.f23851a.setExpanded(true);
                } else {
                    e9Var.F = false;
                }
                e9Var.M.addUpdateListener(new z8(e9Var, f12, f10, z13));
                e9Var.M.addListener(new t8(e9Var, 1));
                e9Var.M.setDuration(250L);
                e9Var.M.setInterpolator(org.telegram.ui.ActionBar.o1.f19654w);
                e9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        e9Var.f23855c = e9Var.f23851a.getMeasuredHeight();
        e9Var.d = e9Var.f23851a.getMeasuredWidth();
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
        e9 e9Var = this.f29904x0;
        if (e9Var.N <= 0.0f && !e9Var.U && i11 > 0 && e9Var.E > 0.0f) {
            e9Var.d0();
            e9Var.i0(Utilities.clamp(e9Var.E - (i11 / e9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e9 e9Var = this.f29904x0;
        if (e9Var.N <= 0.0f && !e9Var.U && i13 != 0) {
            e9Var.d0();
            e9Var.i0(Utilities.clamp(e9Var.E - (i13 / e9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f29903w0.f3195a = i10;
        this.f29904x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        e9 e9Var = this.f29904x0;
        if (e9Var.N <= 0.0f && !e9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f29903w0.f3195a = 0;
        e9 e9Var = this.f29904x0;
        if (e9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        e9 e9Var = this.C0;
        if (!e9Var.K.b(motionEvent)) {
            if (!e9Var.U) {
                if (motionEvent.getAction() == 0) {
                    y8 y8Var = e9Var.f23853b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    y8Var.getHitRect(rect);
                    rect.offset(0, (int) e9Var.f23858r.getY());
                    if (e9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f29905y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f29905y0) || this.f29906z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f29905y0 = false;
                            this.f29906z0 = true;
                            this.A0 = e9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        e9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / e9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f29906z0) {
                        if (e9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e9Var.g0(z10, false, false);
                    }
                    this.f29905y0 = false;
                    this.f29906z0 = false;
                }
            }
            if (!this.f29906z0 && !super.onTouchEvent(motionEvent) && !this.f29905y0) {
                return false;
            }
        }
        return true;
    }
}
