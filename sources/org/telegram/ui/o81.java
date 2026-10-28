package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o81 implements TextWatcher {
    public boolean f42015a;
    public final int f42016b;
    public final EditTextBoldCursor f42017c;
    public final org.telegram.ui.Components.sd0 d;
    public final int[] e;
    public final TextView f42018f;

    public o81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.sd0 sd0Var, int[] iArr, TextView textView) {
        this.f42016b = i10;
        this.f42017c = editTextBoldCursor;
        this.d = sd0Var;
        this.e = iArr;
        this.f42018f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
