package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TagEditCell;

public final class ProfileActivity$ListAdapter$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final RecyclerListView.SelectionAdapter f$0;
    public final TLRPC.User f$1;
    public final String f$2;
    public final boolean f$3;
    public final boolean f$4;
    public final boolean f$5;

    public ProfileActivity$ListAdapter$$ExternalSyntheticLambda4(RecyclerListView.SelectionAdapter selectionAdapter, TLRPC.User user, String str, boolean z, boolean z2, boolean z3, int i) {
        this.$r8$classId = i;
        this.f$0 = selectionAdapter;
        this.f$1 = user;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = z3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = ProfileActivity.this;
                Activity parentActivity = profileActivity.getParentActivity();
                int i = ((BaseFragment) profileActivity).currentAccount;
                long dialogId = profileActivity.getDialogId();
                Theme.ResourcesProvider resourcesProvider = ((BaseFragment) profileActivity).resourceProvider;
                TagEditCell.showInfoSheet(parentActivity, i, dialogId, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, resourcesProvider);
                break;
            case 1:
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                Context context = inviteLinkBottomSheet.getContext();
                int i2 = ((BottomSheet) inviteLinkBottomSheet).currentAccount;
                long j = -inviteLinkBottomSheet.chatId;
                Theme.ResourcesProvider resourcesProvider2 = ((BottomSheet) inviteLinkBottomSheet).resourcesProvider;
                TagEditCell.showInfoSheet(context, i2, j, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, resourcesProvider2);
                break;
            default:
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                TagEditCell.showInfoSheet(sharedMediaLayout.getContext(), sharedMediaLayout.profileActivity.getCurrentAccount(), sharedMediaLayout.dialog_id, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, sharedMediaLayout.resourcesProvider);
                break;
        }
    }
}
