package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cq0 extends org.telegram.ui.Components.jw0 {
    public int f35973w0;
    public boolean f35974x0;
    public int f35975y0;
    public final kq0 f35976z0;

    public cq0(kq0 kq0Var, Context context) {
        super(context, null);
        this.f35976z0 = kq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.qu quVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        kq0 kq0Var = this.f35976z0;
        if (isTablet) {
            kq0Var.f38647g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                kq0Var.f38647g0 = 4;
            } else {
                kq0Var.f38647g0 = 3;
            }
        }
        this.f35974x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / kq0Var.f38647g0;
        kq0Var.R = dp;
        if (this.f35975y0 != dp) {
            this.f35975y0 = dp;
            AndroidUtilities.runOnUIThread(new ek0(this, 13));
        }
        if (kq0Var.Y) {
            kq0Var.M.y1(1);
        } else {
            kq0Var.M.y1(Math.max(1, ((kq0Var.f38647g0 - 1) * AndroidUtilities.dp(2.0f)) + (kq0Var.R * kq0Var.f38647g0)));
        }
        this.f35974x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && kq0Var.f38643d0 != null && kq0Var.Z.getParent() == this) {
            size4 -= kq0Var.f38643d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (quVar = kq0Var.f38643d0) != null) {
            this.f35974x0 = true;
            quVar.j();
            this.f35974x0 = false;
        }
        org.telegram.ui.Components.qu quVar2 = kq0Var.f38643d0;
        if (quVar2 != null && quVar2.e) {
            kq0Var.fragmentView.setTranslationY(0.0f);
            kq0Var.K.setTranslationY(0.0f);
            kq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.qu quVar3 = kq0Var.f38643d0;
                if (quVar3 != null && quVar3.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f7 = 200.0f;
                        } else {
                            f7 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35974x0) {
            return;
        }
        super.requestLayout();
    }
}
