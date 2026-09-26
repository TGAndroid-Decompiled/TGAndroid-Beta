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
public final class df1 extends org.telegram.ui.Components.bw0 {
    public boolean f33108w0;
    public final Paint f33109x0;
    public final wf1 f33110y0;

    public df1(wf1 wf1Var, Context context) {
        super(context, null);
        this.f33110y0 = wf1Var;
        setWillNotDraw(false);
        this.f33109x0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            wf1 wf1Var = this.f33110y0;
            if (wf1Var.f39324g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                wf1Var.f39324g1.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            wf1 wf1Var = this.f33110y0;
            if (i10 < wf1Var.N.getChildCount()) {
                View childAt = wf1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + wf1Var.N.getX(), childAt.getY() + wf1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.yv0)) {
                        arrayList.add((org.telegram.ui.Components.yv0) childAt);
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
        wf1 wf1Var = this.f33110y0;
        fh.d dVar = wf1Var.f39326h1;
        fh.d dVar2 = wf1Var.f39324g1;
        ah.h hVar = wf1Var.f39322f1;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            wf1Var.x0();
            qy qyVar = wf1Var.M0;
            if (qyVar != null) {
                measuredWidth = qyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            qy qyVar2 = wf1Var.M0;
            if (qyVar2 != null) {
                measuredHeight = qyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f9060n && dVar2.g(measuredWidth, measuredHeight)) {
                hVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.f9060n && dVar.g(measuredWidth, measuredHeight)) {
                hVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (wf1Var.isInPreviewMode()) {
            int themedColor = wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6);
            Paint paint = this.f33109x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (wf1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.h6.f19180k0);
        } else {
            canvas2 = canvas;
        }
        if (wf1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6), wf1Var.f39319e1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        wf1 wf1Var = this.f33110y0;
        kVar = ((org.telegram.ui.ActionBar.m2) wf1Var).actionBar;
        if (view == kVar && !wf1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) wf1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.m2) wf1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.w81 w81Var = wf1Var.f39309a1;
            if (w81Var != null && w81Var.getVisibility() != 8) {
                f7 = wf1Var.f39309a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * wf1Var.W) + height)));
            ((ActionBarLayout) wf1Var.getParentLayout()).p(canvas, (int) ((1.0f - wf1Var.W) * 255.0f), i10);
            float f10 = wf1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.h6.f19180k0.getAlpha();
                    org.telegram.ui.ActionBar.h6.f19180k0.setAlpha((int) (alpha * wf1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.h6.f19180k0);
                    org.telegram.ui.ActionBar.h6.f19180k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.h6.f19180k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.df1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        wf1 wf1Var = this.f33110y0;
        m51 m51Var = wf1Var.f39337o0;
        if (m51Var != null) {
            this.f33108w0 = true;
            ViewGroup.LayoutParams layoutParams = m51Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = wf1Var.f39319e1;
            layoutParams.height = dp + i13;
            wf1Var.f39337o0.setPadding(0, 0, 0, i13);
            this.f33108w0 = false;
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
        if (this.f33108w0) {
            return;
        }
        super.requestLayout();
    }
}
