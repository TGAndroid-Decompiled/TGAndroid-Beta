package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xn extends oi {
    public final oz f30414n;
    public final yl0 f30415r;
    public final int f30416s;
    public final org.telegram.ui.w7 v;
    public int f30417w;

    public xn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f30416s = i10;
        oz ozVar = new oz(context, d6Var);
        this.f30414n = ozVar;
        ozVar.setText(LocaleController.getString(R.string.NoPhotos));
        ozVar.setOnTouchListener(null);
        ozVar.setTextSize(16);
        addView(ozVar, w7.y5.c(-2.0f, -1));
        ozVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f27077b.k1();
        if (i10 == 1) {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            ozVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        ozVar.c();
        yl0 yl0Var = new yl0(context, d6Var);
        this.f30415r = yl0Var;
        yl0Var.setSectionsType(2);
        yl0Var.setVerticalScrollBarEnabled(false);
        yl0Var.setLayoutManager(new s4.c0());
        yl0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        yl0Var.setAdapter(w7Var);
        yl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        yl0Var.setOnScrollListener(new ai.r(this, 23));
        addView(yl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        yl0 yl0Var = this.f30415r;
        if (yl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = yl0Var.getChildAt(0);
        il0 il0Var = (il0) yl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || il0Var == null || il0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        oz ozVar = this.f30414n;
        ozVar.setTranslationY(((measuredHeight - ozVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30415r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27077b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xn.y(int, int):void");
    }
}
