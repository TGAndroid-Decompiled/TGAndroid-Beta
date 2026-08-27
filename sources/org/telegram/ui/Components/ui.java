package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ui extends yh {

    public hh.f1 f33086n;

    public int f33087r;

    public kh.l f33088s;
    public pa v;

    public int f33089w;

    public q0.a f33090x;

    @Override
    public final void E(yh yhVar) {
        gi giVar = this.f34900b;
        try {
            giVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        giVar.T0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f33088s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f33086n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        hh.f1 f1Var = this.f33086n;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = iDp;
        }
        f1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f33086n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f33090x = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void z(int i10, int i11) {
        int i12;
        hh.f1 f1Var = this.f33086n;
        pa paVar = this.v;
        if (AndroidUtilities.isTablet()) {
            this.f33089w = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.f33089w = 4;
            } else {
                this.f33089w = 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int iDp = ((i10 - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(10.0f)) / this.f33089w;
        if (this.f33087r != iDp) {
            this.f33087r = iDp;
            paVar.l();
        }
        this.f33088s.y1(Math.max(1, ((this.f33089w - 1) * AndroidUtilities.dp(5.0f)) + (this.f33089w * iDp)));
        int iCeil = (int) Math.ceil((((ArrayList) paVar.f31572e).size() - 1) / this.f33089w);
        Math.max(0, ((i11 - ((AndroidUtilities.dp(5.0f) * (iCeil - 1)) + (iDp * iCeil))) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(60.0f));
        if (AndroidUtilities.isTablet()) {
            i12 = (i11 / 5) * 2;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
            } else {
                i12 = (i11 / 5) * 2;
            }
        }
        int iDp2 = i12 - AndroidUtilities.dp(52.0f);
        int i13 = iDp2 >= 0 ? iDp2 : 0;
        if (f1Var.getPaddingTop() != i13) {
            f1Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }
}
