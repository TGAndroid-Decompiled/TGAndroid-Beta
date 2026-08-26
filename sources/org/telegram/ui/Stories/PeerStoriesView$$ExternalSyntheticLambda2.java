package org.telegram.ui.Stories;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ItemOptions;

public final class PeerStoriesView$$ExternalSyntheticLambda2 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final PeerStoriesView f$0;

    public PeerStoriesView$$ExternalSyntheticLambda2(PeerStoriesView peerStoriesView, int i) {
        this.$r8$classId = i;
        this.f$0 = peerStoriesView;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView peerStoriesView = this.f$0;
                if (peerStoriesView.disabledPaidFeatures(true)) {
                    return false;
                }
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(peerStoriesView.storyViewer.containerView, peerStoriesView.resourcesProvider, view);
                itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new PeerStoriesView$$ExternalSyntheticLambda3(peerStoriesView, 3), false);
                itemOptionsMakeOptions.addIf(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new PeerStoriesView$$ExternalSyntheticLambda3(peerStoriesView, 4), peerStoriesView.messageStars > 0);
                itemOptionsMakeOptions.setGravity(5);
                itemOptionsMakeOptions.forceTop = true;
                itemOptionsMakeOptions.show();
                return true;
            default:
                PeerStoriesView peerStoriesView2 = this.f$0;
                peerStoriesView2.liveCommentsView.openStarsSheet(peerStoriesView2.disabledPaidFeatures(false));
                return true;
        }
    }
}
