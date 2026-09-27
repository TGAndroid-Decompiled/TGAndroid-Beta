package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class wt implements Utilities.Callback {
    public final du f30175a;
    public final int f30176b;
    public final int f30177c;

    public wt(du duVar, int i10, int i11) {
        this.f30175a = duVar;
        this.f30176b = i10;
        this.f30177c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        du duVar = this.f30175a;
        Editable text = duVar.getText();
        int i10 = this.f30176b;
        text.replace(i10, this.f30177c, charSequence);
        duVar.setSelection(i10, charSequence.length() + i10);
    }
}
