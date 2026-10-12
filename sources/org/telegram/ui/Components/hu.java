package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class hu implements Utilities.Callback {
    public final nu f25746a;
    public final int f25747b;
    public final int f25748c;

    public hu(nu nuVar, int i10, int i11) {
        this.f25746a = nuVar;
        this.f25747b = i10;
        this.f25748c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        nu nuVar = this.f25746a;
        Editable text = nuVar.getText();
        int i10 = this.f25747b;
        text.replace(i10, this.f25748c, charSequence);
        nuVar.setSelection(i10, charSequence.length() + i10);
    }
}
