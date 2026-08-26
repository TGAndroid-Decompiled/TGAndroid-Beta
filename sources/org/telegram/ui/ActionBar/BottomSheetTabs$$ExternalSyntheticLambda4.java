package org.telegram.ui.ActionBar;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;

public final class BottomSheetTabs$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId;

    public BottomSheetTabs$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                HashMap map = BottomSheetTabs.tabs;
                break;
            case 1:
                int i = BottomSheetTabs.TabsAccessibilityHelper.$r8$clinit;
                break;
            case 2:
                int i2 = UnconfirmedAuthHintCell.$r8$clinit;
                break;
            default:
                break;
        }
    }
}
