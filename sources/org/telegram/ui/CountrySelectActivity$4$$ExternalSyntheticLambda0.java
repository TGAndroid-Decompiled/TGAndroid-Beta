package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Cells.TextSettingsCell;

public final class CountrySelectActivity$4$$ExternalSyntheticLambda0 implements NotificationCenter.NotificationCenterDelegate {
    public final int $r8$classId;
    public final View f$0;

    public CountrySelectActivity$4$$ExternalSyntheticLambda0(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        switch (this.$r8$classId) {
            case 0:
                CountrySelectActivity.AnonymousClass4.lambda$$0((TextSettingsCell) this.f$0, i, i2, objArr);
                break;
            default:
                ((NewContactBottomSheet.AnonymousClass1) this.f$0).lambda$$0(i, i2, objArr);
                break;
        }
    }
}
