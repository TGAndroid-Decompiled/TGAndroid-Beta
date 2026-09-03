package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ot implements Utilities.Callback0Return {
    public final int f29879a;
    public final Object f29880b;

    public ot(Object obj, int i10) {
        this.f29879a = i10;
        this.f29880b = obj;
    }

    @Override
    public final Object run() {
        boolean z4;
        Editable text;
        aj0[] aj0VarArr;
        int i10 = this.f29879a;
        Object obj = this.f29880b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24872a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((aj0VarArr = (aj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), aj0.class)) == null || aj0VarArr.length == 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                return ((x40) obj).getCloseIntoObject();
        }
    }
}
