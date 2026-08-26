package org.telegram.ui;

import android.view.animation.Interpolator;

public final class DataUsageActivity$$ExternalSyntheticLambda1 implements Interpolator {
    public final int $r8$classId;

    public DataUsageActivity$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final float getInterpolation(float f) {
        switch (this.$r8$classId) {
            case 0:
                return DataUsageActivity.lambda$static$0(f);
            case 1:
                return DialogOrContactPickerActivity.lambda$static$0(f);
            case 2:
                return DialogsActivity.lambda$static$0(f);
            default:
                return PhotoPickerSearchActivity.lambda$static$0(f);
        }
    }
}
