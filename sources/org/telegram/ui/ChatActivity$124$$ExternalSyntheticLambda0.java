package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;

public final class ChatActivity$124$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.AnonymousClass124 f$0;
    public final int f$1;
    public final boolean f$2;
    public final ReactionsContainerLayout f$3;
    public final float f$4;
    public final float f$5;
    public final ReactionsLayoutInBubble.VisibleReaction f$6;

    public ChatActivity$124$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass124 anonymousClass124, int i, boolean z, ReactionsContainerLayout reactionsContainerLayout, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i2) {
        this.$r8$classId = i2;
        this.f$0 = anonymousClass124;
        this.f$1 = i;
        this.f$2 = z;
        this.f$3 = reactionsContainerLayout;
        this.f$4 = f;
        this.f$5 = f2;
        this.f$6 = visibleReaction;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new ChatActivity$124$$ExternalSyntheticLambda0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, 1), 50L);
                break;
            default:
                ChatActivity.AnonymousClass124 anonymousClass124 = this.f$0;
                int i = this.f$1;
                ChatActivity chatActivity = ChatActivity.this;
                BaseCell baseCellFindMessageCell = chatActivity.findMessageCell(i, true);
                if (this.f$2) {
                    int i2 = ((BaseFragment) chatActivity).currentAccount;
                    ReactionsEffectOverlay.show(chatActivity, this.f$3, baseCellFindMessageCell, null, this.f$4, this.f$5, this.f$6, i2, 1);
                    ReactionsEffectOverlay.startAnimation();
                }
                break;
        }
    }
}
