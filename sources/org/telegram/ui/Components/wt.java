package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class wt implements Utilities.Callback {
    public final du f30164a;
    public final int f30165b;
    public final int f30166c;

    public wt(du duVar, int i10, int i11) {
        this.f30164a = duVar;
        this.f30165b = i10;
        this.f30166c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        du duVar = this.f30164a;
        Editable text = duVar.getText();
        int i10 = this.f30165b;
        text.replace(i10, this.f30166c, charSequence);
        duVar.setSelection(i10, charSequence.length() + i10);
    }
}
