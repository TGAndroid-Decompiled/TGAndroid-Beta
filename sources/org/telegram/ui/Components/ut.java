package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28483a;
    public final int f28484b;
    public final int f28485c;

    public ut(bu buVar, int i10, int i11) {
        this.f28483a = buVar;
        this.f28484b = i10;
        this.f28485c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28483a;
        Editable text = buVar.getText();
        int i10 = this.f28484b;
        text.replace(i10, this.f28485c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
