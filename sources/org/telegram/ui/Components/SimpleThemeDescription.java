package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Objects;
import org.telegram.ui.ActionBar.ThemeDescription;
public class SimpleThemeDescription {
    public static ThemeDescription createThemeDescription(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, String str) {
        return new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, str);
    }

    public static ArrayList<ThemeDescription> createThemeDescriptions(ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate, String... strArr) {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>(strArr.length);
        for (String str : strArr) {
            arrayList.add(createThemeDescription(themeDescriptionDelegate, str));
        }
        return arrayList;
    }

    public static void add(ArrayList<ThemeDescription> arrayList, final Runnable runnable, String... strArr) {
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
        }, strArr));
    }
}
