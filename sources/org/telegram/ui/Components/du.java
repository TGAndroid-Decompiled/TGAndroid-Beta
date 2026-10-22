package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25630a;
    public final int f25631b;
    public final int f25632c;

    public du(iu iuVar, int i10, int i11) {
        this.f25630a = iuVar;
        this.f25631b = i10;
        this.f25632c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25630a;
        Editable text = iuVar.getText();
        int i10 = this.f25631b;
        text.replace(i10, this.f25632c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
