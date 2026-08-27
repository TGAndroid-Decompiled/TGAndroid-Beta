package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

public final class bt implements Utilities.Callback0Return {

    public final int f27208a;

    public final Object f27209b;

    public bt(Object obj, int i10) {
        this.f27208a = i10;
        this.f27209b = obj;
    }

    @Override
    public final Object run() {
        Editable text;
        gi0[] gi0VarArr;
        int i10 = this.f27208a;
        Object obj = this.f27209b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f26369a;
                return Boolean.valueOf(editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((gi0VarArr = (gi0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), gi0.class)) == null || gi0VarArr.length == 0));
            default:
                return ((i40) obj).getCloseIntoObject();
        }
    }
}
