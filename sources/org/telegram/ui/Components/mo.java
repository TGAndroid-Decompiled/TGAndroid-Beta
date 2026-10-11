package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo extends qi {
    public final d00 f28898n;
    public final rm0 f28899r;
    public final int f28900s;
    public final org.telegram.ui.u7 v;
    public int f28901w;

    public mo(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, yi yiVar) {
        super(context, d6Var, yiVar);
        this.f28900s = i10;
        d00 d00Var = new d00(context, d6Var);
        this.f28898n = d00Var;
        d00Var.setText(LocaleController.getString(R.string.NoPhotos));
        d00Var.setOnTouchListener(null);
        d00Var.setTextSize(16);
        addView(d00Var, w7.x5.d(-2.0f, -1));
        d00Var.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat m12 = this.f30245b.m1();
        if (i10 == 1) {
            d00Var.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            d00Var.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            d00Var.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            d00Var.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        d00Var.c();
        rm0 rm0Var = new rm0(context, d6Var);
        this.f28899r = rm0Var;
        rm0Var.setSectionsType(2);
        rm0Var.setVerticalScrollBarEnabled(false);
        rm0Var.setLayoutManager(new s4.d0());
        rm0Var.setClipToPadding(false);
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, 4);
        this.v = u7Var;
        rm0Var.setAdapter(u7Var);
        rm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        rm0Var.setOnScrollListener(new ai.r(this, 23));
        addView(rm0Var, w7.x5.d(-1.0f, -1));
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mo.C(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        rm0 rm0Var = this.f28899r;
        if (rm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = rm0Var.getChildAt(0);
        bm0 bm0Var = (bm0) rm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && bm0Var != null && bm0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || bm0Var == null || bm0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        d00 d00Var = this.f28898n;
        d00Var.setTranslationY(((measuredHeight - d00Var.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28899r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30245b.getSheetContainer().invalidate();
    }
}
