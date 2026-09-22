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
public final class mf1 extends org.telegram.ui.Components.cw0 {
    public boolean f35737w0;
    public final Paint f35738x0;
    public final fg1 f35739y0;

    public mf1(fg1 fg1Var, Context context) {
        super(context, null);
        this.f35739y0 = fg1Var;
        setWillNotDraw(false);
        this.f35738x0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            fg1 fg1Var = this.f35739y0;
            if (fg1Var.f33638g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                fg1Var.f33638g1.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            fg1 fg1Var = this.f35739y0;
            if (i10 < fg1Var.N.getChildCount()) {
                View childAt = fg1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + fg1Var.N.getX(), childAt.getY() + fg1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.zv0)) {
                        arrayList.add((org.telegram.ui.Components.zv0) childAt);
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
        fg1 fg1Var = this.f35739y0;
        fh.d dVar = fg1Var.f33640h1;
        fh.d dVar2 = fg1Var.f33638g1;
        ah.i iVar = fg1Var.f33636f1;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            fg1Var.x0();
            uy uyVar = fg1Var.M0;
            if (uyVar != null) {
                measuredWidth = uyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            uy uyVar2 = fg1Var.M0;
            if (uyVar2 != null) {
                measuredHeight = uyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f9078n && dVar2.f(measuredWidth, measuredHeight)) {
                iVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f9078n && dVar.f(measuredWidth, measuredHeight)) {
                iVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (fg1Var.isInPreviewMode()) {
            int themedColor = fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6);
            Paint paint = this.f35738x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (fg1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.j6.f19231k0);
        } else {
            canvas2 = canvas;
        }
        if (fg1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6), fg1Var.f33633e1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        fg1 fg1Var = this.f35739y0;
        kVar = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
        if (view == kVar && !fg1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.y81 y81Var = fg1Var.f33623a1;
            if (y81Var != null && y81Var.getVisibility() != 8) {
                f7 = fg1Var.f33623a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * fg1Var.W) + height)));
            ((ActionBarLayout) fg1Var.getParentLayout()).p(canvas, (int) ((1.0f - fg1Var.W) * 255.0f), i10);
            float f10 = fg1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.j6.f19231k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19231k0.setAlpha((int) (alpha * fg1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.j6.f19231k0);
                    org.telegram.ui.ActionBar.j6.f19231k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.j6.f19231k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mf1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        fg1 fg1Var = this.f35739y0;
        u41 u41Var = fg1Var.f33651o0;
        if (u41Var != null) {
            this.f35737w0 = true;
            ViewGroup.LayoutParams layoutParams = u41Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = fg1Var.f33633e1;
            layoutParams.height = dp + i13;
            fg1Var.f33651o0.setPadding(0, 0, 0, i13);
            this.f35737w0 = false;
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
        if (this.f35737w0) {
            return;
        }
        super.requestLayout();
    }
}
