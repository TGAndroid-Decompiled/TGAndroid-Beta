package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class hu implements Utilities.Callback0Return {
    public final int f27078a;
    public final Object f27079b;

    public hu(Object obj, int i10) {
        this.f27078a = i10;
        this.f27079b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        yj0[] yj0VarArr;
        int i10 = this.f27078a;
        Object obj = this.f27079b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24153a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((yj0VarArr = (yj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), yj0.class)) == null || yj0VarArr.length == 0)) {
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
