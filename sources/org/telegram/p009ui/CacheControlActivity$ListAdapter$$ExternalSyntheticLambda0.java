package org.telegram.p009ui;

import org.telegram.p009ui.CacheControlActivity;
import org.telegram.p009ui.Components.SlideChooseView;

public final class CacheControlActivity$ListAdapter$$ExternalSyntheticLambda0 implements SlideChooseView.Callback {
    public static final CacheControlActivity$ListAdapter$$ExternalSyntheticLambda0 INSTANCE = new CacheControlActivity$ListAdapter$$ExternalSyntheticLambda0();

    private CacheControlActivity$ListAdapter$$ExternalSyntheticLambda0() {
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
