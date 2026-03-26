package org.telegram.ui.Components;

import android.view.View;

public final class ChatActivityEnterView$$ExternalSyntheticLambda9 implements View.OnLongClickListener {
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda9(ChatActivityEnterView chatActivityEnterView) {
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        return this.f$0.onSendLongClick(view);
    }
}
