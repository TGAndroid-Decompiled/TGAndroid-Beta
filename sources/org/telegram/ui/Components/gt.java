package org.telegram.ui.Components;

import android.text.Editable;
public final class gt implements org.telegram.messenger.r20 {
    public final mt f26544a;
    public final int f26545b;
    public final int f26546c;

    public gt(mt mtVar, int i10, int i11) {
        this.f26544a = mtVar;
        this.f26545b = i10;
        this.f26546c = i11;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.f26544a;
        Editable text = mtVar.getText();
        int i10 = this.f26545b;
        text.replace(i10, this.f26546c, charSequence);
        mtVar.setSelection(i10, charSequence.length() + i10);
    }
}
