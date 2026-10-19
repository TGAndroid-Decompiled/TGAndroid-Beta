package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25637a;
    public final int f25638b;
    public final int f25639c;

    public du(iu iuVar, int i10, int i11) {
        this.f25637a = iuVar;
        this.f25638b = i10;
        this.f25639c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25637a;
        Editable text = iuVar.getText();
        int i10 = this.f25638b;
        text.replace(i10, this.f25639c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
