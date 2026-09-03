package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qn extends di {
    public final mz f28215n;
    public final rl0 f28216r;
    public final int f28217s;
    public final org.telegram.ui.a8 v;
    public int f28218w;

    public qn(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        this.f28217s = i10;
        mz mzVar = new mz(context, f6Var);
        this.f28215n = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, k7.b6.c(-2.0f, -1));
        mzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f24282b.k1();
        if (i10 == 1) {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            mzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        mzVar.c();
        rl0 rl0Var = new rl0(context, f6Var);
        this.f28216r = rl0Var;
        rl0Var.setSectionsType(2);
        rl0Var.setVerticalScrollBarEnabled(false);
        rl0Var.setLayoutManager(new f2.i0());
        rl0Var.setClipToPadding(false);
        org.telegram.ui.a8 a8Var = new org.telegram.ui.a8(this, 4);
        this.v = a8Var;
        rl0Var.setAdapter(a8Var);
        rl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        rl0Var.setOnScrollListener(new eg.f2(this, 24));
        addView(rl0Var, k7.b6.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        rl0 rl0Var = this.f28216r;
        if (rl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = rl0Var.getChildAt(0);
        dl0 dl0Var = (dl0) rl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && dl0Var != null && dl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || dl0Var == null || dl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        mz mzVar = this.f28215n;
        mzVar.setTranslationY(((measuredHeight - mzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28216r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24282b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.y(int, int):void");
    }
}
