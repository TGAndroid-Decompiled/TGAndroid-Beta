package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class yt implements Utilities.Callback {
    public final fu f29491a;
    public final int f29492b;
    public final int f29493c;

    public yt(fu fuVar, int i10, int i11) {
        this.f29491a = fuVar;
        this.f29492b = i10;
        this.f29493c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        fu fuVar = this.f29491a;
        Editable text = fuVar.getText();
        int i10 = this.f29492b;
        text.replace(i10, this.f29493c, charSequence);
        fuVar.setSelection(i10, charSequence.length() + i10);
    }
}
