package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SharedMediaLayout$CommonGroupsAdapter$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final RecyclerListView.SelectionAdapter f$0;
    public final int f$1;

    public SharedMediaLayout$CommonGroupsAdapter$$ExternalSyntheticLambda0(RecyclerListView.SelectionAdapter selectionAdapter, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = selectionAdapter;
        this.f$1 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((SharedMediaLayout.CommonGroupsAdapter) this.f$0).lambda$getChats$1(this.f$1, tLObject, tL_error);
                break;
            default:
                ((SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0).lambda$sendRequest$1(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
