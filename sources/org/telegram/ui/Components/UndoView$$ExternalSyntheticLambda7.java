package org.telegram.ui.Components;

import java.io.FileNotFoundException;
import org.telegram.messenger.SavedMessagesController;

public final class UndoView$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;

    public UndoView$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                SavedMessagesController.openSavedMessages();
                break;
            case 1:
                ChatActivityEnterView.AnonymousClass24.lambda$onTouchEvent$2();
                break;
            case 2:
                ChatActivityEnterView.AnonymousClass24.lambda$onTouchEvent$8();
                break;
            case 3:
                GroupCallPip.AnonymousClass3.lambda$$0();
                break;
            case 4:
                ThanosEffect.DrawingThread.lambda$run$0();
                break;
            case 5:
                ThanosEffect.DrawingThread.lambda$draw$1();
                break;
            case 6:
                AlertsCreator.lambda$createScheduleDatePickerDialog$131();
                break;
            case 7:
                AlertsCreator.lambda$processError$7();
                break;
            case 8:
                AnimatedEmojiDrawable.lambda$static$2();
                break;
            case 9:
                AudioPlayerAlert.lambda$new$13();
                break;
            case 10:
                AudioPlayerAlert.lambda$new$11();
                break;
            case 11:
                SavedMessagesController.openSavedMessages();
                break;
            case 12:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 13:
                BulletinFactory.lambda$createDownloadBulletin$4();
                break;
            case 14:
                ChatAttachAlertPollLayout.lambda$new$2();
                break;
            case 15:
                ChatThemeBottomSheet.lambda$showAsSheet$17();
                break;
            case 16:
                ChatThemeBottomSheet.lambda$showAsSheet$20();
                break;
            case 17:
                EditTextCaption.lambda$makeSelectedDate$1();
                break;
            case 18:
                GroupCallPip.lambda$remove$2();
                break;
            case 19:
                ShareAlert.lambda$showPremiumBlockedToast$19();
                break;
            case 20:
                StickersDialogs.lambda$showDeleteForEveryOneDialog$5();
                break;
            case 21:
                TextPaintImageReceiverSpan.lambda$new$2();
                break;
            default:
                TopicsTabsView.lambda$onTabLongClick$16();
                break;
        }
    }
}
