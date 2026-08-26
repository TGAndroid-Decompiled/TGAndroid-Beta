package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.util.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda239 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId = 1;
    public final boolean f$0;
    public final Context f$1;
    public final Object f$2;
    public final Object f$3;

    public AlertsCreator$$ExternalSyntheticLambda239(EditTextBoldCursor editTextBoldCursor, Utilities.Callback2 callback2, Context context, boolean z) {
        this.f$2 = editTextBoldCursor;
        this.f$3 = callback2;
        this.f$1 = context;
        this.f$0 = z;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$3(this.f$0, this.f$1, (AtomicBoolean) this.f$2, (Consumer) this.f$3, alertDialog, i);
                break;
            default:
                StickersDialogs.lambda$showNameEditorDialog$2((EditTextBoldCursor) this.f$2, (Utilities.Callback2) this.f$3, this.f$1, this.f$0, alertDialog, i);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda239(boolean z, Context context, AtomicBoolean atomicBoolean, Consumer consumer) {
        this.f$0 = z;
        this.f$1 = context;
        this.f$2 = atomicBoolean;
        this.f$3 = consumer;
    }
}
