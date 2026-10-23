package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25631a;
    public final int f25632b;
    public final int f25633c;

    public du(iu iuVar, int i10, int i11) {
        this.f25631a = iuVar;
        this.f25632b = i10;
        this.f25633c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25631a;
        Editable text = iuVar.getText();
        int i10 = this.f25632b;
        text.replace(i10, this.f25633c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
