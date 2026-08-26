package org.telegram.ui;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;

public final class SettingsActivity$$ExternalSyntheticLambda2 implements Utilities.Callback5, Utilities.Callback5Return, OnApplyWindowInsetsListener {
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda2(SettingsActivity settingsActivity) {
        this.f$0 = settingsActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        SettingsActivity settingsActivity = this.f$0;
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        settingsActivity.navigationBarHeight = defaultWindowInsets.bottom;
        settingsActivity.listView.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.top, 0, settingsActivity.navigationBarHeight + settingsActivity.additionNavigationBarHeight);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(this.f$0.onLongClick$3((UItem) obj, (View) obj2));
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$8((UItem) obj);
    }
}
