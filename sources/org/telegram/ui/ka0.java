package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
public final class ka0 implements h5.d {
    public final LaunchActivity f35605a;
    public final g00 f35606b;
    public final Long f35607c;
    public final int d;

    public ka0(LaunchActivity launchActivity, g00 g00Var, Long l10, int i10) {
        this.f35605a = launchActivity;
        this.f35606b = g00Var;
        this.f35607c = l10;
        this.d = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        g00 g00Var = this.f35606b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.f31612y1;
        try {
            g00Var.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.qc X = org.telegram.ui.Components.qc.X();
            if (X != null) {
                kh.a2.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.f35607c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.f35605a;
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
