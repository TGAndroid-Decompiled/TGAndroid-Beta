package org.telegram.messenger;

import java.util.ArrayList;
public final class z7 implements Runnable {
    public final int f21972a;
    public final MediaDataController f21973b;
    public final ArrayList f21974c;

    public z7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f21972a = i10;
        this.f21973b = mediaDataController;
        this.f21974c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21972a) {
            case 0:
                this.f21973b.lambda$loadRepliesOfDraftReplies$0(this.f21974c);
                return;
            default:
                this.f21973b.lambda$broadcastPinnedMessage$168(this.f21974c);
                return;
        }
    }
}
