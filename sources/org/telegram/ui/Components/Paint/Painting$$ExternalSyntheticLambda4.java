package org.telegram.ui.Components.Paint;

import com.google.common.base.Splitter;

public final class Painting$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final Painting f$0;
    public final Splitter f$1;

    public Painting$$ExternalSyntheticLambda4(Painting painting, Splitter splitter, int i) {
        this.$r8$classId = i;
        this.f$0 = painting;
        this.f$1 = splitter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.restoreSliceInternal(this.f$1, true);
                break;
            default:
                Splitter splitter = this.f$1;
                Painting painting = this.f$0;
                painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda4(painting, splitter, 0));
                break;
        }
    }
}
