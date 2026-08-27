package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

public final class oy0 extends ProfileStoriesView {

    public final Context f41214p0;

    public final ProfileActivity f41215q0;

    public oy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, n0 n0Var, ly0 ly0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context2) {
        super(context, i10, j10, z10, n0Var, ly0Var, c6Var);
        this.f41215q0 = profileActivity;
        this.f41214p0 = context2;
    }

    @Override
    public final void e(a9.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f41215q0;
        long jA = profileActivity.a();
        jh.s6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean zI = storiesController.I(jA);
        Context context = this.f41214p0;
        if (zI || storiesController.K(jA) || storiesController.N(jA)) {
            profileActivity.getOrCreateStoryViewer().D(context, jA, iVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.f36043r2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f35923a1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36043r2.stories, iVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.f36036q2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.f36036q2.stories, iVar);
        }
    }
}
