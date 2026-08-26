package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class InviteLinkBottomSheet$Adapter$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final RecyclerListView.SelectionAdapter f$0;
    public final TLRPC.User f$1;
    public final String f$2;
    public final boolean f$3;
    public final boolean f$4;
    public final boolean f$5;

    public InviteLinkBottomSheet$Adapter$$ExternalSyntheticLambda0(RecyclerListView.SelectionAdapter selectionAdapter, TLRPC.User user, String str, boolean z, boolean z2, boolean z3, int i) {
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
                ((InviteLinkBottomSheet.Adapter) this.f$0).lambda$onBindViewHolder$0(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view);
                break;
            default:
                ((SharedMediaLayout.ChatUsersAdapter) this.f$0).lambda$onBindViewHolder$0(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view);
                break;
        }
    }
}
