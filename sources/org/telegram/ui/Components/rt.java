package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class rt implements Utilities.Callback0Return {
    public final int f27721a;
    public final Object f27722b;

    public rt(Object obj, int i10) {
        this.f27721a = i10;
        this.f27722b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        si0[] si0VarArr;
        int i10 = this.f27721a;
        Object obj = this.f27722b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22003a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((si0VarArr = (si0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), si0.class)) == null || si0VarArr.length == 0)) {
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
