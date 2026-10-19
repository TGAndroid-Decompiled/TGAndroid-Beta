package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class go extends li {
    public final vz f26652n;
    public final im0 f26653r;
    public final int f26654s;
    public final org.telegram.ui.z7 v;
    public int f26655w;

    public go(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
        this.f26654s = i10;
        vz vzVar = new vz(context, d6Var);
        this.f26652n = vzVar;
        vzVar.setText(LocaleController.getString(R.string.NoPhotos));
        vzVar.setOnTouchListener(null);
        vzVar.setTextSize(16);
        addView(vzVar, w7.z5.c(-2.0f, -1));
        vzVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat m12 = this.f28225b.m1();
        if (i10 == 1) {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        vzVar.c();
        im0 im0Var = new im0(context, d6Var);
        this.f26653r = im0Var;
        im0Var.setSectionsType(2);
        im0Var.setVerticalScrollBarEnabled(false);
        im0Var.setLayoutManager(new s4.b0());
        im0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 4);
        this.v = z7Var;
        im0Var.setAdapter(z7Var);
        im0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        im0Var.setOnScrollListener(new ah.d0(this, 28));
        addView(im0Var, w7.z5.c(-1.0f, -1));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.go.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        im0 im0Var = this.f26653r;
        if (im0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = im0Var.getChildAt(0);
        sl0 sl0Var = (sl0) im0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && sl0Var != null && sl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || sl0Var == null || sl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        vz vzVar = this.f26652n;
        vzVar.setTranslationY(((measuredHeight - vzVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f26653r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28225b.getSheetContainer().invalidate();
    }
}
