package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ik extends di {
    public final kz f25732n;
    public final rl0 f25733r;
    public final f2.i0 f25734s;
    public final HorizontalScrollView v;
    public final boolean f25735w;

    public ik(li liVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, liVar);
        this.f25735w = z4;
        this.f24284f = true;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
        boolean z10 = !z4 ? 1 : 0;
        kz kzVar = new kz(p2Var, z10, z4, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f25732n = kzVar;
        kzVar.f26482t0 = false;
        kzVar.J(z10, z4, false, false);
        kzVar.f26458l2 = true;
        ww wwVar = kzVar.f26495x;
        if (wwVar != null) {
            wwVar.setVisibility(8);
        }
        kzVar.f26460m2 = true;
        ImageView imageView = kzVar.f26499y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.J2 = true;
        addView(kzVar, k7.b6.c(-1.0f, -1));
        HorizontalScrollView y10 = kzVar.y(z10 ? 1 : 0);
        this.v = y10;
        rl0 x10 = kzVar.x(z10 ? 1 : 0);
        this.f25733r = x10;
        x10.j(new eg.f2(this, 21));
        this.f25734s = (f2.i0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(di diVar) {
        int i10;
        li liVar = this.f24282b;
        try {
            liVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        eg.l1 l1Var = liVar.U0;
        if (this.f25735w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        l1Var.setTitle(LocaleController.getString(i10));
        this.f25734s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f25733r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        rl0 rl0Var = this.f25733r;
        if (rl0Var.getChildCount() <= 0) {
            rl0Var.setTopGlowOffset(rl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = rl0Var.getChildAt(0);
        dl0 dl0Var = (dl0) rl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || dl0Var == null || dl0Var.b() != 0) {
            top = dp;
        }
        rl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25733r.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ky kyVar) {
        this.f25732n.setDelegate(kyVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24282b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ik.y(int, int):void");
    }
}
