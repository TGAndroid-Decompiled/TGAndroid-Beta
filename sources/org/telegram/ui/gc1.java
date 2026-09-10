package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.gc1;
public final class gc1 extends LinearLayout {
    public final int f33058a;
    public Object f33059b;

    public gc1(Context context) {
        super(context);
        this.f33058a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f33058a) {
            case 12:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                si1 si1Var = (si1) this.f33059b;
                Camera camera = si1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = si1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f7 = -width;
                float f10 = -height;
                matrix.preTranslate(f7, f10);
                float f11 = width;
                float f12 = height;
                matrix.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = si1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f7, f10);
                matrix2.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 18:
                wh.o1 o1Var = (wh.o1) this.f33059b;
                RectF rectF = o1Var.h;
                RectF rectF2 = o1Var.f44276f;
                RectF rectF3 = o1Var.e;
                Paint paint = o1Var.f44277n;
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17910c6, false)));
                float d = o1Var.f44275c.d(o1Var.f44274b, false);
                double d10 = d;
                ArrayList arrayList = o1Var.d;
                int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                if (clamp < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp));
                } else if (clamp2 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp2));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (clamp2 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp2));
                } else if (clamp < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
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
        int i10;
        View view;
        switch (this.f33058a) {
            case 1:
                if (!((ci.j) this.f33059b).f4715e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f33059b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.f21253b != null && scrollSlidingTextTabStrip.f21268n0) {
                    if (motionEvent.getAction() == 0) {
                        float x10 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        int i11 = 0;
                        while (true) {
                            if (i11 < getChildCount()) {
                                view = getChildAt(i11);
                                if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y3 < view.getY() || y3 > view.getY() + view.getHeight()) {
                                    i11++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.f21256c0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f21256c0));
                            scrollSlidingTextTabStrip.f21253b.getClass();
                            scrollSlidingTextTabStrip.f21256c0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f21256c0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f21256c0);
                            if (scrollSlidingTextTabStrip.f21267n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f21256c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f21256c0.getX();
                            int width2 = scrollSlidingTextTabStrip.f21256c0.getWidth();
                            if (width < 0.0f) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                                while (true) {
                                    if (i10 < getChildCount()) {
                                        View childAt = getChildAt(i10);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i10++;
                                        }
                                    } else {
                                        i10 = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i10 != indexOfChild) {
                                org.telegram.ui.Components.vm0 vm0Var = scrollSlidingTextTabStrip.f21253b;
                                sparseIntArray.get(i10);
                                vm0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f21256c0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final gc1 f27441b;

                                {
                                    this.f27441b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            gc1 gc1Var = this.f27441b;
                                            gc1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) gc1Var.f33059b).invalidate();
                                            return;
                                        default:
                                            gc1 gc1Var2 = this.f27441b;
                                            gc1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) gc1Var2.f33059b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        }
                        scrollSlidingTextTabStrip.f21256c0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f21256c0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final gc1 f27441b;

                                {
                                    this.f27441b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            gc1 gc1Var = this.f27441b;
                                            gc1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) gc1Var.f33059b).invalidate();
                                            return;
                                        default:
                                            gc1 gc1Var2 = this.f27441b;
                                            gc1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) gc1Var2.f33059b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        }
                        scrollSlidingTextTabStrip.f21256c0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f21256c0 != null || super.dispatchTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                if (!((xh.u3) this.f33059b).U.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                if (!((xh.z7) this.f33059b).f46393f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f33058a) {
            case 14:
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (getChildAt(i10).getVisibility() == 0) {
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
        switch (this.f33058a) {
            case 5:
                if (view == ((org.telegram.ui.Components.d9) this.f33059b).f22325a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 8:
                org.telegram.ui.Components.sm0 sm0Var = (org.telegram.ui.Components.sm0) this.f33059b;
                if (view instanceof org.telegram.ui.Components.ox0) {
                    ((org.telegram.ui.Components.ox0) view).a(sm0Var.f27112i0);
                }
                if (view == sm0Var.f27123s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 13:
                boolean drawChild = super.drawChild(canvas, view, j3);
                k70 k70Var = (k70) this.f33059b;
                if (view == k70Var.f34248b && k70Var.f34255x != null) {
                    int measuredHeight = k70Var.f34253s.getMeasuredHeight();
                    k70Var.f34255x.setBounds(0, measuredHeight, getMeasuredWidth(), k70Var.f34255x.getIntrinsicHeight() + measuredHeight);
                    k70Var.f34255x.draw(canvas);
                }
                return drawChild;
            case 17:
                qg.m1 m1Var = ((qg.l1) this.f33059b).f40804c;
                if (view == m1Var.f40828r0 && m1Var.H0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f33058a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.y0[] y0VarArr = (org.telegram.ui.Cells.y0[]) this.f33059b;
                    if (i10 < y0VarArr.length) {
                        y0VarArr[i10].invalidate();
                        i10++;
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
        switch (this.f33058a) {
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((zi1) this.f33059b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f33058a) {
            case 4:
                return org.telegram.ui.ActionBar.x4.b((org.telegram.ui.ActionBar.x4) this.f33059b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f33058a) {
            case 6:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.ew) this.f33059b).f22765s.F && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.a2.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 7:
                ((org.telegram.ui.Components.k20) this.f33059b).f24569c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 8:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f33059b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f21266l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f21269r) >= 0 && scrollSlidingTextTabStrip.f21251a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f21269r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.f21269r), false);
                    scrollSlidingTextTabStrip.f21266l0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        Size size;
        int i12;
        int i13;
        switch (this.f33058a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), 1073741824));
                return;
            case 2:
                int size2 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                hi.g2 g2Var = (hi.g2) this.f33059b;
                LinearLayout linearLayout = g2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g2Var.m0.getLayoutParams();
                    paddingRight += g2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = g2Var.f9596n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g2Var.f9596n0.getLayoutParams();
                    paddingRight += g2Var.f9596n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = g2Var.f9597o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) g2Var.f9597o0.getLayoutParams();
                    paddingRight += g2Var.f9597o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                g2Var.f9593k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i10, i11);
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                hi.e4 e4Var = (hi.e4) this.f33059b;
                LinearLayout linearLayout4 = e4Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) e4Var.L.getLayoutParams();
                    paddingRight2 += e4Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = e4Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) e4Var.M.getLayoutParams();
                    paddingRight2 += e4Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = e4Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) e4Var.N.getLayoutParams();
                    paddingRight2 += e4Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                e4Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i10, i11);
                return;
            case 4:
                org.telegram.ui.ActionBar.x4 x4Var = (org.telegram.ui.ActionBar.x4) this.f33059b;
                if (org.telegram.ui.ActionBar.x4.b(x4Var) && (size = x4Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.ew) this.f33059b).f28802b.getChildCount() * 32), 1073741824)), i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.g41) this.f33059b).f23234c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 14:
                int childCount = getChildCount();
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() == 0) {
                        i14++;
                    }
                }
                int size4 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size5 = View.MeasureSpec.getSize(i11);
                if (i14 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size4 / i14);
                    if (((PhotoViewer) this.f33059b).f30094j1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f33059b).X7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - AndroidUtilities.dp(i12)) / 2);
                        ((PhotoViewer) this.f33059b).f30094j1.setPadding(max, 0, max, 0);
                    }
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt = getChildAt(i16);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i14), size5);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size4, size5);
                return;
            case 15:
                super.onMeasure(i10, i11);
                mh1 mh1Var = (mh1) this.f33059b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) mh1Var.f34956c.getLayoutParams();
                int i17 = 0;
                if (mh1Var.f34952a.getVisibility() == 8) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                int dp = AndroidUtilities.dp(8.0f) + i13;
                if (mh1Var.O == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i17 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = dp + i17;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f33058a) {
            case 9:
                super.setAlpha(f7);
                ((ScrollSlidingTextTabStrip) this.f33059b).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f33058a) {
            case 10:
                org.telegram.ui.Components.jx0 jx0Var = (org.telegram.ui.Components.jx0) this.f33059b;
                org.telegram.ui.Components.w9 w9Var = jx0Var.f24510b;
                if (getVisibility() == 8 && i10 == 0) {
                    jx0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        w9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    w9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public gc1(Object obj, Context context, int i10) {
        super(context);
        this.f33058a = i10;
        this.f33059b = obj;
    }
}
