package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class tt implements Utilities.Callback0Return {
    public final int f28655a;
    public final Object f28656b;

    public tt(Object obj, int i10) {
        this.f28655a = i10;
        this.f28656b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        fj0[] fj0VarArr;
        int i10 = this.f28655a;
        Object obj = this.f28656b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22276a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((fj0VarArr = (fj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), fj0.class)) == null || fj0VarArr.length == 0)) {
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
