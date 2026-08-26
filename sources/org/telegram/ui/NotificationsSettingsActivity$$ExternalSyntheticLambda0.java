package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class NotificationsSettingsActivity$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListenerExtended, AlertDialog.OnButtonClickListener {
    public final NotificationsSettingsActivity f$0;

    public NotificationsSettingsActivity$$ExternalSyntheticLambda0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f$0 = notificationsSettingsActivity;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$6$11();
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$createView$10(view, f, i);
    }
}
