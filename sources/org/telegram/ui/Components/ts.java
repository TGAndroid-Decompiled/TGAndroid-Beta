package org.telegram.ui.Components;

import android.text.Editable;
public final class ts implements org.telegram.messenger.c20 {
    public final ys f38399a;
    public final int f38400b;
    public final int f38401c;

    public ts(ys ysVar, int i7, int i10) {
        this.f38399a = ysVar;
        this.f38400b = i7;
        this.f38401c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ys ysVar = this.f38399a;
        Editable text = ysVar.getText();
        int i7 = this.f38400b;
        text.replace(i7, this.f38401c, charSequence);
        ysVar.setSelection(i7, charSequence.length() + i7);
    }
}
