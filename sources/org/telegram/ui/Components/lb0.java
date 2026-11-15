package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
public final class lb0 extends mb0 {
    public final ah.i M;

    public lb0(Context context) {
        super(context, null);
        ah.i iVar = new ah.i(7, context, this);
        this.M = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(iVar, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.D(iVar, org.telegram.ui.ActionBar.j6.H6, null);
        iVar.setBackground(null);
        iVar.setSingleLine(true);
        iVar.setInputType(1);
        iVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.q6.l(iVar, 30, org.telegram.ui.ActionBar.j6.f28996l6, null);
        iVar.setCursorWidth(1.5f);
        iVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        e(iVar);
        addView(iVar, c8.ja.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.M;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
