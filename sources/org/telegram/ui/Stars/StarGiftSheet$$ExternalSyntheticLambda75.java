package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;

public final class StarGiftSheet$$ExternalSyntheticLambda75 implements Utilities.Callback {
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda75(StarGiftSheet starGiftSheet) {
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.dismiss(((Boolean) obj).booleanValue());
    }
}
