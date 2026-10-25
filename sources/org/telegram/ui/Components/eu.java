package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class eu implements Utilities.Callback {
    public final ju f27982a;
    public final int f27983b;
    public final int f27984c;

    public eu(ju juVar, int i10, int i11) {
        this.f27982a = juVar;
        this.f27983b = i10;
        this.f27984c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ju juVar = this.f27982a;
        Editable text = juVar.getText();
        int i10 = this.f27983b;
        text.replace(i10, this.f27984c, charSequence);
        juVar.setSelection(i10, charSequence.length() + i10);
    }
}
