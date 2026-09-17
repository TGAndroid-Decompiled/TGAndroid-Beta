package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ot implements Utilities.Callback0Return {
    public final int f29180a;
    public final Object f29181b;

    public ot(Object obj, int i10) {
        this.f29180a = i10;
        this.f29181b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        ri0[] ri0VarArr;
        int i10 = this.f29180a;
        Object obj = this.f29181b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f23972a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ri0VarArr = (ri0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ri0.class)) == null || ri0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((t40) obj).getCloseIntoObject();
        }
    }
}
