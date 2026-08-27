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
import org.telegram.ui.ra1;

public final class n8 extends zu0 {

    public final d5.p f30891s0;

    public final v8 f30892t0;

    public boolean f30893u0;

    public boolean f30894v0;

    public float f30895w0;

    public float f30896x0;

    public final v8 f30897y0;

    public n8(v8 v8Var, Context context) {
        super(context, null);
        this.f30897y0 = v8Var;
        this.f30892t0 = v8Var;
        this.f30891s0 = new d5.p();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iSave = canvas.save();
        super.dispatchDraw(canvas);
        v8 v8Var = this.f30897y0;
        if (!v8Var.Q) {
            if (!v8Var.h) {
                canvas.save();
                float x8 = v8Var.f33295a.getX() + v8Var.f33301r.getX();
                float y10 = v8Var.f33295a.getY() + v8Var.f33301r.getY();
                int i10 = v8Var.d - v8Var.f33297c;
                float fLerp = AndroidUtilities.lerp(y10, AndroidUtilities.statusBarHeight + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - v8Var.f33297c) >> 1), v8Var.J);
                canvas.translate(x8, fLerp);
                v8Var.f33295a.draw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = i10 / 2.0f;
                rectF.set(x8, fLerp - (v8Var.A * f10), v8Var.f33295a.getMeasuredWidth() + x8, (f10 * v8Var.A) + v8Var.f33295a.getMeasuredHeight() + fLerp);
                o8 o8Var = v8Var.f33295a;
                float f11 = x8 + o8Var.f33012y;
                float f12 = fLerp + o8Var.A;
                tc tcVar = v8Var.G;
                float f13 = o8Var.f33011x;
                tcVar.getClass();
                rectF.set((int) (f11 - f13), (int) (f12 - f13), (int) (f11 + f13), (int) (f12 + f13));
                tcVar.f32735i = false;
                tcVar.f32731c = 0;
                tcVar.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(iSave);
            float alpha = (1.0f - (v8Var.f33298e.getVisibility() == 0 ? v8Var.f33298e.getAlpha() : 0.0f)) * v8Var.f33295a.f33009s.f34812c;
            if (alpha != 0.0f) {
                v8Var.D.setVisibility(0);
                int iSave2 = canvas.save();
                canvas.translate(v8Var.D.getX(), v8Var.D.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, v8Var.D.getMeasuredWidth(), v8Var.D.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                v8Var.D.draw(canvas2);
                canvas2.restoreToCount(iSave2);
            } else {
                v8Var.D.setVisibility(8);
            }
        }
        if (v8Var.f33299f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        v8 v8Var = this.f30897y0;
        Paint paint = v8Var.K;
        if (view == v8Var.D) {
            return true;
        }
        if (view != ((org.telegram.ui.ActionBar.n2) v8Var).actionBar || v8Var.J <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            paint.setAlpha((int) (v8Var.J * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) v8Var.getParentLayout()).p(canvas2, (int) (v8Var.J * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j10);
    }

    @Override
    public final int getNestedScrollAxes() {
        d5.p pVar = this.f30891s0;
        return pVar.f4822b | pVar.f4821a;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30897y0.J == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        R();
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11) + this.f35375f;
        v8 v8Var = this.f30897y0;
        float translationY = 0.0f;
        if (z10 != v8Var.Q) {
            v8Var.Q = z10;
            AndroidUtilities.removeFromParent(v8Var.f33295a);
            AndroidUtilities.requestAdjustNothing(v8Var.getParentActivity(), v8Var.getClassGuid());
            if (v8Var.Q) {
                v8Var.i0(0.0f, false);
                v8Var.f33295a.setExpanded(false);
                addView(v8Var.f33295a, 0, h7.z5.c(-1.0f, -1));
            } else {
                v8Var.f33301r.addView(v8Var.f33295a, 0, h7.z5.c(-2.0f, -1));
            }
            AndroidUtilities.requestAdjustResize(v8Var.getParentActivity(), v8Var.getClassGuid());
        }
        if (v8Var.Q) {
            int size = (int) (View.MeasureSpec.getSize(i10) * 0.45f);
            int size2 = (int) (View.MeasureSpec.getSize(i10) * 0.55f);
            ((ViewGroup.MarginLayoutParams) v8Var.f33301r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.f33301r.getLayoutParams()).leftMargin = size;
            ((ViewGroup.MarginLayoutParams) v8Var.f33295a.getLayoutParams()).rightMargin = size2;
            ((ViewGroup.MarginLayoutParams) v8Var.f33304x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f) + size2;
            ((ViewGroup.MarginLayoutParams) v8Var.S.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.f33301r.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.f33301r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.f33295a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.f33304x.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(18.0f);
        }
        boolean z11 = v8Var.H;
        boolean z12 = this.f35375f >= AndroidUtilities.dp(20.0f);
        v8Var.H = z12;
        if (z11 != z12) {
            super.onMeasure(i10, i11);
            int iDp = v8Var.H ? AndroidUtilities.dp(8.0f) + ((org.telegram.ui.ActionBar.n2) v8Var).actionBar.getMeasuredHeight() + (-v8Var.f33296b.getTop()) : 0;
            ra1 ra1Var = v8Var.f33301r;
            ra1Var.setTranslationY((ra1Var.getTranslationY() + ((ViewGroup.MarginLayoutParams) v8Var.f33301r.getLayoutParams()).topMargin) - iDp);
            ((ViewGroup.MarginLayoutParams) v8Var.f33301r.getLayoutParams()).topMargin = iDp;
            boolean z13 = v8Var.H;
            if (!v8Var.Q) {
                v8Var.I = ValueAnimator.ofFloat(v8Var.J, z13 ? 1.0f : 0.0f);
                float translationY2 = ((v8Var.d - v8Var.f33297c) - AndroidUtilities.statusBarHeight) * v8Var.A;
                if (z13) {
                    v8Var.f33295a.setExpanded(false);
                    translationY2 = v8Var.f33301r.getTranslationY();
                } else {
                    translationY = v8Var.f33301r.getTranslationY();
                }
                if (!v8Var.B || z13) {
                    v8Var.B = false;
                } else {
                    v8Var.f33295a.setExpanded(true);
                }
                v8Var.I.addUpdateListener(new q8(v8Var, translationY2, translationY, z13));
                v8Var.I.addListener(new k8(v8Var, 1));
                v8Var.I.setDuration(250L);
                v8Var.I.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                v8Var.I.start();
            }
        }
        super.onMeasure(i10, i11);
        v8Var.f33297c = v8Var.f33295a.getMeasuredHeight();
        v8Var.d = v8Var.f33295a.getMeasuredWidth();
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
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        v8 v8Var = this.f30892t0;
        if (v8Var.J > 0.0f || v8Var.Q || i11 <= 0 || v8Var.A <= 0.0f) {
            return;
        }
        v8Var.d0();
        v8Var.i0(Utilities.clamp(v8Var.A - (i11 / v8Var.d), 1.0f, 0.0f), true);
        iArr[1] = i11;
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        v8 v8Var = this.f30892t0;
        if (v8Var.J > 0.0f || v8Var.Q || i13 == 0) {
            return;
        }
        v8Var.d0();
        v8Var.i0(Utilities.clamp(v8Var.A - (i13 / v8Var.d), 1.0f, 0.0f), true);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f30891s0.f4821a = i10;
        this.f30892t0.d0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        v8 v8Var = this.f30892t0;
        return v8Var.J <= 0.0f && !v8Var.Q;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f30891s0.f4821a = 0;
        v8 v8Var = this.f30892t0;
        v8Var.g0(v8Var.A > 0.5f, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v8 v8Var = this.f30897y0;
        if (!v8Var.G.b(motionEvent)) {
            if (!v8Var.Q) {
                if (motionEvent.getAction() == 0) {
                    p8 p8Var = v8Var.f33296b;
                    Rect rect = AndroidUtilities.rectTmp2;
                    p8Var.getHitRect(rect);
                    rect.offset(0, (int) v8Var.f33301r.getY());
                    if (v8Var.J == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f30893u0 = true;
                        motionEvent.getX();
                        this.f30896x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z10 = this.f30893u0) || this.f30894v0)) {
                    if (!z10) {
                        v8Var.i0(Utilities.clamp(((-(this.f30896x0 - motionEvent.getY())) / v8Var.d) + this.f30895w0, 1.0f, 0.0f), true);
                    } else if (Math.abs(this.f30896x0 - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.f30893u0 = false;
                        this.f30894v0 = true;
                        this.f30895w0 = v8Var.A;
                        motionEvent.getX();
                        this.f30896x0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.f30894v0) {
                        v8Var.g0(v8Var.A > 0.5f, false, false);
                    }
                    this.f30893u0 = false;
                    this.f30894v0 = false;
                }
            }
            if (!this.f30894v0 && !super.onTouchEvent(motionEvent) && !this.f30893u0) {
                return false;
            }
        }
        return true;
    }
}
