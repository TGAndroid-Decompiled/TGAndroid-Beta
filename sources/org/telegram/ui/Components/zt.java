package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class zt implements Utilities.Callback0Return {
    public final int f33030a;
    public final Object f33031b;

    public zt(Object obj, int i10) {
        this.f33030a = i10;
        this.f33031b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        oj0[] oj0VarArr;
        int i10 = this.f33030a;
        Object obj = this.f33031b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24214a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((oj0VarArr = (oj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), oj0.class)) == null || oj0VarArr.length == 0)) {
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
