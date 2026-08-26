package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LaunchActivity$$ExternalSyntheticLambda63 implements AlertDialog.OnButtonClickListener, GroupCreateActivity.ContactsAddActivityDelegate, LocationActivity.LocationActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public LaunchActivity$$ExternalSyntheticLambda63(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        LaunchActivity.lambda$handleIntent$16((int[]) this.f$0, this.f$1, messageMedia, i, z, i2, j);
    }

    @Override
    public void didSelectUsers(ArrayList arrayList, int i) {
        ((TopicsFragment.AnonymousClass2) this.f$0).lambda$onItemClick$2(this.f$1, arrayList, i);
    }

    @Override
    public void needAddBot(TLRPC.User user) {
        GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, user);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((DialogsActivity.AnonymousClass48) this.f$0).lambda$needRemoveHint$0(this.f$1, alertDialog, i);
                break;
            default:
                ((DialogsActivity) this.f$0).lambda$onItemLongClick$92(this.f$1, alertDialog, i);
                break;
        }
    }
}
