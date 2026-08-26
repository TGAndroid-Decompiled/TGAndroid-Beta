package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class EditTextCaption$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final EditTextCaption f$0;
    public final int f$1;
    public final int f$2;

    public EditTextCaption$$ExternalSyntheticLambda0(EditTextCaption editTextCaption, int i, int i2) {
        this.f$0 = editTextCaption;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.lambda$translateSelected$2(this.f$1, this.f$2, (CharSequence) obj);
    }
}
