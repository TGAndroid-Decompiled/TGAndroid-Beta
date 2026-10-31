package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class mw0 extends ProfileStoriesView {
    public final Context f39785t0;
    public final ProfileActivity f39786u0;

    public mw0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, l0 l0Var, jw0 jw0Var, org.telegram.ui.ActionBar.p6 p6Var, Context context2) {
        super(context, i10, j10, z10, l0Var, jw0Var, p6Var);
        this.f39786u0 = profileActivity;
        this.f39785t0 = context2;
    }

    @Override
    public final void e(r2.y yVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f39786u0;
        long a2 = profileActivity.a();
        th.e5 O1 = profileActivity.getMessagesController().O1();
        boolean K = O1.K(a2);
        Context context = this.f39785t0;
        if (!K && !O1.M(a2) && !O1.Q(a2)) {
            TLRPC.UserFull userFull = profileActivity.f33915u2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f33796d1 != profileActivity.getUserConfig().f15165n) {
                profileActivity.getOrCreateStoryViewer().S(context, profileActivity.f33915u2.stories, yVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f33908t2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().S(context, profileActivity.f33908t2.stories, yVar);
                return;
            } else {
                profileActivity.Z3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().R(context, a2, yVar);
    }
}
