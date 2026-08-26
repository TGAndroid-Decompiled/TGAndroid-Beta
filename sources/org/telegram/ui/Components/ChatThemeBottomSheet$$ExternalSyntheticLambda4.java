package org.telegram.ui.Components;

import android.view.View;

public final class ChatThemeBottomSheet$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatThemeBottomSheet f$0;

    public ChatThemeBottomSheet$$ExternalSyntheticLambda4(ChatThemeBottomSheet chatThemeBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = chatThemeBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openGalleryForBackground$16(view);
                break;
            case 1:
                this.f$0.lambda$new$0(view);
                break;
            case 2:
                this.f$0.lambda$new$1(view);
                break;
            default:
                this.f$0.lambda$new$3(view);
                break;
        }
    }
}
