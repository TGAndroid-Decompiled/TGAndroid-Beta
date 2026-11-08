package org.telegram.ui.Components;

import android.text.Editable;
public final class ts implements org.telegram.messenger.c20 {
    public final zs f38416a;
    public final int f38417b;
    public final int f38418c;

    public ts(zs zsVar, int i7, int i10) {
        this.f38416a = zsVar;
        this.f38417b = i7;
        this.f38418c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zs zsVar = this.f38416a;
        Editable text = zsVar.getText();
        int i7 = this.f38417b;
        text.replace(i7, this.f38418c, charSequence);
        zsVar.setSelection(i7, charSequence.length() + i7);
    }
}
