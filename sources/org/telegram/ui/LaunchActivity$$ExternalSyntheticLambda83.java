package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LaunchActivity$$ExternalSyntheticLambda83 implements Runnable {
    public final int $r8$classId = 0;
    public final LaunchActivity f$0;
    public final TLObject f$1;
    public final int f$2;
    public final String f$3;
    public final TLRPC.TL_error f$4;
    public final Runnable f$5;

    public LaunchActivity$$ExternalSyntheticLambda83(LaunchActivity launchActivity, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, Runnable runnable) {
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = str;
        this.f$4 = tL_error;
        this.f$5 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$runLinkRequest$47(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                this.f$0.lambda$runLinkRequest$53(this.f$4, this.f$1, this.f$2, this.f$3, this.f$5);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda83(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, Runnable runnable) {
        this.f$0 = launchActivity;
        this.f$4 = tL_error;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = str;
        this.f$5 = runnable;
    }
}
