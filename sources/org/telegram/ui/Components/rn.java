package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class rn extends li {
    public final sy f39355n;
    public final ek0 f39356r;
    public final int f39357s;
    public final org.telegram.ui.z7 f39358w;
    public int f39359x;

    public rn(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        this.f39357s = i7;
        sy syVar = new sy(context, i6Var);
        this.f39355n = syVar;
        syVar.setText(org.telegram.messenger.gd.N0(2131747987, null));
        syVar.setOnTouchListener(null);
        syVar.setTextSize(16);
        addView(syVar, c8.na.c(-2.0f, -1));
        syVar.a(2131624088, 150, 150);
        TLRPC.Chat Z0 = this.f37135b.Z0();
        if (i7 == 1) {
            syVar.setText(org.telegram.messenger.v3.L(7, Z0));
        } else if (i7 == 3) {
            syVar.setText(org.telegram.messenger.v3.L(18, Z0));
        } else if (i7 == 4) {
            syVar.setText(org.telegram.messenger.v3.L(19, Z0));
        } else {
            syVar.setText(org.telegram.messenger.v3.L(22, Z0));
        }
        syVar.c();
        ek0 ek0Var = new ek0(context, i6Var);
        this.f39356r = ek0Var;
        ek0Var.setSectionsType(2);
        ek0Var.setVerticalScrollBarEnabled(false);
        ek0Var.setLayoutManager(new v4.c0());
        ek0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 4);
        this.f39358w = z7Var;
        ek0Var.setAdapter(z7Var);
        ek0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ek0Var.setOnScrollListener(new na(this, 7));
        addView(ek0Var, c8.na.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        ek0 ek0Var = this.f39356r;
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
        sy syVar = this.f39355n;
        syVar.setTranslationY(((measuredHeight - syVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f39356r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
    }
}
