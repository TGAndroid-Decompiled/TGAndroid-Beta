package org.telegram.ui.Components.Premium.boosts;

import android.app.Activity;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.WrappedResourceProvider;

public class DarkFragmentWrapper extends BaseFragment {
    private final BaseFragment parentFragment;

    @Override
    public boolean isLightStatusBar() {
        return false;
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment) {
        return false;
    }

    public DarkFragmentWrapper(BaseFragment baseFragment) {
        this.parentFragment = baseFragment;
    }

    @Override
    public Activity getParentActivity() {
        return this.parentFragment.getParentActivity();
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return new WrappedResourceProvider(new DarkThemeResourceProvider());
    }
}
