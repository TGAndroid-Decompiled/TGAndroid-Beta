package org.telegram.p009ui.ActionBar;

import java.util.Comparator;
import org.telegram.p009ui.ActionBar.Theme;

public final class Theme$$ExternalSyntheticLambda10 implements Comparator {
    public static final Theme$$ExternalSyntheticLambda10 INSTANCE = new Theme$$ExternalSyntheticLambda10();

    private Theme$$ExternalSyntheticLambda10() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sortThemes$1;
        lambda$sortThemes$1 = Theme.lambda$sortThemes$1((Theme.ThemeInfo) obj, (Theme.ThemeInfo) obj2);
        return lambda$sortThemes$1;
    }
}
