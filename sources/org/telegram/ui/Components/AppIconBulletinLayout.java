package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LauncherIconController;

public final class AppIconBulletinLayout extends Bulletin.ButtonLayout {
    public AppIconBulletinLayout(LaunchActivity launchActivity, LauncherIconController.LauncherIcon launcherIcon) {
        super(launchActivity, null);
        AppIconsSelectorCell.AdaptiveIconImageView adaptiveIconImageView = new AppIconsSelectorCell.AdaptiveIconImageView(getContext());
        TextView textView = new TextView(getContext());
        addView(adaptiveIconImageView, LayoutHelper.createFrameRelatively(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(Theme.key_undo_infoColor));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        adaptiveIconImageView.setImageDrawable(launchActivity.getDrawable(launcherIcon.background));
        adaptiveIconImageView.setOuterPadding(AndroidUtilities.dp(8.0f));
        adaptiveIconImageView.setBackgroundOuterPadding(AndroidUtilities.dp(24.0f));
        adaptiveIconImageView.setForeground(launcherIcon.foreground);
        zzko.m(R.string.AppIconChangedTo, new Object[]{LocaleController.getString(launcherIcon.title)}, textView);
    }
}
