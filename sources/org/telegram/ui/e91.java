package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e91 implements TextWatcher {
    public boolean f36414a;
    public final int f36415b;
    public final EditTextBoldCursor f36416c;
    public final org.telegram.ui.Components.cd0 d;
    public final int[] f36417e;
    public final TextView f36418f;

    public e91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.cd0 cd0Var, int[] iArr, TextView textView) {
        this.f36415b = i10;
        this.f36416c = editTextBoldCursor;
        this.d = cd0Var;
        this.f36417e = iArr;
        this.f36418f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
