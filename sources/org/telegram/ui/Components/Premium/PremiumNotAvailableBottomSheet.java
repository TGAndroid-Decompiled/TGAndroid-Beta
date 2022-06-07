package org.telegram.ui.Components.Premium;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class PremiumNotAvailableBottomSheet extends BottomSheet {
    public PremiumNotAvailableBottomSheet(BaseFragment baseFragment) {
        super(baseFragment.getParentActivity(), false);
        Activity parentActivity = baseFragment.getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        linearLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 16.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(Theme.getColor("dialogTextBlack"));
        linearLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView3.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 8.0f));
        textView3.setText(LocaleController.getString((int) R.string.InstallOfficialApp));
        textView3.setOnClickListener(PremiumNotAvailableBottomSheet$$ExternalSyntheticLambda0.INSTANCE);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout.setBackgroundColor(getThemedColor("dialogBackground"));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 68, 80));
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString((int) R.string.SubscribeToPremiumOfficialAppNeeded)));
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString((int) R.string.SubscribeToPremiumOfficialAppNeededDescription)));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public static void lambda$new$0(View view) {
        try {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
        } catch (ActivityNotFoundException e) {
            FileLog.e(e);
        }
    }
}
