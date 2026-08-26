package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.StatisticActivity;

public final class ChatThemeBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatThemeBottomSheet f$0;

    public ChatThemeBottomSheet$$ExternalSyntheticLambda0(ChatThemeBottomSheet chatThemeBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = chatThemeBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.adapter.mObservable.notifyChanged();
                break;
            case 1:
                this.f$0.applySelectedTheme(true);
                break;
            case 2:
                ChatThemeBottomSheet chatThemeBottomSheet = this.f$0;
                ChatActivity chatActivity = chatThemeBottomSheet.chatActivity;
                BaseFragment baseFragmentCreate = StatisticActivity.create(chatActivity.getMessagesController().getChat(Long.valueOf(-chatActivity.getDialogId())), true);
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                baseFragmentCreate.setResourceProvider(chatActivity.getResourceProvider());
                bottomSheetParams.onOpenAnimationFinished = new ChatActivity$$ExternalSyntheticLambda470(19);
                bottomSheetParams.onPreFinished = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(chatThemeBottomSheet, 3);
                bottomSheetParams.onDismiss = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(chatThemeBottomSheet, 4);
                bottomSheetParams.occupyNavigationBar = true;
                chatThemeBottomSheet.overlayFragment = baseFragmentCreate;
                chatActivity.showAsSheet(baseFragmentCreate, bottomSheetParams);
                break;
            case 3:
                this.f$0.fixColorsAfterAnotherWindow();
                break;
            case 4:
                this.f$0.overlayFragment = null;
                break;
            case 5:
                this.f$0.fixColorsAfterAnotherWindow();
                break;
            case 6:
                this.f$0.overlayFragment = null;
                break;
            default:
                ChatThemeBottomSheet chatThemeBottomSheet2 = this.f$0;
                chatThemeBottomSheet2.hintView.showForView(chatThemeBottomSheet2.darkThemeView, true);
                break;
        }
    }
}
