package org.telegram.tgnet;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f17370a;
    public final Runnable f17371b;

    public f(int i10, Runnable runnable) {
        this.f17370a = i10;
        this.f17371b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17370a) {
            case 0:
                ConnectionsManager.lambda$cancelRequest$9(this.f17371b);
                return;
            case 1:
                Runnable runnable = this.f17371b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 2:
                Runnable runnable2 = this.f17371b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            default:
                Runnable runnable3 = this.f17371b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
        }
    }
}
