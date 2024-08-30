package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Objects;
import org.telegram.ui.ActionBar.ThemeDescription;

public abstract class SimpleThemeDescription {
    public static void add(ArrayList arrayList, final Runnable runnable, int... iArr) {
        Objects.requireNonNull(runnable);
        arrayList.addAll(createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                runnable.run();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, iArr));
    }

    public static ThemeDescription createThemeDescription(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, int i) {
        return new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i);
    }

    public static ArrayList createThemeDescriptions(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(createThemeDescription(themeDescriptionDelegate, i));
        }
        return arrayList;
    }
}
