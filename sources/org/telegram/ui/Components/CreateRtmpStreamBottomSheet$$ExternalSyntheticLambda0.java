package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CreateRtmpStreamBottomSheet f$0;
    public final ButtonWithCounterView f$1;
    public final TLObject f$2;

    public CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda0(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = createRtmpStreamBottomSheet;
        this.f$1 = buttonWithCounterView;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$8(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$new$3(this.f$1, this.f$2);
                break;
        }
    }
}
