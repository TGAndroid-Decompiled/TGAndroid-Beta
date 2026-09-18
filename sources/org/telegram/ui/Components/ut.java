package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class ut implements Utilities.Callback {
    public final bu f28818a;
    public final int f28819b;
    public final int f28820c;

    public ut(bu buVar, int i10, int i11) {
        this.f28818a = buVar;
        this.f28819b = i10;
        this.f28820c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.f28818a;
        Editable text = buVar.getText();
        int i10 = this.f28819b;
        text.replace(i10, this.f28820c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
