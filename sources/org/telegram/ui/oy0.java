package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class oy0 extends ProfileStoriesView {
    public final Context f41248p0;
    public final ProfileActivity f41249q0;

    public oy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, n0 n0Var, ly0 ly0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context2) {
        super(context, i10, j10, z10, n0Var, ly0Var, c6Var);
        this.f41249q0 = profileActivity;
        this.f41248p0 = context2;
    }

    @Override
    public final void e(ha.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f41249q0;
        long a2 = profileActivity.a();
        lh.s6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f41248p0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f36106r2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f35986a1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36106r2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f36099q2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36099q2.stories, cVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
    }
}
