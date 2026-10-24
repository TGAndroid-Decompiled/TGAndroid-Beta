package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eo extends ji {
    public final tz f26084n;
    public final lm0 f26085r;
    public final int f26086s;
    public final org.telegram.ui.z7 v;
    public int f26087w;

    public eo(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ri riVar) {
        super(context, g6Var, riVar);
        this.f26086s = i10;
        tz tzVar = new tz(context, g6Var);
        this.f26084n = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoPhotos));
        tzVar.setOnTouchListener(null);
        tzVar.setTextSize(16);
        addView(tzVar, w7.z5.c(-2.0f, -1));
        tzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat p12 = this.f27704b.p1();
        if (i10 == 1) {
            tzVar.setText(ChatObject.getRestrictedErrorText(p12, 7));
        } else if (i10 == 3) {
            tzVar.setText(ChatObject.getRestrictedErrorText(p12, 18));
        } else if (i10 == 4) {
            tzVar.setText(ChatObject.getRestrictedErrorText(p12, 19));
        } else {
            tzVar.setText(ChatObject.getRestrictedErrorText(p12, 22));
        }
        tzVar.c();
        lm0 lm0Var = new lm0(context, g6Var);
        this.f26085r = lm0Var;
        lm0Var.setSectionsType(2);
        lm0Var.setVerticalScrollBarEnabled(false);
        lm0Var.setLayoutManager(new s4.b0());
        lm0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 4);
        this.v = z7Var;
        lm0Var.setAdapter(z7Var);
        lm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        lm0Var.setOnScrollListener(new ah.d0(this, 28));
        addView(lm0Var, w7.z5.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eo.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        lm0 lm0Var = this.f26085r;
        if (lm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = lm0Var.getChildAt(0);
        vl0 vl0Var = (vl0) lm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || vl0Var == null || vl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        tz tzVar = this.f26084n;
        tzVar.setTranslationY(((measuredHeight - tzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f26085r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
    }
}
