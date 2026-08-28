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
import org.telegram.ui.ta1;
public final class o8 extends xu0 {
    public final d5.p f31321s0;
    public final w8 f31322t0;
    public boolean f31323u0;
    public boolean f31324v0;
    public float f31325w0;
    public float f31326x0;
    public final w8 f31327y0;

    public o8(w8 w8Var, Context context) {
        super(context, null);
        this.f31327y0 = w8Var;
        this.f31322t0 = w8Var;
        this.f31321s0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        w8 w8Var = this.f31327y0;
        if (!w8Var.Q) {
            if (!w8Var.h) {
                canvas.save();
                float x10 = w8Var.f34138a.getX() + w8Var.f34144r.getX();
                float y10 = w8Var.f34138a.getY() + w8Var.f34144r.getY();
                int i9 = w8Var.d - w8Var.f34140c;
                float lerp = AndroidUtilities.lerp(y10, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w8Var.f34140c) >> 1), w8Var.J);
                canvas.translate(x10, lerp);
                w8Var.f34138a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = i9 / 2.0f;
                rectF.set(x10, lerp - (w8Var.A * f11), w8Var.f34138a.getMeasuredWidth() + x10, (f11 * w8Var.A) + w8Var.f34138a.getMeasuredHeight() + lerp);
                p8 p8Var = w8Var.f34138a;
                float f12 = x10 + p8Var.f33321y;
                float f13 = lerp + p8Var.A;
                wc wcVar = w8Var.G;
                float f14 = p8Var.f33320x;
                wcVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                wcVar.f34193i = false;
                wcVar.f34189c = 0;
                wcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = w8Var.f34138a.f33318s.f34854c;
            if (w8Var.f34141e.getVisibility() == 0) {
                f10 = w8Var.f34141e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                w8Var.D.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(w8Var.D.getX(), w8Var.D.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, w8Var.D.getMeasuredWidth(), w8Var.D.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                w8Var.D.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                w8Var.D.setVisibility(8);
            }
        }
        if (w8Var.f34142f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        w8 w8Var = this.f31327y0;
        Paint paint = w8Var.K;
        if (view != w8Var.D) {
            kVar = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
            if (view == kVar && w8Var.J > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                paint.setAlpha((int) (w8Var.J * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) w8Var.getParentLayout()).p(canvas2, (int) (w8Var.J * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        d5.p pVar = this.f31321s0;
        return pVar.f4377b | pVar.f4376a;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31327y0.J == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        R();
        if (View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10) + this.f34780f) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8 w8Var = this.f31327y0;
        float f11 = 0.0f;
        if (z10 != w8Var.Q) {
            w8Var.Q = z10;
            AndroidUtilities.removeFromParent(w8Var.f34138a);
            AndroidUtilities.requestAdjustNothing(w8Var.getParentActivity(), w8Var.getClassGuid());
            if (w8Var.Q) {
                w8Var.h0(0.0f, false);
                w8Var.f34138a.setExpanded(false);
                addView(w8Var.f34138a, 0, g7.e6.c(-1.0f, -1));
            } else {
                w8Var.f34144r.addView(w8Var.f34138a, 0, g7.e6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        }
        if (w8Var.Q) {
            int size = (int) (View.MeasureSpec.getSize(i9) * 0.55f);
            ((ViewGroup.MarginLayoutParams) w8Var.f34144r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.f34144r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i9) * 0.45f);
            ((ViewGroup.MarginLayoutParams) w8Var.f34138a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) w8Var.f34147x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.f34144r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.f34144r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.f34138a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.f34147x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z12 = w8Var.H;
        if (this.f34780f >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        w8Var.H = z11;
        if (z12 != z11) {
            super.onMeasure(i9, i10);
            if (w8Var.H) {
                kVar = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
                i11 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-w8Var.f34139b.getTop());
            } else {
                i11 = 0;
            }
            ta1 ta1Var = w8Var.f34144r;
            ta1Var.setTranslationY((ta1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) w8Var.f34144r.getLayoutParams()).topMargin) - i11);
            ((ViewGroup.MarginLayoutParams) w8Var.f34144r.getLayoutParams()).topMargin = i11;
            boolean z13 = w8Var.H;
            if (!w8Var.Q) {
                float f12 = w8Var.J;
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.I = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((w8Var.d - w8Var.f34140c) - AndroidUtilities.statusBarHeight) * w8Var.A;
                if (z13) {
                    w8Var.f34138a.setExpanded(false);
                    f13 = w8Var.f34144r.getTranslationY();
                } else {
                    f11 = w8Var.f34144r.getTranslationY();
                }
                if (w8Var.B && !z13) {
                    w8Var.f34138a.setExpanded(true);
                } else {
                    w8Var.B = false;
                }
                w8Var.I.addUpdateListener(new r8(w8Var, f13, f11, z13));
                w8Var.I.addListener(new l8(w8Var, 1));
                w8Var.I.setDuration(250L);
                w8Var.I.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                w8Var.I.start();
            }
        }
        super.onMeasure(i9, i10);
        w8Var.f34140c = w8Var.f34138a.getMeasuredHeight();
        w8Var.d = w8Var.f34138a.getMeasuredWidth();
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
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        w8 w8Var = this.f31322t0;
        if (w8Var.J <= 0.0f && !w8Var.Q && i10 > 0 && w8Var.A > 0.0f) {
            w8Var.c0();
            w8Var.h0(Utilities.clamp(w8Var.A - (i10 / w8Var.d), 1.0f, 0.0f), true);
            iArr[1] = i10;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        w8 w8Var = this.f31322t0;
        if (w8Var.J <= 0.0f && !w8Var.Q && i12 != 0) {
            w8Var.c0();
            w8Var.h0(Utilities.clamp(w8Var.A - (i12 / w8Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        this.f31321s0.f4376a = i9;
        this.f31322t0.c0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        w8 w8Var = this.f31322t0;
        if (w8Var.J <= 0.0f && !w8Var.Q) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f31321s0.f4376a = 0;
        w8 w8Var = this.f31322t0;
        if (w8Var.A > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8Var.f0(z10, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        w8 w8Var = this.f31327y0;
        if (!w8Var.G.b(motionEvent)) {
            if (!w8Var.Q) {
                if (motionEvent.getAction() == 0) {
                    q8 q8Var = w8Var.f34139b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    q8Var.getHitRect(rect);
                    rect.offset(0, (int) w8Var.f34144r.getY());
                    if (w8Var.J == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f31323u0 = true;
                        motionEvent.getX();
                        this.f31326x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z11 = this.f31323u0) || this.f31324v0)) {
                    if (z11) {
                        if (Math.abs(this.f31326x0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f31323u0 = false;
                            this.f31324v0 = true;
                            this.f31325w0 = w8Var.A;
                            motionEvent.getX();
                            this.f31326x0 = motionEvent.getY();
                        }
                    } else {
                        w8Var.h0(Utilities.clamp(((-(this.f31326x0 - motionEvent.getY())) / w8Var.d) + this.f31325w0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f31324v0) {
                        if (w8Var.A > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w8Var.f0(z10, false, false);
                    }
                    this.f31323u0 = false;
                    this.f31324v0 = false;
                }
            }
            if (!this.f31324v0 && !super.onTouchEvent(motionEvent) && !this.f31323u0) {
                return false;
            }
        }
        return true;
    }
}
