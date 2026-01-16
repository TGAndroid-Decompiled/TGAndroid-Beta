package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;

public final class CallLogActivity$$ExternalSyntheticLambda3 implements ViewGroupPartRenderer.DrawChildMethod {
    public final RecyclerListView f$0;

    public CallLogActivity$$ExternalSyntheticLambda3(RecyclerListView recyclerListView) {
        this.f$0 = recyclerListView;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return this.f$0.drawChild(canvas, view, j);
    }
}
