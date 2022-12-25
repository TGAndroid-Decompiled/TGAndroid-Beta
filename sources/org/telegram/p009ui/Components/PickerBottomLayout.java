package org.telegram.p009ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;

public class PickerBottomLayout extends FrameLayout {
    public TextView cancelButton;
    public LinearLayout doneButton;
    public TextView doneButtonBadgeTextView;
    public TextView doneButtonTextView;
    private Theme.ResourcesProvider resourcesProvider;

    public PickerBottomLayout(Context context, boolean z) {
        this(context, z, null);
    }

    public PickerBottomLayout(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(Theme.getColor(z ? "dialogBackground" : "windowBackgroundWhite", resourcesProvider));
        TextView textView = new TextView(context);
        this.cancelButton = textView;
        textView.setTextSize(1, 14.0f);
        this.cancelButton.setTextColor(Theme.getColor("picker_enabledButton", resourcesProvider));
        this.cancelButton.setGravity(17);
        this.cancelButton.setBackground(Theme.createSelectorDrawable(Theme.getColor("picker_enabledButton", resourcesProvider) & 268435455, 0));
        this.cancelButton.setPadding(AndroidUtilities.m35dp(33.0f), 0, AndroidUtilities.m35dp(33.0f), 0);
        this.cancelButton.setText(LocaleController.getString("Cancel", C1010R.string.Cancel).toUpperCase());
        this.cancelButton.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.doneButton = linearLayout;
        linearLayout.setOrientation(0);
        this.doneButton.setBackground(Theme.createSelectorDrawable(268435455 & Theme.getColor("picker_enabledButton", resourcesProvider), 0));
        this.doneButton.setPadding(AndroidUtilities.m35dp(33.0f), 0, AndroidUtilities.m35dp(33.0f), 0);
        addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
        TextView textView2 = new TextView(context);
        this.doneButtonBadgeTextView = textView2;
        textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.doneButtonBadgeTextView.setTextSize(1, 13.0f);
        this.doneButtonBadgeTextView.setTextColor(Theme.getColor("picker_badgeText", resourcesProvider));
        this.doneButtonBadgeTextView.setGravity(17);
        this.doneButtonBadgeTextView.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(11.0f), Theme.getColor("picker_badge", resourcesProvider)));
        this.doneButtonBadgeTextView.setMinWidth(AndroidUtilities.m35dp(23.0f));
        this.doneButtonBadgeTextView.setPadding(AndroidUtilities.m35dp(8.0f), 0, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(1.0f));
        this.doneButton.addView(this.doneButtonBadgeTextView, LayoutHelper.createLinear(-2, 23, 16, 0, 0, 10, 0));
        TextView textView3 = new TextView(context);
        this.doneButtonTextView = textView3;
        textView3.setTextSize(1, 14.0f);
        this.doneButtonTextView.setTextColor(Theme.getColor("picker_enabledButton", resourcesProvider));
        this.doneButtonTextView.setGravity(17);
        this.doneButtonTextView.setCompoundDrawablePadding(AndroidUtilities.m35dp(8.0f));
        this.doneButtonTextView.setText(LocaleController.getString("Send", C1010R.string.Send).toUpperCase());
        this.doneButtonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.doneButton.addView(this.doneButtonTextView, LayoutHelper.createLinear(-2, -2, 16));
    }
}
