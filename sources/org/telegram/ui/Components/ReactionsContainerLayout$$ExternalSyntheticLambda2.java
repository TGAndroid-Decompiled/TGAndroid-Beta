package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;

public final class ReactionsContainerLayout$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;
    public final ReactionsContainerLayout f$0;

    public ReactionsContainerLayout$$ExternalSyntheticLambda2(ReactionsContainerLayout reactionsContainerLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = reactionsContainerLayout;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                ReactionsContainerLayout reactionsContainerLayout = this.f$0;
                reactionsContainerLayout.recyclerListView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition >= 0) {
                    ArrayList arrayList = reactionsContainerLayout.items;
                    if (childAdapterPosition < arrayList.size() && (view instanceof ReactionsContainerLayout.ReactionHolderView)) {
                        ((ReactionsContainerLayout.ReactionHolderView) view).updateSelected(((ReactionsContainerLayout.InnerItem) arrayList.get(childAdapterPosition)).reaction, true);
                    }
                }
                break;
            default:
                ReactionsContainerLayout reactionsContainerLayout2 = this.f$0;
                reactionsContainerLayout2.getClass();
                if (view instanceof ReactionsContainerLayout.ReactionHolderView) {
                    ReactionsContainerLayout.ReactionHolderView reactionHolderView = (ReactionsContainerLayout.ReactionHolderView) view;
                    reactionHolderView.pressed = false;
                    ReactionsContainerLayout.ReactionHolderView.AnonymousClass2 anonymousClass2 = reactionHolderView.loopImageView;
                    anonymousClass2.setAlpha(1.0f);
                    if (!reactionsContainerLayout2.skipEnterAnimation) {
                        reactionHolderView.resetAnimation();
                    } else {
                        anonymousClass2.setScaleX(reactionHolderView.enterScale * (reactionHolderView.selected ? 0.76f : 1.0f));
                        anonymousClass2.setScaleY(reactionHolderView.enterScale * (reactionHolderView.selected ? 0.76f : 1.0f));
                    }
                }
                break;
        }
    }
}
