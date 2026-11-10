package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class fv0 extends ProfileStoriesView {
    public final Context f45854t0;
    public final ProfileActivity f45855u0;

    public fv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z9, k0 k0Var, cv0 cv0Var, org.telegram.ui.ActionBar.h6 h6Var, Context context2) {
        super(context, i7, j3, z9, k0Var, cv0Var, h6Var);
        this.f45855u0 = profileActivity;
        this.f45854t0 = context2;
    }

    @Override
    public final void e(aa.n nVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f45855u0;
        long a10 = profileActivity.a();
        di.z6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.f45854t0;
        if (!K && !P1.M(a10) && !P1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f41831u2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f41714d1 != profileActivity.getUserConfig().f24493n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41831u2.stories, nVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f41825t2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f41825t2.stories, nVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, nVar);
    }
}
