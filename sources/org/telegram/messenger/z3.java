package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;
public final class z3 implements View.OnClickListener {
    public final int f20202a;
    public final Object f20203b;

    public z3(Object obj, int i10) {
        this.f20202a = i10;
        this.f20203b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20202a) {
            case 0:
                FilesMigrationService.FilesMigrationBottomSheet.n((FilesMigrationService.FilesMigrationBottomSheet) this.f20203b, view);
                return;
            default:
                MessagesController.lambda$checkSensitive$448((boolean[]) this.f20203b, view);
                return;
        }
    }
}
