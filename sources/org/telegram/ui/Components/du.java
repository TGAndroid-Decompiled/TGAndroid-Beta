package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25696a;
    public final int f25697b;
    public final int f25698c;

    public du(iu iuVar, int i10, int i11) {
        this.f25696a = iuVar;
        this.f25697b = i10;
        this.f25698c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25696a;
        Editable text = iuVar.getText();
        int i10 = this.f25697b;
        text.replace(i10, this.f25698c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
