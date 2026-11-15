package org.telegram.ui.Components;

import android.text.Editable;
public final class at implements org.telegram.messenger.z10 {
    public final ft f33058a;
    public final int f33059b;
    public final int f33060c;

    public at(ft ftVar, int i7, int i10) {
        this.f33058a = ftVar;
        this.f33059b = i7;
        this.f33060c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ft ftVar = this.f33058a;
        Editable text = ftVar.getText();
        int i7 = this.f33059b;
        text.replace(i7, this.f33060c, charSequence);
        ftVar.setSelection(i7, charSequence.length() + i7);
    }
}
