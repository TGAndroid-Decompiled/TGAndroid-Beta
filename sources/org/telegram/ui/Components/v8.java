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
import org.telegram.ui.gc1;
public final class v8 extends aw0 {
    public float A0;
    public float B0;
    public final d9 C0;
    public final b2.q0 f27871w0;
    public final d9 f27872x0;
    public boolean f27873y0;
    public boolean f27874z0;

    public v8(d9 d9Var, Context context) {
        super(context, null);
        this.C0 = d9Var;
        this.f27872x0 = d9Var;
        this.f27871w0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        d9 d9Var = this.C0;
        if (!d9Var.U) {
            if (!d9Var.h) {
                canvas.save();
                float x10 = d9Var.f22325a.getX() + d9Var.f22332r.getX();
                float y3 = d9Var.f22325a.getY() + d9Var.f22332r.getY();
                int i10 = d9Var.d - d9Var.f22329c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - d9Var.f22329c) >> 1), d9Var.N);
                canvas.translate(x10, lerp);
                d9Var.f22325a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (d9Var.E * f10), d9Var.f22325a.getMeasuredWidth() + x10, (f10 * d9Var.E) + d9Var.f22325a.getMeasuredHeight() + lerp);
                w8 w8Var = d9Var.f22325a;
                float f11 = x10 + w8Var.f22053y;
                float f12 = lerp + w8Var.E;
                ed edVar = d9Var.K;
                float f13 = w8Var.f22052x;
                edVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                edVar.f22677i = false;
                edVar.f22674c = 0;
                edVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = d9Var.f22325a.f22050s.f22295c;
            if (d9Var.e.getVisibility() == 0) {
                f7 = d9Var.e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                d9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(d9Var.H.getX(), d9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, d9Var.H.getMeasuredWidth(), d9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                d9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                d9Var.H.setVisibility(8);
            }
        }
        if (d9Var.f22330f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        d9 d9Var = this.C0;
        Paint paint = d9Var.O;
        if (view != d9Var.H) {
            lVar = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
            if (view == lVar && d9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                paint.setAlpha((int) (d9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) d9Var.getParentLayout()).p(canvas2, (int) (d9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        b2.q0 q0Var = this.f27871w0;
        return q0Var.f1897b | q0Var.f1896a;
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
        org.telegram.ui.ActionBar.l lVar;
        R();
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f21630f) {
            z10 = true;
        } else {
            z10 = false;
        }
        d9 d9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != d9Var.U) {
            d9Var.U = z10;
            AndroidUtilities.removeFromParent(d9Var.f22325a);
            AndroidUtilities.requestAdjustNothing(d9Var.getParentActivity(), d9Var.getClassGuid());
            if (d9Var.U) {
                d9Var.i0(0.0f, false);
                d9Var.f22325a.setExpanded(false);
                addView(d9Var.f22325a, 0, w7.a6.c(-1.0f, -1));
            } else {
                d9Var.f22332r.addView(d9Var.f22325a, 0, w7.a6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(d9Var.getParentActivity(), d9Var.getClassGuid());
        }
        if (d9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) d9Var.f22332r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.f22332r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) d9Var.f22325a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) d9Var.f22335x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) d9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) d9Var.f22332r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.f22332r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.f22325a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.f22335x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = d9Var.L;
        if (this.f21630f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        d9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (d9Var.L) {
                lVar = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + lVar.getMeasuredHeight() + (-d9Var.f22327b.getTop());
            } else {
                i12 = 0;
            }
            gc1 gc1Var = d9Var.f22332r;
            gc1Var.setTranslationY((gc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) d9Var.f22332r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) d9Var.f22332r.getLayoutParams()).topMargin = i12;
            boolean z13 = d9Var.L;
            if (!d9Var.U) {
                float f11 = d9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((d9Var.d - d9Var.f22329c) - AndroidUtilities.statusBarHeight) * d9Var.E;
                if (z13) {
                    d9Var.f22325a.setExpanded(false);
                    f12 = d9Var.f22332r.getTranslationY();
                } else {
                    f10 = d9Var.f22332r.getTranslationY();
                }
                if (d9Var.F && !z13) {
                    d9Var.f22325a.setExpanded(true);
                } else {
                    d9Var.F = false;
                }
                d9Var.M.addUpdateListener(new y8(d9Var, f12, f10, z13));
                d9Var.M.addListener(new s8(d9Var, 1));
                d9Var.M.setDuration(250L);
                d9Var.M.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                d9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        d9Var.f22329c = d9Var.f22325a.getMeasuredHeight();
        d9Var.d = d9Var.f22325a.getMeasuredWidth();
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
        d9 d9Var = this.f27872x0;
        if (d9Var.N <= 0.0f && !d9Var.U && i11 > 0 && d9Var.E > 0.0f) {
            d9Var.d0();
            d9Var.i0(Utilities.clamp(d9Var.E - (i11 / d9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d9 d9Var = this.f27872x0;
        if (d9Var.N <= 0.0f && !d9Var.U && i13 != 0) {
            d9Var.d0();
            d9Var.i0(Utilities.clamp(d9Var.E - (i13 / d9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f27871w0.f1896a = i10;
        this.f27872x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        d9 d9Var = this.f27872x0;
        if (d9Var.N <= 0.0f && !d9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f27871w0.f1896a = 0;
        d9 d9Var = this.f27872x0;
        if (d9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        d9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        d9 d9Var = this.C0;
        if (!d9Var.K.b(motionEvent)) {
            if (!d9Var.U) {
                if (motionEvent.getAction() == 0) {
                    x8 x8Var = d9Var.f22327b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    x8Var.getHitRect(rect);
                    rect.offset(0, (int) d9Var.f22332r.getY());
                    if (d9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f27873y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f27873y0) || this.f27874z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f27873y0 = false;
                            this.f27874z0 = true;
                            this.A0 = d9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        d9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / d9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f27874z0) {
                        if (d9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d9Var.g0(z10, false, false);
                    }
                    this.f27873y0 = false;
                    this.f27874z0 = false;
                }
            }
            if (!this.f27874z0 && !super.onTouchEvent(motionEvent) && !this.f27873y0) {
                return false;
            }
        }
        return true;
    }
}
