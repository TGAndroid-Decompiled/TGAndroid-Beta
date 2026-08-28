package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fg0 extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public int C;
    public AnimationNotificationsLocker D;
    public org.telegram.ui.ActionBar.b6 E;
    public int F;
    public dg0 G;
    public Rect H;
    public float I;
    public float J;
    public Runnable K;
    public boolean L;
    public SparseIntArray f28416a;
    public float f28417b;
    public float f28418c;
    public m5.c0 d;
    public boolean f28419e;
    public boolean f28420f;
    public boolean h;
    public Paint f28421n;
    public Paint f28422r;
    public int f28423s;
    public Path v;
    public RectF f28424w;
    public ArrayList f28425x;
    public boolean f28426y;

    public final void a(float f10, float f11) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.f28417b, f10).setDuration(Math.max(0.5f, Math.abs(this.f28417b - f10) - Math.min(0.2f, f11)) * 300.0f);
        duration.setInterpolator(gr.f28844f);
        this.D.lock();
        duration.addUpdateListener(new cg0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 5));
        duration.start();
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        c(true);
    }

    public final void b(boolean z10) {
        if (this.f28420f) {
            return;
        }
        if (!z10) {
            this.C = -1;
            this.f28417b = 0.0f;
            c(true);
            return;
        }
        a(0.0f, 0.0f);
    }

    public final void c(boolean z10) {
        View view;
        float f10;
        float f11;
        ArrayList arrayList = this.f28425x;
        if (this.I != this.f28418c || this.J != this.f28417b) {
            if (!arrayList.isEmpty()) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((eg0) arrayList.get(i9)).a(this.f28418c, this.f28417b);
                }
            }
            this.I = this.f28418c;
            this.J = this.f28417b;
        }
        View childAt = getChildAt(0);
        int i10 = this.C;
        if (i10 >= 0 && i10 < getChildCount()) {
            view = getChildAt(this.C);
        } else {
            view = null;
        }
        childAt.setTranslationX((-this.f28417b) * getWidth() * 0.5f);
        float f12 = ((1.0f - this.f28417b) * 0.05f) + 0.95f;
        childAt.setScaleX(f12);
        childAt.setScaleY(f12);
        if (view != null) {
            view.setTranslationX((1.0f - this.f28417b) * getWidth());
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            if (i11 == 0) {
                if (this.f28417b == 1.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f28417b != 1.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else if (i11 == this.C) {
                if (this.f28417b == 0.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f28417b != 0.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else {
                childAt2.setVisibility(4);
            }
        }
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        if (view != null) {
            f10 = view.getMeasuredWidth();
            f11 = this.A;
            if (f11 == 0.0f) {
                f11 = view.getMeasuredHeight();
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
            float f13 = this.f28417b;
            float f14 = ((f10 - measuredWidth) * f13) + measuredWidth;
            float z11 = e2.c.z(f11, measuredHeight, f13, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22691a = false;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f14 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, z11 / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22691a = true;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt3 = getChildAt(i12);
                childAt3.setPivotX(0.0f);
                childAt3.setPivotY(0.0f);
            }
            invalidate();
        }
    }

    public final boolean d(MotionEvent motionEvent, View view) {
        Rect rect = this.H;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof org.telegram.ui.ActionBar.d1))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                if (d(motionEvent, viewGroup.getChildAt(i9))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.v;
        RectF rectF = this.f28424w;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            float top = childAt.getTop();
            float measuredWidth = childAt.getMeasuredWidth();
            float measuredHeight = childAt.getMeasuredHeight();
            int i9 = this.C;
            if (i9 != -1 && i9 < getChildCount()) {
                View childAt2 = getChildAt(this.C);
                float top2 = childAt2.getTop();
                float measuredWidth2 = childAt2.getMeasuredWidth();
                float f10 = this.A;
                if (f10 == 0.0f) {
                    f10 = childAt2.getMeasuredHeight();
                }
                if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                    top = AndroidUtilities.lerp(top, top2, this.f28417b);
                    measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.f28417b);
                    measuredHeight = AndroidUtilities.lerp(measuredHeight, f10, this.f28417b);
                }
            }
            int save = canvas.save();
            path.rewind();
            int dp = AndroidUtilities.dp(12.0f);
            if (this.L) {
                rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
            } else {
                rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
            }
            float f11 = dp;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            if (this.G != null && this.F != rectF.height()) {
                dg0 dg0Var = this.G;
                int height = (int) rectF.height();
                this.F = height;
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) ((org.telegram.ui.wt) dg0Var).f44257b;
                org.telegram.ui.ActionBar.o2 o2Var = o2VarArr[0];
                if (o2Var != null && o2Var.getFragmentView() != null && o2VarArr[0].isInPreviewMode()) {
                    ViewGroup.LayoutParams layoutParams = o2VarArr[0].getFragmentView().getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + height;
                        o2VarArr[0].getFragmentView().setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f10;
        RectF rectF = this.f28424w;
        int action = motionEvent.getAction() & 255;
        if (this.f28420f) {
            z10 = true;
        } else if (!((GestureDetector) this.d.f17378b).onTouchEvent(motionEvent) && (action == 1 || action == 3)) {
            if (this.f28419e) {
                this.f28419e = false;
                this.h = false;
                if (this.f28417b >= 0.5f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a(f10, 0.0f);
            } else if (this.h) {
                this.f28419e = false;
                this.h = false;
            }
            z10 = false;
        } else {
            z10 = this.f28419e;
        }
        if (!z10) {
            int actionMasked = motionEvent.getActionMasked();
            if (rectF != null) {
                rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
            if (actionMasked == 0 && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                callOnClick();
                return true;
            }
            int i9 = this.C;
            if (i9 >= 0 && i9 < getChildCount()) {
                View childAt = getChildAt(0);
                View childAt2 = getChildAt(this.C);
                if (this.f28417b > 0.5f) {
                    childAt = childAt2;
                }
                boolean dispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent);
                if ((dispatchTouchEvent || actionMasked != 0) && !dispatchTouchEvent && !onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Paint paint = this.f28421n;
        Paint paint2 = this.f28422r;
        int indexOfChild = indexOfChild(view);
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i9 = this.f28423s;
            if (i9 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, this.E));
            } else {
                paint2.setColor(i9);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.f28417b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(int i9) {
        if (this.f28420f) {
            return;
        }
        this.C = i9;
        this.A = this.f28416a.get(i9);
        a(1.0f, 0.0f);
    }

    public final void f(int i9, int i10, boolean z10) {
        this.f28416a.put(i9, i10);
        int i11 = this.C;
        if (i9 == i11 && i11 >= 0 && i11 < getChildCount()) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.B = null;
            }
            if (z10) {
                View childAt = getChildAt(this.C);
                float f10 = this.A;
                if (f10 == 0.0f) {
                    f10 = childAt.getMeasuredHeight();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f10, i10).setDuration(240L);
                duration.setInterpolator(xs.f34754e);
                duration.addUpdateListener(new cg0(this, 1));
                this.f28420f = true;
                duration.addListener(new r60(this, 10));
                duration.start();
                this.B = duration;
                return;
            }
            this.A = i10;
            c(true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.L) {
                    int i14 = i11 - i9;
                    int i15 = i12 - i10;
                    childAt.layout(i14 - childAt.getMeasuredWidth(), i15 - childAt.getMeasuredHeight(), i14, i15);
                } else {
                    int i16 = i12 - i10;
                    childAt.layout(0, i16 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i16);
                }
            } else if (this.L) {
                int i17 = i11 - i9;
                childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        c(true);
    }

    public void setForegroundColor(int i9) {
        this.f28423s = i9;
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.K = runnable;
    }

    public void setOnHeightUpdateListener(dg0 dg0Var) {
        this.G = dg0Var;
    }

    public void setStickToRight(boolean z10) {
        this.L = z10;
    }

    public void setSwipeBackDisallowed(boolean z10) {
        this.f28426y = z10;
    }
}
