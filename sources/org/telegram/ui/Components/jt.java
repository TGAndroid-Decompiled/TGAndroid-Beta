package org.telegram.ui.Components;

import android.text.Editable;
public final class jt implements org.telegram.messenger.y10 {
    public final ot f36602a;
    public final int f36603b;
    public final int f36604c;

    public jt(ot otVar, int i7, int i10) {
        this.f36602a = otVar;
        this.f36603b = i7;
        this.f36604c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ot otVar = this.f36602a;
        Editable text = otVar.getText();
        int i7 = this.f36603b;
        text.replace(i7, this.f36604c, charSequence);
        otVar.setSelection(i7, charSequence.length() + i7);
    }
}
