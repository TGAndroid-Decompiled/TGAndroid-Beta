package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class ca0 implements f5.d {
    public final LaunchActivity f37060a;
    public final x60 f37061b;
    public final Long f37062c;
    public final int d;

    public ca0(LaunchActivity launchActivity, x60 x60Var, Long l10, int i10) {
        this.f37060a = launchActivity;
        this.f37061b = x60Var;
        this.f37062c = l10;
        this.d = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        x60 x60Var = this.f37061b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.f35560x1;
        try {
            x60Var.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.tc X = org.telegram.ui.Components.tc.X();
            if (X != null) {
                j7.l1.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.f37062c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.f37060a;
        if (longValue > 0) {
            bundle.putLong("user_id", l10.longValue());
            if (l10.longValue() == UserConfig.getInstance(launchActivity.K).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("my_profile", z10);
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}
