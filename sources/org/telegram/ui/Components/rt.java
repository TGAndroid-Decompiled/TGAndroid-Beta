package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class rt implements Utilities.Callback0Return {
    public final int f28049a;
    public final Object f28050b;

    public rt(Object obj, int i10) {
        this.f28049a = i10;
        this.f28050b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        cj0[] cj0VarArr;
        int i10 = this.f28049a;
        Object obj = this.f28050b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22255a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((cj0VarArr = (cj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), cj0.class)) == null || cj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((u40) obj).getCloseIntoObject();
        }
    }
}
