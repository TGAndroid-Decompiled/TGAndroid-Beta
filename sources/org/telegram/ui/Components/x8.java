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
import org.telegram.ui.cc1;
public final class x8 extends ov0 {
    public float A0;
    public float B0;
    public final f9 C0;
    public final b2.q0 f32473w0;
    public final f9 f32474x0;
    public boolean f32475y0;
    public boolean f32476z0;

    public x8(f9 f9Var, Context context) {
        super(context, null);
        this.C0 = f9Var;
        this.f32474x0 = f9Var;
        this.f32473w0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        f9 f9Var = this.C0;
        if (!f9Var.U) {
            if (!f9Var.h) {
                canvas.save();
                float x10 = f9Var.f25991a.getX() + f9Var.f25999r.getX();
                float y3 = f9Var.f25991a.getY() + f9Var.f25999r.getY();
                int i10 = f9Var.d - f9Var.f25995c;
                float lerp = AndroidUtilities.lerp(y3, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f9Var.f25995c) >> 1), f9Var.N);
                canvas.translate(x10, lerp);
                f9Var.f25991a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x10, lerp - (f9Var.E * f10), f9Var.f25991a.getMeasuredWidth() + x10, (f10 * f9Var.E) + f9Var.f25991a.getMeasuredHeight() + lerp);
                y8 y8Var = f9Var.f25991a;
                float f11 = x10 + y8Var.f25642y;
                float f12 = lerp + y8Var.E;
                gd gdVar = f9Var.K;
                float f13 = y8Var.f25641x;
                gdVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                gdVar.f26380i = false;
                gdVar.f26376c = 0;
                gdVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = f9Var.f25991a.f25639s.f25592c;
            if (f9Var.f25996e.getVisibility() == 0) {
                f7 = f9Var.f25996e.getAlpha();
            } else {
                f7 = 0.0f;
            }
            float f15 = (1.0f - f7) * f14;
            if (f15 != 0.0f) {
                f9Var.H.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(f9Var.H.getX(), f9Var.H.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f9Var.H.getMeasuredWidth(), f9Var.H.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                f9Var.H.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                f9Var.H.setVisibility(8);
            }
        }
        if (f9Var.f25997f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        f9 f9Var = this.C0;
        Paint paint = f9Var.O;
        if (view != f9Var.H) {
            kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
            if (view == kVar && f9Var.N > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                paint.setAlpha((int) (f9Var.N * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) f9Var.getParentLayout()).p(canvas2, (int) (f9Var.N * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j3);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        b2.q0 q0Var = this.f32473w0;
        return q0Var.f2288b | q0Var.f2287a;
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
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f29233f) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9 f9Var = this.C0;
        float f10 = 0.0f;
        if (z10 != f9Var.U) {
            f9Var.U = z10;
            AndroidUtilities.removeFromParent(f9Var.f25991a);
            AndroidUtilities.requestAdjustNothing(f9Var.getParentActivity(), f9Var.getClassGuid());
            if (f9Var.U) {
                f9Var.i0(0.0f, false);
                f9Var.f25991a.setExpanded(false);
                addView(f9Var.f25991a, 0, w7.x5.c(-1.0f, -1));
            } else {
                f9Var.f25999r.addView(f9Var.f25991a, 0, w7.x5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(f9Var.getParentActivity(), f9Var.getClassGuid());
        }
        if (f9Var.U) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) f9Var.f25999r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.f25999r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) f9Var.f25991a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) f9Var.f26002x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) f9Var.W.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) f9Var.f25999r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) f9Var.f25999r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.f25991a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) f9Var.f26002x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) f9Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) f9Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = f9Var.L;
        if (this.f29233f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        f9Var.L = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (f9Var.L) {
                kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-f9Var.f25993b.getTop());
            } else {
                i12 = 0;
            }
            cc1 cc1Var = f9Var.f25999r;
            cc1Var.setTranslationY((cc1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) f9Var.f25999r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) f9Var.f25999r.getLayoutParams()).topMargin = i12;
            boolean z13 = f9Var.L;
            if (!f9Var.U) {
                float f11 = f9Var.N;
                if (z13) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f9Var.M = ValueAnimator.ofFloat(f11, f7);
                float f12 = ((f9Var.d - f9Var.f25995c) - AndroidUtilities.statusBarHeight) * f9Var.E;
                if (z13) {
                    f9Var.f25991a.setExpanded(false);
                    f12 = f9Var.f25999r.getTranslationY();
                } else {
                    f10 = f9Var.f25999r.getTranslationY();
                }
                if (f9Var.F && !z13) {
                    f9Var.f25991a.setExpanded(true);
                } else {
                    f9Var.F = false;
                }
                f9Var.M.addUpdateListener(new a9(f9Var, f12, f10, z13));
                f9Var.M.addListener(new u8(f9Var, 1));
                f9Var.M.setDuration(250L);
                f9Var.M.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
                f9Var.M.start();
            }
        }
        super.onMeasure(i10, i11);
        f9Var.f25995c = f9Var.f25991a.getMeasuredHeight();
        f9Var.d = f9Var.f25991a.getMeasuredWidth();
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
        f9 f9Var = this.f32474x0;
        if (f9Var.N <= 0.0f && !f9Var.U && i11 > 0 && f9Var.E > 0.0f) {
            f9Var.d0();
            f9Var.i0(Utilities.clamp(f9Var.E - (i11 / f9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        f9 f9Var = this.f32474x0;
        if (f9Var.N <= 0.0f && !f9Var.U && i13 != 0) {
            f9Var.d0();
            f9Var.i0(Utilities.clamp(f9Var.E - (i13 / f9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f32473w0.f2287a = i10;
        this.f32474x0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        f9 f9Var = this.f32474x0;
        if (f9Var.N <= 0.0f && !f9Var.U) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f32473w0.f2287a = 0;
        f9 f9Var = this.f32474x0;
        if (f9Var.E > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        f9 f9Var = this.C0;
        if (!f9Var.K.b(motionEvent)) {
            if (!f9Var.U) {
                if (motionEvent.getAction() == 0) {
                    z8 z8Var = f9Var.f25993b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    z8Var.getHitRect(rect);
                    rect.offset(0, (int) f9Var.f25999r.getY());
                    if (f9Var.N == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f32475y0 = true;
                        motionEvent.getX();
                        this.B0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f32475y0) || this.f32476z0)) {
                    if (z11) {
                        if (Math.abs(this.B0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f32475y0 = false;
                            this.f32476z0 = true;
                            this.A0 = f9Var.E;
                            motionEvent.getX();
                            this.B0 = motionEvent.getY();
                        }
                    } else {
                        f9Var.i0(Utilities.clamp(((-(this.B0 - motionEvent.getY())) / f9Var.d) + this.A0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f32476z0) {
                        if (f9Var.E > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f9Var.g0(z10, false, false);
                    }
                    this.f32475y0 = false;
                    this.f32476z0 = false;
                }
            }
            if (!this.f32476z0 && !super.onTouchEvent(motionEvent) && !this.f32475y0) {
                return false;
            }
        }
        return true;
    }
}
