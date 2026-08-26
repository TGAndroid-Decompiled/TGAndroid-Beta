package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ThemeSmallPreviewView;

public final class ChannelColorActivity$ThemeChooser$$ExternalSyntheticLambda0 implements Consumer {
    public final int $r8$classId;
    public final ChannelColorActivity.ThemeChooser f$0;

    public ChannelColorActivity$ThemeChooser$$ExternalSyntheticLambda0(ChannelColorActivity.ThemeChooser themeChooser, int i) {
        this.$r8$classId = i;
        this.f$0 = themeChooser;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                ChannelColorActivity.ThemeChooser themeChooser = this.f$0;
                themeChooser.getClass();
                ((ThemeSmallPreviewView) view).setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, themeChooser.resourcesProvider));
                break;
            default:
                ChannelColorActivity.ThemeChooser themeChooser2 = this.f$0;
                if (view instanceof ThemeSmallPreviewView) {
                    ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) view;
                    themeSmallPreviewView.setFallbackWallpaper(themeSmallPreviewView.chatThemeItem.chatTheme.showAsRemovedStub ? null : themeChooser2.fallbackWallpaper);
                }
                break;
        }
    }
}
