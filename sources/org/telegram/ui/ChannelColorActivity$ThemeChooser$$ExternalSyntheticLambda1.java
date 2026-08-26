package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;

public final class ChannelColorActivity$ThemeChooser$$ExternalSyntheticLambda1 implements Consumer {
    public final int $r8$classId;
    public final ChannelColorActivity.ThemeChooser f$0;

    public ChannelColorActivity$ThemeChooser$$ExternalSyntheticLambda1(ChannelColorActivity.ThemeChooser themeChooser, int i) {
        this.$r8$classId = i;
        this.f$0 = themeChooser;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateColors$2((View) obj);
                break;
            default:
                this.f$0.lambda$setGalleryWallpaper$0((View) obj);
                break;
        }
    }
}
