package org.telegram.ui;

import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Components.SlideChooseView;
public final class CacheControlActivity$ListAdapter$$ExternalSyntheticLambda3 implements SlideChooseView.Callback {
    public static final CacheControlActivity$ListAdapter$$ExternalSyntheticLambda3 INSTANCE = new CacheControlActivity$ListAdapter$$ExternalSyntheticLambda3();

    private CacheControlActivity$ListAdapter$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void onOptionSelected(int i) {
        CacheControlActivity.ListAdapter.lambda$onCreateViewHolder$0(i);
    }

    @Override
    public void onTouchEnd() {
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }
}
