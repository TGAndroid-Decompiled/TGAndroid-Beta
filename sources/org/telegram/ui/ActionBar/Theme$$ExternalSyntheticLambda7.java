package org.telegram.ui.ActionBar;

import java.util.Comparator;
import org.telegram.ui.ActionBar.Theme;

public final class Theme$$ExternalSyntheticLambda7 implements Comparator {
    public static final Theme$$ExternalSyntheticLambda7 INSTANCE = new Theme$$ExternalSyntheticLambda7();

    private Theme$$ExternalSyntheticLambda7() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sortAccents$0;
        lambda$sortAccents$0 = Theme.lambda$sortAccents$0((Theme.ThemeAccent) obj, (Theme.ThemeAccent) obj2);
        return lambda$sortAccents$0;
    }
}
