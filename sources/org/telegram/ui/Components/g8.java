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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g8 extends vu0 {
    public final ac.g f26347f0;
    public final o8 f26348g0;
    public boolean f26349h0;
    public boolean f26350i0;
    public float f26351j0;
    public float f26352k0;
    public final o8 f26353l0;

    public g8(o8 o8Var, Context context) {
        super(context, null);
        this.f26353l0 = o8Var;
        this.f26348g0 = o8Var;
        this.f26347f0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        o8 o8Var = this.f26353l0;
        if (!o8Var.U) {
            if (!o8Var.h) {
                canvas.save();
                float x10 = o8Var.f29044a.getX() + o8Var.f29051r.getX();
                float y3 = o8Var.f29044a.getY() + o8Var.f29051r.getY();
                int i10 = o8Var.d - o8Var.f29048c;
                float T1 = org.telegram.messenger.i0.T1(y3, org.telegram.messenger.i0.f16166m + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - o8Var.f29048c) >> 1), o8Var.N);
                canvas.translate(x10, T1);
                o8Var.f29044a.draw(canvas);
                RectF rectF = org.telegram.messenger.i0.P;
                float f10 = i10 / 2.0f;
                rectF.set(x10, T1 - (o8Var.E * f10), o8Var.f29044a.getMeasuredWidth() + x10, (f10 * o8Var.E) + o8Var.f29044a.getMeasuredHeight() + T1);
                h8 h8Var = o8Var.f29044a;
                float f11 = x10 + h8Var.D;
                float f12 = T1 + h8Var.E;
                jc jcVar = o8Var.K;
                float f13 = h8Var.f28710y;
                jcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                jcVar.f27363i = false;
                jcVar.f27360c = 0;
                jcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = o8Var.f29044a.f28707s.f30530c;
            if (o8Var.e.getVisibility() == 0) {
                f7 = o8Var.e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                o8Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(o8Var.H.getX(), o8Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, o8Var.H.getMeasuredWidth(), o8Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                o8Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                o8Var.H.setVisibility(8);
            }
        }
        if (o8Var.f29049f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        o8 o8Var = this.f26353l0;
        Paint paint = o8Var.O;
        if (view != o8Var.H) {
            lVar = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
            if (view == lVar && o8Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                paint.setAlpha((int) (o8Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) o8Var.getParentLayout()).p(canvas2, (int) (o8Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f26347f0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26353l0.N == 0.0f) {
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
        org.telegram.ui.ActionBar.l lVar;
        Q();
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f31916f) {
            z10 = true;
        } else {
            z10 = false;
        }
        o8 o8Var = this.f26353l0;
        float f10 = 0.0f;
        if (z10 != o8Var.U) {
            o8Var.U = z10;
            org.telegram.messenger.i0.E2(o8Var.f29044a);
            org.telegram.messenger.i0.Y2(o8Var.getParentActivity(), o8Var.getClassGuid());
            if (o8Var.U) {
                o8Var.n0(false, 0.0f);
                o8Var.f29044a.setExpanded(false);
                addView(o8Var.f29044a, 0, w7.b6.c(-1.0f, -1));
            } else {
                o8Var.f29051r.addView(o8Var.f29044a, 0, w7.b6.c(-2.0f, -1));
            }
            org.telegram.messenger.i0.Z2(o8Var.getParentActivity(), o8Var.getClassGuid());
        }
        if (o8Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) o8Var.f29051r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.f29051r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) o8Var.f29044a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) o8Var.f29055y.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) o8Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) o8Var.f29051r.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) o8Var.f29051r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.f29044a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) o8Var.f29055y.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) o8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) o8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(18.0f);
        }
        boolean z12 = o8Var.L;
        if (this.f31916f >= org.telegram.messenger.i0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        o8Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (o8Var.L) {
                lVar = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
                i12 = org.telegram.messenger.i0.L(8.0f) + lVar.getMeasuredHeight() + (-o8Var.f29046b.getTop());
            } else {
                i12 = 0;
            }
            org.telegram.ui.s71 s71Var = o8Var.f29051r;
            s71Var.setTranslationY((s71Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) o8Var.f29051r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) o8Var.f29051r.getLayoutParams()).topMargin = i12;
            boolean z13 = o8Var.L;
            if (!o8Var.U) {
                float f11 = o8Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o8Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((o8Var.d - o8Var.f29048c) - org.telegram.messenger.i0.f16166m) * o8Var.E;
                if (z13) {
                    o8Var.f29044a.setExpanded(false);
                    f12 = o8Var.f29051r.getTranslationY();
                } else {
                    f10 = o8Var.f29051r.getTranslationY();
                }
                if (o8Var.F && !z13) {
                    o8Var.f29044a.setExpanded(true);
                } else {
                    o8Var.F = false;
                }
                o8Var.M.addUpdateListener(new j8(o8Var, f12, f10, z13));
                o8Var.M.addListener(new d8(o8Var, 1));
                o8Var.M.setDuration(250L);
                o8Var.M.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                o8Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        o8Var.f29048c = o8Var.f29044a.getMeasuredHeight();
        o8Var.d = o8Var.f29044a.getMeasuredWidth();
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
        o8 o8Var = this.f26348g0;
        if (o8Var.N <= 0.0f && !o8Var.U && i11 > 0 && o8Var.E > 0.0f) {
            o8Var.i0();
            o8Var.n0(true, Utilities.i(o8Var.E - (i11 / o8Var.d), 1.0f, 0.0f));
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o8 o8Var = this.f26348g0;
        if (o8Var.N <= 0.0f && !o8Var.U && i13 != 0) {
            o8Var.i0();
            o8Var.n0(true, Utilities.i(o8Var.E - (i13 / o8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f26347f0.f385a = i10;
        this.f26348g0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        o8 o8Var = this.f26348g0;
        if (o8Var.N <= 0.0f && !o8Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f26347f0.f385a = 0;
        o8 o8Var = this.f26348g0;
        if (o8Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        o8Var.l0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        o8 o8Var = this.f26353l0;
        if (!o8Var.K.b(motionEvent)) {
            if (!o8Var.U) {
                if (motionEvent.getAction() == 0) {
                    i8 i8Var = o8Var.f29046b;
                    Rect rect = org.telegram.messenger.i0.Q;
                    i8Var.getHitRect(rect);
                    rect.offset(0, (int) o8Var.f29051r.getY());
                    if (o8Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f26349h0 = true;
                        motionEvent.getX();
                        this.f26352k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f26349h0) || this.f26350i0)) {
                    if (z11) {
                        if (Math.abs(this.f26352k0 - motionEvent.getY()) > org.telegram.messenger.i0.e) {
                            this.f26349h0 = false;
                            this.f26350i0 = true;
                            this.f26351j0 = o8Var.E;
                            motionEvent.getX();
                            this.f26352k0 = motionEvent.getY();
                        }
                    } else {
                        o8Var.n0(true, Utilities.i(((-(this.f26352k0 - motionEvent.getY())) / o8Var.d) + this.f26351j0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f26350i0) {
                        if (o8Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o8Var.l0(z10, false, false);
                    }
                    this.f26349h0 = false;
                    this.f26350i0 = false;
                }
            }
            if (!this.f26350i0 && !super.onTouchEvent(motionEvent) && !this.f26349h0) {
                return false;
            }
        }
        return true;
    }
}
