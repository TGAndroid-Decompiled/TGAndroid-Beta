package org.telegram.ui;

import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.ProxyListActivity;
public final class ProxyListActivity$ListAdapter$$ExternalSyntheticLambda0 implements SlideChooseView.Callback {
    public static final ProxyListActivity$ListAdapter$$ExternalSyntheticLambda0 INSTANCE = new ProxyListActivity$ListAdapter$$ExternalSyntheticLambda0();

    private ProxyListActivity$ListAdapter$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void onOptionSelected(int i) {
        ProxyListActivity.ListAdapter.lambda$onBindViewHolder$0(i);
    }

    @Override
    public void onTouchEnd() {
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }
}
