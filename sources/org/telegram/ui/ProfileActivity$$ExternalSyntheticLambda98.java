package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ProfileActivity$$ExternalSyntheticLambda98 implements MessagesController.IsInChatCheckedCallback, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended {
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public ProfileActivity$$ExternalSyntheticLambda98(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, long j) {
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = j;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((GroupCallActivity) this.f$0).lambda$processSelectedOption$71((TLRPC.User) this.f$1, this.f$2, alertDialog, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((ProfileActivity) this.f$0).lambda$createView$29((Context) this.f$1, this.f$2, view, i, f, f2);
    }

    @Override
    public void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$5(this.f$2, (DialogsActivity) this.f$1, z, tL_chatAdminRights, str);
    }

    public ProfileActivity$$ExternalSyntheticLambda98(ProfileActivity.AnonymousClass6 anonymousClass6, long j, DialogsActivity dialogsActivity) {
        this.f$0 = anonymousClass6;
        this.f$2 = j;
        this.f$1 = dialogsActivity;
    }
}
