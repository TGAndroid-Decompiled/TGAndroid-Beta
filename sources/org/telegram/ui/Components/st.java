package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback0Return {
    public final int f28378a;
    public final Object f28379b;

    public st(Object obj, int i10) {
        this.f28378a = i10;
        this.f28379b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        ej0[] ej0VarArr;
        int i10 = this.f28378a;
        Object obj = this.f28379b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f22257a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ej0VarArr = (ej0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ej0.class)) == null || ej0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((w40) obj).getCloseIntoObject();
        }
    }
}
