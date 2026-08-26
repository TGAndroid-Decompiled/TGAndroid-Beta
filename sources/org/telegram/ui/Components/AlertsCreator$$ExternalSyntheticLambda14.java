package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

public final class AlertsCreator$$ExternalSyntheticLambda14 implements View.OnClickListener {
    public final int $r8$classId = 1;
    public final int[] f$0;
    public final LinearLayout f$1;

    public AlertsCreator$$ExternalSyntheticLambda14(LinearLayout linearLayout, int[] iArr) {
        this.f$1 = linearLayout;
        this.f$0 = iArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createLocationUpdateDialog$207(this.f$0, this.f$1, view);
                break;
            default:
                AlertsCreator.lambda$createColorSelectDialog$202(this.f$1, this.f$0, view);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda14(int[] iArr, LinearLayout linearLayout) {
        this.f$0 = iArr;
        this.f$1 = linearLayout;
    }
}
