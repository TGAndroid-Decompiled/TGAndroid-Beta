package org.telegram.ui.Components;

import java.util.ArrayList;

public final class RecyclerListView$$ExternalSyntheticLambda5 {
    public final int $r8$classId;
    public final Object f$0;

    public RecyclerListView$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final void onEdgeEffectVisibilityChange(int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((Runnable) this.f$0).run();
                break;
            default:
                ArrayList arrayList = ((EdgeEffectTrackerFactory) this.f$0).listeners;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((RecyclerListView$$ExternalSyntheticLambda5) obj).onEdgeEffectVisibilityChange(i, z);
                }
                break;
        }
    }
}
