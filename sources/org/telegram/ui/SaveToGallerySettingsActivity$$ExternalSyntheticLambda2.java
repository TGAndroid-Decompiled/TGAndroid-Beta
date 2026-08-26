package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.RecyclerListView;

public final class SaveToGallerySettingsActivity$$ExternalSyntheticLambda2 implements RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListenerExtended {
    public final SaveToGallerySettingsActivity f$0;

    public SaveToGallerySettingsActivity$$ExternalSyntheticLambda2(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f$0 = saveToGallerySettingsActivity;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$createView$2(view, i, f, f2);
    }

    @Override
    public void onLongClickRelease() {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
    }

    @Override
    public void onMove(float f, float f2) {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
    }

    @Override
    public boolean mo2353onItemClick(View view, int i, float f, float f2) {
        return this.f$0.lambda$createView$5(view, i, f, f2);
    }
}
