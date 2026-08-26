package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;

public final class EmojiView$$ExternalSyntheticLambda24 implements ViewGroupPartRenderer.DrawChildMethod, Utilities.Callback5 {
    public final RecyclerListView f$0;

    public EmojiView$$ExternalSyntheticLambda24(RecyclerListView recyclerListView) {
        this.f$0 = recyclerListView;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return this.f$0.drawChild(canvas, view, j);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        float fFloatValue = ((Float) obj3).floatValue();
        float fFloatValue2 = ((Float) obj4).floatValue();
        float fFloatValue3 = ((Float) obj5).floatValue();
        this.f$0.drawBackgroundRect((Canvas) obj, (RectF) obj2, fFloatValue, fFloatValue2, fFloatValue3);
    }
}
