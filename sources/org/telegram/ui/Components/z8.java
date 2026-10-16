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
import org.telegram.ui.ic1;
public final class z8 extends ow0 {
    public float A0;
    public float B0;
    public final h9 C0;
    public final b2.v0 f31498w0;
    public final h9 f31499x0;
    public boolean f31500y0;
    public boolean f31501z0;

    public z8(h9 h9Var, Context context) {
        super(context, null);
        this.C0 = h9Var;
        this.f31499x0 = h9Var;
        this.f31498w0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        h9 h9Var = this.C0;
        if (!h9Var.U) {
            if (!h9Var.h) {
                canvas.save();
                float x10 = h9Var.f25209a.getX() + h9Var.f25216r.getX();
                float y3 = h9Var.f25209a.getY() + h9Var.f25216r.getY();
                int i10 = h9Var.d - h9Var.f25213c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - h9Var.f25213c) >> 1), h9Var.N);
                canvas.translate(x10, lerp);
                h9Var.f25209a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (h9Var.E * f10), h9Var.f25209a.getMeasuredWidth() + x10, (f10 * h9Var.E) + h9Var.f25209a.getMeasuredHeight() + lerp);
                a9 a9Var = h9Var.f25209a;
                float f11 = x10 + a9Var.f24929y;
                float f12 = lerp + a9Var.E;
                hd hdVar = h9Var.K;
                float f13 = a9Var.f24928x;
                hdVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                hdVar.f25279i = false;
                hdVar.f25276c = 0;
                hdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = h9Var.f25209a.f24926s.f24885c;
            if (h9Var.e.getVisibility() == 0) {
                f7 = h9Var.e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                h9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(h9Var.H.getX(), h9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, h9Var.H.getMeasuredWidth(), h9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                h9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                h9Var.H.setVisibility(8);
            }
        }
        if (h9Var.f25214f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        h9 h9Var = this.C0;
        Paint paint = h9Var.O;
        if (view != h9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
            if (view == kVar && h9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                paint.setAlpha((int) (h9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) h9Var.getParentLayout()).p(canvas2, (int) (h9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f31498w0.b();
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
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f27772f) {
            z10 = true;
        } else {
            z10 = false;
        }
        h9 h9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != h9Var.U) {
            h9Var.U = z10;
            AndroidUtilities.removeFromParent(h9Var.f25209a);
            AndroidUtilities.requestAdjustNothing(h9Var.getParentActivity(), h9Var.getClassGuid());
            if (h9Var.U) {
                h9Var.i0(0.0f, false);
                h9Var.f25209a.setExpanded(false);
                addView(h9Var.f25209a, 0, w7.z5.d(-1.0f, -1));
            } else {
                h9Var.f25216r.addView(h9Var.f25209a, 0, w7.z5.d(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(h9Var.getParentActivity(), h9Var.getClassGuid());
        }
        if (h9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) h9Var.f25216r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.f25216r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) h9Var.f25209a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) h9Var.f25219x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) h9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) h9Var.f25216r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) h9Var.f25216r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.f25209a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) h9Var.f25219x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) h9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) h9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = h9Var.L;
        if (this.f27772f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        h9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (h9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-h9Var.f25211b.getTop());
            } else {
                i12 = 0;
            }
            ic1 ic1Var = h9Var.f25216r;
            ic1Var.setTranslationY((ic1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) h9Var.f25216r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) h9Var.f25216r.getLayoutParams()).topMargin = i12;
            boolean z13 = h9Var.L;
            if (!h9Var.U) {
                float f11 = h9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                h9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((h9Var.d - h9Var.f25213c) - AndroidUtilities.statusBarHeight) * h9Var.E;
                if (z13) {
                    h9Var.f25209a.setExpanded(false);
                    f12 = h9Var.f25216r.getTranslationY();
                } else {
                    f10 = h9Var.f25216r.getTranslationY();
                }
                if (h9Var.F && !z13) {
                    h9Var.f25209a.setExpanded(true);
                } else {
                    h9Var.F = false;
                }
                h9Var.M.addUpdateListener(new c9(h9Var, f12, f10, z13));
                h9Var.M.addListener(new w8(h9Var, 1));
                h9Var.M.setDuration(250L);
                h9Var.M.setInterpolator(org.telegram.ui.ActionBar.o1.f20254w);
                h9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        h9Var.f25213c = h9Var.f25209a.getMeasuredHeight();
        h9Var.d = h9Var.f25209a.getMeasuredWidth();
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
        h9 h9Var = this.f31499x0;
        if (h9Var.N <= 0.0f && !h9Var.U && i11 > 0 && h9Var.E > 0.0f) {
            h9Var.d0();
            h9Var.i0(Utilities.clamp(h9Var.E - (i11 / h9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        h9 h9Var = this.f31499x0;
        if (h9Var.N <= 0.0f && !h9Var.U && i13 != 0) {
            h9Var.d0();
            h9Var.i0(Utilities.clamp(h9Var.E - (i13 / h9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f31498w0.f2448a = i10;
        this.f31499x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        h9 h9Var = this.f31499x0;
        if (h9Var.N <= 0.0f && !h9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f31498w0.f2448a = 0;
        h9 h9Var = this.f31499x0;
        if (h9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        h9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        h9 h9Var = this.C0;
        if (!h9Var.K.b(motionEvent)) {
            if (!h9Var.U) {
                if (motionEvent.getAction() == 0) {
                    b9 b9Var = h9Var.f25211b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    b9Var.getHitRect(rect);
                    rect.offset(0, (int) h9Var.f25216r.getY());
                    if (h9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f31500y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f31500y0) || this.f31501z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f31500y0 = false;
                            this.f31501z0 = true;
                            this.A0 = h9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        h9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / h9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f31501z0) {
                        if (h9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h9Var.g0(z10, false, false);
                    }
                    this.f31500y0 = false;
                    this.f31501z0 = false;
                }
            }
            if (!this.f31501z0 && !super.onTouchEvent(motionEvent) && !this.f31500y0) {
                return false;
            }
        }
        return true;
    }
}
