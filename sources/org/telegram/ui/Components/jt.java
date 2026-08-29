package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class jt implements Utilities.Callback0Return {
    public final int f29817a;
    public final Object f29818b;

    public jt(Object obj, int i10) {
        this.f29817a = i10;
        this.f29818b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        pi0[] pi0VarArr;
        int i10 = this.f29817a;
        Object obj = this.f29818b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f26384a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((pi0VarArr = (pi0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), pi0.class)) == null || pi0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((r40) obj).getCloseIntoObject();
        }
    }
}
