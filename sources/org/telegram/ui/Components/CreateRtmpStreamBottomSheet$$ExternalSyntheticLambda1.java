package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final CreateRtmpStreamBottomSheet f$0;
    public final ButtonWithCounterView f$1;

    public CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView, int i) {
        this.$r8$classId = i;
        this.f$0 = createRtmpStreamBottomSheet;
        this.f$1 = buttonWithCounterView;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$4(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$new$9(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
