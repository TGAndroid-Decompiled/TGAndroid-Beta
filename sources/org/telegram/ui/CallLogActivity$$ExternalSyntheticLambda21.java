package org.telegram.ui;

import android.view.View;

public final class CallLogActivity$$ExternalSyntheticLambda21 implements View.OnClickListener {
    public final int $r8$classId;
    public final CallLogActivity f$0;

    public CallLogActivity$$ExternalSyntheticLambda21(CallLogActivity callLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$0(view);
                break;
            case 1:
                this.f$0.lambda$createView$3(view);
                break;
            case 2:
                this.f$0.onGroupCallClick(view);
                break;
            default:
                this.f$0.lambda$createActionMode$16(view);
                break;
        }
    }
}
