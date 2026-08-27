package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;

public final class ic0 extends jc0 {
    public final gg.g H;

    public ic0(Context context) {
        super(context, null);
        gg.g gVar = new gg.g(this, context, 6);
        this.H = gVar;
        gVar.setTextSize(1, 18.0f);
        gVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        gVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        gVar.setBackground(null);
        gVar.setSingleLine(true);
        gVar.setInputType(1);
        gVar.setTypeface(Typeface.DEFAULT);
        gVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false));
        gVar.setCursorWidth(1.5f);
        gVar.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(gVar);
        addView(gVar, h7.z5.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.H;
    }

    public void setHint(String str) {
        setText(str);
    }
}
