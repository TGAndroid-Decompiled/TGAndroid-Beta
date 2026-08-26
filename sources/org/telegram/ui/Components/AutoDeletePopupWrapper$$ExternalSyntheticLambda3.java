package org.telegram.ui.Components;

import android.view.View;

public final class AutoDeletePopupWrapper$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final PopupSwipeBackLayout f$0;

    public AutoDeletePopupWrapper$$ExternalSyntheticLambda3(PopupSwipeBackLayout popupSwipeBackLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = popupSwipeBackLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.closeForeground();
                break;
            default:
                this.f$0.closeForeground();
                break;
        }
    }
}
