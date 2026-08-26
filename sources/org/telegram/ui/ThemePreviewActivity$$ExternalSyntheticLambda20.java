package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.WallpaperParallaxEffect;

public final class ThemePreviewActivity$$ExternalSyntheticLambda20 implements RecyclerListView.OnItemClickListenerExtended, WallpaperParallaxEffect.Callback, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda20(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$checkDiscard$25(alertDialog, i);
                break;
            case 3:
                this.f$0.lambda$checkDiscard$26(alertDialog, i);
                break;
            case 4:
                this.f$0.lambda$selectColorType$24(alertDialog, i);
                break;
            case 5:
                this.f$0.lambda$selectColorType$22(alertDialog, i);
                break;
            default:
                this.f$0.lambda$selectColorType$23(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$createView$6(view, i, f, f2);
    }

    @Override
    public void onOffsetsChanged(int i, int i2, float f) {
        this.f$0.lambda$createView$7(i, i2, f);
    }
}
