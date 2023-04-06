package org.telegram.ui.ActionBar;

import java.util.Comparator;
import org.telegram.ui.ActionBar.Theme;
public final class Theme$$ExternalSyntheticLambda11 implements Comparator {
    public static final Theme$$ExternalSyntheticLambda11 INSTANCE = new Theme$$ExternalSyntheticLambda11();

    private Theme$$ExternalSyntheticLambda11() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sortThemes$1;
        lambda$sortThemes$1 = Theme.lambda$sortThemes$1((Theme.ThemeInfo) obj, (Theme.ThemeInfo) obj2);
        return lambda$sortThemes$1;
    }
}
