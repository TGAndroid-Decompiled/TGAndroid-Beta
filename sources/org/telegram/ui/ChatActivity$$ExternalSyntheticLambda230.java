package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaFile;

public final class ChatActivity$$ExternalSyntheticLambda230 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda230(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final Object run(Object obj) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                URLSpan uRLSpan = (URLSpan) obj;
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                MessageObject messageObject = chatActivity.selectedObject;
                View view = (View) this.f$1;
                chatActivity.didPressMessageUrl(uRLSpan, false, messageObject, view instanceof ChatMessageCell ? (ChatMessageCell) view : null);
                return Boolean.TRUE;
            default:
                return PollAttachedMediaFile.createMessagePreviewDrawable((View) obj, (String) this.f$0, (String) this.f$1, null, null);
        }
    }
}
