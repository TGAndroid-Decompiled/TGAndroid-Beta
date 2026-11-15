package org.telegram.ui.Components;

import android.text.Editable;
public final class at implements org.telegram.messenger.z10 {
    public final ft f33061a;
    public final int f33062b;
    public final int f33063c;

    public at(ft ftVar, int i7, int i10) {
        this.f33061a = ftVar;
        this.f33062b = i7;
        this.f33063c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ft ftVar = this.f33061a;
        Editable text = ftVar.getText();
        int i7 = this.f33062b;
        text.replace(i7, this.f33063c, charSequence);
        ftVar.setSelection(i7, charSequence.length() + i7);
    }
}
