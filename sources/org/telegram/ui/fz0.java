package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class fz0 extends ProfileStoriesView {
    public final Context f34257q0;
    public final ProfileActivity f34258r0;

    public fz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z4, n0 n0Var, cz0 cz0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i10, j10, z4, n0Var, cz0Var, f6Var);
        this.f34258r0 = profileActivity;
        this.f34257q0 = context2;
    }

    @Override
    public final void e(bb.b bVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f34258r0;
        long a2 = profileActivity.a();
        nh.t6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.f34257q0;
        if (!I && !storiesController.K(a2) && !storiesController.N(a2)) {
            TLRPC.UserFull userFull = profileActivity.f32132s2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f32011b1 != profileActivity.getUserConfig().clientUserId) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32132s2.stories, bVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f32124r2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f32124r2.stories, bVar);
                return;
            } else {
                profileActivity.K3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().D(context, a2, bVar);
    }
}
