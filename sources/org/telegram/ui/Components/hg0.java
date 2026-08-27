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

public final class hg0 extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public int C;
    public AnimationNotificationsLocker D;
    public org.telegram.ui.ActionBar.c6 E;
    public int F;
    public fg0 G;
    public Rect H;
    public float I;
    public float J;
    public Runnable K;
    public boolean L;

    public SparseIntArray f29006a;

    public float f29007b;

    public float f29008c;
    public m5.o d;

    public boolean f29009e;

    public boolean f29010f;
    public boolean h;

    public Paint f29011n;

    public Paint f29012r;

    public int f29013s;
    public Path v;

    public RectF f29014w;

    public ArrayList f29015x;

    public boolean f29016y;

    public final void a(float f10, float f11) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.f29007b, f10).setDuration((long) (Math.max(0.5f, Math.abs(this.f29007b - f10) - Math.min(0.2f, f11)) * 300.0f));
        duration.setInterpolator(er.f28122f);
        this.D.lock();
        duration.addUpdateListener(new eg0(this, 0));
        duration.addListener(new org.telegram.ui.ActionBar.z0(this, f10, 5));
        duration.start();
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        c(true);
    }

    public final void b(boolean z10) {
        if (this.f29010f) {
            return;
        }
        if (z10) {
            a(0.0f, 0.0f);
            return;
        }
        this.C = -1;
        this.f29007b = 0.0f;
        c(true);
    }

    public final void c(boolean z10) {
        float measuredWidth;
        float measuredHeight;
        ArrayList arrayList = this.f29015x;
        if (this.I != this.f29008c || this.J != this.f29007b) {
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((gg0) arrayList.get(i10)).a(this.f29008c, this.f29007b);
                }
            }
            this.I = this.f29008c;
            this.J = this.f29007b;
        }
        View childAt = getChildAt(0);
        int i11 = this.C;
        View childAt2 = (i11 < 0 || i11 >= getChildCount()) ? null : getChildAt(this.C);
        childAt.setTranslationX((-this.f29007b) * getWidth() * 0.5f);
        float f10 = ((1.0f - this.f29007b) * 0.05f) + 0.95f;
        childAt.setScaleX(f10);
        childAt.setScaleY(f10);
        if (childAt2 != null) {
            childAt2.setTranslationX((1.0f - this.f29007b) * getWidth());
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt3 = getChildAt(i12);
            if (i12 == 0) {
                if (this.f29007b == 1.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.f29007b != 1.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else if (i12 == this.C) {
                if (this.f29007b == 0.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.f29007b != 0.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else {
                childAt3.setVisibility(4);
            }
        }
        float measuredWidth2 = childAt.getMeasuredWidth();
        float measuredHeight2 = childAt.getMeasuredHeight();
        if (childAt2 != null) {
            measuredWidth = childAt2.getMeasuredWidth();
            measuredHeight = this.A;
            if (measuredHeight == 0.0f) {
                measuredHeight = childAt2.getMeasuredHeight();
            }
        } else {
            measuredWidth = 0.0f;
            measuredHeight = 0.0f;
        }
        if (childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
        float f11 = this.f29007b;
        float f12 = ((measuredWidth - measuredWidth2) * f11) + measuredWidth2;
        float fZ = com.google.android.recaptcha.internal.a.z(measuredHeight, measuredHeight2, f11, measuredHeight2);
        float paddingRight = f12 + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft();
        float paddingBottom = fZ + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22691a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX(paddingRight / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, paddingBottom / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22691a = true;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt4 = getChildAt(i13);
            childAt4.setPivotX(0.0f);
            childAt4.setPivotY(0.0f);
        }
        invalidate();
    }

    public final boolean d(MotionEvent motionEvent, View view) {
        Rect rect = this.H;
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
        RectF rectF = this.f29014w;
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        float top = childAt.getTop();
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        int i10 = this.C;
        if (i10 != -1 && i10 < getChildCount()) {
            View childAt2 = getChildAt(this.C);
            float top2 = childAt2.getTop();
            float measuredWidth2 = childAt2.getMeasuredWidth();
            float measuredHeight2 = this.A;
            if (measuredHeight2 == 0.0f) {
                measuredHeight2 = childAt2.getMeasuredHeight();
            }
            if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                top = AndroidUtilities.lerp(top, top2, this.f29007b);
                measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.f29007b);
                measuredHeight = AndroidUtilities.lerp(measuredHeight, measuredHeight2, this.f29007b);
            }
        }
        int iSave = canvas.save();
        path.rewind();
        int iDp = AndroidUtilities.dp(12.0f);
        if (this.L) {
            rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
        } else {
            rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
        }
        float f10 = iDp;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
        if (this.G == null || this.F == rectF.height()) {
            return;
        }
        fg0 fg0Var = this.G;
        int iHeight = (int) rectF.height();
        this.F = iHeight;
        org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) ((org.telegram.ui.zt) fg0Var).f45251b;
        org.telegram.ui.ActionBar.n2 n2Var = n2VarArr[0];
        if (n2Var == null || n2Var.getFragmentView() == null || !n2VarArr[0].isInPreviewMode()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = n2VarArr[0].getFragmentView().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + iHeight;
            n2VarArr[0].getFragmentView().setLayoutParams(layoutParams);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        RectF rectF = this.f29014w;
        int action = motionEvent.getAction() & 255;
        if (this.f29010f) {
            z10 = true;
        } else if (((GestureDetector) this.d.f17823b).onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
            z10 = this.f29009e;
        } else {
            if (this.f29009e) {
                this.f29009e = false;
                this.h = false;
                a(this.f29007b >= 0.5f ? 1.0f : 0.0f, 0.0f);
            } else if (this.h) {
                this.f29009e = false;
                this.h = false;
            }
            z10 = false;
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
            if (i10 < 0 || i10 >= getChildCount()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(this.C);
            if (this.f29007b > 0.5f) {
                childAt = childAt2;
            }
            boolean zDispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent);
            if ((zDispatchTouchEvent || actionMasked != 0) && !zDispatchTouchEvent && !onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Paint paint = this.f29011n;
        Paint paint2 = this.f29012r;
        int iIndexOfChild = indexOfChild(view);
        int iSave = canvas.save();
        if (iIndexOfChild != 0) {
            int i10 = this.f29013s;
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, this.E));
            } else {
                paint2.setColor(i10);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (iIndexOfChild == 0) {
            paint.setAlpha((int) (this.f29007b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final void e(int i10) {
        if (this.f29010f) {
            return;
        }
        this.C = i10;
        this.A = this.f29006a.get(i10);
        a(1.0f, 0.0f);
    }

    public final void f(int i10, int i11, boolean z10) {
        this.f29006a.put(i10, i11);
        int i12 = this.C;
        if (i10 == i12 && i12 >= 0 && i12 < getChildCount()) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.B = null;
            }
            if (!z10) {
                this.A = i11;
                c(true);
                return;
            }
            View childAt = getChildAt(this.C);
            float measuredHeight = this.A;
            if (measuredHeight == 0.0f) {
                measuredHeight = childAt.getMeasuredHeight();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(measuredHeight, i11).setDuration(240L);
            duration.setInterpolator(ws.f34319e);
            duration.addUpdateListener(new eg0(this, 1));
            this.f29010f = true;
            duration.addListener(new sz(this, 12));
            duration.start();
            this.B = duration;
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
        this.f29013s = i10;
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.K = runnable;
    }

    public void setOnHeightUpdateListener(fg0 fg0Var) {
        this.G = fg0Var;
    }

    public void setStickToRight(boolean z10) {
        this.L = z10;
    }

    public void setSwipeBackDisallowed(boolean z10) {
        this.f29016y = z10;
    }
}
