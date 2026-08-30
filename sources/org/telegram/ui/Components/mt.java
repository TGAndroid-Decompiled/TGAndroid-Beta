package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class mt implements Utilities.Callback0Return {
    public final int f27117a;
    public final Object f27118b;

    public mt(Object obj, int i10) {
        this.f27117a = i10;
        this.f27118b = obj;
    }

    @Override
    public final Object run() {
        boolean z4;
        Editable text;
        yi0[] yi0VarArr;
        int i10 = this.f27117a;
        Object obj = this.f27118b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f23022a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((yi0VarArr = (yi0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), yi0.class)) == null || yi0VarArr.length == 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                return ((v40) obj).getCloseIntoObject();
        }
    }
}
