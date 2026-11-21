package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un extends mi {
    public final vy f40531n;
    public final ek0 f40532r;
    public final int f40533s;
    public final org.telegram.ui.y7 f40534w;
    public int f40535x;

    public un(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        this.f40533s = i7;
        vy vyVar = new vy(context, h6Var);
        this.f40531n = vyVar;
        vyVar.setText(org.telegram.messenger.gd.N0(2131747987, null));
        vyVar.setOnTouchListener(null);
        vyVar.setTextSize(16);
        addView(vyVar, c8.ma.c(-2.0f, -1));
        vyVar.a(2131624088, 150, 150);
        TLRPC.Chat Z0 = this.f37521b.Z0();
        if (i7 == 1) {
            vyVar.setText(org.telegram.messenger.v3.L(7, Z0));
        } else if (i7 == 3) {
            vyVar.setText(org.telegram.messenger.v3.L(18, Z0));
        } else if (i7 == 4) {
            vyVar.setText(org.telegram.messenger.v3.L(19, Z0));
        } else {
            vyVar.setText(org.telegram.messenger.v3.L(22, Z0));
        }
        vyVar.c();
        ek0 ek0Var = new ek0(context, h6Var);
        this.f40532r = ek0Var;
        ek0Var.setSectionsType(2);
        ek0Var.setVerticalScrollBarEnabled(false);
        ek0Var.setLayoutManager(new v4.c0());
        ek0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.f40534w = y7Var;
        ek0Var.setAdapter(y7Var);
        ek0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ek0Var.setOnScrollListener(new oa(this, 7));
        addView(ek0Var, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.un.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        ek0 ek0Var = this.f40532r;
        if (ek0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = ek0Var.getChildAt(0);
        mj0 mj0Var = (mj0) ek0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || mj0Var == null || mj0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        vy vyVar = this.f40531n;
        vyVar.setTranslationY(((measuredHeight - vyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f40532r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37521b.f30173b.invalidate();
    }
}
