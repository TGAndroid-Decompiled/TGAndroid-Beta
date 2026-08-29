package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
public final class tc0 extends uc0 {
    public final ig.f H;

    public tc0(Context context) {
        super(context, null);
        ig.f fVar = new ig.f(this, context, 6);
        this.H = fVar;
        fVar.setTextSize(1, 18.0f);
        fVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        fVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        fVar.setBackground(null);
        fVar.setSingleLine(true);
        fVar.setInputType(1);
        fVar.setTypeface(Typeface.DEFAULT);
        fVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false));
        fVar.setCursorWidth(1.5f);
        fVar.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(fVar);
        addView(fVar, i7.f6.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.H;
    }

    public void setHint(String str) {
        setText(str);
    }
}
