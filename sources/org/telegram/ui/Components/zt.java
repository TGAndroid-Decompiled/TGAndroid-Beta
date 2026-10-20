package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class zt implements Utilities.Callback0Return {
    public final int f33039a;
    public final Object f33040b;

    public zt(Object obj, int i10) {
        this.f33039a = i10;
        this.f33040b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        pj0[] pj0VarArr;
        int i10 = this.f33039a;
        Object obj = this.f33040b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24211a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((pj0VarArr = (pj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), pj0.class)) == null || pj0VarArr.length == 0)) {
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
