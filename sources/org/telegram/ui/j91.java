package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j91 implements TextWatcher {
    public boolean f34705a;
    public final int f34706b;
    public final EditTextBoldCursor f34707c;
    public final org.telegram.ui.Components.ld0 d;
    public final int[] e;
    public final TextView f34708f;

    public j91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ld0 ld0Var, int[] iArr, TextView textView) {
        this.f34706b = i10;
        this.f34707c = editTextBoldCursor;
        this.d = ld0Var;
        this.e = iArr;
        this.f34708f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
