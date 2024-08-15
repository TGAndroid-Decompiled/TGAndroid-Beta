package org.telegram.ui;

import org.telegram.ui.Components.LinkSpanDrawable;
public final class PhotoViewer$CaptionTextView$$ExternalSyntheticLambda2 implements Runnable {
    public final LinkSpanDrawable.LinkCollector f$0;

    public PhotoViewer$CaptionTextView$$ExternalSyntheticLambda2(LinkSpanDrawable.LinkCollector linkCollector) {
        this.f$0 = linkCollector;
    }

    @Override
    public final void run() {
        this.f$0.clear();
    }
}
