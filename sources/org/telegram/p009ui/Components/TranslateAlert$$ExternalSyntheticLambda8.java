package org.telegram.p009ui.Components;

public final class TranslateAlert$$ExternalSyntheticLambda8 implements Runnable {
    public final TranslateAlert f$0;

    public TranslateAlert$$ExternalSyntheticLambda8(TranslateAlert translateAlert) {
        this.f$0 = translateAlert;
    }

    @Override
    public final void run() {
        this.f$0.checkForNextLoading();
    }
}
