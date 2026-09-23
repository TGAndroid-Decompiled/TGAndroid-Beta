package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i91 implements TextWatcher {
    public boolean f34077a;
    public final int f34078b;
    public final EditTextBoldCursor f34079c;
    public final org.telegram.ui.Components.yc0 d;
    public final int[] e;
    public final TextView f34080f;

    public i91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.yc0 yc0Var, int[] iArr, TextView textView) {
        this.f34078b = i10;
        this.f34079c = editTextBoldCursor;
        this.d = yc0Var;
        this.e = iArr;
        this.f34080f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
