package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tn extends ei {
    public final oz f31413n;
    public final tl0 f31414r;
    public final int f31415s;
    public final org.telegram.ui.y7 v;
    public int f31416w;

    public tn(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.f31415s = i10;
        oz ozVar = new oz(context, g6Var);
        this.f31413n = ozVar;
        ozVar.setText(LocaleController.getString(R.string.NoPhotos));
        ozVar.setOnTouchListener(null);
        ozVar.setTextSize(16);
        addView(ozVar, k7.c6.c(-2.0f, -1));
        ozVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f26546b.k1();
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
        tl0 tl0Var = new tl0(context, g6Var);
        this.f31414r = tl0Var;
        tl0Var.setSectionsType(2);
        tl0Var.setVerticalScrollBarEnabled(false);
        tl0Var.setLayoutManager(new f2.j0());
        tl0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.v = y7Var;
        tl0Var.setAdapter(y7Var);
        tl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        tl0Var.setOnScrollListener(new fg.e2(this, 24));
        addView(tl0Var, k7.c6.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        tl0 tl0Var = this.f31414r;
        if (tl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = tl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) tl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        oz ozVar = this.f31413n;
        ozVar.setTranslationY(((measuredHeight - ozVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31414r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.y(int, int):void");
    }
}
