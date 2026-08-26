package org.telegram.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda114 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final String f$1;

    public ChatActivity$$ExternalSyntheticLambda114(ChatActivity chatActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didLongPressLink$411(this.f$1);
                break;
            case 1:
                this.f$0.lambda$didLongPressLink$413(this.f$1);
                break;
            case 2:
                this.f$0.lambda$didLongPressLink$416(this.f$1);
                break;
            case 3:
                ChatActivity chatActivity = this.f$0;
                String str = this.f$1;
                if (str != null) {
                    chatActivity.getClass();
                    if (str.length() != 0) {
                        chatActivity.getMessagesController().sendBotStart(chatActivity.currentUser, str);
                    }
                }
                chatActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", chatActivity.dialog_id, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.f$0.openSearchWithText(this.f$1);
                break;
            case 5:
                this.f$0.openHashtagSearch(this.f$1, false);
                break;
            case 6:
                Browser.openUrl(this.f$0.getParentActivity(), "tel:" + this.f$1);
                break;
            case 7:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                AndroidUtilities.addToClipboard(this.f$1);
                zzkn.m(R.string.PhoneCopied, BulletinFactory.of(chatActivity2));
                break;
            case 8:
                this.f$0.lambda$didPressPhoneNumber$446(this.f$1);
                break;
            case 9:
                Browser.openUrl(this.f$0.getParentActivity(), "tel:" + this.f$1);
                break;
            case 10:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                AndroidUtilities.addToClipboard(this.f$1);
                zzkn.m(R.string.PhoneCopied, BulletinFactory.of(chatActivity3));
                break;
            default:
                Browser.openUrl(this.f$0.getParentActivity(), "https://fragment.com/username/" + this.f$1);
                break;
        }
    }
}
