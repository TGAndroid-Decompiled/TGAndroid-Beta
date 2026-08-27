package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ck extends yh {

    public final yy f27470n;

    public final zk0 f27471r;

    public final f2.k0 f27472s;
    public final HorizontalScrollView v;

    public final boolean f27473w;

    public ck(gi giVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, giVar);
        this.f27473w = z10;
        this.f34903f = true;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        boolean z11 = !z10;
        yy yyVar = new yy(n2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.f27470n = yyVar;
        yyVar.f35035s0 = false;
        yyVar.K(z11, z10, false, false);
        yyVar.f35012k2 = true;
        lw lwVar = yyVar.f35051x;
        if (lwVar != null) {
            lwVar.setVisibility(8);
        }
        yyVar.f35014l2 = true;
        ImageView imageView = yyVar.f35055y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        yyVar.I2 = true;
        addView(yyVar, h7.z5.c(-1.0f, -1));
        HorizontalScrollView horizontalScrollViewZ = yyVar.z(z11 ? 1 : 0);
        this.v = horizontalScrollViewZ;
        zk0 zk0VarY = yyVar.y(z11 ? 1 : 0);
        this.f27471r = zk0VarY;
        zk0VarY.j(new ag.z2(this, 28));
        this.f27472s = (f2.k0) zk0VarY.getLayoutManager();
        horizontalScrollViewZ.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(yh yhVar) {
        gi giVar = this.f34900b;
        try {
            giVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        giVar.T0.setTitle(LocaleController.getString(this.f27473w ? R.string.SelectSticker : R.string.SelectEmoji));
        this.f27472s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27471r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        zk0 zk0Var = this.f27471r;
        if (zk0Var.getChildCount() <= 0) {
            zk0Var.setTopGlowOffset(zk0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = zk0Var.getChildAt(0);
        lk0 lk0Var = (lk0) zk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = iDp;
        }
        zk0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27471r.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(xx xxVar) {
        this.f27470n.setDelegate(xxVar);
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
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            i12 = (i11 / 5) * 2;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
            } else {
                i12 = (i11 / 5) * 2;
            }
        }
        int iDp = i12 - AndroidUtilities.dp(52.0f);
        if (iDp < 0) {
            iDp = 0;
        }
        int iDp2 = AndroidUtilities.dp(36.0f) + iDp;
        zk0 zk0Var = this.f27471r;
        if (zk0Var.getPaddingTop() != iDp2) {
            zk0Var.setPadding(AndroidUtilities.dp(6.0f), iDp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }
}
