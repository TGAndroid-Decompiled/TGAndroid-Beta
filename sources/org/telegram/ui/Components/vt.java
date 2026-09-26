package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class vt implements Utilities.Callback {
    public final cu f29806a;
    public final int f29807b;
    public final int f29808c;

    public vt(cu cuVar, int i10, int i11) {
        this.f29806a = cuVar;
        this.f29807b = i10;
        this.f29808c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        cu cuVar = this.f29806a;
        Editable text = cuVar.getText();
        int i10 = this.f29807b;
        text.replace(i10, this.f29808c, charSequence);
        cuVar.setSelection(i10, charSequence.length() + i10);
    }
}
