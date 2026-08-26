package org.telegram.ui;

import android.view.View;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda7(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAdminedChannels$20(view);
                break;
            case 1:
                this.f$0.lambda$createView$2(view);
                break;
            case 2:
                this.f$0.lambda$createView$3(view);
                break;
            case 3:
                this.f$0.lambda$createView$4(view);
                break;
            default:
                this.f$0.lambda$createView$5(view);
                break;
        }
    }
}
