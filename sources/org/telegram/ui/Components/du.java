package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25635a;
    public final int f25636b;
    public final int f25637c;

    public du(iu iuVar, int i10, int i11) {
        this.f25635a = iuVar;
        this.f25636b = i10;
        this.f25637c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25635a;
        Editable text = iuVar.getText();
        int i10 = this.f25636b;
        text.replace(i10, this.f25637c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
