package org.telegram.ui;

import org.telegram.ui.Cells.TextCell;

public final class ChatUsersActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatUsersActivity f$0;
    public final TextCell f$1;
    public final boolean f$2;

    public ChatUsersActivity$$ExternalSyntheticLambda0(ChatUsersActivity chatUsersActivity, TextCell textCell, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = chatUsersActivity;
        this.f$1 = textCell;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$createView$2(this.f$1, this.f$2);
                break;
        }
    }
}
