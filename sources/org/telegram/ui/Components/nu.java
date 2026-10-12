package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class nu implements Utilities.Callback {
    public final uu f28969a;
    public final int f28970b;
    public final int f28971c;

    public nu(uu uuVar, int i10, int i11) {
        this.f28969a = uuVar;
        this.f28970b = i10;
        this.f28971c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        uu uuVar = this.f28969a;
        Editable text = uuVar.getText();
        int i10 = this.f28970b;
        text.replace(i10, this.f28971c, charSequence);
        uuVar.setSelection(i10, charSequence.length() + i10);
    }
}
