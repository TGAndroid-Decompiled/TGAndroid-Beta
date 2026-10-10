package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class lu implements Utilities.Callback {
    public final su f28541a;
    public final int f28542b;
    public final int f28543c;

    public lu(su suVar, int i10, int i11) {
        this.f28541a = suVar;
        this.f28542b = i10;
        this.f28543c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        su suVar = this.f28541a;
        Editable text = suVar.getText();
        int i10 = this.f28542b;
        text.replace(i10, this.f28543c, charSequence);
        suVar.setSelection(i10, charSequence.length() + i10);
    }
}
