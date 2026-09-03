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
import org.telegram.ui.ob1;
public final class ob1 extends LinearLayout {
    public final int f39650a;
    public Object f39651b;

    public ob1(Context context) {
        super(context);
        this.f39650a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39650a) {
            case 2:
                lh.f2 f2Var = (lh.f2) this.f39651b;
                RectF rectF = f2Var.h;
                RectF rectF2 = f2Var.f12739f;
                RectF rectF3 = f2Var.f12738e;
                Paint paint = f2Var.f12740n;
                paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21643c6, false)));
                float d = f2Var.f12737c.d(f2Var.f12736b, false);
                double d10 = d;
                ArrayList arrayList = f2Var.d;
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
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                return;
            case 13:
                int width = getWidth() / 2;
                int height2 = getHeight() / 2;
                bi1 bi1Var = (bi1) this.f39651b;
                Camera camera = bi1Var.I;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = bi1Var.J;
                camera.getMatrix(matrix);
                camera.restore();
                float f10 = -width;
                float f11 = -height2;
                matrix.preTranslate(f10, f11);
                float f12 = width;
                float f13 = height2;
                matrix.postTranslate(f12, f13);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = bi1Var.K;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f10, f11);
                matrix2.postTranslate(f12, f13);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
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
        int i10;
        View view;
        switch (this.f39650a) {
            case 3:
                if (!((mh.c5) this.f39651b).R.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((mh.ja) this.f39651b).f14320c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f39651b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
                if (scrollSlidingTextTabStrip.f25014b != null && scrollSlidingTextTabStrip.f25027k0) {
                    if (motionEvent.getAction() == 0) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        int i11 = 0;
                        while (true) {
                            if (i11 < getChildCount()) {
                                view = getChildAt(i11);
                                if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y10 < view.getY() || y10 > view.getY() + view.getHeight()) {
                                    i11++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.W = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.W));
                            scrollSlidingTextTabStrip.f25014b.getClass();
                            scrollSlidingTextTabStrip.W = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.W;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.W);
                            if (scrollSlidingTextTabStrip.f25028n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.W.getWidth() / 2.0f) + scrollSlidingTextTabStrip.W.getX();
                            int width2 = scrollSlidingTextTabStrip.W.getWidth();
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
                                org.telegram.ui.Components.tm0 tm0Var = scrollSlidingTextTabStrip.f25014b;
                                sparseIntArray.get(i10);
                                tm0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.W;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ob1 f30812b;

                                {
                                    this.f30812b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            ob1 ob1Var = this.f30812b;
                                            ob1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) ob1Var.f39651b).invalidate();
                                            return;
                                        default:
                                            ob1 ob1Var2 = this.f30812b;
                                            ob1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) ob1Var2.f39651b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        }
                        scrollSlidingTextTabStrip.W = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.W;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ob1 f30812b;

                                {
                                    this.f30812b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            ob1 ob1Var = this.f30812b;
                                            ob1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) ob1Var.f39651b).invalidate();
                                            return;
                                        default:
                                            ob1 ob1Var2 = this.f30812b;
                                            ob1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) ob1Var2.f39651b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        }
                        scrollSlidingTextTabStrip.W = null;
                    }
                    if (scrollSlidingTextTabStrip.W != null || super.dispatchTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                if (!((rh.g) this.f39651b).f46857b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f39650a) {
            case 15:
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f39650a) {
            case 1:
                fg.d2 d2Var = ((fg.c2) this.f39651b).f6261c;
                if (view == d2Var.f6287o0 && d2Var.E0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 6:
                if (view == ((org.telegram.ui.Components.w8) this.f39651b).f32675a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 9:
                org.telegram.ui.Components.pm0 pm0Var = (org.telegram.ui.Components.pm0) this.f39651b;
                if (view instanceof org.telegram.ui.Components.fx0) {
                    ((org.telegram.ui.Components.fx0) view).a(pm0Var.f30138f0);
                }
                if (view == pm0Var.f30150s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 14:
                boolean drawChild = super.drawChild(canvas, view, j10);
                f70 f70Var = (f70) this.f39651b;
                if (view == f70Var.f36691b && f70Var.f36699x != null) {
                    int measuredHeight = f70Var.f36697s.getMeasuredHeight();
                    f70Var.f36699x.setBounds(0, measuredHeight, getMeasuredWidth(), f70Var.f36699x.getIntrinsicHeight() + measuredHeight);
                    f70Var.f36699x.draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f39650a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.f39651b;
                    if (i10 < x0VarArr.length) {
                        x0VarArr[i10].invalidate();
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
        switch (this.f39650a) {
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((ii1) this.f39651b).f37714y0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f39650a) {
            case 5:
                return org.telegram.ui.ActionBar.x4.b((org.telegram.ui.ActionBar.x4) this.f39651b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f39650a) {
            case 7:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.xv) this.f39651b).f33183s.C && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.y3.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 8:
                ((org.telegram.ui.Components.d20) this.f39651b).f26128c.a(getMeasuredWidth());
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 9:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 10:
                super.onLayout(z4, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f39651b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.M;
                if (scrollSlidingTextTabStrip.f25025i0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f25029r) >= 0 && scrollSlidingTextTabStrip.f25012a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f25029r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.f25029r), false);
                    scrollSlidingTextTabStrip.f25025i0 = false;
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
        switch (this.f39650a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), 1073741824));
                return;
            case 5:
                org.telegram.ui.ActionBar.x4 x4Var = (org.telegram.ui.ActionBar.x4) this.f39651b;
                if (org.telegram.ui.ActionBar.x4.b(x4Var) && (size = x4Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 7:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.xv) this.f39651b).f31649b.getChildCount() * 32), 1073741824)), i11);
                return;
            case 12:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.t31) this.f39651b).f31265c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 15:
                int childCount = getChildCount();
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() == 0) {
                        i14++;
                    }
                }
                int size2 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size3 = View.MeasureSpec.getSize(i11);
                if (i14 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size2 / i14);
                    if (((PhotoViewer) this.f39651b).f34277g1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f39651b).U7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - AndroidUtilities.dp(i12)) / 2);
                        ((PhotoViewer) this.f39651b).f34277g1.setPadding(max, 0, max, 0);
                    }
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt = getChildAt(i16);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i14), size3);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size2, size3);
                return;
            case 16:
                super.onMeasure(i10, i11);
                vg1 vg1Var = (vg1) this.f39651b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vg1Var.f42114c.getLayoutParams();
                int i17 = 0;
                if (vg1Var.f42110a.getVisibility() == 8) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                int dp = AndroidUtilities.dp(8.0f) + i13;
                if (vg1Var.L == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i17 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams.topMargin = dp + i17;
                return;
            case 19:
                int size4 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                wh.z1 z1Var = (wh.z1) this.f39651b;
                LinearLayout linearLayout = z1Var.f50232j0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z1Var.f50232j0.getLayoutParams();
                    paddingRight += z1Var.f50232j0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout2 = z1Var.f50233k0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z1Var.f50233k0.getLayoutParams();
                    paddingRight += z1Var.f50233k0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                LinearLayout linearLayout3 = z1Var.f50234l0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) z1Var.f50234l0.getLayoutParams();
                    paddingRight += z1Var.f50234l0.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                z1Var.f50230h0 = Math.max(0, size4 - paddingRight);
                super.onMeasure(i10, i11);
                return;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                wh.v3 v3Var = (wh.v3) this.f39651b;
                LinearLayout linearLayout4 = v3Var.I;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) v3Var.I.getLayoutParams();
                    paddingRight2 += v3Var.I.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout5 = v3Var.J;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) v3Var.J.getLayoutParams();
                    paddingRight2 += v3Var.J.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                LinearLayout linearLayout6 = v3Var.K;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) v3Var.K.getLayoutParams();
                    paddingRight2 += v3Var.K.getMeasuredWidth() + marginLayoutParams7.leftMargin + marginLayoutParams7.rightMargin;
                }
                v3Var.H = Math.max(0, size5 - paddingRight2);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f39650a) {
            case 10:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f39651b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f39650a) {
            case 11:
                org.telegram.ui.Components.zw0 zw0Var = (org.telegram.ui.Components.zw0) this.f39651b;
                org.telegram.ui.Components.p9 p9Var = zw0Var.f34031b;
                if (getVisibility() == 8 && i10 == 0) {
                    zw0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        p9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    p9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public ob1(Object obj, Context context, int i10) {
        super(context);
        this.f39650a = i10;
        this.f39651b = obj;
    }
}
