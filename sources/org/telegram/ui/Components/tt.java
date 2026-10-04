package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class tt implements Utilities.Callback0Return {
    public final int f31161a;
    public final Object f31162b;

    public tt(Object obj, int i10) {
        this.f31161a = i10;
        this.f31162b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        ej0[] ej0VarArr;
        int i10 = this.f31161a;
        Object obj = this.f31162b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24158a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ej0VarArr = (ej0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ej0.class)) == null || ej0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((x40) obj).getCloseIntoObject();
        }
    }
}
