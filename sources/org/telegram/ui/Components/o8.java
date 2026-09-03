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
import org.telegram.ui.ob1;
public final class o8 extends pv0 {
    public final c5.e f29691t0;
    public final w8 f29692u0;
    public boolean f29693v0;
    public boolean f29694w0;
    public float f29695x0;
    public float f29696y0;
    public final w8 f29697z0;

    public o8(w8 w8Var, Context context) {
        super(context, null);
        this.f29697z0 = w8Var;
        this.f29692u0 = w8Var;
        this.f29691t0 = new Object();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        w8 w8Var = this.f29697z0;
        if (!w8Var.R) {
            if (!w8Var.h) {
                canvas.save();
                float x10 = w8Var.f32675a.getX() + w8Var.f32681r.getX();
                float y10 = w8Var.f32675a.getY() + w8Var.f32681r.getY();
                int i10 = w8Var.d - w8Var.f32677c;
                float lerp = AndroidUtilities.lerp(y10, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w8Var.f32677c) >> 1), w8Var.K);
                canvas.translate(x10, lerp);
                w8Var.f32675a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = i10 / 2.0f;
                rectF.set(x10, lerp - (w8Var.B * f11), w8Var.f32675a.getMeasuredWidth() + x10, (f11 * w8Var.B) + w8Var.f32675a.getMeasuredHeight() + lerp);
                p8 p8Var = w8Var.f32675a;
                float f12 = x10 + p8Var.f31828y;
                float f13 = lerp + p8Var.B;
                xc xcVar = w8Var.H;
                float f14 = p8Var.f31827x;
                xcVar.getClass();
                rectF.set((int) (f12 - f14), (int) (f13 - f14), (int) (f12 + f14), (int) (f13 + f14));
                xcVar.f33023i = false;
                xcVar.f33019c = 0;
                xcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f15 = w8Var.f32675a.f31825s.f33763c;
            if (w8Var.f32678e.getVisibility() == 0) {
                f10 = w8Var.f32678e.getAlpha();
            } else {
                f10 = 0.0f;
            }
            float f16 = (1.0f - f10) * f15;
            if (f16 != 0.0f) {
                w8Var.E.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(w8Var.E.getX(), w8Var.E.getY());
                if (f16 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, w8Var.E.getMeasuredWidth(), w8Var.E.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                w8Var.E.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                w8Var.E.setVisibility(8);
            }
        }
        if (w8Var.f32679f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        w8 w8Var = this.f29697z0;
        Paint paint = w8Var.L;
        if (view != w8Var.E) {
            kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
            if (view == kVar && w8Var.K > 0.0f) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                paint.setAlpha((int) (w8Var.K * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) w8Var.getParentLayout()).p(canvas2, (int) (w8Var.K * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j10);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        c5.e eVar = this.f29691t0;
        return eVar.f2269b | eVar.f2268a;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29697z0.K == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        boolean z10;
        int i12;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        R();
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f30205f) {
            z4 = true;
        } else {
            z4 = false;
        }
        w8 w8Var = this.f29697z0;
        float f11 = 0.0f;
        if (z4 != w8Var.R) {
            w8Var.R = z4;
            AndroidUtilities.removeFromParent(w8Var.f32675a);
            AndroidUtilities.requestAdjustNothing(w8Var.getParentActivity(), w8Var.getClassGuid());
            if (w8Var.R) {
                w8Var.i0(0.0f, false);
                w8Var.f32675a.setExpanded(false);
                addView(w8Var.f32675a, 0, k7.c6.c(-1.0f, -1));
            } else {
                w8Var.f32681r.addView(w8Var.f32675a, 0, k7.c6.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        }
        if (w8Var.R) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) w8Var.f32681r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.f32681r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            ((ViewGroup.MarginLayoutParams) w8Var.f32675a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) w8Var.f32684x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) w8Var.T.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.f32681r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.f32681r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.f32675a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.f32684x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.T.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = w8Var.I;
        if (this.f30205f >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8Var.I = z10;
        if (z11 != z10) {
            super.onMeasure(i10, i11);
            if (w8Var.I) {
                kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
                i12 = AndroidUtilities.dp(8.0f) + kVar.getMeasuredHeight() + (-w8Var.f32676b.getTop());
            } else {
                i12 = 0;
            }
            ob1 ob1Var = w8Var.f32681r;
            ob1Var.setTranslationY((ob1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) w8Var.f32681r.getLayoutParams()).topMargin) - i12);
            ((ViewGroup.MarginLayoutParams) w8Var.f32681r.getLayoutParams()).topMargin = i12;
            boolean z12 = w8Var.I;
            if (!w8Var.R) {
                float f12 = w8Var.K;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.J = ValueAnimator.ofFloat(f12, f10);
                float f13 = ((w8Var.d - w8Var.f32677c) - AndroidUtilities.statusBarHeight) * w8Var.B;
                if (z12) {
                    w8Var.f32675a.setExpanded(false);
                    f13 = w8Var.f32681r.getTranslationY();
                } else {
                    f11 = w8Var.f32681r.getTranslationY();
                }
                if (w8Var.C && !z12) {
                    w8Var.f32675a.setExpanded(true);
                } else {
                    w8Var.C = false;
                }
                w8Var.J.addUpdateListener(new r8(w8Var, f13, f11, z12));
                w8Var.J.addListener(new l8(w8Var, 1));
                w8Var.J.setDuration(250L);
                w8Var.J.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                w8Var.J.start();
            }
        }
        super.onMeasure(i10, i11);
        w8Var.f32677c = w8Var.f32675a.getMeasuredHeight();
        w8Var.d = w8Var.f32675a.getMeasuredWidth();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        w8 w8Var = this.f29692u0;
        if (w8Var.K <= 0.0f && !w8Var.R && i11 > 0 && w8Var.B > 0.0f) {
            w8Var.d0();
            w8Var.i0(Utilities.clamp(w8Var.B - (i11 / w8Var.d), 1.0f, 0.0f), true);
            iArr[1] = i11;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        w8 w8Var = this.f29692u0;
        if (w8Var.K <= 0.0f && !w8Var.R && i13 != 0) {
            w8Var.d0();
            w8Var.i0(Utilities.clamp(w8Var.B - (i13 / w8Var.d), 1.0f, 0.0f), true);
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f29691t0.f2268a = i10;
        this.f29692u0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        w8 w8Var = this.f29692u0;
        if (w8Var.K <= 0.0f && !w8Var.R) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z4;
        this.f29691t0.f2268a = 0;
        w8 w8Var = this.f29692u0;
        if (w8Var.B > 0.5f) {
            z4 = true;
        } else {
            z4 = false;
        }
        w8Var.g0(z4, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        w8 w8Var = this.f29697z0;
        if (!w8Var.H.b(motionEvent)) {
            if (!w8Var.R) {
                if (motionEvent.getAction() == 0) {
                    q8 q8Var = w8Var.f32676b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    q8Var.getHitRect(rect);
                    rect.offset(0, (int) w8Var.f32681r.getY());
                    if (w8Var.K == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f29693v0 = true;
                        motionEvent.getX();
                        this.f29696y0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.f29693v0) || this.f29694w0)) {
                    if (z10) {
                        if (Math.abs(this.f29696y0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                            this.f29693v0 = false;
                            this.f29694w0 = true;
                            this.f29695x0 = w8Var.B;
                            motionEvent.getX();
                            this.f29696y0 = motionEvent.getY();
                        }
                    } else {
                        w8Var.i0(Utilities.clamp(((-(this.f29696y0 - motionEvent.getY())) / w8Var.d) + this.f29695x0, 1.0f, 0.0f), true);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f29694w0) {
                        if (w8Var.B > 0.5f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        w8Var.g0(z4, false, false);
                    }
                    this.f29693v0 = false;
                    this.f29694w0 = false;
                }
            }
            if (!this.f29694w0 && !super.onTouchEvent(motionEvent) && !this.f29693v0) {
                return false;
            }
        }
        return true;
    }
}
