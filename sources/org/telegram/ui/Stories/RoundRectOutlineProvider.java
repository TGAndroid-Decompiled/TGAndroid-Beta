package org.telegram.ui.Stories;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

public final class RoundRectOutlineProvider extends ViewOutlineProvider {
    public final int $r8$classId = 1;
    public float radiusInDp;

    public RoundRectOutlineProvider(float f) {
        this.radiusInDp = f;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.$r8$classId) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.radiusInDp));
                break;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.radiusInDp);
                break;
        }
    }

    public RoundRectOutlineProvider(int i) {
        this.radiusInDp = i;
    }
}
