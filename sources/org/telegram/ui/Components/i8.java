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
public final class i8 extends st0 {
    public final e2.r0 f35491g0;
    public final q8 f35492h0;
    public boolean f35493i0;
    public boolean f35494j0;
    public float f35495k0;
    public float f35496l0;
    public final q8 m0;

    public i8(q8 q8Var, Context context) {
        super(context, null);
        this.m0 = q8Var;
        this.f35492h0 = q8Var;
        this.f35491g0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        q8 q8Var = this.m0;
        if (!q8Var.V) {
            if (!q8Var.h) {
                canvas.save();
                float x10 = q8Var.f38562a.getX() + q8Var.f38571r.getX();
                float y10 = q8Var.f38562a.getY() + q8Var.f38571r.getY();
                int i7 = q8Var.d - q8Var.f38566c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.f23605m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - q8Var.f38566c) >> 1), q8Var.O);
                canvas.translate(x10, T1);
                q8Var.f38562a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = i7 / 2.0f;
                rectF.set(x10, T1 - (q8Var.F * f11), q8Var.f38562a.getMeasuredWidth() + x10, (f11 * q8Var.F) + q8Var.f38562a.getMeasuredHeight() + T1);
                j8 j8Var = q8Var.f38562a;
                float f12 = x10 + j8Var.E;
                float f13 = T1 + j8Var.F;
                kc kcVar = q8Var.L;
                float f14 = j8Var.f38246y;
                kcVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                kcVar.f36366i = false;
                kcVar.f36362c = 0;
                kcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = q8Var.f38562a.f38243s.f39900c;
            if (q8Var.f38568e.getVisibility() == 0) {
                f10 = q8Var.f38568e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                q8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(q8Var.I.getX(), q8Var.I.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, q8Var.I.getMeasuredWidth(), q8Var.I.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                q8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                q8Var.I.setVisibility(8);
            }
        }
        if (q8Var.f38569f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        q8 q8Var = this.m0;
        Paint paint = q8Var.P;
        if (view != q8Var.I) {
            kVar = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
            if (view == kVar && q8Var.O > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                paint.setAlpha((int) (q8Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) q8Var.getParentLayout()).p(canvas2, (int) (q8Var.O * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f35491g0.b();
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
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f39417f) {
            z10 = true;
        } else {
            z10 = false;
        }
        q8 q8Var = this.m0;
        float f11 = 0.0f;
        if (z10 != q8Var.V) {
            q8Var.V = z10;
            org.telegram.messenger.g0.E2(q8Var.f38562a);
            org.telegram.messenger.g0.Z2(q8Var.getParentActivity(), q8Var.getClassGuid());
            if (q8Var.V) {
                q8Var.n0(false, 0.0f);
                q8Var.f38562a.setExpanded(false);
                addView(q8Var.f38562a, 0, c8.ja.c(-1.0f, -1));
            } else {
                q8Var.f38571r.addView(q8Var.f38562a, 0, c8.ja.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(q8Var.getParentActivity(), q8Var.getClassGuid());
        }
        if (q8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) q8Var.f38571r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.f38571r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) q8Var.f38562a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) q8Var.f38575y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) q8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) q8Var.f38571r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) q8Var.f38571r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.f38562a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) q8Var.f38575y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) q8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) q8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z12 = q8Var.M;
        if (this.f39417f >= org.telegram.messenger.g0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        q8Var.M = z11;
        if (z12 != z11) {
            super.onMeasure(i7, i10);
            if (q8Var.M) {
                kVar = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + (-q8Var.f38564b.getTop());
            } else {
                i11 = 0;
            }
            org.telegram.ui.z51 z51Var = q8Var.f38571r;
            z51Var.setTranslationY((z51Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) q8Var.f38571r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) q8Var.f38571r.getLayoutParams()).topMargin = i11;
            boolean z13 = q8Var.M;
            if (!q8Var.V) {
                float f12 = q8Var.O;
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q8Var.N = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((q8Var.d - q8Var.f38566c) - org.telegram.messenger.g0.f23605m) * q8Var.F;
                if (z13) {
                    q8Var.f38562a.setExpanded(false);
                    f13 = q8Var.f38571r.getTranslationY();
                } else {
                    f11 = q8Var.f38571r.getTranslationY();
                }
                if (q8Var.G && !z13) {
                    q8Var.f38562a.setExpanded(true);
                } else {
                    q8Var.G = false;
                }
                q8Var.N.addUpdateListener(new l8(q8Var, f13, f11, z13));
                q8Var.N.addListener(new f8(q8Var, 1));
                q8Var.N.setDuration(250L);
                q8Var.N.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                q8Var.N.start();
            }
        }
        super.onMeasure(i7, i10);
        q8Var.f38566c = q8Var.f38562a.getMeasuredHeight();
        q8Var.d = q8Var.f38562a.getMeasuredWidth();
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
        q8 q8Var = this.f35492h0;
        if (q8Var.O <= 0.0f && !q8Var.V && i10 > 0 && q8Var.F > 0.0f) {
            q8Var.i0();
            q8Var.n0(true, Utilities.i(q8Var.F - (i10 / q8Var.d), 1.0f, 0.0f));
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        q8 q8Var = this.f35492h0;
        if (q8Var.O <= 0.0f && !q8Var.V && i12 != 0) {
            q8Var.i0();
            q8Var.n0(true, Utilities.i(q8Var.F - (i12 / q8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f35491g0.f10369a = i7;
        this.f35492h0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        q8 q8Var = this.f35492h0;
        if (q8Var.O <= 0.0f && !q8Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f35491g0.f10369a = 0;
        q8 q8Var = this.f35492h0;
        if (q8Var.F > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        q8Var.l0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        q8 q8Var = this.m0;
        if (!q8Var.L.b(motionEvent)) {
            if (!q8Var.V) {
                if (motionEvent.getAction() == 0) {
                    k8 k8Var = q8Var.f38564b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    k8Var.getHitRect(rect);
                    rect.offset(0, (int) q8Var.f38571r.getY());
                    if (q8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f35493i0 = true;
                        motionEvent.getX();
                        this.f35496l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f35493i0) || this.f35494j0)) {
                    if (z11) {
                        if (Math.abs(this.f35496l0 - motionEvent.getY()) > org.telegram.messenger.g0.f23590e) {
                            this.f35493i0 = false;
                            this.f35494j0 = true;
                            this.f35495k0 = q8Var.F;
                            motionEvent.getX();
                            this.f35496l0 = motionEvent.getY();
                        }
                    } else {
                        q8Var.n0(true, Utilities.i(((-(this.f35496l0 - motionEvent.getY())) / q8Var.d) + this.f35495k0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f35494j0) {
                        if (q8Var.F > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        q8Var.l0(z10, false, false);
                    }
                    this.f35493i0 = false;
                    this.f35494j0 = false;
                }
            }
            if (!this.f35494j0 && !super.onTouchEvent(motionEvent) && !this.f35493i0) {
                return false;
            }
        }
        return true;
    }
}
