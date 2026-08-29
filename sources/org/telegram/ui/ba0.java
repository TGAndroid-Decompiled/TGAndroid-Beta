package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ba0 implements f5.d {
    public final int f36753a;
    public final LaunchActivity f36754b;
    public final x60 f36755c;
    public final Long d;

    public ba0(LaunchActivity launchActivity, x60 x60Var, Long l10, int i10) {
        this.f36753a = i10;
        this.f36754b = launchActivity;
        this.f36755c = x60Var;
        this.d = l10;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.ui.Components.tc X;
        int i10;
        int i11;
        org.telegram.ui.Components.tc X2;
        int i12;
        int i13;
        int i14 = this.f36753a;
        Long l10 = this.d;
        x60 x60Var = this.f36755c;
        LaunchActivity launchActivity = this.f36754b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.tc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.tc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l10.longValue();
                    lh.i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                j7.l1.v(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.tc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.tc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l10.longValue();
                    lh.i9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                j7.l1.v(i13, X2, i12, 36);
                return;
        }
    }
}
