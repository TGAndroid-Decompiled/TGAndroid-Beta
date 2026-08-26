package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ChatActivity$$ExternalSyntheticLambda463 implements View.OnClickListener {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final long f$1;

    public ChatActivity$$ExternalSyntheticLambda463(BaseFragment baseFragment, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$updateGreetingLock$306(this.f$1, view);
                break;
            case 1:
                ((ChatActivity) this.f$0).lambda$updateGreetingLock$308(this.f$1, view);
                break;
            default:
                ((DialogsActivity) this.f$0).lambda$showChatPreview$101(this.f$1, view);
                break;
        }
    }
}
