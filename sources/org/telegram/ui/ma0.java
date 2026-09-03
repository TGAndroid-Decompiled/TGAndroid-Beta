package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class ma0 implements h5.d {
    public final LaunchActivity f36011a;
    public final w10 f36012b;
    public final Long f36013c;
    public final int d;

    public ma0(LaunchActivity launchActivity, w10 w10Var, Long l10, int i10) {
        this.f36011a = launchActivity;
        this.f36012b = w10Var;
        this.f36013c = l10;
        this.d = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        w10 w10Var = this.f36012b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.f31586y1;
        try {
            w10Var.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.qc X = org.telegram.ui.Components.qc.X();
            if (X != null) {
                kf.k0.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.f36013c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.f36011a;
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
