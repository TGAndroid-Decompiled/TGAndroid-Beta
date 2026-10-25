package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class pd0 extends rd0 {
    public final fi.c2 L;

    public pd0(Context context) {
        super(context, null);
        fi.c2 c2Var = new fi.c2(this, context, 6);
        this.L = c2Var;
        c2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.E(c2Var, org.telegram.ui.ActionBar.y6.H6, null);
        c2Var.setBackground(null);
        c2Var.setSingleLine(true);
        c2Var.setInputType(1);
        c2Var.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.m(c2Var, 30, org.telegram.ui.ActionBar.y6.f23500l6, null);
        c2Var.setCursorWidth(1.5f);
        c2Var.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(c2Var);
        addView(c2Var, gb1.i(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
