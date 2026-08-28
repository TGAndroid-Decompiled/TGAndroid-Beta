package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ct implements Utilities.Callback0Return {
    public final int f27563a;
    public final Object f27564b;

    public ct(Object obj, int i9) {
        this.f27563a = i9;
        this.f27564b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        ei0[] ei0VarArr;
        int i9 = this.f27563a;
        Object obj = this.f27564b;
        switch (i9) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i10 = EditTextBoldCursor.f26373a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ei0VarArr = (ei0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ei0.class)) == null || ei0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((d40) obj).getCloseIntoObject();
        }
    }
}
