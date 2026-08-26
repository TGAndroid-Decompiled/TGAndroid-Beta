package org.telegram.ui.Stars;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;

public final class StarGiftSheet$$ExternalSyntheticLambda74 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final int f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;

    public StarGiftSheet$$ExternalSyntheticLambda74(int i, int i2, NumberPicker numberPicker, NumberPicker numberPicker2, int i3, LinearLayout linearLayout) {
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = numberPicker;
        this.f$4 = numberPicker2;
        this.f$3 = i3;
        this.f$5 = linearLayout;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int i = this.f$3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$4;
                ((StarGiftSheet) this.f$0).lambda$openTransfer$149(this.f$1, this.f$2, i, tL_starGiftUnique, (UserSelectorBottomSheet[]) this.f$5, (Long) obj);
                break;
            default:
                NumberPicker numberPicker = (NumberPicker) this.f$0;
                NumberPicker numberPicker2 = (NumberPicker) this.f$4;
                int i2 = this.f$3;
                AlertsCreator.lambda$createTimePickerDialog$106(this.f$1, this.f$2, numberPicker, numberPicker2, i2, (LinearLayout) this.f$5, (Boolean) obj);
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda74(StarGiftSheet starGiftSheet, int i, int i2, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, UserSelectorBottomSheet[] userSelectorBottomSheetArr) {
        this.f$0 = starGiftSheet;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = tL_starGiftUnique;
        this.f$5 = userSelectorBottomSheetArr;
    }
}
