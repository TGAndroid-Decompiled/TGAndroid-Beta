package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class vt implements Utilities.Callback {
    public final cu f29807a;
    public final int f29808b;
    public final int f29809c;

    public vt(cu cuVar, int i10, int i11) {
        this.f29807a = cuVar;
        this.f29808b = i10;
        this.f29809c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        cu cuVar = this.f29807a;
        Editable text = cuVar.getText();
        int i10 = this.f29808b;
        text.replace(i10, this.f29809c, charSequence);
        cuVar.setSelection(i10, charSequence.length() + i10);
    }
}
