package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.TLObject;

public final class ReactedHeaderView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ReactedHeaderView f$0;
    public final TLObject f$1;
    public final List f$2;
    public final List f$3;
    public final List f$4;
    public final Runnable f$5;

    public ReactedHeaderView$$ExternalSyntheticLambda1(ReactedHeaderView reactedHeaderView, TLObject tLObject, List list, List list2, List list3, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = reactedHeaderView;
        this.f$1 = tLObject;
        this.f$2 = list;
        this.f$3 = list2;
        this.f$4 = list3;
        this.f$5 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onAttachedToWindow$1(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                this.f$0.lambda$onAttachedToWindow$3(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
        }
    }
}
