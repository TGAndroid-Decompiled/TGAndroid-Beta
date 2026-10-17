package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 extends sd0 {
    public final ei.e2 L;

    public rd0(Context context) {
        super(context, null);
        ei.e2 e2Var = new ei.e2(this, context, 5);
        this.L = e2Var;
        e2Var.setTextSize(1, 18.0f);
        e2Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        e2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        e2Var.setBackground(null);
        e2Var.setSingleLine(true);
        e2Var.setInputType(1);
        e2Var.setTypeface(Typeface.DEFAULT);
        e2Var.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130l6, false));
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
}
