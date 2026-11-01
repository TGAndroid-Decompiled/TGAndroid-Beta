package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class yj extends uh {
    public final vy f32855n;
    public final uk0 f32856r;
    public final s4.a0 f32857s;
    public final HorizontalScrollView f32858w;
    public final boolean f32859x;

    public yj(bi biVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, biVar);
        this.f32859x = z10;
        this.f30966f = true;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        boolean z11 = !z10 ? 1 : 0;
        vy vyVar = new vy(k2Var, z11, z10, false, getContext(), true, null, null, false, p6Var, false, true);
        this.f32855n = vyVar;
        vyVar.f32005w0 = false;
        vyVar.J(z11, z10, false, false);
        vyVar.f31980o2 = true;
        jw jwVar = vyVar.f32012y;
        if (jwVar != null) {
            jwVar.setVisibility(8);
        }
        vyVar.f31983p2 = true;
        ImageView imageView = vyVar.D;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        vyVar.S2 = true;
        addView(vyVar, w7.b6.c(-1.0f, -1));
        HorizontalScrollView z12 = vyVar.z(z11 ? 1 : 0);
        this.f32858w = z12;
        uk0 y3 = vyVar.y(z11 ? 1 : 0);
        this.f32856r = y3;
        y3.j(new ag.u(this, 17));
        this.f32857s = (s4.a0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yj.B(int, int):void");
    }

    @Override
    public final void G(uh uhVar) {
        int i10;
        bi biVar = this.f30964b;
        try {
            biVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kg.g1 g1Var = biVar.R2;
        if (this.f32859x) {
            i10 = 2131745669;
        } else {
            i10 = 2131745675;
        }
        g1Var.setTitle(org.telegram.messenger.dd.L0(i10, null));
        this.f32857s.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f32856r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        uk0 uk0Var = this.f32856r;
        if (uk0Var.getChildCount() <= 0) {
            uk0Var.setTopGlowOffset(uk0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = uk0Var.getChildAt(0);
        dk0 dk0Var = (dk0) uk0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(36.0f);
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || dk0Var == null || dk0Var.b() != 0) {
            top = L;
        }
        uk0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32856r.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32858w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(vx vxVar) {
        this.f32855n.setDelegate(vxVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30964b.f21587b.invalidate();
        invalidate();
    }
}
