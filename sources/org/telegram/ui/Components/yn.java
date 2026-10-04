package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yn extends pi {
    public final pz f33177n;
    public final zl0 f33178r;
    public final int f33179s;
    public final org.telegram.ui.z7 v;
    public int f33180w;

    public yn(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        this.f33179s = i10;
        pz pzVar = new pz(context, d6Var);
        this.f33177n = pzVar;
        pzVar.setText(LocaleController.getString(R.string.NoPhotos));
        pzVar.setOnTouchListener(null);
        pzVar.setTextSize(16);
        addView(pzVar, w7.z5.c(-2.0f, -1));
        pzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat i12 = this.f29642b.i1();
        if (i10 == 1) {
            pzVar.setText(ChatObject.getRestrictedErrorText(i12, 7));
        } else if (i10 == 3) {
            pzVar.setText(ChatObject.getRestrictedErrorText(i12, 18));
        } else if (i10 == 4) {
            pzVar.setText(ChatObject.getRestrictedErrorText(i12, 19));
        } else {
            pzVar.setText(ChatObject.getRestrictedErrorText(i12, 22));
        }
        pzVar.c();
        zl0 zl0Var = new zl0(context, d6Var);
        this.f33178r = zl0Var;
        zl0Var.setSectionsType(2);
        zl0Var.setVerticalScrollBarEnabled(false);
        zl0Var.setLayoutManager(new s4.c0());
        zl0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 4);
        this.v = z7Var;
        zl0Var.setAdapter(z7Var);
        zl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zl0Var.setOnScrollListener(new ai.r(this, 24));
        addView(zl0Var, w7.z5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        zl0 zl0Var = this.f33178r;
        if (zl0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = zl0Var.getChildAt(0);
        il0 il0Var = (il0) zl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || il0Var == null || il0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        pz pzVar = this.f33177n;
        pzVar.setTranslationY(((measuredHeight - pzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f33178r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f29642b.getSheetContainer().invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yn.y(int, int):void");
    }
}
