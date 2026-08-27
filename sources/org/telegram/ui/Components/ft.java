package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

public final class ft implements Utilities.Callback {

    public final lt f28447a;

    public final int f28448b;

    public final int f28449c;

    public ft(lt ltVar, int i10, int i11) {
        this.f28447a = ltVar;
        this.f28448b = i10;
        this.f28449c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        lt ltVar = this.f28447a;
        Editable text = ltVar.getText();
        int i10 = this.f28448b;
        text.replace(i10, this.f28449c, charSequence);
        ltVar.setSelection(i10, charSequence.length() + i10);
    }
}
