package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class au implements Utilities.Callback0Return {
    public final int f26663a;
    public final Object f26664b;

    public au(Object obj, int i10) {
        this.f26663a = i10;
        this.f26664b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        sj0[] sj0VarArr;
        int i10 = this.f26663a;
        Object obj = this.f26664b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f26151a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((sj0VarArr = (sj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), sj0.class)) == null || sj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((f50) obj).getCloseIntoObject();
        }
    }
}
