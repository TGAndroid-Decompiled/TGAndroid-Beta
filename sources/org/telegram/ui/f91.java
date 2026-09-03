package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f91 implements TextWatcher {
    public boolean f34007a;
    public final int f34008b;
    public final EditTextBoldCursor f34009c;
    public final org.telegram.ui.Components.bd0 d;
    public final int[] e;
    public final TextView f34010f;

    public f91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.bd0 bd0Var, int[] iArr, TextView textView) {
        this.f34008b = i10;
        this.f34009c = editTextBoldCursor;
        this.d = bd0Var;
        this.e = iArr;
        this.f34010f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
