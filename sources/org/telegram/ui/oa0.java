package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class oa0 implements Utilities.Callback {
    public final int f36114a;
    public final LaunchActivity f36115b;
    public final n80 f36116c;
    public final Long d;

    public oa0(LaunchActivity launchActivity, n80 n80Var, Long l4, int i10) {
        this.f36114a = i10;
        this.f36115b = launchActivity;
        this.f36116c = n80Var;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.Components.xc X;
        int i10;
        int i11;
        org.telegram.ui.Components.xc X2;
        int i12;
        int i13;
        int i14 = this.f36114a;
        Long l4 = this.d;
        n80 n80Var = this.f36116c;
        LaunchActivity launchActivity = this.f36115b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l4.longValue();
                    ai.jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.f0.p(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.xc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.xc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l4.longValue();
                    ai.jc createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                org.telegram.messenger.f0.p(i13, X2, i12, 36);
                return;
        }
    }
}
