package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;

public final class SettingsActivity$$ExternalSyntheticLambda24 implements Utilities.Callback5, Utilities.Callback5Return, OnApplyWindowInsetsListener {
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda24(SettingsActivity settingsActivity) {
        this.f$0 = settingsActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2));
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        this.f$0.onClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
    }
}
