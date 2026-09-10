package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ao extends qi {
    public final tz f21551n;
    public final vl0 f21552r;
    public final int f21553s;
    public final org.telegram.ui.w7 v;
    public int f21554w;

    public ao(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        this.f21553s = i10;
        tz tzVar = new tz(context, f6Var);
        this.f21551n = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoPhotos));
        tzVar.setOnTouchListener(null);
        tzVar.setTextSize(16);
        addView(tzVar, w7.a6.c(-2.0f, -1));
        tzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f26422b.k1();
        if (i10 == 1) {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i10 == 3) {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i10 == 4) {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            tzVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        tzVar.c();
        vl0 vl0Var = new vl0(context, f6Var);
        this.f21552r = vl0Var;
        vl0Var.setSectionsType(2);
        vl0Var.setVerticalScrollBarEnabled(false);
        vl0Var.setLayoutManager(new s4.c0());
        vl0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        vl0Var.setAdapter(w7Var);
        vl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        vl0Var.setOnScrollListener(new bi.a2(this, 21));
        addView(vl0Var, w7.a6.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        vl0 vl0Var = this.f21552r;
        if (vl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = vl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) vl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        tz tzVar = this.f21551n;
        tzVar.setTranslationY(((measuredHeight - tzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f21552r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26422b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ao.y(int, int):void");
    }
}
