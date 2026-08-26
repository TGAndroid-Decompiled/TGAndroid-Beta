package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ThemeDescription;

public class SimpleThemeDescription {
    private SimpleThemeDescription() {
    }

    public static void add(ArrayList<ThemeDescription> arrayList, Runnable runnable, int... iArr) {
        Objects.requireNonNull(runnable);
        arrayList.addAll(createThemeDescriptions(new ColorPicker$$ExternalSyntheticLambda7(runnable, 8), iArr));
    }

    public static ThemeDescription createThemeDescription(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, int i) {
        return new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i);
    }

    public static ArrayList<ThemeDescription> createThemeDescriptions(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, int... iArr) {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>(iArr.length);
        for (int i : iArr) {
            arrayList.add(createThemeDescription(themeDescriptionDelegate, i));
        }
        return arrayList;
    }
}
