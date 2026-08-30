package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class qt implements Utilities.Callback {
    public final vt f28234a;
    public final int f28235b;
    public final int f28236c;

    public qt(vt vtVar, int i10, int i11) {
        this.f28234a = vtVar;
        this.f28235b = i10;
        this.f28236c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        vt vtVar = this.f28234a;
        Editable text = vtVar.getText();
        int i10 = this.f28235b;
        text.replace(i10, this.f28236c, charSequence);
        vtVar.setSelection(i10, charSequence.length() + i10);
    }
}
