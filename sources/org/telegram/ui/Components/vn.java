package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vn extends ni {
    public final mz f29208n;
    public final yl0 f29209r;
    public final int f29210s;
    public final org.telegram.ui.x7 v;
    public int f29211w;

    public vn(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f29210s = i10;
        mz mzVar = new mz(context, f6Var);
        this.f29208n = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, w7.y5.c(-2.0f, -1));
        mzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f26786b.k1();
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
        yl0 yl0Var = new yl0(context, f6Var);
        this.f29209r = yl0Var;
        yl0Var.setSectionsType(2);
        yl0Var.setVerticalScrollBarEnabled(false);
        yl0Var.setLayoutManager(new s4.c0());
        yl0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 4);
        this.v = x7Var;
        yl0Var.setAdapter(x7Var);
        yl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        yl0Var.setOnScrollListener(new ai.r(this, 24));
        addView(yl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        yl0 yl0Var = this.f29209r;
        if (yl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = yl0Var.getChildAt(0);
        il0 il0Var = (il0) yl0Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || il0Var == null || il0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        mz mzVar = this.f29208n;
        mzVar.setTranslationY(((measuredHeight - mzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29209r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26786b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn.y(int, int):void");
    }
}
