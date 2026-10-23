package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class td0 extends vd0 {
    public final ei.e2 L;

    public td0(Context context) {
        super(context, null);
        ei.e2 e2Var = new ei.e2(this, context, 5);
        this.L = e2Var;
        e2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.W(e2Var, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.F(e2Var, org.telegram.ui.ActionBar.k6.H6, null);
        e2Var.setBackground(null);
        e2Var.setSingleLine(true);
        e2Var.setInputType(1);
        e2Var.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.m(e2Var, 30, org.telegram.ui.ActionBar.k6.f21327l6, null);
        e2Var.setCursorWidth(1.5f);
        e2Var.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(e2Var);
        addView(e2Var, w7.z5.e(-1, -2, 16));
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
