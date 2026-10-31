package org.telegram.ui.Components;

import android.text.Editable;
public final class gt implements org.telegram.messenger.q20 {
    public final mt f26515a;
    public final int f26516b;
    public final int f26517c;

    public gt(mt mtVar, int i10, int i11) {
        this.f26515a = mtVar;
        this.f26516b = i10;
        this.f26517c = i11;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.f26515a;
        Editable text = mtVar.getText();
        int i10 = this.f26516b;
        text.replace(i10, this.f26517c, charSequence);
        mtVar.setSelection(i10, charSequence.length() + i10);
    }
}
