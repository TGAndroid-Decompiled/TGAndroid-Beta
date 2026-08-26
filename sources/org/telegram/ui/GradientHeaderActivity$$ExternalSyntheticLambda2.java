package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RecyclerListView;

public final class GradientHeaderActivity$$ExternalSyntheticLambda2 implements Utilities.Callback5 {
    public final int $r8$classId;
    public final RecyclerListView f$0;

    public GradientHeaderActivity$$ExternalSyntheticLambda2(RecyclerListView recyclerListView, int i) {
        this.$r8$classId = i;
        this.f$0 = recyclerListView;
    }

    @Override
    public final void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 0:
                RecyclerListView.drawBackgroundRect((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), this.f$0.resourcesProvider);
                break;
            default:
                RecyclerListView.drawBackgroundRect((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), this.f$0.resourcesProvider);
                break;
        }
    }
}
