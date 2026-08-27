package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class de1 extends org.telegram.ui.Components.zu0 {

    public boolean f37383s0;

    public final Paint f37384t0;

    public final we1 f37385u0;

    public de1(we1 we1Var, Context context) {
        super(context, null);
        this.f37385u0 = we1Var;
        setWillNotDraw(false);
        this.f37384t0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            we1 we1Var = this.f37385u0;
            if (we1Var.f43727c1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                we1Var.f43727c1.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            we1 we1Var = this.f37385u0;
            if (i10 >= we1Var.J.getChildCount()) {
                return;
            }
            View childAt = we1Var.J.getChildAt(i10);
            if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                int iSave = canvas.save();
                canvas.translate(childAt.getX() + we1Var.J.getX(), childAt.getY() + we1Var.J.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.wu0)) {
                    arrayList.add((org.telegram.ui.Components.wu0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            i10++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        we1 we1Var = this.f37385u0;
        og.d dVar = we1Var.f43729d1;
        og.d dVar2 = we1Var.f43727c1;
        jg.e eVar = we1Var.f43724b1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            we1Var.x0();
            gy gyVar = we1Var.I0;
            int measuredWidth = gyVar != null ? gyVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            gy gyVar2 = we1Var.I0;
            int measuredHeight = gyVar2 != null ? gyVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (dVar2 != null && !dVar2.f19455n && dVar2.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f19455n && dVar.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (we1Var.isInPreviewMode()) {
            int themedColor = we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6);
            Paint paint = this.f37384t0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (we1Var.S * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        } else {
            canvas2 = canvas;
        }
        if (we1Var.I0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), we1Var.f43721a1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        we1 we1Var = this.f37385u0;
        if (view == ((org.telegram.ui.ActionBar.n2) we1Var).actionBar && !we1Var.isInPreviewMode()) {
            float y10 = ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getY();
            float height = ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getHeight();
            org.telegram.ui.Components.o71 o71Var = we1Var.W0;
            int measuredHeight = (int) (y10 + ((int) ((((o71Var == null || o71Var.getVisibility() == 8) ? 0.0f : we1Var.W0.getMeasuredHeight()) * we1Var.S) + height)));
            ((ActionBarLayout) we1Var.getParentLayout()).p(canvas, (int) ((1.0f - we1Var.S) * 255.0f), measuredHeight);
            float f10 = we1Var.S;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.g6.f23175k0.getAlpha();
                    org.telegram.ui.ActionBar.g6.f23175k0.setAlpha((int) (alpha * we1Var.S));
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.g6.f23175k0);
                    org.telegram.ui.ActionBar.g6.f23175k0.setAlpha(alpha);
                } else {
                    float f12 = measuredHeight;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.g6.f23175k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        we1 we1Var;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection());
                int i21 = i20 & 112;
                int i22 = absoluteGravity & 7;
                if (i22 != 1) {
                    if (i22 != 5) {
                        i16 = layoutParams.leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = layoutParams.rightMargin;
                    }
                    if (i21 != 16) {
                        if (i21 != 80) {
                            measuredHeight = layoutParams.topMargin + paddingTop;
                            if (!(childAt instanceof org.telegram.ui.ActionBar.k)) {
                                we1Var = this.f37385u0;
                                if (!we1Var.isInPreviewMode()) {
                                    measuredHeight += ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getMeasuredHeight() + ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getTop();
                                }
                            }
                        } else {
                            i17 = paddingBottom - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        childAt.layout(i16, measuredHeight, measuredWidth + i16, measuredHeight2 + measuredHeight);
                    } else {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight2) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    measuredHeight = i17 - i18;
                    childAt.layout(i16, measuredHeight, measuredWidth + i16, measuredHeight2 + measuredHeight);
                } else {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i21 != 16) {
                    if (i21 != 80) {
                        measuredHeight = layoutParams.topMargin + paddingTop;
                        if (!(childAt instanceof org.telegram.ui.ActionBar.k)) {
                            we1Var = this.f37385u0;
                            if (!we1Var.isInPreviewMode()) {
                                measuredHeight += ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getMeasuredHeight() + ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getTop();
                            }
                        }
                    } else {
                        i17 = paddingBottom - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    childAt.layout(i16, measuredHeight, measuredWidth + i16, measuredHeight2 + measuredHeight);
                } else {
                    i17 = (((paddingBottom - paddingTop) - measuredHeight2) / 2) + paddingTop + layoutParams.topMargin;
                    i18 = layoutParams.bottomMargin;
                }
                measuredHeight = i17 - i18;
                childAt.layout(i16, measuredHeight, measuredWidth + i16, measuredHeight2 + measuredHeight);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        we1 we1Var = this.f37385u0;
        z71 z71Var = we1Var.f43743k0;
        if (z71Var != null) {
            this.f37383s0 = true;
            ViewGroup.LayoutParams layoutParams = z71Var.getLayoutParams();
            int iDp = AndroidUtilities.dp(51.0f);
            int i13 = we1Var.f43721a1;
            layoutParams.height = iDp + i13;
            we1Var.f43743k0.setPadding(0, 0, 0, i13);
            this.f37383s0 = false;
        }
        int measuredHeight = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof org.telegram.ui.ActionBar.k) {
                i12 = measuredHeight;
            } else if (childAt2.getFitsSystemWindows()) {
                measureChildWithMargins(childAt2, i10, 0, i11, 0);
                i12 = measuredHeight;
            } else {
                i12 = measuredHeight;
                measureChildWithMargins(childAt2, i10, 0, i11, i12);
            }
            i15++;
            measuredHeight = i12;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.f37383s0) {
            return;
        }
        super.requestLayout();
    }
}
