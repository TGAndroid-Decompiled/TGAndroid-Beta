package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28850a;
    public final int f28851b;
    public final int f28852c;

    public ut(bu buVar, int i10, int i11) {
        this.f28850a = buVar;
        this.f28851b = i10;
        this.f28852c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28850a;
        Editable text = buVar.getText();
        int i10 = this.f28851b;
        text.replace(i10, this.f28852c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
