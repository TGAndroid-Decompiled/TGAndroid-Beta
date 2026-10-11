package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class lu implements Utilities.Callback {
    public final su f28617a;
    public final int f28618b;
    public final int f28619c;

    public lu(su suVar, int i10, int i11) {
        this.f28617a = suVar;
        this.f28618b = i10;
        this.f28619c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        su suVar = this.f28617a;
        Editable text = suVar.getText();
        int i10 = this.f28618b;
        text.replace(i10, this.f28619c, charSequence);
        suVar.setSelection(i10, charSequence.length() + i10);
    }
}
