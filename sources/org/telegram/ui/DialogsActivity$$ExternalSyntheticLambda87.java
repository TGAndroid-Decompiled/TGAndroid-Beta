package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

public final class DialogsActivity$$ExternalSyntheticLambda87 implements Runnable {
    public final int $r8$classId = 1;
    public final DialogsActivity f$0;
    public final ArrayList f$1;
    public final int f$2;
    public final boolean f$3;
    public final HashSet f$4;

    public DialogsActivity$$ExternalSyntheticLambda87(DialogsActivity dialogsActivity, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.f$0 = dialogsActivity;
        this.f$2 = i;
        this.f$1 = arrayList;
        this.f$3 = z;
        this.f$4 = hashSet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.performSelectedDialogsAction(this.f$1, this.f$2, false, this.f$3, this.f$4);
                break;
            default:
                HashSet hashSet = this.f$4;
                this.f$0.lambda$performSelectedDialogsAction$107(this.f$2, this.f$1, this.f$3, hashSet);
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda87(DialogsActivity dialogsActivity, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.f$0 = dialogsActivity;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = hashSet;
    }
}
