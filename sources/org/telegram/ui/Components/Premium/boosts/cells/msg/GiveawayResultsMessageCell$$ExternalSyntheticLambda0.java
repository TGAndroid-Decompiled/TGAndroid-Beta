package org.telegram.ui.Components.Premium.boosts.cells.msg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;

public final class GiveawayResultsMessageCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GiveawayResultsMessageCell f$0;
    public final MessageObject f$1;
    public final TLRPC.TL_messageMediaGiveawayResults f$2;

    public GiveawayResultsMessageCell$$ExternalSyntheticLambda0(GiveawayResultsMessageCell giveawayResultsMessageCell, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i) {
        this.$r8$classId = i;
        this.f$0 = giveawayResultsMessageCell;
        this.f$1 = messageObject;
        this.f$2 = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GiveawayResultsMessageCell giveawayResultsMessageCell = this.f$0;
                giveawayResultsMessageCell.getClass();
                AndroidUtilities.runOnUIThread(new GiveawayResultsMessageCell$$ExternalSyntheticLambda0(giveawayResultsMessageCell, this.f$1, this.f$2, 1));
                break;
            default:
                GiveawayResultsMessageCell giveawayResultsMessageCell2 = this.f$0;
                giveawayResultsMessageCell2.getClass();
                long dialogId = this.f$1.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.f$2;
                if (dialogId != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.getLastFragment().presentFragment(new ChatActivity(bundle));
                } else {
                    giveawayResultsMessageCell2.parentView.getDelegate().didPressReplyMessage(giveawayResultsMessageCell2.parentView, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                }
                break;
        }
    }
}
