package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import androidx.core.util.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

public final class AlertsCreator$$ExternalSyntheticLambda43 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AlertsCreator$$ExternalSyntheticLambda43(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createChangeNameAlert$92((EditText) this.f$0, (EditText) this.f$1, dialogInterface);
                break;
            case 1:
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$5((AtomicBoolean) this.f$0, (Consumer) this.f$1, dialogInterface);
                break;
            default:
                AlertsCreator.lambda$createCustomPicker$266((Utilities.Callback) this.f$0, (NumberPicker) this.f$1, dialogInterface);
                break;
        }
    }
}
