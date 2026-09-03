package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class la0 implements h5.d {
    public final LaunchActivity f38597a;
    public final z10 f38598b;
    public final Long f38599c;
    public final int d;

    public la0(LaunchActivity launchActivity, z10 z10Var, Long l10, int i10) {
        this.f38597a = launchActivity;
        this.f38598b = z10Var;
        this.f38599c = l10;
        this.d = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        z10 z10Var = this.f38598b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.f34134y1;
        try {
            z10Var.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.qc X = org.telegram.ui.Components.qc.X();
            if (X != null) {
                l.d.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.f38599c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.f38597a;
        if (longValue > 0) {
            bundle.putLong("user_id", l10.longValue());
            if (l10.longValue() == UserConfig.getInstance(launchActivity.L).getClientUserId()) {
                z4 = true;
            } else {
                z4 = false;
            }
            bundle.putBoolean("my_profile", z4);
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}
