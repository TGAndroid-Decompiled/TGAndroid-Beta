package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oo extends si {
    public final f00 f29261n;
    public final wm0 f29262r;
    public final int f29263s;
    public final org.telegram.ui.y7 v;
    public int f29264w;

    public oo(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(context, c6Var, ajVar);
        this.f29263s = i10;
        f00 f00Var = new f00(context, c6Var);
        this.f29261n = f00Var;
        f00Var.setText(LocaleController.getString(R.string.NoPhotos));
        f00Var.setOnTouchListener(null);
        f00Var.setTextSize(16);
        addView(f00Var, w7.w5.d(-2.0f, -1));
        f00Var.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat m12 = this.f30570b.m1();
        if (i10 == 1) {
            f00Var.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            f00Var.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            f00Var.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            f00Var.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        f00Var.c();
        wm0 wm0Var = new wm0(context, c6Var);
        this.f29262r = wm0Var;
        wm0Var.setSectionsType(2);
        wm0Var.setVerticalScrollBarEnabled(false);
        wm0Var.setLayoutManager(new s4.d0());
        wm0Var.setClipToPadding(false);
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 4);
        this.v = y7Var;
        wm0Var.setAdapter(y7Var);
        wm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        wm0Var.setOnScrollListener(new ai.r(this, 23));
        addView(wm0Var, w7.w5.d(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        wm0 wm0Var = this.f29262r;
        if (wm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = wm0Var.getChildAt(0);
        gm0 gm0Var = (gm0) wm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && gm0Var != null && gm0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || gm0Var == null || gm0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        f00 f00Var = this.f29261n;
        f00Var.setTranslationY(((measuredHeight - f00Var.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29262r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30570b.getSheetContainer().invalidate();
    }
}
