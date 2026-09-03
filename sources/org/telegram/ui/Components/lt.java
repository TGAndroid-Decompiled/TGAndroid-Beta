package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class lt implements Utilities.Callback0Return {
    public final int f26872a;
    public final Object f26873b;

    public lt(Object obj, int i10) {
        this.f26872a = i10;
        this.f26873b = obj;
    }

    @Override
    public final Object run() {
        boolean z4;
        Editable text;
        zi0[] zi0VarArr;
        int i10 = this.f26872a;
        Object obj = this.f26873b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22995a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((zi0VarArr = (zi0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), zi0.class)) == null || zi0VarArr.length == 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                return ((w40) obj).getCloseIntoObject();
        }
    }
}
