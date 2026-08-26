package org.telegram.ui.Components.Paint.Views;

import androidx.core.util.Consumer;

public final class LPhotoPaintView$$ExternalSyntheticLambda30 implements Consumer {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda30(LPhotoPaintView lPhotoPaintView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$8((Integer) obj);
                break;
            default:
                this.f$0.lambda$new$9((Integer) obj);
                break;
        }
    }
}
