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
import org.telegram.ui.ua1;
public final class t8 extends hv0 {
    public final a5.e f32896s0;
    public final b9 f32897t0;
    public boolean f32898u0;
    public boolean f32899v0;
    public float f32900w0;
    public float f32901x0;
    public final b9 f32902y0;

    public t8(b9 b9Var, Context context) {
        super(context, null);
        this.f32902y0 = b9Var;
        this.f32897t0 = b9Var;
        this.f32896s0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        b9 b9Var = this.f32902y0;
        if (!b9Var.Q) {
            if (!b9Var.h) {
                canvas.save();
                float x4 = b9Var.f27003a.getX() + b9Var.f27009r.getX();
                float y8 = b9Var.f27003a.getY() + b9Var.f27009r.getY();
                int i10 = b9Var.d - b9Var.f27005c;
                float lerp = AndroidUtilities.lerp(y8, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - b9Var.f27005c) >> 1), b9Var.J);
                canvas.translate(x4, lerp);
                b9Var.f27003a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x4, lerp - (b9Var.A * f10), b9Var.f27003a.getMeasuredWidth() + x4, (f10 * b9Var.A) + b9Var.f27003a.getMeasuredHeight() + lerp);
                u8 u8Var = b9Var.f27003a;
                float f11 = x4 + u8Var.f26717y;
                float f12 = lerp + u8Var.A;
                ad adVar = b9Var.G;
                float f13 = u8Var.f26716x;
                adVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                adVar.f26745i = false;
                adVar.f26741c = 0;
                adVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f14 = b9Var.f27003a.f26714s.f27666c;
            if (b9Var.f27006e.getVisibility() == 0) {
                f9 = b9Var.f27006e.getAlpha();
            } else {
                f9 = 0.0f;
            }
            float f15 = (1.0f - f9) * f14;
            if (f15 != 0.0f) {
                b9Var.D.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(b9Var.D.getX(), b9Var.D.getY());
                if (f15 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, b9Var.D.getMeasuredWidth(), b9Var.D.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                b9Var.D.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                b9Var.D.setVisibility(8);
            }
        }
        if (b9Var.f27007f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        b9 b9Var = this.f32902y0;
        Paint paint = b9Var.K;
        if (view != b9Var.D) {
            lVar = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
            if (view == lVar && b9Var.J > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                paint.setAlpha((int) (b9Var.J * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) b9Var.getParentLayout()).p(canvas2, (int) (b9Var.J * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        a5.e eVar = this.f32896s0;
        return eVar.f166b | eVar.f165a;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32902y0.J == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        float f9;
        org.telegram.ui.ActionBar.l lVar;
        R();
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f29245f) {
            z10 = true;
        } else {
            z10 = false;
        }
        b9 b9Var = this.f32902y0;
        float f10 = 0.0f;
        if (z10 != b9Var.Q) {
            b9Var.Q = z10;
            AndroidUtilities.removeFromParent(b9Var.f27003a);
            AndroidUtilities.requestAdjustNothing(b9Var.getParentActivity(), b9Var.getClassGuid());
            if (b9Var.Q) {
                b9Var.i0(0.0f, false);
                b9Var.f27003a.setExpanded(false);
                addView(b9Var.f27003a, 0, i7.f6.c(-1.0f, -1));
            } else {
                b9Var.f27009r.addView(b9Var.f27003a, 0, i7.f6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(b9Var.getParentActivity(), b9Var.getClassGuid());
        }
        if (b9Var.Q) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) b9Var.f27009r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.f27009r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) b9Var.f27003a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) b9Var.f27012x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) b9Var.S.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) b9Var.f27009r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) b9Var.f27009r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.f27003a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) b9Var.f27012x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) b9Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) b9Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = b9Var.H;
        if (this.f29245f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        b9Var.H = z11;
        if (z12 != z11) {
            super.onMeasure(i10, i11);
            if (b9Var.H) {
                lVar = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + lVar.getMeasuredHeight() + (-b9Var.f27004b.getTop());
            } else {
                i12 = 0;
            }
            ua1 ua1Var = b9Var.f27009r;
            ua1Var.setTranslationY((ua1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) b9Var.f27009r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) b9Var.f27009r.getLayoutParams()).topMargin = i12;
            boolean z13 = b9Var.H;
            if (!b9Var.Q) {
                float f11 = b9Var.J;
                if (z13) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                b9Var.I = ValueAnimator.ofFloat(f11, f9);
                float f12 = ((b9Var.d - b9Var.f27005c) - AndroidUtilities.statusBarHeight) * b9Var.A;
                if (z13) {
                    b9Var.f27003a.setExpanded(false);
                    f12 = b9Var.f27009r.getTranslationY();
                } else {
                    f10 = b9Var.f27009r.getTranslationY();
                }
                if (b9Var.B && !z13) {
                    b9Var.f27003a.setExpanded(true);
                } else {
                    b9Var.B = false;
                }
                b9Var.I.addUpdateListener(new w8(b9Var, f12, f10, z13));
                b9Var.I.addListener(new q8(b9Var, 1));
                b9Var.I.setDuration(250L);
                b9Var.I.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                b9Var.I.start();
            }
        }
        super.onMeasure(i10, i11);
        b9Var.f27005c = b9Var.f27003a.getMeasuredHeight();
        b9Var.d = b9Var.f27003a.getMeasuredWidth();
    }

    @Override
    public final boolean onNestedFling(View view, float f9, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        b9 b9Var = this.f32897t0;
        if (b9Var.J <= 0.0f && !b9Var.Q && i11 > 0 && b9Var.A > 0.0f) {
            b9Var.d0();
            b9Var.i0(Utilities.clamp(b9Var.A - (i11 / b9Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        b9 b9Var = this.f32897t0;
        if (b9Var.J <= 0.0f && !b9Var.Q && i13 != 0) {
            b9Var.d0();
            b9Var.i0(Utilities.clamp(b9Var.A - (i13 / b9Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f32896s0.f165a = i10;
        this.f32897t0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        b9 b9Var = this.f32897t0;
        if (b9Var.J <= 0.0f && !b9Var.Q) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f32896s0.f165a = 0;
        b9 b9Var = this.f32897t0;
        if (b9Var.A > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        b9Var.g0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        b9 b9Var = this.f32902y0;
        if (!b9Var.G.b(motionEvent)) {
            if (!b9Var.Q) {
                if (motionEvent.getAction() == 0) {
                    v8 v8Var = b9Var.f27004b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    v8Var.getHitRect(rect);
                    rect.offset(0, (int) b9Var.f27009r.getY());
                    if (b9Var.J == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f32898u0 = true;
                        motionEvent.getX();
                        this.f32901x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f32898u0) || this.f32899v0)) {
                    if (z11) {
                        if (Math.abs(this.f32901x0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f32898u0 = false;
                            this.f32899v0 = true;
                            this.f32900w0 = b9Var.A;
                            motionEvent.getX();
                            this.f32901x0 = motionEvent.getY();
                        }
                    } else {
                        b9Var.i0(Utilities.clamp(((-(this.f32901x0 - motionEvent.getY())) / b9Var.d) + this.f32900w0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f32899v0) {
                        if (b9Var.A > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b9Var.g0(z10, false, false);
                    }
                    this.f32898u0 = false;
                    this.f32899v0 = false;
                }
            }
            if (!this.f32899v0 && !super.onTouchEvent(motionEvent) && !this.f32898u0) {
                return false;
            }
        }
        return true;
    }
}
