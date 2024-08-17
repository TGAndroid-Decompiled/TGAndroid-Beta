package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Objects;
import org.telegram.ui.ActionBar.ThemeDescription;

public class SimpleThemeDescription {
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

    public static void add(ArrayList<ThemeDescription> arrayList, final Runnable runnable, int... iArr) {
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
}
