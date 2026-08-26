package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda0;

public final class AlertsCreator$$ExternalSyntheticLambda44 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AlertsCreator$$ExternalSyntheticLambda44(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$createChangeNameAlert$93((AlertDialog) this.f$0, (BotVerifySheet$$ExternalSyntheticLambda0) this.f$1, textView, i, keyEvent);
            default:
                return ((ChatAttachAlertPollLayout.ListAdapter) this.f$0).lambda$onCreateViewHolder$4((PollEditTextCell) this.f$1, textView, i, keyEvent);
        }
    }
}
