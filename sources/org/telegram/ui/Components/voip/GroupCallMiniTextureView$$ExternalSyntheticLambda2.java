package org.telegram.ui.Components.voip;

import android.widget.TextView;

public final class GroupCallMiniTextureView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final GroupCallMiniTextureView f$0;

    public GroupCallMiniTextureView$$ExternalSyntheticLambda2(GroupCallMiniTextureView groupCallMiniTextureView, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallMiniTextureView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.requestLayout();
                break;
            default:
                GroupCallMiniTextureView groupCallMiniTextureView = this.f$0;
                GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                if (!anonymousClass1.renderer.isFirstFrameRendered()) {
                    anonymousClass1.animate().cancel();
                    anonymousClass1.animate().alpha(0.0f).setDuration(150L).start();
                    TextView textView = groupCallMiniTextureView.noRtmpStreamTextView;
                    textView.animate().cancel();
                    textView.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                }
                break;
        }
    }
}
