package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;

public class PickerBottomLayout extends FrameLayout {
    public TextView cancelButton;
    public LinearLayout doneButton;
    public TextView doneButtonBadgeTextView;
    public TextView doneButtonTextView;
    private Theme.ResourcesProvider resourcesProvider;

    public PickerBottomLayout(Context context) {
        this(context, true, null);
    }

    public void updateSelectedCount(int i, boolean z) {
        if (i != 0) {
            this.doneButtonBadgeTextView.setVisibility(0);
            this.doneButtonBadgeTextView.setText(String.format("%d", Integer.valueOf(i)));
            TextView textView = this.doneButtonTextView;
            int i2 = Theme.key_picker_enabledButton;
            textView.setTag(Integer.valueOf(i2));
            this.doneButtonTextView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
            if (z) {
                this.doneButton.setEnabled(true);
                return;
            }
            return;
        }
        this.doneButtonBadgeTextView.setVisibility(8);
        if (!z) {
            TextView textView2 = this.doneButtonTextView;
            int i3 = Theme.key_picker_enabledButton;
            textView2.setTag(Integer.valueOf(i3));
            this.doneButtonTextView.setTextColor(Theme.getColor(i3, this.resourcesProvider));
            return;
        }
        TextView textView3 = this.doneButtonTextView;
        int i4 = Theme.key_picker_disabledButton;
        textView3.setTag(Integer.valueOf(i4));
        this.doneButtonTextView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        this.doneButton.setEnabled(false);
    }

    public PickerBottomLayout(Context context, boolean z) {
        this(context, z, null);
    }

    public PickerBottomLayout(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(Theme.getColor(z ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite, resourcesProvider));
        TextView textView = new TextView(context);
        this.cancelButton = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.cancelButton;
        int i = Theme.key_picker_enabledButton;
        textView2.setTextColor(Theme.getColor(i, resourcesProvider));
        this.cancelButton.setGravity(17);
        this.cancelButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, resourcesProvider) & 268435455, 0, -1));
        this.cancelButton.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Cancel, this.cancelButton);
        this.cancelButton.setTypeface(AndroidUtilities.bold());
        addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.doneButton = linearLayout;
        linearLayout.setOrientation(0);
        this.doneButton.setBackground(Theme.createSelectorDrawable(268435455 & Theme.getColor(i, resourcesProvider), 0, -1));
        this.doneButton.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
        TextView textView3 = new TextView(context);
        this.doneButtonBadgeTextView = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        this.doneButtonBadgeTextView.setTextSize(1, 13.0f);
        this.doneButtonBadgeTextView.setTextColor(Theme.getColor(Theme.key_picker_badgeText, resourcesProvider));
        this.doneButtonBadgeTextView.setGravity(17);
        this.doneButtonBadgeTextView.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(11.0f), Theme.getColor(Theme.key_picker_badge, resourcesProvider)));
        this.doneButtonBadgeTextView.setMinWidth(AndroidUtilities.dp(23.0f));
        this.doneButtonBadgeTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView textViewM = zzkc.m(this.doneButton, this.doneButtonBadgeTextView, LayoutHelper.createLinear(-2, 23, 16, 0, 0, 10, 0), context);
        this.doneButtonTextView = textViewM;
        textViewM.setTextSize(1, 14.0f);
        this.doneButtonTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        this.doneButtonTextView.setGravity(17);
        this.doneButtonTextView.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Send, this.doneButtonTextView);
        this.doneButtonTextView.setTypeface(AndroidUtilities.bold());
        this.doneButton.addView(this.doneButtonTextView, LayoutHelper.createLinear(-2, -2, 16));
    }
}
