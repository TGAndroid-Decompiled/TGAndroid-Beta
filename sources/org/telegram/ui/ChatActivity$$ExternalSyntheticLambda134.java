package org.telegram.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda134 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final ScrimOptions f$1;
    public final String f$2;

    public ChatActivity$$ExternalSyntheticLambda134(ChatActivity chatActivity, ScrimOptions scrimOptions, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = scrimOptions;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                this.f$1.dismiss();
                AndroidUtilities.addToClipboard(this.f$2);
                zzkn.m(R.string.RelativeDateCopied, BulletinFactory.of(chatActivity));
                break;
            case 1:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                this.f$1.dismiss();
                AndroidUtilities.addToClipboard("@" + this.f$2);
                zzkn.m(R.string.UsernameCopied, BulletinFactory.of(chatActivity2));
                break;
            default:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                this.f$1.dismiss();
                AndroidUtilities.addToClipboard(this.f$2);
                zzkn.m(R.string.CardNumberCopied, BulletinFactory.of(chatActivity3));
                break;
        }
    }
}
