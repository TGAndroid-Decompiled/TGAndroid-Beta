package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class bn extends th {
    public final gy f32324n;
    public final tj0 f32325r;
    public final int f32326s;
    public final org.telegram.ui.y7 f32327w;
    public int f32328x;

    public bn(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        this.f32326s = i3;
        gy gyVar = new gy(context, e6Var);
        this.f32324n = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748188, null));
        gyVar.setOnTouchListener(null);
        gyVar.setTextSize(16);
        addView(gyVar, b8.mf.c(-2.0f, -1));
        gyVar.a(2131624087, 150, 150);
        TLRPC.Chat Y0 = this.f38416b.Y0();
        if (i3 == 1) {
            gyVar.setText(org.telegram.messenger.t3.L(7, Y0));
        } else if (i3 == 3) {
            gyVar.setText(org.telegram.messenger.t3.L(18, Y0));
        } else if (i3 == 4) {
            gyVar.setText(org.telegram.messenger.t3.L(19, Y0));
        } else {
            gyVar.setText(org.telegram.messenger.t3.L(22, Y0));
        }
        gyVar.c();
        tj0 tj0Var = new tj0(context, e6Var);
        this.f32325r = tj0Var;
        tj0Var.setSectionsType(2);
        tj0Var.setVerticalScrollBarEnabled(false);
        tj0Var.setLayoutManager(new u4.b0());
        tj0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.f32327w = y7Var;
        tj0Var.setAdapter(y7Var);
        tj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        tj0Var.setOnScrollListener(new ji(this, 6));
        addView(tj0Var, b8.mf.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        tj0 tj0Var = this.f32325r;
        if (tj0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i3 = 0;
        View childAt = tj0Var.getChildAt(0);
        bj0 bj0Var = (bj0) tj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        }
        if (top < 0 || bj0Var == null || bj0Var.b() != 0) {
            top = i3;
        }
        int measuredHeight = (getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f);
        gy gyVar = this.f32324n;
        gyVar.setTranslationY(((measuredHeight - gyVar.getMeasuredHeight()) / 2) + top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32325r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }
}
