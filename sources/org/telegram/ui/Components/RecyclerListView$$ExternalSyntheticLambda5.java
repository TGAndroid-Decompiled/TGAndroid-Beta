package org.telegram.ui.Components;

public final class RecyclerListView$$ExternalSyntheticLambda5 implements EdgeEffectTrackerFactory.OnEdgeEffectListener {
    public final int $r8$classId;
    public final Object f$0;

    public RecyclerListView$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onEdgeEffectVisibilityChange(int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((Runnable) this.f$0).run();
                break;
            default:
                ((EdgeEffectTrackerFactory) this.f$0).onEdgeEffectVisibilityChange(i, z);
                break;
        }
    }
}
