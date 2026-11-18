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
public final class q8 extends au0 {
    public final e2.r0 f38728g0;
    public final y8 f38729h0;
    public boolean f38730i0;
    public boolean f38731j0;
    public float f38732k0;
    public float f38733l0;
    public final y8 m0;

    public q8(y8 y8Var, Context context) {
        super(context, null);
        this.m0 = y8Var;
        this.f38729h0 = y8Var;
        this.f38728g0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        y8 y8Var = this.m0;
        if (!y8Var.V) {
            if (!y8Var.h) {
                canvas.save();
                float x10 = y8Var.f42394a.getX() + y8Var.f42403r.getX();
                float y10 = y8Var.f42394a.getY() + y8Var.f42403r.getY();
                int i7 = y8Var.d - y8Var.f42398c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.f24115m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - y8Var.f42398c) >> 1), y8Var.O);
                canvas.translate(x10, T1);
                y8Var.f42394a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = i7 / 2.0f;
                rectF.set(x10, T1 - (y8Var.F * f11), y8Var.f42394a.getMeasuredWidth() + x10, (f11 * y8Var.F) + y8Var.f42394a.getMeasuredHeight() + T1);
                r8 r8Var = y8Var.f42394a;
                float f12 = x10 + r8Var.E;
                float f13 = T1 + r8Var.F;
                tc tcVar = y8Var.L;
                float f14 = r8Var.f41947y;
                tcVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                tcVar.f39973i = false;
                tcVar.f39969c = 0;
                tcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = y8Var.f42394a.f41944s.f33892c;
            if (y8Var.f42400e.getVisibility() == 0) {
                f10 = y8Var.f42400e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                y8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(y8Var.I.getX(), y8Var.I.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, y8Var.I.getMeasuredWidth(), y8Var.I.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                y8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                y8Var.I.setVisibility(8);
            }
        }
        if (y8Var.f42401f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        y8 y8Var = this.m0;
        Paint paint = y8Var.P;
        if (view != y8Var.I) {
            kVar = ((org.telegram.ui.ActionBar.h2) y8Var).actionBar;
            if (view == kVar && y8Var.O > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
                paint.setAlpha((int) (y8Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) y8Var.getParentLayout()).p(canvas2, (int) (y8Var.O * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f38728g0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m0.O == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        Q();
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f33463f) {
            z10 = true;
        } else {
            z10 = false;
        }
        y8 y8Var = this.m0;
        float f11 = 0.0f;
        if (z10 != y8Var.V) {
            y8Var.V = z10;
            org.telegram.messenger.g0.E2(y8Var.f42394a);
            org.telegram.messenger.g0.Y2(y8Var.getParentActivity(), y8Var.getClassGuid());
            if (y8Var.V) {
                y8Var.n0(false, 0.0f);
                y8Var.f42394a.setExpanded(false);
                addView(y8Var.f42394a, 0, c8.ma.c(-1.0f, -1));
            } else {
                y8Var.f42403r.addView(y8Var.f42394a, 0, c8.ma.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.Z2(y8Var.getParentActivity(), y8Var.getClassGuid());
        }
        if (y8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) y8Var.f42403r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.f42403r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) y8Var.f42394a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) y8Var.f42407y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) y8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) y8Var.f42403r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.f42403r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.f42394a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.f42407y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z12 = y8Var.M;
        if (this.f33463f >= org.telegram.messenger.g0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        y8Var.M = z11;
        if (z12 != z11) {
            super.onMeasure(i7, i10);
            if (y8Var.M) {
                kVar = ((org.telegram.ui.ActionBar.h2) y8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + (-y8Var.f42396b.getTop());
            } else {
                i11 = 0;
            }
            org.telegram.ui.d61 d61Var = y8Var.f42403r;
            d61Var.setTranslationY((d61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) y8Var.f42403r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) y8Var.f42403r.getLayoutParams()).topMargin = i11;
            boolean z13 = y8Var.M;
            if (!y8Var.V) {
                float f12 = y8Var.O;
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y8Var.N = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((y8Var.d - y8Var.f42398c) - org.telegram.messenger.g0.f24115m) * y8Var.F;
                if (z13) {
                    y8Var.f42394a.setExpanded(false);
                    f13 = y8Var.f42403r.getTranslationY();
                } else {
                    f11 = y8Var.f42403r.getTranslationY();
                }
                if (y8Var.G && !z13) {
                    y8Var.f42394a.setExpanded(true);
                } else {
                    y8Var.G = false;
                }
                y8Var.N.addUpdateListener(new t8(y8Var, f13, f11, z13));
                y8Var.N.addListener(new n8(y8Var, 1));
                y8Var.N.setDuration(250L);
                y8Var.N.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                y8Var.N.start();
            }
        }
        super.onMeasure(i7, i10);
        y8Var.f42398c = y8Var.f42394a.getMeasuredHeight();
        y8Var.d = y8Var.f42394a.getMeasuredWidth();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        y8 y8Var = this.f38729h0;
        if (y8Var.O <= 0.0f && !y8Var.V && i10 > 0 && y8Var.F > 0.0f) {
            y8Var.i0();
            y8Var.n0(true, Utilities.i(y8Var.F - (i10 / y8Var.d), 1.0f, 0.0f));
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        y8 y8Var = this.f38729h0;
        if (y8Var.O <= 0.0f && !y8Var.V && i12 != 0) {
            y8Var.i0();
            y8Var.n0(true, Utilities.i(y8Var.F - (i12 / y8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f38728g0.f10687a = i7;
        this.f38729h0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        y8 y8Var = this.f38729h0;
        if (y8Var.O <= 0.0f && !y8Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f38728g0.f10687a = 0;
        y8 y8Var = this.f38729h0;
        if (y8Var.F > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        y8Var.l0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        y8 y8Var = this.m0;
        if (!y8Var.L.b(motionEvent)) {
            if (!y8Var.V) {
                if (motionEvent.getAction() == 0) {
                    s8 s8Var = y8Var.f42396b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    s8Var.getHitRect(rect);
                    rect.offset(0, (int) y8Var.f42403r.getY());
                    if (y8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f38730i0 = true;
                        motionEvent.getX();
                        this.f38733l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f38730i0) || this.f38731j0)) {
                    if (z11) {
                        if (Math.abs(this.f38733l0 - motionEvent.getY()) > org.telegram.messenger.g0.f24100e) {
                            this.f38730i0 = false;
                            this.f38731j0 = true;
                            this.f38732k0 = y8Var.F;
                            motionEvent.getX();
                            this.f38733l0 = motionEvent.getY();
                        }
                    } else {
                        y8Var.n0(true, Utilities.i(((-(this.f38733l0 - motionEvent.getY())) / y8Var.d) + this.f38732k0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f38731j0) {
                        if (y8Var.F > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        y8Var.l0(z10, false, false);
                    }
                    this.f38730i0 = false;
                    this.f38731j0 = false;
                }
            }
            if (!this.f38731j0 && !super.onTouchEvent(motionEvent) && !this.f38730i0) {
                return false;
            }
        }
        return true;
    }
}
