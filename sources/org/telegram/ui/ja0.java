package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ja0 implements h5.d {
    public final int f35306a;
    public final LaunchActivity f35307b;
    public final g00 f35308c;
    public final Long d;

    public ja0(LaunchActivity launchActivity, g00 g00Var, Long l10, int i10) {
        this.f35306a = i10;
        this.f35307b = launchActivity;
        this.f35308c = g00Var;
        this.d = l10;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.ui.Components.qc X;
        int i10;
        int i11;
        org.telegram.ui.Components.qc X2;
        int i12;
        int i13;
        int i14 = this.f35306a;
        Long l10 = this.d;
        g00 g00Var = this.f35308c;
        LaunchActivity launchActivity = this.f35307b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                try {
                    g00Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (storyItem == null) {
                    X = org.telegram.ui.Components.qc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X = org.telegram.ui.Components.qc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R != null) {
                    storyItem.dialogId = l10.longValue();
                    nh.i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                kh.a2.v(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f31612y1;
                try {
                    g00Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (storyItem == null) {
                    X2 = org.telegram.ui.Components.qc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    X2 = org.telegram.ui.Components.qc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    } else {
                        return;
                    }
                } else if (R2 != null) {
                    storyItem.dialogId = l10.longValue();
                    nh.i9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                kh.a2.v(i13, X2, i12, 36);
                return;
        }
    }
}
