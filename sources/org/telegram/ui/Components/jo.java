package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jo extends ni {
    public final yz f26416n;
    public final mm0 f26417r;
    public final int f26418s;
    public final org.telegram.ui.a8 v;
    public int f26419w;

    public jo(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
        this.f26418s = i10;
        yz yzVar = new yz(context, c6Var);
        this.f26416n = yzVar;
        yzVar.setText(LocaleController.getString(R.string.NoPhotos));
        yzVar.setOnTouchListener(null);
        yzVar.setTextSize(16);
        addView(yzVar, w7.a6.d(-2.0f, -1));
        yzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat m12 = this.f27671b.m1();
        if (i10 == 1) {
            yzVar.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            yzVar.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            yzVar.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            yzVar.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        yzVar.c();
        mm0 mm0Var = new mm0(context, c6Var);
        this.f26417r = mm0Var;
        mm0Var.setSectionsType(2);
        mm0Var.setVerticalScrollBarEnabled(false);
        mm0Var.setLayoutManager(new s4.b0());
        mm0Var.setClipToPadding(false);
        org.telegram.ui.a8 a8Var = new org.telegram.ui.a8(this, 4);
        this.v = a8Var;
        mm0Var.setAdapter(a8Var);
        mm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        mm0Var.setOnScrollListener(new ah.d0(this, 24));
        addView(mm0Var, w7.a6.d(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jo.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        mm0 mm0Var = this.f26417r;
        if (mm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = mm0Var.getChildAt(0);
        wl0 wl0Var = (wl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        yz yzVar = this.f26416n;
        yzVar.setTranslationY(((measuredHeight - yzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f26417r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27671b.getSheetContainer().invalidate();
    }
}
