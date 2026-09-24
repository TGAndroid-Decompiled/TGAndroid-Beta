package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class vt implements Utilities.Callback {
    public final cu f29797a;
    public final int f29798b;
    public final int f29799c;

    public vt(cu cuVar, int i10, int i11) {
        this.f29797a = cuVar;
        this.f29798b = i10;
        this.f29799c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        cu cuVar = this.f29797a;
        Editable text = cuVar.getText();
        int i10 = this.f29798b;
        text.replace(i10, this.f29799c, charSequence);
        cuVar.setSelection(i10, charSequence.length() + i10);
    }
}
