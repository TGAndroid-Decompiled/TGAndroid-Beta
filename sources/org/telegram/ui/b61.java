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
public final class b61 extends LinearLayout {
    public final int f45964a;
    public Object f45965b;

    public b61(int i7, Context context, Object obj) {
        super(context);
        this.f45964a = i7;
        this.f45965b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f45964a) {
            case 1:
                ci.r rVar = (ci.r) this.f45965b;
                b61 b61Var = rVar.f5748c;
                int i7 = rVar.f5749e;
                if (i7 >= 0 && i7 < b61Var.getChildCount()) {
                    float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (b61Var.getChildAt(rVar.f5749e).getWidth() != 0) {
                        if (Float.isNaN(rVar.f5750f)) {
                            rVar.f5750f = width;
                        } else {
                            float f10 = rVar.f5750f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + rVar.f5750f;
                                }
                                rVar.f5750f = width;
                                b61Var.invalidate();
                            }
                        }
                        canvas.drawCircle(rVar.f5750f, b61Var.getHeight() / 2.0f, (rVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, rVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f45965b;
                float f12 = chatActivityEnterView.f32822y1;
                if (f12 < 1.0f) {
                    if (f12 > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.f32822y1) * 255.0f));
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
                zb1 zb1Var = (zb1) this.f45965b;
                Camera camera = zb1Var.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = zb1Var.N;
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
                Matrix matrix2 = zb1Var.O;
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
        switch (this.f45964a) {
            case 2:
                if (!((di.z5) this.f45965b).f10107b0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (!((di.pb) this.f45965b).f9546u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((ii.t) this.f45965b).f16443t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f45965b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f33199b != null && scrollSlidingTextTabStrip.f33216o0) {
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
                        scrollSlidingTextTabStrip.f33203d0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f33203d0));
                            scrollSlidingTextTabStrip.f33199b.getClass();
                            scrollSlidingTextTabStrip.f33203d0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f33203d0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f33203d0);
                            if (scrollSlidingTextTabStrip.f33214n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f33203d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f33203d0.getX();
                            int width2 = scrollSlidingTextTabStrip.f33203d0.getWidth();
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
                                org.telegram.ui.Components.jl0 jl0Var = scrollSlidingTextTabStrip.f33199b;
                                sparseIntArray.get(i7);
                                jl0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f33203d0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.b61 f35764b;

                                {
                                    this.f35764b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.b61 b61Var = this.f35764b;
                                            b61Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) b61Var.f45965b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.b61 b61Var2 = this.f35764b;
                                            b61Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) b61Var2.f45965b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.kr.h).start();
                        }
                        scrollSlidingTextTabStrip.f33203d0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f33203d0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.b61 f35764b;

