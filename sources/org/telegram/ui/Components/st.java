package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback {
    public final xt f31172a;
    public final int f31173b;
    public final int f31174c;

    public st(xt xtVar, int i10, int i11) {
        this.f31172a = xtVar;
        this.f31173b = i10;
        this.f31174c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xt xtVar = this.f31172a;
        Editable text = xtVar.getText();
        int i10 = this.f31173b;
        text.replace(i10, this.f31174c, charSequence);
        xtVar.setSelection(i10, charSequence.length() + i10);
    }
}
