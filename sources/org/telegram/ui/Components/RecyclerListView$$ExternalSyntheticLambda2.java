package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;

public final class RecyclerListView$$ExternalSyntheticLambda2 implements Utilities.Callback5 {
    public final RecyclerListView f$0;

    public RecyclerListView$$ExternalSyntheticLambda2(RecyclerListView recyclerListView) {
        this.f$0 = recyclerListView;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f$0.drawBackgroundRect((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
    }
}
