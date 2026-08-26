package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PollItemMenu$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 1;
    public final PollItemMenu f$0;
    public final boolean f$1;
    public final BaseFragment f$2;
    public final ArrayList f$3;
    public final TLRPC.PollAnswer f$4;

    public PollItemMenu$$ExternalSyntheticLambda4(PollItemMenu pollItemMenu, boolean z, TLRPC.PollAnswer pollAnswer, BaseFragment baseFragment, ArrayList arrayList) {
        this.f$0 = pollItemMenu;
        this.f$1 = z;
        this.f$4 = pollAnswer;
        this.f$2 = baseFragment;
        this.f$3 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCell$3(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                ArrayList arrayList = this.f$3;
                this.f$0.lambda$setCell$4(this.f$1, this.f$4, this.f$2, arrayList);
                break;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda4(PollItemMenu pollItemMenu, boolean z, BaseFragment baseFragment, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f$0 = pollItemMenu;
        this.f$1 = z;
        this.f$2 = baseFragment;
        this.f$3 = arrayList;
        this.f$4 = pollAnswer;
    }
}
