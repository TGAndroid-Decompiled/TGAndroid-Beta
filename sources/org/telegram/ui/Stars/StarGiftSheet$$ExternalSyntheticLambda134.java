package org.telegram.ui.Stars;

import org.telegram.tgnet.TLRPC;

public final class StarGiftSheet$$ExternalSyntheticLambda134 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TLRPC.TL_error f$1;
    public final Runnable f$2;

    public StarGiftSheet$$ExternalSyntheticLambda134(StarGiftSheet starGiftSheet, TLRPC.TL_error tL_error, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = tL_error;
        this.f$2 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getBulletinFactory().showForError(this.f$1);
                Runnable runnable = this.f$2;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                this.f$0.getBulletinFactory().showForError(this.f$1);
                Runnable runnable2 = this.f$2;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}
