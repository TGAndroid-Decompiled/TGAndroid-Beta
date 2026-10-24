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
public final class de1 extends org.telegram.ui.Components.nw0 {
    public boolean f36610w0;
    public final Paint f36611x0;
    public final xe1 f36612y0;

    public de1(xe1 xe1Var, Context context) {
        super(context, null);
        this.f36612y0 = xe1Var;
        setWillNotDraw(false);
        this.f36611x0 = new Paint();
    }

    @Override
    public final void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            xe1 xe1Var = this.f36612y0;
            if (xe1Var.f43564h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                xe1Var.f43564h1.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            xe1 xe1Var = this.f36612y0;
            if (i10 < xe1Var.N.getChildCount()) {
                View childAt = xe1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + xe1Var.N.getX(), childAt.getY() + xe1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.kw0)) {
                        arrayList.add((org.telegram.ui.Components.kw0) childAt);
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
        xe1 xe1Var = this.f36612y0;
        gh.d dVar = xe1Var.f43566i1;
        gh.d dVar2 = xe1Var.f43564h1;
        bh.f fVar = xe1Var.f43562g1;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            xe1Var.w0();
            ey eyVar = xe1Var.M0;
            if (eyVar != null) {
                measuredWidth = eyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            ey eyVar2 = xe1Var.M0;
            if (eyVar2 != null) {
                measuredHeight = eyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f11079n && dVar2.g(measuredWidth, measuredHeight)) {
                fVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.f11079n && dVar.g(measuredWidth, measuredHeight)) {
                fVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (xe1Var.isInPreviewMode()) {
            int themedColor = xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6);
            Paint paint = this.f36611x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (xe1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.k6.f21305k0);
        } else {
            canvas2 = canvas;
        }
        if (xe1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6), xe1Var.f43560f1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        xe1 xe1Var = this.f36612y0;
        kVar = ((org.telegram.ui.ActionBar.o2) xe1Var).actionBar;
        if (view == kVar && !xe1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) xe1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.o2) xe1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.k91 k91Var = xe1Var.f43547a1;
            if (k91Var != null && k91Var.getVisibility() != 8) {
                f7 = xe1Var.f43547a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * xe1Var.W) + height)));
            ((ActionBarLayout) xe1Var.getParentLayout()).p(canvas, (int) ((1.0f - xe1Var.W) * 255.0f), i10);
            float f10 = xe1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.k6.f21305k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.f21305k0.setAlpha((int) (alpha * xe1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.k6.f21305k0);
                    org.telegram.ui.ActionBar.k6.f21305k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.k6.f21305k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.de1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        xe1 xe1Var = this.f36612y0;
        m41 m41Var = xe1Var.f43576o0;
        if (m41Var != null) {
            this.f36610w0 = true;
            ViewGroup.LayoutParams layoutParams = m41Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = xe1Var.f43560f1;
            layoutParams.height = dp + i13;
            xe1Var.f43576o0.setPadding(0, 0, 0, i13);
            this.f36610w0 = false;
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
        if (this.f36610w0) {
            return;
        }
        super.requestLayout();
    }
}
