package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28895a;
    public final int f28896b;
    public final int f28897c;

    public ut(bu buVar, int i10, int i11) {
        this.f28895a = buVar;
        this.f28896b = i10;
        this.f28897c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28895a;
        Editable text = buVar.getText();
        int i10 = this.f28896b;
        text.replace(i10, this.f28897c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
