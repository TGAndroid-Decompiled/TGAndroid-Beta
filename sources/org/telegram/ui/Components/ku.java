package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ku implements Utilities.Callback {
    public final ru f28165a;
    public final int f28166b;
    public final int f28167c;

    public ku(ru ruVar, int i10, int i11) {
        this.f28165a = ruVar;
        this.f28166b = i10;
        this.f28167c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ru ruVar = this.f28165a;
        Editable text = ruVar.getText();
        int i10 = this.f28166b;
        text.replace(i10, this.f28167c, charSequence);
        ruVar.setSelection(i10, charSequence.length() + i10);
    }
}
