package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xn extends oi {
    public final oz f30424n;
    public final xl0 f30425r;
    public final int f30426s;
    public final org.telegram.ui.w7 v;
    public int f30427w;

    public xn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f30426s = i10;
        oz ozVar = new oz(context, d6Var);
        this.f30424n = ozVar;
        ozVar.setText(LocaleController.getString(R.string.NoPhotos));
        ozVar.setOnTouchListener(null);
        ozVar.setTextSize(16);
        addView(ozVar, w7.y5.c(-2.0f, -1));
        ozVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f27043b.k1();
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
        xl0 xl0Var = new xl0(context, d6Var);
        this.f30425r = xl0Var;
        xl0Var.setSectionsType(2);
        xl0Var.setVerticalScrollBarEnabled(false);
        xl0Var.setLayoutManager(new s4.c0());
        xl0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        xl0Var.setAdapter(w7Var);
        xl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        xl0Var.setOnScrollListener(new ai.r(this, 23));
        addView(xl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        xl0 xl0Var = this.f30425r;
        if (xl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = xl0Var.getChildAt(0);
        hl0 hl0Var = (hl0) xl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && hl0Var != null && hl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || hl0Var == null || hl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        oz ozVar = this.f30424n;
        ozVar.setTranslationY(((measuredHeight - ozVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30425r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27043b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xn.y(int, int):void");
    }
}
