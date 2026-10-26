package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class eu implements Utilities.Callback {
    public final ju f27984a;
    public final int f27985b;
    public final int f27986c;

    public eu(ju juVar, int i10, int i11) {
        this.f27984a = juVar;
        this.f27985b = i10;
        this.f27986c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ju juVar = this.f27984a;
        Editable text = juVar.getText();
        int i10 = this.f27985b;
        text.replace(i10, this.f27986c, charSequence);
        juVar.setSelection(i10, charSequence.length() + i10);
    }
}
