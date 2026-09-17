package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback {
    public final zt f30413a;
    public final int f30414b;
    public final int f30415c;

    public st(zt ztVar, int i10, int i11) {
        this.f30413a = ztVar;
        this.f30414b = i10;
        this.f30415c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zt ztVar = this.f30413a;
        Editable text = ztVar.getText();
        int i10 = this.f30414b;
        text.replace(i10, this.f30415c, charSequence);
        ztVar.setSelection(i10, charSequence.length() + i10);
    }
}
