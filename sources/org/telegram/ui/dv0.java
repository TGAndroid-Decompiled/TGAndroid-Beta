package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class dv0 extends ProfileStoriesView {
    public final Context f47022u0;
    public final ProfileActivity f47023v0;

    public dv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z10, k0 k0Var, av0 av0Var, org.telegram.ui.ActionBar.h6 h6Var, Context context2) {
        super(context, i7, j3, z10, k0Var, av0Var, h6Var);
        this.f47023v0 = profileActivity;
        this.f47022u0 = context2;
    }

    @Override
    public final void e(d6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f47023v0;
        long a10 = profileActivity.a();
        fi.p6 R1 = profileActivity.getMessagesController().R1();
        boolean K = R1.K(a10);
        Context context = this.f47022u0;
        if (!K && !R1.M(a10) && !R1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f43675w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f43550e1 != profileActivity.getUserConfig().f24951n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f43675w2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f43667v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f43667v2.stories, iVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, iVar);
    }
}
