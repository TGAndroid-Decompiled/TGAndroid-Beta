package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
public final class yd0 extends ae0 {
    public final ci.g2 L;

    public yd0(Context context) {
        super(context, null);
        ci.g2 g2Var = new ci.g2(this, context, 5);
        this.L = g2Var;
        g2Var.setTextSize(1, 18.0f);
        g2Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        g2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        g2Var.setBackground(null);
        g2Var.setSingleLine(true);
        g2Var.setInputType(1);
        g2Var.setTypeface(Typeface.DEFAULT);
        g2Var.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20968l6, false));
        g2Var.setCursorWidth(1.5f);
        g2Var.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(g2Var);
        addView(g2Var, w7.x5.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }
}
