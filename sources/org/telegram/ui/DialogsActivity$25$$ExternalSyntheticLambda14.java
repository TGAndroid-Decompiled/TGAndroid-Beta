package org.telegram.ui;

import android.view.View;

public final class DialogsActivity$25$$ExternalSyntheticLambda14 {
    public final int $r8$classId;
    public final DialogsActivity.AnonymousClass25 f$0;
    public final View f$1;

    public DialogsActivity$25$$ExternalSyntheticLambda14(DialogsActivity.AnonymousClass25 anonymousClass25, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass25;
        this.f$1 = view;
    }

    public final void onButtonClicked(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onUserLongPressed$11(this.f$1, z);
                break;
            default:
                this.f$0.lambda$onUserLongPressed$9(this.f$1, z);
                break;
        }
    }
}
