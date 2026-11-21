package org.telegram.ui.Components;

import android.text.Editable;
public final class jt implements org.telegram.messenger.x10 {
    public final ot f36607a;
    public final int f36608b;
    public final int f36609c;

    public jt(ot otVar, int i7, int i10) {
        this.f36607a = otVar;
        this.f36608b = i7;
        this.f36609c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ot otVar = this.f36607a;
        Editable text = otVar.getText();
        int i7 = this.f36608b;
        text.replace(i7, this.f36609c, charSequence);
        otVar.setSelection(i7, charSequence.length() + i7);
    }
}
