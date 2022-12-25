package org.telegram.p009ui.ActionBar;

import java.util.Comparator;
import org.telegram.p009ui.ActionBar.Theme;

public final class Theme$$ExternalSyntheticLambda9 implements Comparator {
    public static final Theme$$ExternalSyntheticLambda9 INSTANCE = new Theme$$ExternalSyntheticLambda9();

    private Theme$$ExternalSyntheticLambda9() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$sortAccents$0;
        lambda$sortAccents$0 = Theme.lambda$sortAccents$0((Theme.ThemeAccent) obj, (Theme.ThemeAccent) obj2);
        return lambda$sortAccents$0;
    }
}
