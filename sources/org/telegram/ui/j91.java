package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j91 implements TextWatcher {
    public boolean f34702a;
    public final int f34703b;
    public final EditTextBoldCursor f34704c;
    public final org.telegram.ui.Components.kd0 d;
    public final int[] e;
    public final TextView f34705f;

    public j91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.kd0 kd0Var, int[] iArr, TextView textView) {
        this.f34703b = i10;
        this.f34704c = editTextBoldCursor;
        this.d = kd0Var;
        this.e = iArr;
        this.f34705f = textView;
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
