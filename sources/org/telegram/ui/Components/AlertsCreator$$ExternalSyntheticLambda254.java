package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;

public final class AlertsCreator$$ExternalSyntheticLambda254 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final boolean f$3;
    public final Object f$4;

    public AlertsCreator$$ExternalSyntheticLambda254(Context context, String str, long j, boolean z, Browser.Progress progress) {
        this.f$0 = context;
        this.f$1 = str;
        this.f$2 = j;
        this.f$3 = z;
        this.f$4 = progress;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$showOpenUrlAlert$42((Context) this.f$0, (String) this.f$1, this.f$2, this.f$3, (Browser.Progress) this.f$4);
                break;
            default:
                ((AudioPlayerAlert) this.f$0).lambda$saveToProfile$30(this.f$2, this.f$3, (TLRPC.Document) this.f$1, (Runnable) this.f$4);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda254(AudioPlayerAlert audioPlayerAlert, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.f$0 = audioPlayerAlert;
        this.f$2 = j;
        this.f$3 = z;
        this.f$1 = document;
        this.f$4 = runnable;
    }
}
