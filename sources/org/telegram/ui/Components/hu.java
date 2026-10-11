package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class hu implements Utilities.Callback0Return {
    public final int f27240a;
    public final Object f27241b;

    public hu(Object obj, int i10) {
        this.f27240a = i10;
        this.f27241b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        xj0[] xj0VarArr;
        int i10 = this.f27240a;
        Object obj = this.f27241b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24189a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((xj0VarArr = (xj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), xj0.class)) == null || xj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((m50) obj).getCloseIntoObject();
        }
    }
}
