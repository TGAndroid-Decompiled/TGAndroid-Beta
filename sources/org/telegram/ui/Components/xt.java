package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class xt implements Utilities.Callback {
    public final eu f32987a;
    public final int f32988b;
    public final int f32989c;

    public xt(eu euVar, int i10, int i11) {
        this.f32987a = euVar;
        this.f32988b = i10;
        this.f32989c = i11;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        eu euVar = this.f32987a;
        Editable text = euVar.getText();
        int i10 = this.f32988b;
        text.replace(i10, this.f32989c, charSequence);
        euVar.setSelection(i10, charSequence.length() + i10);
    }
}
