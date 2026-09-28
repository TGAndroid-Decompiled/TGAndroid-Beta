package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class wt implements Utilities.Callback {
    public final du f30172a;
    public final int f30173b;
    public final int f30174c;

    public wt(du duVar, int i10, int i11) {
        this.f30172a = duVar;
        this.f30173b = i10;
        this.f30174c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        du duVar = this.f30172a;
        Editable text = duVar.getText();
        int i10 = this.f30173b;
        text.replace(i10, this.f30174c, charSequence);
        duVar.setSelection(i10, charSequence.length() + i10);
    }
}
