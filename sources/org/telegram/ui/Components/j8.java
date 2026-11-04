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
public final class j8 extends qt0 {
    public final d2.t0 f34991g0;
    public final r8 f34992h0;
    public boolean f34993i0;
    public boolean f34994j0;
    public float f34995k0;
    public float f34996l0;
    public final r8 m0;

    public j8(r8 r8Var, Context context) {
        super(context, null);
        this.m0 = r8Var;
        this.f34992h0 = r8Var;
        this.f34991g0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        r8 r8Var = this.m0;
        if (!r8Var.V) {
            if (!r8Var.h) {
                canvas.save();
                float x10 = r8Var.f37667a.getX() + r8Var.f37676r.getX();
                float y9 = r8Var.f37667a.getY() + r8Var.f37676r.getY();
                int i3 = r8Var.d - r8Var.f37671c;
                float T1 = org.telegram.messenger.g0.T1(y9, org.telegram.messenger.g0.f22602m + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r8Var.f37671c) >> 1), r8Var.O);
                canvas.translate(x10, T1);
                r8Var.f37667a.draw(canvas);
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = i3 / 2.0f;
                rectF.set(x10, T1 - (r8Var.F * f11), r8Var.f37667a.getMeasuredWidth() + x10, (f11 * r8Var.F) + r8Var.f37667a.getMeasuredHeight() + T1);
                k8 k8Var = r8Var.f37667a;
                float f12 = x10 + k8Var.E;
                float f13 = T1 + k8Var.F;
                nc ncVar = r8Var.L;
                float f14 = k8Var.f37379y;
                ncVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                ncVar.f36439i = false;
                ncVar.f36435c = 0;
                ncVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = r8Var.f37667a.f37376s.f38645c;
            if (r8Var.f37673e.getVisibility() == 0) {
                f10 = r8Var.f37673e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                r8Var.I.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(r8Var.I.getX(), r8Var.I.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r8Var.I.getMeasuredWidth(), r8Var.I.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                r8Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                r8Var.I.setVisibility(8);
            }
        }
        if (r8Var.f37674f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        r8 r8Var = this.m0;
        Paint paint = r8Var.P;
        if (view != r8Var.I) {
            kVar = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
            if (view == kVar && r8Var.O > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                paint.setAlpha((int) (r8Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) r8Var.getParentLayout()).p(canvas2, (int) (r8Var.O * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f34991g0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m0.O == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        Q();
        if (View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10) + this.f37535f) {
            z10 = true;
        } else {
            z10 = false;
        }
        r8 r8Var = this.m0;
        float f11 = 0.0f;
        if (z10 != r8Var.V) {
            r8Var.V = z10;
            org.telegram.messenger.g0.E2(r8Var.f37667a);
            org.telegram.messenger.g0.Z2(r8Var.getParentActivity(), r8Var.getClassGuid());
            if (r8Var.V) {
                r8Var.n0(false, 0.0f);
                r8Var.f37667a.setExpanded(false);
                addView(r8Var.f37667a, 0, b8.mf.c(-1.0f, -1));
            } else {
                r8Var.f37676r.addView(r8Var.f37667a, 0, b8.mf.c(-2.0f, -1));
            }
            org.telegram.messenger.g0.a3(r8Var.getParentActivity(), r8Var.getClassGuid());
        }
        if (r8Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i3) * 0.55f);
            ((ViewGroup.MarginLayoutParams) r8Var.f37676r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.f37676r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i3) * 0.45f);
            ((ViewGroup.MarginLayoutParams) r8Var.f37667a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) r8Var.f37680y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) r8Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) r8Var.f37676r.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) r8Var.f37676r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.f37667a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) r8Var.f37680y.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) r8Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            ((ViewGroup.MarginLayoutParams) r8Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(18.0f);
        }
        boolean z12 = r8Var.M;
        if (this.f37535f >= org.telegram.messenger.g0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        r8Var.M = z11;
        if (z12 != z11) {
            super.onMeasure(i3, i10);
            if (r8Var.M) {
                kVar = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
                i11 = org.telegram.messenger.g0.L(8.0f) + kVar.getMeasuredHeight() + (-r8Var.f37669b.getTop());
            } else {
                i11 = 0;
            }
            org.telegram.ui.s51 s51Var = r8Var.f37676r;
            s51Var.setTranslationY((s51Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) r8Var.f37676r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) r8Var.f37676r.getLayoutParams()).topMargin = i11;
            boolean z13 = r8Var.M;
            if (!r8Var.V) {
                float f12 = r8Var.O;
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r8Var.N = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((r8Var.d - r8Var.f37671c) - org.telegram.messenger.g0.f22602m) * r8Var.F;
                if (z13) {
                    r8Var.f37667a.setExpanded(false);
                    f13 = r8Var.f37676r.getTranslationY();
                } else {
                    f11 = r8Var.f37676r.getTranslationY();
                }
                if (r8Var.G && !z13) {
                    r8Var.f37667a.setExpanded(true);
                } else {
                    r8Var.G = false;
                }
                r8Var.N.addUpdateListener(new m8(r8Var, f13, f11, z13));
                r8Var.N.addListener(new g8(r8Var, 1));
                r8Var.N.setDuration(250L);
                r8Var.N.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                r8Var.N.start();
            }
        }
        super.onMeasure(i3, i10);
        r8Var.f37671c = r8Var.f37667a.getMeasuredHeight();
        r8Var.d = r8Var.f37667a.getMeasuredWidth();
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
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        r8 r8Var = this.f34992h0;
        if (r8Var.O <= 0.0f && !r8Var.V && i10 > 0 && r8Var.F > 0.0f) {
            r8Var.i0();
            r8Var.n0(true, Utilities.i(r8Var.F - (i10 / r8Var.d), 1.0f, 0.0f));
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        r8 r8Var = this.f34992h0;
        if (r8Var.O <= 0.0f && !r8Var.V && i12 != 0) {
            r8Var.i0();
            r8Var.n0(true, Utilities.i(r8Var.F - (i12 / r8Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f34991g0.f8413a = i3;
        this.f34992h0.i0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        r8 r8Var = this.f34992h0;
        if (r8Var.O <= 0.0f && !r8Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f34991g0.f8413a = 0;
        r8 r8Var = this.f34992h0;
        if (r8Var.F > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        r8Var.l0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        r8 r8Var = this.m0;
        if (!r8Var.L.b(motionEvent)) {
            if (!r8Var.V) {
                if (motionEvent.getAction() == 0) {
                    l8 l8Var = r8Var.f37669b;
                    Rect rect = org.telegram.messenger.g0.Q;
                    l8Var.getHitRect(rect);
                    rect.offset(0, (int) r8Var.f37676r.getY());
                    if (r8Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f34993i0 = true;
                        motionEvent.getX();
                        this.f34996l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f34993i0) || this.f34994j0)) {
                    if (z11) {
                        if (Math.abs(this.f34996l0 - motionEvent.getY()) > org.telegram.messenger.g0.f22587e) {
                            this.f34993i0 = false;
                            this.f34994j0 = true;
                            this.f34995k0 = r8Var.F;
                            motionEvent.getX();
                            this.f34996l0 = motionEvent.getY();
                        }
                    } else {
                        r8Var.n0(true, Utilities.i(((-(this.f34996l0 - motionEvent.getY())) / r8Var.d) + this.f34995k0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f34994j0) {
                        if (r8Var.F > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r8Var.l0(z10, false, false);
                    }
                    this.f34993i0 = false;
                    this.f34994j0 = false;
                }
            }
            if (!this.f34994j0 && !super.onTouchEvent(motionEvent) && !this.f34993i0) {
                return false;
            }
        }
        return true;
    }
}
