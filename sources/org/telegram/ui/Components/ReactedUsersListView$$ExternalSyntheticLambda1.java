package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

public final class ReactedUsersListView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ReactedUsersListView f$0;
    public final TLObject f$1;

    public ReactedUsersListView$$ExternalSyntheticLambda1(ReactedUsersListView reactedUsersListView, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = reactedUsersListView;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$load$6(this.f$1);
                break;
            default:
                this.f$0.lambda$load$5(this.f$1);
                break;
        }
    }
}
