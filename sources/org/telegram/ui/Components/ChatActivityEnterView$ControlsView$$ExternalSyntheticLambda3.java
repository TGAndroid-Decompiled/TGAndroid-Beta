package org.telegram.ui.Components;

import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView.ControlsView f$0;
    public final HintView2 f$1;

    public ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda3(ChatActivityEnterView.ControlsView controlsView, HintView2 hintView2, int i) {
        this.$r8$classId = i;
        this.f$0 = controlsView;
        this.f$1 = hintView2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivityEnterView.ControlsView controlsView = this.f$0;
                HintView2 hintView2 = this.f$1;
                controlsView.removeView(hintView2);
                if (controlsView.onceHint == hintView2) {
                    controlsView.onceHint = null;
                }
                break;
            case 1:
                this.f$0.removeView(this.f$1);
                break;
            case 2:
                this.f$0.removeView(this.f$1);
                break;
            default:
                ChatActivityEnterView.ControlsView controlsView2 = this.f$0;
                HintView2 hintView3 = this.f$1;
                controlsView2.removeView(hintView3);
                if (controlsView2.pauseHint == hintView3) {
                    controlsView2.pauseHint = null;
                }
                break;
        }
    }
}
