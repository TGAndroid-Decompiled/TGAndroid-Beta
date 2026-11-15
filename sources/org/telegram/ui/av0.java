package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class av0 extends ProfileStoriesView {
    public final Context f45519u0;
    public final ProfileActivity f45520v0;

    public av0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z10, k0 k0Var, xu0 xu0Var, org.telegram.ui.ActionBar.e6 e6Var, Context context2) {
        super(context, i7, j3, z10, k0Var, xu0Var, e6Var);
        this.f45520v0 = profileActivity;
        this.f45519u0 = context2;
    }

    @Override
    public final void e(cb.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f45520v0;
        long a10 = profileActivity.a();
        fi.s6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.f45519u0;
        if (!K && !P1.M(a10) && !P1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f43219w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f43094e1 != profileActivity.getUserConfig().f24953n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f43219w2.stories, cVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f43211v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f43211v2.stories, cVar);
                return;
            } else {
                profileActivity.Z3();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, cVar);
    }
}
