package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class au implements Utilities.Callback0Return {
    public final int f26618a;
    public final Object f26619b;

    public au(Object obj, int i10) {
        this.f26618a = i10;
        this.f26619b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        rj0[] rj0VarArr;
        int i10 = this.f26618a;
        Object obj = this.f26619b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f26149a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((rj0VarArr = (rj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), rj0.class)) == null || rj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((f50) obj).getCloseIntoObject();
        }
    }
}
