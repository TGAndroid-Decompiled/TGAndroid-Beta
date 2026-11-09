package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class cn extends vh {
    public final jy f32711n;
    public final qj0 f32712r;
    public final int f32713s;
    public final org.telegram.ui.x7 f32714w;
    public int f32715x;

    public cn(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, di diVar) {
        super(context, g6Var, diVar);
        this.f32713s = i7;
        jy jyVar = new jy(context, g6Var);
        this.f32711n = jyVar;
        jyVar.setText(org.telegram.messenger.id.M0(2131748180, null));
        jyVar.setOnTouchListener(null);
        jyVar.setTextSize(16);
        addView(jyVar, c8.ha.c(-2.0f, -1));
        jyVar.a(2131624087, 150, 150);
        TLRPC.Chat Y0 = this.f39071b.Y0();
        if (i7 == 1) {
            jyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i7 == 3) {
            jyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i7 == 4) {
            jyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            jyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        jyVar.c();
        qj0 qj0Var = new qj0(context, g6Var);
        this.f32712r = qj0Var;
        qj0Var.setSectionsType(2);
        qj0Var.setVerticalScrollBarEnabled(false);
        qj0Var.setLayoutManager(new v4.b0());
        qj0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 4);
        this.f32714w = x7Var;
        qj0Var.setAdapter(x7Var);
        qj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        qj0Var.setOnScrollListener(new ui(this, 4));
        addView(qj0Var, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        qj0 qj0Var = this.f32712r;
        if (qj0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = qj0Var.getChildAt(0);
        yi0 yi0Var = (yi0) qj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && yi0Var != null && yi0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || yi0Var == null || yi0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        jy jyVar = this.f32711n;
        jyVar.setTranslationY(((measuredHeight - jyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32712r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39071b.f28624b.invalidate();
    }
}
