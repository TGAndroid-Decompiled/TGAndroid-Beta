package org.telegram.ui;

import android.view.View;

public final class LinkEditActivity$$ExternalSyntheticLambda10 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public LinkEditActivity$$ExternalSyntheticLambda10(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkEditActivity) this.f$0).lambda$createView$4(this.f$1, view);
                break;
            default:
                ((LoginActivity.PhoneView) this.f$0).lambda$new$10(this.f$1, view);
                break;
        }
    }
}
