package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class cv0 extends ProfileStoriesView {
    public final Context f46684u0;
    public final ProfileActivity f46685v0;

    public cv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z10, k0 k0Var, zu0 zu0Var, org.telegram.ui.ActionBar.h6 h6Var, Context context2) {
        super(context, i7, j3, z10, k0Var, zu0Var, h6Var);
        this.f46685v0 = profileActivity;
        this.f46684u0 = context2;
    }

    @Override
    public final void e(d6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.f46685v0;
        long a10 = profileActivity.a();
        fi.p6 R1 = profileActivity.getMessagesController().R1();
        boolean K = R1.K(a10);
        Context context = this.f46684u0;
        if (!K && !R1.M(a10) && !R1.Q(a10)) {
            TLRPC.UserFull userFull = profileActivity.f43706w2;
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.f43581e1 != profileActivity.getUserConfig().f24817n) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f43706w2.stories, iVar);
                return;
            }
            TLRPC.ChatFull chatFull = profileActivity.f43698v2;
            if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.stories.isEmpty()) {
                profileActivity.getOrCreateStoryViewer().K(context, profileActivity.f43698v2.stories, iVar);
                return;
            } else {
                profileActivity.a4();
                return;
            }
        }
        profileActivity.getOrCreateStoryViewer().J(context, a10, iVar);
    }
}
