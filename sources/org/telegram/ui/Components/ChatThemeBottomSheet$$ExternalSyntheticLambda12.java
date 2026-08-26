package org.telegram.ui.Components;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class ChatThemeBottomSheet$$ExternalSyntheticLambda12 implements Consumer {
    public final int $r8$classId;
    public final ChatThemeBottomSheet f$0;

    public ChatThemeBottomSheet$$ExternalSyntheticLambda12(ChatThemeBottomSheet chatThemeBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = chatThemeBottomSheet;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ChatThemeBottomSheet chatThemeBottomSheet = this.f$0;
                chatThemeBottomSheet.boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                chatThemeBottomSheet.checkedBoostsLevel = true;
                chatThemeBottomSheet.updateState(true);
                chatThemeBottomSheet.checkingBoostsLevel = false;
                break;
            default:
                this.f$0.lambda$applySelectedTheme$14((ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
