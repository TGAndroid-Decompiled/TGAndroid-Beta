package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class AlertsCreator$$ExternalSyntheticLambda136 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended {
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public AlertsCreator$$ExternalSyntheticLambda136(BaseFragment baseFragment, TLRPC.User user, boolean z) {
        this.f$0 = baseFragment;
        this.f$1 = user;
        this.f$2 = z;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        AlertsCreator.lambda$createCallDialogAlert$85((BaseFragment) this.f$0, (TLRPC.User) this.f$1, this.f$2, alertDialog, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((ChatAttachAlertPhotoLayout) this.f$0).lambda$new$3(this.f$2, (Theme.ResourcesProvider) this.f$1, view, i, f, f2);
    }

    public AlertsCreator$$ExternalSyntheticLambda136(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = chatAttachAlertPhotoLayout;
        this.f$2 = z;
        this.f$1 = resourcesProvider;
    }
}
