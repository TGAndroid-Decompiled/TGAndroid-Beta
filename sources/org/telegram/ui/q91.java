package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q91 implements TextWatcher {
    public boolean f36764a;
    public final int f36765b;
    public final EditTextBoldCursor f36766c;
    public final org.telegram.ui.Components.id0 d;
    public final int[] e;
    public final TextView f36767f;

    public q91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.id0 id0Var, int[] iArr, TextView textView) {
        this.f36765b = i10;
        this.f36766c = editTextBoldCursor;
        this.d = id0Var;
        this.e = iArr;
        this.f36767f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
