package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;

public final class CallLogActivity$$ExternalSyntheticLambda6 implements ViewGroupPartRenderer.DrawChildMethod {
    public final UniversalRecyclerView f$0;

    public CallLogActivity$$ExternalSyntheticLambda6(UniversalRecyclerView universalRecyclerView) {
        this.f$0 = universalRecyclerView;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return this.f$0.drawChild(canvas, view, j);
    }
}
