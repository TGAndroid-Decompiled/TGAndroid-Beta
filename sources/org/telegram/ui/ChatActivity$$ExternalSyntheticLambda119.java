package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ChatActivity$$ExternalSyntheticLambda119 implements Runnable {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public ChatActivity$$ExternalSyntheticLambda119(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 1:
                FilterChatlistActivity.ListAdapter.AnonymousClass1.lambda$editname$7(this.f$0);
                break;
            case 2:
                GroupCallActivity.lambda$makeFocusable$7(this.f$0);
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 4:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            default:
                PollCreateActivity.lambda$onBecomeFullyVisible$0(this.f$0);
                break;
        }
    }
}
