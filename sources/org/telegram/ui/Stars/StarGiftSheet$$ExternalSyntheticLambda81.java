package org.telegram.ui.Stars;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;

public final class StarGiftSheet$$ExternalSyntheticLambda81 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final int f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;

    public StarGiftSheet$$ExternalSyntheticLambda81(int i, int i2, AlertsCreator.AnonymousClass21 anonymousClass21, AlertsCreator.AnonymousClass23 anonymousClass23, int i3, AlertsCreator.AnonymousClass22 anonymousClass22) {
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = anonymousClass21;
        this.f$4 = anonymousClass23;
        this.f$3 = i3;
        this.f$5 = anonymousClass22;
    }

    @Override
    public final void run(Object obj) {
        int minValue;
        int value;
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$openTransfer$149(this.f$1, this.f$2, this.f$3, (TL_stars.TL_starGiftUnique) this.f$4, (UserSelectorBottomSheet[]) this.f$5, (Long) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                int i = this.f$1;
                int i2 = i % 60;
                int i3 = (i - i2) / 60;
                int i4 = this.f$2;
                int i5 = i4 % 60;
                int i6 = (i4 - i5) / 60;
                if (i5 == 0 && i6 > 0) {
                    i6--;
                    i5 = 59;
                }
                boolean zBooleanValue = bool.booleanValue();
                AlertsCreator.AnonymousClass21 anonymousClass21 = (AlertsCreator.AnonymousClass21) this.f$0;
                AlertsCreator.AnonymousClass23 anonymousClass23 = (AlertsCreator.AnonymousClass23) this.f$4;
                if (zBooleanValue) {
                    value = anonymousClass21.getValue();
                    minValue = anonymousClass23.getValue();
                } else {
                    int i7 = this.f$3;
                    minValue = i7 % 60;
                    value = (i7 - minValue) / 60;
                    if (value == 24) {
                        value--;
                        minValue = 59;
                    }
                }
                anonymousClass21.setMinValue(i3);
                anonymousClass21.setMaxValue(i6);
                if (value > i6) {
                    anonymousClass21.setValue(i6);
                    value = i6;
                } else if (value < i3) {
                    anonymousClass21.setValue(i3);
                    value = i3;
                }
                if (value <= i3) {
                    anonymousClass23.setMinValue(i2);
                    anonymousClass23.setMaxValue(i3 == i6 ? i5 : 59);
                } else if (value >= i6) {
                    if (i3 != i6) {
                        i2 = 0;
                    }
                    anonymousClass23.setMinValue(i2);
                    anonymousClass23.setMaxValue(i5);
                } else if (i3 == i6) {
                    anonymousClass23.setMinValue(i2);
                    anonymousClass23.setMaxValue(i5);
                } else {
                    anonymousClass23.setMinValue(0);
                    anonymousClass23.setMaxValue(59);
                }
                if (minValue > anonymousClass23.getMaxValue()) {
                    minValue = anonymousClass23.getMaxValue();
                    anonymousClass23.setValue(minValue);
                } else if (minValue < anonymousClass23.getMinValue()) {
                    minValue = anonymousClass23.getMinValue();
                    anonymousClass23.setValue(minValue);
                }
                if (!bool.booleanValue()) {
                    anonymousClass21.setValue(value);
                    anonymousClass23.setValue(minValue);
                }
                ((AlertsCreator.AnonymousClass22) this.f$5).invalidate();
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda81(StarGiftSheet starGiftSheet, int i, int i2, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, UserSelectorBottomSheet[] userSelectorBottomSheetArr) {
        this.f$0 = starGiftSheet;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = tL_starGiftUnique;
        this.f$5 = userSelectorBottomSheetArr;
    }
}
