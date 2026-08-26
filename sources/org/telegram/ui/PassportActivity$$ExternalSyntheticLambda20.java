package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;

public final class PassportActivity$$ExternalSyntheticLambda20 implements View.OnTouchListener {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda20(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$createPhoneInterface$29(view, motionEvent);
            case 1:
                return this.f$0.lambda$createIdentityInterface$51(view, motionEvent);
            case 2:
                return this.f$0.lambda$createIdentityInterface$46(view, motionEvent);
            default:
                return this.f$0.lambda$createAddressInterface$35(view, motionEvent);
        }
    }
}
