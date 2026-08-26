package org.telegram.ui.bots;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;

public abstract class BotWebViewAttachedSheet implements NotificationCenter.NotificationCenterDelegate, BaseFragment.AttachedSheet, BottomSheetTabsOverlay.Sheet {
    public static final int $r8$clinit = 0;

    public abstract class MainButtonSettings {
    }

    static {
        new SimpleFloatPropertyCompat("actionBarTransitionProgress", new BotWebViewSheet$$ExternalSyntheticLambda2(8), new BotWebViewSheet$$ExternalSyntheticLambda2(9)).setMultiplier(100.0f);
    }
}
