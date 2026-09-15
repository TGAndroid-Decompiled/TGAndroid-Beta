package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p91 implements TextWatcher {
    public boolean f36511a;
    public final int f36512b;
    public final EditTextBoldCursor f36513c;
    public final org.telegram.ui.Components.yc0 d;
    public final int[] e;
    public final TextView f36514f;

    public p91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.yc0 yc0Var, int[] iArr, TextView textView) {
        this.f36512b = i10;
        this.f36513c = editTextBoldCursor;
        this.d = yc0Var;
        this.e = iArr;
        this.f36514f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
