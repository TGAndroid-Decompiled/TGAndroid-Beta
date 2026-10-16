package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class hu implements Utilities.Callback {
    public final nu f25400a;
    public final int f25401b;
    public final int f25402c;

    public hu(nu nuVar, int i10, int i11) {
        this.f25400a = nuVar;
        this.f25401b = i10;
        this.f25402c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        nu nuVar = this.f25400a;
        Editable text = nuVar.getText();
        int i10 = this.f25401b;
        text.replace(i10, this.f25402c, charSequence);
        nuVar.setSelection(i10, charSequence.length() + i10);
    }
}
