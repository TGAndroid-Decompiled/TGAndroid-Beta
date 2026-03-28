package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ViewPagerFixed;

public final class PollItemMenu$$ExternalSyntheticLambda14 implements Utilities.Callback {
    public final ViewPagerFixed f$0;

    @Override
    public final void run(Object obj) {
        this.f$0.scrollToPosition(((Integer) obj).intValue());
    }
}
