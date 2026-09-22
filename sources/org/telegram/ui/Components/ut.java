package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28501a;
    public final int f28502b;
    public final int f28503c;

    public ut(bu buVar, int i10, int i11) {
        this.f28501a = buVar;
        this.f28502b = i10;
        this.f28503c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28501a;
        Editable text = buVar.getText();
        int i10 = this.f28502b;
        text.replace(i10, this.f28503c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
