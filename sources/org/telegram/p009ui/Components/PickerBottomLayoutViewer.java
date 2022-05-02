package org.telegram.p009ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;

public class PickerBottomLayoutViewer extends FrameLayout {
    public TextView cancelButton;
    public TextView doneButton;
    public TextView doneButtonBadgeTextView;
    private boolean isDarkTheme;

    public PickerBottomLayoutViewer(Context context) {
        this(context, true);
    }

    public PickerBottomLayoutViewer(Context context, boolean z) {
        super(context);
        this.isDarkTheme = z;
        setBackgroundColor(z ? -15066598 : -1);
        TextView textView = new TextView(context);
        this.cancelButton = textView;
        textView.setTextSize(1, 14.0f);
        int i = -15095832;
        this.cancelButton.setTextColor(this.isDarkTheme ? -1 : -15095832);
        this.cancelButton.setGravity(17);
        int i2 = -12763843;
        this.cancelButton.setBackgroundDrawable(Theme.createSelectorDrawable(this.isDarkTheme ? -12763843 : 788529152, 0));
        this.cancelButton.setPadding(AndroidUtilities.m34dp(20.0f), 0, AndroidUtilities.m34dp(20.0f), 0);
        this.cancelButton.setText(LocaleController.getString("Cancel", C0952R.string.Cancel).toUpperCase());
        this.cancelButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.doneButton = textView2;
        textView2.setTextSize(1, 14.0f);
        this.doneButton.setTextColor(this.isDarkTheme ? -1 : i);
        this.doneButton.setGravity(17);
        this.doneButton.setBackgroundDrawable(Theme.createSelectorDrawable(!this.isDarkTheme ? 788529152 : i2, 0));
        this.doneButton.setPadding(AndroidUtilities.m34dp(20.0f), 0, AndroidUtilities.m34dp(20.0f), 0);
        this.doneButton.setText(LocaleController.getString("Send", C0952R.string.Send).toUpperCase());
        this.doneButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
        TextView textView3 = new TextView(context);
        this.doneButtonBadgeTextView = textView3;
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.doneButtonBadgeTextView.setTextSize(1, 13.0f);
        this.doneButtonBadgeTextView.setTextColor(-1);
        this.doneButtonBadgeTextView.setGravity(17);
        this.doneButtonBadgeTextView.setBackgroundResource(this.isDarkTheme ? C0952R.C0953drawable.photobadge : C0952R.C0953drawable.bluecounter);
        this.doneButtonBadgeTextView.setMinWidth(AndroidUtilities.m34dp(23.0f));
        this.doneButtonBadgeTextView.setPadding(AndroidUtilities.m34dp(8.0f), 0, AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(1.0f));
        addView(this.doneButtonBadgeTextView, LayoutHelper.createFrame(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
    }

    public void updateSelectedCount(int i, boolean z) {
        int i2 = -1;
        if (i == 0) {
            this.doneButtonBadgeTextView.setVisibility(8);
            if (z) {
                this.doneButton.setTextColor(-6710887);
                this.doneButton.setEnabled(false);
                return;
            }
            TextView textView = this.doneButton;
            if (!this.isDarkTheme) {
                i2 = -15095832;
            }
            textView.setTextColor(i2);
            return;
        }
        this.doneButtonBadgeTextView.setVisibility(0);
        this.doneButtonBadgeTextView.setText(String.format("%d", Integer.valueOf(i)));
        TextView textView2 = this.doneButton;
        if (!this.isDarkTheme) {
            i2 = -15095832;
        }
        textView2.setTextColor(i2);
        if (z) {
            this.doneButton.setEnabled(true);
        }
    }
}
