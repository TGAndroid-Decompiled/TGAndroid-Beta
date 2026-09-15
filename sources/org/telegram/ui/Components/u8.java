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
import org.telegram.ui.bc1;
public final class u8 extends pv0 {
    public float A0;
    public float B0;
    public final c9 C0;
    public final b2.q0 f28308w0;
    public final c9 f28309x0;
    public boolean f28310y0;
    public boolean f28311z0;

    public u8(c9 c9Var, Context context) {
        super(context, null);
        this.C0 = c9Var;
        this.f28309x0 = c9Var;
        this.f28308w0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        c9 c9Var = this.C0;
        if (!c9Var.U) {
            if (!c9Var.h) {
                canvas.save();
                float x10 = c9Var.f22981a.getX() + c9Var.f22988r.getX();
                float y3 = c9Var.f22981a.getY() + c9Var.f22988r.getY();
                int i10 = c9Var.d - c9Var.f22985c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - c9Var.f22985c) >> 1), c9Var.N);
                canvas.translate(x10, lerp);
                c9Var.f22981a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (c9Var.E * f10), c9Var.f22981a.getMeasuredWidth() + x10, (f10 * c9Var.E) + c9Var.f22981a.getMeasuredHeight() + lerp);
                v8 v8Var = c9Var.f22981a;
                float f11 = x10 + v8Var.f22720y;
                float f12 = lerp + v8Var.E;
                dd ddVar = c9Var.K;
                float f13 = v8Var.f22719x;
                ddVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                ddVar.f23290i = false;
                ddVar.f23287c = 0;
                ddVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = c9Var.f22981a.f22717s.f22953c;
            if (c9Var.e.getVisibility() == 0) {
                f7 = c9Var.e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                c9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(c9Var.H.getX(), c9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, c9Var.H.getMeasuredWidth(), c9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                c9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                c9Var.H.setVisibility(8);
            }
        }
        if (c9Var.f22986f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        c9 c9Var = this.C0;
        Paint paint = c9Var.O;
        if (view != c9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.n2) c9Var).actionBar;
            if (view == kVar && c9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                paint.setAlpha((int) (c9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) c9Var.getParentLayout()).p(canvas2, (int) (c9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        b2.q0 q0Var = this.f28308w0;
        return q0Var.f3199b | q0Var.f3198a;
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
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f27166f) {
            z10 = true;
        } else {
            z10 = false;
        }
        c9 c9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != c9Var.U) {
            c9Var.U = z10;
            AndroidUtilities.removeFromParent(c9Var.f22981a);
            AndroidUtilities.requestAdjustNothing(c9Var.getParentActivity(), c9Var.getClassGuid());
            if (c9Var.U) {
                c9Var.i0(0.0f, false);
                c9Var.f22981a.setExpanded(false);
                addView(c9Var.f22981a, 0, w7.x5.c(-1.0f, -1));
            } else {
                c9Var.f22988r.addView(c9Var.f22981a, 0, w7.x5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(c9Var.getParentActivity(), c9Var.getClassGuid());
        }
        if (c9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) c9Var.f22988r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.f22988r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) c9Var.f22981a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) c9Var.f22991x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) c9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) c9Var.f22988r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) c9Var.f22988r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.f22981a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c9Var.f22991x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) c9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) c9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = c9Var.L;
        if (this.f27166f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        c9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (c9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.n2) c9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-c9Var.f22983b.getTop());
            } else {
                i12 = 0;
            }
            bc1 bc1Var = c9Var.f22988r;
            bc1Var.setTranslationY((bc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) c9Var.f22988r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) c9Var.f22988r.getLayoutParams()).topMargin = i12;
            boolean z13 = c9Var.L;
            if (!c9Var.U) {
                float f11 = c9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((c9Var.d - c9Var.f22985c) - AndroidUtilities.statusBarHeight) * c9Var.E;
                if (z13) {
                    c9Var.f22981a.setExpanded(false);
                    f12 = c9Var.f22988r.getTranslationY();
                } else {
                    f10 = c9Var.f22988r.getTranslationY();
                }
                if (c9Var.F && !z13) {
                    c9Var.f22981a.setExpanded(true);
                } else {
                    c9Var.F = false;
                }
                c9Var.M.addUpdateListener(new x8(c9Var, f12, f10, z13));
                c9Var.M.addListener(new r8(c9Var, 1));
                c9Var.M.setDuration(250L);
                c9Var.M.setInterpolator(org.telegram.ui.ActionBar.p1.f19480w);
                c9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        c9Var.f22985c = c9Var.f22981a.getMeasuredHeight();
        c9Var.d = c9Var.f22981a.getMeasuredWidth();
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
        c9 c9Var = this.f28309x0;
        if (c9Var.N <= 0.0f && !c9Var.U && i11 > 0 && c9Var.E > 0.0f) {
            c9Var.d0();
            c9Var.i0(Utilities.clamp(c9Var.E - (i11 / c9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        c9 c9Var = this.f28309x0;
        if (c9Var.N <= 0.0f && !c9Var.U && i13 != 0) {
            c9Var.d0();
            c9Var.i0(Utilities.clamp(c9Var.E - (i13 / c9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f28308w0.f3198a = i10;
        this.f28309x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        c9 c9Var = this.f28309x0;
        if (c9Var.N <= 0.0f && !c9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f28308w0.f3198a = 0;
        c9 c9Var = this.f28309x0;
        if (c9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        c9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        c9 c9Var = this.C0;
        if (!c9Var.K.b(motionEvent)) {
            if (!c9Var.U) {
                if (motionEvent.getAction() == 0) {
                    w8 w8Var = c9Var.f22983b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    w8Var.getHitRect(rect);
                    rect.offset(0, (int) c9Var.f22988r.getY());
                    if (c9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f28310y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f28310y0) || this.f28311z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f28310y0 = false;
                            this.f28311z0 = true;
                            this.A0 = c9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        c9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / c9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f28311z0) {
                        if (c9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c9Var.g0(z10, false, false);
                    }
                    this.f28310y0 = false;
                    this.f28311z0 = false;
                }
            }
            if (!this.f28311z0 && !super.onTouchEvent(motionEvent) && !this.f28310y0) {
                return false;
            }
        }
        return true;
    }
}
