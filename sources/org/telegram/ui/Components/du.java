package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class du implements Utilities.Callback {
    public final iu f25703a;
    public final int f25704b;
    public final int f25705c;

    public du(iu iuVar, int i10, int i11) {
        this.f25703a = iuVar;
        this.f25704b = i10;
        this.f25705c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.f25703a;
        Editable text = iuVar.getText();
        int i10 = this.f25704b;
        text.replace(i10, this.f25705c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
