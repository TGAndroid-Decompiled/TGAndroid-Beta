package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ka0 implements h5.d {
    public final int f38238a;
    public final LaunchActivity f38239b;
    public final z10 f38240c;
    public final Long d;

    public ka0(LaunchActivity launchActivity, z10 z10Var, Long l10, int i10) {
        this.f38238a = i10;
        this.f38239b = launchActivity;
        this.f38240c = z10Var;
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
        int i14 = this.f38238a;
        Long l10 = this.d;
        z10 z10Var = this.f38240c;
        LaunchActivity launchActivity = this.f38239b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                try {
                    z10Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
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
                    oh.i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                    createOverlayStoryViewer.v();
                    createOverlayStoryViewer.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                l.d.v(i11, X, i10, 36);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f34134y1;
                try {
                    z10Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                    oh.i9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                    createOverlayStoryViewer2.v();
                    createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                    return;
                } else {
                    return;
                }
                l.d.v(i13, X2, i12, 36);
                return;
        }
    }
}
