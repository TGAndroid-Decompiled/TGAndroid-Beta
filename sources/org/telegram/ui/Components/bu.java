package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class bu implements Utilities.Callback {
    public final gu f25093a;
    public final int f25094b;
    public final int f25095c;

    public bu(gu guVar, int i10, int i11) {
        this.f25093a = guVar;
        this.f25094b = i10;
        this.f25095c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        gu guVar = this.f25093a;
        Editable text = guVar.getText();
        int i10 = this.f25094b;
        text.replace(i10, this.f25095c, charSequence);
        guVar.setSelection(i10, charSequence.length() + i10);
    }
}
