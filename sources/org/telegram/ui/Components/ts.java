package org.telegram.ui.Components;

import android.text.Editable;
public final class ts implements org.telegram.messenger.u10 {
    public final xs f38545a;
    public final int f38546b;
    public final int f38547c;

    public ts(xs xsVar, int i3, int i10) {
        this.f38545a = xsVar;
        this.f38546b = i3;
        this.f38547c = i10;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xs xsVar = this.f38545a;
        Editable text = xsVar.getText();
        int i3 = this.f38546b;
        text.replace(i3, this.f38547c, charSequence);
        xsVar.setSelection(i3, charSequence.length() + i3);
    }
}
