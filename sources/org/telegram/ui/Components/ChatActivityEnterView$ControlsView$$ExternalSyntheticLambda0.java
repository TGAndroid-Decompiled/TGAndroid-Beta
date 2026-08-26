package org.telegram.ui.Components;

import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView.ControlsView f$0;
    public final HintView2 f$1;

    public ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda0(ChatActivityEnterView.ControlsView controlsView, HintView2 hintView2, int i) {
        this.$r8$classId = i;
        this.f$0 = controlsView;
        this.f$1 = hintView2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPauseHint$0(this.f$1);
                break;
            case 1:
                this.f$0.lambda$showOnceHint$1(this.f$1);
                break;
            case 2:
                this.f$0.lambda$hideHintView$2(this.f$1);
                break;
            default:
                this.f$0.lambda$hideHintView$3(this.f$1);
                break;
        }
    }
}
