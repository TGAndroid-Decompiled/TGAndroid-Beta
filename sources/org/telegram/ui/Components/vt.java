package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class vt implements Utilities.Callback {
    public final cu f29387a;
    public final int f29388b;
    public final int f29389c;

    public vt(cu cuVar, int i10, int i11) {
        this.f29387a = cuVar;
        this.f29388b = i10;
        this.f29389c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        cu cuVar = this.f29387a;
        Editable text = cuVar.getText();
        int i10 = this.f29388b;
        text.replace(i10, this.f29389c, charSequence);
        cuVar.setSelection(i10, charSequence.length() + i10);
    }
}
