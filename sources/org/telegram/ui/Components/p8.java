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
public final class p8 extends cu0 {
    public final e2.r0 f38415g0;
    public final x8 f38416h0;
    public boolean f38417i0;
    public boolean f38418j0;
    public float f38419k0;
    public float f38420l0;
    public final x8 m0;

    public p8(x8 x8Var, Context context) {
        super(context, null);
        this.m0 = x8Var;
        this.f38416h0 = x8Var;
        this.f38415g0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        x8 x8Var = this.m0;
        if (!x8Var.V) {
            if (!x8Var.h) {
                canvas.save();
                float x10 = x8Var.f41918a.getX() + x8Var.f41927r.getX();
                float y10 = x8Var.f41918a.getY() + x8Var.f41927r.getY();
                int i7 = x8Var.d - x8Var.f41922c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.f24220m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - x8Var.f41922c) >> 1), x8Var.O);
                canvas.translate(x10, T1);
                x8Var.f41918a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = i7 / 2.0f;
                rectF.set(x10, T1 - (x8Var.F * f11), x8Var.f41918a.getMeasuredWidth() + x10, (f11 * x8Var.F) + x8Var.f41918a.getMeasuredHeight() + T1);
                q8 q8Var = x8Var.f41918a;
                float f12 = x10 + q8Var.E;
                float f13 = T1 + q8Var.F;
                tc tcVar = x8Var.L;
                float f14 = q8Var.f41545y;
                tcVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                tcVar.f39899i = false;
                tcVar.f39895c = 0;
                tcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = x8Var.f41918a.f41542s.f33931c;
            if (x8Var.f41924e.getVisibility() == 0) {
                f10 = x8Var.f41924e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                x8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(x8Var.I.getX(), x8Var.I.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, x8Var.I.getMeasuredWidth(), x8Var.I.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                x8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                x8Var.I.setVisibility(8);
            }
        }
        if (x8Var.f41925f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        x8 x8Var = this.m0;
        Paint paint = x8Var.P;
        if (view != x8Var.I) {
            kVar = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
            if (view == kVar && x8Var.O > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
                paint.setAlpha((int) (x8Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) x8Var.getParentLayout()).p(canvas2, (int) (x8Var.O * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f38415g0.b();
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
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f34142f) {
            z10 = true;
        } else {
            z10 = false;
        }
        x8 x8Var = this.m0;
        float f11 = 0.0f;
        if (z10 != x8Var.V) {
            x8Var.V = z10;
            org.telegram.messenger.g0.E2(x8Var.f41918a);
            org.telegram.messenger.g0.Y2(x8Var.getParentActivity(), x8Var.getClassGuid());
            if (x8Var.V) {
                x8Var.n0(false, 0.0f);
                x8Var.f41918a.setExpanded(false);
                addView(x8Var.f41918a, 0, c8.na.c(-1.0f, -1));
            } else {
                x8Var.f41927r.addView(x8Var.f41918a, 0, c8.na.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.Z2(x8Var.getParentActivity(), x8Var.getClassGuid());
        }
        if (x8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) x8Var.f41927r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.f41927r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) x8Var.f41918a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) x8Var.f41931y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) x8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) x8Var.f41927r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.f41927r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.f41918a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) x8Var.f41931y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) x8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z12 = x8Var.M;
        if (this.f34142f >= org.telegram.messenger.g0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        x8Var.M = z11;
        if (z12 != z11) {
            super.onMeasure(i7, i10);
            if (x8Var.M) {
                kVar = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + (-x8Var.f41920b.getTop());
            } else {
                i11 = 0;
            }
            org.telegram.ui.b61 b61Var = x8Var.f41927r;
            b61Var.setTranslationY((b61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) x8Var.f41927r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) x8Var.f41927r.getLayoutParams()).topMargin = i11;
            boolean z13 = x8Var.M;
            if (!x8Var.V) {
                float f12 = x8Var.O;
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x8Var.N = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((x8Var.d - x8Var.f41922c) - org.telegram.messenger.g0.f24220m) * x8Var.F;
                if (z13) {
                    x8Var.f41918a.setExpanded(false);
                    f13 = x8Var.f41927r.getTranslationY();
                } else {
                    f11 = x8Var.f41927r.getTranslationY();
                }
                if (x8Var.G && !z13) {
                    x8Var.f41918a.setExpanded(true);
                } else {
                    x8Var.G = false;
                }
                x8Var.N.addUpdateListener(new s8(x8Var, f13, f11, z13));
                x8Var.N.addListener(new m8(x8Var, 1));
                x8Var.N.setDuration(250L);
                x8Var.N.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                x8Var.N.start();
            }
        }
        super.onMeasure(i7, i10);
        x8Var.f41922c = x8Var.f41918a.getMeasuredHeight();
        x8Var.d = x8Var.f41918a.getMeasuredWidth();
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
        x8 x8Var = this.f38416h0;
        if (x8Var.O <= 0.0f && !x8Var.V && i10 > 0 && x8Var.F > 0.0f) {
            x8Var.i0();
            x8Var.n0(true, Utilities.i(x8Var.F - (i10 / x8Var.d), 1.0f, 0.0f));
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        x8 x8Var = this.f38416h0;
        if (x8Var.O <= 0.0f && !x8Var.V && i12 != 0) {
            x8Var.i0();
            x8Var.n0(true, Utilities.i(x8Var.F - (i12 / x8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f38415g0.f10677a = i7;
        this.f38416h0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        x8 x8Var = this.f38416h0;
        if (x8Var.O <= 0.0f && !x8Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f38415g0.f10677a = 0;
        x8 x8Var = this.f38416h0;
        if (x8Var.F > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        x8Var.l0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        x8 x8Var = this.m0;
        if (!x8Var.L.b(motionEvent)) {
            if (!x8Var.V) {
                if (motionEvent.getAction() == 0) {
                    r8 r8Var = x8Var.f41920b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    r8Var.getHitRect(rect);
                    rect.offset(0, (int) x8Var.f41927r.getY());
                    if (x8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f38417i0 = true;
                        motionEvent.getX();
                        this.f38420l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f38417i0) || this.f38418j0)) {
                    if (z11) {
                        if (Math.abs(this.f38420l0 - motionEvent.getY()) > org.telegram.messenger.g0.f24205e) {
                            this.f38417i0 = false;
                            this.f38418j0 = true;
                            this.f38419k0 = x8Var.F;
                            motionEvent.getX();
                            this.f38420l0 = motionEvent.getY();
                        }
                    } else {
                        x8Var.n0(true, Utilities.i(((-(this.f38420l0 - motionEvent.getY())) / x8Var.d) + this.f38419k0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f38418j0) {
                        if (x8Var.F > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x8Var.l0(z10, false, false);
                    }
                    this.f38417i0 = false;
                    this.f38418j0 = false;
                }
            }
            if (!this.f38418j0 && !super.onTouchEvent(motionEvent) && !this.f38417i0) {
                return false;
            }
        }
        return true;
    }
}
