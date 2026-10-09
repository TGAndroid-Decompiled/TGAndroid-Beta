package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class gu implements Utilities.Callback0Return {
    public final int f26882a;
    public final Object f26883b;

    public gu(Object obj, int i10) {
        this.f26882a = i10;
        this.f26883b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        wj0[] wj0VarArr;
        int i10 = this.f26882a;
        Object obj = this.f26883b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24161a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((wj0VarArr = (wj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), wj0.class)) == null || wj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((l50) obj).getCloseIntoObject();
        }
    }
}
