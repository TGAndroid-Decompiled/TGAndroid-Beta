package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Stories.recorder.HintView2$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class BotVerifySheet$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BotVerifySheet$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6((boolean[]) this.f$0, tLObject, (BotVerifySheet$$ExternalSyntheticLambda1) this.f$1, 6));
                break;
            case 1:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                AndroidUtilities.runOnUIThread(new HintView2$$ExternalSyntheticLambda2(page, tLObject, (MessagesController) this.f$1, 7));
                break;
            default:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) this.f$0;
                channelAffiliateProgramsFragment.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(channelAffiliateProgramsFragment, tLObject, (AlertDialog) this.f$1, 9));
                break;
        }
    }
}
