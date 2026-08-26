package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class CacheControlActivity$$ExternalSyntheticLambda9 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, KeepMediaPopupView.Callback {
    public final CacheControlActivity f$0;

    public CacheControlActivity$$ExternalSyntheticLambda9(CacheControlActivity cacheControlActivity) {
        this.f$0 = cacheControlActivity;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$clearSelectedFiles$20(alertDialog, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$createView$19(view, i, f, f2);
    }

    @Override
    public void onKeepMediaChange(int i, int i2) {
        this.f$0.lambda$createView$18(i, i2);
    }
}
