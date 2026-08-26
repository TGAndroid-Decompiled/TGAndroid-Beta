package org.telegram.ui.Components;

import android.view.View;

public final class ChatActivityEnterView$$ExternalSyntheticLambda9 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda9(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$new$14(view);
            default:
                return this.f$0.onSendLongClick(view);
        }
    }
}
