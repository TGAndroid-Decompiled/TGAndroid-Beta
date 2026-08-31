package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class bz0 extends ProfileStoriesView {
    public final Context f35630q0;
    public final ProfileActivity f35631r0;

    public bz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z4, l0 l0Var, yy0 yy0Var, org.telegram.ui.ActionBar.g6 g6Var, Context context2) {
        super(context, i10, j10, z4, l0Var, yy0Var, g6Var);
        this.f35631r0 = profileActivity;
        this.f35630q0 = context2;
    }

    @Override
    public final void e(oh.h4 h4Var) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f35631r0;
        long a2 = profileActivity.a();
        oh.t6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f35630q0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f34691s2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f34569b1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34691s2.stories, h4Var);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f34683r2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f34683r2.stories, h4Var);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, h4Var);
    }
}
