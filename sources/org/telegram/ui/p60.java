package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class p60 implements org.telegram.messenger.u10 {
    public final int f48476a;
    public final LaunchActivity f48477b;
    public final ly f48478c;
    public final Long d;

    public p60(LaunchActivity launchActivity, ly lyVar, Long l10, int i3) {
        this.f48476a = i3;
        this.f48477b = launchActivity;
        this.f48478c = lyVar;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f48476a;
        Long l10 = this.d;
        ly lyVar = this.f48478c;
        LaunchActivity launchActivity = this.f48477b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.fc X = org.telegram.ui.Components.fc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744616, X, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.fc X2 = org.telegram.ui.Components.fc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.o(null, 2131744616, X2, 2131624235, 36);
                        return;
                    }
                    return;
                } else if (Q != null) {
                    storyItem.dialogId = l10.longValue();
                    ei.r9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                    createOverlayStoryViewer.J();
                    createOverlayStoryViewer.T(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
            default:
                String str2 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (storyItem == null) {
                    org.telegram.ui.Components.fc X3 = org.telegram.ui.Components.fc.X();
                    if (X3 != null) {
                        org.telegram.messenger.k5.o(null, 2131744616, X3, 2131624236, 36);
                        return;
                    }
                    return;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.ui.Components.fc X4 = org.telegram.ui.Components.fc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.o(null, 2131744616, X4, 2131624235, 36);
                        return;
                    }
                    return;
                } else if (Q2 != null) {
                    storyItem.dialogId = l10.longValue();
                    ei.r9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.J();
                    createOverlayStoryViewer2.T(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
