package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vn extends ni {
    public final mz f29233n;
    public final vl0 f29234r;
    public final int f29235s;
    public final org.telegram.ui.x7 v;
    public int f29236w;

    public vn(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f29235s = i10;
        mz mzVar = new mz(context, f6Var);
        this.f29233n = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, w7.y5.c(-2.0f, -1));
        mzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f26655b.k1();
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
        vl0 vl0Var = new vl0(context, f6Var);
        this.f29234r = vl0Var;
        vl0Var.setSectionsType(2);
        vl0Var.setVerticalScrollBarEnabled(false);
        vl0Var.setLayoutManager(new s4.c0());
        vl0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 4);
        this.v = x7Var;
        vl0Var.setAdapter(x7Var);
        vl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        vl0Var.setOnScrollListener(new ai.r(this, 24));
        addView(vl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        vl0 vl0Var = this.f29234r;
        if (vl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = vl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) vl0Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        mz mzVar = this.f29233n;
        mzVar.setTranslationY(((measuredHeight - mzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29234r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26655b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn.y(int, int):void");
    }
}
