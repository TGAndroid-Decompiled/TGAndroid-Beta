package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l91 implements TextWatcher {
    public boolean f38203a;
    public final int f38204b;
    public final EditTextBoldCursor f38205c;
    public final org.telegram.ui.Components.ld0 d;
    public final int[] f38206e;
    public final TextView f38207f;

    public l91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ld0 ld0Var, int[] iArr, TextView textView) {
        this.f38204b = i10;
        this.f38205c = editTextBoldCursor;
        this.d = ld0Var;
        this.f38206e = iArr;
        this.f38207f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
