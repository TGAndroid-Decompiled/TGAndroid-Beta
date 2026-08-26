package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class AlertsCreator$$ExternalSyntheticLambda260 implements Utilities.CallbackReturn {
    public final int $r8$classId;

    public AlertsCreator$$ExternalSyntheticLambda260(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$156((Integer) obj);
            case 1:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$158((Integer) obj);
            case 2:
                return RecyclerListView.lambda$setSections$2((View) obj);
            default:
                return Boolean.valueOf(UniversalAdapter.isShadow(((Integer) obj).intValue()));
        }
    }
}
