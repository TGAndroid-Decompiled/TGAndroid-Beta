package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback0Return {
    public final int f28357a;
    public final Object f28358b;

    public st(Object obj, int i10) {
        this.f28357a = i10;
        this.f28358b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        dj0[] dj0VarArr;
        int i10 = this.f28357a;
        Object obj = this.f28358b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22254a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((dj0VarArr = (dj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), dj0.class)) == null || dj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((v40) obj).getCloseIntoObject();
        }
    }
}
