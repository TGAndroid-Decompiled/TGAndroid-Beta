package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.util.Consumer;

public final class ViewPagerFixed$TabsView$$ExternalSyntheticLambda3 implements Consumer {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final boolean f$1;

    public ViewPagerFixed$TabsView$$ExternalSyntheticLambda3(FrameLayout frameLayout, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = z;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                ((ViewPagerFixed.TabsView) this.f$0).lambda$setReordering$3(this.f$1, view);
                break;
            default:
                ((ReactionsContainerLayout) this.f$0).lambda$updateSelected$4(this.f$1, view);
                break;
        }
    }
}
