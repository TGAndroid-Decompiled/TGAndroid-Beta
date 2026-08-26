package org.telegram.ui.Stories;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AvatarsImageView;

public final class HwAvatarsImageView extends AvatarsImageView {
    public final int $r8$classId;

    public HwAvatarsImageView(int i, Context context, boolean z) {
        super(context, z);
        this.$r8$classId = i;
    }

    @Override
    public void invalidate() {
        switch (this.$r8$classId) {
            case 0:
                if (!HwFrameLayout.hwEnabled) {
                    super.invalidate();
                } else {
                    HwFrameLayout.hwViews.add(this);
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                int i3 = this.avatarsDrawable.count;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i3 == 0 ? 0 : zzkv.m(i3, 1, 20, 24)), 1073741824), i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        switch (this.$r8$classId) {
            case 0:
                if (HwFrameLayout.hwEnabled) {
                    HwFrameLayout.hwViews.add(this);
                } else {
                    super.invalidate(i, i2, i3, i4);
                }
                break;
            default:
                super.invalidate(i, i2, i3, i4);
                break;
        }
    }
}
