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
public final class y8 extends vw0 {
    public final b2.v0 f34969l0;
    public final g9 m0;
    public boolean f34970n0;
    public boolean f34971o0;
    public float f34972p0;
    public float f34973q0;
    public final g9 f34974r0;

    public y8(g9 g9Var, Context context) {
        super(context, null);
        this.f34974r0 = g9Var;
        this.m0 = g9Var;
        this.f34969l0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        g9 g9Var = this.f34974r0;
        if (!g9Var.U) {
            if (!g9Var.h) {
                canvas.save();
                float x9 = g9Var.f28487a.getX() + g9Var.f28494r.getX();
                float y3 = g9Var.f28487a.getY() + g9Var.f28494r.getY();
                int i10 = g9Var.d - g9Var.f28491c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - g9Var.f28491c) >> 1), g9Var.N);
                canvas.translate(x9, lerp);
                g9Var.f28487a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x9, lerp - (g9Var.E * f10), g9Var.f28487a.getMeasuredWidth() + x9, (f10 * g9Var.E) + g9Var.f28487a.getMeasuredHeight() + lerp);
                z8 z8Var = g9Var.f28487a;
                float f11 = x9 + z8Var.f28099y;
                float f12 = lerp + z8Var.E;
                ed edVar = g9Var.K;
                float f13 = z8Var.f28098x;
                edVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                edVar.f27805i = false;
                edVar.f27802c = 0;
                edVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = g9Var.f28487a.f28096s.f28809c;
            if (g9Var.e.getVisibility() == 0) {
                f7 = g9Var.e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                g9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(g9Var.H.getX(), g9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, g9Var.H.getMeasuredWidth(), g9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                g9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                g9Var.H.setVisibility(8);
            }
        }
        if (g9Var.f28492f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        g9 g9Var = this.f34974r0;
        Paint paint = g9Var.O;
        if (view != g9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.r2) g9Var).actionBar;
            if (view == kVar && g9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
                paint.setAlpha((int) (g9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) g9Var.getParentLayout()).p(canvas2, (int) (g9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.f34969l0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34974r0.N == 0.0f) {
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
        Q();
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f34280f) {
            z10 = true;
        } else {
            z10 = false;
        }
        g9 g9Var = this.f34974r0;
        float f10 = 0.0f;
        if (z10 != g9Var.U) {
            g9Var.U = z10;
            AndroidUtilities.removeFromParent(g9Var.f28487a);
            AndroidUtilities.requestAdjustNothing(g9Var.getParentActivity(), g9Var.getClassGuid());
            if (g9Var.U) {
                g9Var.j0(0.0f, false);
                g9Var.f28487a.setExpanded(false);
                addView(g9Var.f28487a, 0, gb1.g(-1.0f, -1));
            } else {
                g9Var.f28494r.addView(g9Var.f28487a, 0, gb1.g(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        }
        if (g9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) g9Var.f28494r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.f28494r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) g9Var.f28487a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) g9Var.f28497x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) g9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) g9Var.f28494r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.f28494r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.f28487a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) g9Var.f28497x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) g9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = g9Var.L;
        if (this.f34280f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        g9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (g9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.r2) g9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-g9Var.f28489b.getTop());
            } else {
                i12 = 0;
            }
            org.telegram.ui.xa1 xa1Var = g9Var.f28494r;
            xa1Var.setTranslationY((xa1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) g9Var.f28494r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) g9Var.f28494r.getLayoutParams()).topMargin = i12;
            boolean z13 = g9Var.L;
            if (!g9Var.U) {
                float f11 = g9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((g9Var.d - g9Var.f28491c) - AndroidUtilities.statusBarHeight) * g9Var.E;
                if (z13) {
                    g9Var.f28487a.setExpanded(false);
                    f12 = g9Var.f28494r.getTranslationY();
                } else {
                    f10 = g9Var.f28494r.getTranslationY();
                }
                if (g9Var.F && !z13) {
                    g9Var.f28487a.setExpanded(true);
                } else {
                    g9Var.F = false;
                }
                g9Var.M.addUpdateListener(new b9(g9Var, f12, f10, z13));
                g9Var.M.addListener(new v8(g9Var, 1));
                g9Var.M.setDuration(250L);
                g9Var.M.setInterpolator(org.telegram.ui.ActionBar.q1.f22961w);
                g9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        g9Var.f28491c = g9Var.f28487a.getMeasuredHeight();
        g9Var.d = g9Var.f28487a.getMeasuredWidth();
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
        g9 g9Var = this.m0;
        if (g9Var.N <= 0.0f && !g9Var.U && i11 > 0 && g9Var.E > 0.0f) {
            g9Var.e0();
            g9Var.j0(Utilities.clamp(g9Var.E - (i11 / g9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        g9 g9Var = this.m0;
        if (g9Var.N <= 0.0f && !g9Var.U && i13 != 0) {
            g9Var.e0();
            g9Var.j0(Utilities.clamp(g9Var.E - (i13 / g9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f34969l0.f3511a = i10;
        this.m0.e0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        g9 g9Var = this.m0;
        if (g9Var.N <= 0.0f && !g9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f34969l0.f3511a = 0;
        g9 g9Var = this.m0;
        if (g9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        g9Var.h0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        g9 g9Var = this.f34974r0;
        if (!g9Var.K.b(motionEvent)) {
            if (!g9Var.U) {
                if (motionEvent.getAction() == 0) {
                    a9 a9Var = g9Var.f28489b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    a9Var.getHitRect(rect);
                    rect.offset(0, (int) g9Var.f28494r.getY());
                    if (g9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f34970n0 = true;
                        motionEvent.getX();
                        this.f34973q0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f34970n0) || this.f34971o0)) {
                    if (z11) {
                        if (Math.abs(this.f34973q0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f34970n0 = false;
                            this.f34971o0 = true;
                            this.f34972p0 = g9Var.E;
                            motionEvent.getX();
                            this.f34973q0 = motionEvent.getY();
                        }
                    } else {
                        g9Var.j0(Utilities.clamp(((-(this.f34973q0 - motionEvent.getY())) / g9Var.d) + this.f34972p0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f34971o0) {
                        if (g9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g9Var.h0(z10, false, false);
                    }
                    this.f34970n0 = false;
                    this.f34971o0 = false;
                }
            }
            if (!this.f34971o0 && !super.onTouchEvent(motionEvent) && !this.f34970n0) {
                return false;
            }
        }
        return true;
    }
}
