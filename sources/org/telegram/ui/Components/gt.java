package org.telegram.ui.Components;

import android.text.Editable;
public final class gt implements org.telegram.messenger.w10 {
    public final mt f35533a;
    public final int f35534b;
    public final int f35535c;

    public gt(mt mtVar, int i7, int i10) {
        this.f35533a = mtVar;
        this.f35534b = i7;
        this.f35535c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.f35533a;
        Editable text = mtVar.getText();
        int i7 = this.f35534b;
        text.replace(i7, this.f35535c, charSequence);
        mtVar.setSelection(i7, charSequence.length() + i7);
    }
}
