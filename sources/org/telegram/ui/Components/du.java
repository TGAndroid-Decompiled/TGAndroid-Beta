package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25732a;
    public final int f25733b;
    public final int f25734c;

    public du(iu iuVar, int i10, int i11) {
        this.f25732a = iuVar;
        this.f25733b = i10;
        this.f25734c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25732a;
        Editable text = iuVar.getText();
        int i10 = this.f25733b;
        text.replace(i10, this.f25734c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
