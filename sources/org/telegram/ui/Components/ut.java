package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28486a;
    public final int f28487b;
    public final int f28488c;

    public ut(bu buVar, int i10, int i11) {
        this.f28486a = buVar;
        this.f28487b = i10;
        this.f28488c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28486a;
        Editable text = buVar.getText();
        int i10 = this.f28487b;
        text.replace(i10, this.f28488c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
