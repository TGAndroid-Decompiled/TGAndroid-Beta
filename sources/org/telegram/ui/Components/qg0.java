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
public final class qg0 extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public int C;
    public AnimationNotificationsLocker D;
    public org.telegram.ui.ActionBar.c6 E;
    public int F;
    public og0 G;
    public Rect H;
    public float I;
    public float J;
    public Runnable K;
    public boolean L;
    public SparseIntArray f31941a;
    public float f31942b;
    public float f31943c;
    public o4.g d;
    public boolean f31944e;
    public boolean f31945f;
    public boolean h;
    public Paint f31946n;
    public Paint f31947r;
    public int f31948s;
    public Path v;
    public RectF f31949w;
    public ArrayList f31950x;
    public boolean f31951y;

    public final void a(float f9, float f10) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.f31942b, f9).setDuration(Math.max(0.5f, Math.abs(this.f31942b - f9) - Math.min(0.2f, f10)) * 300.0f);
        duration.setInterpolator(jr.f29800f);
        this.D.lock();
        duration.addUpdateListener(new ng0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.a1(this, f9, 5));
        duration.start();
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        c(true);
    }

    public final void b(boolean z10) {
        if (this.f31945f) {
            return;
        }
        if (!z10) {
            this.C = -1;
            this.f31942b = 0.0f;
            c(true);
            return;
        }
        a(0.0f, 0.0f);
    }

    public final void c(boolean z10) {
        View view;
        float f9;
        float f10;
        ArrayList arrayList = this.f31950x;
        if (this.I != this.f31943c || this.J != this.f31942b) {
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((pg0) arrayList.get(i10)).a(this.f31943c, this.f31942b);
                }
            }
            this.I = this.f31943c;
            this.J = this.f31942b;
        }
        View childAt = getChildAt(0);
        int i11 = this.C;
        if (i11 >= 0 && i11 < getChildCount()) {
            view = getChildAt(this.C);
        } else {
            view = null;
        }
        childAt.setTranslationX((-this.f31942b) * getWidth() * 0.5f);
        float f11 = ((1.0f - this.f31942b) * 0.05f) + 0.95f;
        childAt.setScaleX(f11);
        childAt.setScaleY(f11);
        if (view != null) {
            view.setTranslationX((1.0f - this.f31942b) * getWidth());
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            if (i12 == 0) {
                if (this.f31942b == 1.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f31942b != 1.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else if (i12 == this.C) {
                if (this.f31942b == 0.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f31942b != 0.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else {
                childAt2.setVisibility(4);
            }
        }
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        if (view != null) {
            f9 = view.getMeasuredWidth();
            f10 = this.A;
            if (f10 == 0.0f) {
                f10 = view.getMeasuredHeight();
            }
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
            float f12 = this.f31942b;
            float f13 = ((f9 - measuredWidth) * f12) + measuredWidth;
            float z11 = com.google.android.recaptcha.internal.a.z(f10, measuredHeight, f12, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22703a = false;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f13 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, z11 / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22703a = true;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt3 = getChildAt(i13);
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
        RectF rectF = this.f31949w;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            float top = childAt.getTop();
            float measuredWidth = childAt.getMeasuredWidth();
            float measuredHeight = childAt.getMeasuredHeight();
            int i10 = this.C;
            if (i10 != -1 && i10 < getChildCount()) {
                View childAt2 = getChildAt(this.C);
                float top2 = childAt2.getTop();
                float measuredWidth2 = childAt2.getMeasuredWidth();
                float f9 = this.A;
                if (f9 == 0.0f) {
                    f9 = childAt2.getMeasuredHeight();
                }
                if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                    top = AndroidUtilities.lerp(top, top2, this.f31942b);
                    measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.f31942b);
                    measuredHeight = AndroidUtilities.lerp(measuredHeight, f9, this.f31942b);
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
            float f10 = dp;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            if (this.G != null && this.F != rectF.height()) {
                og0 og0Var = this.G;
                int height = (int) rectF.height();
                this.F = height;
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) ((org.telegram.ui.xt) og0Var).f44653b;
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
        float f9;
        RectF rectF = this.f31949w;
        int action = motionEvent.getAction() & 255;
        if (this.f31945f) {
            z10 = true;
        } else if (!((GestureDetector) this.d.f19159b).onTouchEvent(motionEvent) && (action == 1 || action == 3)) {
            if (this.f31944e) {
                this.f31944e = false;
                this.h = false;
                if (this.f31942b >= 0.5f) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                a(f9, 0.0f);
            } else if (this.h) {
                this.f31944e = false;
                this.h = false;
            }
            z10 = false;
        } else {
            z10 = this.f31944e;
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
            int i10 = this.C;
            if (i10 >= 0 && i10 < getChildCount()) {
                View childAt = getChildAt(0);
                View childAt2 = getChildAt(this.C);
                if (this.f31942b > 0.5f) {
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
        Paint paint = this.f31946n;
        Paint paint2 = this.f31947r;
        int indexOfChild = indexOfChild(view);
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i10 = this.f31948s;
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, this.E));
            } else {
                paint2.setColor(i10);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.f31942b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(int i10) {
        if (this.f31945f) {
            return;
        }
        this.C = i10;
        this.A = this.f31941a.get(i10);
        a(1.0f, 0.0f);
    }

    public final void f(int i10, int i11, boolean z10) {
        this.f31941a.put(i10, i11);
        int i12 = this.C;
        if (i10 == i12 && i12 >= 0 && i12 < getChildCount()) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.B = null;
            }
            if (z10) {
                View childAt = getChildAt(this.C);
                float f9 = this.A;
                if (f9 == 0.0f) {
                    f9 = childAt.getMeasuredHeight();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f9, i11).setDuration(240L);
                duration.setInterpolator(ct.f27567e);
                duration.addUpdateListener(new ng0(this, 1));
                this.f31945f = true;
                duration.addListener(new zz(this, 12));
                duration.start();
                this.B = duration;
                return;
            }
            this.A = i11;
            c(true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.L) {
                    int i15 = i12 - i10;
                    int i16 = i13 - i11;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), i16 - childAt.getMeasuredHeight(), i15, i16);
                } else {
                    int i17 = i13 - i11;
                    childAt.layout(0, i17 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i17);
                }
            } else if (this.L) {
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
        this.f31948s = i10;
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.K = runnable;
    }

    public void setOnHeightUpdateListener(og0 og0Var) {
        this.G = og0Var;
    }

    public void setStickToRight(boolean z10) {
        this.L = z10;
    }

    public void setSwipeBackDisallowed(boolean z10) {
        this.f31951y = z10;
    }
}
