package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class st implements Utilities.Callback {
    public final xt f31167a;
    public final int f31168b;
    public final int f31169c;

    public st(xt xtVar, int i10, int i11) {
        this.f31167a = xtVar;
        this.f31168b = i10;
        this.f31169c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xt xtVar = this.f31167a;
        Editable text = xtVar.getText();
        int i10 = this.f31168b;
        text.replace(i10, this.f31169c, charSequence);
        xtVar.setSelection(i10, charSequence.length() + i10);
    }
}
