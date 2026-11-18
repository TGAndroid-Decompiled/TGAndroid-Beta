package org.telegram.ui.Components;

import android.text.Editable;
public final class gt implements org.telegram.messenger.x10 {
    public final mt f35560a;
    public final int f35561b;
    public final int f35562c;

    public gt(mt mtVar, int i7, int i10) {
        this.f35560a = mtVar;
        this.f35561b = i7;
        this.f35562c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.f35560a;
        Editable text = mtVar.getText();
        int i7 = this.f35561b;
        text.replace(i7, this.f35562c, charSequence);
        mtVar.setSelection(i7, charSequence.length() + i7);
    }
}
