package org.telegram.ui.ActionBar;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class ActionBarLayout$$ExternalSyntheticLambda3 implements OnApplyWindowInsetsListener {
    public final BaseFragment f$0;

    public ActionBarLayout$$ExternalSyntheticLambda3(BaseFragment baseFragment) {
        this.f$0 = baseFragment;
    }

    @Override
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onInsetsInternal(view, windowInsetsCompat);
    }
}
