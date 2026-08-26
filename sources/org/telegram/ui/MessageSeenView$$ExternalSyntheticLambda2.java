package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

public final class MessageSeenView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final MessageSeenView f$0;
    public final TLObject f$1;
    public final int f$2;
    public final HashMap f$3;
    public final ArrayList f$4;

    public MessageSeenView$$ExternalSyntheticLambda2(MessageSeenView messageSeenView, TLObject tLObject, int i, HashMap map, ArrayList arrayList, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messageSeenView;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = map;
        this.f$4 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$new$2(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
