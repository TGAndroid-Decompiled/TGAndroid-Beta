package org.telegram.ui.Components;

import java.util.Comparator;
import org.telegram.ui.Components.BackButtonMenu;
public final class BackButtonMenu$$ExternalSyntheticLambda1 implements Comparator {
    public static final BackButtonMenu$$ExternalSyntheticLambda1 INSTANCE = new BackButtonMenu$$ExternalSyntheticLambda1();

    private BackButtonMenu$$ExternalSyntheticLambda1() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getStackedHistoryDialogs$1;
        lambda$getStackedHistoryDialogs$1 = BackButtonMenu.lambda$getStackedHistoryDialogs$1((BackButtonMenu.PulledDialog) obj, (BackButtonMenu.PulledDialog) obj2);
        return lambda$getStackedHistoryDialogs$1;
    }
}
