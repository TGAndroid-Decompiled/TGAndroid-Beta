package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class bz0 extends ProfileStoriesView {
    public final Context f38188t0;
    public final ProfileActivity f38189u0;

    public bz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, k0 k0Var, yy0 yy0Var, org.telegram.ui.ActionBar.u6 u6Var, Context context2) {
        super(context, i10, j10, z10, k0Var, yy0Var, u6Var);
        this.f38189u0 = profileActivity;
        this.f38188t0 = context2;
    }

    @Override
    public final void e(rb.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f38189u0;
        long a2 = profileActivity.a();
        di.h7 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f38188t0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f36098v2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f35979e1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36098v2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f36091u2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36091u2.stories, cVar);
                return;
            } else {
                profileActivity.T3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
    }
}
