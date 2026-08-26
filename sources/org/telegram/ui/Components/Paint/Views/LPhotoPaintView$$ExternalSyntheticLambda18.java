package org.telegram.ui.Components.Paint.Views;

import androidx.core.util.Consumer;
import org.telegram.ui.PhotoViewer;

public final class LPhotoPaintView$$ExternalSyntheticLambda18 implements Consumer {
    public final int $r8$classId;
    public final PhotoViewer.AnonymousClass67 f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda18(PhotoViewer.AnonymousClass67 anonymousClass67, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass67;
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
