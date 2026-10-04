package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class xt implements Utilities.Callback {
    public final eu f32980a;
    public final int f32981b;
    public final int f32982c;

    public xt(eu euVar, int i10, int i11) {
        this.f32980a = euVar;
        this.f32981b = i10;
        this.f32982c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        eu euVar = this.f32980a;
        Editable text = euVar.getText();
        int i10 = this.f32981b;
        text.replace(i10, this.f32982c, charSequence);
        euVar.setSelection(i10, charSequence.length() + i10);
    }
}
