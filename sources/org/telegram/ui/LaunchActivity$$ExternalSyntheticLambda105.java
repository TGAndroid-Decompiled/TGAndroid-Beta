package org.telegram.ui;

import android.os.Bundle;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.BulletinFactory;

public final class LaunchActivity$$ExternalSyntheticLambda105 implements Consumer {
    public final LaunchActivity f$0;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$1;
    public final Long f$2;
    public final int f$3;

    public LaunchActivity$$ExternalSyntheticLambda105(LaunchActivity launchActivity, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, Long l, int i) {
        this.f$0 = launchActivity;
        this.f$1 = launchActivity$$ExternalSyntheticLambda13;
        this.f$2 = l;
        this.f$3 = i;
    }

    @Override
    public final void accept(Object obj) {
        LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$1;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        LaunchActivity launchActivity = this.f$0;
        launchActivity.getClass();
        try {
            launchActivity$$ExternalSyntheticLambda13.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity.getLastFragment();
        if (tL_storyAlbum == null) {
            BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
            if (bulletinFactoryGlobal != null) {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryAlbumNotFound, bulletinFactoryGlobal, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l = this.f$2;
        if (l.longValue() > 0) {
            bundle.putLong("user_id", l.longValue());
            bundle.putBoolean("my_profile", l.longValue() == UserConfig.getInstance(launchActivity.currentAccount).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        bundle.putInt("open_story_album_id", this.f$3);
        launchActivity.presentFragment(new ProfileActivity(bundle, null));
    }
}
