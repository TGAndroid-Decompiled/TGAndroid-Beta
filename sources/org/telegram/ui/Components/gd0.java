package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 extends hd0 {
    public final bi.t2 L;

    public gd0(Context context) {
        super(context, null);
        bi.t2 t2Var = new bi.t2(this, context, 5);
        this.L = t2Var;
        t2Var.setTextSize(1, 18.0f);
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        t2Var.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        t2Var.setBackground(null);
        t2Var.setSingleLine(true);
        t2Var.setInputType(1);
        t2Var.setTypeface(Typeface.DEFAULT);
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18073l6, false));
        t2Var.setCursorWidth(1.5f);
        t2Var.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(t2Var);
        addView(t2Var, w7.a6.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }
}
