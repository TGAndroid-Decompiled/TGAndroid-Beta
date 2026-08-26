package org.telegram.ui.Components;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;

public final class AlertsCreator$$ExternalSyntheticLambda96 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public AlertsCreator$$ExternalSyntheticLambda96(Object obj, Object obj2, KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = callback;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createTimePickerDialog$113((Utilities.Callback) this.f$0, (NumberPicker) this.f$1, (NumberPicker) this.f$2, dialogInterface);
                break;
            case 1:
                AlertsCreator.lambda$createTimezonePickerDialog$105((Utilities.Callback) this.f$0, (ArrayList) this.f$2, (NumberPicker) this.f$1, dialogInterface);
                break;
            default:
                AlertsCreator.lambda$createSimpleTextInputAlert$16((EditTextBoldCursor) this.f$0, (BaseFragment) this.f$1, (Activity) this.f$2, dialogInterface);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda96(Utilities.Callback callback, ArrayList arrayList, NumberPicker numberPicker) {
        this.$r8$classId = 1;
        this.f$0 = callback;
        this.f$2 = arrayList;
        this.f$1 = numberPicker;
    }
}
