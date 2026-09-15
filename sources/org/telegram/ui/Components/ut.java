package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28504a;
    public final int f28505b;
    public final int f28506c;

    public ut(bu buVar, int i10, int i11) {
        this.f28504a = buVar;
        this.f28505b = i10;
        this.f28506c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28504a;
        Editable text = buVar.getText();
        int i10 = this.f28505b;
        text.replace(i10, this.f28506c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
