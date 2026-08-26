package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.PopupSwipeBackLayout;

public final class ChooseSpeedLayout$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final PopupSwipeBackLayout f$0;

    public ChooseSpeedLayout$$ExternalSyntheticLambda0(PopupSwipeBackLayout popupSwipeBackLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = popupSwipeBackLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.closeForeground(true);
                break;
            case 1:
                this.f$0.closeForeground(true);
                break;
            case 2:
                this.f$0.closeForeground(true);
                break;
            default:
                this.f$0.closeForeground(true);
                break;
        }
    }
}
