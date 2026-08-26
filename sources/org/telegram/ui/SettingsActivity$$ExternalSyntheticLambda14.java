package org.telegram.ui;

import android.view.View;

public final class SettingsActivity$$ExternalSyntheticLambda14 implements View.OnClickListener {
    public final int $r8$classId;
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda14(SettingsActivity settingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillItems$7(view);
                break;
            case 1:
                this.f$0.lambda$fillItems$9(view);
                break;
            case 2:
                this.f$0.lambda$fillItems$10(view);
                break;
            case 3:
                this.f$0.lambda$fillItems$11(view);
                break;
            case 4:
                this.f$0.lambda$fillItems$12(view);
                break;
            case 5:
                this.f$0.lambda$createView$3(view);
                break;
            default:
                this.f$0.lambda$createView$4(view);
                break;
        }
    }
}
