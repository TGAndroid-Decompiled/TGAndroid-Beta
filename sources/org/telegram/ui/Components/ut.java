package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback0Return {
    public final int f27743a;
    public final Object f27744b;

    public ut(Object obj, int i10) {
        this.f27743a = i10;
        this.f27744b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        bj0[] bj0VarArr;
        int i10 = this.f27743a;
        Object obj = this.f27744b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f21117a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((bj0VarArr = (bj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), bj0.class)) == null || bj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((d50) obj).getCloseIntoObject();
        }
    }
}
