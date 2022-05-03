package org.telegram.ui;

import java.util.Comparator;
import org.telegram.ui.ActionBar.Theme;

public final class ThemeActivity$$ExternalSyntheticLambda8 implements Comparator {
    public static final ThemeActivity$$ExternalSyntheticLambda8 INSTANCE = new ThemeActivity$$ExternalSyntheticLambda8();

    private ThemeActivity$$ExternalSyntheticLambda8() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$updateRows$0;
        lambda$updateRows$0 = ThemeActivity.lambda$updateRows$0((Theme.ThemeInfo) obj, (Theme.ThemeInfo) obj2);
        return lambda$updateRows$0;
    }
}
