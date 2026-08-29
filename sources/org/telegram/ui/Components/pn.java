package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pn extends fi {
    public final hz f31713n;
    public final jl0 f31714r;
    public final int f31715s;
    public final org.telegram.ui.u7 v;
    public int f31716w;

    public pn(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.f31715s = i10;
        hz hzVar = new hz(context, c6Var);
        this.f31713n = hzVar;
        hzVar.setText(LocaleController.getString(R.string.NoPhotos));
        hzVar.setOnTouchListener(null);
        hzVar.setTextSize(16);
        addView(hzVar, i7.f6.c(-2.0f, -1));
        hzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f28403b.k1();
        if (i10 == 1) {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            hzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        hzVar.c();
        jl0 jl0Var = new jl0(context, c6Var);
        this.f31714r = jl0Var;
        jl0Var.setSectionsType(2);
        jl0Var.setVerticalScrollBarEnabled(false);
        jl0Var.setLayoutManager(new f2.j0());
        jl0Var.setClipToPadding(false);
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, 4);
        this.v = u7Var;
        jl0Var.setAdapter(u7Var);
        jl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        jl0Var.setOnScrollListener(new cg.g2(this, 26));
        addView(jl0Var, i7.f6.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        jl0 jl0Var = this.f31714r;
        if (jl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = jl0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        hz hzVar = this.f31713n;
        hzVar.setTranslationY(((measuredHeight - hzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31714r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn.y(int, int):void");
    }
}
