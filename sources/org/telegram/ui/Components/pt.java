package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class pt implements Utilities.Callback {
    public final ut f27996a;
    public final int f27997b;
    public final int f27998c;

    public pt(ut utVar, int i10, int i11) {
        this.f27996a = utVar;
        this.f27997b = i10;
        this.f27998c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ut utVar = this.f27996a;
        Editable text = utVar.getText();
        int i10 = this.f27997b;
        text.replace(i10, this.f27998c, charSequence);
        utVar.setSelection(i10, charSequence.length() + i10);
    }
}
