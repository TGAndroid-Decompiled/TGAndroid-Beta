package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

public final class AlertsCreator$$ExternalSyntheticLambda9 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;

    public AlertsCreator$$ExternalSyntheticLambda9(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                break;
            default:
                ThemeEditorView.AnonymousClass1.lambda$onTouchEvent$0(dialogInterface);
                break;
        }
    }
}
