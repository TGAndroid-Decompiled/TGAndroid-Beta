package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class AboutPremiumView extends LinearLayout {
    public AboutPremiumView(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 14.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textViewM.setTextColor(Theme.getColor(null, i, false));
        textViewM.setTypeface(AndroidUtilities.bold());
        textViewM.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(textViewM);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(Theme.getColor(null, i, false));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.AboutPremiumDescription, textView);
        addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(null, i, false));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
