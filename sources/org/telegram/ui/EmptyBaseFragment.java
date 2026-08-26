package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public abstract class EmptyBaseFragment extends BaseFragment {
    @Override
    public final View createView(Context context) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context, null);
        this.fragmentView = sizeNotifierFrameLayout;
        return sizeNotifierFrameLayout;
    }
}
