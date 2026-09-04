package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback {
    public final zt f30412a;
    public final int f30413b;
    public final int f30414c;

    public st(zt ztVar, int i10, int i11) {
        this.f30412a = ztVar;
        this.f30413b = i10;
        this.f30414c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zt ztVar = this.f30412a;
        Editable text = ztVar.getText();
        int i10 = this.f30413b;
        text.replace(i10, this.f30414c, charSequence);
        ztVar.setSelection(i10, charSequence.length() + i10);
    }
}
