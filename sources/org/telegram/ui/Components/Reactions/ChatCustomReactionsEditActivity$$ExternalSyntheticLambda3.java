package org.telegram.ui.Components.Reactions;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FolderBottomSheet;

public final class ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChatCustomReactionsEditActivity f$0;

    public ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatCustomReactionsEditActivity;
    }

    @Override
    public final void run() {
        int i = 1;
        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (!chatCustomReactionsEditActivity.emojiKeyboardVisible) {
                    chatCustomReactionsEditActivity.emojiKeyboardVisible = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) chatCustomReactionsEditActivity.scrollView.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    chatCustomReactionsEditActivity.scrollView.setLayoutParams(marginLayoutParams);
                    chatCustomReactionsEditActivity.bottomDialogLayout.setVisibility(0);
                    ChatActivity.AnonymousClass60 anonymousClass60 = chatCustomReactionsEditActivity.bottomDialogLayout;
                    anonymousClass60.setTranslationY(anonymousClass60.getMeasuredHeight());
                    chatCustomReactionsEditActivity.bottomDialogLayout.animate().setListener(null).cancel();
                    chatCustomReactionsEditActivity.bottomDialogLayout.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).setUpdateListener(new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda1(chatCustomReactionsEditActivity, i)).setListener(new FolderBottomSheet.Button.AnonymousClass3(i)).start();
                }
                break;
            case 1:
                chatCustomReactionsEditActivity.editText.requestFocus();
                break;
            case 2:
                chatCustomReactionsEditActivity.finishFragment();
                break;
            case 3:
                Browser.openUrl(chatCustomReactionsEditActivity.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                Browser.openUrl(chatCustomReactionsEditActivity.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                chatCustomReactionsEditActivity.checkMaxCustomReactions(false);
                break;
        }
    }
}
