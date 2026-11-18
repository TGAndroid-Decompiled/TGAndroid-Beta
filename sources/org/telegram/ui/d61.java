package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class d61 extends LinearLayout {
    public final int f46828a;
    public Object f46829b;

    public d61(int i7, Context context, Object obj) {
        super(context);
        this.f46828a = i7;
        this.f46829b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f46828a) {
            case 1:
                ci.r rVar = (ci.r) this.f46829b;
                d61 d61Var = rVar.f5753c;
                int i7 = rVar.f5754e;
                if (i7 >= 0 && i7 < d61Var.getChildCount()) {
                    float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (d61Var.getChildAt(rVar.f5754e).getWidth() != 0) {
                        if (Float.isNaN(rVar.f5755f)) {
                            rVar.f5755f = width;
                        } else {
                            float f10 = rVar.f5755f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + rVar.f5755f;
                                }
                                rVar.f5755f = width;
                                d61Var.invalidate();
                            }
                        }
                        canvas.drawCircle(rVar.f5755f, d61Var.getHeight() / 2.0f, (rVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, rVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f46829b;
                float f12 = chatActivityEnterView.f32706w1;
                if (f12 < 1.0f) {
                    if (f12 > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.f32706w1) * 255.0f));
                        super.dispatchDraw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    }
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            case 18:
                int width2 = getWidth() / 2;
                int height = getHeight() / 2;
                bc1 bc1Var = (bc1) this.f46829b;
                Camera camera = bc1Var.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = bc1Var.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f13 = -width2;
                float f14 = -height;
                matrix.preTranslate(f13, f14);
                float f15 = width2;
                float f16 = height;
                matrix.postTranslate(f15, f16);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = bc1Var.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f13, f14);
                matrix2.postTranslate(f15, f16);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        View view;
        switch (this.f46828a) {
            case 2:
                if (!((di.z5) this.f46829b).f10122b0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (!((di.pb) this.f46829b).f9547u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((ii.t) this.f46829b).f16352t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f46829b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f33099b != null && scrollSlidingTextTabStrip.f33116o0) {
                    if (motionEvent.getAction() == 0) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        int i10 = 0;
                        while (true) {
                            if (i10 < getChildCount()) {
                                view = getChildAt(i10);
                                if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y10 < view.getY() || y10 > view.getY() + view.getHeight()) {
                                    i10++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.f33103d0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f33103d0));
                            scrollSlidingTextTabStrip.f33099b.getClass();
                            scrollSlidingTextTabStrip.f33103d0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f33103d0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f33103d0);
                            if (scrollSlidingTextTabStrip.f33114n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f33103d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f33103d0.getX();
                            int width2 = scrollSlidingTextTabStrip.f33103d0.getWidth();
                            if (width < 0.0f) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                while (true) {
                                    if (i7 < getChildCount()) {
                                        View childAt = getChildAt(i7);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i7++;
                                        }
                                    } else {
                                        i7 = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i7 != indexOfChild) {
                                org.telegram.ui.Components.hl0 hl0Var = scrollSlidingTextTabStrip.f33099b;
                                sparseIntArray.get(i7);
                                hl0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f33103d0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.d61 f35136b;

                                {
                                    this.f35136b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.d61 d61Var = this.f35136b;
                                            d61Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) d61Var.f46829b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.d61 d61Var2 = this.f35136b;
                                            d61Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) d61Var2.f46829b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        }
                        scrollSlidingTextTabStrip.f33103d0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f33103d0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.d61 f35136b;

                                {
                                    this.f35136b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.d61 d61Var = this.f35136b;
                                            d61Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) d61Var.f46829b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.d61 d61Var2 = this.f35136b;
                                            d61Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) d61Var2.f46829b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        }
                        scrollSlidingTextTabStrip.f33103d0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f33103d0 != null || super.dispatchTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f46828a) {
            case 20:
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    if (getChildAt(i7).getVisibility() == 0) {
                        super.draw(canvas);
                        return;
                    }
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f46828a) {
            case 8:
                if ((view instanceof org.telegram.ui.ActionBar.e1) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f46829b).O != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 10:
                if (view == ((org.telegram.ui.Components.y8) this.f46829b).f42394a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 14:
                org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.f46829b;
                if (view instanceof org.telegram.ui.Components.pv0) {
                    ((org.telegram.ui.Components.pv0) view).a(el0Var.f34749j0);
                }
                if (view == el0Var.f34759s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 19:
                boolean drawChild = super.drawChild(canvas, view, j3);
                f50 f50Var = (f50) this.f46829b;
                if (view == f50Var.f47522b && f50Var.f47531y != null) {
                    int measuredHeight = f50Var.f47528s.getMeasuredHeight();
                    f50Var.f47531y.setBounds(0, measuredHeight, getMeasuredWidth(), f50Var.f47531y.getIntrinsicHeight() + measuredHeight);
                    f50Var.f47531y.draw(canvas);
                }
                return drawChild;
            case 25:
                ug.i1 i1Var = (ug.i1) ((di.l4) this.f46829b).d;
                if (view == i1Var.f58690n2 && i1Var.D2) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f46828a) {
            case 0:
                super.invalidate();
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.f46829b;
                    if (i7 < x0VarArr.length) {
                        x0VarArr[i7].invalidate();
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f46828a) {
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((hc1) this.f46829b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f46828a) {
            case 9:
                return org.telegram.ui.ActionBar.k4.b((org.telegram.ui.ActionBar.k4) this.f46829b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f46828a) {
            case 11:
                super.onLayout(z10, i7, i10, i11, i12);
                setPivotX(getWidth());
                return;
            case 12:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.jv) this.f46829b).f36539s.G && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.f3.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 13:
                ((org.telegram.ui.Components.c10) this.f46829b).f33841c.a(getMeasuredWidth());
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 14:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 15:
                super.onLayout(z10, i7, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f46829b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f33117r) >= 0 && scrollSlidingTextTabStrip.f33097a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f33117r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f33117r), false);
                    scrollSlidingTextTabStrip.m0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        Size size;
        int i12;
        int i13;
        int i14 = i10;
        int i15 = 0;
        switch (this.f46828a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), 1073741824));
                return;
            case 6:
                int size2 = View.MeasureSpec.getSize(i7);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                oi.z1 z1Var = (oi.z1) this.f46829b;
                LinearLayout linearLayout = z1Var.f22530n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z1Var.f22530n0.getLayoutParams();
                    paddingRight += z1Var.f22530n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = z1Var.f22531o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z1Var.f22531o0.getLayoutParams();
                    paddingRight += z1Var.f22531o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = z1Var.f22532p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z1Var.f22532p0.getLayoutParams();
                    paddingRight += z1Var.f22532p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                z1Var.f22528l0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i7, i10);
                return;
            case 7:
                int size3 = View.MeasureSpec.getSize(i7);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                oi.x3 x3Var = (oi.x3) this.f46829b;
                LinearLayout linearLayout4 = x3Var.M;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) x3Var.M.getLayoutParams();
                    paddingRight2 += x3Var.M.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = x3Var.N;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) x3Var.N.getLayoutParams();
                    paddingRight2 += x3Var.N.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = x3Var.O;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) x3Var.O.getLayoutParams();
                    paddingRight2 += x3Var.O.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                x3Var.L = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i7, i10);
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f46829b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.P) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    while (i16 < childCount) {
                        View childAt = getChildAt(i16);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(2131296739);
                            Object tag2 = childAt.getTag(2131296585);
                            Object tag3 = childAt.getTag(2131296437);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i7, 0, i14, 0);
                            if (tag3 == null) {
                                boolean z10 = tag instanceof Integer;
                                if (!z10 && tag2 == null) {
                                    i17 = Math.max(i17, childAt.getMeasuredWidth());
                                } else if (z10) {
                                    i18 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = org.telegram.messenger.g0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.F;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i16++;
                        i14 = i10;
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        while (i15 < size4) {
                            ((View) arrayList.get(i15)).getLayoutParams().width = Math.max(i17, i18);
                            i15++;
                        }
                    }
                }
                super.onMeasure(i7, i10);
                return;
            case 9:
                org.telegram.ui.ActionBar.k4 k4Var = (org.telegram.ui.ActionBar.k4) this.f46829b;
                if (org.telegram.ui.ActionBar.k4.b(k4Var) && (size = k4Var.J) != null) {
                    i11 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i11 = i7;
                }
                super.onMeasure(i11, i14);
                return;
            case 12:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.jv) this.f46829b).f36144b.getChildCount() * 32), 1073741824)), i14);
                return;
            case 17:
                super.onMeasure(i7, i10);
                if (org.telegram.messenger.gd.f24213a0) {
                    ((org.telegram.ui.Components.w21) this.f46829b).f41545c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 20:
                int childCount2 = getChildCount();
                int i19 = 0;
                for (int i20 = 0; i20 < childCount2; i20++) {
                    if (getChildAt(i20).getVisibility() == 0) {
                        i19++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i14);
                if (i19 != 0) {
                    int min = Math.min(org.telegram.messenger.g0.L(56.0f), size5 / i19);
                    if (((PhotoViewer) this.f46829b).f43251k1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f46829b).Y7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(i12)) / 2);
                        ((PhotoViewer) this.f46829b).f43251k1.setPadding(max, 0, max, 0);
                    }
                    while (i15 < childCount2) {
                        View childAt2 = getChildAt(i15);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                        }
                        i15++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i19), size6);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size5, size6);
                return;
            case 22:
                super.onMeasure(i7, i10);
                bb1 bb1Var = (bb1) this.f46829b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) bb1Var.f45803c.getLayoutParams();
                if (bb1Var.f45799a.getVisibility() == 8) {
                    i13 = org.telegram.messenger.g0.f24112m;
                } else {
                    i13 = 0;
                }
                int L = org.telegram.messenger.g0.L(8.0f) + i13;
                if (bb1Var.P == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.f24118q;
                    if (point.x <= point.y) {
                        i15 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i15;
                return;
            case 24:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.n6) this.f46829b).D0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f46828a) {
            case 15:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f46829b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f46828a) {
            case 16:
                org.telegram.ui.Components.kv0 kv0Var = (org.telegram.ui.Components.kv0) this.f46829b;
                org.telegram.ui.Components.q9 q9Var = kv0Var.f36894b;
                if (getVisibility() == 8 && i7 == 0) {
                    kv0Var.c();
                    if (org.telegram.messenger.pc.e(3)) {
                        q9Var.getImageReceiver().P0(false);
                    }
                } else if (i7 == 8) {
                    q9Var.getImageReceiver().f();
                }
                super.setVisibility(i7);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public d61(Context context, int i7) {
        super(context);
        this.f46828a = i7;
    }

    public d61(ContextThemeWrapper contextThemeWrapper, final qn0 qn0Var) {
        super(contextThemeWrapper);
        this.f46828a = 21;
        this.f46829b = r9;
        setOrientation(1);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232371, org.telegram.messenger.gd.M0(2131745028, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51256a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51256a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51256a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51256a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51256a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232375, org.telegram.messenger.gd.M0(2131745031, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51256a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51256a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51256a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51256a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51256a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232374, org.telegram.messenger.gd.M0(2131745032, null), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51256a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51256a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51256a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51256a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51256a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232372, org.telegram.messenger.gd.M0(2131745035, null), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51256a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51256a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51256a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51256a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51256a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232376, org.telegram.messenger.gd.M0(2131745029, null), false, null);
        c14.d(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51256a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51256a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51256a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51256a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51256a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0[] z0VarArr = {c10, c11, c12, c13, c14};
        View ih0Var = new ih0(contextThemeWrapper, 8);
        ih0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ih0Var.setBackgroundColor(-15198184);
        addView(ih0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ih0Var.getLayoutParams();
        if (org.telegram.messenger.gd.f24213a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        ih0Var.setLayoutParams(layoutParams);
    }
}
