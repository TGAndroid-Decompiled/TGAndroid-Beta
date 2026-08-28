package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class oy0 extends ProfileStoriesView {
    public final Context f41279p0;
    public final ProfileActivity f41280q0;

    public oy0(ProfileActivity profileActivity, Context context, int i9, long j10, boolean z10, m0 m0Var, ly0 ly0Var, org.telegram.ui.ActionBar.b6 b6Var, Context context2) {
        super(context, i9, j10, z10, m0Var, ly0Var, b6Var);
        this.f41280q0 = profileActivity;
        this.f41279p0 = context2;
    }

    @Override
    public final void e(k5.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f41280q0;
        long a2 = profileActivity.a();
        ih.v6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f41279p0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f36040r2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f35920a1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36040r2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f36032q2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36032q2.stories, iVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
    }
}
