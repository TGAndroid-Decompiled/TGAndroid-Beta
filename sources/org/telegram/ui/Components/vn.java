package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vn extends ni {
    public final mz f29136n;
    public final wl0 f29137r;
    public final int f29138s;
    public final org.telegram.ui.x7 v;
    public int f29139w;

    public vn(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, vi viVar) {
        super(context, e6Var, viVar);
        this.f29138s = i10;
        mz mzVar = new mz(context, e6Var);
        this.f29136n = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, w7.y5.c(-2.0f, -1));
        mzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f26688b.k1();
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
        wl0 wl0Var = new wl0(context, e6Var);
        this.f29137r = wl0Var;
        wl0Var.setSectionsType(2);
        wl0Var.setVerticalScrollBarEnabled(false);
        wl0Var.setLayoutManager(new s4.c0());
        wl0Var.setClipToPadding(false);
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 4);
        this.v = x7Var;
        wl0Var.setAdapter(x7Var);
        wl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        wl0Var.setOnScrollListener(new ai.r(this, 24));
        addView(wl0Var, w7.y5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        wl0 wl0Var = this.f29137r;
        if (wl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = wl0Var.getChildAt(0);
        gl0 gl0Var = (gl0) wl0Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && gl0Var != null && gl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || gl0Var == null || gl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        mz mzVar = this.f29136n;
        mzVar.setTranslationY(((measuredHeight - mzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29137r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26688b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vn.y(int, int):void");
    }
}
