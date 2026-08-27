package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

public final class ca0 implements d5.d {

    public final int f37035a;

    public final LaunchActivity f37036b;

    public final a30 f37037c;
    public final Long d;

    public ca0(LaunchActivity launchActivity, a30 a30Var, Long l10, int i10) {
        this.f37035a = i10;
        this.f37036b = launchActivity;
        this.f37037c = a30Var;
        this.d = l10;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.ui.Components.mc mcVarX;
        int i10;
        int i11;
        org.telegram.ui.Components.mc mcVarX2;
        int i12;
        int i13;
        int i14 = this.f37035a;
        Long l10 = this.d;
        a30 a30Var = this.f37037c;
        LaunchActivity launchActivity = this.f37036b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (storyItem == null) {
                    mcVarX = org.telegram.ui.Components.mc.X();
                    if (mcVarX != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    mcVarX = org.telegram.ui.Components.mc.X();
                    if (mcVarX != null) {
                        i10 = R.raw.story_bomb1;
                        i11 = R.string.StoryNotFound;
                    }
                } else if (n2VarR != null) {
                    storyItem.dialogId = l10.longValue();
                    jh.i9 i9VarCreateOverlayStoryViewer = n2VarR.createOverlayStoryViewer();
                    i9VarCreateOverlayStoryViewer.v();
                    i9VarCreateOverlayStoryViewer.G(launchActivity, storyItem, null);
                }
                org.telegram.messenger.y1.q(i11, mcVarX, i10, 36);
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.n2 n2VarR2 = LaunchActivity.R();
                if (storyItem == null) {
                    mcVarX2 = org.telegram.ui.Components.mc.X();
                    if (mcVarX2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    mcVarX2 = org.telegram.ui.Components.mc.X();
                    if (mcVarX2 != null) {
                        i12 = R.raw.story_bomb1;
                        i13 = R.string.StoryNotFound;
                    }
                } else if (n2VarR2 != null) {
                    storyItem.dialogId = l10.longValue();
                    jh.i9 i9VarCreateOverlayStoryViewer2 = n2VarR2.createOverlayStoryViewer();
                    i9VarCreateOverlayStoryViewer2.v();
                    i9VarCreateOverlayStoryViewer2.G(launchActivity, storyItem, null);
                }
                org.telegram.messenger.y1.q(i13, mcVarX2, i12, 36);
                break;
        }
    }
}
