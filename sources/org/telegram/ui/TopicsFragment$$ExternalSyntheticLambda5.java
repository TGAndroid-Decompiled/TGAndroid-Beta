package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;

public final class TopicsFragment$$ExternalSyntheticLambda5 implements RecyclerListView.OnItemLongClickListenerExtended, ChatActivityMemberRequestsDelegate.ChangeVisibilityDelegate, MessagesController.ErrorDelegate, OnApplyWindowInsetsListener {
    public final TopicsFragment f$0;

    public TopicsFragment$$ExternalSyntheticLambda5(TopicsFragment topicsFragment) {
        this.f$0 = topicsFragment;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        TopicsFragment topicsFragment = this.f$0;
        int i = windowInsetsCompat.mImpl.getInsets(519).bottom;
        topicsFragment.navigationBarHeight = i;
        TopicsFragment.MessagesSearchContainer messagesSearchContainer = topicsFragment.searchContainer;
        if (messagesSearchContainer != null) {
            messagesSearchContainer.setPadding(0, 0, 0, i);
        }
        TopicsFragment.EmptyViewContainer emptyViewContainer = topicsFragment.emptyViewContainer;
        if (emptyViewContainer != null) {
            emptyViewContainer.textView.setTranslationY((-topicsFragment.navigationBarHeight) - topicsFragment.additionFloatingButtonOffset);
        }
        topicsFragment.floatingButton.setTranslationY(((-topicsFragment.transitionPadding) - topicsFragment.navigationBarHeight) - topicsFragment.additionFloatingButtonOffset);
        topicsFragment.checkUi_listViewPadding$5();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public boolean mo1082onItemClick(View view, int i, float f, float f2) {
        return this.f$0.lambda$createView$4(view, f);
    }

    @Override
    public void onLongClickRelease() {
    }

    @Override
    public void onMove(float f) {
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return this.f$0.lambda$joinToGroup$22(tL_error);
    }

    @Override
    public void setVisible(boolean z, boolean z2) {
        TopicsFragment topicsFragment = this.f$0;
        topicsFragment.topPanelLayout.setViewVisible(topicsFragment.pendingRequestsDelegate.getView(), z, z2);
    }
}
