package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class nt implements Utilities.Callback {
    public final st f31132a;
    public final int f31133b;
    public final int f31134c;

    public nt(st stVar, int i10, int i11) {
        this.f31132a = stVar;
        this.f31133b = i10;
        this.f31134c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        st stVar = this.f31132a;
        Editable text = stVar.getText();
        int i10 = this.f31133b;
        text.replace(i10, this.f31134c, charSequence);
        stVar.setSelection(i10, charSequence.length() + i10);
    }
}
