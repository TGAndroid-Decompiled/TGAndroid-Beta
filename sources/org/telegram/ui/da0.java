package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

public final class da0 implements d5.d {

    public final LaunchActivity f37337a;

    public final a30 f37338b;

    public final Long f37339c;
    public final int d;

    public da0(LaunchActivity launchActivity, a30 a30Var, Long l10, int i10) {
        this.f37337a = launchActivity;
        this.f37338b = a30Var;
        this.f37339c = l10;
        this.d = i10;
    }

    @Override
    public final void accept(Object obj) {
        a30 a30Var = this.f37338b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.f35496x1;
        try {
            a30Var.run();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.mc mcVarX = org.telegram.ui.Components.mc.X();
            if (mcVarX != null) {
                org.telegram.messenger.y1.q(R.string.StoryAlbumNotFound, mcVarX, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.f37339c;
        long jLongValue = l10.longValue();
        LaunchActivity launchActivity = this.f37337a;
        if (jLongValue > 0) {
            bundle.putLong("user_id", l10.longValue());
            bundle.putBoolean("my_profile", l10.longValue() == UserConfig.getInstance(launchActivity.K).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}
