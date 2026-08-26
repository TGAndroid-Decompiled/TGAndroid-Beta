package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ItemOptions;

public final class PhotoViewer$$ExternalSyntheticLambda147 implements View.OnClickListener {
    public final int $r8$classId;
    public final ItemOptions f$0;

    public PhotoViewer$$ExternalSyntheticLambda147(int i, ItemOptions itemOptions) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.closeSwipeback();
                break;
            default:
                this.f$0.closeSwipeback();
                break;
        }
    }
}
