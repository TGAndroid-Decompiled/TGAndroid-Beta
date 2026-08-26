package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;

public final class TopicsFragment$$ExternalSyntheticLambda7 implements RecyclerListView.OnItemLongClickListenerExtended, ChatActivityMemberRequestsDelegate.ChangeVisibilityDelegate, MessagesController.ErrorDelegate, OnApplyWindowInsetsListener {
    public final TopicsFragment f$0;

    public TopicsFragment$$ExternalSyntheticLambda7(TopicsFragment topicsFragment) {
        this.f$0 = topicsFragment;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public boolean mo2353onItemClick(View view, int i, float f, float f2) {
        return this.f$0.lambda$createView$4(view, i, f, f2);
    }

    @Override
    public void onLongClickRelease() {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
    }

    @Override
    public void onMove(float f, float f2) {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return this.f$0.lambda$joinToGroup$22(tL_error);
    }

    @Override
    public void setVisible(boolean z, boolean z2) {
        this.f$0.lambda$createView$8(z, z2);
    }
}
