package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class z3 implements View.OnClickListener {
    public final int f20201a;
    public final Object f20202b;

    public z3(Object obj, int i10) {
        this.f20201a = i10;
        this.f20202b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20201a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f20202b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$448((boolean[]) this.f20202b, view);
                return;
        }
    }
}
