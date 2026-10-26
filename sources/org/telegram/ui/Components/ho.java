package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ho extends li {
    public final uz f29030n;
    public final mm0 f29031r;
    public final int f29032s;
    public final org.telegram.ui.c8 v;
    public int f29033w;

    public ho(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        this.f29032s = i10;
        uz uzVar = new uz(context, u6Var);
        this.f29030n = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoPhotos));
        uzVar.setOnTouchListener(null);
        uzVar.setTextSize(16);
        addView(uzVar, gb1.g(-2.0f, -1));
        uzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat p12 = this.f30215b.p1();
        if (i10 == 1) {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 7));
        } else if (i10 == 3) {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 18));
        } else if (i10 == 4) {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 19));
        } else {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 22));
        }
        uzVar.c();
        mm0 mm0Var = new mm0(context, u6Var);
        this.f29031r = mm0Var;
        mm0Var.setSectionsType(2);
        mm0Var.setVerticalScrollBarEnabled(false);
        mm0Var.setLayoutManager(new s4.c0());
        mm0Var.setClipToPadding(false);
        org.telegram.ui.c8 c8Var = new org.telegram.ui.c8(this, 4);
        this.v = c8Var;
        mm0Var.setAdapter(c8Var);
        mm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        mm0Var.setOnScrollListener(new ml(this, 2));
        addView(mm0Var, gb1.g(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ho.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        mm0 mm0Var = this.f29031r;
        if (mm0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = mm0Var.getChildAt(0);
        vl0 vl0Var = (vl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || vl0Var == null || vl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        uz uzVar = this.f29030n;
        uzVar.setTranslationY(((measuredHeight - uzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29031r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30215b.getSheetContainer().invalidate();
    }
}
