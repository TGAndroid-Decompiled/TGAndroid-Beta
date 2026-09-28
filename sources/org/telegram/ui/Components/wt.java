package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class wt implements Utilities.Callback {
    public final du f30173a;
    public final int f30174b;
    public final int f30175c;

    public wt(du duVar, int i10, int i11) {
        this.f30173a = duVar;
        this.f30174b = i10;
        this.f30175c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        du duVar = this.f30173a;
        Editable text = duVar.getText();
        int i10 = this.f30174b;
        text.replace(i10, this.f30175c, charSequence);
        duVar.setSelection(i10, charSequence.length() + i10);
    }
}
