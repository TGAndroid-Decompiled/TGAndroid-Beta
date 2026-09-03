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
public final class ch0 extends FrameLayout {
    public float B;
    public ValueAnimator C;
    public int D;
    public AnimationNotificationsLocker E;
    public org.telegram.ui.ActionBar.g6 F;
    public int G;
    public ah0 H;
    public Rect I;
    public float J;
    public float K;
    public Runnable L;
    public boolean M;
    public SparseIntArray f25940a;
    public float f25941b;
    public float f25942c;
    public org.telegram.ui.Cells.f1 d;
    public boolean f25943e;
    public boolean f25944f;
    public boolean h;
    public Paint f25945n;
    public Paint f25946r;
    public int f25947s;
    public Path v;
    public RectF f25948w;
    public ArrayList f25949x;
    public boolean f25950y;

    public final void a(float f10, float f11) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.f25941b, f10).setDuration(Math.max(0.5f, Math.abs(this.f25941b - f10) - Math.min(0.2f, f11)) * 300.0f);
        duration.setInterpolator(pr.f30168f);
        this.E.lock();
        duration.addUpdateListener(new zg0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 5));
        duration.start();
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        c(true);
    }

    public final void b(boolean z4) {
        if (this.f25944f) {
            return;
        }
        if (!z4) {
            this.D = -1;
            this.f25941b = 0.0f;
            c(true);
            return;
        }
        a(0.0f, 0.0f);
    }

    public final void c(boolean z4) {
        View view;
        float f10;
        float f11;
        ArrayList arrayList = this.f25949x;
        if (this.J != this.f25942c || this.K != this.f25941b) {
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((bh0) arrayList.get(i10)).a(this.f25942c, this.f25941b);
                }
            }
            this.J = this.f25942c;
            this.K = this.f25941b;
        }
        View childAt = getChildAt(0);
        int i11 = this.D;
        if (i11 >= 0 && i11 < getChildCount()) {
            view = getChildAt(this.D);
        } else {
            view = null;
        }
        childAt.setTranslationX((-this.f25941b) * getWidth() * 0.5f);
        float f12 = ((1.0f - this.f25941b) * 0.05f) + 0.95f;
        childAt.setScaleX(f12);
        childAt.setScaleY(f12);
        if (view != null) {
            view.setTranslationX((1.0f - this.f25941b) * getWidth());
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            if (i12 == 0) {
                if (this.f25941b == 1.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f25941b != 1.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else if (i12 == this.D) {
                if (this.f25941b == 0.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f25941b != 0.0f && childAt2.getVisibility() != 0) {
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
            f11 = this.B;
            if (f11 == 0.0f) {
                f11 = view.getMeasuredHeight();
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
            float f13 = this.f25941b;
            float f14 = ((f10 - measuredWidth) * f13) + measuredWidth;
            float w10 = e2.c.w(f11, measuredHeight, f13, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
            actionBarPopupWindow$ActionBarPopupWindowLayout.f21157a = false;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f14 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            if (z4) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, w10 / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.f21157a = true;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt3 = getChildAt(i13);
                childAt3.setPivotX(0.0f);
                childAt3.setPivotY(0.0f);
            }
            invalidate();
        }
    }

    public final boolean d(MotionEvent motionEvent, View view) {
        Rect rect = this.I;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof org.telegram.ui.ActionBar.d1))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (d(motionEvent, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.v;
        RectF rectF = this.f25948w;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            float top = childAt.getTop();
            float measuredWidth = childAt.getMeasuredWidth();
            float measuredHeight = childAt.getMeasuredHeight();
            int i10 = this.D;
            if (i10 != -1 && i10 < getChildCount()) {
                View childAt2 = getChildAt(this.D);
                float top2 = childAt2.getTop();
                float measuredWidth2 = childAt2.getMeasuredWidth();
                float f10 = this.B;
                if (f10 == 0.0f) {
                    f10 = childAt2.getMeasuredHeight();
                }
                if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                    top = AndroidUtilities.lerp(top, top2, this.f25941b);
                    measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.f25941b);
                    measuredHeight = AndroidUtilities.lerp(measuredHeight, f10, this.f25941b);
                }
            }
            int save = canvas.save();
            path.rewind();
            int dp = AndroidUtilities.dp(12.0f);
            if (this.M) {
                rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
            } else {
                rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
            }
            float f11 = dp;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            if (this.H != null && this.G != rectF.height()) {
                ah0 ah0Var = this.H;
                int height = (int) rectF.height();
                this.G = height;
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) ((org.telegram.ui.gu) ah0Var).f37164b;
                org.telegram.ui.ActionBar.p2 p2Var = p2VarArr[0];
                if (p2Var != null && p2Var.getFragmentView() != null && p2VarArr[0].isInPreviewMode()) {
                    ViewGroup.LayoutParams layoutParams = p2VarArr[0].getFragmentView().getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + height;
                        p2VarArr[0].getFragmentView().setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        float f10;
        RectF rectF = this.f25948w;
        int action = motionEvent.getAction() & 255;
        if (this.f25944f) {
            z4 = true;
        } else if (!((GestureDetector) this.d.f22790b).onTouchEvent(motionEvent) && (action == 1 || action == 3)) {
            if (this.f25943e) {
                this.f25943e = false;
                this.h = false;
                if (this.f25941b >= 0.5f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a(f10, 0.0f);
            } else if (this.h) {
                this.f25943e = false;
                this.h = false;
            }
            z4 = false;
        } else {
            z4 = this.f25943e;
        }
        if (!z4) {
            int actionMasked = motionEvent.getActionMasked();
            if (rectF != null) {
                rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
            if (actionMasked == 0 && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                callOnClick();
                return true;
            }
            int i10 = this.D;
            if (i10 >= 0 && i10 < getChildCount()) {
                View childAt = getChildAt(0);
                View childAt2 = getChildAt(this.D);
                if (this.f25941b > 0.5f) {
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
        Paint paint = this.f25945n;
        Paint paint2 = this.f25946r;
        int indexOfChild = indexOfChild(view);
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i10 = this.f25947s;
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, this.F));
            } else {
                paint2.setColor(i10);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.f25941b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(int i10) {
        if (this.f25944f) {
            return;
        }
        this.D = i10;
        this.B = this.f25940a.get(i10);
        a(1.0f, 0.0f);
    }

    public final void f(int i10, int i11, boolean z4) {
        this.f25940a.put(i10, i11);
        int i12 = this.D;
        if (i10 == i12 && i12 >= 0 && i12 < getChildCount()) {
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.C = null;
            }
            if (z4) {
                View childAt = getChildAt(this.D);
                float f10 = this.B;
                if (f10 == 0.0f) {
                    f10 = childAt.getMeasuredHeight();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f10, i11).setDuration(240L);
                duration.setInterpolator(jt.f28179e);
                duration.addUpdateListener(new zg0(this, 1));
                this.f25944f = true;
                duration.addListener(new pd0(this, 3));
                duration.start();
                this.C = duration;
                return;
            }
            this.B = i11;
            c(true);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.M) {
                    int i15 = i12 - i10;
                    int i16 = i13 - i11;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), i16 - childAt.getMeasuredHeight(), i15, i16);
                } else {
                    int i17 = i13 - i11;
                    childAt.layout(0, i17 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i17);
                }
            } else if (this.M) {
                int i18 = i12 - i10;
                childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        c(true);
    }

    public void setForegroundColor(int i10) {
        this.f25947s = i10;
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.L = runnable;
    }

    public void setOnHeightUpdateListener(ah0 ah0Var) {
        this.H = ah0Var;
    }

    public void setStickToRight(boolean z4) {
        this.M = z4;
    }

    public void setSwipeBackDisallowed(boolean z4) {
        this.f25950y = z4;
    }
}
