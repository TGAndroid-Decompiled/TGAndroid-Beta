package org.telegram.ui.ActionBar;

import android.view.View;

public final class FloatingToolbar$FloatingToolbarPopup$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final FloatingToolbar.FloatingToolbarPopup f$0;

    public FloatingToolbar$FloatingToolbarPopup$$ExternalSyntheticLambda0(FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup, int i) {
        this.$r8$classId = i;
        this.f$0 = floatingToolbarPopup;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onBackPressed();
                break;
            case 1:
                this.f$0.onBackPressed();
                break;
            default:
                this.f$0.onBackPressed();
                break;
        }
    }
}
