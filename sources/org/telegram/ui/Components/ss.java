package org.telegram.ui.Components;

import android.text.Editable;
public final class ss implements org.telegram.messenger.c20 {
    public final ys f38053a;
    public final int f38054b;
    public final int f38055c;

    public ss(ys ysVar, int i7, int i10) {
        this.f38053a = ysVar;
        this.f38054b = i7;
        this.f38055c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ys ysVar = this.f38053a;
        Editable text = ysVar.getText();
        int i7 = this.f38054b;
        text.replace(i7, this.f38055c, charSequence);
        ysVar.setSelection(i7, charSequence.length() + i7);
    }
}
