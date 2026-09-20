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
import org.telegram.ui.dc1;
public final class v8 extends aw0 {
    public float A0;
    public float B0;
    public final d9 C0;
    public final b2.q0 f29023w0;
    public final d9 f29024x0;
    public boolean f29025y0;
    public boolean f29026z0;

    public v8(d9 d9Var, Context context) {
        super(context, null);
        this.C0 = d9Var;
        this.f29024x0 = d9Var;
        this.f29023w0 = new Object();
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
                float x10 = d9Var.f23520a.getX() + d9Var.f23527r.getX();
                float y3 = d9Var.f23520a.getY() + d9Var.f23527r.getY();
                int i10 = d9Var.d - d9Var.f23524c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - d9Var.f23524c) >> 1), d9Var.N);
                canvas.translate(x10, lerp);
                d9Var.f23520a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (d9Var.E * f10), d9Var.f23520a.getMeasuredWidth() + x10, (f10 * d9Var.E) + d9Var.f23520a.getMeasuredHeight() + lerp);
                w8 w8Var = d9Var.f23520a;
                float f11 = x10 + w8Var.f23214y;
                float f12 = lerp + w8Var.E;
                fd fdVar = d9Var.K;
                float f13 = w8Var.f23213x;
                fdVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                fdVar.f24081i = false;
                fdVar.f24078c = 0;
                fdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = d9Var.f23520a.f23211s.f23501c;
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
        if (d9Var.f23525f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        d9 d9Var = this.C0;
        Paint paint = d9Var.O;
        if (view != d9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.n2) d9Var).actionBar;
            if (view == kVar && d9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
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
        b2.q0 q0Var = this.f29023w0;
        return q0Var.f3204b | q0Var.f3203a;
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
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f22789f) {
            z10 = true;
        } else {
            z10 = false;
        }
        d9 d9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != d9Var.U) {
            d9Var.U = z10;
            AndroidUtilities.removeFromParent(d9Var.f23520a);
            AndroidUtilities.requestAdjustNothing(d9Var.getParentActivity(), d9Var.getClassGuid());
            if (d9Var.U) {
                d9Var.i0(0.0f, false);
                d9Var.f23520a.setExpanded(false);
                addView(d9Var.f23520a, 0, w7.y5.c(-1.0f, -1));
            } else {
                d9Var.f23527r.addView(d9Var.f23520a, 0, w7.y5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(d9Var.getParentActivity(), d9Var.getClassGuid());
        }
        if (d9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) d9Var.f23527r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.f23527r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) d9Var.f23520a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) d9Var.f23530x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) d9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) d9Var.f23527r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.f23527r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.f23520a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) d9Var.f23530x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) d9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = d9Var.L;
        if (this.f22789f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        d9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (d9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.n2) d9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-d9Var.f23522b.getTop());
            } else {
                i12 = 0;
            }
            dc1 dc1Var = d9Var.f23527r;
            dc1Var.setTranslationY((dc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) d9Var.f23527r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) d9Var.f23527r.getLayoutParams()).topMargin = i12;
            boolean z13 = d9Var.L;
            if (!d9Var.U) {
                float f11 = d9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((d9Var.d - d9Var.f23524c) - AndroidUtilities.statusBarHeight) * d9Var.E;
                if (z13) {
                    d9Var.f23520a.setExpanded(false);
                    f12 = d9Var.f23527r.getTranslationY();
                } else {
                    f10 = d9Var.f23527r.getTranslationY();
                }
                if (d9Var.F && !z13) {
                    d9Var.f23520a.setExpanded(true);
                } else {
                    d9Var.F = false;
                }
                d9Var.M.addUpdateListener(new y8(d9Var, f12, f10, z13));
                d9Var.M.addListener(new s8(d9Var, 1));
                d9Var.M.setDuration(250L);
                d9Var.M.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
                d9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        d9Var.f23524c = d9Var.f23520a.getMeasuredHeight();
        d9Var.d = d9Var.f23520a.getMeasuredWidth();
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
        d9 d9Var = this.f29024x0;
        if (d9Var.N <= 0.0f && !d9Var.U && i11 > 0 && d9Var.E > 0.0f) {
            d9Var.d0();
            d9Var.i0(Utilities.clamp(d9Var.E - (i11 / d9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d9 d9Var = this.f29024x0;
        if (d9Var.N <= 0.0f && !d9Var.U && i13 != 0) {
            d9Var.d0();
            d9Var.i0(Utilities.clamp(d9Var.E - (i13 / d9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f29023w0.f3203a = i10;
        this.f29024x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        d9 d9Var = this.f29024x0;
        if (d9Var.N <= 0.0f && !d9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f29023w0.f3203a = 0;
        d9 d9Var = this.f29024x0;
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
                    x8 x8Var = d9Var.f23522b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    x8Var.getHitRect(rect);
                    rect.offset(0, (int) d9Var.f23527r.getY());
                    if (d9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f29025y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f29025y0) || this.f29026z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f29025y0 = false;
                            this.f29026z0 = true;
                            this.A0 = d9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        d9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / d9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f29026z0) {
                        if (d9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d9Var.g0(z10, false, false);
                    }
                    this.f29025y0 = false;
                    this.f29026z0 = false;
                }
            }
            if (!this.f29026z0 && !super.onTouchEvent(motionEvent) && !this.f29025y0) {
                return false;
            }
        }
        return true;
    }
}
