package org.telegram.ui.Components.Premium.boosts.adapters;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;

public final class SelectorAdapter$$ExternalSyntheticLambda1 implements Consumer {
    public final boolean f$0;

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        if (view instanceof SelectorUserCell) {
            ((SelectorUserCell) view).setCallButtonsVisible(this.f$0, true);
        }
    }
}
