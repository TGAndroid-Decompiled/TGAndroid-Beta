package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class ev0 extends ProfileStoriesView {
    public final Context f45517t0;
    public final ProfileActivity f45518u0;

    public ev0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z9, k0 k0Var, bv0 bv0Var, org.telegram.ui.ActionBar.g6 g6Var, Context context2) {
        super(context, i7, j3, z9, k0Var, bv0Var, g6Var);
        this.f45518u0 = profileActivity;
        this.f45517t0 = context2;
    }

    @Override
    public final void e(aa.n nVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f45518u0;
        long a10 = profileActivity.a();
        di.z6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.f45517t0;
        if (!K && !P1.M(a10) && !P1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f41840u2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f41723d1 != profileActivity.getUserConfig().f24489n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41840u2.stories, nVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f41834t2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41834t2.stories, nVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, nVar);
    }
}
