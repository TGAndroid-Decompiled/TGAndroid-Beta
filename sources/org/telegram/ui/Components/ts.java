package org.telegram.ui.Components;

import android.text.Editable;
public final class ts implements org.telegram.messenger.c20 {
    public final ys f38408a;
    public final int f38409b;
    public final int f38410c;

    public ts(ys ysVar, int i7, int i10) {
        this.f38408a = ysVar;
        this.f38409b = i7;
        this.f38410c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ys ysVar = this.f38408a;
        Editable text = ysVar.getText();
        int i7 = this.f38409b;
        text.replace(i7, this.f38410c, charSequence);
        ysVar.setSelection(i7, charSequence.length() + i7);
    }
}
