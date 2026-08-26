package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

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
                ChatThemeBottomSheet chatThemeBottomSheet = this.f$0;
                if (!chatThemeBottomSheet.hasChanges$1()) {
                    chatThemeBottomSheet.lambda$showGiftOfferSheet$15();
                } else {
                    chatThemeBottomSheet.resetToPrimaryState(true);
                    chatThemeBottomSheet.updateState(true);
                }
                break;
            case 1:
                ChatThemeBottomSheet chatThemeBottomSheet2 = this.f$0;
                ChatAttachAlert chatAttachAlert = chatThemeBottomSheet2.chatAttachAlert;
                if (chatAttachAlert.currentAttachLayout != chatAttachAlert.photoLayout) {
                    chatThemeBottomSheet2.chatAttachButtonText.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ChatAttachAlert chatAttachAlert2 = chatThemeBottomSheet2.chatAttachAlert;
                    chatAttachAlert2.showLayout(chatAttachAlert2.photoLayout);
                } else {
                    chatThemeBottomSheet2.chatAttachButtonText.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    chatThemeBottomSheet2.chatAttachAlert.openColorsLayout();
                    ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = chatThemeBottomSheet2.chatAttachAlert.colorsLayout;
                    boolean z = chatThemeBottomSheet2.forceDark;
                    ((ArrayList) chatAttachAlertColorsLayout.adapter.val$adapter).clear();
                    BottomSheetWithRecyclerListView.AnonymousClass8 anonymousClass8 = chatAttachAlertColorsLayout.adapter;
                    WallpapersListActivity.fillDefaultColors((ArrayList) anonymousClass8.val$adapter, z);
                    anonymousClass8.mObservable.notifyChanged();
                }
                break;
            case 2:
                ChatThemeBottomSheet chatThemeBottomSheet3 = this.f$0;
                if (chatThemeBottomSheet3.changeDayNightViewAnimator == null) {
                    chatThemeBottomSheet3.setupLightDarkTheme(!chatThemeBottomSheet3.forceDark);
                    break;
                }
                break;
            default:
                this.f$0.applySelectedTheme(false);
                break;
        }
    }
}
