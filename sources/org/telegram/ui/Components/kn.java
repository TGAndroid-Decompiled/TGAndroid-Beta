package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kn extends ci {
    public final ny f36554n;
    public final uj0 f36555r;
    public final int f36556s;
    public final org.telegram.ui.y7 f36557w;
    public int f36558x;

    public kn(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        this.f36556s = i7;
        ny nyVar = new ny(context, e6Var);
        this.f36554n = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748180, null));
        nyVar.setOnTouchListener(null);
        nyVar.setTextSize(16);
        addView(nyVar, c8.ja.c(-2.0f, -1));
        nyVar.a(2131624088, 150, 150);
        TLRPC.Chat Y0 = this.f33609b.Y0();
        if (i7 == 1) {
            nyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i7 == 3) {
            nyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i7 == 4) {
            nyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            nyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        nyVar.c();
        uj0 uj0Var = new uj0(context, e6Var);
        this.f36555r = uj0Var;
        uj0Var.setSectionsType(2);
        uj0Var.setVerticalScrollBarEnabled(false);
        uj0Var.setLayoutManager(new v4.b0());
        uj0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.f36557w = y7Var;
        uj0Var.setAdapter(y7Var);
        uj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        uj0Var.setOnScrollListener(new ri(this, 6));
        addView(uj0Var, c8.ja.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        uj0 uj0Var = this.f36555r;
        if (uj0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = uj0Var.getChildAt(0);
        cj0 cj0Var = (cj0) uj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        }
        if (top < 0 || cj0Var == null || cj0Var.b() != 0) {
            top = i7;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        ny nyVar = this.f36554n;
        nyVar.setTranslationY(((measuredHeight - nyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f36555r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33609b.f29682b.invalidate();
    }
}
