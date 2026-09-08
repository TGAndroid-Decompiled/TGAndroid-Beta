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
public final class ug0 extends FrameLayout {
    public float E;
    public ValueAnimator F;
    public int G;
    public AnimationNotificationsLocker H;
    public org.telegram.ui.ActionBar.f6 I;
    public int J;
    public sg0 K;
    public Rect L;
    public float M;
    public float N;
    public Runnable O;
    public boolean P;
    public SparseIntArray f30914a;
    public float f30915b;
    public float f30916c;
    public l.d d;
    public boolean f30917e;
    public boolean f30918f;
    public boolean h;
    public Paint f30919n;
    public Paint f30920r;
    public int f30921s;
    public Path v;
    public RectF f30922w;
    public ArrayList f30923x;
    public boolean f30924y;

    public final void a(float f7, float f10) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.f30915b, f7).setDuration(Math.max(0.5f, Math.abs(this.f30915b - f7) - Math.min(0.2f, f10)) * 300.0f);
        duration.setInterpolator(pr.f29493f);
        this.H.lock();
        duration.addUpdateListener(new rg0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 5));
        duration.start();
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        c(true);
    }

    public final void b(boolean z10) {
        if (this.f30918f) {
            return;
        }
        if (!z10) {
            this.G = -1;
            this.f30915b = 0.0f;
            c(true);
            return;
        }
        a(0.0f, 0.0f);
    }

    public final void c(boolean z10) {
        View view;
        float f7;
        float f10;
        ArrayList arrayList = this.f30923x;
        if (this.M != this.f30916c || this.N != this.f30915b) {
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((tg0) arrayList.get(i10)).a(this.f30916c, this.f30915b);
                }
            }
            this.M = this.f30916c;
            this.N = this.f30915b;
        }
        View childAt = getChildAt(0);
        int i11 = this.G;
        if (i11 >= 0 && i11 < getChildCount()) {
            view = getChildAt(this.G);
        } else {
            view = null;
        }
        childAt.setTranslationX((-this.f30915b) * getWidth() * 0.5f);
        float f11 = ((1.0f - this.f30915b) * 0.05f) + 0.95f;
        childAt.setScaleX(f11);
        childAt.setScaleY(f11);
        if (view != null) {
            view.setTranslationX((1.0f - this.f30915b) * getWidth());
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            if (i12 == 0) {
                if (this.f30915b == 1.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f30915b != 1.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else if (i12 == this.G) {
                if (this.f30915b == 0.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.f30915b != 0.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else {
                childAt2.setVisibility(4);
            }
        }
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        if (view != null) {
            f7 = view.getMeasuredWidth();
            f10 = this.E;
            if (f10 == 0.0f) {
                f10 = view.getMeasuredHeight();
            }
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
            float f12 = this.f30915b;
            float f13 = ((f7 - measuredWidth) * f12) + measuredWidth;
            float z11 = com.google.android.gms.internal.vision.e2.z(f10, measuredHeight, f12, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
            actionBarPopupWindow$ActionBarPopupWindowLayout.f20214a = false;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f13 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, z11 / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.f20214a = true;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt3 = getChildAt(i13);
                childAt3.setPivotX(0.0f);
                childAt3.setPivotY(0.0f);
            }
            invalidate();
        }
    }

    public final boolean d(MotionEvent motionEvent, View view) {
        Rect rect = this.L;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof org.telegram.ui.ActionBar.c1))) {
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
        RectF rectF = this.f30922w;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            float top = childAt.getTop();
            float measuredWidth = childAt.getMeasuredWidth();
            float measuredHeight = childAt.getMeasuredHeight();
            int i10 = this.G;
            if (i10 != -1 && i10 < getChildCount()) {
                View childAt2 = getChildAt(this.G);
                float top2 = childAt2.getTop();
                float measuredWidth2 = childAt2.getMeasuredWidth();
                float f7 = this.E;
                if (f7 == 0.0f) {
                    f7 = childAt2.getMeasuredHeight();
                }
                if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                    top = AndroidUtilities.lerp(top, top2, this.f30915b);
                    measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.f30915b);
                    measuredHeight = AndroidUtilities.lerp(measuredHeight, f7, this.f30915b);
                }
            }
            int save = canvas.save();
            path.rewind();
            int dp = AndroidUtilities.dp(12.0f);
            if (this.P) {
                rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
            } else {
                rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
            }
            float f10 = dp;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            if (this.K != null && this.J != rectF.height()) {
                sg0 sg0Var = this.K;
                int height = (int) rectF.height();
                this.J = height;
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) ((org.telegram.ui.iu) sg0Var).f37465b;
                org.telegram.ui.ActionBar.n2 n2Var = n2VarArr[0];
                if (n2Var != null && n2Var.getFragmentView() != null && n2VarArr[0].isInPreviewMode()) {
                    ViewGroup.LayoutParams layoutParams = n2VarArr[0].getFragmentView().getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + height;
                        n2VarArr[0].getFragmentView().setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        RectF rectF = this.f30922w;
        int action = motionEvent.getAction() & 255;
        if (this.f30918f) {
            z10 = true;
        } else if (!((GestureDetector) this.d.f15098b).onTouchEvent(motionEvent) && (action == 1 || action == 3)) {
            if (this.f30917e) {
                this.f30917e = false;
                this.h = false;
                if (this.f30915b >= 0.5f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                a(f7, 0.0f);
            } else if (this.h) {
                this.f30917e = false;
                this.h = false;
            }
            z10 = false;
        } else {
            z10 = this.f30917e;
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
            int i10 = this.G;
            if (i10 >= 0 && i10 < getChildCount()) {
                View childAt = getChildAt(0);
                View childAt2 = getChildAt(this.G);
                if (this.f30915b > 0.5f) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Paint paint = this.f30919n;
        Paint paint2 = this.f30920r;
        int indexOfChild = indexOfChild(view);
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i10 = this.f30921s;
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.I));
            } else {
                paint2.setColor(i10);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.f30915b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(int i10) {
        if (this.f30918f) {
            return;
        }
        this.G = i10;
        this.E = this.f30914a.get(i10);
        a(1.0f, 0.0f);
    }

    public final void f(int i10, int i11, boolean z10) {
        this.f30914a.put(i10, i11);
        int i12 = this.G;
        if (i10 == i12 && i12 >= 0 && i12 < getChildCount()) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            if (z10) {
                View childAt = getChildAt(this.G);
                float f7 = this.E;
                if (f7 == 0.0f) {
                    f7 = childAt.getMeasuredHeight();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f7, i11).setDuration(240L);
                duration.setInterpolator(jt.f27595e);
                duration.addUpdateListener(new rg0(this, 1));
                this.f30918f = true;
                duration.addListener(new r80(this, 7));
                duration.start();
                this.F = duration;
                return;
            }
            this.E = i11;
            c(true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.P) {
                    int i15 = i12 - i10;
                    int i16 = i13 - i11;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), i16 - childAt.getMeasuredHeight(), i15, i16);
                } else {
                    int i17 = i13 - i11;
                    childAt.layout(0, i17 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i17);
                }
            } else if (this.P) {
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
        this.f30921s = i10;
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.O = runnable;
    }

    public void setOnHeightUpdateListener(sg0 sg0Var) {
        this.K = sg0Var;
    }

    public void setStickToRight(boolean z10) {
        this.P = z10;
    }

    public void setSwipeBackDisallowed(boolean z10) {
        this.f30924y = z10;
    }
}
