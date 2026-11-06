package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class bv0 extends ProfileStoriesView {
    public final Context f44472t0;
    public final ProfileActivity f44473u0;

    public bv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z9, k0 k0Var, yu0 yu0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i7, j3, z9, k0Var, yu0Var, f6Var);
        this.f44473u0 = profileActivity;
        this.f44472t0 = context2;
    }

    @Override
    public final void e(aa.n nVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f44473u0;
        long a10 = profileActivity.a();
        di.y6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.f44472t0;
        if (!K && !P1.M(a10) && !P1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f41805u2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f41688d1 != profileActivity.getUserConfig().f24478n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41805u2.stories, nVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f41799t2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41799t2.stories, nVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, nVar);
    }
}
