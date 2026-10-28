package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class eu implements Utilities.Callback {
    public final ju f27931a;
    public final int f27932b;
    public final int f27933c;

    public eu(ju juVar, int i10, int i11) {
        this.f27931a = juVar;
        this.f27932b = i10;
        this.f27933c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ju juVar = this.f27931a;
        Editable text = juVar.getText();
        int i10 = this.f27932b;
        text.replace(i10, this.f27933c, charSequence);
        juVar.setSelection(i10, charSequence.length() + i10);
    }
}
