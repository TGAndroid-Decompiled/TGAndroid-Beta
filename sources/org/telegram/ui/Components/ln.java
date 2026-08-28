package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ln extends ci {
    public final yy f30483n;
    public final wk0 f30484r;
    public final int f30485s;
    public final org.telegram.ui.v7 v;
    public int f30486w;

    public ln(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.f30485s = i9;
        yy yyVar = new yy(context, b6Var);
        this.f30483n = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoPhotos));
        yyVar.setOnTouchListener(null);
        yyVar.setTextSize(16);
        addView(yyVar, g7.e6.c(-2.0f, -1));
        yyVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat k12 = this.f27493b.k1();
        if (i9 == 1) {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 7));
        } else if (i9 == 3) {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 18));
        } else if (i9 == 4) {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 19));
        } else {
            yyVar.setText(ChatObject.getRestrictedErrorText(k12, 22));
        }
        yyVar.c();
        wk0 wk0Var = new wk0(context, b6Var);
        this.f30484r = wk0Var;
        wk0Var.setSectionsType(2);
        wk0Var.setVerticalScrollBarEnabled(false);
        wk0Var.setLayoutManager(new f2.m0());
        wk0Var.setClipToPadding(false);
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, 4);
        this.v = v7Var;
        wk0Var.setAdapter(v7Var);
        wk0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        wk0Var.setOnScrollListener(new kn(this, 0));
        addView(wk0Var, g7.e6.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        wk0 wk0Var = this.f30484r;
        if (wk0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i9 = 0;
        View childAt = wk0Var.getChildAt(0);
        ik0 ik0Var = (ik0) wk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        }
        if (top < 0 || ik0Var == null || ik0Var.b() != 0) {
            top = i9;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        yy yyVar = this.f30483n;
        yyVar.setTranslationY(((measuredHeight - yyVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30484r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ln.y(int, int):void");
    }
}
