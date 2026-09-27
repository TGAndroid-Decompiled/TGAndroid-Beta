package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oq0 extends org.telegram.ui.Components.cw0 {
    public int f36241w0;
    public boolean f36242x0;
    public int f36243y0;
    public final wq0 f36244z0;

    public oq0(wq0 wq0Var, Context context) {
        super(context, null);
        this.f36244z0 = wq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.lu luVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        wq0 wq0Var = this.f36244z0;
        if (isTablet) {
            wq0Var.f39421g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                wq0Var.f39421g0 = 4;
            } else {
                wq0Var.f39421g0 = 3;
            }
        }
        this.f36242x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / wq0Var.f39421g0;
        wq0Var.R = dp;
        if (this.f36243y0 != dp) {
            this.f36243y0 = dp;
            AndroidUtilities.runOnUIThread(new ml0(this, 12));
        }
        if (wq0Var.Y) {
            wq0Var.M.y1(1);
        } else {
            wq0Var.M.y1(Math.max(1, ((wq0Var.f39421g0 - 1) * AndroidUtilities.dp(2.0f)) + (wq0Var.R * wq0Var.f39421g0)));
        }
        this.f36242x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && wq0Var.f39417d0 != null && wq0Var.Z.getParent() == this) {
            size4 -= wq0Var.f39417d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (luVar = wq0Var.f39417d0) != null) {
            this.f36242x0 = true;
            luVar.j();
            this.f36242x0 = false;
        }
        org.telegram.ui.Components.lu luVar2 = wq0Var.f39417d0;
        if (luVar2 != null && luVar2.e) {
            wq0Var.fragmentView.setTranslationY(0.0f);
            wq0Var.K.setTranslationY(0.0f);
            wq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.lu luVar3 = wq0Var.f39417d0;
                if (luVar3 != null && luVar3.l(childAt)) {
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
        if (this.f36242x0) {
            return;
        }
        super.requestLayout();
    }
}
