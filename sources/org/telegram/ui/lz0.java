package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class lz0 extends ProfileStoriesView {
    public final Context f38371t0;
    public final ProfileActivity f38372u0;

    public lz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, k0 k0Var, iz0 iz0Var, org.telegram.ui.ActionBar.d6 d6Var, Context context2) {
        super(context, i10, j3, z10, k0Var, iz0Var, d6Var);
        this.f38372u0 = profileActivity;
        this.f38371t0 = context2;
    }

    @Override
    public final void e(a6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f38372u0;
        long a2 = profileActivity.a();
        ai.l9 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f38371t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f34352v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f34234e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34352v2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f34345u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34345u2.stories, iVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
    }
}
