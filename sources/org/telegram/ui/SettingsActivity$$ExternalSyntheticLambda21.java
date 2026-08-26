package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public final class SettingsActivity$$ExternalSyntheticLambda21 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;

    public SettingsActivity$$ExternalSyntheticLambda21(int i) {
        this.$r8$classId = i;
    }

    private final void onDismiss$org$telegram$ui$Components$AlertsCreator$$ExternalSyntheticLambda168(DialogInterface dialogInterface) {
    }

    private final void onDismiss$org$telegram$ui$SettingsActivity$$ExternalSyntheticLambda21(DialogInterface dialogInterface) {
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                AccountFrozenAlert.shown = false;
                break;
            case 2:
                break;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                break;
            case 4:
                MediaController.forceBroadcastNewPhotos = false;
                break;
            case 5:
                int i = ThemeEditorView.AnonymousClass1.$r8$clinit;
                break;
            case 6:
                GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                break;
            default:
                int i2 = EmojiBottomSheet.savedPosition;
                break;
        }
    }

    public SettingsActivity$$ExternalSyntheticLambda21(boolean[] zArr) {
        this.$r8$classId = 2;
    }
}
