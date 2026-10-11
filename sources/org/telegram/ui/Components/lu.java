package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class lu implements Utilities.Callback {
    public final su f28458a;
    public final int f28459b;
    public final int f28460c;

    public lu(su suVar, int i10, int i11) {
        this.f28458a = suVar;
        this.f28459b = i10;
        this.f28460c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        su suVar = this.f28458a;
        Editable text = suVar.getText();
        int i10 = this.f28459b;
        text.replace(i10, this.f28460c, charSequence);
        suVar.setSelection(i10, charSequence.length() + i10);
    }
}
