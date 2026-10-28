package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class dz0 extends ProfileStoriesView {
    public final Context f38715t0;
    public final ProfileActivity f38716u0;

    public dz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, k0 k0Var, az0 az0Var, org.telegram.ui.ActionBar.u6 u6Var, Context context2) {
        super(context, i10, j10, z10, k0Var, az0Var, u6Var);
        this.f38716u0 = profileActivity;
        this.f38715t0 = context2;
    }

    @Override
    public final void e(rb.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f38716u0;
        long a2 = profileActivity.a();
        di.h7 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean K = storiesController.K(a2);
        Context context = this.f38715t0;
        if (!K && !storiesController.M(a2) && !storiesController.Q(a2)) {
            TLRPC.UserFull userFull = profileActivity.f36122v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f36003e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().F(context, profileActivity.f36122v2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f36115u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().F(context, profileActivity.f36115u2.stories, cVar);
                return;
            } else {
                profileActivity.T3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().E(context, a2, cVar);
    }
}
