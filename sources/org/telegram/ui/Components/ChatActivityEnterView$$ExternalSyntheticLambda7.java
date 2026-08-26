package org.telegram.ui.Components;

import android.view.View;

public final class ChatActivityEnterView$$ExternalSyntheticLambda7 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda7(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                ChatActivityEnterView.AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                if (anonymousClass50 == null || anonymousClass50.length() <= 0) {
                    return false;
                }
                return chatActivityEnterView.onSendLongClick(view);
            default:
                return this.f$0.onSendLongClick(view);
        }
    }
}
