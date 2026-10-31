package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kn extends uh {
    public final xy f27826n;
    public final tk0 f27827r;
    public final int f27828s;
    public final org.telegram.ui.x7 f27829w;
    public int f27830x;

    public kn(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        this.f27828s = i10;
        xy xyVar = new xy(context, p6Var);
        this.f27826n = xyVar;
        xyVar.setText(org.telegram.messenger.cd.L0(2131748197, null));
        xyVar.setOnTouchListener(null);
        xyVar.setTextSize(16);
        addView(xyVar, w7.b6.c(-2.0f, -1));
        xyVar.a(2131624085, 150, 150);
        TLRPC.Chat X0 = this.f30947b.X0();
        if (i10 == 1) {
            xyVar.setText(org.telegram.messenger.w3.L(7, X0));
        } else if (i10 == 3) {
            xyVar.setText(org.telegram.messenger.w3.L(18, X0));
        } else if (i10 == 4) {
            xyVar.setText(org.telegram.messenger.w3.L(19, X0));
        } else {
            xyVar.setText(org.telegram.messenger.w3.L(22, X0));
        }
        xyVar.c();
        tk0 tk0Var = new tk0(context, p6Var);
        this.f27827r = tk0Var;
        tk0Var.setSectionsType(2);
        tk0Var.setVerticalScrollBarEnabled(false);
        tk0Var.setLayoutManager(new s4.a0());
        tk0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 4);
        this.f27829w = x7Var;
        tk0Var.setAdapter(x7Var);
        tk0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        tk0Var.setOnScrollListener(new ag.u(this, 19));
        addView(tk0Var, w7.b6.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        tk0 tk0Var = this.f27827r;
        if (tk0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = tk0Var.getChildAt(0);
        ck0 ck0Var = (ck0) tk0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
        if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || ck0Var == null || ck0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.i0.L(50.0f);
        xy xyVar = this.f27826n;
        xyVar.setTranslationY(((measuredHeight - xyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.i0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27827r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
    }
}
