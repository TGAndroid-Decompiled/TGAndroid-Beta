package org.telegram.ui.Components;

import android.text.Editable;
public final class ts implements org.telegram.messenger.c20 {
    public final zs f38481a;
    public final int f38482b;
    public final int f38483c;

    public ts(zs zsVar, int i7, int i10) {
        this.f38481a = zsVar;
        this.f38482b = i7;
        this.f38483c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zs zsVar = this.f38481a;
        Editable text = zsVar.getText();
        int i7 = this.f38482b;
        text.replace(i7, this.f38483c, charSequence);
        zsVar.setSelection(i7, charSequence.length() + i7);
    }
}
