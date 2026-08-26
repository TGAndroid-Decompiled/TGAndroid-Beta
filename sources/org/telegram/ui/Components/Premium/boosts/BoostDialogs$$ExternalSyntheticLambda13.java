package org.telegram.ui.Components.Premium.boosts;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;

public final class BoostDialogs$$ExternalSyntheticLambda13 implements Utilities.Callback {
    public final int $r8$classId;
    public final AtomicBoolean f$0;
    public final Browser.Progress f$1;

    public BoostDialogs$$ExternalSyntheticLambda13(AtomicBoolean atomicBoolean, Browser.Progress progress, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicBoolean;
        this.f$1 = progress;
    }

    @Override
    public final void run(Object obj) {
        Browser.Progress progress;
        switch (this.$r8$classId) {
            case 0:
                if (!this.f$0.get()) {
                    this.f$1.end();
                    break;
                }
                break;
            default:
                if (!this.f$0.get() && (progress = this.f$1) != null) {
                    progress.end();
                }
                break;
        }
    }
}
