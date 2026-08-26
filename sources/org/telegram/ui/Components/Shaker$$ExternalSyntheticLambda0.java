package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.TextSettingsCell;

public final class Shaker$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final View f$0;

    public Shaker$$ExternalSyntheticLambda0(int i, View view) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidate();
                break;
            case 1:
                this.f$0.callOnClick();
                break;
            case 2:
                this.f$0.performClick();
                break;
            case 3:
                this.f$0.setBackgroundDrawable(null);
                break;
            case 4:
                SharedConfig.setSuggestStickers(0);
                TextSettingsCell textSettingsCell = (TextSettingsCell) this.f$0;
                textSettingsCell.valueTextView.setText(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                break;
            case 5:
                SharedConfig.setSuggestStickers(1);
                TextSettingsCell textSettingsCell2 = (TextSettingsCell) this.f$0;
                textSettingsCell2.valueTextView.setText(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                break;
            default:
                SharedConfig.setSuggestStickers(2);
                TextSettingsCell textSettingsCell3 = (TextSettingsCell) this.f$0;
                textSettingsCell3.valueTextView.setText(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                break;
        }
    }
}
