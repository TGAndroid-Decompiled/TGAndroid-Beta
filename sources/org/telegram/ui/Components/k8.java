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
public final class k8 extends st0 {
    public final e2.r0 f35239f0;
    public final s8 f35240g0;
    public boolean f35241h0;
    public boolean f35242i0;
    public float f35243j0;
    public float f35244k0;
    public final s8 f35245l0;

    public k8(s8 s8Var, Context context) {
        super(context, null);
        this.f35245l0 = s8Var;
        this.f35240g0 = s8Var;
        this.f35239f0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        s8 s8Var = this.f35245l0;
        if (!s8Var.U) {
            if (!s8Var.h) {
                canvas.save();
                float x10 = s8Var.f37887a.getX() + s8Var.f37895r.getX();
                float y10 = s8Var.f37887a.getY() + s8Var.f37895r.getY();
                int i7 = s8Var.d - s8Var.f37891c;
                float T1 = org.telegram.messenger.g0.T1(y10, org.telegram.messenger.g0.f22561m + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - s8Var.f37891c) >> 1), s8Var.N);
                canvas.translate(x10, T1);
                s8Var.f37887a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = i7 / 2.0f;
                rectF.set(x10, T1 - (s8Var.E * f11), s8Var.f37887a.getMeasuredWidth() + x10, (f11 * s8Var.E) + s8Var.f37887a.getMeasuredHeight() + T1);
                l8 l8Var = s8Var.f37887a;
                float f12 = x10 + l8Var.D;
                float f13 = T1 + l8Var.E;
                oc ocVar = s8Var.K;
                float f14 = l8Var.f37566y;
                ocVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                ocVar.f36573i = false;
                ocVar.f36569c = 0;
                ocVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = s8Var.f37887a.f37563s.f38854c;
            if (s8Var.f37892e.getVisibility() == 0) {
                f10 = s8Var.f37892e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                s8Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(s8Var.H.getX(), s8Var.H.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, s8Var.H.getMeasuredWidth(), s8Var.H.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                s8Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                s8Var.H.setVisibility(8);
            }
        }
        if (s8Var.f37893f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        s8 s8Var = this.f35245l0;
        Paint paint = s8Var.O;
        if (view != s8Var.H) {
            lVar = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
            if (view == lVar && s8Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
                paint.setAlpha((int) (s8Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) s8Var.getParentLayout()).p(canvas2, (int) (s8Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f35239f0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f35245l0.N == 0.0f) {
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
        org.telegram.ui.ActionBar.l lVar;
        Q();
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10) + this.f38069f) {
            z9 = true;
        } else {
            z9 = false;
        }
        s8 s8Var = this.f35245l0;
        float f11 = 0.0f;
        if (z9 != s8Var.U) {
            s8Var.U = z9;
            org.telegram.messenger.g0.E2(s8Var.f37887a);
            org.telegram.messenger.g0.Z2(s8Var.getParentActivity(), s8Var.getClassGuid());
            if (s8Var.U) {
                s8Var.n0(false, 0.0f);
                s8Var.f37887a.setExpanded(false);
                addView(s8Var.f37887a, 0, c8.ha.c(-1.0f, -1));
            } else {
                s8Var.f37895r.addView(s8Var.f37887a, 0, c8.ha.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(s8Var.getParentActivity(), s8Var.getClassGuid());
        }
        if (s8Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i7) * 0.55f);
            ((ViewGroup.MarginLayoutParams) s8Var.f37895r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.f37895r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i7) * 0.45f);
            ((ViewGroup.MarginLayoutParams) s8Var.f37887a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) s8Var.f37899y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) s8Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) s8Var.f37895r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) s8Var.f37895r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.f37887a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) s8Var.f37899y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) s8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) s8Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z11 = s8Var.L;
        if (this.f38069f >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        s8Var.L = z10;
        if (z11 != z10) {
            super.onMeasure(i7, i10);
            if (s8Var.L) {
                lVar = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + lVar.getMeasuredHeight() + (-s8Var.f37889b.getTop());
            } else {
                i11 = 0;
            }
            org.telegram.ui.e61 e61Var = s8Var.f37895r;
            e61Var.setTranslationY((e61Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) s8Var.f37895r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) s8Var.f37895r.getLayoutParams()).topMargin = i11;
            boolean z12 = s8Var.L;
            if (!s8Var.U) {
                float f12 = s8Var.N;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                s8Var.M = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((s8Var.d - s8Var.f37891c) - org.telegram.messenger.g0.f22561m) * s8Var.E;
                if (z12) {
                    s8Var.f37887a.setExpanded(false);
                    f13 = s8Var.f37895r.getTranslationY();
                } else {
                    f11 = s8Var.f37895r.getTranslationY();
                }
                if (s8Var.F && !z12) {
                    s8Var.f37887a.setExpanded(true);
                } else {
                    s8Var.F = false;
                }
                s8Var.M.addUpdateListener(new n8(s8Var, f13, f11, z12));
                s8Var.M.addListener(new h8(s8Var, 1));
                s8Var.M.setDuration(250L);
                s8Var.M.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                s8Var.M.start();
            }
        }
        super.onMeasure(i7, i10);
        s8Var.f37891c = s8Var.f37887a.getMeasuredHeight();
        s8Var.d = s8Var.f37887a.getMeasuredWidth();
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
        s8 s8Var = this.f35240g0;
        if (s8Var.N <= 0.0f && !s8Var.U && i10 > 0 && s8Var.E > 0.0f) {
            s8Var.i0();
            s8Var.n0(true, Utilities.i(s8Var.E - (i10 / s8Var.d), 1.0f, 0.0f));
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        s8 s8Var = this.f35240g0;
        if (s8Var.N <= 0.0f && !s8Var.U && i12 != 0) {
            s8Var.i0();
            s8Var.n0(true, Utilities.i(s8Var.E - (i12 / s8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f35239f0.f10538a = i7;
        this.f35240g0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        s8 s8Var = this.f35240g0;
        if (s8Var.N <= 0.0f && !s8Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z9;
        this.f35239f0.f10538a = 0;
        s8 s8Var = this.f35240g0;
        if (s8Var.E > 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        s8Var.l0(z9, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        s8 s8Var = this.f35245l0;
        if (!s8Var.K.b(motionEvent)) {
            if (!s8Var.U) {
                if (motionEvent.getAction() == 0) {
                    m8 m8Var = s8Var.f37889b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    m8Var.getHitRect(rect);
                    rect.offset(0, (int) s8Var.f37895r.getY());
                    if (s8Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f35241h0 = true;
                        motionEvent.getX();
                        this.f35244k0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.f35241h0) || this.f35242i0)) {
                    if (z10) {
                        if (Math.abs(this.f35244k0 - motionEvent.getY()) > org.telegram.messenger.g0.f22546e) {
                            this.f35241h0 = false;
                            this.f35242i0 = true;
                            this.f35243j0 = s8Var.E;
                            motionEvent.getX();
                            this.f35244k0 = motionEvent.getY();
                        }
                    } else {
                        s8Var.n0(true, Utilities.i(((-(this.f35244k0 - motionEvent.getY())) / s8Var.d) + this.f35243j0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f35242i0) {
                        if (s8Var.E > 0.5f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        s8Var.l0(z9, false, false);
                    }
                    this.f35241h0 = false;
                    this.f35242i0 = false;
                }
            }
            if (!this.f35242i0 && !super.onTouchEvent(motionEvent) && !this.f35241h0) {
                return false;
            }
        }
        return true;
    }
}