                                {
                                    this.f35764b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.b61 b61Var = this.f35764b;
                                            b61Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) b61Var.f45965b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.b61 b61Var2 = this.f35764b;
                                            b61Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) b61Var2.f45965b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.kr.h).start();
                        }
                        scrollSlidingTextTabStrip.f33203d0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f33203d0 != null || super.dispatchTouchEvent(motionEvent)) {
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
        switch (this.f45964a) {
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
        switch (this.f45964a) {
            case 8:
                if ((view instanceof org.telegram.ui.ActionBar.d1) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45965b).O != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 10:
                if (view == ((org.telegram.ui.Components.x8) this.f45965b).f41918a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 14:
                org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) this.f45965b;
                if (view instanceof org.telegram.ui.Components.rv0) {
                    ((org.telegram.ui.Components.rv0) view).a(gl0Var.f35483j0);
                }
                if (view == gl0Var.f35493s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 19:
                boolean drawChild = super.drawChild(canvas, view, j3);
                e50 e50Var = (e50) this.f45965b;
                if (view == e50Var.f47437b && e50Var.f47446y != null) {
                    int measuredHeight = e50Var.f47443s.getMeasuredHeight();
                    e50Var.f47446y.setBounds(0, measuredHeight, getMeasuredWidth(), e50Var.f47446y.getIntrinsicHeight() + measuredHeight);
                    e50Var.f47446y.draw(canvas);
                }
                return drawChild;
            case 25:
                ug.h1 h1Var = (ug.h1) ((di.l4) this.f45965b).d;
                if (view == h1Var.f58808n2 && h1Var.D2) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f45964a) {
            case 0:
                super.invalidate();
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.f45965b;
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
        switch (this.f45964a) {
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((fc1) this.f45965b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f45964a) {
            case 9:
                return org.telegram.ui.ActionBar.j4.b((org.telegram.ui.ActionBar.j4) this.f45965b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f45964a) {
            case 11:
                super.onLayout(z10, i7, i10, i11, i12);
                setPivotX(getWidth());
                return;
            case 12:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.jv) this.f45965b).f36523s.G && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.f3.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 13:
                ((org.telegram.ui.Components.c10) this.f45965b).f33879c.a(getMeasuredWidth());
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 14:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 15:
                super.onLayout(z10, i7, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f45965b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f33217r) >= 0 && scrollSlidingTextTabStrip.f33197a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f33217r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f33217r), false);
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
        switch (this.f45964a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), 1073741824));
                return;
            case 6:
                int size2 = View.MeasureSpec.getSize(i7);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                oi.b2 b2Var = (oi.b2) this.f45965b;
                LinearLayout linearLayout = b2Var.f22072n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b2Var.f22072n0.getLayoutParams();
                    paddingRight += b2Var.f22072n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = b2Var.f22073o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) b2Var.f22073o0.getLayoutParams();
                    paddingRight += b2Var.f22073o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = b2Var.f22074p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) b2Var.f22074p0.getLayoutParams();
                    paddingRight += b2Var.f22074p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                b2Var.f22070l0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i7, i10);
                return;
            case 7:
                int size3 = View.MeasureSpec.getSize(i7);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                oi.y3 y3Var = (oi.y3) this.f45965b;
                LinearLayout linearLayout4 = y3Var.M;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) y3Var.M.getLayoutParams();
                    paddingRight2 += y3Var.M.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = y3Var.N;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) y3Var.N.getLayoutParams();
                    paddingRight2 += y3Var.N.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = y3Var.O;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) y3Var.O.getLayoutParams();
                    paddingRight2 += y3Var.O.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                y3Var.L = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i7, i10);
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45965b;
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
                            Object tag = childAt.getTag(2131296741);
                            Object tag2 = childAt.getTag(2131296587);
                            Object tag3 = childAt.getTag(2131296439);
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
                org.telegram.ui.ActionBar.j4 j4Var = (org.telegram.ui.ActionBar.j4) this.f45965b;
                if (org.telegram.ui.ActionBar.j4.b(j4Var) && (size = j4Var.J) != null) {
                    i11 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i11 = i7;
                }
                super.onMeasure(i11, i14);
                return;
            case 12:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.jv) this.f45965b).f36804b.getChildCount() * 32), 1073741824)), i14);
                return;
            case 17:
                super.onMeasure(i7, i10);
                if (org.telegram.messenger.gd.f24314a0) {
                    ((org.telegram.ui.Components.y21) this.f45965b).f42310c.setPivotX(getMeasuredWidth());
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
                    if (((PhotoViewer) this.f45965b).f43377k1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f45965b).f43331e8 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(i12)) / 2);
                        ((PhotoViewer) this.f45965b).f43377k1.setPadding(max, 0, max, 0);
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
                za1 za1Var = (za1) this.f45965b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) za1Var.f54564c.getLayoutParams();
                if (za1Var.f54560a.getVisibility() == 8) {
                    i13 = org.telegram.messenger.g0.f24220m;
                } else {
                    i13 = 0;
                }
                int L = org.telegram.messenger.g0.L(8.0f) + i13;
                if (za1Var.P == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.f24226q;
                    if (point.x <= point.y) {
                        i15 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i15;
                return;
            case 24:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.o6) this.f45965b).D0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f45964a) {
            case 15:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f45965b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f45964a) {
            case 16:
                org.telegram.ui.Components.mv0 mv0Var = (org.telegram.ui.Components.mv0) this.f45965b;
                org.telegram.ui.Components.p9 p9Var = mv0Var.f37551b;
                if (getVisibility() == 8 && i7 == 0) {
                    mv0Var.c();
                    if (org.telegram.messenger.pc.e(3)) {
                        p9Var.getImageReceiver().Q0(false);
                    }
                } else if (i7 == 8) {
                    p9Var.getImageReceiver().f();
                }
                super.setVisibility(i7);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public b61(Context context, int i7) {
        super(context);
        this.f45964a = i7;
    }

    public b61(ContextThemeWrapper contextThemeWrapper, final qn0 qn0Var) {
        super(contextThemeWrapper);
        this.f45964a = 21;
        this.f45965b = r9;
        setOrientation(1);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232374, org.telegram.messenger.gd.N0(2131745022, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51496a;
                        Drawable[] drawableArr = PhotoViewer.f43272f9;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51496a;
                        Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51496a;
                        Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51496a;
                        Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51496a;
                        Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232378, org.telegram.messenger.gd.N0(2131745025, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51496a;
                        Drawable[] drawableArr = PhotoViewer.f43272f9;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51496a;
                        Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51496a;
                        Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51496a;
                        Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51496a;
                        Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232377, org.telegram.messenger.gd.N0(2131745026, null), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51496a;
                        Drawable[] drawableArr = PhotoViewer.f43272f9;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51496a;
                        Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51496a;
                        Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51496a;
                        Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51496a;
                        Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232375, org.telegram.messenger.gd.N0(2131745029, null), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51496a;
                        Drawable[] drawableArr = PhotoViewer.f43272f9;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51496a;
                        Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51496a;
                        Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51496a;
                        Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51496a;
                        Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232379, org.telegram.messenger.gd.N0(2131745023, null), false, null);
        c14.d(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                qn0 qn0Var2 = qn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = qn0Var2.f51496a;
                        Drawable[] drawableArr = PhotoViewer.f43272f9;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qn0Var2.f51496a;
                        Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qn0Var2.f51496a;
                        Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qn0Var2.f51496a;
                        Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qn0Var2.f51496a;
                        Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0[] y0VarArr = {c10, c11, c12, c13, c14};
        View gh0Var = new gh0(contextThemeWrapper, 8);
        gh0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        gh0Var.setBackgroundColor(-15198184);
        addView(gh0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gh0Var.getLayoutParams();
        if (org.telegram.messenger.gd.f24314a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        gh0Var.setLayoutParams(layoutParams);
    }
}
