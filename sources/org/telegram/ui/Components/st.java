package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback {
    public final zt f30439a;
    public final int f30440b;
    public final int f30441c;

    public st(zt ztVar, int i10, int i11) {
        this.f30439a = ztVar;
        this.f30440b = i10;
        this.f30441c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zt ztVar = this.f30439a;
        Editable text = ztVar.getText();
        int i10 = this.f30440b;
        text.replace(i10, this.f30441c, charSequence);
        ztVar.setSelection(i10, charSequence.length() + i10);
    }
}
