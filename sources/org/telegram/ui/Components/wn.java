package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wn extends oi {
    public final nz f29757n;
    public final ml0 f29758r;
    public final int f29759s;
    public final org.telegram.ui.w7 v;
    public int f29760w;

    public wn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f29759s = i10;
        nz nzVar = new nz(context, d6Var);
        this.f29757n = nzVar;
        nzVar.setText(LocaleController.getString(R.string.NoPhotos));
        nzVar.setOnTouchListener(null);
        nzVar.setTextSize(16);
        addView(nzVar, w7.x5.c(-2.0f, -1));
        nzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f26744b.k1();
        if (i10 == 1) {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            nzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        nzVar.c();
        ml0 ml0Var = new ml0(context, d6Var);
        this.f29758r = ml0Var;
        ml0Var.setSectionsType(2);
        ml0Var.setVerticalScrollBarEnabled(false);
        ml0Var.setLayoutManager(new s4.c0());
        ml0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        ml0Var.setAdapter(w7Var);
        ml0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        ml0Var.setOnScrollListener(new ai.r(this, 23));
        addView(ml0Var, w7.x5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        ml0 ml0Var = this.f29758r;
        if (ml0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = ml0Var.getChildAt(0);
        wk0 wk0Var = (wk0) ml0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && wk0Var != null && wk0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || wk0Var == null || wk0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        nz nzVar = this.f29757n;
        nzVar.setTranslationY(((measuredHeight - nzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29758r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26744b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wn.y(int, int):void");
    }
}
