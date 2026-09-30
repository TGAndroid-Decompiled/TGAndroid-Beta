package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class xt implements Utilities.Callback {
    public final eu f30500a;
    public final int f30501b;
    public final int f30502c;

    public xt(eu euVar, int i10, int i11) {
        this.f30500a = euVar;
        this.f30501b = i10;
        this.f30502c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        eu euVar = this.f30500a;
        Editable text = euVar.getText();
        int i10 = this.f30501b;
        text.replace(i10, this.f30502c, charSequence);
        euVar.setSelection(i10, charSequence.length() + i10);
    }
}
