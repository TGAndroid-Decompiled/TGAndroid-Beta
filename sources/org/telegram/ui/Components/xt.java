package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class xt implements Utilities.Callback0Return {
    public final int f32699a;
    public final Object f32700b;

    public xt(Object obj, int i10) {
        this.f32699a = i10;
        this.f32700b = obj;
    }

    @Override
    public final Object run() {
        boolean z10;
        Editable text;
        rj0[] rj0VarArr;
        int i10 = this.f32699a;
        Object obj = this.f32700b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.f24357a;
                if (editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((rj0VarArr = (rj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), rj0.class)) == null || rj0VarArr.length == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return ((b50) obj).getCloseIntoObject();
        }
    }
}
