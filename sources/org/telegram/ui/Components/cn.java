package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class cn extends vh {
    public final iy f32616n;
    public final pj0 f32617r;
    public final int f32618s;
    public final org.telegram.ui.x7 f32619w;
    public int f32620x;

    public cn(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        this.f32618s = i7;
        iy iyVar = new iy(context, f6Var);
        this.f32616n = iyVar;
        iyVar.setText(org.telegram.messenger.hd.M0(2131748179, null));
        iyVar.setOnTouchListener(null);
        iyVar.setTextSize(16);
        addView(iyVar, c8.ha.c(-2.0f, -1));
        iyVar.a(2131624087, 150, 150);
        TLRPC.Chat Y0 = this.f38948b.Y0();
        if (i7 == 1) {
            iyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i7 == 3) {
            iyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i7 == 4) {
            iyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            iyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        iyVar.c();
        pj0 pj0Var = new pj0(context, f6Var);
        this.f32617r = pj0Var;
        pj0Var.setSectionsType(2);
        pj0Var.setVerticalScrollBarEnabled(false);
        pj0Var.setLayoutManager(new v4.b0());
        pj0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 4);
        this.f32619w = x7Var;
        pj0Var.setAdapter(x7Var);
        pj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        pj0Var.setOnScrollListener(new ui(this, 4));
        addView(pj0Var, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        pj0 pj0Var = this.f32617r;
        if (pj0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = pj0Var.getChildAt(0);
        xi0 xi0Var = (xi0) pj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        iy iyVar = this.f32616n;
        iyVar.setTranslationY(((measuredHeight - iyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32617r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38948b.f28615b.invalidate();
    }
}
