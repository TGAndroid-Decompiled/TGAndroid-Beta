package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class lw0 extends ProfileStoriesView {
    public final Context f39395t0;
    public final ProfileActivity f39396u0;

    public lw0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, l0 l0Var, iw0 iw0Var, org.telegram.ui.ActionBar.p6 p6Var, Context context2) {
        super(context, i10, j10, z10, l0Var, iw0Var, p6Var);
        this.f39396u0 = profileActivity;
        this.f39395t0 = context2;
    }

    @Override
    public final void e(r2.y yVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f39396u0;
        long a2 = profileActivity.a();
        th.e5 O1 = profileActivity.getMessagesController().O1();
        boolean K = O1.K(a2);
        Context context = this.f39395t0;
        if (!K && !O1.M(a2) && !O1.Q(a2)) {
            TLRPC.UserFull userFull = profileActivity.f33922u2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f33803d1 != profileActivity.getUserConfig().f15524n) {
                profileActivity.getOrCreateStoryViewer().S(context, profileActivity.f33922u2.stories, yVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f33915t2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().S(context, profileActivity.f33915t2.stories, yVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().R(context, a2, yVar);
    }
}
