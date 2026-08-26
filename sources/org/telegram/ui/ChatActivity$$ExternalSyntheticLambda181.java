package org.telegram.ui;

import android.view.View;

public final class ChatActivity$$ExternalSyntheticLambda181 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda181(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$updateTopPanel$229(view);
            case 1:
                return this.f$0.lambda$createView$55(view);
            default:
                return this.f$0.lambda$createMenu$280(view);
        }
    }
}
