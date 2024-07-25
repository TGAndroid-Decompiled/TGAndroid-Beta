package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
public class EmptyBaseFragment extends BaseFragment {
    @Override
    public View createView(Context context) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context);
        this.fragmentView = sizeNotifierFrameLayout;
        return sizeNotifierFrameLayout;
    }
}
