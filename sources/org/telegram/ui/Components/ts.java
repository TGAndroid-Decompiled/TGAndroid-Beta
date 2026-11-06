package org.telegram.ui.Components;

import android.text.Editable;
public final class ts implements org.telegram.messenger.c20 {
    public final ys f38388a;
    public final int f38389b;
    public final int f38390c;

    public ts(ys ysVar, int i7, int i10) {
        this.f38388a = ysVar;
        this.f38389b = i7;
        this.f38390c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ys ysVar = this.f38388a;
        Editable text = ysVar.getText();
        int i7 = this.f38389b;
        text.replace(i7, this.f38390c, charSequence);
        ysVar.setSelection(i7, charSequence.length() + i7);
    }
}
