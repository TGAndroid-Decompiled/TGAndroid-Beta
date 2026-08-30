package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
public final class zc0 extends ad0 {
    public final kg.f I;

    public zc0(Context context) {
        super(context, null);
        kg.f fVar = new kg.f(this, context, 4);
        this.I = fVar;
        fVar.setTextSize(1, 18.0f);
        fVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        fVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        fVar.setBackground(null);
        fVar.setSingleLine(true);
        fVar.setInputType(1);
        fVar.setTypeface(Typeface.DEFAULT);
        fVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20049l6, false));
        fVar.setCursorWidth(1.5f);
        fVar.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(fVar);
        addView(fVar, k7.b6.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.I;
    }

    public void setHint(String str) {
        setText(str);
    }
}
