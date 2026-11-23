package org.telegram.ui.Components;

import android.text.Editable;
public final class jt implements org.telegram.messenger.y10 {
    public final ot f36556a;
    public final int f36557b;
    public final int f36558c;

    public jt(ot otVar, int i7, int i10) {
        this.f36556a = otVar;
        this.f36557b = i7;
        this.f36558c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ot otVar = this.f36556a;
        Editable text = otVar.getText();
        int i7 = this.f36557b;
        text.replace(i7, this.f36558c, charSequence);
        otVar.setSelection(i7, charSequence.length() + i7);
    }
}
