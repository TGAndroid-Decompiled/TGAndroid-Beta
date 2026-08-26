package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.util.Consumer;

public final class UniversalRecyclerView$$ExternalSyntheticLambda3 implements Consumer {
    public final int $r8$classId;
    public final ViewGroup f$0;

    public UniversalRecyclerView$$ExternalSyntheticLambda3(ViewGroup viewGroup, int i) {
        this.$r8$classId = i;
        this.f$0 = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((UniversalRecyclerView) this.f$0).lambda$allowReorder$2((View) obj);
                break;
            case 1:
                ((MessagePreviewView.Page) this.f$0).lambda$onAttachedToWindow$21((View) obj);
                break;
            default:
                ((ReactionsContainerLayout) this.f$0).lambda$reset$6((View) obj);
                break;
        }
    }
}
