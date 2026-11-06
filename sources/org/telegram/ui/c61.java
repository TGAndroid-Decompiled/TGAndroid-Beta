package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class c61 extends LinearLayout {
    public final int f44705a;
    public Object f44706b;

    public c61(int i7, Context context, Object obj) {
        super(context);
        this.f44705a = i7;
        this.f44706b = obj;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f44705a) {
            case 1:
                ai.w wVar = (ai.w) this.f44706b;
                c61 c61Var = wVar.f1662c;
                int i7 = wVar.f1663e;
                if (i7 >= 0 && i7 < c61Var.getChildCount()) {
                    float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (c61Var.getChildAt(wVar.f1663e).getWidth() != 0) {
                        if (Float.isNaN(wVar.f1664f)) {
                            wVar.f1664f = width;
                        } else {
                            float f10 = wVar.f1664f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + wVar.f1664f;
                                }
                                wVar.f1664f = width;
                                c61Var.invalidate();
                            }
                        }
                        canvas.drawCircle(wVar.f1664f, c61Var.getHeight() / 2.0f, (wVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, wVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 17:
                int width2 = getWidth() / 2;
                int height = getHeight() / 2;
                yb1 yb1Var = (yb1) this.f44706b;
                Camera camera = yb1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = yb1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f12 = -width2;
                float f13 = -height;
                matrix.preTranslate(f12, f13);
                float f14 = width2;
                float f15 = height;
                matrix.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = yb1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f12, f13);
                matrix2.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 25:
                zh.g1 g1Var = (zh.g1) this.f44706b;
                RectF rectF = g1Var.h;
                RectF rectF2 = g1Var.f60233f;
                RectF rectF3 = g1Var.f60232e;
                Paint paint = g1Var.f60234n;
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27830c6, false)));
                float e10 = g1Var.f60231c.e(false, g1Var.f60230b);
                double d = e10;
                ArrayList arrayList = g1Var.d;
                int j3 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                int j10 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                if (j3 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j3));
                } else if (j10 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j10));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (j10 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j10));
                } else if (j3 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j3));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                org.telegram.messenger.g0.Z1(rectF3, rectF2, e10 - j3, rectF);
                float height2 = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height2, height2, paint);
                super.dispatchDraw(canvas);
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
        switch (this.f44705a) {
            case 2:
                if (!((bi.e7) this.f44706b).f3766a0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (!((bi.dd) this.f44706b).f3726t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((gi.f) this.f44706b).f14001s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f44706b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.f31518b != null && scrollSlidingTextTabStrip.f31534n0) {
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
                        scrollSlidingTextTabStrip.f31521c0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f31521c0));
                            scrollSlidingTextTabStrip.f31518b.getClass();
                            scrollSlidingTextTabStrip.f31521c0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f31521c0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f31521c0);
                            if (scrollSlidingTextTabStrip.f31533n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f31521c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f31521c0.getX();
                            int width2 = scrollSlidingTextTabStrip.f31521c0.getWidth();
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
                                org.telegram.ui.Components.uk0 uk0Var = scrollSlidingTextTabStrip.f31518b;
                                sparseIntArray.get(i7);
                                uk0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f31521c0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.c61 f38077b;

                                {
                                    this.f38077b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.c61 c61Var = this.f38077b;
                                            c61Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) c61Var.f44706b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.c61 c61Var2 = this.f38077b;
                                            c61Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) c61Var2.f44706b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        }
                        scrollSlidingTextTabStrip.f31521c0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f31521c0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.c61 f38077b;

                                {
                                    this.f38077b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.c61 c61Var = this.f38077b;
                                            c61Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) c61Var.f44706b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.c61 c61Var2 = this.f38077b;
                                            c61Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) c61Var2.f44706b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        }
                        scrollSlidingTextTabStrip.f31521c0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f31521c0 != null || super.dispatchTouchEvent(motionEvent)) {
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
        switch (this.f44705a) {
            case 19:
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
        switch (this.f44705a) {
            case 8:
                if ((view instanceof org.telegram.ui.ActionBar.d1) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44706b).N != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 10:
                if (view == ((org.telegram.ui.Components.t8) this.f44706b).f38275a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 13:
                org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) this.f44706b;
                if (view instanceof org.telegram.ui.Components.fv0) {
                    ((org.telegram.ui.Components.fv0) view).a(rk0Var.f37725i0);
                }
                if (view == rk0Var.f37736s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 18:
                boolean drawChild = super.drawChild(canvas, view, j3);
                d50 d50Var = (d50) this.f44706b;
                if (view == d50Var.f44948b && d50Var.f44957y != null) {
                    int measuredHeight = d50Var.f44954s.getMeasuredHeight();
                    d50Var.f44957y.setBounds(0, measuredHeight, getMeasuredWidth(), d50Var.f44957y.getIntrinsicHeight() + measuredHeight);
                    d50Var.f44957y.draw(canvas);
                }
                return drawChild;
            case 24:
                ug.f1 f1Var = (ug.f1) ((bi.k5) this.f44706b).d;
                if (view == f1Var.f56479j2 && f1Var.f56495z2) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f44705a) {
            case 0:
                super.invalidate();
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) this.f44706b;
                    if (i7 < v0VarArr.length) {
                        v0VarArr[i7].invalidate();
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
        switch (this.f44705a) {
            case 22:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((ec1) this.f44706b).A0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f44705a) {
            case 9:
                return org.telegram.ui.ActionBar.i4.b((org.telegram.ui.ActionBar.i4) this.f44706b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f44705a) {
            case 11:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.yu) this.f44706b).f40715s.F && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.k5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 12:
                ((org.telegram.ui.Components.r00) this.f44706b).f37443c.a(getMeasuredWidth());
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 13:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 14:
                super.onLayout(z9, i7, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f44706b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f31532l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f31535r) >= 0 && scrollSlidingTextTabStrip.f31516a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f31535r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f31535r), false);
                    scrollSlidingTextTabStrip.f31532l0 = false;
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
        switch (this.f44705a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), 1073741824));
                return;
            case 6:
                int size2 = View.MeasureSpec.getSize(i7);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                li.b2 b2Var = (li.b2) this.f44706b;
                LinearLayout linearLayout = b2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b2Var.m0.getLayoutParams();
                    paddingRight += b2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = b2Var.f18456n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) b2Var.f18456n0.getLayoutParams();
                    paddingRight += b2Var.f18456n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = b2Var.f18457o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) b2Var.f18457o0.getLayoutParams();
                    paddingRight += b2Var.f18457o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                b2Var.f18453k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i7, i10);
                return;
            case 7:
                int size3 = View.MeasureSpec.getSize(i7);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                li.y3 y3Var = (li.y3) this.f44706b;
                LinearLayout linearLayout4 = y3Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) y3Var.L.getLayoutParams();
                    paddingRight2 += y3Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = y3Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) y3Var.M.getLayoutParams();
                    paddingRight2 += y3Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = y3Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) y3Var.N.getLayoutParams();
                    paddingRight2 += y3Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                y3Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i7, i10);
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44706b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.O) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
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
                                boolean z9 = tag instanceof Integer;
                                if (!z9 && tag2 == null) {
                                    i17 = Math.max(i17, childAt.getMeasuredWidth());
                                } else if (z9) {
                                    i18 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = org.telegram.messenger.g0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.E;
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
                org.telegram.ui.ActionBar.i4 i4Var = (org.telegram.ui.ActionBar.i4) this.f44706b;
                if (org.telegram.ui.ActionBar.i4.b(i4Var) && (size = i4Var.J) != null) {
                    i11 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i11 = i7;
                }
                super.onMeasure(i11, i14);
                return;
            case 11:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.yu) this.f44706b).f38971b.getChildCount() * 32), 1073741824)), i14);
                return;
            case 16:
                super.onMeasure(i7, i10);
                if (org.telegram.messenger.hd.f22871a0) {
                    ((org.telegram.ui.Components.h21) this.f44706b).f34150c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 19:
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
                    if (((PhotoViewer) this.f44706b).f41426j1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f44706b).X7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(i12)) / 2);
                        ((PhotoViewer) this.f44706b).f41426j1.setPadding(max, 0, max, 0);
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
            case 21:
                super.onMeasure(i7, i10);
                ya1 ya1Var = (ya1) this.f44706b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) ya1Var.f52186c.getLayoutParams();
                if (ya1Var.f52182a.getVisibility() == 8) {
                    i13 = org.telegram.messenger.g0.f22531m;
                } else {
                    i13 = 0;
                }
                int L = org.telegram.messenger.g0.L(8.0f) + i13;
                if (ya1Var.O == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.f22537q;
                    if (point.x <= point.y) {
                        i15 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i15;
                return;
            case 23:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.y5) this.f44706b).A0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f44705a) {
            case 14:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f44706b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f44705a) {
            case 15:
                org.telegram.ui.Components.av0 av0Var = (org.telegram.ui.Components.av0) this.f44706b;
                org.telegram.ui.Components.l9 l9Var = av0Var.f31927b;
                if (getVisibility() == 8 && i7 == 0) {
                    av0Var.c();
                    if (org.telegram.messenger.rc.e(3)) {
                        l9Var.getImageReceiver().P0(false);
                    }
                } else if (i7 == 8) {
                    l9Var.getImageReceiver().f();
                }
                super.setVisibility(i7);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public c61(Context context, int i7) {
        super(context);
        this.f44705a = i7;
    }

    public c61(ContextThemeWrapper contextThemeWrapper, final ln0 ln0Var) {
        super(contextThemeWrapper);
        this.f44705a = 20;
        this.f44706b = r9;
        setOrientation(1);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232369, org.telegram.messenger.hd.M0(2131745264, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                ln0 ln0Var2 = ln0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.f47564a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.f47564a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.f47564a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.f47564a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.f47564a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232373, org.telegram.messenger.hd.M0(2131745267, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                ln0 ln0Var2 = ln0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.f47564a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.f47564a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.f47564a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.f47564a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.f47564a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232372, org.telegram.messenger.hd.M0(2131745268, null), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                ln0 ln0Var2 = ln0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.f47564a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.f47564a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.f47564a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.f47564a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.f47564a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232370, org.telegram.messenger.hd.M0(2131745271, null), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                ln0 ln0Var2 = ln0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.f47564a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.f47564a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.f47564a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.f47564a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.f47564a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, 2131232374, org.telegram.messenger.hd.M0(2131745265, null), false, null);
        c14.d(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                ln0 ln0Var2 = ln0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = ln0Var2.f47564a;
                        Drawable[] drawableArr = PhotoViewer.Y8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ln0Var2.f47564a;
                        Drawable[] drawableArr2 = PhotoViewer.Y8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ln0Var2.f47564a;
                        Drawable[] drawableArr3 = PhotoViewer.Y8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ln0Var2.f47564a;
                        Drawable[] drawableArr4 = PhotoViewer.Y8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ln0Var2.f47564a;
                        Drawable[] drawableArr5 = PhotoViewer.Y8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0[] z0VarArr = {c10, c11, c12, c13, c14};
        View sq0Var = new sq0(contextThemeWrapper, 6);
        sq0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        sq0Var.setBackgroundColor(-15198184);
        addView(sq0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) sq0Var.getLayoutParams();
        if (org.telegram.messenger.hd.f22871a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        sq0Var.setLayoutParams(layoutParams);
    }
}
