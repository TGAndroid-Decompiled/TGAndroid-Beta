package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.ThemeDescription;

public abstract class SimpleThemeDescription {
    public static ArrayList createThemeDescriptions(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i));
        }
        return arrayList;
    }
}
