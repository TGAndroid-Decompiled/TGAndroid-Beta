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
public final class pf1 extends org.telegram.ui.Components.aw0 {
    public boolean f35829w0;
    public final Paint f35830x0;
    public final ig1 f35831y0;

    public pf1(ig1 ig1Var, Context context) {
        super(context, null);
        this.f35831y0 = ig1Var;
        setWillNotDraw(false);
        this.f35830x0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ig1 ig1Var = this.f35831y0;
            if (ig1Var.f33698g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                ig1Var.f33698g1.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            ig1 ig1Var = this.f35831y0;
            if (i10 < ig1Var.N.getChildCount()) {
                View childAt = ig1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + ig1Var.N.getX(), childAt.getY() + ig1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.xv0)) {
                        arrayList.add((org.telegram.ui.Components.xv0) childAt);
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
        ig1 ig1Var = this.f35831y0;
        eh.d dVar = ig1Var.f33700h1;
        eh.d dVar2 = ig1Var.f33698g1;
        zg.e eVar = ig1Var.f33696f1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ig1Var.x0();
            wy wyVar = ig1Var.M0;
            if (wyVar != null) {
                measuredWidth = wyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            wy wyVar2 = ig1Var.M0;
            if (wyVar2 != null) {
                measuredHeight = wyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f7522n && dVar2.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.f7522n && dVar.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (ig1Var.isInPreviewMode()) {
            int themedColor = ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6);
            Paint paint = this.f35830x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (ig1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        } else {
            canvas2 = canvas;
        }
        if (ig1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6), ig1Var.f33693e1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f7;
        ig1 ig1Var = this.f35831y0;
        lVar = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
        if (view == lVar && !ig1Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
            float y3 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.u81 u81Var = ig1Var.f33683a1;
            if (u81Var != null && u81Var.getVisibility() != 8) {
                f7 = ig1Var.f33683a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * ig1Var.W) + height)));
            ((ActionBarLayout) ig1Var.getParentLayout()).p(canvas, (int) ((1.0f - ig1Var.W) * 255.0f), i10);
            float f10 = ig1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.j6.f18049k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f18049k0.setAlpha((int) (alpha * ig1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.j6.f18049k0);
                    org.telegram.ui.ActionBar.j6.f18049k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.j6.f18049k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pf1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ig1 ig1Var = this.f35831y0;
        m91 m91Var = ig1Var.f33711o0;
        if (m91Var != null) {
            this.f35829w0 = true;
            ViewGroup.LayoutParams layoutParams = m91Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = ig1Var.f33693e1;
            layoutParams.height = dp + i13;
            ig1Var.f33711o0.setPadding(0, 0, 0, i13);
            this.f35829w0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.l) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.l)) {
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
        if (this.f35829w0) {
            return;
        }
        super.requestLayout();
    }
}
