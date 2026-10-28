package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class je1 extends org.telegram.ui.Components.ww0 {
    public boolean f40521l0;
    public final Paint m0;
    public final cf1 f40522n0;

    public je1(cf1 cf1Var, Context context) {
        super(context, null);
        this.f40522n0 = cf1Var;
        setWillNotDraw(false);
        this.m0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            cf1 cf1Var = this.f40522n0;
            if (cf1Var.f38307h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                cf1Var.f38307h1.w(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
    public final void K(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            cf1 cf1Var = this.f40522n0;
            if (i10 < cf1Var.N.getChildCount()) {
                View childAt = cf1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + cf1Var.N.getX(), childAt.getY() + cf1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.tw0)) {
                        arrayList.add((org.telegram.ui.Components.tw0) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        int measuredHeight;
        cf1 cf1Var = this.f40522n0;
        hh.d dVar = cf1Var.f38309i1;
        hh.d dVar2 = cf1Var.f38307h1;
        ch.f fVar = cf1Var.f38305g1;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            cf1Var.x0();
            ey eyVar = cf1Var.M0;
            if (eyVar != null) {
                measuredWidth = eyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            ey eyVar2 = cf1Var.M0;
            if (eyVar2 != null) {
                measuredHeight = eyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f12842r && dVar2.c(measuredWidth, measuredHeight)) {
                fVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f12842r && dVar.c(measuredWidth, measuredHeight)) {
                fVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (cf1Var.isInPreviewMode()) {
            int themedColor = cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
            Paint paint = this.m0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (cf1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.y6.f23479k0);
        } else {
            canvas2 = canvas;
        }
        if (cf1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6), cf1Var.f38303f1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        cf1 cf1Var = this.f40522n0;
        kVar = ((org.telegram.ui.ActionBar.r2) cf1Var).actionBar;
        if (view == kVar && !cf1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) cf1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.r2) cf1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.u91 u91Var = cf1Var.f38290a1;
            if (u91Var != null && u91Var.getVisibility() != 8) {
                f7 = cf1Var.f38290a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * cf1Var.W) + height)));
            ((ActionBarLayout) cf1Var.getParentLayout()).p(canvas, (int) ((1.0f - cf1Var.W) * 255.0f), i10);
            float f10 = cf1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.y6.f23479k0.getAlpha();
                    org.telegram.ui.ActionBar.y6.f23479k0.setAlpha((int) (alpha * cf1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.y6.f23479k0);
                    org.telegram.ui.ActionBar.y6.f23479k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.y6.f23479k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        cf1 cf1Var = this.f40522n0;
        r41 r41Var = cf1Var.f38319o0;
        if (r41Var != null) {
            this.f40521l0 = true;
            ViewGroup.LayoutParams layoutParams = r41Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = cf1Var.f38303f1;
            layoutParams.height = dp + i13;
            cf1Var.f38319o0.setPadding(0, 0, 0, i13);
            this.f40521l0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, 0);
                } else {
                    i12 = i14;
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                    i16++;
                    i14 = i12;
                }
            }
            i12 = i14;
            i16++;
            i14 = i12;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.f40521l0) {
            return;
        }
        super.requestLayout();
    }
}
