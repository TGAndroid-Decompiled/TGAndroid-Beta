package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class DialogsActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 2;
    public final BaseFragment f$0;
    public final Object f$1;
    public final int f$2;
    public final boolean f$3;
    public final Object f$4;

    public DialogsActivity$$ExternalSyntheticLambda4(CallLogActivity.AnonymousClass9 anonymousClass9, TLObject tLObject, int i, TLRPC.User user, boolean z) {
        this.f$0 = anonymousClass9;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$4 = user;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity) this.f$0).lambda$performSelectedDialogsAction$106((ArrayList) this.f$1, this.f$2, this.f$3, (HashSet) this.f$4);
                break;
            case 1:
                ((DialogsActivity) this.f$0).lambda$performSelectedDialogsAction$107(this.f$2, (ArrayList) this.f$1, this.f$3, (HashSet) this.f$4);
                break;
            default:
                ((CallLogActivity.AnonymousClass9) this.f$0).lambda$onCallUsersSelected$0((TLObject) this.f$1, this.f$2, (TLRPC.User) this.f$4, this.f$3);
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda4(DialogsActivity dialogsActivity, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.f$0 = dialogsActivity;
        this.f$2 = i;
        this.f$1 = arrayList;
        this.f$3 = z;
        this.f$4 = hashSet;
    }

    public DialogsActivity$$ExternalSyntheticLambda4(DialogsActivity dialogsActivity, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.f$0 = dialogsActivity;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = hashSet;
    }
}
