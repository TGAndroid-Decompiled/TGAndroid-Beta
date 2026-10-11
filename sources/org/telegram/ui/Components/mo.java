package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo extends qi {
    public final d00 f28806n;
    public final sm0 f28807r;
    public final int f28808s;
    public final org.telegram.ui.u7 v;
    public int f28809w;

    public mo(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, yi yiVar) {
        super(context, d6Var, yiVar);
        this.f28808s = i10;
        d00 d00Var = new d00(context, d6Var);
        this.f28806n = d00Var;
        d00Var.setText(LocaleController.getString(R.string.NoPhotos));
        d00Var.setOnTouchListener(null);
        d00Var.setTextSize(16);
        addView(d00Var, w7.x5.d(-2.0f, -1));
        d00Var.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat m12 = this.f30161b.m1();
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
        sm0 sm0Var = new sm0(context, d6Var);
        this.f28807r = sm0Var;
        sm0Var.setSectionsType(2);
        sm0Var.setVerticalScrollBarEnabled(false);
        sm0Var.setLayoutManager(new s4.d0());
        sm0Var.setClipToPadding(false);
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, 4);
        this.v = u7Var;
        sm0Var.setAdapter(u7Var);
        sm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        sm0Var.setOnScrollListener(new ai.r(this, 23));
        addView(sm0Var, w7.x5.d(-1.0f, -1));
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mo.C(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        sm0 sm0Var = this.f28807r;
        if (sm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = sm0Var.getChildAt(0);
        cm0 cm0Var = (cm0) sm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && cm0Var != null && cm0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || cm0Var == null || cm0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        d00 d00Var = this.f28806n;
        d00Var.setTranslationY(((measuredHeight - d00Var.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28807r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30161b.getSheetContainer().invalidate();
    }
}
