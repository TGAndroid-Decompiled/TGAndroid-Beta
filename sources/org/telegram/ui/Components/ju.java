package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ju implements Utilities.Callback0Return {
    public final int f27648a;
    public final Object f27649b;

    public ju(Object obj, int i10) {
        this.f27648a = i10;
        this.f27649b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        zj0[] zj0VarArr;
        int i10 = this.f27648a;
        Object obj = this.f27649b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f23938a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((zj0VarArr = (zj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), zj0.class)) == null || zj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((o50) obj).getCloseIntoObject();
        }
    }
}
