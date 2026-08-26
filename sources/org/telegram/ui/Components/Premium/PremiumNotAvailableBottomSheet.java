package org.telegram.ui.Components.Premium;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.LayoutHelper;

public final class PremiumNotAvailableBottomSheet extends BottomSheet {
    public PremiumNotAvailableBottomSheet(BaseFragment baseFragment) {
        super(baseFragment.getParentActivity(), null, false, false);
        Activity parentActivity = baseFragment.getParentActivity();
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i = Theme.key_dialogTextBlack;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, Theme.getColor(null, i, false), 1, textView);
        linearLayoutM.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(Theme.getColor(null, i, false));
        linearLayoutM.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(14.0f, Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), 1, textView3);
        textView3.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
        textView3.setText(LocaleController.getString(R.string.InstallOfficialApp));
        textView3.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(8));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 68, 80));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.SubscribeToPremiumOfficialAppNeeded, textView);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayoutM);
        setCustomView(scrollView);
    }
}
