package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class wt implements Utilities.Callback {
    public final du f30199a;
    public final int f30200b;
    public final int f30201c;

    public wt(du duVar, int i10, int i11) {
        this.f30199a = duVar;
        this.f30200b = i10;
        this.f30201c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        du duVar = this.f30199a;
        Editable text = duVar.getText();
        int i10 = this.f30200b;
        text.replace(i10, this.f30201c, charSequence);
        duVar.setSelection(i10, charSequence.length() + i10);
    }
}
