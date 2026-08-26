package org.telegram.ui.Stories.recorder;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

public final class EmojiBottomSheet$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;

    public EmojiBottomSheet$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    private final void onDismiss$org$telegram$ui$bots$ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda4(DialogInterface dialogInterface) {
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                int i = EmojiBottomSheet.savedPosition;
                break;
            case 1:
                MediaController.forceBroadcastNewPhotos = false;
                break;
        }
    }
}
