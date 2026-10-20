package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25627a;
    public final int f25628b;
    public final int f25629c;

    public du(iu iuVar, int i10, int i11) {
        this.f25627a = iuVar;
        this.f25628b = i10;
        this.f25629c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25627a;
        Editable text = iuVar.getText();
        int i10 = this.f25628b;
        text.replace(i10, this.f25629c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
