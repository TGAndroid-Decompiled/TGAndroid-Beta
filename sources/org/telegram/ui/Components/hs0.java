package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class hs0 extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), org.telegram.messenger.i0.L(24.0f) + view.getHeight(), org.telegram.messenger.i0.L(24.0f));
    }
}
