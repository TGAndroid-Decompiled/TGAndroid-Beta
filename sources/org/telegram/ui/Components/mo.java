package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo extends qi {
    public final c00 f28867n;
    public final qm0 f28868r;
    public final int f28869s;
    public final org.telegram.ui.v7 v;
    public int f28870w;

    public mo(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        this.f28869s = i10;
        c00 c00Var = new c00(context, e6Var);
        this.f28867n = c00Var;
        c00Var.setText(LocaleController.getString(R.string.NoPhotos));
        c00Var.setOnTouchListener(null);
        c00Var.setTextSize(16);
        addView(c00Var, w7.x5.d(-2.0f, -1));
        c00Var.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat m12 = this.f30173b.m1();
        if (i10 == 1) {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            c00Var.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        c00Var.c();
        qm0 qm0Var = new qm0(context, e6Var);
        this.f28868r = qm0Var;
        qm0Var.setSectionsType(2);
        qm0Var.setVerticalScrollBarEnabled(false);
        qm0Var.setLayoutManager(new s4.d0());
        qm0Var.setClipToPadding(false);
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, 4);
        this.v = v7Var;
        qm0Var.setAdapter(v7Var);
        qm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        qm0Var.setOnScrollListener(new ai.r(this, 23));
        addView(qm0Var, w7.x5.d(-1.0f, -1));
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mo.C(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        qm0 qm0Var = this.f28868r;
        if (qm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = qm0Var.getChildAt(0);
        am0 am0Var = (am0) qm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && am0Var != null && am0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || am0Var == null || am0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        c00 c00Var = this.f28867n;
        c00Var.setTranslationY(((measuredHeight - c00Var.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28868r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
    }
}
