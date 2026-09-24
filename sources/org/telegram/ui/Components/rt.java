package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class rt implements Utilities.Callback0Return {
    public final int f28040a;
    public final Object f28041b;

    public rt(Object obj, int i10) {
        this.f28040a = i10;
        this.f28041b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        cj0[] cj0VarArr;
        int i10 = this.f28040a;
        Object obj = this.f28041b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22240a;
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
