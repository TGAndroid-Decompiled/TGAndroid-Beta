package org.telegram.ui.Components;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ProximitySheet$$ExternalSyntheticLambda1 implements NumberPicker.Formatter, NumberPicker.OnValueChangeListener {
    public final int $r8$classId;
    public final ProximitySheet f$0;

    public ProximitySheet$$ExternalSyntheticLambda1(ProximitySheet proximitySheet, int i) {
        this.$r8$classId = i;
        this.f$0 = proximitySheet;
    }

    @Override
    public String format(int i) {
        ProximitySheet proximitySheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                return proximitySheet.useImperialSystem ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i));
            default:
                if (!proximitySheet.useImperialSystem) {
                    if (i == 1) {
                        return LocaleController.formatString("MetersShort", R.string.MetersShort, 50);
                    }
                    if (i > 1) {
                        i--;
                    }
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, Integer.valueOf(i * 100));
                }
                if (i == 1) {
                    return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                }
                if (i > 1) {
                    i--;
                }
                Locale locale = Locale.US;
                return SurfaceContainer$$ExternalSyntheticOutline0.m(i, ".");
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        ProximitySheet proximitySheet = this.f$0;
        proximitySheet.getClass();
        try {
            proximitySheet.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        proximitySheet.updateText(true);
    }
}
