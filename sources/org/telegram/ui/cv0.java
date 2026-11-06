package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class cv0 extends ProfileStoriesView {
    public final Context f44903t0;
    public final ProfileActivity f44904u0;

    public cv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z9, k0 k0Var, zu0 zu0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i7, j3, z9, k0Var, zu0Var, f6Var);
        this.f44904u0 = profileActivity;
        this.f44903t0 = context2;
    }

    @Override
    public final void e(aa.n nVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f44904u0;
        long a10 = profileActivity.a();
        di.y6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.f44903t0;
        if (!K && !P1.M(a10) && !P1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f41830u2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f41713d1 != profileActivity.getUserConfig().f24478n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41830u2.stories, nVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f41824t2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41824t2.stories, nVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, nVar);
    }
}
