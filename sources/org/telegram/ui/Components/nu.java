package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class nu implements Utilities.Callback {
    public final uu f28965a;
    public final int f28966b;
    public final int f28967c;

    public nu(uu uuVar, int i10, int i11) {
        this.f28965a = uuVar;
        this.f28966b = i10;
        this.f28967c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        uu uuVar = this.f28965a;
        Editable text = uuVar.getText();
        int i10 = this.f28966b;
        text.replace(i10, this.f28967c, charSequence);
        uuVar.setSelection(i10, charSequence.length() + i10);
    }
}
