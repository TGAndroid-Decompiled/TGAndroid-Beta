package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class Weather$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final boolean f$0;
    public final AlertDialog f$1;
    public final Utilities.Callback f$2;

    public Weather$$ExternalSyntheticLambda1(boolean z, AlertDialog alertDialog, Utilities.Callback callback) {
        this.f$0 = z;
        this.f$1 = alertDialog;
        this.f$2 = callback;
    }

    @Override
    public final void run(Object obj) {
        Weather.State state = (Weather.State) obj;
        if (this.f$0) {
            this.f$1.dismissUnless(350L);
        }
        this.f$2.run(state);
    }
}
