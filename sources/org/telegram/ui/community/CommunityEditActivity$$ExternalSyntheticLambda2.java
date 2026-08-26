package org.telegram.ui.community;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;

public final class CommunityEditActivity$$ExternalSyntheticLambda2 implements Utilities.Callback5, Utilities.Callback5Return, OnApplyWindowInsetsListener, MessagesStorage.BooleanCallback {
    public final CommunityEditActivity f$0;

    public CommunityEditActivity$$ExternalSyntheticLambda2(CommunityEditActivity communityEditActivity) {
        this.f$0 = communityEditActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        CommunityEditActivity communityEditActivity = this.f$0;
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        communityEditActivity.listView.setPadding(0, insets.top, 0, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(this.f$0.onLongClick$3((UItem) obj, (View) obj2));
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$9((UItem) obj);
    }

    @Override
    public void run(boolean z) {
        CommunityEditActivity communityEditActivity = this.f$0;
        communityEditActivity.finishFragment();
        communityEditActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-communityEditActivity.communityId), null, communityEditActivity.currentChat, Boolean.valueOf(z));
    }
}
