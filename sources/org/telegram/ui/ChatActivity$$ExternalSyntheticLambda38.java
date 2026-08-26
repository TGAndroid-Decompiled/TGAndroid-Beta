package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

public final class ChatActivity$$ExternalSyntheticLambda38 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final ArrayList f$1;

    public ChatActivity$$ExternalSyntheticLambda38(ChatActivity chatActivity, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didPressReaction$469(this.f$1, view);
                break;
            default:
                this.f$0.lambda$createMenu$300(this.f$1, view);
                break;
        }
    }
}
