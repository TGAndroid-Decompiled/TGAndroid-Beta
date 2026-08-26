package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.utils.OnPostDrawView;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.chat.ChatActivitySearchContainer;

public final class ChatActivity$$ExternalSyntheticLambda83 implements OnApplyWindowInsetsListener, OnPostDrawView.InvalidateCallback, AlertDialog.OnButtonClickListener {
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda83(ChatActivity chatActivity) {
        this.f$0 = chatActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ChatActivity chatActivity = this.f$0;
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        int i = defaultWindowInsets.left;
        int i2 = chatActivity.insetSystemLeft;
        int i3 = defaultWindowInsets.right;
        if (i2 != i || chatActivity.insetSystemRight != i3) {
            chatActivity.insetSystemLeft = i;
            chatActivity.insetSystemRight = i3;
            chatActivity.contentView.requestLayout();
        }
        chatActivity.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        ChatActivitySearchContainer chatActivitySearchContainer = chatActivity.messagesSearchListContainer;
        if (chatActivitySearchContainer != null) {
            chatActivitySearchContainer.setPadding(i, 0, i3, 0);
        }
        chatActivity.checkUi_chatListViewPaddings();
        chatActivity.checkUi_messagesSearchListPadding();
        chatActivity.invalidateClipRectForBackgroundAndChatList();
        boolean zIsVisible = windowInsetsCompat.mImpl.isVisible(8);
        if (chatActivity.lastImeVisible != zIsVisible) {
            chatActivity.lastImeVisible = zIsVisible;
            chatActivity.contentView.notifyHeightChanged();
        }
        PollItemMenu.AnonymousClass3 anonymousClass3 = chatActivity.searchViewPager;
        if (anonymousClass3 != null) {
            ViewCompat.dispatchApplyWindowInsets(anonymousClass3, windowInsetsCompat);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ChatActivity chatActivity = this.f$0;
        chatActivity.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            chatActivity.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onPostDraw(int i) {
        this.f$0.invalidateMergedVisibleBlurredPositionsAndSourcesImpl$1(i);
    }
}
