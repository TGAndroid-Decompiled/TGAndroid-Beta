package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;
public final class gt implements Utilities.Callback {
    public final mt f28865a;
    public final int f28866b;
    public final int f28867c;

    public gt(mt mtVar, int i9, int i10) {
        this.f28865a = mtVar;
        this.f28866b = i9;
        this.f28867c = i10;
    }

    @Override
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.f28865a;
        Editable text = mtVar.getText();
        int i9 = this.f28866b;
        text.replace(i9, this.f28867c, charSequence);
        mtVar.setSelection(i9, charSequence.length() + i9);
    }
}
