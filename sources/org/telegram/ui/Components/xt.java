package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class xt implements Utilities.Callback {
    public final eu f33087a;
    public final int f33088b;
    public final int f33089c;

    public xt(eu euVar, int i10, int i11) {
        this.f33087a = euVar;
        this.f33088b = i10;
        this.f33089c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        eu euVar = this.f33087a;
        Editable text = euVar.getText();
        int i10 = this.f33088b;
        text.replace(i10, this.f33089c, charSequence);
        euVar.setSelection(i10, charSequence.length() + i10);
    }
}
