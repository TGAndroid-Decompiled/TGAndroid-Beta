package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sn extends ki {
    public final ty f39788n;
    public final ck0 f39789r;
    public final int f39790s;
    public final org.telegram.ui.y7 f39791w;
    public int f39792x;

    public sn(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        this.f39790s = i7;
        ty tyVar = new ty(context, i6Var);
        this.f39788n = tyVar;
        tyVar.setText(org.telegram.messenger.gd.M0(2131747988, null));
        tyVar.setOnTouchListener(null);
        tyVar.setTextSize(16);
        addView(tyVar, c8.ma.c(-2.0f, -1));
        tyVar.a(2131624088, 150, 150);
        TLRPC.Chat Z0 = this.f36766b.Z0();
        if (i7 == 1) {
            tyVar.setText(org.telegram.messenger.v3.L(7, Z0));
        } else if (i7 == 3) {
            tyVar.setText(org.telegram.messenger.v3.L(18, Z0));
        } else if (i7 == 4) {
            tyVar.setText(org.telegram.messenger.v3.L(19, Z0));
        } else {
            tyVar.setText(org.telegram.messenger.v3.L(22, Z0));
        }
        tyVar.c();
        ck0 ck0Var = new ck0(context, i6Var);
        this.f39789r = ck0Var;
        ck0Var.setSectionsType(2);
        ck0Var.setVerticalScrollBarEnabled(false);
        ck0Var.setLayoutManager(new v4.c0());
        ck0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.f39791w = y7Var;
        ck0Var.setAdapter(y7Var);
        ck0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ck0Var.setOnScrollListener(new oa(this, 7));
        addView(ck0Var, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        ck0 ck0Var = this.f39789r;
        if (ck0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = ck0Var.getChildAt(0);
        kj0 kj0Var = (kj0) ck0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || kj0Var == null || kj0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        ty tyVar = this.f39788n;
        tyVar.setTranslationY(((measuredHeight - tyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f39789r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30190b.invalidate();
    }
}
