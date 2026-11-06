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
public final class l8 extends rt0 {
    public final e2.r0 f35554f0;
    public final t8 f35555g0;
    public boolean f35556h0;
    public boolean f35557i0;
    public float f35558j0;
    public float f35559k0;
    public final t8 f35560l0;

    public l8(t8 t8Var, Context context) {
        super(context, null);
        this.f35560l0 = t8Var;
        this.f35555g0 = t8Var;
        this.f35554f0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        t8 t8Var = this.f35560l0;
        if (!t8Var.U) {
            if (!t8Var.h) {
                canvas.save();
                float x10 = t8Var.f38275a.getX() + t8Var.f38283r.getX();
                float y10 = t8Var.f38275a.getY() + t8Var.f38283r.getY();
                int i7 = t8Var.d - t8Var.f38279c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.f22531m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - t8Var.f38279c) >> 1), t8Var.N);
                canvas.translate(x10, T1);
                t8Var.f38275a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = i7 / 2.0f;
                rectF.set(x10, T1 - (t8Var.E * f11), t8Var.f38275a.getMeasuredWidth() + x10, (f11 * t8Var.E) + t8Var.f38275a.getMeasuredHeight() + T1);
                m8 m8Var = t8Var.f38275a;
                float f12 = x10 + m8Var.D;
                float f13 = T1 + m8Var.E;
                pc pcVar = t8Var.K;
                float f14 = m8Var.f37936y;
                pcVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                pcVar.f36845i = false;
                pcVar.f36841c = 0;
                pcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = t8Var.f38275a.f37933s.f39857c;
            if (t8Var.f38280e.getVisibility() == 0) {
                f10 = t8Var.f38280e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                t8Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(t8Var.H.getX(), t8Var.H.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, t8Var.H.getMeasuredWidth(), t8Var.H.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                t8Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                t8Var.H.setVisibility(8);
            }
        }
        if (t8Var.f38281f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        t8 t8Var = this.f35560l0;
        Paint paint = t8Var.O;
        if (view != t8Var.H) {
            kVar = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
            if (view == kVar && t8Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
                paint.setAlpha((int) (t8Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) t8Var.getParentLayout()).p(canvas2, (int) (t8Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f35554f0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f35560l0.N == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        boolean z10;
        int i11;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        Q();
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f37788f) {
            z9 = true;
        } else {
            z9 = false;
        }
        t8 t8Var = this.f35560l0;
        float f11 = 0.0f;
        if (z9 != t8Var.U) {
            t8Var.U = z9;
            org.telegram.messenger.g0.E2(t8Var.f38275a);
            org.telegram.messenger.g0.Z2(t8Var.getParentActivity(), t8Var.getClassGuid());
            if (t8Var.U) {
                t8Var.n0(false, 0.0f);
                t8Var.f38275a.setExpanded(false);
                addView(t8Var.f38275a, 0, c8.ha.c(-1.0f, -1));
            } else {
                t8Var.f38283r.addView(t8Var.f38275a, 0, c8.ha.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(t8Var.getParentActivity(), t8Var.getClassGuid());
        }
        if (t8Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) t8Var.f38283r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.f38283r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) t8Var.f38275a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) t8Var.f38287y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) t8Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) t8Var.f38283r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) t8Var.f38283r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.f38275a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) t8Var.f38287y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) t8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) t8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z11 = t8Var.L;
        if (this.f37788f >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        t8Var.L = z10;
        if (z11 != z10) {
            super.onMeasure(i7, i10);
            if (t8Var.L) {
                kVar = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + (-t8Var.f38277b.getTop());
            } else {
                i11 = 0;
            }
            org.telegram.ui.c61 c61Var = t8Var.f38283r;
            c61Var.setTranslationY((c61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) t8Var.f38283r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) t8Var.f38283r.getLayoutParams()).topMargin = i11;
            boolean z12 = t8Var.L;
            if (!t8Var.U) {
                float f12 = t8Var.N;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t8Var.M = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((t8Var.d - t8Var.f38279c) - org.telegram.messenger.g0.f22531m) * t8Var.E;
                if (z12) {
                    t8Var.f38275a.setExpanded(false);
                    f13 = t8Var.f38283r.getTranslationY();
                } else {
                    f11 = t8Var.f38283r.getTranslationY();
                }
                if (t8Var.F && !z12) {
                    t8Var.f38275a.setExpanded(true);
                } else {
                    t8Var.F = false;
                }
                t8Var.M.addUpdateListener(new o8(t8Var, f13, f11, z12));
                t8Var.M.addListener(new i8(t8Var, 1));
                t8Var.M.setDuration(250L);
                t8Var.M.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                t8Var.M.start();
            }
        }
        super.onMeasure(i7, i10);
        t8Var.f38279c = t8Var.f38275a.getMeasuredHeight();
        t8Var.d = t8Var.f38275a.getMeasuredWidth();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        t8 t8Var = this.f35555g0;
        if (t8Var.N <= 0.0f && !t8Var.U && i10 > 0 && t8Var.E > 0.0f) {
            t8Var.i0();
            t8Var.n0(true, Utilities.i(t8Var.E - (i10 / t8Var.d), 1.0f, 0.0f));
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        t8 t8Var = this.f35555g0;
        if (t8Var.N <= 0.0f && !t8Var.U && i12 != 0) {
            t8Var.i0();
            t8Var.n0(true, Utilities.i(t8Var.E - (i12 / t8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f35554f0.f10533a = i7;
        this.f35555g0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        t8 t8Var = this.f35555g0;
        if (t8Var.N <= 0.0f && !t8Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z9;
        this.f35554f0.f10533a = 0;
        t8 t8Var = this.f35555g0;
        if (t8Var.E > 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        t8Var.l0(z9, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        t8 t8Var = this.f35560l0;
        if (!t8Var.K.b(motionEvent)) {
            if (!t8Var.U) {
                if (motionEvent.getAction() == 0) {
                    n8 n8Var = t8Var.f38277b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    n8Var.getHitRect(rect);
                    rect.offset(0, (int) t8Var.f38283r.getY());
                    if (t8Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f35556h0 = true;
                        motionEvent.getX();
                        this.f35559k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.f35556h0) || this.f35557i0)) {
                    if (z10) {
                        if (Math.abs(this.f35559k0 - motionEvent.getY()) > org.telegram.messenger.g0.f22516e) {
                            this.f35556h0 = false;
                            this.f35557i0 = true;
                            this.f35558j0 = t8Var.E;
                            motionEvent.getX();
                            this.f35559k0 = motionEvent.getY();
                        }
                    } else {
                        t8Var.n0(true, Utilities.i(((-(this.f35559k0 - motionEvent.getY())) / t8Var.d) + this.f35558j0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f35557i0) {
                        if (t8Var.E > 0.5f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        t8Var.l0(z9, false, false);
                    }
                    this.f35556h0 = false;
                    this.f35557i0 = false;
                }
            }
            if (!this.f35557i0 && !super.onTouchEvent(motionEvent) && !this.f35556h0) {
                return false;
            }
        }
        return true;
    }
}
