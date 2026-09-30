package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yn extends pi {
    public final pz f30742n;
    public final zl0 f30743r;
    public final int f30744s;
    public final org.telegram.ui.w7 v;
    public int f30745w;

    public yn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        this.f30744s = i10;
        pz pzVar = new pz(context, d6Var);
        this.f30742n = pzVar;
        pzVar.setText(LocaleController.getString(R.string.NoPhotos));
        pzVar.setOnTouchListener(null);
        pzVar.setTextSize(16);
        addView(pzVar, w7.y5.c(-2.0f, -1));
        pzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f27362b.k1();
        if (i10 == 1) {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            pzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        pzVar.c();
        zl0 zl0Var = new zl0(context, d6Var);
        this.f30743r = zl0Var;
        zl0Var.setSectionsType(2);
        zl0Var.setVerticalScrollBarEnabled(false);
        zl0Var.setLayoutManager(new s4.c0());
        zl0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        zl0Var.setAdapter(w7Var);
        zl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zl0Var.setOnScrollListener(new ai.r(this, 23));
        addView(zl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        zl0 zl0Var = this.f30743r;
        if (zl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = zl0Var.getChildAt(0);
        jl0 jl0Var = (jl0) zl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && jl0Var != null && jl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || jl0Var == null || jl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        pz pzVar = this.f30742n;
        pzVar.setTranslationY(((measuredHeight - pzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30743r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27362b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yn.y(int, int):void");
    }
}
