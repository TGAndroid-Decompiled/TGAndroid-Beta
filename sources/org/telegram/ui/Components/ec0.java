package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
public final class ec0 extends fc0 {
    public final fg.g H;

    public ec0(Context context) {
        super(context, null);
        fg.g gVar = new fg.g(this, context, 6);
        this.H = gVar;
        gVar.setTextSize(1, 18.0f);
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        gVar.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
        gVar.setBackground(null);
        gVar.setSingleLine(true);
        gVar.setInputType(1);
        gVar.setTypeface(Typeface.DEFAULT);
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false));
        gVar.setCursorWidth(1.5f);
        gVar.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(gVar);
        addView(gVar, g7.e6.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.H;
    }

    public void setHint(String str) {
        setText(str);
    }
}
